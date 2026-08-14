package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJEventOptimizer;
import com.tapjoy.TJInstallReferrer;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyException;
import com.tapjoy.TapjoyIntegrationException;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.b7;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class p4 extends o4 {
    public boolean e = false;
    public String f = "";
    public TJCurrency g = null;
    public TapjoyCache h;

    public class a implements TJConnectListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1882a;
        public final /* synthetic */ TJConnectListener b;

        public a(Context context, TJConnectListener tJConnectListener) {
            this.f1882a = context;
            this.b = tJConnectListener;
        }

        @Override // com.tapjoy.TJConnectListener
        public void onConnectFailure() {
            TJConnectListener tJConnectListener = this.b;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
        }

        @Override // com.tapjoy.TJConnectListener
        public void onConnectSuccess() {
            p4.this.g = new TJCurrency(this.f1882a);
            p4.this.h = new TapjoyCache(this.f1882a);
            try {
                TJEventOptimizer.init(this.f1882a);
                p4.this.f1871a = true;
                TJConnectListener tJConnectListener = this.b;
                if (tJConnectListener != null) {
                    tJConnectListener.onConnectSuccess();
                }
            } catch (InterruptedException unused) {
                onConnectFailure();
            } catch (RuntimeException e) {
                TapjoyLog.w("TapjoyAPI", e.getMessage());
                onConnectFailure();
            }
        }
    }

    public class b implements TJConnectListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1883a;
        public final /* synthetic */ TJConnectListener b;

        public b(Context context, TJConnectListener tJConnectListener) {
            this.f1883a = context;
            this.b = tJConnectListener;
        }

        @Override // com.tapjoy.TJConnectListener
        public void onConnectFailure() {
            TJConnectListener tJConnectListener = this.b;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
        }

        @Override // com.tapjoy.TJConnectListener
        public void onConnectSuccess() {
            p4.this.h = new TapjoyCache(this.f1883a);
            p4.this.b = true;
            TJConnectListener tJConnectListener = this.b;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a(boolean z) {
        TapjoyLog.setDebugEnabled(z);
    }

    @Override // com.tapjoy.internal.o4
    public void b(boolean z) {
        String strA;
        z6 z6Var = z6.r;
        if (z6Var.a("setPushNotificationDisabled")) {
            boolean zA = z6Var.f.a(z);
            if (zA) {
                com.tapjoy.internal.a.b("setPushNotificationDisabled(%b) called", Boolean.valueOf(z));
            } else {
                com.tapjoy.internal.a.b("setPushNotificationDisabled(%b) called, but it is already %s", Boolean.valueOf(z), z ? "disabled" : "enabled");
            }
            if (zA && z6Var.k && !TextUtils.isEmpty(z6Var.d)) {
                if (z6Var.o != null) {
                    strA = null;
                } else {
                    b7 b7VarA = b7.a(z6Var.e);
                    strA = com.tapjoy.internal.a.a(((b7.a) b7VarA.b).b(b7VarA.f1830a));
                }
                z6Var.c(strA);
            }
        }
    }

    @Override // com.tapjoy.internal.o4
    public void c(Activity activity) {
        if (activity != null) {
            com.tapjoy.internal.b.c.a(activity);
        } else {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Cannot set activity to NULL"));
        }
    }

    @Override // com.tapjoy.internal.o4
    public Set<String> d() {
        return z6.r.c();
    }

    @Override // com.tapjoy.internal.o4
    public void e(String str) {
        com.tapjoy.internal.a.a(null, str, null, null, 0L);
    }

    @Override // com.tapjoy.internal.o4
    public String f() {
        return "13.0.1";
    }

    public final boolean f(String str) {
        if (this.f1871a) {
            return true;
        }
        TapjoyLog.w("TapjoyAPI", "Can not call " + str + " because Tapjoy SDK has not successfully connected.");
        return false;
    }

    @Override // com.tapjoy.internal.o4
    public boolean g() {
        return z6.r.d();
    }

    @Override // com.tapjoy.internal.o4
    public void a(Context context, boolean z) {
        TapjoyConnectCore.optOutAdvertisingID(context, z);
    }

    @Override // com.tapjoy.internal.o4
    public String e() {
        return TapjoyConnectCore.getUserToken();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x00b2, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x0018, B:9:0x0020, B:11:0x0030, B:14:0x0035, B:16:0x003b, B:18:0x004b, B:21:0x0050, B:22:0x0053, B:24:0x005f, B:26:0x0063, B:28:0x0075, B:29:0x007d, B:33:0x0083, B:35:0x0095, B:39:0x009b, B:41:0x00ad), top: B:47:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x0018, B:9:0x0020, B:11:0x0030, B:14:0x0035, B:16:0x003b, B:18:0x004b, B:21:0x0050, B:22:0x0053, B:24:0x005f, B:26:0x0063, B:28:0x0075, B:29:0x007d, B:33:0x0083, B:35:0x0095, B:39:0x009b, B:41:0x00ad), top: B:47:0x0003, inners: #1, #2 }] */
    @Override // com.tapjoy.internal.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(android.content.Context r3, java.lang.String r4, java.util.Hashtable<java.lang.String, ?> r5, com.tapjoy.TJConnectListener r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r5 == 0) goto L18
            java.lang.String r0 = "TJC_OPTION_ENABLE_LOGGING"
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyLog.setDebugEnabled(r0)     // Catch: java.lang.Throwable -> Lb2
        L18:
            java.lang.String r0 = "event"
            com.tapjoy.TapjoyConnectCore.setSDKType(r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = 0
            if (r3 != 0) goto L35
            com.tapjoy.TapjoyErrorMessage r3 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyErrorMessage$ErrorType r4 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "The application context is NULL"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyLog.e(r4, r3)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L33
            r6.onConnectFailure()     // Catch: java.lang.Throwable -> Lb2
        L33:
            monitor-exit(r2)
            return r0
        L35:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L50
            com.tapjoy.TapjoyErrorMessage r3 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyErrorMessage$ErrorType r4 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "The SDK key is NULL. A valid SDK key is required to connect successfully to Tapjoy"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "TapjoyAPI"
            com.tapjoy.TapjoyLog.e(r4, r3)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L4e
            r6.onConnectFailure()     // Catch: java.lang.Throwable -> Lb2
        L4e:
            monitor-exit(r2)
            return r0
        L50:
            com.tapjoy.FiveRocksIntegration.a()     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyAppSettings.init(r3)     // Catch: com.tapjoy.TapjoyException -> L82 com.tapjoy.TapjoyIntegrationException -> L9a java.lang.Throwable -> Lb2
            com.tapjoy.internal.p4$a r1 = new com.tapjoy.internal.p4$a     // Catch: com.tapjoy.TapjoyException -> L82 com.tapjoy.TapjoyIntegrationException -> L9a java.lang.Throwable -> Lb2
            r1.<init>(r3, r6)     // Catch: com.tapjoy.TapjoyException -> L82 com.tapjoy.TapjoyIntegrationException -> L9a java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyConnectCore.requestTapjoyConnect(r3, r4, r5, r1)     // Catch: com.tapjoy.TapjoyException -> L82 com.tapjoy.TapjoyIntegrationException -> L9a java.lang.Throwable -> Lb2
            r4 = 1
            r2.e = r4     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto L7d
            java.lang.String r6 = "TJC_OPTION_DISABLE_AUTOMATIC_SESSION_TRACKING"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = "true"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto L7d
            java.lang.String r3 = "TapjoyAPI"
            java.lang.String r5 = "Automatic session tracking is disabled."
            com.tapjoy.TapjoyLog.i(r3, r5)     // Catch: java.lang.Throwable -> Lb2
            goto L80
        L7d:
            com.tapjoy.internal.n5.b(r3)     // Catch: java.lang.Throwable -> Lb2
        L80:
            monitor-exit(r2)
            return r4
        L82:
            r3 = move-exception
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyLog.e(r3, r4)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L98
            r6.onConnectFailure()     // Catch: java.lang.Throwable -> Lb2
        L98:
            monitor-exit(r2)
            return r0
        L9a:
            r3 = move-exception
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage     // Catch: java.lang.Throwable -> Lb2
            com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "TapjoyAPI"
            com.tapjoy.TapjoyLog.e(r3, r4)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Lb0
            r6.onConnectFailure()     // Catch: java.lang.Throwable -> Lb2
        Lb0:
            monitor-exit(r2)
            return r0
        Lb2:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb2
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.p4.a(android.content.Context, java.lang.String, java.util.Hashtable, com.tapjoy.TJConnectListener):boolean");
    }

    @Override // com.tapjoy.internal.o4
    public void c(String str) {
        TapjoyConnectCore.setCustomParameter(str);
    }

    @Override // com.tapjoy.internal.o4
    public void d(String str) {
        z6.r.c(str);
    }

    public final boolean g(String str) {
        if (this.e) {
            return true;
        }
        this.f = "Can not call " + str + " because Tapjoy SDK is not initialized.";
        TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, this.f));
        return false;
    }

    @Override // com.tapjoy.internal.o4
    public TJPrivacyPolicy c() {
        return TJPrivacyPolicy.getInstance();
    }

    @Override // com.tapjoy.internal.o4
    public void b(int i) {
        z6 z6Var = z6.r;
        if (z6Var.a("setUserLevel")) {
            com.tapjoy.internal.a.b("setUserLevel(%d) called", Integer.valueOf(i));
            z6Var.f.b(i > -1 ? Integer.valueOf(i) : null);
        }
    }

    @Override // com.tapjoy.internal.o4
    public TJPlacement b(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.a(str, "", "", tJPlacementListener);
    }

    @Override // com.tapjoy.internal.o4
    public void b(String str, String str2, String str3, String str4) {
        com.tapjoy.internal.a.a(str, str2, str3, str4);
    }

    @Override // com.tapjoy.internal.o4
    public void b(Activity activity) {
        n5.c();
        com.tapjoy.internal.a.b(activity);
    }

    @Override // com.tapjoy.internal.o4
    public String b() {
        return TapjoyConnectCore.getCustomParameter();
    }

    @Override // com.tapjoy.internal.o4
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        z6 z6Var = z6.r;
        Set<String> setC = z6Var.c();
        if (setC.remove(str)) {
            z6Var.a(setC);
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a(Context context) throws TapjoyIntegrationException {
        z6 z6Var = z6.r;
        if (z6Var.e == null) {
            z6Var.a(context);
        }
        try {
            z6Var.e.getClassLoader().loadClass("com.android.installreferrer.api.InstallReferrerStateListener");
            new TJInstallReferrer().init(context);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            throw new TapjoyIntegrationException("InstallReferrerClient APIs aren't available in your project. To use activateInstallReferrerClient() API,`com.android.installreferrer:installreferrer` dependency is required to your project level build.gradle file");
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a() {
        z6.r.a((Set<String>) null);
    }

    @Override // com.tapjoy.internal.o4
    public void a(GLSurfaceView gLSurfaceView) {
        z6.r.a(gLSurfaceView);
    }

    @Override // com.tapjoy.internal.o4
    public void a(Context context, String str) {
        z6 z6Var = z6.r;
        if (z6Var.e == null) {
            z6Var.a(context);
        }
        z6.r.a(z6Var.e, str);
    }

    @Override // com.tapjoy.internal.o4
    public void a(Context context, Map<String, String> map) {
        z6 z6Var = z6.r;
        if (z6Var.e == null) {
            z6Var.a(context);
        }
        b7.a(z6Var.e).a(z6Var.e, map);
    }

    @Override // com.tapjoy.internal.o4
    public void a(int i, String str) {
        z6 z6Var = z6.r;
        if (z6Var.a("setUserCohortVariable")) {
            if (com.tapjoy.internal.a.a(i >= 1 && i <= 5, "setCohortVariable: variableIndex is out of range")) {
                com.tapjoy.internal.a.b("setUserCohortVariable(%d, %s) called", Integer.valueOf(i), str);
                z6Var.f.a(i, com.tapjoy.internal.a.g(str));
            }
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a(int i) {
        z6 z6Var = z6.r;
        if (z6Var.a("setUserFriendCount")) {
            com.tapjoy.internal.a.b("setUserFriendCount(%d) called", Integer.valueOf(i));
            z6Var.f.a(i > -1 ? Integer.valueOf(i) : null);
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a(Set<String> set) {
        z6.r.a(set);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        z6 z6Var = z6.r;
        if (z6Var.b("trackEvent") && !TextUtils.isEmpty(str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, Long> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        if (com.tapjoy.internal.a.b) {
                            com.tapjoy.internal.a.a("Tapjoy", "%s: %s must not be null", "trackEvent", "key in values map");
                            return;
                        }
                        return;
                    } else if (key instanceof String) {
                        String strB = com.tapjoy.internal.a.b(key, "trackEvent", "key in values map");
                        if (strB == null) {
                            return;
                        }
                        Long value = entry.getValue();
                        if (value instanceof Number) {
                            linkedHashMap.put(strB, Long.valueOf(value.longValue()));
                        } else {
                            com.tapjoy.internal.a.a("trackEvent", "value in values map", "must be a long");
                            return;
                        }
                    }
                }
            }
            z6Var.g.a(str, str2, str3, str4, linkedHashMap);
            com.tapjoy.internal.a.b("trackEvent category:%s, name:%s, p1:%s, p2:%s, values:%s called", str, str2, str3, str4, linkedHashMap);
        }
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, double d, String str3) {
        String strB;
        String strB2;
        z6 z6Var = z6.r;
        if (!z6Var.b("trackPurchase") || (strB = com.tapjoy.internal.a.b(str, "trackPurchase", "productId")) == null || (strB2 = com.tapjoy.internal.a.b(str2, "trackPurchase", "currencyCode")) == null) {
            return;
        }
        if (strB2.length() != 3) {
            com.tapjoy.internal.a.a("trackPurchase", "currencyCode", "invalid currency code");
        } else {
            z6Var.g.a(strB, strB2.toUpperCase(Locale.US), d, null, null, com.tapjoy.internal.a.f(str3));
            com.tapjoy.internal.a.e("trackPurchase called");
        }
    }

    @Override // com.tapjoy.internal.o4
    public synchronized boolean a(Context context, String str, TJConnectListener tJConnectListener) {
        TapjoyConnectCore.setSDKType("event");
        if (context == null) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The application context is NULL"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The limited SDK key is NULL. A valid limited SDK key is required to connect successfully to Tapjoy"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        try {
            TapjoyConnectCore.requestLimitedTapjoyConnect(context, str, new b(context, tJConnectListener));
            return true;
        } catch (TapjoyIntegrationException e) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        } catch (TapjoyException e2) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
    }

    @Override // com.tapjoy.internal.o4
    public TJPlacement a(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.a(str, "", "", tJPlacementListener, true);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2) {
        com.tapjoy.internal.a.a(str, (String) null, (String) null, str2);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, long j) {
        com.tapjoy.internal.a.a(null, str, null, null, j);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, long j) {
        com.tapjoy.internal.a.a(str, str2, null, null, j);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4) {
        com.tapjoy.internal.a.a(str, str2, str3, str4, 0L);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4, long j) {
        com.tapjoy.internal.a.a(str, str2, str3, str4, j);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4, String str5, long j) {
        com.tapjoy.internal.a.a(str, str2, str3, str4, str5, j, null, 0L, null, 0L);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        com.tapjoy.internal.a.a(str, str2, str3, str4, str5, j, str6, j2, null, 0L);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        com.tapjoy.internal.a.a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    @Override // com.tapjoy.internal.o4
    public void a(Activity activity) {
        n5.c();
        z6.r.n = true;
        com.tapjoy.internal.a.a(activity);
    }

    @Override // com.tapjoy.internal.o4
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        z6 z6Var = z6.r;
        Set<String> setC = z6Var.c();
        if (setC.add(str)) {
            z6Var.a(setC);
        }
    }
}
