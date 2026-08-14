package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c5 extends a4<c5, a> {
    public static final b4<c5> f = new b();
    public final b5 c;
    public final v4 d;
    public final i5 e;

    public static final class a extends a4.a<c5, a> {
        public b5 c;
        public v4 d;
        public i5 e;

        public c5 b() {
            return new c5(this.c, this.d, this.e, super.a());
        }
    }

    public c5(b5 b5Var, v4 v4Var, i5 i5Var, x8 x8Var) {
        super(f, x8Var);
        this.c = b5Var;
        this.d = v4Var;
        this.e = i5Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return a().equals(c5Var.a()) && com.tapjoy.internal.a.b(this.c, c5Var.c) && com.tapjoy.internal.a.b(this.d, c5Var.d) && com.tapjoy.internal.a.b(this.e, c5Var.e);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = a().hashCode() * 37;
        b5 b5Var = this.c;
        int iHashCode2 = (iHashCode + (b5Var != null ? b5Var.hashCode() : 0)) * 37;
        v4 v4Var = this.d;
        int iHashCode3 = (iHashCode2 + (v4Var != null ? v4Var.hashCode() : 0)) * 37;
        i5 i5Var = this.e;
        int iHashCode4 = iHashCode3 + (i5Var != null ? i5Var.hashCode() : 0);
        this.b = iHashCode4;
        return iHashCode4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(", info=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", app=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", user=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "InfoSet{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<c5> {
        public b() {
            super(z3.LENGTH_DELIMITED, c5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, c5 c5Var) {
            c5 c5Var2 = c5Var;
            b5 b5Var = c5Var2.c;
            if (b5Var != null) {
                b5.u.a(e4Var, 1, b5Var);
            }
            v4 v4Var = c5Var2.d;
            if (v4Var != null) {
                v4.g.a(e4Var, 2, v4Var);
            }
            i5 i5Var = c5Var2.e;
            if (i5Var != null) {
                i5.C.a(e4Var, 3, i5Var);
            }
            e4Var.a(c5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(c5 c5Var) {
            c5 c5Var2 = c5Var;
            b5 b5Var = c5Var2.c;
            int iA = b5Var != null ? b5.u.a(1, b5Var) : 0;
            v4 v4Var = c5Var2.d;
            int iA2 = iA + (v4Var != null ? v4.g.a(2, v4Var) : 0);
            i5 i5Var = c5Var2.e;
            return c5Var2.a().b() + iA2 + (i5Var != null ? i5.C.a(3, i5Var) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public c5 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD == -1) {
                    d4Var.a(jB);
                    return aVar.b();
                }
                if (iD == 1) {
                    aVar.c = b5.u.a(d4Var);
                } else if (iD == 2) {
                    aVar.d = v4.g.a(d4Var);
                } else if (iD != 3) {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                } else {
                    aVar.e = i5.C.a(d4Var);
                }
            }
        }
    }
}
