package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ad.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f344a;
    private final List<com.applovin.exoplayer2.v> b;

    public g() {
        this(0);
    }

    public g(int i) {
        this(i, com.applovin.exoplayer2.common.a.s.g());
    }

    public g(int i, List<com.applovin.exoplayer2.v> list) {
        this.f344a = i;
        this.b = list;
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public SparseArray<ad> a() {
        return new SparseArray<>();
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public ad a(int i, ad.b bVar) {
        if (i == 2) {
            return new t(new k(b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new t(new q(bVar.b));
        }
        if (i == 21) {
            return new t(new o());
        }
        if (i == 27) {
            if (a(4)) {
                return null;
            }
            return new t(new m(a(bVar), a(1), a(8)));
        }
        if (i == 36) {
            return new t(new n(a(bVar)));
        }
        if (i != 89) {
            if (i != 138) {
                if (i == 172) {
                    return new t(new d(bVar.b));
                }
                if (i != 257) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i == 134) {
                                if (a(16)) {
                                    return null;
                                }
                                return new y(new s("application/x-scte35"));
                            }
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new f(false, bVar.b));
                                    case 16:
                                        return new t(new l(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new p(bVar.b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new t(new b(bVar.b));
                }
                return new y(new s("application/vnd.dvb.ait"));
            }
            return new t(new h(bVar.b));
        }
        return new t(new i(bVar.c));
    }

    private z a(ad.b bVar) {
        return new z(c(bVar));
    }

    private af b(ad.b bVar) {
        return new af(c(bVar));
    }

    private List<com.applovin.exoplayer2.v> c(ad.b bVar) {
        String str;
        int i;
        List<byte[]> listA;
        if (a(32)) {
            return this.b;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bVar.d);
        List<com.applovin.exoplayer2.v> arrayList = this.b;
        while (yVar.a() > 0) {
            int iH = yVar.h();
            int iC = yVar.c() + yVar.h();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = yVar.h() & 31;
                for (int i2 = 0; i2 < iH2; i2++) {
                    String strF = yVar.f(3);
                    int iH3 = yVar.h();
                    boolean z = (iH3 & 128) != 0;
                    if (z) {
                        i = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bH = (byte) yVar.h();
                    yVar.e(1);
                    if (z) {
                        listA = com.applovin.exoplayer2.l.e.a((bH & 64) != 0);
                    } else {
                        listA = null;
                    }
                    arrayList.add(new v.a().f(str).c(strF).p(i).a(listA).a());
                }
            }
            yVar.d(iC);
        }
        return arrayList;
    }

    private boolean a(int i) {
        return (i & this.f344a) != 0;
    }
}
