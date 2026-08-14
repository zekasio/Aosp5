package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0560Is implements Comparator<C0561It> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0561It c0561It, C0561It c0561It2) {
        if (c0561It.A00 < c0561It2.A00) {
            return -1;
        }
        return c0561It2.A00 < c0561It.A00 ? 1 : 0;
    }
}
