package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.am;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public interface c {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.b.h$c$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(c _this, long j) {
            }

            public static void $default$a(c _this, Exception exc) {
            }

            public static void $default$b(c _this) {
            }

            public static void $default$b(c _this, long j) {
            }
        }

        void a();

        void a(int i, long j, long j2);

        void a(long j);

        void a(Exception exc);

        void a(boolean z);

        void b();

        void b(long j);
    }

    long a(boolean z);

    void a();

    void a(float f);

    void a(int i);

    void a(am amVar);

    void a(com.applovin.exoplayer2.b.d dVar);

    void a(c cVar);

    void a(k kVar);

    void a(com.applovin.exoplayer2.v vVar, int i, int[] iArr) throws a;

    boolean a(com.applovin.exoplayer2.v vVar);

    boolean a(ByteBuffer byteBuffer, long j, int i) throws e, b;

    int b(com.applovin.exoplayer2.v vVar);

    void b();

    void b(boolean z);

    void c() throws e;

    boolean d();

    boolean e();

    am f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f67a;

        public a(Throwable th, com.applovin.exoplayer2.v vVar) {
            super(th);
            this.f67a = vVar;
        }

        public a(String str, com.applovin.exoplayer2.v vVar) {
            super(str);
            this.f67a = vVar;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68a;
        public final boolean b;
        public final com.applovin.exoplayer2.v c;

        public b(int i, int i2, int i3, int i4, com.applovin.exoplayer2.v vVar, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f68a = i;
            this.b = z;
            this.c = vVar;
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70a;
        public final boolean b;
        public final com.applovin.exoplayer2.v c;

        public e(int i, com.applovin.exoplayer2.v vVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.b = z;
            this.f70a = i;
            this.c = vVar;
        }
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f69a;
        public final long b;

        public d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f69a = j;
            this.b = j2;
        }
    }
}
