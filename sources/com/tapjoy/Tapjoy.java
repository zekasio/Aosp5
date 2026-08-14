package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.tapjoy.internal.n5;
import com.tapjoy.internal.o4;
import com.tapjoy.internal.p4;
import com.tapjoy.internal.z6;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Tapjoy {
    public static final String INTENT_EXTRA_PUSH_PAYLOAD = "com.tapjoy.PUSH_PAYLOAD";

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1715a;

        public a(Activity activity) {
            this.f1715a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4.d.a(this.f1715a);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1716a;

        public b(Activity activity) {
            this.f1716a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4.d.b(this.f1716a);
        }
    }

    public static void actionComplete(String str) {
        if (((p4) o4.d).f("actionComplete")) {
            TapjoyConnectCore.getInstance().actionComplete(str);
        }
    }

    public static void activateInstallReferrerClient(Context context) {
        try {
            o4.d.a(context);
        } catch (TapjoyIntegrationException e) {
            Log.w("Tapjoy", e.getMessage());
        }
    }

    public static void addUserTag(String str) {
        o4.d.a(str);
    }

    public static void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        p4 p4Var = (p4) o4.d;
        if (!p4Var.f("awardCurrency")) {
            if (tJAwardCurrencyListener != null) {
                tJAwardCurrencyListener.onAwardCurrencyResponseFailure("Tapjoy SDK is not connected");
            }
        } else {
            TJCurrency tJCurrency = p4Var.g;
            if (tJCurrency != null) {
                tJCurrency.awardCurrency(i, tJAwardCurrencyListener);
            }
        }
    }

    public static void clearUserTags() {
        o4.d.a();
    }

    public static boolean connect(Context context, String str) {
        return ((p4) o4.d).a(context, str, (Hashtable<String, ?>) null, (TJConnectListener) null);
    }

    public static void endSession() {
        if (((p4) o4.d).g("endSession")) {
            n5.c();
            z6.r.b(false);
            TapjoyConnectCore.getInstance().appPause();
            com.tapjoy.internal.a.a();
        }
    }

    public static void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        p4 p4Var = (p4) o4.d;
        if (!p4Var.f("getCurrencyBalance")) {
            if (tJGetCurrencyBalanceListener != null) {
                tJGetCurrencyBalanceListener.onGetCurrencyBalanceResponseFailure("Tapjoy SDK is not connected");
            }
        } else {
            TJCurrency tJCurrency = p4Var.g;
            if (tJCurrency != null) {
                tJCurrency.getCurrencyBalance(tJGetCurrencyBalanceListener);
            }
        }
    }

    public static String getCustomParameter() {
        return o4.d.b();
    }

    public static TJPlacement getLimitedPlacement(String str, TJPlacementListener tJPlacementListener) {
        return o4.d.a(str, tJPlacementListener);
    }

    public static TJPlacement getPlacement(String str, TJPlacementListener tJPlacementListener) {
        return o4.d.b(str, tJPlacementListener);
    }

    public static TJPrivacyPolicy getPrivacyPolicy() {
        return o4.d.c();
    }

    public static String getSupportURL() {
        if (((p4) o4.d).f("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(null);
        }
        return null;
    }

    public static Set<String> getUserTags() {
        return o4.d.d();
    }

    public static String getUserToken() {
        return o4.d.e();
    }

    public static String getVersion() {
        o4.d.f();
        return "13.0.1";
    }

    public static boolean isConnected() {
        return ((p4) o4.d).f1871a;
    }

    public static boolean isLimitedConnected() {
        return ((p4) o4.d).b;
    }

    public static boolean isPushNotificationDisabled() {
        return o4.d.g();
    }

    public static synchronized boolean limitedConnect(Context context, String str, TJConnectListener tJConnectListener) {
        return o4.d.a(context, str, tJConnectListener);
    }

    public static void loadSharedLibrary() {
        try {
            System.loadLibrary("tapjoy");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void onActivityStart(Activity activity) {
        TapjoyUtil.runOnMainThread(new a(activity));
    }

    public static void onActivityStop(Activity activity) {
        TapjoyUtil.runOnMainThread(new b(activity));
    }

    public static void optOutAdvertisingID(Context context, boolean z) {
        o4.d.a(context, z);
    }

    public static void removeUserTag(String str) {
        o4.d.b(str);
    }

    public static void setActivity(Activity activity) {
        o4.d.c(activity);
    }

    public static void setCustomParameter(String str) {
        o4.d.c(str);
    }

    public static void setDebugEnabled(boolean z) {
        o4.d.a(z);
    }

    public static void setDeviceToken(String str) {
        o4.d.d(str);
    }

    public static void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        p4 p4Var = (p4) o4.d;
        if (p4Var.g == null || !p4Var.f("setEarnedCurrencyListener")) {
            return;
        }
        p4Var.g.setEarnedCurrencyListener(tJEarnedCurrencyListener);
    }

    public static void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        o4.d.a(gLSurfaceView);
    }

    public static void setInstallReferrer(Context context, String str) {
        o4.d.a(context, str);
    }

    public static void setPushNotificationDisabled(boolean z) {
        o4.d.b(z);
    }

    public static void setReceiveRemoteNotification(Context context, Map<String, String> map) {
        o4.d.a(context, map);
    }

    public static void setUserCohortVariable(int i, String str) {
        o4.d.a(i, str);
    }

    public static void setUserFriendCount(int i) {
        o4.d.a(i);
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        p4 p4Var = (p4) o4.d;
        if (!p4Var.g("setUserID")) {
            if (tJSetUserIDListener != null) {
                tJSetUserIDListener.onSetUserIDFailure(p4Var.f);
            }
        } else {
            TapjoyConnectCore.setUserID(str, tJSetUserIDListener);
            z6 z6Var = z6.r;
            if (z6Var.a("setUserId")) {
                z6Var.f.c(com.tapjoy.internal.a.g(str));
            }
        }
    }

    public static void setUserLevel(int i) {
        o4.d.b(i);
    }

    public static void setUserTags(Set<String> set) {
        o4.d.a(set);
    }

    public static void setVideoListener(TJVideoListener tJVideoListener) {
        if (((p4) o4.d).g("setVideoListener")) {
            TJAdUnit.P = tJVideoListener;
        }
    }

    public static void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        p4 p4Var = (p4) o4.d;
        if (!p4Var.f("spendCurrency")) {
            if (tJSpendCurrencyListener != null) {
                tJSpendCurrencyListener.onSpendCurrencyResponseFailure("Tapjoy SDK is not connected");
            }
        } else {
            TJCurrency tJCurrency = p4Var.g;
            if (tJCurrency != null) {
                tJCurrency.spendCurrency(i, tJSpendCurrencyListener);
            }
        }
    }

    public static void startSession() {
        if (((p4) o4.d).g("startSession")) {
            n5.c();
            TapjoyConnectCore.getInstance().appResume();
            com.tapjoy.internal.a.d();
        }
    }

    public static void trackEvent(String str) {
        o4.d.e(str);
    }

    @Deprecated
    public static void trackPurchase(String str, String str2) {
        o4.d.a(str, str2);
    }

    public static void trackEvent(String str, long j) {
        o4.d.a(str, j);
    }

    public static void trackPurchase(String str, String str2, double d, String str3) {
        o4.d.a(str, str2, d, str3);
    }

    public static boolean connect(Context context, String str, Hashtable<String, ?> hashtable) {
        return o4.d.a(context, str, hashtable, (TJConnectListener) null);
    }

    public static String getSupportURL(String str) {
        if (((p4) o4.d).f("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(str);
        }
        return null;
    }

    public static void trackEvent(String str, String str2, long j) {
        o4.d.a(str, str2, j);
    }

    public static void trackPurchase(String str, String str2, String str3, String str4) {
        o4.d.b(str, str2, str3, str4);
    }

    public static synchronized boolean connect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        return o4.d.a(context, str, hashtable, tJConnectListener);
    }

    public static void trackEvent(String str, String str2, String str3, String str4) {
        o4.d.a(str, str2, str3, str4);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, long j) {
        o4.d.a(str, str2, str3, str4, j);
    }

    @Deprecated
    public static void setUserID(String str) {
        setUserID(str, null);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j) {
        o4.d.a(str, str2, str3, str4, str5, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        o4.d.a(str, str2, str3, str4, str5, j, str6, j2);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        o4.d.a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, Map<String, Long> map) {
        o4.d.a(str, str2, str3, str4, map);
    }
}
