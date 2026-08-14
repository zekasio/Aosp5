package com.applovin.impl.adview;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f820a;
    private final Handler b;
    private final Set<b> c = new HashSet();
    private final AtomicInteger d = new AtomicInteger();

    public interface a {
        void a();

        boolean b();
    }

    public j(Handler handler, com.applovin.impl.sdk.p pVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.b = handler;
        this.f820a = pVar.L();
    }

    public void a() {
        HashSet<b> hashSet = new HashSet(this.c);
        if (com.applovin.impl.sdk.y.a()) {
            this.f820a.b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.d.incrementAndGet();
        for (b bVar : hashSet) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f820a.b("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + iIncrementAndGet + "...");
            }
            a(bVar, iIncrementAndGet);
        }
    }

    public void b() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f820a.b("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.c.clear();
    }

    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f820a.b("CountdownManager", "Stopping countdowns...");
        }
        this.d.incrementAndGet();
        this.b.removeCallbacksAndMessages(null);
    }

    public void a(String str, long j, a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f820a.b("CountdownManager", "Adding countdown: " + str);
        }
        this.c.add(new b(str, j, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i) {
        this.b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                a aVarC = bVar.c();
                if (aVarC.b()) {
                    if (j.this.d.get() != i) {
                        com.applovin.impl.sdk.y unused = j.this.f820a;
                        if (com.applovin.impl.sdk.y.a()) {
                            j.this.f820a.d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                            return;
                        }
                        return;
                    }
                    try {
                        aVarC.a();
                        j.this.a(bVar, i);
                        return;
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y unused2 = j.this.f820a;
                        if (com.applovin.impl.sdk.y.a()) {
                            j.this.f820a.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                        }
                        j.this.b();
                        return;
                    }
                }
                com.applovin.impl.sdk.y unused3 = j.this.f820a;
                if (com.applovin.impl.sdk.y.a()) {
                    j.this.f820a.b("CountdownManager", "Ending countdown for " + bVar.a());
                }
            }
        }, bVar.b());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f822a;
        private final a b;
        private final long c;

        private b(String str, long j, a aVar) {
            this.f822a = str;
            this.c = j;
            this.b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f822a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            String str = this.f822a;
            String str2 = ((b) obj).f822a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f822a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f822a + "', countdownStepMillis=" + this.c + '}';
        }
    }
}
