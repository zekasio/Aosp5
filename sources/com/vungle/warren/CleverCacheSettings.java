package com.vungle.warren;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public class CleverCacheSettings {
    static final boolean DEFAULT_ENABLED = true;
    static final long DEFAULT_TIMESTAMP = -1;
    static final String KEY_CLEVER_CACHE = "clever_cache";
    static final String KEY_ENABLED = "enabled";
    static final String KEY_TIMESTAMP = "clear_shared_cache_timestamp";

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName(KEY_TIMESTAMP)
    private final long timestamp;

    private CleverCacheSettings(boolean z, long j) {
        this.enabled = z;
        this.timestamp = j;
    }

    public String serializeToString() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("clever_cache", new GsonBuilder().create().toJsonTree(this));
        return jsonObject.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.vungle.warren.CleverCacheSettings fromJson(com.google.gson.JsonObject r4) {
        /*
            java.lang.String r0 = "clear_shared_cache_timestamp"
            java.lang.String r1 = "clever_cache"
            boolean r2 = com.vungle.warren.model.JsonUtil.hasNonNull(r4, r1)
            if (r2 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            com.google.gson.JsonObject r4 = r4.getAsJsonObject(r1)
            r1 = -1
            boolean r3 = r4.has(r0)     // Catch: java.lang.NumberFormatException -> L22
            if (r3 == 0) goto L23
            com.google.gson.JsonElement r0 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L22
            long r0 = r0.getAsLong()     // Catch: java.lang.NumberFormatException -> L22
            r1 = r0
            goto L23
        L22:
        L23:
            java.lang.String r0 = "enabled"
            boolean r3 = r4.has(r0)
            if (r3 == 0) goto L43
            com.google.gson.JsonElement r4 = r4.get(r0)
            boolean r0 = r4.isJsonPrimitive()
            if (r0 == 0) goto L43
            java.lang.String r0 = "false"
            java.lang.String r4 = r4.getAsString()
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L43
            r4 = 0
            goto L44
        L43:
            r4 = 1
        L44:
            com.vungle.warren.CleverCacheSettings r0 = new com.vungle.warren.CleverCacheSettings
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.CleverCacheSettings.fromJson(com.google.gson.JsonObject):com.vungle.warren.CleverCacheSettings");
    }

    static CleverCacheSettings deserializeFromString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return fromJson((JsonObject) new GsonBuilder().create().fromJson(str, JsonObject.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    static CleverCacheSettings getDefault() {
        return new CleverCacheSettings(DEFAULT_ENABLED, -1L);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return DEFAULT_ENABLED;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CleverCacheSettings cleverCacheSettings = (CleverCacheSettings) obj;
        if (this.enabled == cleverCacheSettings.enabled && this.timestamp == cleverCacheSettings.timestamp) {
            return DEFAULT_ENABLED;
        }
        return false;
    }

    public int hashCode() {
        int i = (this.enabled ? 1 : 0) * 31;
        long j = this.timestamp;
        return i + ((int) (j ^ (j >>> 32)));
    }
}
