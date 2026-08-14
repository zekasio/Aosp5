package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class q7 extends p7 {
    public static final u0<q7> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<b8> f1890a = new ArrayList<>();
    public Map<String, Object> b;
    public float c;

    public static class a implements u0<q7> {
        @Override // com.tapjoy.internal.u0
        public q7 a(z0 z0Var) {
            return new q7(z0Var);
        }
    }

    public q7(z0 z0Var) throws IOException {
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        String strE = null;
        String strE2 = null;
        while (a1Var.o()) {
            String strT = a1Var.t();
            if ("layouts".equals(strT)) {
                a1Var.a(this.f1890a, b8.d);
            } else if ("meta".equals(strT)) {
                this.b = a1Var.d();
            } else if ("max_show_time".equals(strT)) {
                this.c = (float) a1Var.q();
            } else if ("ad_content".equals(strT)) {
                strE = a1Var.e();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(strT)) {
                strE2 = a1Var.e();
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
        ArrayList<b8> arrayList = this.f1890a;
        if (arrayList != null) {
            Iterator<b8> it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList<a8> arrayList2 = it.next().c;
                if (arrayList2 != null) {
                    for (a8 a8Var : arrayList2) {
                        if (a8Var.i == null) {
                            a8Var.i = strE;
                        }
                        if (a8Var.h == null) {
                            a8Var.h = strE2;
                        }
                    }
                }
            }
        }
    }

    public boolean a() {
        Iterator<b8> it = this.f1890a.iterator();
        boolean zA = true;
        while (it.hasNext()) {
            zA = it.next().a();
            if (!zA) {
                return false;
            }
        }
        return zA;
    }
}
