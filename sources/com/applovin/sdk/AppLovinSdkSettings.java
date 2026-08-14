package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b.a.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1551a;
    private boolean b;
    private String g;
    private final TermsFlowSettings h;
    private p m;
    private String n;
    private boolean f = true;
    private final Map<String, Object> localSettings = CollectionUtils.map();
    private final Map<String, String> metaData = CollectionUtils.map();
    private List<String> i = Collections.emptyList();
    private List<String> j = Collections.emptyList();
    private final Map<String, String> k = CollectionUtils.map();
    private final Object l = new Object();
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;

    public interface TermsFlowSettings {
        Uri getPrivacyPolicyUri();

        Uri getTermsOfServiceUri();

        boolean isEnabled();

        void setEnabled(boolean z);

        void setPrivacyPolicyUri(Uri uri);

        void setTermsOfServiceUri(Uri uri);
    }

    public AppLovinSdkSettings(Context context) {
        this.n = "";
        this.f1551a = Utils.isVerboseLoggingEnabled(context);
        this.h = b.a(context);
        a(context);
        if (context != null) {
            this.n = context.getPackageName();
        }
    }

    public TermsFlowSettings getTermsFlowSettings() {
        return this.h;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        y.j("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    y.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.i = arrayList;
            return;
        }
        this.i = Collections.emptyList();
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.i;
    }

    public void setInitializationAdUnitIds(List<String> list) {
        y.j("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        y.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.j = arrayList;
            return;
        }
        this.j = Collections.emptyList();
    }

    public List<String> getInitializationAdUnitIds() {
        return this.j;
    }

    public void setVerboseLogging(boolean z) {
        y.j("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (Utils.isVerboseLoggingConfigured()) {
            y.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (Utils.isVerboseLoggingEnabled(null) != z) {
                y.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f1551a = z;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f1551a;
    }

    public boolean isMuted() {
        return this.b;
    }

    public void setMuted(boolean z) {
        y.j("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.b = z;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        y.j("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        this.c = z;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        y.j("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
        this.d = z;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.d;
    }

    public void setLocationCollectionEnabled(boolean z) {
        y.j("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z + ")");
        this.e = z;
    }

    public boolean isLocationCollectionEnabled() {
        return this.e;
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.l) {
            map = CollectionUtils.map(this.k);
        }
        return map;
    }

    public void setExtraParameter(String str, String str2) {
        y.j("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.m != null) {
                if (StringUtils.isValidString(strTrim)) {
                    this.m.av().a(true);
                    this.m.av().a(strTrim);
                } else {
                    this.m.av().a(false);
                    this.m.av().a((String) null);
                }
            } else {
                this.g = strTrim;
            }
        } else if ((AppLovinSdkExtraParameterKey.FILTER_AD_NETWORK.equals(str) || AppLovinSdkExtraParameterKey.ENABLE_SEQUENTIAL_CACHING.equals(str)) && !this.n.startsWith("com.unity.")) {
            return;
        }
        synchronized (this.l) {
            this.k.put(str, strTrim);
        }
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        y.j("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f = z;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f;
    }

    protected void attachAppLovinSdk(p pVar) {
        this.m = pVar;
        if (StringUtils.isValidString(this.g)) {
            pVar.av().a(true);
            pVar.av().a(this.g);
            this.g = null;
        }
    }

    private void a(Context context) {
        String rawResourceString = Utils.getRawResourceString(context.getResources().getIdentifier("applovin_sdk_settings", "raw", context.getPackageName()), context, null);
        Map<String, String> mapTryToStringMap = JsonUtils.tryToStringMap(StringUtils.isValidString(rawResourceString) ? JsonUtils.jsonObjectFromJsonString(rawResourceString, new JSONObject()) : new JSONObject());
        synchronized (this.l) {
            this.k.putAll(mapTryToStringMap);
        }
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f1551a + ", muted=" + this.b + ", testDeviceAdvertisingIds=" + this.i.toString() + ", initializationAdUnitIds=" + this.j.toString() + ", creativeDebuggerEnabled=" + this.c + ", exceptionHandlerEnabled=" + this.d + ", locationCollectionEnabled=" + this.e + '}';
    }
}
