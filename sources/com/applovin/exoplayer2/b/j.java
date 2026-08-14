package com.applovin.exoplayer2.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.l.ai;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class j {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f73a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private i f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public j(a aVar) {
        this.f73a = (a) com.applovin.exoplayer2.l.a.b(aVar);
        if (ai.f611a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new i(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && a(i);
        boolean zD = ai.d(i);
        this.q = zD;
        this.i = zD ? h(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void a(float f) {
        this.j = f;
        i iVar = this.f;
        if (iVar != null) {
            iVar.d();
        }
    }

    public long a(boolean z) {
        long jMax;
        if (((AudioTrack) com.applovin.exoplayer2.l.a.b(this.c)).getPlayState() == 3) {
            e();
        }
        long jNanoTime = System.nanoTime() / 1000;
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f);
        boolean zC = iVar.c();
        if (zC) {
            jMax = h(iVar.f()) + ai.a(jNanoTime - iVar.e(), this.j);
        } else {
            if (this.w == 0) {
                jMax = h();
            } else {
                jMax = this.l + jNanoTime;
            }
            if (!z) {
                jMax = Math.max(0L, jMax - this.o);
            }
        }
        if (this.D != zC) {
            this.F = this.C;
            this.E = this.B;
        }
        long j = jNanoTime - this.F;
        if (j < 1000000) {
            long jA = this.E + ai.a(j, this.j);
            long j2 = (j * 1000) / 1000000;
            jMax = ((jMax * j2) + ((1000 - j2) * jA)) / 1000;
        }
        if (!this.k) {
            long j3 = this.B;
            if (jMax > j3) {
                this.k = true;
                this.f73a.a(System.currentTimeMillis() - com.applovin.exoplayer2.h.a(ai.b(com.applovin.exoplayer2.h.a(jMax - j3), this.j)));
            }
        }
        this.C = jNanoTime;
        this.B = jMax;
        this.D = zC;
        return jMax;
    }

    public void a() {
        ((i) com.applovin.exoplayer2.l.a.b(this.f)).d();
    }

    public boolean b() {
        return ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.c)).getPlayState() == 3;
    }

    public boolean a(long j) {
        int playState = ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zF = f(j);
        this.p = zF;
        if (z && !zF && playState != 1) {
            this.f73a.a(this.e, com.applovin.exoplayer2.h.a(this.i));
        }
        return true;
    }

    public int b(long j) {
        return this.e - ((int) (j - (i() * ((long) this.d))));
    }

    public long c(long j) {
        return com.applovin.exoplayer2.h.a(h(j - i()));
    }

    public boolean d(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public void e(long j) {
        this.z = i();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public boolean f(long j) {
        return j > i() || g();
    }

    public boolean c() {
        f();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((i) com.applovin.exoplayer2.l.a.b(this.f)).d();
        return true;
    }

    public void d() {
        f();
        this.c = null;
        this.f = null;
    }

    private void e() {
        long jH = h();
        if (jH == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.m >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            long[] jArr = this.b;
            int i = this.v;
            jArr[i] = jH - jNanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = jNanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l += this.b[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        a(jNanoTime, jH);
        g(jNanoTime);
    }

    private void a(long j, long j2) {
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f);
        if (iVar.a(j)) {
            long jE = iVar.e();
            long jF = iVar.f();
            if (Math.abs(jE - j) > 5000000) {
                this.f73a.b(jF, jE, j, j2);
                iVar.a();
            } else if (Math.abs(h(jF) - j2) > 5000000) {
                this.f73a.a(jF, jE, j, j2);
                iVar.a();
            } else {
                iVar.b();
            }
        }
    }

    private void g(long j) {
        Method method;
        if (!this.q || (method = this.n) == null || j - this.r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) ai.a((Integer) method.invoke(com.applovin.exoplayer2.l.a.b(this.c), null))).intValue()) * 1000) - this.i;
            this.o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.o = jMax;
            if (jMax > 5000000) {
                this.f73a.b(jMax);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.r = j;
    }

    private long h(long j) {
        return (j * 1000000) / ((long) this.g);
    }

    private void f() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    private boolean g() {
        return this.h && ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.c)).getPlayState() == 2 && i() == 0;
    }

    private static boolean a(int i) {
        return ai.f611a < 23 && (i == 5 || i == 6);
    }

    private long h() {
        return h(i());
    }

    private long i() {
        AudioTrack audioTrack = (AudioTrack) com.applovin.exoplayer2.l.a.b(this.c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (ai.f611a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }
}
