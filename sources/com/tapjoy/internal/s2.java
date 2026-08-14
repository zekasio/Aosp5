package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f1902a;

    public s2(q2 q2Var) {
        this.f1902a = q2Var;
    }

    public final void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public void a(r2 r2Var) {
        a.a((Object) r2Var, "InteractionType is null");
        a.b(this.f1902a);
        JSONObject jSONObject = new JSONObject();
        h3.a(jSONObject, "interactionType", r2Var);
        this.f1902a.e.a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public static s2 a(f2 f2Var) {
        q2 q2Var = (q2) f2Var;
        a.a((Object) f2Var, "AdSession is null");
        if (q2Var.b.b()) {
            if (!q2Var.e()) {
                a.a(q2Var);
                if (q2Var.e.c == null) {
                    s2 s2Var = new s2(q2Var);
                    q2Var.e.c = s2Var;
                    return s2Var;
                }
                throw new IllegalStateException("MediaEvents already exists for AdSession");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public void a(float f, float f2) {
        if (f > 0.0f) {
            a(f2);
            a.b(this.f1902a);
            JSONObject jSONObject = new JSONObject();
            h3.a(jSONObject, "duration", Float.valueOf(f));
            h3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            h3.a(jSONObject, "deviceVolume", Float.valueOf(b3.c().f1759a));
            this.f1902a.e.a(TJAdUnitConstants.String.VIDEO_START, jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }
}
