package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1560a;
    private final Float b;
    private final boolean c;
    private final Position d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f1560a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TJAdUnitConstants.String.VIDEO_SKIPPABLE, this.f1560a);
            if (this.f1560a) {
                jSONObject.put(TJAdUnitConstants.String.VIDEO_SKIPOFFSET, this.b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put("position", this.d);
        } catch (JSONException e) {
            d.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.d;
    }

    public Float getSkipOffset() {
        return this.b;
    }

    public boolean isAutoPlay() {
        return this.c;
    }

    public boolean isSkippable() {
        return this.f1560a;
    }
}
