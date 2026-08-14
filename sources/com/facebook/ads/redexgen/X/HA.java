package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HA implements Comparable<HA> {
    public final int A00;
    public final H6 A01;

    public HA(int i, H6 h6) {
        this.A00 = i;
        this.A01 = h6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull HA ha) {
        return this.A00 - ha.A00;
    }
}
