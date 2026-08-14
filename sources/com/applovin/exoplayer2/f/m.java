package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f414a;
    private final Surface b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;

    @Override // com.applovin.exoplayer2.f.g
    public boolean a() {
        return false;
    }

    public static class b implements g.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.exoplayer2.f.m$1] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.exoplayer2.f.g.b
        public g b(g.a aVar) throws Throwable {
            MediaCodec mediaCodecA;
            Surface surfaceA;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                mediaCodecA = a(aVar);
                try {
                    ah.a("configureCodec");
                    mediaCodecA.configure(aVar.b, aVar.d, aVar.e, aVar.f);
                    ah.a();
                    if (!aVar.g) {
                        surfaceA = null;
                    } else if (ai.f611a >= 18) {
                        surfaceA = a.a(mediaCodecA);
                    } else {
                        throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                    }
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    ah.a("startCodec");
                    mediaCodecA.start();
                    ah.a();
                    return new m(mediaCodecA, surfaceA);
                } catch (IOException | RuntimeException e3) {
                    r0 = surfaceA;
                    e = e3;
                    if (r0 != 0) {
                        r0.release();
                    }
                    if (mediaCodecA != null) {
                        mediaCodecA.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e4) {
                e = e4;
                mediaCodecA = null;
            }
        }

        protected MediaCodec a(g.a aVar) throws IOException {
            com.applovin.exoplayer2.l.a.b(aVar.f404a);
            String str = aVar.f404a.f407a;
            ah.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            ah.a();
            return mediaCodecCreateByCodecName;
        }
    }

    private m(MediaCodec mediaCodec, Surface surface) {
        this.f414a = mediaCodec;
        this.b = surface;
        if (ai.f611a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.exoplayer2.f.g
    public int b() {
        return this.f414a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.exoplayer2.f.g
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f414a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && ai.f611a < 21) {
                this.d = this.f414a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.applovin.exoplayer2.f.g
    public MediaFormat c() {
        return this.f414a.getOutputFormat();
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer a(int i) {
        if (ai.f611a >= 21) {
            return this.f414a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) ai.a(this.c))[i];
    }

    @Override // com.applovin.exoplayer2.f.g
    public ByteBuffer b(int i) {
        if (ai.f611a >= 21) {
            return this.f414a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) ai.a(this.d))[i];
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, int i2, int i3, long j, int i4) {
        this.f414a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, int i2, com.applovin.exoplayer2.c.c cVar, long j, int i3) {
        this.f414a.queueSecureInputBuffer(i, i2, cVar.a(), j, i3);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, boolean z) {
        this.f414a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(int i, long j) {
        this.f414a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void d() {
        this.f414a.flush();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void e() {
        this.c = null;
        this.d = null;
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.f414a.release();
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(final g.c cVar, Handler handler) {
        this.f414a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.exoplayer2.f.m$$ExternalSyntheticLambda0
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
        this.f414a.setOutputSurface(surface);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void a(Bundle bundle) {
        this.f414a.setParameters(bundle);
    }

    @Override // com.applovin.exoplayer2.f.g
    public void c(int i) {
        this.f414a.setVideoScalingMode(i);
    }

    private static final class a {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }
}
