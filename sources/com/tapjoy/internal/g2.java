package com.tapjoy.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f1801a;
    public final n2 b;
    public final boolean c;
    public final j2 d;
    public final m2 e;

    public g2(j2 j2Var, m2 m2Var, n2 n2Var, n2 n2Var2, boolean z) {
        this.d = j2Var;
        this.e = m2Var;
        this.f1801a = n2Var;
        if (n2Var2 == null) {
            this.b = n2.NONE;
        } else {
            this.b = n2Var2;
        }
        this.c = z;
    }

    public static g2 a(j2 j2Var, m2 m2Var, n2 n2Var, n2 n2Var2, boolean z) {
        a.a((Object) j2Var, "CreativeType is null");
        a.a((Object) m2Var, "ImpressionType is null");
        a.a((Object) n2Var, "Impression owner is null");
        if (n2Var == n2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (j2Var == j2.DEFINED_BY_JAVASCRIPT && n2Var == n2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (m2Var == m2.DEFINED_BY_JAVASCRIPT && n2Var == n2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new g2(j2Var, m2Var, n2Var, n2Var2, z);
    }

    public boolean a() {
        return n2.NATIVE == this.f1801a;
    }

    public boolean b() {
        return n2.NATIVE == this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        h3.a(jSONObject, "impressionOwner", this.f1801a);
        h3.a(jSONObject, "mediaEventsOwner", this.b);
        h3.a(jSONObject, "creativeType", this.d);
        h3.a(jSONObject, "impressionType", this.e);
        h3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }
}
