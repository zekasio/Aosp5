package com.tapjoy.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class x7 extends o7 implements n6 {
    public static final u0<x7> d = new a();
    public final String b;
    public final String c;

    public static class a implements u0<x7> {
        @Override // com.tapjoy.internal.u0
        public x7 a(z0 z0Var) throws IOException {
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            String strA = "";
            String strA2 = strA;
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("campaign_id".equals(strT)) {
                    strA = a1Var.a("");
                } else if ("product_id".equals(strT)) {
                    strA2 = a1Var.a("");
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return new x7(strA, strA2);
        }
    }

    public x7(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
