package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f910a;
    private Uri b;
    private String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private i() {
    }

    static i a(t tVar, i iVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (iVar == null) {
            try {
                iVar = new i();
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastNonVideoResource", "Error occurred while initializing", th);
                return null;
            }
        }
        if (iVar.b == null && !StringUtils.isValidString(iVar.c)) {
            String strA = a(tVar, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                iVar.b = Uri.parse(strA);
                iVar.f910a = a.STATIC;
                return iVar;
            }
            String strA2 = a(tVar, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                iVar.f910a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    iVar.b = Uri.parse(strA2);
                } else {
                    iVar.c = strA2;
                }
                return iVar;
            }
            String strA3 = a(tVar, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                iVar.f910a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    iVar.b = Uri.parse(strA3);
                } else {
                    iVar.c = strA3;
                }
            }
        }
        return iVar;
    }

    private static String a(t tVar, String str) {
        t tVarB = tVar.b(str);
        if (tVarB != null) {
            return tVarB.c();
        }
        return null;
    }

    public a a() {
        return this.f910a;
    }

    public Uri b() {
        return this.b;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public String c() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f910a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f910a != iVar.f910a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? iVar.b != null : !uri.equals(iVar.b)) {
            return false;
        }
        String str = this.c;
        String str2 = iVar.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f910a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
