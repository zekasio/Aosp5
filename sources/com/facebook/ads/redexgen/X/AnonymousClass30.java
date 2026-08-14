package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.30, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass30 extends C0403Bx implements Comparable<AnonymousClass30> {
    public long A00;

    public AnonymousClass30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull AnonymousClass30 anonymousClass30) {
        if (A04() != anonymousClass30.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((X2) this).A00 - ((X2) anonymousClass30).A00;
        if (j == 0) {
            j = this.A00 - anonymousClass30.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
