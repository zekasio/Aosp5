package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class e5 extends a4<e5, a> {
    public static final b4<e5> q = new b();
    public final String c;
    public final Integer d;
    public final Double e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Long l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public static final class a extends a4.a<e5, a> {
        public String c;
        public Integer d;
        public Double e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public Integer k;
        public Long l;
        public String m;
        public String n;
        public String o;
        public String p;

        public e5 b() {
            String str = this.c;
            if (str != null) {
                return new e5(str, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, super.a());
            }
            com.tapjoy.internal.a.a(str, "productId");
            throw null;
        }
    }

    static {
        Integer.valueOf(1);
        Double.valueOf(0.0d);
        Integer.valueOf(0);
        Long.valueOf(0L);
    }

    public e5(String str, Integer num, Double d, String str2, String str3, String str4, String str5, String str6, Integer num2, Long l, String str7, String str8, String str9, String str10, x8 x8Var) {
        super(q, x8Var);
        this.c = str;
        this.d = num;
        this.e = d;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = num2;
        this.l = l;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return a().equals(e5Var.a()) && this.c.equals(e5Var.c) && com.tapjoy.internal.a.b(this.d, e5Var.d) && com.tapjoy.internal.a.b(this.e, e5Var.e) && com.tapjoy.internal.a.b((Object) this.f, (Object) e5Var.f) && com.tapjoy.internal.a.b((Object) this.g, (Object) e5Var.g) && com.tapjoy.internal.a.b((Object) this.h, (Object) e5Var.h) && com.tapjoy.internal.a.b((Object) this.i, (Object) e5Var.i) && com.tapjoy.internal.a.b((Object) this.j, (Object) e5Var.j) && com.tapjoy.internal.a.b(this.k, e5Var.k) && com.tapjoy.internal.a.b(this.l, e5Var.l) && com.tapjoy.internal.a.b((Object) this.m, (Object) e5Var.m) && com.tapjoy.internal.a.b((Object) this.n, (Object) e5Var.n) && com.tapjoy.internal.a.b((Object) this.o, (Object) e5Var.o) && com.tapjoy.internal.a.b((Object) this.p, (Object) e5Var.p);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.c.hashCode() + (a().hashCode() * 37)) * 37;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Double d = this.e;
        int iHashCode3 = (iHashCode2 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.h;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.i;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.j;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.k;
        int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.l;
        int iHashCode10 = (iHashCode9 + (l != null ? l.hashCode() : 0)) * 37;
        String str6 = this.m;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.n;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.o;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.p;
        int iHashCode14 = iHashCode13 + (str9 != null ? str9.hashCode() : 0);
        this.b = iHashCode14;
        return iHashCode14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", productId=");
        sb.append(this.c);
        if (this.d != null) {
            sb.append(", productQuantity=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", productPrice=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", productPriceCurrency=");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(", productType=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", productTitle=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", productDescription=");
            sb.append(this.i);
        }
        if (this.j != null) {
            sb.append(", transactionId=");
            sb.append(this.j);
        }
        if (this.k != null) {
            sb.append(", transactionState=");
            sb.append(this.k);
        }
        if (this.l != null) {
            sb.append(", transactionDate=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(", campaignId=");
            sb.append(this.m);
        }
        if (this.n != null) {
            sb.append(", currencyPrice=");
            sb.append(this.n);
        }
        if (this.o != null) {
            sb.append(", receipt=");
            sb.append(this.o);
        }
        if (this.p != null) {
            sb.append(", signature=");
            sb.append(this.p);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Purchase{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<e5> {
        public b() {
            super(z3.LENGTH_DELIMITED, e5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, e5 e5Var) {
            e5 e5Var2 = e5Var;
            b4.k.a(e4Var, 1, e5Var2.c);
            Integer num = e5Var2.d;
            if (num != null) {
                b4.e.a(e4Var, 2, num);
            }
            Double d = e5Var2.e;
            if (d != null) {
                b4.j.a(e4Var, 3, d);
            }
            String str = e5Var2.f;
            if (str != null) {
                b4.k.a(e4Var, 4, str);
            }
            String str2 = e5Var2.g;
            if (str2 != null) {
                b4.k.a(e4Var, 5, str2);
            }
            String str3 = e5Var2.h;
            if (str3 != null) {
                b4.k.a(e4Var, 6, str3);
            }
            String str4 = e5Var2.i;
            if (str4 != null) {
                b4.k.a(e4Var, 7, str4);
            }
            String str5 = e5Var2.j;
            if (str5 != null) {
                b4.k.a(e4Var, 8, str5);
            }
            Integer num2 = e5Var2.k;
            if (num2 != null) {
                b4.e.a(e4Var, 9, num2);
            }
            Long l = e5Var2.l;
            if (l != null) {
                b4.g.a(e4Var, 10, l);
            }
            String str6 = e5Var2.m;
            if (str6 != null) {
                b4.k.a(e4Var, 11, str6);
            }
            String str7 = e5Var2.n;
            if (str7 != null) {
                b4.k.a(e4Var, 12, str7);
            }
            String str8 = e5Var2.o;
            if (str8 != null) {
                b4.k.a(e4Var, 13, str8);
            }
            String str9 = e5Var2.p;
            if (str9 != null) {
                b4.k.a(e4Var, 14, str9);
            }
            e4Var.a(e5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(e5 e5Var) {
            e5 e5Var2 = e5Var;
            int iA = b4.k.a(1, e5Var2.c);
            Integer num = e5Var2.d;
            int iA2 = iA + (num != null ? b4.e.a(2, num) : 0);
            Double d = e5Var2.e;
            int iA3 = iA2 + (d != null ? b4.j.a(3, d) : 0);
            String str = e5Var2.f;
            int iA4 = iA3 + (str != null ? b4.k.a(4, str) : 0);
            String str2 = e5Var2.g;
            int iA5 = iA4 + (str2 != null ? b4.k.a(5, str2) : 0);
            String str3 = e5Var2.h;
            int iA6 = iA5 + (str3 != null ? b4.k.a(6, str3) : 0);
            String str4 = e5Var2.i;
            int iA7 = iA6 + (str4 != null ? b4.k.a(7, str4) : 0);
            String str5 = e5Var2.j;
            int iA8 = iA7 + (str5 != null ? b4.k.a(8, str5) : 0);
            Integer num2 = e5Var2.k;
            int iA9 = iA8 + (num2 != null ? b4.e.a(9, num2) : 0);
            Long l = e5Var2.l;
            int iA10 = iA9 + (l != null ? b4.g.a(10, l) : 0);
            String str6 = e5Var2.m;
            int iA11 = iA10 + (str6 != null ? b4.k.a(11, str6) : 0);
            String str7 = e5Var2.n;
            int iA12 = iA11 + (str7 != null ? b4.k.a(12, str7) : 0);
            String str8 = e5Var2.o;
            int iA13 = iA12 + (str8 != null ? b4.k.a(13, str8) : 0);
            String str9 = e5Var2.p;
            return e5Var2.a().b() + iA13 + (str9 != null ? b4.k.a(14, str9) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public e5 a(d4 d4Var) throws IOException {
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
                            aVar.d = b4.e.a(d4Var);
                            break;
                        case 3:
                            aVar.e = b4.j.a(d4Var);
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
                            aVar.i = b4.k.a(d4Var);
                            break;
                        case 8:
                            aVar.j = b4.k.a(d4Var);
                            break;
                        case 9:
                            aVar.k = b4.e.a(d4Var);
                            break;
                        case 10:
                            aVar.l = b4.g.a(d4Var);
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
