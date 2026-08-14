package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 extends a4<v4, a> {
    public static final b4<v4> g = new b();
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;

    public static final class a extends a4.a<v4, a> {
        public String c;
        public Integer d;
        public String e;
        public String f;

        public v4 b() {
            return new v4(this.c, this.d, this.e, this.f, super.a());
        }
    }

    static {
        Integer.valueOf(0);
    }

    public v4(String str, Integer num, String str2, String str3, x8 x8Var) {
        super(g, x8Var);
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return a().equals(v4Var.a()) && com.tapjoy.internal.a.b((Object) this.c, (Object) v4Var.c) && com.tapjoy.internal.a.b(this.d, v4Var.d) && com.tapjoy.internal.a.b((Object) this.e, (Object) v4Var.e) && com.tapjoy.internal.a.b((Object) this.f, (Object) v4Var.f);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = a().hashCode() * 37;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.f;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.b = iHashCode5;
        return iHashCode5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(", pkgVer=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", pkgRev=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", installer=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", store=");
            sb.append(this.f);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "App{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<v4> {
        public b() {
            super(z3.LENGTH_DELIMITED, v4.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, v4 v4Var) {
            v4 v4Var2 = v4Var;
            String str = v4Var2.c;
            if (str != null) {
                b4.k.a(e4Var, 1, str);
            }
            Integer num = v4Var2.d;
            if (num != null) {
                b4.e.a(e4Var, 2, num);
            }
            String str2 = v4Var2.e;
            if (str2 != null) {
                b4.k.a(e4Var, 4, str2);
            }
            String str3 = v4Var2.f;
            if (str3 != null) {
                b4.k.a(e4Var, 5, str3);
            }
            e4Var.a(v4Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(v4 v4Var) {
            v4 v4Var2 = v4Var;
            String str = v4Var2.c;
            int iA = str != null ? b4.k.a(1, str) : 0;
            Integer num = v4Var2.d;
            int iA2 = iA + (num != null ? b4.e.a(2, num) : 0);
            String str2 = v4Var2.e;
            int iA3 = iA2 + (str2 != null ? b4.k.a(4, str2) : 0);
            String str3 = v4Var2.f;
            return v4Var2.a().b() + iA3 + (str3 != null ? b4.k.a(5, str3) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public v4 a(d4 d4Var) throws IOException {
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
                    aVar.d = b4.e.a(d4Var);
                } else if (iD == 3) {
                    b4.k.a(d4Var);
                } else if (iD == 4) {
                    aVar.e = b4.k.a(d4Var);
                } else if (iD == 5) {
                    aVar.f = b4.k.a(d4Var);
                } else {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                }
            }
        }
    }
}
