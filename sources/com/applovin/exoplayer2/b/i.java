package com.applovin.exoplayer2.b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f71a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    public i(AudioTrack audioTrack) {
        if (ai.f611a >= 19) {
            this.f71a = new a(audioTrack);
            d();
        } else {
            this.f71a = null;
            a(3);
        }
    }

    public boolean a(long j) {
        a aVar = this.f71a;
        if (aVar == null || j - this.e < this.d) {
            return false;
        }
        this.e = j;
        boolean zA = aVar.a();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zA) {
                        d();
                    }
                } else if (!zA) {
                    d();
                }
            } else if (!zA) {
                d();
            } else if (this.f71a.c() > this.f) {
                a(2);
            }
        } else if (zA) {
            if (this.f71a.b() < this.c) {
                return false;
            }
            this.f = this.f71a.c();
            a(1);
        } else if (j - this.c > 500000) {
            a(3);
        }
        return zA;
    }

    public void a() {
        a(4);
    }

    public void b() {
        if (this.b == 4) {
            d();
        }
    }

    public boolean c() {
        return this.b == 2;
    }

    public void d() {
        if (this.f71a != null) {
            a(0);
        }
    }

    public long e() {
        a aVar = this.f71a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public long f() {
        a aVar = this.f71a;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    private void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 1) {
            this.d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i == 4) {
                this.d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f72a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;

        public a(AudioTrack audioTrack) {
            this.f72a = audioTrack;
        }

        public boolean a() {
            boolean timestamp = this.f72a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public long c() {
            return this.e;
        }
    }
}
