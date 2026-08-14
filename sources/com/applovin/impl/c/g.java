package com.applovin.impl.c;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<k> f908a = new HashSet();
    public final Set<k> b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public static g a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        t tVarB = tVar.b("StaticResource");
        if (tVarB == null || !URLUtil.isValidUrl(tVarB.c())) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().e("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        g gVar = new g();
        gVar.c = Uri.parse(tVarB.c());
        t tVarC = tVar.c("IconClickThrough");
        if (tVarC != null && URLUtil.isValidUrl(tVarC.c())) {
            gVar.d = Uri.parse(tVarC.c());
        }
        String str = tVar.b().get(TJAdUnitConstants.String.WIDTH);
        int i = 0;
        int i2 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = tVar.b().get(TJAdUnitConstants.String.HEIGHT);
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eR)).intValue();
        if (i2 > 0 && i > 0) {
            double d = i2 / i;
            int iMin = Math.min(Math.max(i2, i), iIntValue);
            if (i2 >= i) {
                gVar.e = iMin;
                double d2 = iMin;
                Double.isNaN(d2);
                Double.isNaN(d);
                gVar.f = (int) (d2 / d);
            } else {
                gVar.f = iMin;
                double d3 = iMin;
                Double.isNaN(d3);
                Double.isNaN(d);
                gVar.e = (int) (d3 * d);
            }
        } else {
            gVar.f = iIntValue;
            gVar.e = iIntValue;
        }
        return gVar;
    }

    public static ImageView a(Uri uri, Context context, p pVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        Utils.setImageUrl(uri.toString(), imageView, pVar);
        return imageView;
    }

    public Uri a() {
        return this.c;
    }

    public Uri b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public Set<k> e() {
        return this.f908a;
    }

    public Set<k> f() {
        return this.b;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + a() + "', clickUri='" + b() + "', width=" + c() + ", height=" + d() + "}";
    }
}
