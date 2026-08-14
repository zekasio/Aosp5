package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.b.a;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static void setHasUserConsent(boolean z, Context context) {
        y.f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (a.b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), null, null);
        }
    }

    public static boolean hasUserConsent(Context context) {
        y.f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean boolA = a.b().a(context);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return false;
    }

    public static boolean isUserConsentSet(Context context) {
        y.f("AppLovinPrivacySettings", "isUserConsentSet()");
        return a.b().a(context) != null;
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        y.f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (a.a(z, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z), null);
        }
    }

    public static boolean isAgeRestrictedUser(Context context) {
        y.f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean boolA = a.a().a(context);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        y.f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return a.a().a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        y.f("AppLovinPrivacySettings", "setDoNotSell()");
        if (a.c(z, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z));
        }
    }

    public static boolean isDoNotSell(Context context) {
        y.f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean boolA = a.c().a(context);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        y.f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return a.c().a(context) != null;
    }
}
