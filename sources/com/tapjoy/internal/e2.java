package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f1786a;

    public e2(q2 q2Var) {
        this.f1786a = q2Var;
    }

    public void a() {
        a.a(this.f1786a);
        if (!this.f1786a.b.a()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!this.f1786a.d()) {
            try {
                this.f1786a.b();
            } catch (Exception unused) {
            }
        }
        if (this.f1786a.d()) {
            q2 q2Var = this.f1786a;
            if (q2Var.i) {
                throw new IllegalStateException("Impression event can only be sent once");
            }
            q2Var.e.d();
            q2Var.i = true;
        }
    }

    public void a(u2 u2Var) {
        a.a((Object) u2Var, "VastProperties is null");
        a.b(this.f1786a);
        if (this.f1786a.b.a()) {
            q2 q2Var = this.f1786a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TJAdUnitConstants.String.VIDEO_SKIPPABLE, u2Var.f1919a);
                if (u2Var.f1919a) {
                    jSONObject.put(TJAdUnitConstants.String.VIDEO_SKIPOFFSET, u2Var.b);
                }
                jSONObject.put("autoPlay", u2Var.c);
                jSONObject.put("position", u2Var.d);
            } catch (JSONException e) {
                a.a("VastProperties: JSON error", (Exception) e);
            }
            if (!q2Var.j) {
                q2Var.e.a(jSONObject);
                q2Var.j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
