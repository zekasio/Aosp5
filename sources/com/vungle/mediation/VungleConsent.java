package com.vungle.mediation;

import com.vungle.warren.Vungle;

/* JADX INFO: loaded from: classes2.dex */
public class VungleConsent {
    public static void updateConsentStatus(Vungle.Consent consent, String str) {
        Vungle.updateConsentStatus(consent, str);
    }

    public static Vungle.Consent getCurrentVungleConsent() {
        return Vungle.getConsentStatus();
    }

    public static String getCurrentVungleConsentMessageVersion() {
        return Vungle.getConsentMessageVersion();
    }
}
