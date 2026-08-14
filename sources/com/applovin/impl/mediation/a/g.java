package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.i;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f944a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public interface a {
        void a(g gVar);
    }

    public static g a(h hVar, i iVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        return new g(hVar, iVar, str, null);
    }

    public static g a(h hVar, String str) {
        return b(hVar, null, str);
    }

    public static g b(h hVar, i iVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        return new g(hVar, iVar, null, str);
    }

    private g(h hVar, i iVar, String str, String str2) {
        this.f944a = hVar;
        this.d = str;
        this.e = str2;
        if (iVar != null) {
            this.b = iVar.h();
            this.c = iVar.i();
        } else {
            this.b = null;
            this.c = null;
        }
    }

    public h a() {
        return this.f944a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f944a);
        sb.append(", mSdkVersion='");
        sb.append(this.b);
        sb.append("', mAdapterVersion='");
        sb.append(this.c);
        sb.append("', mSignalDataLength='");
        String str = this.d;
        sb.append(str != null ? str.length() : 0);
        sb.append("', mErrorMessage=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
