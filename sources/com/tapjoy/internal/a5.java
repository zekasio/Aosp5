package com.tapjoy.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.internal.a4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a5 extends a4<a5, a> {
    public static final b4<a5> e = new b();
    public final String c;
    public final Long d;

    public static final class a extends a4.a<a5, a> {
        public String c;
        public Long d;

        public a5 b() {
            Long l;
            String str = this.c;
            if (str != null && (l = this.d) != null) {
                return new a5(str, l, super.a());
            }
            com.tapjoy.internal.a.a(str, AppMeasurementSdk.ConditionalUserProperty.NAME, this.d, "value");
            throw null;
        }
    }

    static {
        Long.valueOf(0L);
    }

    public a5(String str, Long l, x8 x8Var) {
        super(e, x8Var);
        this.c = str;
        this.d = l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return a().equals(a5Var.a()) && this.c.equals(a5Var.c) && this.d.equals(a5Var.d);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.d.hashCode() + ((this.c.hashCode() + (a().hashCode() * 37)) * 37);
        this.b = iHashCode;
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        StringBuilder sbReplace = sb.replace(0, 2, "EventValue{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<a5> {
        public b() {
            super(z3.LENGTH_DELIMITED, a5.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, a5 a5Var) {
            a5 a5Var2 = a5Var;
            b4.k.a(e4Var, 1, a5Var2.c);
            b4.g.a(e4Var, 2, a5Var2.d);
            e4Var.a(a5Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(a5 a5Var) {
            a5 a5Var2 = a5Var;
            return a5Var2.a().b() + b4.g.a(2, a5Var2.d) + b4.k.a(1, a5Var2.c);
        }

        @Override // com.tapjoy.internal.b4
        public a5 a(d4 d4Var) throws IOException {
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
                } else if (iD != 2) {
                    z3 z3Var = d4Var.h;
                    aVar.a(iD, z3Var, z3Var.a().a(d4Var));
                } else {
                    aVar.d = b4.g.a(d4Var);
                }
            }
        }
    }
}
