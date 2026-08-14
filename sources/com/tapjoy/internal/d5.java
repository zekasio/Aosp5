package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class d5 extends a4<d5, a> {
    public static final b4<d5> f = new b();
    public final String c;
    public final String d;
    public final String e;

    public static final class a extends a4.a<d5, a> {
        public String c;
        public String d;
        public String e;

        public d5 b() {
            return new d5(this.c, this.d, this.e, super.a());
        }
    }

    public d5(String str, String str2, String str3) {
        super(f, x8.e);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return a().equals(d5Var.a()) && com.tapjoy.internal.a.b((Object) this.c, (Object) d5Var.c) && com.tapjoy.internal.a.b((Object) this.d, (Object) d5Var.d) && com.tapjoy.internal.a.b((Object) this.e, (Object) d5Var.e);
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
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.b = iHashCode4;
        return iHashCode4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(", fq7Change=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", fq30Change=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", pushId=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Meta{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<d5> {
        public b() {
            super(z3.LENGTH_DELIMITED, d5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, d5 d5Var) {
            d5 d5Var2 = d5Var;
            String str = d5Var2.c;
            if (str != null) {
                b4.k.a(e4Var, 1, str);
            }
            String str2 = d5Var2.d;
            if (str2 != null) {
                b4.k.a(e4Var, 2, str2);
            }
            String str3 = d5Var2.e;
            if (str3 != null) {
                b4.k.a(e4Var, 3, str3);
            }
            e4Var.a(d5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(d5 d5Var) {
            d5 d5Var2 = d5Var;
            String str = d5Var2.c;
            int iA = str != null ? b4.k.a(1, str) : 0;
            String str2 = d5Var2.d;
            int iA2 = iA + (str2 != null ? b4.k.a(2, str2) : 0);
            String str3 = d5Var2.e;
            return d5Var2.a().b() + iA2 + (str3 != null ? b4.k.a(3, str3) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public d5 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD == -1) {
                    d4Var.a(jB);
                    return aVar.b();
                }
                if (iD == 1) {
                    aVar.c = b4.k.a(d4Var);
                } else if (iD == 2) {
                    aVar.d = b4.k.a(d4Var);
                } else if (iD != 3) {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                } else {
                    aVar.e = b4.k.a(d4Var);
                }
            }
        }
    }

    public d5(String str, String str2, String str3, x8 x8Var) {
        super(f, x8Var);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
