package com.applovin.impl.mediation.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.utility.platform.Platform;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TreeMap<String, String> f1014a;
    private static final List<String> b;
    private static JSONArray c;
    private static final Object d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f1014a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", Platform.MANUFACTURER_AMAZON);
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.NimbusMediationAdapter", "Nimbus");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.TaboolaMediationAdapter", "Taboola");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        b = new ArrayList(treeMap.keySet());
    }

    public static JSONArray a(p pVar) {
        if (c != null) {
            b(pVar);
            return c;
        }
        c = new JSONArray();
        for (String str : b) {
            MaxAdapter maxAdapterB = b(str, pVar);
            if (maxAdapterB != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, f1014a.get(str));
                    jSONObject.put("class", str);
                    jSONObject.put("sdk_version", maxAdapterB.getSdkVersion());
                    jSONObject.put(ClientCookie.VERSION_ATTR, maxAdapterB.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (d) {
                    c.put(jSONObject);
                }
            }
        }
        return c;
    }

    public static JSONObject a(String str, p pVar) {
        JSONArray jSONArrayA = a(pVar);
        for (int i = 0; i < jSONArrayA.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayA, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", null))) {
                return jSONObject;
            }
        }
        return null;
    }

    private static void b(p pVar) {
        MaxAdapter maxAdapterB;
        for (int i = 0; i < c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (maxAdapterB = b(string, pVar)) != null) {
                String sdkVersion = maxAdapterB.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static o.a a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            return o.a.MEDIATION_INTERSTITIAL;
        }
        if (maxAdFormat == MaxAdFormat.APP_OPEN) {
            return o.a.MEDIATION_APP_OPEN;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            return o.a.MEDIATION_INCENTIVIZED;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL) {
            return o.a.MEDIATION_REWARDED_INTERSTITIAL;
        }
        return o.a.MEDIATION_BANNER;
    }

    public static MaxAdapter b(String str, p pVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(pVar.K());
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static boolean a(Object obj) {
        return (obj instanceof e) && StringUtils.isValidString(((e) obj).N());
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.mediation.a.a) && "APPLOVIN".equals(((com.applovin.impl.mediation.a.a) obj).Z());
    }

    public static AppLovinSdkUtils.Size a(int i, MaxAdFormat maxAdFormat, Context context) {
        Display defaultDisplay;
        if (i < 0) {
            try {
                if (context instanceof Activity) {
                    defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
                } else {
                    defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = cls.getMethod("getWidth", null);
        Method method3 = cls.getMethod("getHeight", null);
        Object objInvoke = method.invoke(null, context, Integer.valueOf(i));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
    }
}
