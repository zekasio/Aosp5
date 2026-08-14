package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1055as implements InterfaceC02856v {
    public static String[] A01 = {"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    public final /* synthetic */ C1035aY A00;

    public C1055as(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1035aY c1035aY = this.A00;
            ApplicationInfo applicationInfo = c1035aY.A01;
            if (A01[1].length() == 3) {
                throw new RuntimeException();
            }
            A01[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
            return c1035aY.A08(applicationInfo.taskAffinity);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
