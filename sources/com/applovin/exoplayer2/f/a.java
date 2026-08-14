package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f397a;
    private final c b;
    private final b c;
    private final boolean d;
    private boolean e;
    private int f;
    private Surface g;

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.f.a$a, reason: collision with other inner class name */
    public static final class C0029a implements g.b {
        private final Supplier<HandlerThread> b;
        private final Supplier<HandlerThread> c;
        private final boolean d;
        private final boolean e;

        public C0029a(final int i, boolean z, boolean z2) {
            this(new Supplier() { // from class: com.applovin.exoplayer2.f.a$a$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return a.C0029a.b(i);
                }
            }, new Supplier() { // from class: com.applovin.exoplayer2.f.a$a$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return a.C0029a.a(i);
                }
            }, z, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i) {
            return new HandlerThread(a.f(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i) {
            return new HandlerThread(a.g(i));
        }

        C0029a(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z, boolean z2) {
            this.b = supplier;
            this.c = supplier2;
            this.d = z;
            this.e = z2;
        }

        @Override // com.applovin.exoplayer2.f.g.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(g.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            a aVar2;
            String str = aVar.f404a.f407a;
            a aVar3 = null;
            try {
                ah.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    aVar2 = new a(mediaCodecCreateByCodecName, this.b.get(), this.c.get(), this.d, this.e);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                ah.a();
                aVar2.a(aVar.b, aVar.d, aVar.e, aVar.f, aVar.g);
                return aVar2;
            } catch (Exception e3) {
                e = e3;
                aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.e();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    private a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f397a = mediaCodec;
        this.b = new c(handlerThread);
        this.c = new b(mediaCodec, handlerThread2, z);
        this.d = z2;
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.b.a(this.f397a);
        ah.a("configureCodec");
        this.f397a.configure(mediaFormat, surface, mediaCrypto, i);
        ah.a();
        if (z) {
            this.g = this.f397a.createInputSurface();
        }
        this.c.a();
        ah.a("startCodec");
        this.f397a.start();
        ah.a();
        this.f = 1;
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, int i2, int i3, long j, int i4) {
        this.c.a(i, i2, i3, j, i4);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, int i2, com.applovin.exoplayer2.c.c cVar, long j, int i3) {
        this.c.a(i, i2, cVar, j, i3);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, boolean z) {
        this.f397a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, long j) {
        this.f397a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.b.b();
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.b.c();
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i) {
        return this.f397a.getInputBuffer(i);
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i) {
        return this.f397a.getOutputBuffer(i);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.c.b();
        this.f397a.flush();
        c cVar = this.b;
        final MediaCodec mediaCodec = this.f397a;
        Objects.requireNonNull(mediaCodec);
        cVar.a(new Runnable() { // from class: com.applovin.exoplayer2.f.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        try {
            if (this.f == 1) {
                this.c.c();
                this.b.a();
            }
            this.f = 2;
        } finally {
            Surface surface = this.g;
            if (surface != null) {
                surface.release();
            }
            if (!this.e) {
                this.f397a.release();
                this.e = true;
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(final g.c cVar, Handler handler) {
        f();
        this.f397a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.exoplayer2.f.a$$ExternalSyntheticLambda6
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f$0.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Surface surface) {
        f();
        this.f397a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        f();
        this.f397a.setParameters(bundle);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i) {
        f();
        this.f397a.setVideoScalingMode(i);
    }

    private void f() {
        if (this.d) {
            try {
                this.c.d();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int i) {
        return a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i) {
        return a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }
}
