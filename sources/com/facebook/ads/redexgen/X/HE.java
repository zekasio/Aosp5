package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Comparator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HE implements Comparator<Format> {
    public HE() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Format format, Format format2) {
        return format2.A04 - format.A04;
    }
}
