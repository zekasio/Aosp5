package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
final class e extends d {
    private final y b;
    private final y c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public e(x xVar) {
        super(xVar);
        this.b = new y(v.f629a);
        this.c = new y(4);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar) throws d.a {
        int iH = yVar.h();
        int i = (iH >> 4) & 15;
        int i2 = iH & 15;
        if (i2 != 7) {
            throw new d.a("Video format not supported: " + i2);
        }
        this.g = i;
        return i != 5;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar, long j) throws ai {
        int iH = yVar.h();
        long jN = j + (((long) yVar.n()) * 1000);
        if (iH == 0 && !this.e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.a(yVar2.d(), 0, yVar.a());
            com.applovin.exoplayer2.m.a aVarA = com.applovin.exoplayer2.m.a.a(yVar2);
            this.d = aVarA.b;
            this.f271a.a(new v.a().f("video/avc").d(aVarA.f).g(aVarA.c).h(aVarA.d).b(aVarA.e).a(aVarA.f640a).a());
            this.e = true;
            return false;
        }
        if (iH != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] bArrD = this.c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (yVar.a() > 0) {
            yVar.a(this.c.d(), i2, this.d);
            this.c.d(0);
            int iW = this.c.w();
            this.b.d(0);
            this.f271a.a(this.b, 4);
            this.f271a.a(yVar, iW);
            i3 = i3 + 4 + iW;
        }
        this.f271a.a(jN, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
