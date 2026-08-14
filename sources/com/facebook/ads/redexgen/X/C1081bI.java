package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1081bI implements AnonymousClass62 {
    public final Map<String, AnonymousClass60> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized String AE2() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (AnonymousClass60 stat : this.A00.values()) {
            sb.append(stat.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized void reset() {
        this.A00.clear();
    }
}
