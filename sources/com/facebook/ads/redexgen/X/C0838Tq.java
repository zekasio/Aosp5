package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0838Tq implements M8 {
    public final Collection<String> A00;

    public C0838Tq() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : this.A00) {
            sb.append(line);
            sb.append('\n');
        }
        return sb.toString();
    }
}
