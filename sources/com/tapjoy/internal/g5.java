package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g5 extends a4<g5, a> {
    public static final b4<g5> d = new b();
    public final List<f5> c;

    public static final class a extends a4.a<g5, a> {
        public List<f5> c = com.tapjoy.internal.a.c();

        public g5 b() {
            return new g5(this.c, super.a());
        }
    }

    public g5(List<f5> list, x8 x8Var) {
        super(d, x8Var);
        this.c = com.tapjoy.internal.a.a("pushes", (List) list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return a().equals(g5Var.a()) && this.c.equals(g5Var.c);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = (a().hashCode() * 37) + this.c.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.c.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.c);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "PushList{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<g5> {
        public b() {
            super(z3.LENGTH_DELIMITED, g5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, g5 g5Var) {
            g5 g5Var2 = g5Var;
            f5.f.a().a(e4Var, 1, g5Var2.c);
            e4Var.a(g5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(g5 g5Var) {
            g5 g5Var2 = g5Var;
            return g5Var2.a().b() + f5.f.a().a(1, g5Var2.c);
        }

        @Override // com.tapjoy.internal.b4
        public g5 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD == -1) {
                    d4Var.a(jB);
                    return aVar.b();
                }
                if (iD != 1) {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                } else {
                    aVar.c.add(f5.f.a(d4Var));
                }
            }
        }
    }
}
