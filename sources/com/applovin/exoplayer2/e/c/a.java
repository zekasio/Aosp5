package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {
    private static final int[] b = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public a(x xVar) {
        super(xVar);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar) throws d.a {
        if (!this.c) {
            int iH = yVar.h();
            int i = (iH >> 4) & 15;
            this.e = i;
            if (i == 2) {
                this.f271a.a(new v.a().f("audio/mpeg").k(1).l(b[(iH >> 2) & 3]).a());
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.f271a.a(new v.a().f(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").k(1).l(GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY).a());
                this.d = true;
            } else if (i != 10) {
                throw new d.a("Audio format not supported: " + this.e);
            }
            this.c = true;
        } else {
            yVar.e(1);
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar, long j) throws ai {
        if (this.e == 2) {
            int iA = yVar.a();
            this.f271a.a(yVar, iA);
            this.f271a.a(j, 1, iA, 0, null);
            return true;
        }
        int iH = yVar.h();
        if (iH == 0 && !this.d) {
            int iA2 = yVar.a();
            byte[] bArr = new byte[iA2];
            yVar.a(bArr, 0, iA2);
            a.C0011a c0011aA = com.applovin.exoplayer2.b.a.a(bArr);
            this.f271a.a(new v.a().f("audio/mp4a-latm").d(c0011aA.c).k(c0011aA.b).l(c0011aA.f56a).a(Collections.singletonList(bArr)).a());
            this.d = true;
            return false;
        }
        if (this.e == 10 && iH != 1) {
            return false;
        }
        int iA3 = yVar.a();
        this.f271a.a(yVar, iA3);
        this.f271a.a(j, 1, iA3, 0, null);
        return true;
    }
}
