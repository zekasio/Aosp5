package com.applovin.impl.mediation.debugger.b.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TJAdUnitConstants;
import cz.msebera.android.httpclient.util.VersionInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final Map<MaxAdFormat, String> A;
    private final boolean B;
    private final String C;
    private final Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1033a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final String n;
    private final String o;
    private final String p;
    private String q;
    private final String r;
    private final String s;
    private final String t;
    private final int u;
    private final List<MaxAdFormat> v;
    private final List<d> w;
    private final List<com.applovin.impl.mediation.debugger.b.c.a> x;
    private final List<String> y;
    private final c z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");

        private final String e;

        a(String str) {
            this.e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.e;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.b.c.b$b, reason: collision with other inner class name */
    public enum EnumC0065b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String f;
        private final int g;
        private final String h;

        EnumC0065b(String str, int i2, String str2) {
            this.f = str;
            this.g = i2;
            this.h = str2;
        }

        public String a() {
            return this.f;
        }

        public int b() {
            return this.g;
        }

        public String c() {
            return this.h;
        }
    }

    public b(JSONObject jSONObject, p pVar) {
        String str;
        String str2;
        boolean zEquals;
        boolean z;
        String string;
        String adapterVersion;
        String sdkVersion;
        List<MaxAdFormat> list;
        boolean zIsBeta;
        this.f1033a = pVar;
        this.n = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.o = JsonUtils.getString(jSONObject, "display_name", "");
        this.p = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.s = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.y = a(jSONObject);
        this.j = JsonUtils.getBoolean(jSONObject, "hide_if_missing", false).booleanValue();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.w = a(jSONObject2, pVar);
        this.z = new c(jSONObject2, pVar);
        this.m = JsonUtils.getBoolean(jSONObject2, "java_8_required", false).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "test_mode", new JSONObject());
        this.l = JsonUtils.getBoolean(jSONObject3, "false_coppa_required", false).booleanValue();
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "network_names", (JSONObject) null);
        if (jSONObject4 != null && jSONObject4.length() > 0) {
            Map<MaxAdFormat, String> map = CollectionUtils.map(jSONObject4.length());
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string2 = JsonUtils.getString(jSONObject4, next, null);
                if (fromString != null && !TextUtils.isEmpty(string2)) {
                    map.put(fromString, string2);
                }
            }
            this.A = map;
        } else {
            this.A = null;
        }
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        this.h = JsonUtils.getBoolean(jSONObject5, "supported", true).booleanValue();
        this.i = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", false).booleanValue();
        this.t = JsonUtils.getString(jSONObject5, TJAdUnitConstants.String.MESSAGE, null);
        List list2 = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list2 != null) {
            this.d = Utils.checkClassesExistence(list2);
        } else {
            this.d = Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List<MaxAdFormat> listEmptyList = Collections.emptyList();
        MaxAdapter maxAdapterB = com.applovin.impl.mediation.d.c.b(this.p, pVar);
        if (maxAdapterB != null) {
            this.e = true;
            try {
                adapterVersion = maxAdapterB.getAdapterVersion();
                try {
                    sdkVersion = maxAdapterB.getSdkVersion() != null ? maxAdapterB.getSdkVersion() : "";
                    try {
                        listEmptyList = a(maxAdapterB);
                        str2 = sdkVersion;
                        str = adapterVersion;
                        list = listEmptyList;
                        zIsBeta = maxAdapterB.isBeta();
                    } catch (Throwable th) {
                        th = th;
                        y.i("MediatedNetwork", "Failed to load adapter for network " + this.n + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str2 = sdkVersion;
                        str = adapterVersion;
                        list = listEmptyList;
                        zIsBeta = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sdkVersion = "";
                }
            } catch (Throwable th3) {
                th = th3;
                adapterVersion = "";
                sdkVersion = adapterVersion;
            }
            try {
                Class<?> cls = Class.forName(this.p);
                zEquals = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                z = zIsBeta;
                listEmptyList = list;
            } catch (Throwable th4) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th4);
                }
                z = zIsBeta;
                listEmptyList = list;
                zEquals = false;
            }
        } else {
            this.e = false;
            str = "";
            str2 = str;
            zEquals = false;
            z = false;
        }
        this.r = str;
        this.q = str2;
        this.v = listEmptyList;
        this.k = zEquals;
        this.x = a(jSONObject2, str, pVar);
        this.g = Utils.checkClassExistence(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.b = D();
        this.f = (str.equals(this.s) || z) ? false : true;
        Context contextY = p.y();
        int iLastIndexOf = this.n.lastIndexOf("_");
        String strSubstring = iLastIndexOf != -1 ? this.n.toLowerCase().substring(0, iLastIndexOf) : this.n.toLowerCase();
        this.u = contextY.getResources().getIdentifier("applovin_ic_mediation_" + strSubstring, "drawable", contextY.getPackageName());
        this.c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextY).subscribe(this, "adapter_initialization_status");
        LinkedHashMap<String, Integer> linkedHashMapB = pVar.ao().b();
        if (linkedHashMapB.containsKey(this.p)) {
            this.c = linkedHashMapB.get(this.p).intValue();
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject2, "amazon_marketplace", (JSONObject) null);
        if (jSONObject6 != null && this.d) {
            this.B = true;
            this.C = JsonUtils.getString(jSONObject6, "test_mode_app_id", null);
            JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject6, "test_mode_slot_ids", new JSONObject());
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> map2 = CollectionUtils.map(jSONObject7.length());
            Iterator<String> itKeys2 = jSONObject7.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
                JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject7, next2, (JSONObject) null);
                if (fromString2 != null && jSONObject8 != null && (string = JsonUtils.getString(jSONObject8, "uuid", null)) != null) {
                    map2.put(fromString2, new com.applovin.impl.mediation.debugger.a.b(string, jSONObject8, fromString2));
                }
            }
            this.D = map2;
            return;
        }
        this.B = false;
        this.C = null;
        this.D = null;
    }

    public a a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public EnumC0065b c() {
        if (!this.h) {
            return EnumC0065b.NOT_SUPPORTED;
        }
        if (this.b != a.COMPLETE && (this.b != a.INCOMPLETE_INTEGRATION || !d() || !e())) {
            return EnumC0065b.INVALID_INTEGRATION;
        }
        if (!this.f1033a.av().a()) {
            return EnumC0065b.DISABLED;
        }
        if (this.i && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return EnumC0065b.NOT_INITIALIZED;
        }
        return EnumC0065b.READY;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.b == a.MISSING && this.j;
    }

    public String h() {
        return this.n;
    }

    public String i() {
        return this.o;
    }

    public String j() {
        return this.q;
    }

    public String k() {
        return this.r;
    }

    public String l() {
        return this.s;
    }

    public String m() {
        return this.p;
    }

    public List<String> n() {
        return this.y;
    }

    public int o() {
        return this.u;
    }

    public List<MaxAdFormat> p() {
        return this.v;
    }

    public boolean q() {
        return this.k;
    }

    public List<d> r() {
        return this.w;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.a> s() {
        return this.x;
    }

    public boolean t() {
        return this.m;
    }

    public final c u() {
        return this.z;
    }

    public Map<MaxAdFormat, String> v() {
        return this.A;
    }

    public String w() {
        return this.t;
    }

    public boolean x() {
        return this.l;
    }

    public final p y() {
        return this.f1033a;
    }

    public final String z() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.n);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.b.a());
        sb.append("\nSDK     - ");
        boolean z = this.d;
        String str = VersionInfo.UNAVAILABLE;
        sb.append((!z || TextUtils.isEmpty(this.q)) ? VersionInfo.UNAVAILABLE : this.q);
        sb.append("\nAdapter - ");
        if (this.e && !TextUtils.isEmpty(this.r)) {
            str = this.r;
        }
        sb.append(str);
        if (this.z.a() && !this.z.b()) {
            sb.append("\n* ");
            sb.append(this.z.c());
        }
        for (d dVar : r()) {
            if (!dVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(dVar.a());
                sb.append(": ");
                sb.append(dVar.b());
            }
        }
        for (com.applovin.impl.mediation.debugger.b.c.a aVar : s()) {
            if (!aVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(aVar.a());
                sb.append(": ");
                sb.append(aVar.b());
            }
        }
        return sb.toString();
    }

    public boolean A() {
        return this.B;
    }

    public String B() {
        return this.C;
    }

    public Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> C() {
        return this.D;
    }

    private a D() {
        a aVar;
        if (this.d) {
            if (this.e) {
                aVar = a.COMPLETE;
            } else if (this.g) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.e) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator<d> it = this.w.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.a> it2 = this.x.iterator();
        while (it2.hasNext()) {
            if (!it2.next().c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (!this.m || p.A()) {
            return (!this.z.a() || this.z.b()) ? aVar : a.INCOMPLETE_INTEGRATION;
        }
        return a.INVALID_INTEGRATION;
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<d> a(JSONObject jSONObject, p pVar) {
        ArrayList arrayList = new ArrayList();
        if (this.p.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            d dVar = new d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", p.y());
            if (dVar.c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), p.y()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List<com.applovin.impl.mediation.debugger.b.c.a> a(JSONObject jSONObject, String str, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject2, pVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && com.applovin.impl.mediation.debugger.b.c.a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.c.a(jSONObject3, pVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return this.o.compareToIgnoreCase(bVar.o);
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.n + ", displayName=" + this.o + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.q + ", adapterAvailable=" + this.e + ", adapterVersion=" + this.r + "}";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.p.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterB = com.applovin.impl.mediation.d.c.b(string, this.f1033a);
            if (maxAdapterB == null || this.q.equals(maxAdapterB.getSdkVersion())) {
                return;
            }
            this.q = maxAdapterB.getSdkVersion();
            this.f1033a.ab().a(this.q, string);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }
}
