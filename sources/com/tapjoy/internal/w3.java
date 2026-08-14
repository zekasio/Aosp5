package com.tapjoy.internal;

import com.tapjoy.internal.r3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w3 implements r3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f1935a;
    public final s3 b;

    public w3(s3 s3Var) {
        this.b = s3Var;
    }

    public void a() {
        this.b.a(new t3(this));
    }

    public void a(JSONObject jSONObject) {
        this.f1935a = jSONObject;
    }
}
