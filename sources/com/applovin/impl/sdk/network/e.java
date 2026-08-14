package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue<b> f1375a = new PriorityBlockingQueue<>();
    private final p b;

    e(p pVar) {
        this.b = pVar;
    }

    void a() {
        for (int i = 0; i < ((Integer) this.b.a(com.applovin.impl.sdk.c.b.av)).intValue(); i++) {
            new a(this.f1375a, i, this.b).start();
        }
    }

    void a(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f1375a.add(bVar);
    }

    static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue<b> f1376a;
        private final p b;

        private a(BlockingQueue<b> blockingQueue, int i, p pVar) {
            super("AL-Network-" + i);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (pVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f1376a = blockingQueue;
            this.b = pVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private void a() throws InterruptedException {
            a(this.f1376a.take());
        }

        private void a(final b bVar) {
            HttpURLConnection httpURLConnectionB;
            InputStream inputStream;
            InputStream errorStream;
            String strA;
            InputStream inputStream2;
            String strA2;
            int responseCode = 0;
            String str = null;
            try {
                httpURLConnectionB = b(bVar);
                try {
                    if (bVar.e != null && bVar.e.length > 0) {
                        httpURLConnectionB.setDoOutput(true);
                        httpURLConnectionB.setFixedLengthStreamingMode(bVar.e.length);
                        OutputStream outputStream = httpURLConnectionB.getOutputStream();
                        outputStream.write(bVar.e);
                        outputStream.close();
                    }
                    responseCode = httpURLConnectionB.getResponseCode();
                    if (responseCode > 0) {
                        inputStream2 = httpURLConnectionB.getInputStream();
                        try {
                            strA2 = com.applovin.impl.sdk.utils.i.a(inputStream2, this.b);
                        } catch (Throwable th) {
                            inputStream = inputStream2;
                            th = th;
                            try {
                                this.b.L();
                                if (y.a()) {
                                    this.b.L().a("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnectionB != null) {
                                    try {
                                        errorStream = httpURLConnectionB.getErrorStream();
                                    } catch (Throwable unused) {
                                        errorStream = null;
                                    }
                                    try {
                                        strA = com.applovin.impl.sdk.utils.i.a(errorStream, this.b);
                                    } catch (Throwable unused2) {
                                        strA = null;
                                        Utils.close(inputStream, this.b);
                                        Utils.close(errorStream, this.b);
                                        Utils.disconnect(httpURLConnectionB, this.b);
                                        final c cVarA = c.d().a(responseCode).a(str).b(strA).a(th).a();
                                        bVar.h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                bVar.g.accept(cVarA);
                                            }
                                        });
                                    }
                                } else {
                                    errorStream = null;
                                    strA = null;
                                }
                                Utils.close(inputStream, this.b);
                                Utils.close(errorStream, this.b);
                                Utils.disconnect(httpURLConnectionB, this.b);
                            } catch (Throwable th2) {
                                Utils.close(inputStream, this.b);
                                Utils.close(null, this.b);
                                Utils.disconnect(httpURLConnectionB, this.b);
                                throw th2;
                            }
                        }
                    } else {
                        inputStream2 = null;
                        strA2 = null;
                    }
                    Utils.close(inputStream2, this.b);
                    Utils.close(null, this.b);
                    Utils.disconnect(httpURLConnectionB, this.b);
                    th = null;
                    strA = null;
                    str = strA2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionB = null;
                inputStream = null;
            }
            final c cVarA2 = c.d().a(responseCode).a(str).b(strA).a(th).a();
            bVar.h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.g.accept(cVarA2);
                }
            });
        }

        private HttpURLConnection b(b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.b).openConnection();
            httpURLConnection.setRequestMethod(bVar.c);
            httpURLConnection.setConnectTimeout(bVar.f);
            httpURLConnection.setReadTimeout(bVar.f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.d.isEmpty()) {
                for (Map.Entry entry : bVar.d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f1378a = new AtomicInteger();
        private final String b;
        private final String c;
        private final Map<String, String> d;
        private final byte[] e;
        private final int f;
        private final Consumer<c> g;
        private final Executor h;
        private final int i;

        private b(a aVar) {
            this.b = aVar.f1379a;
            this.c = aVar.b;
            this.d = aVar.c != null ? aVar.c : Collections.emptyMap();
            this.e = aVar.d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
            this.i = f1378a.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.i - bVar.i;
        }

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f1379a;
            private String b;
            private Map<String, String> c = CollectionUtils.map();
            private byte[] d;
            private int e;
            private Consumer<c> f;
            private Executor g;

            a() {
            }

            a a(String str) {
                this.f1379a = str;
                return this;
            }

            a b(String str) {
                this.b = str;
                return this;
            }

            a a(Map<String, String> map) {
                if (map == null) {
                    map = CollectionUtils.map();
                }
                this.c = map;
                return this;
            }

            a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            a a(int i) {
                this.e = i;
                return this;
            }

            a a(Consumer<c> consumer) {
                this.f = consumer;
                return this;
            }

            a a(Executor executor) {
                this.g = executor;
                return this;
            }

            b a() {
                return new b(this);
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1380a;
        private final String b;
        private final String c;
        private final Throwable d;

        private c(a aVar) {
            this.f1380a = aVar.f1381a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }

        int a() throws Throwable {
            Throwable th = this.d;
            if (th != null) {
                throw th;
            }
            return this.f1380a;
        }

        String b() throws Throwable {
            Throwable th = this.d;
            if (th != null) {
                throw th;
            }
            return this.b;
        }

        String c() {
            return this.c;
        }

        static a d() {
            return new a();
        }

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f1381a;
            private String b;
            private String c;
            private Throwable d;

            a() {
            }

            a a(int i) {
                this.f1381a = i;
                return this;
            }

            a a(String str) {
                this.b = str;
                return this;
            }

            a b(String str) {
                this.c = str;
                return this;
            }

            a a(Throwable th) {
                this.d = th;
                return this;
            }

            c a() {
                return new c(this);
            }
        }
    }
}
