package com.tapjoy;

import com.tapjoy.internal.e6;

/* JADX INFO: loaded from: classes2.dex */
public class TJPrivacyPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TJPrivacyPolicy f1696a = new TJPrivacyPolicy();

    public static TJPrivacyPolicy getInstance() {
        return f1696a;
    }

    public void setBelowConsentAge(boolean z) {
        e6.h.a(z);
    }

    public void setSubjectToGDPR(boolean z) {
        e6.h.b(z);
    }

    public void setUSPrivacy(String str) {
        e6.h.a(str);
    }

    public void setUserConsent(String str) {
        e6.h.b(str);
    }
}
