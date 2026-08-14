package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f64a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    boolean d();

    void e();

    void f();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65a = new a(-1, -1, -1);
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = ai.d(i3) ? ai.c(i3, i2) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + ']';
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }
}
