package com.applovin.impl.adview;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f832a;
    private final com.applovin.impl.sdk.p b;

    public o(Map<String, Object> map, com.applovin.impl.sdk.p pVar) {
        this.f832a = map;
        this.b = pVar;
    }

    public Drawable a() {
        Object obj = this.f832a.get("google_watermark");
        if (!(obj instanceof String)) {
            this.b.L();
            if (com.applovin.impl.sdk.y.a()) {
                this.b.L().e("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.p.y().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.b.L();
            if (com.applovin.impl.sdk.y.a()) {
                this.b.L().b("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }
}
