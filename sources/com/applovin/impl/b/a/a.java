package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static List<d> a(p pVar, boolean z) {
        if (!pVar.ae().b()) {
            return null;
        }
        Boolean boolA = com.applovin.impl.b.a.a().a(p.y());
        if (boolA != null && boolA.booleanValue()) {
            return null;
        }
        if (z) {
            return j.c(pVar);
        }
        boolean zU = pVar.u();
        Boolean bool = (Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.t, false);
        Boolean bool2 = (Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.s, false);
        if (zU) {
            if (bool2.booleanValue() || bool.booleanValue()) {
                return b(pVar);
            }
            if (pVar.v() || pVar.ax().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                return null;
            }
            return j.c(pVar);
        }
        return b(pVar);
    }

    public static List<d> a(p pVar) {
        if (!pVar.ae().b()) {
            return null;
        }
        boolean zU = pVar.u();
        Boolean bool = (Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.t, false);
        if (zU) {
            if (bool.booleanValue()) {
                return c(pVar);
            }
            return null;
        }
        return c(pVar);
    }

    private static List<d> b(p pVar) {
        if (AppLovinSdkConfiguration.ConsentDialogState.APPLIES == pVar.ax().getConsentDialogState()) {
            return j.c(pVar);
        }
        if (pVar.ae().e() != null) {
            return j.b(pVar);
        }
        return j.a(pVar);
    }

    private static List<d> c(p pVar) {
        if (pVar.ae().e() != null) {
            return j.b(pVar);
        }
        return j.a(pVar);
    }
}
