package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f909a;
    private final String b;

    private h(String str, String str2) {
        this.f909a = str;
        this.b = str2;
    }

    public static h a(t tVar, p pVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new h(tVar.b().get("apiFramework"), tVar.c());
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().b("VastJavaScriptResource", "Error occurred while initializing", th);
            return null;
        }
    }

    public String a() {
        return this.f909a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f909a;
        if (str == null ? hVar.f909a != null : !str.equals(hVar.f909a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = hVar.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f909a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f909a + "', javascriptResourceUrl='" + this.b + "'}";
    }
}
