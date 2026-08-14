package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final List<String> c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");
    private final p b;
    private final JSONObject d;
    private final JSONObject e;
    private final com.applovin.impl.sdk.ad.b f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<t> f906a = new ArrayList();
    private final long g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, p pVar) {
        this.b = pVar;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = bVar;
    }

    public int a() {
        return this.f906a.size();
    }

    public List<t> b() {
        return this.f906a;
    }

    public JSONObject c() {
        return this.d;
    }

    public JSONObject d() {
        return this.e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f;
    }

    public long f() {
        return this.g;
    }

    public List<String> g() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.d, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : c;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.d);
    }
}
