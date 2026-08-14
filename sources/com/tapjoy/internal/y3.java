package com.tapjoy.internal;

import com.tapjoy.internal.b4;
import com.tapjoy.internal.f4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y3<E extends f4> extends b4<E> {
    public y3(Class<E> cls) {
        super(z3.VARINT, cls);
    }

    @Override // com.tapjoy.internal.b4
    public void a(e4 e4Var, Object obj) {
        e4Var.b(((z4) obj).a());
    }

    @Override // com.tapjoy.internal.b4
    public int b(Object obj) {
        return e4.d(((z4) obj).a());
    }

    @Override // com.tapjoy.internal.b4
    public Object a(d4 d4Var) {
        int iG = d4Var.g();
        z4 z4VarA = z4.a(iG);
        if (z4VarA != null) {
            return z4VarA;
        }
        throw new b4.n(iG, this.b);
    }
}
