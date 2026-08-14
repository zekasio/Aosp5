package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinAdBase implements com.applovin.impl.sdk.a.a, ArrayDirectDownloadAd {
    protected final JSONObject adObject;
    protected final Object adObjectLock;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final Object fullResponseLock;
    protected final p sdk;

    public abstract long getAdIdNumber();

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.adObject = jSONObject;
        this.fullResponse = jSONObject2;
        this.sdk = pVar;
        this.adObjectLock = new Object();
        this.fullResponseLock = new Object();
        this.createdAtMillis = System.currentTimeMillis();
    }

    public p getSdk() {
        return this.sdk;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public String getPrimaryKey() {
        return getStringFromAdObject("pk", "NA");
    }

    public String getSecondaryKey1() {
        return getStringFromAdObject("sk1", null);
    }

    public String getSecondaryKey2() {
        return getStringFromAdObject("sk2", null);
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    public boolean shouldUrlEncodeResourcePath() {
        return getBooleanFromAdObject("uerp", false);
    }

    protected boolean containsKeyForAdObject(String str) {
        boolean zHas;
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean zBooleanValue;
        synchronized (this.adObjectLock) {
            zBooleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    protected float getFloatFromAdObject(String str, float f) {
        float f2;
        synchronized (this.adObjectLock) {
            f2 = JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    protected int getIntFromAdObject(String str, int i) {
        int i2;
        synchronized (this.adObjectLock) {
            i2 = JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(String str, long j) {
        long j2;
        synchronized (this.adObjectLock) {
            j2 = JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected int getColorFromAdObject(String str, int i) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean zBooleanValue;
        synchronized (this.fullResponseLock) {
            zBooleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return zBooleanValue;
    }

    protected float getFloatFromFullResponse(String str, float f) {
        float f2;
        synchronized (this.fullResponseLock) {
            f2 = JsonUtils.getFloat(this.fullResponse, str, f);
        }
        return f2;
    }

    protected int getIntFromFullResponse(String str, int i) {
        int i2;
        synchronized (this.fullResponseLock) {
            i2 = JsonUtils.getInt(this.fullResponse, str, i);
        }
        return i2;
    }

    protected JSONObject getJsonObjectFromFullResponse(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.fullResponseLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.fullResponse, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromFullResponse(String str, long j) {
        long j2;
        synchronized (this.fullResponseLock) {
            j2 = JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    protected String getStringFromFullResponse(String str, String str2) {
        String string;
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }
}
