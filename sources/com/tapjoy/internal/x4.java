package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x4 extends a4<x4, a> {
    public static final b4<x4> d = new b();
    public final List<w4> c;

    public static final class a extends a4.a<x4, a> {
        public List<w4> c = com.tapjoy.internal.a.c();

        public x4 b() {
            return new x4(this.c, super.a());
        }
    }

    public x4(List<w4> list, x8 x8Var) {
        super(d, x8Var);
        this.c = com.tapjoy.internal.a.a("events", (List) list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return a().equals(x4Var.a()) && this.c.equals(x4Var.c);
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
            sb.append(", events=");
            sb.append(this.c);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "EventBatch{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<x4> {
        public b() {
            super(z3.LENGTH_DELIMITED, x4.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, x4 x4Var) {
            x4 x4Var2 = x4Var;
            w4.B.a().a(e4Var, 1, x4Var2.c);
            e4Var.a(x4Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(x4 x4Var) {
            x4 x4Var2 = x4Var;
            return x4Var2.a().b() + w4.B.a().a(1, x4Var2.c);
        }

        @Override // com.tapjoy.internal.b4
        public x4 a(d4 d4Var) throws IOException {
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
                    aVar.c.add(w4.B.a(d4Var));
                }
            }
        }
    }
}
