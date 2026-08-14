package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class h8 extends ImageView implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d8 f1812a;
    public Bitmap b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Thread g;
    public long h;
    public final Runnable i;
    public final Runnable j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = h8.this.b;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            h8 h8Var = h8.this;
            h8Var.setImageBitmap(h8Var.b);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h8 h8Var = h8.this;
            h8Var.b = null;
            h8Var.f1812a = null;
            h8Var.g = null;
            h8Var.f = false;
        }
    }

    public interface c {
    }

    public interface d {
    }

    public h8(Context context) {
        super(context);
        this.c = new Handler(Looper.getMainLooper());
        this.h = -1L;
        this.i = new a();
        this.j = new b();
    }

    public void b() {
        this.d = true;
        c();
    }

    public final void c() {
        if ((this.d || this.e) && this.f1812a != null && this.g == null) {
            Thread thread = new Thread(this);
            this.g = thread;
            thread.start();
        }
    }

    public void d() {
        this.d = false;
        Thread thread = this.g;
        if (thread != null) {
            thread.interrupt();
            this.g = null;
        }
    }

    public long getFramesDisplayDuration() {
        return this.h;
    }

    public int getGifHeight() {
        return this.f1812a.p.g;
    }

    public int getGifWidth() {
        return this.f1812a.p.f;
    }

    public c getOnAnimationStop() {
        return null;
    }

    public d getOnFrameAvailable() {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
        L0:
            boolean r0 = r10.d
            if (r0 != 0) goto La
            boolean r0 = r10.e
            if (r0 != 0) goto La
            goto L9c
        La:
            com.tapjoy.internal.d8 r0 = r10.f1812a
            com.tapjoy.internal.f8 r1 = r0.p
            int r1 = r1.c
            r2 = -1
            r3 = 0
            if (r1 > 0) goto L15
            goto L2e
        L15:
            int r1 = r0.n
            int r4 = r0.a()
            r5 = 1
            int r4 = r4 - r5
            if (r1 != r4) goto L24
            int r1 = r0.o
            int r1 = r1 + r5
            r0.o = r1
        L24:
            com.tapjoy.internal.f8 r1 = r0.p
            int r1 = r1.m
            if (r1 == r2) goto L30
            int r4 = r0.o
            if (r4 <= r1) goto L30
        L2e:
            r5 = 0
            goto L3a
        L30:
            int r1 = r0.n
            int r1 = r1 + r5
            com.tapjoy.internal.f8 r4 = r0.p
            int r4 = r4.c
            int r1 = r1 % r4
            r0.n = r1
        L3a:
            r0 = 0
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5b
            com.tapjoy.internal.d8 r4 = r10.f1812a     // Catch: java.lang.Throwable -> L5b
            android.graphics.Bitmap r4 = r4.c()     // Catch: java.lang.Throwable -> L5b
            r10.b = r4     // Catch: java.lang.Throwable -> L5b
            long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5b
            long r8 = r8 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r6
            android.os.Handler r4 = r10.c     // Catch: java.lang.Throwable -> L59
            java.lang.Runnable r6 = r10.i     // Catch: java.lang.Throwable -> L59
            r4.post(r6)     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            goto L5d
        L5b:
            r8 = r0
        L5d:
            r10.e = r3
            boolean r4 = r10.d
            if (r4 == 0) goto L9a
            if (r5 != 0) goto L66
            goto L9a
        L66:
            com.tapjoy.internal.d8 r4 = r10.f1812a     // Catch: java.lang.InterruptedException -> L94
            com.tapjoy.internal.f8 r5 = r4.p     // Catch: java.lang.InterruptedException -> L94
            int r6 = r5.c     // Catch: java.lang.InterruptedException -> L94
            if (r6 <= 0) goto L82
            int r4 = r4.n     // Catch: java.lang.InterruptedException -> L94
            if (r4 >= 0) goto L73
            goto L82
        L73:
            if (r4 < 0) goto L83
            if (r4 >= r6) goto L83
            java.util.List<com.tapjoy.internal.e8> r2 = r5.e     // Catch: java.lang.InterruptedException -> L94
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.InterruptedException -> L94
            com.tapjoy.internal.e8 r2 = (com.tapjoy.internal.e8) r2     // Catch: java.lang.InterruptedException -> L94
            int r2 = r2.i     // Catch: java.lang.InterruptedException -> L94
            goto L83
        L82:
            r2 = 0
        L83:
            long r2 = (long) r2     // Catch: java.lang.InterruptedException -> L94
            long r2 = r2 - r8
            int r3 = (int) r2     // Catch: java.lang.InterruptedException -> L94
            if (r3 <= 0) goto L95
            long r4 = r10.h     // Catch: java.lang.InterruptedException -> L94
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8f
            goto L90
        L8f:
            long r4 = (long) r3     // Catch: java.lang.InterruptedException -> L94
        L90:
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L94
            goto L95
        L94:
        L95:
            boolean r0 = r10.d
            if (r0 != 0) goto L0
            goto L9c
        L9a:
            r10.d = r3
        L9c:
            boolean r0 = r10.f
            if (r0 == 0) goto La7
            android.os.Handler r0 = r10.c
            java.lang.Runnable r1 = r10.j
            r0.post(r1)
        La7:
            r0 = 0
            r10.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.h8.run():void");
    }

    public void setBytes(byte[] bArr) {
        d8 d8Var = new d8(new i8());
        this.f1812a = d8Var;
        try {
            d8Var.a(bArr);
            if (this.d) {
                c();
            } else {
                a(0);
            }
        } catch (Exception unused) {
            this.f1812a = null;
        }
    }

    public void setFramesDisplayDuration(long j) {
        this.h = j;
    }

    public void setOnAnimationStop(c cVar) {
    }

    public void setOnFrameAvailable(d dVar) {
    }

    public void a(f8 f8Var, byte[] bArr) {
        try {
            i8 i8Var = new i8();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            d8 d8Var = new d8(i8Var);
            d8Var.a(f8Var, byteBufferWrap, 1);
            this.f1812a = d8Var;
            if (this.d) {
                c();
            } else {
                a(0);
            }
        } catch (Exception unused) {
            this.f1812a = null;
        }
    }

    public void a(int i) {
        d8 d8Var = this.f1812a;
        if (d8Var.n == i || !d8Var.a(i - 1) || this.d) {
            return;
        }
        this.e = true;
        c();
    }

    public void a() {
        this.d = false;
        this.e = false;
        this.f = true;
        d();
        this.c.post(this.j);
    }
}
