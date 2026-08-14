package com.tapjoy;

import com.vungle.warren.model.Advertisement;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyCachedAssetData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1723a;
    public long b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;
    public String h;

    public TapjoyCachedAssetData(String str, String str2, long j) {
        this(str, str2, j, System.currentTimeMillis() / 1000);
    }

    public static TapjoyCachedAssetData fromJSONObject(JSONObject jSONObject) {
        TapjoyCachedAssetData tapjoyCachedAssetData;
        try {
            tapjoyCachedAssetData = new TapjoyCachedAssetData(jSONObject.getString("assetURL"), jSONObject.getString("localFilePath"), jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE), jSONObject.getLong("timestamp"));
        } catch (JSONException unused) {
            tapjoyCachedAssetData = null;
        }
        try {
            tapjoyCachedAssetData.setOfferID(jSONObject.optString("offerID"));
        } catch (JSONException unused2) {
            TapjoyLog.i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
        }
        return tapjoyCachedAssetData;
    }

    public static TapjoyCachedAssetData fromRawJSONString(String str) {
        try {
            return fromJSONObject(new JSONObject(str));
        } catch (JSONException unused) {
            TapjoyLog.i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
            return null;
        }
    }

    public String getAssetURL() {
        return this.c;
    }

    public String getLocalFilePath() {
        return this.d;
    }

    public String getLocalURL() {
        return this.e;
    }

    public String getMimeType() {
        return this.g;
    }

    public String getOfferId() {
        return this.h;
    }

    public long getTimeOfDeathInSeconds() {
        return this.f;
    }

    public long getTimeToLiveInSeconds() {
        return this.b;
    }

    public long getTimestampInSeconds() {
        return this.f1723a;
    }

    public void resetTimeToLive(long j) {
        this.b = j;
        this.f = (System.currentTimeMillis() / 1000) + j;
    }

    public void setAssetURL(String str) {
        this.c = str;
        this.g = TapjoyUtil.determineMimeType(str);
    }

    public void setLocalFilePath(String str) {
        this.d = str;
        this.e = Advertisement.FILE_SCHEME + str;
    }

    public void setOfferID(String str) {
        this.h = str;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", getTimestampInSeconds());
            jSONObject.put(TapjoyConstants.TJC_TIME_TO_LIVE, getTimeToLiveInSeconds());
            jSONObject.put("assetURL", getAssetURL());
            jSONObject.put("localFilePath", getLocalFilePath());
            jSONObject.put("offerID", getOfferId());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toRawJSONString() {
        return toJSON().toString();
    }

    public String toString() {
        return "\nURL=" + this.e + "\nAssetURL=" + this.c + "\nMimeType=" + this.g + "\nTimestamp=" + getTimestampInSeconds() + "\nTimeOfDeath=" + this.f + "\nTimeToLive=" + this.b + "\n";
    }

    public TapjoyCachedAssetData(String str, String str2, long j, long j2) {
        setAssetURL(str);
        setLocalFilePath(str2);
        this.b = j;
        this.f1723a = j2;
        this.f = j2 + j;
    }
}
