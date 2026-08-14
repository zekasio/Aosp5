package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.a1;
import com.tapjoy.internal.b5;
import com.tapjoy.internal.c5;
import com.tapjoy.internal.e6;
import com.tapjoy.internal.h6;
import com.tapjoy.internal.i5;
import com.tapjoy.internal.i6;
import com.tapjoy.internal.p;
import com.tapjoy.internal.p5;
import com.tapjoy.internal.s4;
import com.tapjoy.internal.s5;
import com.tapjoy.internal.u4;
import com.tapjoy.internal.v4;
import com.tapjoy.internal.w1;
import com.tapjoy.internal.x1;
import com.tapjoy.internal.y5;
import com.tapjoy.internal.z0;
import com.tapjoy.internal.z5;
import com.tapjoy.internal.z6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.CRC32;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyConnectCore {
    public static Integer A0 = null;
    public static Long B0 = null;
    public static final String BEACON = "sdk_beacons";
    public static final String BEACON_ENABLED = "enabled";
    public static Long C0 = null;
    public static Long D0 = null;
    public static String E0 = null;
    public static Integer F0 = null;
    public static Double G0 = null;
    public static Double H0 = null;
    public static Long I0 = null;
    public static Integer J0 = null;
    public static Integer K0 = null;
    public static Integer L0 = null;
    public static String M0 = null;
    public static String N0 = null;
    public static String O0 = null;
    public static boolean W = false;
    public static PackageManager X = null;
    public static TapjoyGpsHelper Y = null;
    public static Context c = null;
    public static boolean c0 = false;
    public static String d = null;
    public static TapjoyConnectCore e = null;
    public static TapjoyURLConnection f = null;
    public static TJConnectListener g = null;
    public static TJSetUserIDListener h = null;
    public static boolean i = false;
    public static String i0 = null;
    public static boolean j = false;
    public static String j0;
    public static String k0;
    public static String l0;
    public static Integer m0;
    public static String n0;
    public static Long o0;
    public static String p0;
    public static Integer q0;
    public static Integer r0;
    public static String s0;
    public static String t0;
    public static String u0;
    public static String v0;
    public static String w0;
    public static Set<String> x0;
    public static Integer y0;
    public static Integer z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1724a = false;
    public boolean b = false;
    public static Vector<String> k = new Vector<>(Arrays.asList(TapjoyConstants.dependencyClassNames));
    public static String l = "";
    public static String m = "";
    public static String n = "";
    public static String o = "";
    public static String p = "";
    public static String q = "";
    public static String r = "";
    public static String s = "";
    public static String t = "";
    public static String u = "";
    public static String v = "";
    public static String w = "";
    public static int x = 1;
    public static float y = 1.0f;
    public static int z = 1;
    public static String A = "";
    public static String B = "";
    public static String C = "";
    public static String D = "";
    public static String E = "";
    public static String F = "";
    public static String G = "";
    public static String H = "";
    public static String I = "";
    public static String J = "";
    public static String K = "";
    public static String L = "";
    public static String M = TapjoyConstants.TJC_PLUGIN_NATIVE;
    public static String N = "";
    public static String O = "";
    public static boolean P = false;
    public static String Q = "";
    public static String R = "";
    public static String S = "";
    public static String T = "";
    public static Map<String, Object> U = new HashMap();
    public static long V = 0;
    public static int Z = 0;
    public static int a0 = 0;
    public static String b0 = "";
    public static String d0 = "";
    public static String e0 = "";
    public static String f0 = "";
    public static Hashtable<String, Object> g0 = TapjoyConnectFlag.CONNECT_FLAG_DEFAULTS;
    public static Map<String, Integer> h0 = new ConcurrentHashMap();
    public static String P0 = "";
    public static String Q0 = "";
    public static String R0 = "";
    public static boolean S0 = false;
    public static TJConnectListener T0 = null;
    public static boolean U0 = false;

    public class PPAThread implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, String> f1725a;

        public PPAThread(Map<String, String> map) {
            this.f1725a = map;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String str = TapjoyConnectCore.f.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, this.f1725a).response;
            if (str != null) {
                TapjoyConnectCore.this.b(str);
            }
        }
    }

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sbA = w1.a("Setting userID to ");
            sbA.append(TapjoyConnectCore.A);
            TapjoyLog.i("TapjoyConnect", sbA.toString());
            String hostURL = TapjoyConnectCore.getHostURL();
            String str = TapjoyConnectCore.f.getResponseFromURL(hostURL + TapjoyConstants.TJC_USER_ID_URL_PATH, TapjoyConnectCore.getURLParams()).response;
            boolean zC = str != null ? TapjoyConnectCore.c(str) : false;
            if (!zC && !TapjoyConnectCore.j && !hostURL.equalsIgnoreCase(TapjoyConnectCore.getHostURL())) {
                boolean unused = TapjoyConnectCore.j = true;
                TapjoyConnectCore.setUserID(TapjoyConnectCore.A, TapjoyConnectCore.h);
                return;
            }
            if (zC) {
                TapjoyLog.i("TapjoyConnect", "Set userID is successful");
                TJSetUserIDListener tJSetUserIDListener = TapjoyConnectCore.h;
                if (tJSetUserIDListener != null) {
                    tJSetUserIDListener.onSetUserIDSuccess();
                    return;
                }
                return;
            }
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to set userID"));
            TJSetUserIDListener tJSetUserIDListener2 = TapjoyConnectCore.h;
            if (tJSetUserIDListener2 != null) {
                tJSetUserIDListener2.onSetUserIDFailure("Failed to set userID");
            }
            TapjoyConnectCore.i = true;
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TapjoyConnectCore.e.a();
        }
    }

    public static String d() {
        String str = t + u + v + b0 + n;
        try {
            return TapjoyUtil.SHA1(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String e() {
        TapjoyLog.i("TapjoyConnect", "generating sessionID...");
        String strSHA256 = null;
        try {
            strSHA256 = TapjoyUtil.SHA256((System.currentTimeMillis() / 1000) + t);
            V = System.currentTimeMillis();
            return strSHA256;
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("unable to generate session id: ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", sbA.toString());
            return strSHA256;
        }
    }

    public static Map<String, String> f() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_PLUGIN, M, true);
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_SDK_TYPE, N, true);
        TapjoyUtil.safePut(map3, "app_id", t, true);
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_LIBRARY_VERSION, v, true);
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_LIBRARY_REVISION, TapjoyRevision.GIT_REVISION, true);
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_BRIDGE_VERSION, w, true);
        x1.f1939a.a();
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_OMSDK_VERSION, "1.3.16-tapjoy", true);
        TapjoyUtil.safePut(map3, TapjoyConstants.TJC_APP_VERSION_NAME, u, true);
        map2.putAll(map3);
        HashMap map4 = new HashMap();
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_NAME, p, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_PLATFORM, C, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, s, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_MANUFACTURER, q, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_TYPE_NAME, r, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_SCREEN_LAYOUT_SIZE, "" + z, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_STORE_NAME, J, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_STORE_VIEW, String.valueOf(P), true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_CARRIER_NAME, D, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_CARRIER_COUNTRY_CODE, E, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_MOBILE_NETWORK_CODE, G, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, F, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, Locale.getDefault().getCountry(), true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_LANGUAGE, Locale.getDefault().getLanguage(), true);
        String connectionType = getConnectionType();
        H = connectionType;
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_CONNECTION_TYPE, connectionType, true);
        String connectionSubType = getConnectionSubType();
        I = connectionSubType;
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_CONNECTION_SUBTYPE, connectionSubType, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_SCREEN_DENSITY, "" + x, true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_VOLUME, TapjoyUtil.getVolume(c));
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_THEME, TapjoyUtil.getTheme(c), true);
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_DEVICE_SCREEN_BRIGHTNESS, TapjoyUtil.getScreenBrightness(c));
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_AVAILABLE_DISK_SPACE, TapjoyUtil.getAvailableDiskSpace());
        TapjoyUtil.safePut(map4, TapjoyConstants.TJC_TOTAL_DISK_SPACE, TapjoyUtil.getTotalDiskSpace());
        map2.putAll(map4);
        HashMap map5 = new HashMap();
        if (h()) {
            if (Y.isAdvertisingIdAllowed()) {
                TapjoyUtil.safePut(map5, TapjoyConstants.TJC_ADVERTISING_ID, b0, true);
            }
            TapjoyUtil.safePut(map5, TapjoyConstants.TJC_AD_TRACKING_ENABLED, String.valueOf(c0), true);
        }
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_ADVERTISING_ID_OPTOUT, String.valueOf(!Y.isAdvertisingIdAllowed()), true);
        if (!TextUtils.isEmpty(f0)) {
            TapjoyUtil.safePut(map5, TapjoyConstants.TJC_APP_SET_ID, f0, true);
        }
        if ((j() && !h()) || !i()) {
            TapjoyUtil.safePut(map5, "android_id", l, true);
        }
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_INSTALL_ID, n, true);
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_TEST_ID, o, true);
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_USER_ID, A, true);
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_ADVERTISING_ID_CHECK_DISABLED, d0, true);
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_LEGACY_ID_FALLBACK_ALLOWED, e0, true);
        int i2 = Z;
        if (i2 != 0) {
            TapjoyUtil.safePut(map5, TapjoyConstants.TJC_PACKAGED_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i2), true);
        }
        int i3 = a0;
        if (i3 != 0) {
            TapjoyUtil.safePut(map5, TapjoyConstants.TJC_DEVICE_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i3), true);
        }
        String str = m;
        if (str == null || str.length() == 0 || System.currentTimeMillis() - V > TapjoyConstants.SESSION_ID_INACTIVITY_TIME) {
            m = e();
        } else {
            V = System.currentTimeMillis();
        }
        TapjoyUtil.safePut(map5, TapjoyConstants.TJC_SESSION_ID, m, true);
        map2.putAll(map5);
        HashMap map6 = new HashMap();
        TapjoyUtil.safePut(map6, TapjoyConstants.TJC_APP_GROUP_ID, Q, true);
        TapjoyUtil.safePut(map6, TapjoyConstants.TJC_STORE, R, true);
        TapjoyUtil.safePut(map6, TapjoyConstants.TJC_ANALYTICS_API_KEY, S, true);
        TapjoyUtil.safePut(map6, TapjoyConstants.TJC_MANAGED_DEVICE_ID, T, true);
        map2.putAll(map6);
        map2.putAll(e6.h.a());
        if (TapjoyCache.getInstance() != null && TapjoyCache.getInstance().getCachedOfferIDs() != null && TapjoyCache.getInstance().getCachedOfferIDs().length() > 0) {
            TapjoyUtil.safePut(map2, TapjoyConstants.TJC_CACHED_OFFERS, TapjoyCache.getInstance().getCachedOfferIDs(), true);
        }
        map.putAll(map2);
        HashMap map7 = new HashMap();
        k();
        HashMap map8 = new HashMap();
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_ANALYTICS_ID, i0, true);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_PACKAGE_ID, j0, true);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_PACKAGE_SIGN, k0, true);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY, J0);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH, K0);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT, L0);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_DEVICE_COUNTRY_SIM, M0, true);
        TapjoyUtil.safePut(map8, TapjoyConstants.TJC_DEVICE_TIMEZONE, N0, true);
        map7.putAll(map8);
        HashMap map9 = new HashMap();
        TapjoyUtil.safePut(map9, TapjoyConstants.TJC_PACKAGE_VERSION, l0, true);
        TapjoyUtil.safePut(map9, TapjoyConstants.TJC_PACKAGE_REVISION, m0);
        TapjoyUtil.safePut(map9, TapjoyConstants.TJC_INSTALLER, n0, true);
        if (TextUtils.isEmpty(J)) {
            TapjoyUtil.safePut(map9, TapjoyConstants.TJC_STORE_NAME, O0, true);
        }
        map7.putAll(map9);
        HashMap map10 = new HashMap();
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_INSTALLED, o0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_REFERRER, p0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_LEVEL, q0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_FRIEND_COUNT, r0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_VARIABLE_1, s0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_VARIABLE_2, t0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_VARIABLE_3, u0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_VARIABLE_4, v0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_VARIABLE_5, w0, true);
        int i4 = 0;
        for (String str2 : x0) {
            StringBuilder sbA = w1.a("user_tags[");
            sbA.append(i4);
            sbA.append("]");
            TapjoyUtil.safePut(map10, sbA.toString(), str2, true);
            i4++;
        }
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY, y0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY, z0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_SESSION_TOTAL_COUNT, A0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_SESSION_TOTAL_LENGTH, B0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_SESSION_LAST_AT, C0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_SESSION_LAST_LENGTH, D0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_PURCHASE_CURRENCY, E0, true);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_PURCHASE_TOTAL_COUNT, F0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_PURCHASE_TOTAL_PRICE, G0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_PURCHASE_LAST_PRICE, H0);
        TapjoyUtil.safePut(map10, TapjoyConstants.TJC_PURCHASE_LAST_AT, I0);
        map7.putAll(map10);
        map.putAll(map7);
        return map;
    }

    public static String g() {
        String str;
        if (h()) {
            return b0;
        }
        if ((j() || !i()) && (str = l) != null && str.length() > 0) {
            return l;
        }
        TapjoyLog.e("TapjoyConnect", "Error -- no valid device identifier");
        return null;
    }

    public static String getAndroidID() {
        return l;
    }

    public static String getAppID() {
        return t;
    }

    public static String getAwardCurrencyVerifier(long j2, int i2, String str) {
        try {
            return TapjoyUtil.SHA256(t + ":" + g() + ":" + j2 + ":" + K + ":" + i2 + ":" + str);
        } catch (Exception e2) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            StringBuilder sbA = w1.a("Error in computing awardCurrencyVerifier -- ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(errorType, sbA.toString()));
            return "";
        }
    }

    public static String getCarrierName() {
        return D;
    }

    public static String getConnectFlagValue(String str) {
        Hashtable<String, Object> hashtable = g0;
        return (hashtable == null || hashtable.get(str) == null) ? "" : g0.get(str).toString();
    }

    public static String getConnectURL() {
        return TapjoyConfig.TJC_CONNECT_SERVICE_URL;
    }

    public static String getConnectionSubType() {
        String subtypeName = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            subtypeName = connectivityManager.getActiveNetworkInfo().getSubtypeName();
            TapjoyLog.d("TapjoyConnect", "connection_sub_type: " + subtypeName);
            return subtypeName;
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("getConnectionSubType error: ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", sbA.toString());
            return subtypeName;
        }
    }

    public static String getConnectionType() {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                int type = connectivityManager.getActiveNetworkInfo().getType();
                str = (type == 1 || type == 6) ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
                TapjoyLog.d("TapjoyConnect", "connectivity: " + connectivityManager.getActiveNetworkInfo().getType());
                TapjoyLog.d("TapjoyConnect", "connection_type: ".concat(str));
            }
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("getConnectionType error: ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", sbA.toString());
        }
        return str;
    }

    public static Context getContext() {
        return c;
    }

    public static String getCustomParameter() {
        return B;
    }

    public static float getDeviceScreenDensityScale() {
        return y;
    }

    public static Map<String, String> getGenericURLParams() {
        Map<String, String> mapF = f();
        TapjoyUtil.safePut(mapF, "app_id", t, true);
        return mapF;
    }

    public static String getHostURL() {
        return getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL);
    }

    public static TapjoyConnectCore getInstance() {
        return e;
    }

    public static String getLimitedAppID() {
        return P0;
    }

    public static Map<String, String> getLimitedGenericURLParams() {
        Map<String, String> mapF = f();
        TapjoyUtil.safePut(mapF, "app_id", P0, true);
        TapjoyUtil.safePut(mapF, TapjoyConstants.TJC_APP_GROUP_ID, R0, true);
        TapjoyUtil.safePut(mapF, TapjoyConstants.TJC_LIMITED, "true", true);
        return mapF;
    }

    public static Map<String, String> getLimitedTimeStampAndVerifierParams() {
        String strSHA256;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        try {
            strSHA256 = TapjoyUtil.SHA256(P0 + ":" + g() + ":" + jCurrentTimeMillis + ":" + Q0);
        } catch (Exception e2) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            StringBuilder sbA = w1.a("Error in computing verifier value -- ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(errorType, sbA.toString()));
            strSHA256 = "";
        }
        HashMap map = new HashMap();
        TapjoyUtil.safePut(map, "timestamp", String.valueOf(jCurrentTimeMillis), true);
        TapjoyUtil.safePut(map, TapjoyConstants.TJC_VERIFIER, strSHA256, true);
        return map;
    }

    public static Map<String, String> getLimitedURLParams() {
        Map<String, String> limitedGenericURLParams = getLimitedGenericURLParams();
        limitedGenericURLParams.putAll(getLimitedTimeStampAndVerifierParams());
        return limitedGenericURLParams;
    }

    public static String getPlacementURL() {
        return getConnectFlagValue(TapjoyConnectFlag.PLACEMENT_URL);
    }

    public static String getRedirectDomain() {
        return O;
    }

    public static String getSecretKey() {
        return K;
    }

    public static String getSupportURL(String str) {
        if (str == null) {
            str = t;
        }
        return getHostURL() + "support_requests/new?currency_id=" + str + "&app_id=" + t + "&udid=" + T + "&language_code=" + Locale.getDefault().getLanguage();
    }

    public static Map<String, String> getTimeStampAndVerifierParams() {
        String strSHA256;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        try {
            strSHA256 = TapjoyUtil.SHA256(t + ":" + g() + ":" + jCurrentTimeMillis + ":" + K);
        } catch (Exception e2) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            StringBuilder sbA = w1.a("Error in computing verifier value -- ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(errorType, sbA.toString()));
            strSHA256 = "";
        }
        HashMap map = new HashMap();
        TapjoyUtil.safePut(map, "timestamp", String.valueOf(jCurrentTimeMillis), true);
        TapjoyUtil.safePut(map, TapjoyConstants.TJC_VERIFIER, strSHA256, true);
        return map;
    }

    public static Map<String, String> getURLParams() {
        Map<String, String> genericURLParams = getGenericURLParams();
        genericURLParams.putAll(getTimeStampAndVerifierParams());
        return genericURLParams;
    }

    public static String getUserID() {
        return A;
    }

    public static String getUserToken() {
        Map<String, Object> map = U;
        if (map == null || map.isEmpty()) {
            if (TextUtils.isEmpty(A)) {
                return T;
            }
            return T + ":" + A;
        }
        Map<String, Object> map2 = U;
        HashMap map3 = new HashMap();
        for (String str : map2.keySet()) {
            TapjoyUtil.safePut(map3, str, String.valueOf(map2.get(str)), true);
        }
        if (!TextUtils.isEmpty(A)) {
            TapjoyUtil.safePut(map3, TapjoyConstants.TJC_TOKEN_PARAM_USER_ID, A, true);
        }
        return Base64.encodeToString(TapjoyUtil.convertURLParams((Map<String, String>) map3, false).getBytes(), 2);
    }

    public static boolean h() {
        String str = b0;
        return str != null && str.length() > 0;
    }

    public static boolean i() {
        return (Y.isGooglePlayServicesAvailable() && Y.isGooglePlayManifestConfigured()) || getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true");
    }

    public static boolean isConnected() {
        return W;
    }

    public static boolean isFullScreenViewOpen() {
        Iterator<Integer> it = h0.values().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLimitedConnected() {
        return S0;
    }

    public static boolean isUnitTestMode() {
        return getConnectFlagValue("unit_test_mode") == "true";
    }

    public static boolean isViewOpen() {
        StringBuilder sbA = w1.a("isViewOpen: ");
        sbA.append(h0.size());
        TapjoyLog.d("TapjoyConnect", sbA.toString());
        return !h0.isEmpty();
    }

    public static boolean j() {
        return getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).equals("true");
    }

    public static void k() {
        z6 z6VarD = z6.d(c);
        z6VarD.f.e();
        c5 c5VarA = z6VarD.f.a();
        b5 b5Var = c5VarA.c;
        i0 = b5Var.d;
        j0 = b5Var.n;
        k0 = b5Var.o;
        J0 = b5Var.i;
        K0 = b5Var.j;
        L0 = b5Var.k;
        M0 = b5Var.q;
        N0 = b5Var.m;
        v4 v4Var = c5VarA.d;
        l0 = v4Var.c;
        m0 = v4Var.d;
        n0 = v4Var.e;
        O0 = v4Var.f;
        i5 i5Var = c5VarA.e;
        o0 = i5Var.c;
        p0 = i5Var.d;
        q0 = i5Var.t;
        r0 = i5Var.u;
        s0 = i5Var.v;
        t0 = i5Var.w;
        u0 = i5Var.x;
        v0 = i5Var.y;
        w0 = i5Var.z;
        x0 = new HashSet(i5Var.A);
        y0 = i5Var.e;
        z0 = i5Var.f;
        A0 = i5Var.h;
        B0 = i5Var.i;
        C0 = i5Var.j;
        D0 = i5Var.k;
        E0 = i5Var.l;
        F0 = i5Var.m;
        G0 = i5Var.n;
        H0 = i5Var.p;
        I0 = i5Var.o;
    }

    public static void optOutAdvertisingID(Context context, boolean z2) {
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
            editorEdit.putBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, z2);
            editorEdit.apply();
            if (Tapjoy.isConnected() || Tapjoy.isLimitedConnected()) {
                if (!z2) {
                    if (com.tapjoy.internal.a.b(b0) || b0.equals("00000000-0000-0000-0000-000000000000")) {
                        U0 = false;
                        new Thread(new b()).start();
                        return;
                    }
                    return;
                }
                b0 = "";
                TapjoyGpsHelper tapjoyGpsHelper = Y;
                if (tapjoyGpsHelper != null) {
                    tapjoyGpsHelper.resetAdvertisingID();
                    z6.r.a(b0, true);
                }
            }
        }
    }

    public static void requestLimitedTapjoyConnect(Context context, String str, TJConnectListener tJConnectListener) throws TapjoyIntegrationException {
        p5.a aVar;
        try {
            int length = str.length();
            if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
                throw new IllegalArgumentException("The given API key was malformed.");
            }
            try {
                byte[] bArrDecode = Base64.decode(str, 8);
                int length2 = bArrDecode.length;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                int length3 = bArrDecode.length - 4;
                int i2 = byteBufferWrap.getInt(length3);
                CRC32 crc32 = new CRC32();
                crc32.update(bArrDecode, 0, length3);
                if (i2 != ((int) crc32.getValue())) {
                    throw new IllegalArgumentException("The given API key was invalid.");
                }
                String string = new UUID(byteBufferWrap.getLong(0), byteBufferWrap.getLong(8)).toString();
                byte b2 = byteBufferWrap.get(16);
                byte b3 = byteBufferWrap.get(17);
                p5.a[] aVarArrValues = p5.a.values();
                int length4 = aVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length4) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i3];
                    if (aVar.f1884a == b3) {
                        break;
                    } else {
                        i3++;
                    }
                }
                String strSubstring = str.substring(24, 44);
                if (b2 != 1) {
                    if (b2 != 2 || aVar != p5.a.SDK_ANDROID) {
                        throw new IllegalArgumentException("The given API key was not supported.");
                    }
                    if (length2 < 57) {
                        throw new IllegalArgumentException("The given API key was invalid.");
                    }
                    byte[] bArr = new byte[12];
                    System.arraycopy(bArrDecode, 33, bArr, 0, 12);
                    TapjoyUtil.convertToHex(bArr);
                }
                if (aVar != p5.a.SDK_ANDROID) {
                    throw new IllegalArgumentException("The given API key was not for Android.");
                }
                P0 = string;
                Q0 = strSubstring;
                if (e == null) {
                    e = new TapjoyConnectCore();
                }
                T0 = tJConnectListener;
                e.b(context);
                TapjoyLog.d("TapjoyConnect", "requestTapjoyConnect function complete");
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("The given API key was malformed.", e2);
            }
        } catch (IllegalArgumentException e3) {
            TapjoyLog.d("TapjoyConnect", e3.getMessage());
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) throws TapjoyIntegrationException {
        String strConvertToHex;
        p5.a aVar;
        try {
            int length = str.length();
            if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
                throw new IllegalArgumentException("The given API key was malformed.");
            }
            try {
                byte[] bArrDecode = Base64.decode(str, 8);
                int length2 = bArrDecode.length;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                int length3 = bArrDecode.length - 4;
                int i2 = byteBufferWrap.getInt(length3);
                CRC32 crc32 = new CRC32();
                crc32.update(bArrDecode, 0, length3);
                if (i2 != ((int) crc32.getValue())) {
                    throw new IllegalArgumentException("The given API key was invalid.");
                }
                String string = new UUID(byteBufferWrap.getLong(0), byteBufferWrap.getLong(8)).toString();
                byte b2 = byteBufferWrap.get(16);
                byte b3 = byteBufferWrap.get(17);
                p5.a[] aVarArrValues = p5.a.values();
                int length4 = aVarArrValues.length;
                int i3 = 0;
                while (true) {
                    strConvertToHex = null;
                    if (i3 >= length4) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i3];
                    if (aVar.f1884a == b3) {
                        break;
                    } else {
                        i3++;
                    }
                }
                String strSubstring = str.substring(24, 44);
                if (b2 != 1) {
                    if (b2 != 2 || aVar != p5.a.SDK_ANDROID) {
                        throw new IllegalArgumentException("The given API key was not supported.");
                    }
                    if (length2 < 57) {
                        throw new IllegalArgumentException("The given API key was invalid.");
                    }
                    byte[] bArr = new byte[12];
                    System.arraycopy(bArrDecode, 33, bArr, 0, 12);
                    strConvertToHex = TapjoyUtil.convertToHex(bArr);
                }
                if (aVar != p5.a.SDK_ANDROID) {
                    throw new IllegalArgumentException("The given API key was not for Android.");
                }
                d = str;
                t = string;
                K = strSubstring;
                L = strConvertToHex;
                if (hashtable != null) {
                    g0.putAll(hashtable);
                    z5.b().a(hashtable);
                }
                z6.d(context).j = str;
                g = tJConnectListener;
                if (e == null) {
                    e = new TapjoyConnectCore();
                }
                e.a(context);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("The given API key was malformed.", e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    public static void setCustomParameter(String str) {
        B = str;
    }

    public static void setPlugin(String str) {
        M = str;
    }

    public static void setSDKType(String str) {
        N = str;
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        A = str;
        h = tJSetUserIDListener;
        StringBuilder sbA = w1.a("URL parameters: ");
        sbA.append(getURLParams());
        TapjoyLog.d("TapjoyConnect", sbA.toString());
        new Thread(new a()).start();
    }

    public static void setViewShowing(boolean z2) {
        if (z2) {
            h0.put("", 1);
        } else {
            h0.clear();
        }
    }

    public static void viewDidClose(String str) {
        TapjoyLog.d("TapjoyConnect", "viewDidClose: " + str);
        h0.remove(str);
        s5.e.notifyObservers();
    }

    public static void viewWillOpen(String str, int i2) {
        TapjoyLog.d("TapjoyConnect", "viewWillOpen: " + str);
        h0.put(str, Integer.valueOf(i2));
    }

    public void actionComplete(String str) {
        TapjoyLog.i("TapjoyConnect", "actionComplete: " + str);
        Map<String, String> mapF = f();
        TapjoyUtil.safePut(mapF, "app_id", str, true);
        mapF.putAll(getTimeStampAndVerifierParams());
        TapjoyLog.d("TapjoyConnect", "PPA URL parameters: " + mapF);
        new Thread(new PPAThread(mapF)).start();
    }

    public void appPause() {
        this.f1724a = true;
    }

    public void appResume() {
        if (this.f1724a) {
            e();
            this.f1724a = false;
        }
    }

    public final void b(Context context) {
        try {
            c(context);
            new Thread(new u4(this)).start();
        } catch (TapjoyIntegrationException e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e2.getMessage()));
            c();
            s5.b.notifyObservers(Boolean.FALSE);
        } catch (TapjoyException e3) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e3.getMessage()));
            c();
            s5.b.notifyObservers(Boolean.FALSE);
        }
    }

    public final void c() {
        TJConnectListener tJConnectListener = T0;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    public void completeConnectCall() {
        boolean z2;
        String connectResult;
        TapjoyLog.d("TapjoyConnect", "starting connect call...");
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (isConnected() || (connectResult = TapjoyAppSettings.getInstance().getConnectResult(d(), p.a())) == null || !a(connectResult, true)) {
            z2 = false;
        } else {
            TapjoyLog.i("TapjoyConnect", "Connect using stored connect result");
            W = true;
            TJConnectListener tJConnectListener = g;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            s5.f1906a.notifyObservers();
            z2 = true;
        }
        TapjoyHttpURLResponse responseFromURL = f.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, getURLParams());
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            if (!z2) {
                b();
            }
            s5.b.notifyObservers(Boolean.FALSE);
            return;
        }
        if (!a(responseFromURL.response, false)) {
            if (!z2) {
                b();
            }
            s5.b.notifyObservers(Boolean.FALSE);
            return;
        }
        TapjoyLog.i("TapjoyConnect", "Successfully connected to Tapjoy");
        W = true;
        for (Map.Entry<String, String> entry : getGenericURLParams().entrySet()) {
            TapjoyLog.d("TapjoyConnect", entry.getKey() + ": " + entry.getValue());
        }
        if (!z2) {
            TJConnectListener tJConnectListener2 = g;
            if (tJConnectListener2 != null) {
                tJConnectListener2.onConnectSuccess();
            }
            s5.f1906a.notifyObservers();
        }
        s5.b.notifyObservers(Boolean.TRUE);
    }

    public void completeLimitedConnectCall() throws Throwable {
        String str;
        z0 z0VarB;
        String str2;
        String str3;
        String str4;
        Object obj;
        int length;
        p5.a aVar;
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        Map<String, String> limitedURLParams = getLimitedURLParams();
        z0 z0Var = null;
        TapjoyHttpURLResponse responseFromURL = f.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, limitedURLParams);
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            c();
            s5.b.notifyObservers(Boolean.FALSE);
            return;
        }
        try {
            try {
                z0VarB = z0.b(responseFromURL.response);
                try {
                    try {
                        Map<String, Object> mapD = z0VarB.d();
                        String str5 = (String) mapD.get("override_service_url");
                        str2 = "";
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            getInstance().a(TapjoyConnectFlag.SERVICE_URL, str5);
                        }
                        str = (String) mapD.get(TapjoyConstants.TJC_APP_GROUP_ID);
                        if (str == null) {
                            str = "";
                        }
                        str3 = (String) mapD.get(TapjoyConstants.TJC_STORE);
                        if (str3 == null) {
                            str3 = "";
                        }
                        str4 = (String) mapD.get(TapjoyConstants.TJC_ANALYTICS_API_KEY);
                        if (str4 == null) {
                            str4 = "";
                        }
                        obj = mapD.get("user_token_config");
                        String str6 = (String) mapD.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID);
                        if (str6 != null) {
                            str2 = str6;
                        }
                        length = str4.length();
                        try {
                        } catch (IOException e2) {
                            e = e2;
                        } catch (RuntimeException e3) {
                            e = e3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z0Var = z0VarB;
                        i6.a(z0Var);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    str = "TapjoyConnect";
                } catch (RuntimeException e5) {
                    e = e5;
                    str = "TapjoyConnect";
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
            str = "TapjoyConnect";
        } catch (RuntimeException e7) {
            e = e7;
            str = "TapjoyConnect";
        } catch (Throwable th3) {
            th = th3;
        }
        if (!str4.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        try {
            byte[] bArrDecode = Base64.decode(str4, 8);
            int length2 = bArrDecode.length;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            int length3 = bArrDecode.length - 4;
            int i2 = byteBufferWrap.getInt(length3);
            CRC32 crc32 = new CRC32();
            crc32.update(bArrDecode, 0, length3);
            String str7 = str2;
            if (i2 != ((int) crc32.getValue())) {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
            try {
                String string = new UUID(byteBufferWrap.getLong(0), byteBufferWrap.getLong(8)).toString();
                byte b2 = byteBufferWrap.get(16);
                byte b3 = byteBufferWrap.get(17);
                p5.a[] aVarArrValues = p5.a.values();
                int length4 = aVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length4) {
                        aVar = null;
                        break;
                    }
                    try {
                        aVar = aVarArrValues[i3];
                        if (aVar.f1884a == b3) {
                            break;
                        } else {
                            i3++;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        z0Var = z0VarB;
                        str = "TapjoyConnect";
                    } catch (RuntimeException e9) {
                        e = e9;
                        z0Var = z0VarB;
                        str = "TapjoyConnect";
                        TapjoyLog.v(str, e.getMessage());
                        i6.a(z0Var);
                        c();
                        s5.b.notifyObservers(Boolean.FALSE);
                    }
                }
                str4.substring(24, 44);
                if (b2 != 1) {
                    if (b2 != 2 || aVar != p5.a.SDK_ANDROID) {
                        throw new IllegalArgumentException("The given API key was not supported.");
                    }
                    if (length2 < 57) {
                        throw new IllegalArgumentException("The given API key was invalid.");
                    }
                    byte[] bArr = new byte[12];
                    System.arraycopy(bArrDecode, 33, bArr, 0, 12);
                    TapjoyUtil.convertToHex(bArr);
                }
                if (aVar != p5.a.RPC_ANALYTICS) {
                    throw new IOException("Invalid analytics_api_key");
                }
                p5.a(string);
                R0 = str;
                R = str3;
                T = str7;
                if (obj instanceof Map) {
                    U = (Map) obj;
                }
                ((a1) z0VarB).close();
                i6.a(null);
                TapjoyLog.i("TapjoyConnect", "Successfully connected to Tapjoy");
                S0 = true;
                for (Map.Entry<String, String> entry : getLimitedGenericURLParams().entrySet()) {
                    TapjoyLog.d("TapjoyConnect", entry.getKey() + ": " + entry.getValue());
                }
                TJConnectListener tJConnectListener = T0;
                if (tJConnectListener != null) {
                    tJConnectListener.onConnectSuccess();
                }
                s5.f1906a.notifyObservers();
                s5.b.notifyObservers(Boolean.TRUE);
                return;
            } catch (IOException e10) {
                e = e10;
                str = "TapjoyConnect";
                z0Var = z0VarB;
            } catch (RuntimeException e11) {
                e = e11;
                str = "TapjoyConnect";
                z0Var = z0VarB;
                TapjoyLog.v(str, e.getMessage());
                i6.a(z0Var);
                c();
                s5.b.notifyObservers(Boolean.FALSE);
            }
            TapjoyLog.v(str, e.getMessage());
            i6.a(z0Var);
            c();
            s5.b.notifyObservers(Boolean.FALSE);
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException("The given API key was malformed.", e12);
        }
        z0Var = z0VarB;
        TapjoyLog.v(str, e.getMessage());
        i6.a(z0Var);
        c();
        s5.b.notifyObservers(Boolean.FALSE);
    }

    public boolean isInitialized() {
        return this.b;
    }

    public void release() {
        e = null;
        f = null;
        TapjoyLog.d("TapjoyConnect", "Releasing core static instance.");
    }

    public final void a(Context context) {
        try {
            c(context);
            new Thread(new s4(this)).start();
            this.b = true;
        } catch (TapjoyIntegrationException e2) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e2.getMessage()));
            b();
            s5.b.notifyObservers(Boolean.FALSE);
        } catch (TapjoyException e3) {
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e3.getMessage()));
            b();
            s5.b.notifyObservers(Boolean.FALSE);
        }
    }

    public final boolean c(Context context) throws TapjoyException {
        c = context;
        X = context.getPackageManager();
        e6.h.a(context);
        z5.d.a(context);
        Y = new TapjoyGpsHelper(c);
        if (f == null) {
            f = new TapjoyURLConnection();
        }
        if (g0 == null) {
            g0 = new Hashtable<>();
        }
        try {
            PackageManager packageManager = X;
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    for (String str : TapjoyConnectFlag.FLAG_ARRAY) {
                        String string = applicationInfo.metaData.getString("tapjoy." + str);
                        if (string != null) {
                            TapjoyLog.d("TapjoyConnect", "Found manifest flag: " + str + ", " + string);
                            a(str, string);
                        }
                    }
                    TapjoyLog.d("TapjoyConnect", "Metadata successfully loaded");
                } else {
                    TapjoyLog.d("TapjoyConnect", "No metadata present.");
                }
            }
        } catch (Exception e2) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            StringBuilder sbA = w1.a("Error reading manifest meta-data -- ");
            sbA.append(e2.toString());
            TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(errorType, sbA.toString()));
        }
        int identifier = c.getResources().getIdentifier("raw/tapjoy_config", null, c.getPackageName());
        if (identifier != 0) {
            try {
                Properties properties = new Properties();
                properties.load(c.getResources().openRawResource(identifier));
                Enumeration enumerationKeys = properties.keys();
                while (enumerationKeys.hasMoreElements()) {
                    try {
                        String str2 = (String) enumerationKeys.nextElement();
                        a(str2, (String) properties.get(str2));
                    } catch (ClassCastException unused) {
                        TapjoyLog.e("TapjoyConnect", "Error parsing configuration properties in tapjoy_config.txt");
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (TextUtils.isEmpty(getConnectFlagValue("unit_test_mode"))) {
            try {
                List listAsList = Arrays.asList(X.getPackageInfo(c.getPackageName(), 1).activities);
                if (listAsList != null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        a((ActivityInfo) it.next());
                    }
                }
                if (k.size() != 0) {
                    if (k.size() == 1) {
                        StringBuilder sbA2 = w1.a("Missing ");
                        sbA2.append(k.size());
                        sbA2.append(" dependency class in manifest: ");
                        sbA2.append(k.toString());
                        throw new TapjoyIntegrationException(sbA2.toString());
                    }
                    StringBuilder sbA3 = w1.a("Missing ");
                    sbA3.append(k.size());
                    sbA3.append(" dependency classes in manifest: ");
                    sbA3.append(k.toString());
                    throw new TapjoyIntegrationException(sbA3.toString());
                }
                Vector vector = new Vector();
                for (String str3 : TapjoyConstants.dependencyPermissions) {
                    if (X.checkPermission(str3, c.getPackageName()) != 0) {
                        vector.add(str3);
                    }
                }
                if (vector.size() != 0) {
                    if (vector.size() == 1) {
                        StringBuilder sbA4 = w1.a("Missing 1 permission in manifest: ");
                        sbA4.append(vector.toString());
                        throw new TapjoyIntegrationException(sbA4.toString());
                    }
                    StringBuilder sbA5 = w1.a("Missing ");
                    sbA5.append(vector.size());
                    sbA5.append(" permissions in manifest: ");
                    sbA5.append(vector.toString());
                    throw new TapjoyIntegrationException(sbA5.toString());
                }
                Vector vector2 = new Vector();
                if (vector2.size() != 0) {
                    if (vector2.size() == 1) {
                        StringBuilder sbA6 = w1.a("WARNING -- ");
                        sbA6.append(vector2.toString());
                        sbA6.append(" permission was not found in manifest. The exclusion of this permission could cause problems.");
                        TapjoyLog.w("TapjoyConnect", sbA6.toString());
                    } else {
                        StringBuilder sbA7 = w1.a("WARNING -- ");
                        sbA7.append(vector2.toString());
                        sbA7.append(" permissions were not found in manifest. The exclusion of these permissions could cause problems.");
                        TapjoyLog.w("TapjoyConnect", sbA7.toString());
                    }
                }
                try {
                    try {
                        Class.forName("com.tapjoy.TJAdUnitJSBridge").getMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, Boolean.class);
                        if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true")) {
                            TapjoyLog.i("TapjoyConnect", "Skipping integration check for Google Play Services and Advertising ID. Do this only if you do not have access to Google Play Services.");
                        } else {
                            Y.checkGooglePlayIntegration();
                        }
                    } catch (NoSuchMethodException unused3) {
                        throw new TapjoyIntegrationException("Try configuring Proguard or other code obfuscators to ignore com.tapjoy classes. Visit http://dev.tapjoy.comfor more information.");
                    }
                } catch (ClassNotFoundException unused4) {
                    throw new TapjoyIntegrationException("ClassNotFoundException: com.tapjoy.TJAdUnitJSBridge was not found.");
                }
            } catch (Exception unused5) {
                throw new TapjoyIntegrationException("Error while getting package info.");
            }
        }
        String strA = h6.a(c);
        l = strA;
        if (strA != null) {
            l = strA.toLowerCase();
        }
        try {
            u = X.getPackageInfo(c.getPackageName(), 0).versionName;
            r = TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
            C = TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
            p = Build.MODEL;
            q = Build.MANUFACTURER;
            s = Build.VERSION.RELEASE;
            v = "13.0.1";
            w = TapjoyConstants.TJC_BRIDGE_VERSION_NUMBER;
            try {
                TapjoyDisplayMetricsUtil tapjoyDisplayMetricsUtil = new TapjoyDisplayMetricsUtil(c);
                x = tapjoyDisplayMetricsUtil.getScreenDensityDPI();
                y = tapjoyDisplayMetricsUtil.getScreenDensityScale();
                z = tapjoyDisplayMetricsUtil.getScreenLayoutSize();
            } catch (Exception e3) {
                StringBuilder sbA8 = w1.a("Error getting screen density/dimensions/layout: ");
                sbA8.append(e3.toString());
                TapjoyLog.e("TapjoyConnect", sbA8.toString());
            }
            TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    D = telephonyManager.getNetworkOperatorName();
                    E = telephonyManager.getNetworkCountryIso();
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (networkOperator != null && (networkOperator.length() == 5 || networkOperator.length() == 6)) {
                        F = networkOperator.substring(0, 3);
                        G = networkOperator.substring(3);
                    }
                } catch (SecurityException unused6) {
                    TapjoyLog.i("TapjoyConnect", "Error accessing network operator info");
                }
            }
            SharedPreferences sharedPreferences = c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            String string2 = sharedPreferences.getString(TapjoyConstants.PREF_INSTALL_ID, "");
            if (string2 == null || string2.length() == 0) {
                try {
                    string2 = TapjoyUtil.SHA256(UUID.randomUUID().toString() + System.currentTimeMillis());
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(TapjoyConstants.PREF_INSTALL_ID, string2);
                    editorEdit.apply();
                } catch (Exception e4) {
                    TapjoyLog.e("h6", "Error generating install id: " + e4);
                }
            }
            n = string2;
            SharedPreferences sharedPreferences2 = c.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            String string3 = sharedPreferences2.getString(TapjoyConstants.PREF_TEST_ID, "");
            if (string3 == null || string3.length() == 0) {
                try {
                    string3 = UUID.randomUUID().toString();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putString(TapjoyConstants.PREF_TEST_ID, string3);
                    editorEdit2.apply();
                } catch (Exception e5) {
                    TapjoyLog.e("h6", "Error generating test id: " + e5);
                }
            }
            o = string3;
            StringBuilder sbA9 = w1.a("Tapjoy device test id: ");
            sbA9.append(o);
            TapjoyLog.i("TapjoyConnect", sbA9.toString());
            if (getConnectFlagValue(TapjoyConnectFlag.STORE_NAME) != null && getConnectFlagValue(TapjoyConnectFlag.STORE_NAME).length() > 0) {
                J = getConnectFlagValue(TapjoyConnectFlag.STORE_NAME);
                if (!new ArrayList(Arrays.asList(TapjoyConnectFlag.STORE_ARRAY)).contains(J)) {
                    StringBuilder sbA10 = w1.a("Warning -- undefined STORE_NAME: ");
                    sbA10.append(J);
                    TapjoyLog.w("TapjoyConnect", sbA10.toString());
                }
            }
            try {
                P = a(J);
            } catch (Exception e6) {
                StringBuilder sbA11 = w1.a("Error trying to detect store intent on devicee: ");
                sbA11.append(e6.toString());
                TapjoyLog.e("TapjoyConnect", sbA11.toString());
            }
            k();
            if (getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).length() > 0) {
                e0 = getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).length() > 0) {
                d0 = getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.USER_ID) != null && getConnectFlagValue(TapjoyConnectFlag.USER_ID).length() > 0) {
                StringBuilder sbA12 = w1.a("Setting userID to: ");
                sbA12.append(getConnectFlagValue(TapjoyConnectFlag.USER_ID));
                TapjoyLog.i("TapjoyConnect", sbA12.toString());
                setUserID(getConnectFlagValue(TapjoyConnectFlag.USER_ID), null);
            }
            O = TapjoyUtil.getRedirectDomain(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
            if (g0 != null) {
                TapjoyLog.i("TapjoyConnect", "Connect Flags:");
                TapjoyLog.i("TapjoyConnect", "--------------------");
                for (Map.Entry<String, Object> entry : g0.entrySet()) {
                    StringBuilder sbA13 = w1.a("key: ");
                    sbA13.append(entry.getKey());
                    sbA13.append(", value: ");
                    sbA13.append(Uri.encode(entry.getValue().toString()));
                    TapjoyLog.i("TapjoyConnect", sbA13.toString());
                }
                StringBuilder sbA14 = w1.a("hostURL: [");
                sbA14.append(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
                sbA14.append("]");
                TapjoyLog.i("TapjoyConnect", sbA14.toString());
                TapjoyLog.i("TapjoyConnect", "redirectDomain: [" + O + "]");
                TapjoyLog.i("TapjoyConnect", "--------------------");
            }
            return true;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new TapjoyException(e7.getMessage());
        }
    }

    public final void b() {
        if (!TextUtils.isEmpty(L)) {
            z6.r.a(c, d, "13.0.1", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, L, K);
        }
        TJConnectListener tJConnectListener = g;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    public final void a() {
        if (U0) {
            return;
        }
        try {
            Y.loadAdvertisingId(!j());
            if (Y.isGooglePlayServicesAvailable() && Y.isGooglePlayManifestConfigured()) {
                a0 = Y.getDeviceGooglePlayServicesVersion();
                Z = Y.getPackagedGooglePlayServicesVersion();
            }
            if (Y.isAdIdAvailable()) {
                c0 = Y.isAdTrackingEnabled();
                b0 = Y.getAdvertisingId();
                z6.r.a(b0, !c0);
            }
            U0 = true;
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("Error fetching advertising id: ");
            sbA.append(e2.toString());
            TapjoyLog.i("TapjoyConnect", sbA.toString());
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final boolean b(String str) throws Throwable {
        RuntimeException e2;
        z0 z0VarB;
        IOException e3;
        ?? r1 = 0;
        try {
            try {
                z0VarB = z0.b(str);
                try {
                } catch (IOException e4) {
                    e3 = e4;
                    TapjoyLog.v("TapjoyConnect", e3.getMessage());
                    i6.a(z0VarB);
                } catch (RuntimeException e5) {
                    e2 = e5;
                    TapjoyLog.v("TapjoyConnect", e2.getMessage());
                    i6.a(z0VarB);
                }
            } catch (Throwable th) {
                th = th;
                r1 = str;
                i6.a(r1);
                throw th;
            }
        } catch (IOException e6) {
            e3 = e6;
            z0VarB = null;
        } catch (RuntimeException e7) {
            e2 = e7;
            z0VarB = null;
        } catch (Throwable th2) {
            th = th2;
            i6.a(r1);
            throw th;
        }
        if (z0VarB.a()) {
            a1 a1Var = (a1) z0VarB;
            a1Var.B();
            TapjoyLog.d("TapjoyConnect", "Successfully sent completed Pay-Per-Action to Tapjoy server.");
            a1Var.close();
            i6.a(null);
            return true;
        }
        ((a1) z0VarB).close();
        i6.a(null);
        TapjoyLog.e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Completed Pay-Per-Action call failed."));
        return false;
    }

    public final void a(ActivityInfo activityInfo) throws TapjoyIntegrationException {
        if (k.contains(activityInfo.name)) {
            int iIndexOf = k.indexOf(activityInfo.name);
            try {
                Class.forName(k.get(iIndexOf));
                Vector vector = new Vector();
                if ((activityInfo.configChanges & 128) != 128) {
                    vector.add(TJAdUnitConstants.String.ORIENTATION);
                }
                if ((activityInfo.configChanges & 32) != 32) {
                    vector.add("keyboardHidden");
                }
                if (vector.size() != 0) {
                    if (vector.size() == 1) {
                        throw new TapjoyIntegrationException(vector.toString() + " property is not specified in manifest configChanges for " + k.get(iIndexOf));
                    }
                    throw new TapjoyIntegrationException(vector.toString() + " properties are not specified in manifest configChanges for " + k.get(iIndexOf));
                }
                if ((activityInfo.configChanges & 1024) != 1024) {
                    TapjoyLog.w("TapjoyConnect", "WARNING -- screenSize property is not specified in manifest configChanges for " + k.get(iIndexOf));
                }
                if (activityInfo.name.equals("com.tapjoy.TJAdUnitActivity") && (activityInfo.flags & 512) != 512) {
                    throw new TapjoyIntegrationException("'hardwareAccelerated' property not specified in manifest for " + k.get(iIndexOf));
                }
                k.remove(iIndexOf);
            } catch (ClassNotFoundException unused) {
                StringBuilder sbA = w1.a("[ClassNotFoundException] Could not find dependency class ");
                sbA.append(k.get(iIndexOf));
                throw new TapjoyIntegrationException(sbA.toString());
            }
        }
    }

    public static void requestTapjoyConnect(Context context, String str) throws TapjoyIntegrationException {
        requestTapjoyConnect(context, str, null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable) throws TapjoyIntegrationException {
        requestTapjoyConnect(context, str, hashtable, null);
    }

    public static boolean a(String str, boolean z2) throws Throwable {
        z0 z0Var;
        z0 z0VarB;
        Map<String, Object> mapD;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        Object obj2;
        int length;
        p5.a aVar;
        Map map;
        try {
            try {
                z0VarB = z0.b(str);
                try {
                    mapD = z0VarB.d();
                    str2 = (String) mapD.get("override_service_url");
                    str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            getInstance().a(TapjoyConnectFlag.SERVICE_URL, str2);
                        } catch (IOException e2) {
                            e = e2;
                            z0Var = z0VarB;
                        } catch (RuntimeException e3) {
                            e = e3;
                            z0Var = z0VarB;
                            TapjoyLog.v("TapjoyConnect", e.getMessage());
                            i6.a(z0Var);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            z0Var = z0VarB;
                            i6.a(z0Var);
                            throw th;
                        }
                    }
                    if (mapD.containsKey(BEACON) && (map = (Map) mapD.get(BEACON)) != null && map.containsKey("enabled") && (map.get("enabled") instanceof Boolean)) {
                        if (Boolean.TRUE.equals((Boolean) map.get("enabled"))) {
                            y5.a(getURLParams(), (Map<String, Object>) map);
                        }
                    }
                    str4 = (String) mapD.get(TapjoyConstants.TJC_APP_GROUP_ID);
                    if (str4 == null) {
                        str4 = "";
                    }
                    str5 = (String) mapD.get(TapjoyConstants.TJC_STORE);
                    if (str5 == null) {
                        str5 = "";
                    }
                    str6 = (String) mapD.get(TapjoyConstants.TJC_ANALYTICS_API_KEY);
                    if (str6 == null) {
                        str6 = "";
                    }
                    obj = mapD.get("user_token_config");
                    String str7 = (String) mapD.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID);
                    if (str7 != null) {
                        str3 = str7;
                    }
                    obj2 = mapD.get("cache_max_age");
                    length = str6.length();
                } catch (IOException e4) {
                    e = e4;
                } catch (RuntimeException e5) {
                    e = e5;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e6) {
            e = e6;
            z0Var = null;
        } catch (RuntimeException e7) {
            e = e7;
            z0Var = null;
        } catch (Throwable th4) {
            th = th4;
            z0Var = null;
        }
        try {
        } catch (IOException e8) {
            e = e8;
            z0Var = z0VarB;
        } catch (RuntimeException e9) {
            e = e9;
            z0Var = z0VarB;
            TapjoyLog.v("TapjoyConnect", e.getMessage());
            i6.a(z0Var);
            return false;
        } catch (Throwable th5) {
            th = th5;
            z0Var = z0VarB;
            i6.a(z0Var);
            throw th;
        }
        if (str6.matches("[A-Za-z0-9\\-_]*") && length >= 60 && (length & 3) == 0) {
            try {
                byte[] bArrDecode = Base64.decode(str6, 8);
                int length2 = bArrDecode.length;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                int length3 = bArrDecode.length - 4;
                int i2 = byteBufferWrap.getInt(length3);
                CRC32 crc32 = new CRC32();
                crc32.update(bArrDecode, 0, length3);
                if (i2 == ((int) crc32.getValue())) {
                    String string = new UUID(byteBufferWrap.getLong(0), byteBufferWrap.getLong(8)).toString();
                    byte b2 = byteBufferWrap.get(16);
                    byte b3 = byteBufferWrap.get(17);
                    p5.a[] aVarArrValues = p5.a.values();
                    int length4 = aVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length4) {
                            aVar = null;
                            break;
                        }
                        aVar = aVarArrValues[i3];
                        p5.a[] aVarArr = aVarArrValues;
                        if (aVar.f1884a == b3) {
                            break;
                        }
                        i3++;
                        aVarArrValues = aVarArr;
                    }
                    String strSubstring = str6.substring(24, 44);
                    if (b2 != 1) {
                        if (b2 != 2 || aVar != p5.a.SDK_ANDROID) {
                            throw new IllegalArgumentException("The given API key was not supported.");
                        }
                        if (length2 >= 57) {
                            byte[] bArr = new byte[12];
                            System.arraycopy(bArrDecode, 33, bArr, 0, 12);
                            TapjoyUtil.convertToHex(bArr);
                        } else {
                            throw new IllegalArgumentException("The given API key was invalid.");
                        }
                    }
                    if (aVar == p5.a.RPC_ANALYTICS) {
                        z6.r.a(c, str6, "13.0.1", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, p5.a(string), strSubstring);
                        Q = str4;
                        R = str5;
                        S = str6;
                        T = str3;
                        if (obj instanceof Map) {
                            U = (Map) obj;
                        }
                        if (!TextUtils.isEmpty(str2) && i) {
                            setUserID(A, null);
                        }
                        ((a1) z0VarB).close();
                        if (!z2) {
                            try {
                                a(str, obj2);
                                z5.d.a(mapD.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS));
                            } catch (IOException e10) {
                                e = e10;
                                z0Var = null;
                            } catch (RuntimeException e11) {
                                e = e11;
                                z0Var = null;
                                TapjoyLog.v("TapjoyConnect", e.getMessage());
                                i6.a(z0Var);
                                return false;
                            } catch (Throwable th6) {
                                th = th6;
                                z0Var = null;
                                i6.a(z0Var);
                                throw th;
                            }
                        }
                        i6.a(null);
                        return true;
                    }
                    throw new IOException("Invalid analytics_api_key");
                }
                throw new IllegalArgumentException("The given API key was invalid.");
            } catch (IllegalArgumentException e12) {
                throw new IllegalArgumentException("The given API key was malformed.", e12);
            }
            z0Var = z0VarB;
        } else {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        TapjoyLog.v("TapjoyConnect", e.getMessage());
        i6.a(z0Var);
        return false;
    }

    public boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str.length() >= 1) {
            return false;
        }
        intent.setData(Uri.parse("market://details"));
        return X.queryIntentActivities(intent, 0).size() > 0;
    }

    public final void a(String str, String str2) {
        if ((str.equals(TapjoyConnectFlag.SERVICE_URL) || str.equals(TapjoyConnectFlag.PLACEMENT_URL)) && !str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        g0.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r5, java.lang.Object r6) {
        /*
            boolean r0 = r6 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L11
            java.lang.String r6 = r6.trim()     // Catch: java.lang.NumberFormatException -> L11
            long r3 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L11
            goto L1f
        L11:
            goto L1e
        L13:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.NumberFormatException -> L11
            long r3 = r6.longValue()     // Catch: java.lang.NumberFormatException -> L11
            goto L1f
        L1e:
            r3 = r1
        L1f:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 > 0) goto L2b
            com.tapjoy.TapjoyAppSettings r5 = com.tapjoy.TapjoyAppSettings.getInstance()
            r5.removeConnectResult()
            goto L3f
        L2b:
            com.tapjoy.TapjoyAppSettings r6 = com.tapjoy.TapjoyAppSettings.getInstance()
            java.lang.String r0 = d()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            long r1 = com.tapjoy.internal.p.a()
            long r1 = r1 + r3
            r6.saveConnectResultAndParams(r5, r0, r1)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.a(java.lang.String, java.lang.Object):void");
    }

    public static /* synthetic */ boolean c(String str) {
        String nodeTrimValue;
        Document documentBuildDocument = TapjoyUtil.buildDocument(str);
        return documentBuildDocument == null || ((nodeTrimValue = TapjoyUtil.getNodeTrimValue(documentBuildDocument.getElementsByTagName("Success"))) != null && nodeTrimValue.equals("true"));
    }
}
