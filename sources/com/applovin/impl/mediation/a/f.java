package com.applovin.impl.mediation.a;

import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f943a;
    protected final p b;
    private final JSONObject c;
    private final Map<String, Object> d;
    private final Object e = new Object();
    private final Object f = new Object();
    private String g;
    private String h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.b = pVar;
        this.f943a = jSONObject2;
        this.c = jSONObject;
        this.d = map;
    }

    public JSONObject V() {
        JSONObject jSONObject;
        synchronized (this.f) {
            jSONObject = this.f943a;
        }
        return jSONObject;
    }

    protected Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f) {
            bool2 = JsonUtils.getBoolean(this.f943a, str, bool);
        }
        return bool2;
    }

    protected int a(String str, int i) {
        int i2;
        synchronized (this.f) {
            i2 = JsonUtils.getInt(this.f943a, str, i);
        }
        return i2;
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f943a, str, jSONArray);
        }
        return jSONArray2;
    }

    protected long a(String str, long j) {
        long j2;
        synchronized (this.f) {
            j2 = JsonUtils.getLong(this.f943a, str, j);
        }
        return j2;
    }

    protected String a(String str, String str2) {
        String string;
        synchronized (this.f) {
            string = JsonUtils.getString(this.f943a, str, str2);
        }
        return string;
    }

    protected JSONObject W() {
        JSONObject jSONObject;
        synchronized (this.e) {
            jSONObject = this.c;
        }
        return jSONObject;
    }

    protected boolean c(String str) {
        boolean zHas;
        synchronized (this.e) {
            zHas = this.c.has(str);
        }
        return zHas;
    }

    protected Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.e) {
            bool2 = JsonUtils.getBoolean(this.c, str, bool);
        }
        return bool2;
    }

    protected float a(String str, float f) {
        float f2;
        synchronized (this.e) {
            f2 = JsonUtils.getFloat(this.c, str, f);
        }
        return f2;
    }

    protected double b(String str, float f) {
        double d;
        synchronized (this.e) {
            d = JsonUtils.getDouble(this.c, str, f);
        }
        return d;
    }

    protected int b(String str, int i) {
        int i2;
        synchronized (this.e) {
            i2 = JsonUtils.getInt(this.c, str, i);
        }
        return i2;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.e) {
            jSONArray2 = JsonUtils.getJSONArray(this.c, str, jSONArray);
        }
        return jSONArray2;
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.e) {
            jSONObject2 = JsonUtils.getJSONObject(this.c, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long b(String str, long j) {
        long j2;
        synchronized (this.e) {
            j2 = JsonUtils.getLong(this.c, str, j);
        }
        return j2;
    }

    protected Object d(String str) {
        Object objOpt;
        synchronized (this.e) {
            objOpt = this.c.opt(str);
        }
        return objOpt;
    }

    protected String b(String str, String str2) {
        String string;
        synchronized (this.e) {
            string = JsonUtils.getString(this.c, str, str2);
        }
        return string;
    }

    protected void c(String str, int i) {
        synchronized (this.e) {
            JsonUtils.putInt(this.c, str, i);
        }
    }

    protected void c(String str, long j) {
        synchronized (this.e) {
            JsonUtils.putLong(this.c, str, j);
        }
    }

    protected void c(String str, String str2) {
        synchronized (this.e) {
            JsonUtils.putString(this.c, str, str2);
        }
    }

    protected void a(String str, Object obj) {
        synchronized (this.e) {
            JsonUtils.putObject(this.c, str, obj);
        }
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String X() {
        return b("class", (String) null);
    }

    public String Y() {
        return b(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
    }

    public String Z() {
        return Y().split("_")[0];
    }

    public boolean aa() {
        return b("is_testing", (Boolean) false).booleanValue();
    }

    public Boolean ab() {
        String str = this.b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT)) {
            return b(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) false);
        }
        return a(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) null);
    }

    public Boolean ac() {
        String str = this.b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER)) {
            return b(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) false);
        }
        return a(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) null);
    }

    public Boolean ad() {
        String str = this.b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c(AppLovinSdkExtraParameterKey.DO_NOT_SELL)) {
            return b(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) false);
        }
        return a(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) null);
    }

    public String ae() {
        if (c("consent_string")) {
            return b("consent_string", (String) null);
        }
        return a("consent_string", (String) null);
    }

    public boolean af() {
        return b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    public Map<String, Object> ag() {
        return this.d;
    }

    public Bundle ah() {
        Bundle bundle;
        if (d("server_parameters") instanceof JSONObject) {
            bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iA = a();
        if (iA != -1) {
            if (iA == 2) {
                bundle.putBoolean("is_muted", this.b.C().isMuted());
            } else {
                bundle.putBoolean("is_muted", iA == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, a(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", a("currency", ""));
        }
        return bundle;
    }

    public Bundle ai() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), ah());
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.b.a(com.applovin.impl.sdk.c.a.K)).intValue()));
    }

    public long aj() {
        return b("adapter_timeout_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.k)).longValue());
    }

    public long ak() {
        return b("init_completion_delay_ms", -1L);
    }

    public long al() {
        return b("auto_init_delay_ms", 0L);
    }

    public void e(String str) {
        this.g = str;
    }

    public String getPlacement() {
        return this.g;
    }

    public void f(String str) {
        this.h = str;
    }

    public String am() {
        return this.h;
    }

    public List<String> g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        List listOptList = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
        List listOptList2 = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
        ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
        arrayList.addAll(listOptList);
        arrayList.addAll(listOptList2);
        return arrayList;
    }

    public String h(String str) {
        String strB = b(str, "");
        return StringUtils.isValidString(strB) ? strB : a(str, "");
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + X() + "', adapterName='" + Y() + "', isTesting=" + aa() + '}';
    }
}
