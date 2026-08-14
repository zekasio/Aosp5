package com.applovin.exoplayer2.e.i;

import androidx.core.view.InputDeviceCompat;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f367a;
    private final com.applovin.exoplayer2.l.y b = new com.applovin.exoplayer2.l.y(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public y(x xVar) {
        this.f367a = xVar;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f367a.a(agVar, jVar, dVar);
        this.f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a() {
        this.f = true;
    }

    @Override // com.applovin.exoplayer2.e.i.ad
    public void a(com.applovin.exoplayer2.l.y yVar, int i) {
        boolean z = (i & 1) != 0;
        int iC = z ? yVar.c() + yVar.h() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            yVar.d(iC);
            this.d = 0;
        }
        while (yVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iH = yVar.h();
                    yVar.d(yVar.c() - 1);
                    if (iH == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(yVar.a(), 3 - this.d);
                yVar.a(this.b.d(), this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    this.b.d(0);
                    this.b.c(3);
                    this.b.e(1);
                    int iH2 = this.b.h();
                    int iH3 = this.b.h();
                    this.e = (iH2 & 128) != 0;
                    this.c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iE = this.b.e();
                    int i4 = this.c;
                    if (iE < i4) {
                        this.b.b(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, this.b.e() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(yVar.a(), this.c - this.d);
                yVar.a(this.b.d(), this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        if (ai.a(this.b.d(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.c(this.c - 4);
                    } else {
                        this.b.c(i6);
                    }
                    this.b.d(0);
                    this.f367a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
