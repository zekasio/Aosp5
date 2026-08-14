package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1367a;
    private final c<JSONObject> b;

    public a(String str, c<JSONObject> cVar, p pVar) {
        super("CommunicatorRequestTask:" + str, pVar);
        this.f1367a = str;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(this.b, this.f, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                this.f.ab().a(a.this.f1367a, a.this.b.a(), i, jSONObject, null, true);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                this.f.ab().a(a.this.f1367a, a.this.b.a(), i, jSONObject, str, false);
            }
        });
    }
}
