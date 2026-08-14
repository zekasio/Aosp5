package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class f5 extends a4<f5, a> {
    public static final b4<f5> f = new b();
    public final String c;
    public final Long d;
    public final Long e;

    public static final class a extends a4.a<f5, a> {
        public String c;
        public Long d;
        public Long e;

        public f5 b() {
            Long l;
            String str = this.c;
            if (str != null && (l = this.d) != null) {
                return new f5(str, l, this.e, super.a());
            }
            com.tapjoy.internal.a.a(str, "id", this.d, "received");
            throw null;
        }
    }

    static {
        Long.valueOf(0L);
        Long.valueOf(0L);
    }

    public f5(String str, Long l, Long l2, x8 x8Var) {
        super(f, x8Var);
        this.c = str;
        this.d = l;
        this.e = l2;
    }

    public a b() {
        a aVar = new a();
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        x8 x8VarA = a();
        if (x8VarA.b() > 0) {
            if (aVar.b == null) {
                aVar.f1746a = new u8();
                aVar.b = new e4(aVar.f1746a);
            }
            try {
                aVar.b.f1788a.a(x8VarA);
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return a().equals(f5Var.a()) && this.c.equals(f5Var.c) && this.d.equals(f5Var.d) && com.tapjoy.internal.a.b(this.e, f5Var.e);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (a().hashCode() * 37)) * 37)) * 37;
        Long l = this.e;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.b = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", received=");
        sb.append(this.d);
        if (this.e != null) {
            sb.append(", clicked=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Push{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<f5> {
        public b() {
            super(z3.LENGTH_DELIMITED, f5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, f5 f5Var) {
            f5 f5Var2 = f5Var;
            b4.k.a(e4Var, 1, f5Var2.c);
            b4.g.a(e4Var, 2, f5Var2.d);
            Long l = f5Var2.e;
            if (l != null) {
                b4.g.a(e4Var, 3, l);
            }
            e4Var.a(f5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(f5 f5Var) {
            f5 f5Var2 = f5Var;
            int iA = b4.g.a(2, f5Var2.d) + b4.k.a(1, f5Var2.c);
            Long l = f5Var2.e;
            return f5Var2.a().b() + iA + (l != null ? b4.g.a(3, l) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public f5 a(d4 d4Var) throws IOException {
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
                    aVar.d = b4.g.a(d4Var);
                } else if (iD != 3) {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                } else {
                    aVar.e = b4.g.a(d4Var);
                }
            }
        }
    }
}
