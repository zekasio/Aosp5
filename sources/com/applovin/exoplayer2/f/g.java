package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.f.m;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f405a = new m.b();

        g b(a aVar) throws IOException;
    }

    public interface c {
        void a(g gVar, long j, long j2);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i);

    void a(int i, int i2, int i3, long j, int i4);

    void a(int i, int i2, com.applovin.exoplayer2.c.c cVar, long j, int i3);

    void a(int i, long j);

    void a(int i, boolean z);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    boolean a();

    int b();

    ByteBuffer b(int i);

    MediaFormat c();

    void c(int i);

    void d();

    void e();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f404a;
        public final MediaFormat b;
        public final v c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;
        public final boolean g;

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, null, mediaCrypto, 0, false);
        }

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, surface, mediaCrypto, 0, false);
        }

        private a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f404a = iVar;
            this.b = mediaFormat;
            this.c = vVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
            this.g = z;
        }
    }
}
