package com.applovin.impl.adview;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f843a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public t(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        pVar.L();
        if (com.applovin.impl.sdk.y.a()) {
            pVar.L().c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f843a = JsonUtils.getInt(jSONObject, TJAdUnitConstants.String.WIDTH, 64);
        this.b = JsonUtils.getInt(jSONObject, TJAdUnitConstants.String.HEIGHT, 7);
        this.c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", false).booleanValue();
        this.f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public int a() {
        return this.f843a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public long h() {
        return this.h;
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f843a == tVar.f843a && this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.e == tVar.e && this.f == tVar.f && this.g == tVar.g && this.h == tVar.h && Float.compare(tVar.i, this.i) == 0 && Float.compare(tVar.j, this.j) == 0;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f843a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
        float f = this.i;
        int iFloatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.j;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f843a + ", heightPercentOfScreen=" + this.b + ", margin=" + this.c + ", gravity=" + this.d + ", tapToFade=" + this.e + ", tapToFadeDurationMillis=" + this.f + ", fadeInDurationMillis=" + this.g + ", fadeOutDurationMillis=" + this.h + ", fadeInDelay=" + this.i + ", fadeOutDelay=" + this.j + '}';
    }
}
