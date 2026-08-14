package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 extends a4<b5, a> {
    public static final b4<b5> u = new b();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    public static final class a extends a4.a<b5, a> {
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public Integer i;
        public Integer j;
        public Integer k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;

        public b5 b() {
            return new b5(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, super.a());
        }
    }

    static {
        Integer.valueOf(0);
        Integer.valueOf(0);
        Integer.valueOf(0);
    }

    public b5(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, x8 x8Var) {
        super(u, x8Var);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = num;
        this.j = num2;
        this.k = num3;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
        this.r = str13;
        this.s = str14;
        this.t = str15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return a().equals(b5Var.a()) && com.tapjoy.internal.a.b((Object) this.c, (Object) b5Var.c) && com.tapjoy.internal.a.b((Object) this.d, (Object) b5Var.d) && com.tapjoy.internal.a.b((Object) this.e, (Object) b5Var.e) && com.tapjoy.internal.a.b((Object) this.f, (Object) b5Var.f) && com.tapjoy.internal.a.b((Object) this.g, (Object) b5Var.g) && com.tapjoy.internal.a.b((Object) this.h, (Object) b5Var.h) && com.tapjoy.internal.a.b(this.i, b5Var.i) && com.tapjoy.internal.a.b(this.j, b5Var.j) && com.tapjoy.internal.a.b(this.k, b5Var.k) && com.tapjoy.internal.a.b((Object) this.l, (Object) b5Var.l) && com.tapjoy.internal.a.b((Object) this.m, (Object) b5Var.m) && com.tapjoy.internal.a.b((Object) this.n, (Object) b5Var.n) && com.tapjoy.internal.a.b((Object) this.o, (Object) b5Var.o) && com.tapjoy.internal.a.b((Object) this.p, (Object) b5Var.p) && com.tapjoy.internal.a.b((Object) this.q, (Object) b5Var.q) && com.tapjoy.internal.a.b((Object) this.r, (Object) b5Var.r) && com.tapjoy.internal.a.b((Object) this.s, (Object) b5Var.s) && com.tapjoy.internal.a.b((Object) this.t, (Object) b5Var.t);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = a().hashCode() * 37;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.h;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.i;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.j;
        int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.k;
        int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str7 = this.l;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.m;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.n;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.o;
        int iHashCode14 = (iHashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.p;
        int iHashCode15 = (iHashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.q;
        int iHashCode16 = (iHashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.r;
        int iHashCode17 = (iHashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.s;
        int iHashCode18 = (iHashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.t;
        int iHashCode19 = iHashCode18 + (str15 != null ? str15.hashCode() : 0);
        this.b = iHashCode19;
        return iHashCode19;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(", mac=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", deviceId=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", deviceMaker=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", deviceModel=");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(", osName=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", osVer=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", displayD=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", displayW=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", displayH=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", locale=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", timezone=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", pkgId=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", pkgSign=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", sdk=");
            sb.append(this.p);
        }
        if (this.q != null) {
            sb.append(", countrySim=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", countryNet=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", imei=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", androidId=");
            sb.append(this.t);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Info{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<b5> {
        public b() {
            super(z3.LENGTH_DELIMITED, b5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, b5 b5Var) {
            b5 b5Var2 = b5Var;
            String str = b5Var2.c;
            if (str != null) {
                b4.k.a(e4Var, 1, str);
            }
            String str2 = b5Var2.d;
            if (str2 != null) {
                b4.k.a(e4Var, 2, str2);
            }
            String str3 = b5Var2.e;
            if (str3 != null) {
                b4.k.a(e4Var, 3, str3);
            }
            String str4 = b5Var2.f;
            if (str4 != null) {
                b4.k.a(e4Var, 4, str4);
            }
            String str5 = b5Var2.g;
            if (str5 != null) {
                b4.k.a(e4Var, 5, str5);
            }
            String str6 = b5Var2.h;
            if (str6 != null) {
                b4.k.a(e4Var, 6, str6);
            }
            Integer num = b5Var2.i;
            if (num != null) {
                b4.e.a(e4Var, 7, num);
            }
            Integer num2 = b5Var2.j;
            if (num2 != null) {
                b4.e.a(e4Var, 8, num2);
            }
            Integer num3 = b5Var2.k;
            if (num3 != null) {
                b4.e.a(e4Var, 9, num3);
            }
            String str7 = b5Var2.l;
            if (str7 != null) {
                b4.k.a(e4Var, 10, str7);
            }
            String str8 = b5Var2.m;
            if (str8 != null) {
                b4.k.a(e4Var, 11, str8);
            }
            String str9 = b5Var2.n;
            if (str9 != null) {
                b4.k.a(e4Var, 12, str9);
            }
            String str10 = b5Var2.o;
            if (str10 != null) {
                b4.k.a(e4Var, 13, str10);
            }
            String str11 = b5Var2.p;
            if (str11 != null) {
                b4.k.a(e4Var, 14, str11);
            }
            String str12 = b5Var2.q;
            if (str12 != null) {
                b4.k.a(e4Var, 15, str12);
            }
            String str13 = b5Var2.r;
            if (str13 != null) {
                b4.k.a(e4Var, 16, str13);
            }
            String str14 = b5Var2.s;
            if (str14 != null) {
                b4.k.a(e4Var, 17, str14);
            }
            String str15 = b5Var2.t;
            if (str15 != null) {
                b4.k.a(e4Var, 18, str15);
            }
            e4Var.a(b5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(b5 b5Var) {
            b5 b5Var2 = b5Var;
            String str = b5Var2.c;
            int iA = str != null ? b4.k.a(1, str) : 0;
            String str2 = b5Var2.d;
            int iA2 = iA + (str2 != null ? b4.k.a(2, str2) : 0);
            String str3 = b5Var2.e;
            int iA3 = iA2 + (str3 != null ? b4.k.a(3, str3) : 0);
            String str4 = b5Var2.f;
            int iA4 = iA3 + (str4 != null ? b4.k.a(4, str4) : 0);
            String str5 = b5Var2.g;
            int iA5 = iA4 + (str5 != null ? b4.k.a(5, str5) : 0);
            String str6 = b5Var2.h;
            int iA6 = iA5 + (str6 != null ? b4.k.a(6, str6) : 0);
            Integer num = b5Var2.i;
            int iA7 = iA6 + (num != null ? b4.e.a(7, num) : 0);
            Integer num2 = b5Var2.j;
            int iA8 = iA7 + (num2 != null ? b4.e.a(8, num2) : 0);
            Integer num3 = b5Var2.k;
            int iA9 = iA8 + (num3 != null ? b4.e.a(9, num3) : 0);
            String str7 = b5Var2.l;
            int iA10 = iA9 + (str7 != null ? b4.k.a(10, str7) : 0);
            String str8 = b5Var2.m;
            int iA11 = iA10 + (str8 != null ? b4.k.a(11, str8) : 0);
            String str9 = b5Var2.n;
            int iA12 = iA11 + (str9 != null ? b4.k.a(12, str9) : 0);
            String str10 = b5Var2.o;
            int iA13 = iA12 + (str10 != null ? b4.k.a(13, str10) : 0);
            String str11 = b5Var2.p;
            int iA14 = iA13 + (str11 != null ? b4.k.a(14, str11) : 0);
            String str12 = b5Var2.q;
            int iA15 = iA14 + (str12 != null ? b4.k.a(15, str12) : 0);
            String str13 = b5Var2.r;
            int iA16 = iA15 + (str13 != null ? b4.k.a(16, str13) : 0);
            String str14 = b5Var2.s;
            int iA17 = iA16 + (str14 != null ? b4.k.a(17, str14) : 0);
            String str15 = b5Var2.t;
            return b5Var2.a().b() + iA17 + (str15 != null ? b4.k.a(18, str15) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public b5 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD != -1) {
                    switch (iD) {
                        case 1:
                            aVar.c = b4.k.a(d4Var);
                            break;
                        case 2:
                            aVar.d = b4.k.a(d4Var);
                            break;
                        case 3:
                            aVar.e = b4.k.a(d4Var);
                            break;
                        case 4:
                            aVar.f = b4.k.a(d4Var);
                            break;
                        case 5:
                            aVar.g = b4.k.a(d4Var);
                            break;
                        case 6:
                            aVar.h = b4.k.a(d4Var);
                            break;
                        case 7:
                            aVar.i = b4.e.a(d4Var);
                            break;
                        case 8:
                            aVar.j = b4.e.a(d4Var);
                            break;
                        case 9:
                            aVar.k = b4.e.a(d4Var);
                            break;
                        case 10:
                            aVar.l = b4.k.a(d4Var);
                            break;
                        case 11:
                            aVar.m = b4.k.a(d4Var);
                            break;
                        case 12:
                            aVar.n = b4.k.a(d4Var);
                            break;
                        case 13:
                            aVar.o = b4.k.a(d4Var);
                            break;
                        case 14:
                            aVar.p = b4.k.a(d4Var);
                            break;
                        case 15:
                            aVar.q = b4.k.a(d4Var);
                            break;
                        case 16:
                            aVar.r = b4.k.a(d4Var);
                            break;
                        case 17:
                            aVar.s = b4.k.a(d4Var);
                            break;
                        case 18:
                            aVar.t = b4.k.a(d4Var);
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
