package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f919a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private int g;

    public enum a {
        Progressive,
        Streaming
    }

    private o() {
    }

    public static o a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strC = tVar.c();
            if (URLUtil.isValidUrl(strC)) {
                Uri uri = Uri.parse(strC);
                o oVar = new o();
                oVar.f919a = uri;
                oVar.b = uri;
                oVar.g = StringUtils.parseInt(tVar.b().get("bitrate"));
                oVar.c = a(tVar.b().get("delivery"));
                oVar.f = StringUtils.parseInt(tVar.b().get(TJAdUnitConstants.String.HEIGHT));
                oVar.e = StringUtils.parseInt(tVar.b().get(TJAdUnitConstants.String.WIDTH));
                oVar.d = tVar.b().get(TapjoyAuctionFlags.AUCTION_TYPE).toLowerCase(Locale.ENGLISH);
                return oVar;
            }
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().e("VastVideoFile", "Unable to create video file. Could not find URL.");
            return null;
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().b("VastVideoFile", "Error occurred while initializing", th);
            return null;
        }
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public Uri a() {
        return this.f919a;
    }

    public Uri b() {
        return this.b;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f919a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.e != oVar.e || this.f != oVar.f || this.g != oVar.g) {
            return false;
        }
        Uri uri = this.f919a;
        if (uri == null ? oVar.f919a != null : !uri.equals(oVar.f919a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? oVar.b != null : !uri2.equals(oVar.b)) {
            return false;
        }
        if (this.c != oVar.c) {
            return false;
        }
        String str = this.d;
        String str2 = oVar.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f919a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }
}
