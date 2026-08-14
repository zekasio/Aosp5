package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayDeque<a> f398a = new ArrayDeque<>();
    private static final Object b = new Object();
    private final MediaCodec c;
    private final HandlerThread d;
    private Handler e;
    private final AtomicReference<RuntimeException> f;
    private final com.applovin.exoplayer2.l.g g;
    private final boolean h;
    private boolean i;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new com.applovin.exoplayer2.l.g());
    }

    b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, com.applovin.exoplayer2.l.g gVar) {
        this.c = mediaCodec;
        this.d = handlerThread;
        this.g = gVar;
        this.f = new AtomicReference<>();
        this.h = z || i();
    }

    public void a() {
        if (this.i) {
            return;
        }
        this.d.start();
        this.e = new Handler(this.d.getLooper()) { // from class: com.applovin.exoplayer2.f.b.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b.this.a(message);
            }
        };
        this.i = true;
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        e();
        a aVarH = h();
        aVarH.a(i, i2, i3, j, i4);
        ((Handler) ai.a(this.e)).obtainMessage(0, aVarH).sendToTarget();
    }

    public void a(int i, int i2, com.applovin.exoplayer2.c.c cVar, long j, int i3) {
        e();
        a aVarH = h();
        aVarH.a(i, i2, 0, j, i3);
        a(cVar, aVarH.d);
        ((Handler) ai.a(this.e)).obtainMessage(1, aVarH).sendToTarget();
    }

    public void b() {
        if (this.i) {
            try {
                f();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void c() {
        if (this.i) {
            b();
            this.d.quit();
        }
        this.i = false;
    }

    public void d() throws InterruptedException {
        g();
    }

    private void e() {
        RuntimeException andSet = this.f.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void f() throws InterruptedException {
        ((Handler) ai.a(this.e)).removeCallbacksAndMessages(null);
        g();
        e();
    }

    private void g() throws InterruptedException {
        this.g.b();
        ((Handler) ai.a(this.e)).obtainMessage(2).sendToTarget();
        this.g.c();
    }

    void a(RuntimeException runtimeException) {
        this.f.set(runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        a aVar;
        int i = message.what;
        if (i == 0) {
            aVar = (a) message.obj;
            b(aVar.f400a, aVar.b, aVar.c, aVar.e, aVar.f);
        } else if (i != 1) {
            if (i == 2) {
                this.g.a();
            } else {
                a(new IllegalStateException(String.valueOf(message.what)));
            }
            aVar = null;
        } else {
            aVar = (a) message.obj;
            a(aVar.f400a, aVar.b, aVar.d, aVar.e, aVar.f);
        }
        if (aVar != null) {
            a(aVar);
        }
    }

    private void b(int i, int i2, int i3, long j, int i4) {
        try {
            this.c.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    private void a(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.h) {
                synchronized (b) {
                    this.c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
                return;
            }
            this.c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    private static a h() {
        ArrayDeque<a> arrayDeque = f398a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new a();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void a(a aVar) {
        ArrayDeque<a> arrayDeque = f398a;
        synchronized (arrayDeque) {
            arrayDeque.add(aVar);
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f400a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        a() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.f400a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    private static boolean i() {
        String lowerCase = Ascii.toLowerCase(ai.c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    private static void a(com.applovin.exoplayer2.c.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f;
        cryptoInfo.numBytesOfClearData = a(cVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(cVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f97a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.c;
        if (ai.f611a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.g, cVar.h));
        }
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
