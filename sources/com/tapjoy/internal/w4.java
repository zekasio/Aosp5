package com.tapjoy.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.internal.a4;
import com.tapjoy.internal.b4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 extends a4<w4, a> {
    public static final b4<w4> B = new b();
    public final Long A;
    public final z4 c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final Long h;
    public final Long i;
    public final b5 j;
    public final v4 k;
    public final i5 l;
    public final Integer m;
    public final Integer n;
    public final y4 o;
    public final e5 p;
    public final String q;
    public final String r;
    public final d5 s;
    public final String t;
    public final String u;
    public final String v;
    public final List<a5> w;
    public final String x;
    public final Integer y;
    public final Long z;

    public static final class a extends a4.a<w4, a> {
        public Long A;
        public z4 c;
        public String d;
        public Long e;
        public Long f;
        public String g;
        public Long h;
        public Long i;
        public b5 j;
        public v4 k;
        public i5 l;
        public Integer m;
        public Integer n;
        public y4 o;
        public e5 p;
        public String q;
        public String r;
        public d5 s;
        public String t;
        public String u;
        public String v;
        public List<a5> w = com.tapjoy.internal.a.c();
        public String x;
        public Integer y;
        public Long z;

        public w4 b() {
            String str;
            Long l;
            z4 z4Var = this.c;
            if (z4Var != null && (str = this.d) != null && (l = this.e) != null) {
                return new w4(z4Var, str, l, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, super.a());
            }
            com.tapjoy.internal.a.a(z4Var, TapjoyAuctionFlags.AUCTION_TYPE, this.d, AppMeasurementSdk.ConditionalUserProperty.NAME, this.e, "time");
            throw null;
        }
    }

    static {
        z4 z4Var = z4.APP;
        Long.valueOf(0L);
        Long.valueOf(0L);
        Long.valueOf(0L);
        Long.valueOf(0L);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Long.valueOf(0L);
        Long.valueOf(0L);
    }

    public w4(z4 z4Var, String str, Long l, Long l2, String str2, Long l3, Long l4, b5 b5Var, v4 v4Var, i5 i5Var, Integer num, Integer num2, y4 y4Var, e5 e5Var, String str3, String str4, d5 d5Var, String str5, String str6, String str7, List<a5> list, String str8, Integer num3, Long l5, Long l6, x8 x8Var) {
        super(B, x8Var);
        this.c = z4Var;
        this.d = str;
        this.e = l;
        this.f = l2;
        this.g = str2;
        this.h = l3;
        this.i = l4;
        this.j = b5Var;
        this.k = v4Var;
        this.l = i5Var;
        this.m = num;
        this.n = num2;
        this.o = y4Var;
        this.p = e5Var;
        this.q = str3;
        this.r = str4;
        this.s = d5Var;
        this.t = str5;
        this.u = str6;
        this.v = str7;
        this.w = com.tapjoy.internal.a.a("values", (List) list);
        this.x = str8;
        this.y = num3;
        this.z = l5;
        this.A = l6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return a().equals(w4Var.a()) && this.c.equals(w4Var.c) && this.d.equals(w4Var.d) && this.e.equals(w4Var.e) && com.tapjoy.internal.a.b(this.f, w4Var.f) && com.tapjoy.internal.a.b((Object) this.g, (Object) w4Var.g) && com.tapjoy.internal.a.b(this.h, w4Var.h) && com.tapjoy.internal.a.b(this.i, w4Var.i) && com.tapjoy.internal.a.b(this.j, w4Var.j) && com.tapjoy.internal.a.b(this.k, w4Var.k) && com.tapjoy.internal.a.b(this.l, w4Var.l) && com.tapjoy.internal.a.b(this.m, w4Var.m) && com.tapjoy.internal.a.b(this.n, w4Var.n) && com.tapjoy.internal.a.b(this.o, w4Var.o) && com.tapjoy.internal.a.b(this.p, w4Var.p) && com.tapjoy.internal.a.b((Object) this.q, (Object) w4Var.q) && com.tapjoy.internal.a.b((Object) this.r, (Object) w4Var.r) && com.tapjoy.internal.a.b(this.s, w4Var.s) && com.tapjoy.internal.a.b((Object) this.t, (Object) w4Var.t) && com.tapjoy.internal.a.b((Object) this.u, (Object) w4Var.u) && com.tapjoy.internal.a.b((Object) this.v, (Object) w4Var.v) && this.w.equals(w4Var.w) && com.tapjoy.internal.a.b((Object) this.x, (Object) w4Var.x) && com.tapjoy.internal.a.b(this.y, w4Var.y) && com.tapjoy.internal.a.b(this.z, w4Var.z) && com.tapjoy.internal.a.b(this.A, w4Var.A);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (a().hashCode() * 37)) * 37)) * 37)) * 37;
        Long l = this.f;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.g;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.h;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.i;
        int iHashCode5 = (iHashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37;
        b5 b5Var = this.j;
        int iHashCode6 = (iHashCode5 + (b5Var != null ? b5Var.hashCode() : 0)) * 37;
        v4 v4Var = this.k;
        int iHashCode7 = (iHashCode6 + (v4Var != null ? v4Var.hashCode() : 0)) * 37;
        i5 i5Var = this.l;
        int iHashCode8 = (iHashCode7 + (i5Var != null ? i5Var.hashCode() : 0)) * 37;
        Integer num = this.m;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.n;
        int iHashCode10 = (iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        y4 y4Var = this.o;
        int iHashCode11 = (iHashCode10 + (y4Var != null ? y4Var.hashCode() : 0)) * 37;
        e5 e5Var = this.p;
        int iHashCode12 = (iHashCode11 + (e5Var != null ? e5Var.hashCode() : 0)) * 37;
        String str2 = this.q;
        int iHashCode13 = (iHashCode12 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.r;
        int iHashCode14 = (iHashCode13 + (str3 != null ? str3.hashCode() : 0)) * 37;
        d5 d5Var = this.s;
        int iHashCode15 = (iHashCode14 + (d5Var != null ? d5Var.hashCode() : 0)) * 37;
        String str4 = this.t;
        int iHashCode16 = (iHashCode15 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.u;
        int iHashCode17 = (iHashCode16 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.v;
        int iHashCode18 = (this.w.hashCode() + ((iHashCode17 + (str6 != null ? str6.hashCode() : 0)) * 37)) * 37;
        String str7 = this.x;
        int iHashCode19 = (iHashCode18 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num3 = this.y;
        int iHashCode20 = (iHashCode19 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l4 = this.z;
        int iHashCode21 = (iHashCode20 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Long l5 = this.A;
        int iHashCode22 = iHashCode21 + (l5 != null ? l5.hashCode() : 0);
        this.b = iHashCode22;
        return iHashCode22;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", time=");
        sb.append(this.e);
        if (this.f != null) {
            sb.append(", systemTime=");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(", instanceId=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", elapsedRealtime=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", duration=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", info=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", app=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", user=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", xxx_session_seq=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", eventSeq=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", eventPrev=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", purchase=");
            sb.append(this.p);
        }
        if (this.q != null) {
            sb.append(", exception=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", metaBase=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", meta=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", category=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", p1=");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(", p2=");
            sb.append(this.v);
        }
        if (!this.w.isEmpty()) {
            sb.append(", values=");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append(", dimensions=");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append(", count=");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append(", firstTime=");
            sb.append(this.z);
        }
        if (this.A != null) {
            sb.append(", lastTime=");
            sb.append(this.A);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Event{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<w4> {
        public b() {
            super(z3.LENGTH_DELIMITED, w4.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, w4 w4Var) {
            w4 w4Var2 = w4Var;
            z4.f.a(e4Var, 1, w4Var2.c);
            b4.k.a(e4Var, 2, w4Var2.d);
            b4.g.a(e4Var, 3, w4Var2.e);
            Long l = w4Var2.f;
            if (l != null) {
                b4.g.a(e4Var, 19, l);
            }
            String str = w4Var2.g;
            if (str != null) {
                b4.k.a(e4Var, 20, str);
            }
            Long l2 = w4Var2.h;
            if (l2 != null) {
                b4.g.a(e4Var, 21, l2);
            }
            Long l3 = w4Var2.i;
            if (l3 != null) {
                b4.g.a(e4Var, 4, l3);
            }
            b5 b5Var = w4Var2.j;
            if (b5Var != null) {
                b5.u.a(e4Var, 5, b5Var);
            }
            v4 v4Var = w4Var2.k;
            if (v4Var != null) {
                v4.g.a(e4Var, 6, v4Var);
            }
            i5 i5Var = w4Var2.l;
            if (i5Var != null) {
                i5.C.a(e4Var, 7, i5Var);
            }
            Integer num = w4Var2.m;
            if (num != null) {
                b4.e.a(e4Var, 8, num);
            }
            Integer num2 = w4Var2.n;
            if (num2 != null) {
                b4.e.a(e4Var, 9, num2);
            }
            y4 y4Var = w4Var2.o;
            if (y4Var != null) {
                y4.f.a(e4Var, 10, y4Var);
            }
            e5 e5Var = w4Var2.p;
            if (e5Var != null) {
                e5.q.a(e4Var, 11, e5Var);
            }
            String str2 = w4Var2.q;
            if (str2 != null) {
                b4.k.a(e4Var, 12, str2);
            }
            String str3 = w4Var2.r;
            if (str3 != null) {
                b4.k.a(e4Var, 13, str3);
            }
            d5 d5Var = w4Var2.s;
            if (d5Var != null) {
                d5.f.a(e4Var, 18, d5Var);
            }
            String str4 = w4Var2.t;
            if (str4 != null) {
                b4.k.a(e4Var, 14, str4);
            }
            String str5 = w4Var2.u;
            if (str5 != null) {
                b4.k.a(e4Var, 15, str5);
            }
            String str6 = w4Var2.v;
            if (str6 != null) {
                b4.k.a(e4Var, 16, str6);
            }
            a5.e.a().a(e4Var, 17, w4Var2.w);
            String str7 = w4Var2.x;
            if (str7 != null) {
                b4.k.a(e4Var, 22, str7);
            }
            Integer num3 = w4Var2.y;
            if (num3 != null) {
                b4.e.a(e4Var, 23, num3);
            }
            Long l4 = w4Var2.z;
            if (l4 != null) {
                b4.g.a(e4Var, 24, l4);
            }
            Long l5 = w4Var2.A;
            if (l5 != null) {
                b4.g.a(e4Var, 25, l5);
            }
            e4Var.a(w4Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(w4 w4Var) {
            w4 w4Var2 = w4Var;
            int iA = b4.g.a(3, w4Var2.e) + b4.k.a(2, w4Var2.d) + z4.f.a(1, w4Var2.c);
            Long l = w4Var2.f;
            int iA2 = iA + (l != null ? b4.g.a(19, l) : 0);
            String str = w4Var2.g;
            int iA3 = iA2 + (str != null ? b4.k.a(20, str) : 0);
            Long l2 = w4Var2.h;
            int iA4 = iA3 + (l2 != null ? b4.g.a(21, l2) : 0);
            Long l3 = w4Var2.i;
            int iA5 = iA4 + (l3 != null ? b4.g.a(4, l3) : 0);
            b5 b5Var = w4Var2.j;
            int iA6 = iA5 + (b5Var != null ? b5.u.a(5, b5Var) : 0);
            v4 v4Var = w4Var2.k;
            int iA7 = iA6 + (v4Var != null ? v4.g.a(6, v4Var) : 0);
            i5 i5Var = w4Var2.l;
            int iA8 = iA7 + (i5Var != null ? i5.C.a(7, i5Var) : 0);
            Integer num = w4Var2.m;
            int iA9 = iA8 + (num != null ? b4.e.a(8, num) : 0);
            Integer num2 = w4Var2.n;
            int iA10 = iA9 + (num2 != null ? b4.e.a(9, num2) : 0);
            y4 y4Var = w4Var2.o;
            int iA11 = iA10 + (y4Var != null ? y4.f.a(10, y4Var) : 0);
            e5 e5Var = w4Var2.p;
            int iA12 = iA11 + (e5Var != null ? e5.q.a(11, e5Var) : 0);
            String str2 = w4Var2.q;
            int iA13 = iA12 + (str2 != null ? b4.k.a(12, str2) : 0);
            String str3 = w4Var2.r;
            int iA14 = iA13 + (str3 != null ? b4.k.a(13, str3) : 0);
            d5 d5Var = w4Var2.s;
            int iA15 = iA14 + (d5Var != null ? d5.f.a(18, d5Var) : 0);
            String str4 = w4Var2.t;
            int iA16 = iA15 + (str4 != null ? b4.k.a(14, str4) : 0);
            String str5 = w4Var2.u;
            int iA17 = iA16 + (str5 != null ? b4.k.a(15, str5) : 0);
            String str6 = w4Var2.v;
            int iA18 = a5.e.a().a(17, w4Var2.w) + iA17 + (str6 != null ? b4.k.a(16, str6) : 0);
            String str7 = w4Var2.x;
            int iA19 = iA18 + (str7 != null ? b4.k.a(22, str7) : 0);
            Integer num3 = w4Var2.y;
            int iA20 = iA19 + (num3 != null ? b4.e.a(23, num3) : 0);
            Long l4 = w4Var2.z;
            int iA21 = iA20 + (l4 != null ? b4.g.a(24, l4) : 0);
            Long l5 = w4Var2.A;
            return w4Var2.a().b() + iA21 + (l5 != null ? b4.g.a(25, l5) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public w4 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD != -1) {
                    switch (iD) {
                        case 1:
                            try {
                                aVar.c = z4.f.a(d4Var);
                            } catch (b4.n e) {
                                aVar.a(iD, z3.VARINT, Long.valueOf(e.f1761a));
                            }
                            break;
                        case 2:
                            aVar.d = b4.k.a(d4Var);
                            break;
                        case 3:
                            aVar.e = b4.g.a(d4Var);
                            break;
                        case 4:
                            aVar.i = b4.g.a(d4Var);
                            break;
                        case 5:
                            aVar.j = b5.u.a(d4Var);
                            break;
                        case 6:
                            aVar.k = v4.g.a(d4Var);
                            break;
                        case 7:
                            aVar.l = i5.C.a(d4Var);
                            break;
                        case 8:
                            aVar.m = b4.e.a(d4Var);
                            break;
                        case 9:
                            aVar.n = b4.e.a(d4Var);
                            break;
                        case 10:
                            aVar.o = y4.f.a(d4Var);
                            break;
                        case 11:
                            aVar.p = e5.q.a(d4Var);
                            break;
                        case 12:
                            aVar.q = b4.k.a(d4Var);
                            break;
                        case 13:
                            aVar.r = b4.k.a(d4Var);
                            break;
                        case 14:
                            aVar.t = b4.k.a(d4Var);
                            break;
                        case 15:
                            aVar.u = b4.k.a(d4Var);
                            break;
                        case 16:
                            aVar.v = b4.k.a(d4Var);
                            break;
                        case 17:
                            aVar.w.add(a5.e.a(d4Var));
                            break;
                        case 18:
                            aVar.s = d5.f.a(d4Var);
                            break;
                        case 19:
                            aVar.f = b4.g.a(d4Var);
                            break;
                        case 20:
                            aVar.g = b4.k.a(d4Var);
                            break;
                        case 21:
                            aVar.h = b4.g.a(d4Var);
                            break;
                        case 22:
                            aVar.x = b4.k.a(d4Var);
                            break;
                        case 23:
                            aVar.y = b4.e.a(d4Var);
                            break;
                        case 24:
                            aVar.z = b4.g.a(d4Var);
                            break;
                        case 25:
                            aVar.A = b4.g.a(d4Var);
                            break;
                        default:
                            z3 z3Var = d4Var.h;
                            aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                            break;
                    }
                } else {
                    d4Var.a(jB);
                    return aVar.b();
                }
            }
        }
    }
}
