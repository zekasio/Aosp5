package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f362a;
    private final com.applovin.exoplayer2.l.x b = new com.applovin.exoplayer2.l.x(new byte[10]);
    private int c = 0;
    private int d;
    private ag e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public t(j jVar) {
        this.f362a = jVar;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.e = agVar;
        this.f362a.a(jVar, dVar);
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f362a.a();
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public final void a(com.applovin.exoplayer2.l.y yVar, int i) throws ai {
        com.applovin.exoplayer2.l.a.a(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.j != -1) {
                        com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.f362a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (yVar.a() > 0) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (a(yVar, this.b.f636a, Math.min(10, this.i)) && a(yVar, (byte[]) null, this.i)) {
                            c();
                            i |= this.k ? 4 : 0;
                            this.f362a.a(this.l, i);
                            a(3);
                        }
                    } else if (i3 == 3) {
                        int iA = yVar.a();
                        int i4 = this.j;
                        int i5 = i4 != -1 ? iA - i4 : 0;
                        if (i5 > 0) {
                            iA -= i5;
                            yVar.c(yVar.c() + iA);
                        }
                        this.f362a.a(yVar);
                        int i6 = this.j;
                        if (i6 != -1) {
                            int i7 = i6 - iA;
                            this.j = i7;
                            if (i7 == 0) {
                                this.f362a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(yVar, this.b.f636a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                yVar.e(yVar.a());
            }
        }
    }

    private void a(int i) {
        this.c = i;
        this.d = 0;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i) {
        int iMin = Math.min(yVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.e(iMin);
        } else {
            yVar.a(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    private boolean b() {
        this.b.a(0);
        int iC = this.b.c(24);
        if (iC != 1) {
            com.applovin.exoplayer2.l.q.c("PesReader", "Unexpected start code prefix: " + iC);
            this.j = -1;
            return false;
        }
        this.b.b(8);
        int iC2 = this.b.c(16);
        this.b.b(5);
        this.k = this.b.e();
        this.b.b(2);
        this.f = this.b.e();
        this.g = this.b.e();
        this.b.b(6);
        int iC3 = this.b.c(8);
        this.i = iC3;
        if (iC2 == 0) {
            this.j = -1;
        } else {
            int i = (iC2 - 3) - iC3;
            this.j = i;
            if (i < 0) {
                com.applovin.exoplayer2.l.q.c("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.b.a(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.b(4);
            long jC = ((long) this.b.c(3)) << 30;
            this.b.b(1);
            long jC2 = jC | ((long) (this.b.c(15) << 15));
            this.b.b(1);
            long jC3 = jC2 | ((long) this.b.c(15));
            this.b.b(1);
            if (!this.h && this.g) {
                this.b.b(4);
                long jC4 = ((long) this.b.c(3)) << 30;
                this.b.b(1);
                long jC5 = jC4 | ((long) (this.b.c(15) << 15));
                this.b.b(1);
                long jC6 = jC5 | ((long) this.b.c(15));
                this.b.b(1);
                this.e.b(jC6);
                this.h = true;
            }
            this.l = this.e.b(jC3);
        }
    }
}
