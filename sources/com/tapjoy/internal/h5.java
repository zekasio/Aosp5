package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h5 extends a4<h5, a> {
    public static final b4<h5> d = new b();
    public final List<String> c;

    public static final class a extends a4.a<h5, a> {
        public List<String> c = com.tapjoy.internal.a.c();

        public h5 b() {
            return new h5(this.c, super.a());
        }
    }

    public h5(List<String> list, x8 x8Var) {
        super(d, x8Var);
        this.c = com.tapjoy.internal.a.a("elements", (List) list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return a().equals(h5Var.a()) && this.c.equals(h5Var.c);
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
            sb.append(", elements=");
            sb.append(this.c);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "StringList{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<h5> {
        public b() {
            super(z3.LENGTH_DELIMITED, h5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, h5 h5Var) {
            h5 h5Var2 = h5Var;
            b4.k.a().a(e4Var, 1, h5Var2.c);
            e4Var.a(h5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(h5 h5Var) {
            h5 h5Var2 = h5Var;
            return h5Var2.a().b() + b4.k.a().a(1, h5Var2.c);
        }

        @Override // com.tapjoy.internal.b4
        public h5 a(d4 d4Var) throws IOException {
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
                    aVar.c.add(b4.k.a(d4Var));
                }
            }
        }
    }
}
