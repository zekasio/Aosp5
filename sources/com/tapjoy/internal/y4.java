package com.tapjoy.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.internal.a4;
import com.tapjoy.internal.b4;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends a4<y4, a> {
    public static final b4<y4> f = new b();
    public final z4 c;
    public final String d;
    public final String e;

    public static final class a extends a4.a<y4, a> {
        public z4 c;
        public String d;
        public String e;

        public y4 b() {
            String str;
            z4 z4Var = this.c;
            if (z4Var != null && (str = this.d) != null) {
                return new y4(z4Var, str, this.e, super.a());
            }
            com.tapjoy.internal.a.a(z4Var, TapjoyAuctionFlags.AUCTION_TYPE, this.d, AppMeasurementSdk.ConditionalUserProperty.NAME);
            throw null;
        }
    }

    static {
        z4 z4Var = z4.APP;
    }

    public y4(z4 z4Var, String str, String str2, x8 x8Var) {
        super(f, x8Var);
        this.c = z4Var;
        this.d = str;
        this.e = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return a().equals(y4Var.a()) && this.c.equals(y4Var.c) && this.d.equals(y4Var.d) && com.tapjoy.internal.a.b((Object) this.e, (Object) y4Var.e);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (a().hashCode() * 37)) * 37)) * 37;
        String str = this.e;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.b = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        if (this.e != null) {
            sb.append(", category=");
            sb.append(this.e);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "EventGroup{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public static final class b extends b4<y4> {
        public b() {
            super(z3.LENGTH_DELIMITED, y4.class);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, y4 y4Var) {
            y4 y4Var2 = y4Var;
            z4.f.a(e4Var, 1, y4Var2.c);
            b4.k.a(e4Var, 2, y4Var2.d);
            String str = y4Var2.e;
            if (str != null) {
                b4.k.a(e4Var, 3, str);
            }
            e4Var.a(y4Var2.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(y4 y4Var) {
            y4 y4Var2 = y4Var;
            int iA = b4.k.a(2, y4Var2.d) + z4.f.a(1, y4Var2.c);
            String str = y4Var2.e;
            return y4Var2.a().b() + iA + (str != null ? b4.k.a(3, str) : 0);
        }

        @Override // com.tapjoy.internal.b4
        public y4 a(d4 d4Var) throws IOException {
            a aVar = new a();
            long jB = d4Var.b();
            while (true) {
                int iD = d4Var.d();
                if (iD == -1) {
                    d4Var.a(jB);
                    return aVar.b();
                }
                if (iD == 1) {
                    try {
                        aVar.c = z4.f.a(d4Var);
                    } catch (b4.n e) {
                        aVar.a(iD, z3.VARINT, Long.valueOf(e.f1761a));
                    }
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
}
