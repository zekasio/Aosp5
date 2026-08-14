package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MO {
    public static Q6 A00(VideoStartReason videoStartReason) {
        int i = MN.A00[videoStartReason.ordinal()];
        if (i == 1) {
            return Q6.A02;
        }
        if (i == 2) {
            return Q6.A03;
        }
        if (i != 3) {
            return Q6.A03;
        }
        return Q6.A04;
    }
}
