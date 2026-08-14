package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import cz.msebera.android.httpclient.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f912a;
    private String b;

    private j() {
    }

    public static j a(t tVar, j jVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (jVar == null) {
            try {
                jVar = new j();
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastSystemInfo", "Error occurred while initializing", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(jVar.f912a)) {
            String strC = tVar.c();
            if (StringUtils.isValidString(strC)) {
                jVar.f912a = strC;
            }
        }
        if (!StringUtils.isValidString(jVar.b)) {
            String str = tVar.b().get(ClientCookie.VERSION_ATTR);
            if (StringUtils.isValidString(str)) {
                jVar.b = str;
            }
        }
        return jVar;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f912a + "', version='" + this.b + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f912a;
        if (str == null ? jVar.f912a != null : !str.equals(jVar.f912a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = jVar.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f912a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
