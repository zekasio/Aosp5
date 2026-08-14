package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class c extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f401a = new Object();
    private final f d = new f();
    private final f e = new f();
    private final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    c(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public void a(MediaCodec mediaCodec) {
        com.applovin.exoplayer2.l.a.b(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public void a() {
        synchronized (this.f401a) {
            this.l = true;
            this.b.quit();
            d();
        }
    }

    public int b() {
        synchronized (this.f401a) {
            int iA = -1;
            if (e()) {
                return -1;
            }
            f();
            if (!this.d.b()) {
                iA = this.d.a();
            }
            return iA;
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f401a) {
            if (e()) {
                return -1;
            }
            f();
            if (this.e.b()) {
                return -1;
            }
            int iA = this.e.a();
            if (iA >= 0) {
                com.applovin.exoplayer2.l.a.a(this.h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iA == -2) {
                this.h = this.g.remove();
            }
            return iA;
        }
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f401a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void a(final Runnable runnable) {
        synchronized (this.f401a) {
            this.k++;
            ((Handler) ai.a(this.c)).post(new Runnable() { // from class: com.applovin.exoplayer2.f.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(runnable);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f401a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f401a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f401a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f401a) {
            a(mediaFormat);
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(Runnable runnable) {
        synchronized (this.f401a) {
            c(runnable);
        }
    }

    private void c(Runnable runnable) {
        if (this.l) {
            return;
        }
        long j = this.k - 1;
        this.k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            a(new IllegalStateException());
            return;
        }
        d();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            a(e);
        } catch (Exception e2) {
            a(new IllegalStateException(e2));
        }
    }

    private void d() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    private boolean e() {
        return this.k > 0 || this.l;
    }

    private void a(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    private void h() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f401a) {
            this.m = illegalStateException;
        }
    }
}
