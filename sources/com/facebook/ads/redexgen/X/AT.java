package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AT implements Comparable<AT> {
    public int A00;
    public long A01;

    @Nullable
    public Object A02;
    public final C0373As A03;

    public AT(C0373As c0373As) {
        this.A03 = c0373As;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull AT at) {
        if ((this.A02 == null) != (at.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - at.A00;
        if (i != 0) {
            return i;
        }
        return C0567Iz.A07(this.A01, at.A01);
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
