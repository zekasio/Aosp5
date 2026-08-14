package com.applovin.exoplayer2.k;

import android.content.Context;
import android.os.Handler;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.w;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.warren.AdLoader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n implements aa, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.t<String, Integer> f584a = b();
    public static final com.applovin.exoplayer2.common.a.s<Long> b = com.applovin.exoplayer2.common.a.s.a(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> c = com.applovin.exoplayer2.common.a.s.a(248000L, 160000L, 142000L, 127000L, 113000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> d = com.applovin.exoplayer2.common.a.s.a(2200000L, 1300000L, 950000L, 760000L, 520000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> e = com.applovin.exoplayer2.common.a.s.a(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> f = com.applovin.exoplayer2.common.a.s.a(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> g = com.applovin.exoplayer2.common.a.s.a(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    private static n h;
    private final com.applovin.exoplayer2.common.a.u<Integer, Long> i;
    private final d.a.C0042a j;
    private final y k;
    private final com.applovin.exoplayer2.l.d l;
    private final boolean m;
    private int n;
    private long o;
    private long p;
    private int q;
    private long r;
    private long s;
    private long t;
    private long u;
    private boolean v;
    private int w;

    @Override // com.applovin.exoplayer2.k.d
    public aa a() {
        return this;
    }

    @Override // com.applovin.exoplayer2.k.aa
    public void a(i iVar, l lVar, boolean z) {
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f585a;
        private Map<Integer, Long> b;
        private int c;
        private com.applovin.exoplayer2.l.d d;
        private boolean e;

        public a(Context context) {
            this.f585a = context == null ? null : context.getApplicationContext();
            this.b = a(ai.b(context));
            this.c = 2000;
            this.d = com.applovin.exoplayer2.l.d.f613a;
            this.e = true;
        }

        public n a() {
            return new n(this.f585a, this.b, this.c, this.d, this.e);
        }

        private static Map<Integer, Long> a(String str) {
            com.applovin.exoplayer2.common.a.s<Integer> sVarB = b(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, n.b.get(sVarB.get(0).intValue()));
            map.put(3, n.c.get(sVarB.get(1).intValue()));
            map.put(4, n.d.get(sVarB.get(2).intValue()));
            map.put(5, n.e.get(sVarB.get(3).intValue()));
            map.put(10, n.f.get(sVarB.get(4).intValue()));
            map.put(9, n.g.get(sVarB.get(5).intValue()));
            map.put(7, n.b.get(sVarB.get(0).intValue()));
            return map;
        }

        private static com.applovin.exoplayer2.common.a.s<Integer> b(String str) {
            com.applovin.exoplayer2.common.a.s<Integer> sVarB = n.f584a.b(str);
            return sVarB.isEmpty() ? com.applovin.exoplayer2.common.a.s.a(2, 2, 2, 2, 2, 2) : sVarB;
        }
    }

    public static synchronized n a(Context context) {
        if (h == null) {
            h = new a(context).a();
        }
        return h;
    }

    @Deprecated
    public n() {
        this(null, com.applovin.exoplayer2.common.a.u.a(), 2000, com.applovin.exoplayer2.l.d.f613a, false);
    }

    private n(Context context, Map<Integer, Long> map, int i, com.applovin.exoplayer2.l.d dVar, boolean z) {
        this.i = com.applovin.exoplayer2.common.a.u.a(map);
        this.j = new d.a.C0042a();
        this.k = new y(i);
        this.l = dVar;
        this.m = z;
        if (context != null) {
            com.applovin.exoplayer2.l.w wVarA = com.applovin.exoplayer2.l.w.a(context);
            int iA = wVarA.a();
            this.q = iA;
            this.t = b(iA);
            wVarA.a(new w.b() { // from class: com.applovin.exoplayer2.k.n$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.l.w.b
                public final void onNetworkTypeChanged(int i2) {
                    this.f$0.a(i2);
                }
            });
            return;
        }
        this.q = 0;
        this.t = b(0);
    }

    @Override // com.applovin.exoplayer2.k.d
    public void a(Handler handler, d.a aVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(aVar);
        this.j.a(handler, aVar);
    }

    @Override // com.applovin.exoplayer2.k.d
    public void a(d.a aVar) {
        this.j.a(aVar);
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void b(i iVar, l lVar, boolean z) {
        if (a(lVar, z)) {
            if (this.n == 0) {
                this.o = this.l.a();
            }
            this.n++;
        }
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void a(i iVar, l lVar, boolean z, int i) {
        if (a(lVar, z)) {
            this.p += (long) i;
        }
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void c(i iVar, l lVar, boolean z) {
        if (a(lVar, z)) {
            com.applovin.exoplayer2.l.a.b(this.n > 0);
            long jA = this.l.a();
            int i = (int) (jA - this.o);
            this.r += (long) i;
            long j = this.s;
            long j2 = this.p;
            this.s = j + j2;
            if (i > 0) {
                this.k.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.r >= AdLoader.RETRY_DELAY || this.s >= 524288) {
                    this.t = (long) this.k.a(0.5f);
                }
                a(i, this.p, this.t);
                this.o = jA;
                this.p = 0L;
            }
            this.n--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i) {
        int i2 = this.q;
        if (i2 == 0 || this.m) {
            if (this.v) {
                i = this.w;
            }
            if (i2 == i) {
                return;
            }
            this.q = i;
            if (i != 1 && i != 0 && i != 8) {
                this.t = b(i);
                long jA = this.l.a();
                a(this.n > 0 ? (int) (jA - this.o) : 0, this.p, this.t);
                this.o = jA;
                this.p = 0L;
                this.s = 0L;
                this.r = 0L;
                this.k.a();
            }
        }
    }

    private void a(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.u) {
            return;
        }
        this.u = j2;
        this.j.a(i, j, j2);
    }

    private long b(int i) {
        Long l = this.i.get(Integer.valueOf(i));
        if (l == null) {
            l = this.i.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean a(l lVar, boolean z) {
        return z && !lVar.b(8);
    }

    private static com.applovin.exoplayer2.common.a.t<String, Integer> b() {
        return com.applovin.exoplayer2.common.a.t.c().b("AD", 1, 2, 0, 0, 2, 2).b("AE", 1, 4, 4, 4, 2, 2).b("AF", 4, 4, 3, 4, 2, 2).b("AG", 4, 2, 1, 4, 2, 2).b("AI", 1, 2, 2, 2, 2, 2).b("AL", 1, 1, 1, 1, 2, 2).b("AM", 2, 2, 1, 3, 2, 2).b("AO", 3, 4, 3, 1, 2, 2).b("AR", 2, 4, 2, 1, 2, 2).b("AS", 2, 2, 3, 3, 2, 2).b("AT", 0, 1, 0, 0, 0, 2).b("AU", 0, 2, 0, 1, 1, 2).b("AW", 1, 2, 0, 4, 2, 2).b("AX", 0, 2, 2, 2, 2, 2).b("AZ", 3, 3, 3, 4, 4, 2).b("BA", 1, 1, 0, 1, 2, 2).b("BB", 0, 2, 0, 0, 2, 2).b("BD", 2, 0, 3, 3, 2, 2).b("BE", 0, 0, 2, 3, 2, 2).b("BF", 4, 4, 4, 2, 2, 2).b("BG", 0, 1, 0, 0, 2, 2).b("BH", 1, 0, 2, 4, 2, 2).b("BI", 4, 4, 4, 4, 2, 2).b("BJ", 4, 4, 4, 4, 2, 2).b("BL", 1, 2, 2, 2, 2, 2).b("BM", 0, 2, 0, 0, 2, 2).b("BN", 3, 2, 1, 0, 2, 2).b("BO", 1, 2, 4, 2, 2, 2).b("BQ", 1, 2, 1, 2, 2, 2).b("BR", 2, 4, 3, 2, 2, 2).b("BS", 2, 2, 1, 3, 2, 2).b("BT", 3, 0, 3, 2, 2, 2).b("BW", 3, 4, 1, 1, 2, 2).b("BY", 1, 1, 1, 2, 2, 2).b("BZ", 2, 2, 2, 2, 2, 2).b("CA", 0, 3, 1, 2, 4, 2).b("CD", 4, 2, 2, 1, 2, 2).b("CF", 4, 2, 3, 2, 2, 2).b("CG", 3, 4, 2, 2, 2, 2).b("CH", 0, 0, 0, 0, 1, 2).b("CI", 3, 3, 3, 3, 2, 2).b("CK", 2, 2, 3, 0, 2, 2).b("CL", 1, 1, 2, 2, 2, 2).b("CM", 3, 4, 3, 2, 2, 2).b("CN", 2, 2, 2, 1, 3, 2).b("CO", 2, 3, 4, 2, 2, 2).b("CR", 2, 3, 4, 4, 2, 2).b("CU", 4, 4, 2, 2, 2, 2).b("CV", 2, 3, 1, 0, 2, 2).b("CW", 1, 2, 0, 0, 2, 2).b("CY", 1, 1, 0, 0, 2, 2).b("CZ", 0, 1, 0, 0, 1, 2).b("DE", 0, 0, 1, 1, 0, 2).b("DJ", 4, 0, 4, 4, 2, 2).b("DK", 0, 0, 1, 0, 0, 2).b("DM", 1, 2, 2, 2, 2, 2).b("DO", 3, 4, 4, 4, 2, 2).b("DZ", 3, 3, 4, 4, 2, 4).b("EC", 2, 4, 3, 1, 2, 2).b("EE", 0, 1, 0, 0, 2, 2).b("EG", 3, 4, 3, 3, 2, 2).b("EH", 2, 2, 2, 2, 2, 2).b("ER", 4, 2, 2, 2, 2, 2).b("ES", 0, 1, 1, 1, 2, 2).b("ET", 4, 4, 4, 1, 2, 2).b("FI", 0, 0, 0, 0, 0, 2).b("FJ", 3, 0, 2, 3, 2, 2).b("FK", 4, 2, 2, 2, 2, 2).b("FM", 3, 2, 4, 4, 2, 2).b("FO", 1, 2, 0, 1, 2, 2).b("FR", 1, 1, 2, 0, 1, 2).b("GA", 3, 4, 1, 1, 2, 2).b("GB", 0, 0, 1, 1, 1, 2).b("GD", 1, 2, 2, 2, 2, 2).b("GE", 1, 1, 1, 2, 2, 2).b("GF", 2, 2, 2, 3, 2, 2).b("GG", 1, 2, 0, 0, 2, 2).b("GH", 3, 1, 3, 2, 2, 2).b("GI", 0, 2, 0, 0, 2, 2).b("GL", 1, 2, 0, 0, 2, 2).b("GM", 4, 3, 2, 4, 2, 2).b("GN", 4, 3, 4, 2, 2, 2).b("GP", 2, 1, 2, 3, 2, 2).b("GQ", 4, 2, 2, 4, 2, 2).b("GR", 1, 2, 0, 0, 2, 2).b("GT", 3, 2, 3, 1, 2, 2).b("GU", 1, 2, 3, 4, 2, 2).b("GW", 4, 4, 4, 4, 2, 2).b("GY", 3, 3, 3, 4, 2, 2).b("HK", 0, 1, 2, 3, 2, 0).b("HN", 3, 1, 3, 3, 2, 2).b("HR", 1, 1, 0, 0, 3, 2).b("HT", 4, 4, 4, 4, 2, 2).b("HU", 0, 0, 0, 0, 0, 2).b("ID", 3, 2, 3, 3, 2, 2).b("IE", 0, 0, 1, 1, 3, 2).b("IL", 1, 0, 2, 3, 4, 2).b("IM", 0, 2, 0, 1, 2, 2).b("IN", 2, 1, 3, 3, 2, 2).b("IO", 4, 2, 2, 4, 2, 2).b("IQ", 3, 3, 4, 4, 2, 2).b("IR", 3, 2, 3, 2, 2, 2).b("IS", 0, 2, 0, 0, 2, 2).b("IT", 0, 4, 0, 1, 2, 2).b("JE", 2, 2, 1, 2, 2, 2).b("JM", 3, 3, 4, 4, 2, 2).b("JO", 2, 2, 1, 1, 2, 2).b("JP", 0, 0, 0, 0, 2, 1).b("KE", 3, 4, 2, 2, 2, 2).b("KG", 2, 0, 1, 1, 2, 2).b("KH", 1, 0, 4, 3, 2, 2).b("KI", 4, 2, 4, 3, 2, 2).b("KM", 4, 3, 2, 3, 2, 2).b("KN", 1, 2, 2, 2, 2, 2).b("KP", 4, 2, 2, 2, 2, 2).b("KR", 0, 0, 1, 3, 1, 2).b("KW", 1, 3, 1, 1, 1, 2).b("KY", 1, 2, 0, 2, 2, 2).b("KZ", 2, 2, 2, 3, 2, 2).b("LA", 1, 2, 1, 1, 2, 2).b("LB", 3, 2, 0, 0, 2, 2).b("LC", 1, 2, 0, 0, 2, 2).b("LI", 0, 2, 2, 2, 2, 2).b("LK", 2, 0, 2, 3, 2, 2).b("LR", 3, 4, 4, 3, 2, 2).b("LS", 3, 3, 2, 3, 2, 2).b("LT", 0, 0, 0, 0, 2, 2).b("LU", 1, 0, 1, 1, 2, 2).b("LV", 0, 0, 0, 0, 2, 2).b("LY", 4, 2, 4, 3, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2, 2).b("MC", 0, 2, 0, 0, 2, 2).b("MD", 1, 2, 0, 0, 2, 2).b("ME", 1, 2, 0, 1, 2, 2).b("MF", 2, 2, 1, 1, 2, 2).b("MG", 3, 4, 2, 2, 2, 2).b("MH", 4, 2, 2, 4, 2, 2).b("MK", 1, 1, 0, 0, 2, 2).b("ML", 4, 4, 2, 2, 2, 2).b("MM", 2, 3, 3, 3, 2, 2).b("MN", 2, 4, 2, 2, 2, 2).b("MO", 0, 2, 4, 4, 2, 2).b("MP", 0, 2, 2, 2, 2, 2).b("MQ", 2, 2, 2, 3, 2, 2).b("MR", 3, 0, 4, 3, 2, 2).b("MS", 1, 2, 2, 2, 2, 2).b("MT", 0, 2, 0, 0, 2, 2).b("MU", 2, 1, 1, 2, 2, 2).b("MV", 4, 3, 2, 4, 2, 2).b("MW", 4, 2, 1, 0, 2, 2).b("MX", 2, 4, 4, 4, 4, 2).b("MY", 1, 0, 3, 2, 2, 2).b("MZ", 3, 3, 2, 1, 2, 2).b("NA", 4, 3, 3, 2, 2, 2).b("NC", 3, 0, 4, 4, 2, 2).b("NE", 4, 4, 4, 4, 2, 2).b("NF", 2, 2, 2, 2, 2, 2).b("NG", 3, 3, 2, 3, 2, 2).b("NI", 2, 1, 4, 4, 2, 2).b("NL", 0, 2, 3, 2, 0, 2).b("NO", 0, 1, 2, 0, 0, 2).b("NP", 2, 0, 4, 2, 2, 2).b("NR", 3, 2, 3, 1, 2, 2).b("NU", 4, 2, 2, 2, 2, 2).b("NZ", 0, 2, 1, 2, 4, 2).b("OM", 2, 2, 1, 3, 3, 2).b("PA", 1, 3, 3, 3, 2, 2).b("PE", 2, 3, 4, 4, 2, 2).b("PF", 2, 2, 2, 1, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2, 2).b("PH", 2, 1, 3, 3, 3, 2).b("PK", 3, 2, 3, 3, 2, 2).b("PL", 1, 0, 1, 2, 3, 2).b("PM", 0, 2, 2, 2, 2, 2).b("PR", 2, 1, 2, 2, 4, 3).b("PS", 3, 3, 2, 2, 2, 2).b("PT", 0, 1, 1, 0, 2, 2).b("PW", 1, 2, 4, 1, 2, 2).b("PY", 2, 0, 3, 2, 2, 2).b("QA", 2, 3, 1, 2, 3, 2).b("RE", 1, 0, 2, 2, 2, 2).b("RO", 0, 1, 0, 1, 0, 2).b("RS", 1, 2, 0, 0, 2, 2).b("RU", 0, 1, 0, 1, 4, 2).b("RW", 3, 3, 3, 1, 2, 2).b("SA", 2, 2, 2, 1, 1, 2).b("SB", 4, 2, 3, 2, 2, 2).b("SC", 4, 2, 1, 3, 2, 2).b("SD", 4, 4, 4, 4, 2, 2).b("SE", 0, 0, 0, 0, 0, 2).b("SG", 1, 0, 1, 2, 3, 2).b("SH", 4, 2, 2, 2, 2, 2).b("SI", 0, 0, 0, 0, 2, 2).b("SJ", 2, 2, 2, 2, 2, 2).b("SK", 0, 1, 0, 0, 2, 2).b("SL", 4, 3, 4, 0, 2, 2).b("SM", 0, 2, 2, 2, 2, 2).b("SN", 4, 4, 4, 4, 2, 2).b("SO", 3, 3, 3, 4, 2, 2).b("SR", 3, 2, 2, 2, 2, 2).b("SS", 4, 4, 3, 3, 2, 2).b("ST", 2, 2, 1, 2, 2, 2).b("SV", 2, 1, 4, 3, 2, 2).b("SX", 2, 2, 1, 0, 2, 2).b("SY", 4, 3, 3, 2, 2, 2).b("SZ", 3, 3, 2, 4, 2, 2).b("TC", 2, 2, 2, 0, 2, 2).b("TD", 4, 3, 4, 4, 2, 2).b("TG", 3, 2, 2, 4, 2, 2).b("TH", 0, 3, 2, 3, 2, 2).b("TJ", 4, 4, 4, 4, 2, 2).b("TL", 4, 0, 4, 4, 2, 2).b("TM", 4, 2, 4, 3, 2, 2).b("TN", 2, 1, 1, 2, 2, 2).b("TO", 3, 3, 4, 3, 2, 2).b("TR", 1, 2, 1, 1, 2, 2).b("TT", 1, 4, 0, 1, 2, 2).b("TV", 3, 2, 2, 4, 2, 2).b("TW", 0, 0, 0, 0, 1, 0).b("TZ", 3, 3, 3, 2, 2, 2).b("UA", 0, 3, 1, 1, 2, 2).b("UG", 3, 2, 3, 3, 2, 2).b("US", 1, 1, 2, 2, 4, 2).b("UY", 2, 2, 1, 1, 2, 2).b("UZ", 2, 1, 3, 4, 2, 2).b("VC", 1, 2, 2, 2, 2, 2).b("VE", 4, 4, 4, 4, 2, 2).b("VG", 2, 2, 1, 1, 2, 2).b("VI", 1, 2, 1, 2, 2, 2).b("VN", 0, 1, 3, 4, 2, 2).b("VU", 4, 0, 3, 1, 2, 2).b("WF", 4, 2, 2, 4, 2, 2).b("WS", 3, 1, 3, 1, 2, 2).b("XK", 0, 1, 1, 0, 2, 2).b("YE", 4, 4, 4, 3, 2, 2).b("YT", 4, 2, 2, 3, 2, 2).b("ZA", 3, 3, 2, 1, 2, 2).b("ZM", 3, 2, 3, 3, 2, 2).b("ZW", 3, 2, 4, 3, 2, 2).b();
    }
}
