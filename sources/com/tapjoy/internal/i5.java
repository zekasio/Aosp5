package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i5 extends a4<i5, a> {
    public static final b4<i5> C = new b();
    public static final Boolean D;
    public final List<String> A;
    public final Boolean B;
    public final Long c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final List<f5> g;
    public final Integer h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final String l;
    public final Integer m;
    public final Double n;
    public final Long o;
    public final Double p;
    public final String q;
    public final Boolean r;
    public final String s;
    public final Integer t;
    public final Integer u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public static final class a extends a4.a<i5, a> {
        public Boolean B;
        public Long c;
        public String d;
        public Integer e;
        public Integer f;
        public Integer h;
        public Long i;
        public Long j;
        public Long k;
        public String l;
        public Integer m;
        public Double n;
        public Long o;
        public Double p;
        public String q;
        public Boolean r;
        public String s;
        public Integer t;
        public Integer u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;
        public List<f5> g = com.tapjoy.internal.a.c();
        public List<String> A = com.tapjoy.internal.a.c();

        public i5 b() {
            return new i5(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, super.a());
        }
    }

    static {
        Long.valueOf(0L);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Integer.valueOf(0);
        Long.valueOf(0L);
        Long.valueOf(0L);
        Long.valueOf(0L);
        Integer.valueOf(0);
        Double.valueOf(0.0d);
        Long.valueOf(0L);
        Double.valueOf(0.0d);
        Boolean.valueOf(false);
        Integer.valueOf(0);
        Integer.valueOf(0);
        D = false;
    }

    public i5(Long l, String str, Integer num, Integer num2, List<f5> list, Integer num3, Long l2, Long l3, Long l4, String str2, Integer num4, Double d, Long l5, Double d2, String str3, Boolean bool, String str4, Integer num5, Integer num6, String str5, String str6, String str7, String str8, String str9, List<String> list2, Boolean bool2, x8 x8Var) {
        super(C, x8Var);
        this.c = l;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = com.tapjoy.internal.a.a("pushes", (List) list);
        this.h = num3;
        this.i = l2;
        this.j = l3;
        this.k = l4;
        this.l = str2;
        this.m = num4;
        this.n = d;
        this.o = l5;
        this.p = d2;
        this.q = str3;
        this.r = bool;
        this.s = str4;
        this.t = num5;
        this.u = num6;
        this.v = str5;
        this.w = str6;
        this.x = str7;
        this.y = str8;
        this.z = str9;
        this.A = com.tapjoy.internal.a.a("tags", (List) list2);
        this.B = bool2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return a().equals(i5Var.a()) && com.tapjoy.internal.a.b(this.c, i5Var.c) && com.tapjoy.internal.a.b((Object) this.d, (Object) i5Var.d) && com.tapjoy.internal.a.b(this.e, i5Var.e) && com.tapjoy.internal.a.b(this.f, i5Var.f) && this.g.equals(i5Var.g) && com.tapjoy.internal.a.b(this.h, i5Var.h) && com.tapjoy.internal.a.b(this.i, i5Var.i) && com.tapjoy.internal.a.b(this.j, i5Var.j) && com.tapjoy.internal.a.b(this.k, i5Var.k) && com.tapjoy.internal.a.b((Object) this.l, (Object) i5Var.l) && com.tapjoy.internal.a.b(this.m, i5Var.m) && com.tapjoy.internal.a.b(this.n, i5Var.n) && com.tapjoy.internal.a.b(this.o, i5Var.o) && com.tapjoy.internal.a.b(this.p, i5Var.p) && com.tapjoy.internal.a.b((Object) this.q, (Object) i5Var.q) && com.tapjoy.internal.a.b(this.r, i5Var.r) && com.tapjoy.internal.a.b((Object) this.s, (Object) i5Var.s) && com.tapjoy.internal.a.b(this.t, i5Var.t) && com.tapjoy.internal.a.b(this.u, i5Var.u) && com.tapjoy.internal.a.b((Object) this.v, (Object) i5Var.v) && com.tapjoy.internal.a.b((Object) this.w, (Object) i5Var.w) && com.tapjoy.internal.a.b((Object) this.x, (Object) i5Var.x) && com.tapjoy.internal.a.b((Object) this.y, (Object) i5Var.y) && com.tapjoy.internal.a.b((Object) this.z, (Object) i5Var.z) && this.A.equals(i5Var.A) && com.tapjoy.internal.a.b(this.B, i5Var.B);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = a().hashCode() * 37;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.f;
        int iHashCode5 = (this.g.hashCode() + ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37)) * 37;
        Integer num3 = this.h;
        int iHashCode6 = (iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l2 = this.i;
        int iHashCode7 = (iHashCode6 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.j;
        int iHashCode8 = (iHashCode7 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.k;
        int iHashCode9 = (iHashCode8 + (l4 != null ? l4.hashCode() : 0)) * 37;
        String str2 = this.l;
        int iHashCode10 = (iHashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num4 = this.m;
        int iHashCode11 = (iHashCode10 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Double d = this.n;
        int iHashCode12 = (iHashCode11 + (d != null ? d.hashCode() : 0)) * 37;
        Long l5 = this.o;
        int iHashCode13 = (iHashCode12 + (l5 != null ? l5.hashCode() : 0)) * 37;
        Double d2 = this.p;
        int iHashCode14 = (iHashCode13 + (d2 != null ? d2.hashCode() : 0)) * 37;
        String str3 = this.q;
        int iHashCode15 = (iHashCode14 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.r;
        int iHashCode16 = (iHashCode15 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str4 = this.s;
        int iHashCode17 = (iHashCode16 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num5 = this.t;
        int iHashCode18 = (iHashCode17 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Integer num6 = this.u;
        int iHashCode19 = (iHashCode18 + (num6 != null ? num6.hashCode() : 0)) * 37;
        String str5 = this.v;
        int iHashCode20 = (iHashCode19 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.w;
        int iHashCode21 = (iHashCode20 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.x;
        int iHashCode22 = (iHashCode21 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.y;
        int iHashCode23 = (iHashCode22 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.z;
        int iHashCode24 = (this.A.hashCode() + ((iHashCode23 + (str9 != null ? str9.hashCode() : 0)) * 37)) * 37;
        Boolean bool2 = this.B;
        int iHashCode25 = iHashCode24 + (bool2 != null ? bool2.hashCode() : 0);
        this.b = iHashCode25;
        return iHashCode25;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(", installed=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", referrer=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", fq7=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", fq30=");
            sb.append(this.f);
        }
        if (!this.g.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", sessionTotalCount=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", sessionTotalDuration=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", sessionLastTime=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", sessionLastDuration=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", purchaseCurrency=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", purchaseTotalCount=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", purchaseTotalPrice=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", purchaseLastTime=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", purchaseLastPrice=");
            sb.append(this.p);
        }
        if (this.q != null) {
            sb.append(", idfa=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", idfaOptout=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", userId=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", userLevel=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", friendCount=");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(", uv1=");
            sb.append(this.v);
        }
        if (this.w != null) {
            sb.append(", uv2=");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append(", uv3=");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append(", uv4=");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append(", uv5=");
            sb.append(this.z);
        }
        if (!this.A.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.A);
        }
        if (this.B != null) {
            sb.append(", pushOptout=");
            sb.append(this.B);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "User{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<i5> {
        public b() {
            super(z3.LENGTH_DELIMITED, i5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, i5 i5Var) {
            i5 i5Var2 = i5Var;
            Long l = i5Var2.c;
            if (l != null) {
                b4.g.a(e4Var, 1, l);
            }
            String str = i5Var2.d;
            if (str != null) {
                b4.k.a(e4Var, 2, str);
            }
            Integer num = i5Var2.e;
            if (num != null) {
                b4.e.a(e4Var, 13, num);
            }
            Integer num2 = i5Var2.f;
            if (num2 != null) {
                b4.e.a(e4Var, 14, num2);
            }
            f5.f.a().a(e4Var, 15, i5Var2.g);
            Integer num3 = i5Var2.h;
            if (num3 != null) {
                b4.e.a(e4Var, 16, num3);
            }
            Long l2 = i5Var2.i;
            if (l2 != null) {
                b4.g.a(e4Var, 17, l2);
            }
            Long l3 = i5Var2.j;
            if (l3 != null) {
                b4.g.a(e4Var, 18, l3);
            }
            Long l4 = i5Var2.k;
            if (l4 != null) {
                b4.g.a(e4Var, 19, l4);
            }
            String str2 = i5Var2.l;
            if (str2 != null) {
                b4.k.a(e4Var, 20, str2);
            }
            Integer num4 = i5Var2.m;
            if (num4 != null) {
                b4.e.a(e4Var, 3, num4);
            }
            Double d = i5Var2.n;
            if (d != null) {
                b4.j.a(e4Var, 21, d);
            }
            Long l5 = i5Var2.o;
            if (l5 != null) {
                b4.g.a(e4Var, 4, l5);
            }
            Double d2 = i5Var2.p;
            if (d2 != null) {
                b4.j.a(e4Var, 22, d2);
            }
            String str3 = i5Var2.q;
            if (str3 != null) {
                b4.k.a(e4Var, 23, str3);
            }
            Boolean bool = i5Var2.r;
            if (bool != null) {
                b4.d.a(e4Var, 24, bool);
            }
            String str4 = i5Var2.s;
            if (str4 != null) {
                b4.k.a(e4Var, 5, str4);
            }
            Integer num5 = i5Var2.t;
            if (num5 != null) {
                b4.e.a(e4Var, 6, num5);
            }
            Integer num6 = i5Var2.u;
            if (num6 != null) {
                b4.e.a(e4Var, 7, num6);
            }
            String str5 = i5Var2.v;
            if (str5 != null) {
                b4.k.a(e4Var, 8, str5);
            }
            String str6 = i5Var2.w;
            if (str6 != null) {
                b4.k.a(e4Var, 9, str6);
            }
            String str7 = i5Var2.x;
            if (str7 != null) {
                b4.k.a(e4Var, 10, str7);
            }
            String str8 = i5Var2.y;
            if (str8 != null) {
                b4.k.a(e4Var, 11, str8);
            }
            String str9 = i5Var2.z;
            if (str9 != null) {
                b4.k.a(e4Var, 12, str9);
            }
            b4.k.a().a(e4Var, 26, i5Var2.A);
            Boolean bool2 = i5Var2.B;
            if (bool2 != null) {
                b4.d.a(e4Var, 25, bool2);
            }
            e4Var.a(i5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(i5 i5Var) {
            i5 i5Var2 = i5Var;
            Long l = i5Var2.c;
            int iA = l != null ? b4.g.a(1, l) : 0;
            String str = i5Var2.d;
            int iA2 = iA + (str != null ? b4.k.a(2, str) : 0);
            Integer num = i5Var2.e;
            int iA3 = iA2 + (num != null ? b4.e.a(13, num) : 0);
            Integer num2 = i5Var2.f;
            int iA4 = f5.f.a().a(15, i5Var2.g) + iA3 + (num2 != null ? b4.e.a(14, num2) : 0);
            Integer num3 = i5Var2.h;
            int iA5 = iA4 + (num3 != null ? b4.e.a(16, num3) : 0);
            Long l2 = i5Var2.i;
            int iA6 = iA5 + (l2 != null ? b4.g.a(17, l2) : 0);
            Long l3 = i5Var2.j;
            int iA7 = iA6 + (l3 != null ? b4.g.a(18, l3) : 0);
            Long l4 = i5Var2.k;
            int iA8 = iA7 + (l4 != null ? b4.g.a(19, l4) : 0);
            String str2 = i5Var2.l;
            int iA9 = iA8 + (str2 != null ? b4.k.a(20, str2) : 0);
            Integer num4 = i5Var2.m;
            int iA10 = iA9 + (num4 != null ? b4.e.a(3, num4) : 0);
            Double d = i5Var2.n;
            int iA11 = iA10 + (d != null ? b4.j.a(21, d) : 0);
            Long l5 = i5Var2.o;
            int iA12 = iA11 + (l5 != null ? b4.g.a(4, l5) : 0);
            Double d2 = i5Var2.p;
            int iA13 = iA12 + (d2 != null ? b4.j.a(22, d2) : 0);
            String str3 = i5Var2.q;
            int iA14 = iA13 + (str3 != null ? b4.k.a(23, str3) : 0);
            Boolean bool = i5Var2.r;
            int iA15 = iA14 + (bool != null ? b4.d.a(24, bool) : 0);
            String str4 = i5Var2.s;
            int iA16 = iA15 + (str4 != null ? b4.k.a(5, str4) : 0);
            Integer num5 = i5Var2.t;
            int iA17 = iA16 + (num5 != null ? b4.e.a(6, num5) : 0);
            Integer num6 = i5Var2.u;
            int iA18 = iA17 + (num6 != null ? b4.e.a(7, num6) : 0);
            String str5 = i5Var2.v;
            int iA19 = iA18 + (str5 != null ? b4.k.a(8, str5) : 0);
            String str6 = i5Var2.w;
            int iA20 = iA19 + (str6 != null ? b4.k.a(9, str6) : 0);
            String str7 = i5Var2.x;
            int iA21 = iA20 + (str7 != null ? b4.k.a(10, str7) : 0);
            String str8 = i5Var2.y;
            int iA22 = iA21 + (str8 != null ? b4.k.a(11, str8) : 0);
            String str9 = i5Var2.z;
            int iA23 = b4.k.a().a(26, i5Var2.A) + iA22 + (str9 != null ? b4.k.a(12, str9) : 0);
            Boolean bool2 = i5Var2.B;
            return i5Var2.a().b() + iA23 + (bool2 != null ? b4.d.a(25, bool2) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public i5 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD != -1) {
                    switch (iD) {
                        case 1:
                            aVar.c = b4.g.a(d4Var);
                            break;
                        case 2:
                            aVar.d = b4.k.a(d4Var);
                            break;
                        case 3:
                            aVar.m = b4.e.a(d4Var);
                            break;
                        case 4:
                            aVar.o = b4.g.a(d4Var);
                            break;
                        case 5:
                            aVar.s = b4.k.a(d4Var);
                            break;
                        case 6:
                            aVar.t = b4.e.a(d4Var);
                            break;
                        case 7:
                            aVar.u = b4.e.a(d4Var);
                            break;
                        case 8:
                            aVar.v = b4.k.a(d4Var);
                            break;
                        case 9:
                            aVar.w = b4.k.a(d4Var);
                            break;
                        case 10:
                            aVar.x = b4.k.a(d4Var);
                            break;
                        case 11:
                            aVar.y = b4.k.a(d4Var);
                            break;
                        case 12:
                            aVar.z = b4.k.a(d4Var);
                            break;
                        case 13:
                            aVar.e = b4.e.a(d4Var);
                            break;
                        case 14:
                            aVar.f = b4.e.a(d4Var);
                            break;
                        case 15:
                            aVar.g.add(f5.f.a(d4Var));
                            break;
                        case 16:
                            aVar.h = b4.e.a(d4Var);
                            break;
                        case 17:
                            aVar.i = b4.g.a(d4Var);
                            break;
                        case 18:
                            aVar.j = b4.g.a(d4Var);
                            break;
                        case 19:
                            aVar.k = b4.g.a(d4Var);
                            break;
                        case 20:
                            aVar.l = b4.k.a(d4Var);
                            break;
                        case 21:
                            aVar.n = b4.j.a(d4Var);
                            break;
                        case 22:
                            aVar.p = b4.j.a(d4Var);
                            break;
                        case 23:
                            aVar.q = b4.k.a(d4Var);
                            break;
                        case 24:
                            aVar.r = b4.d.a(d4Var);
                            break;
                        case 25:
                            aVar.B = b4.d.a(d4Var);
                            break;
                        case 26:
                            aVar.A.add(b4.k.a(d4Var));
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
