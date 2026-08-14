package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    public final p coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static int getVersionCode() {
        return 11090099;
    }

    public void initializeSdk() {
    }

    public String getSdkKey() {
        return this.coreSdk.B();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.C();
    }

    public void setPluginVersion(String str) {
        this.coreSdk.b(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.c(str);
    }

    public String getUserIdentifier() {
        return this.coreSdk.o();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.D();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.r();
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.E();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.ak();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.G();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.H();
    }

    public AppLovinCFService getCFService() {
        return this.coreSdk.I();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.J();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.d(str);
    }

    public String getMediationProvider() {
        return this.coreSdk.s();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayA = c.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i = 0; i < jSONArrayA.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayA, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public void showMediationDebugger() {
        this.coreSdk.m();
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    public void showCreativeDebugger() {
        this.coreSdk.n();
    }

    public boolean isInitialized() {
        return this.coreSdk.d();
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = getInstance(context);
        if (appLovinSdk != null) {
            appLovinSdk.initializeSdk(sdkInitializationListener);
        } else {
            y.i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.ax();
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        return getInstance(e.a(context).a("applovin.sdk.key", ""), appLovinSdkSettings, context);
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (sdkInstancesLock) {
            Map<String, AppLovinSdk> map = sdkInstances;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            if (!TextUtils.isEmpty(str) && str.contains(File.separator)) {
                y.i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                if (!map.isEmpty()) {
                    return map.values().iterator().next();
                }
                str = str.replace(File.separator, "");
            }
            p pVar = new p();
            pVar.a(str, appLovinSdkSettings, context);
            AppLovinSdk appLovinSdk = new AppLovinSdk(pVar);
            pVar.a(appLovinSdk);
            appLovinSdkSettings.attachAppLovinSdk(pVar);
            map.put(str, appLovinSdk);
            return appLovinSdk;
        }
    }

    public boolean isEnabled() {
        return this.coreSdk.d();
    }

    private AppLovinSdk(p pVar) {
        this.coreSdk = pVar;
    }

    private static String getVersion() {
        return "11.9.0";
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances.values()) {
                appLovinSdk.coreSdk.b();
                appLovinSdk.coreSdk.j();
                if (bool != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'huc' to " + bool);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    appLovinSdk.coreSdk.L();
                    if (y.a()) {
                        appLovinSdk.coreSdk.L().c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    appLovinSdk.getEventService().trackEvent(AppLovinSdkExtraParameterKey.DO_NOT_SELL, CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    private static class a extends AppLovinSdkSettings {
        a(Context context) {
            super(context);
        }
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.aw() + '}';
    }
}
