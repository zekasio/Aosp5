package com.applovin.impl.a.a.a;

import com.applovin.impl.sdk.ad.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f712a;
    private final Object b;
    private String c;
    private String d;

    public a(Object obj, long j) {
        this.b = obj;
        this.f712a = j;
        if (obj instanceof e) {
            e eVar = (e) obj;
            this.c = eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null;
            this.d = "AppLovin";
        } else if (obj instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            this.c = aVar.getFormat().getLabel();
            this.d = aVar.getNetworkName();
        }
    }

    public String a() {
        String str = this.c;
        return str != null ? str : "Unknown";
    }

    public String b() {
        String str = this.d;
        return str != null ? str : "Unknown";
    }

    public Object c() {
        return this.b;
    }

    public long d() {
        return this.f712a;
    }
}
