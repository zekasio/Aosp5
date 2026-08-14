package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0768Qx {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public C0768Qx(C0Q c0q) {
        this(c0q, 0.0f);
    }

    public C0768Qx(C0Q c0q, float f) {
        this(c0q, f, null);
    }

    public C0768Qx(C0Q c0q, float f, Map<String, String> map) {
        this.A01 = c0q;
        this.A00 = f;
        if (map != null) {
            this.A02 = map;
        } else {
            Map<String, String> windowParams = new HashMap<>();
            this.A02 = windowParams;
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
