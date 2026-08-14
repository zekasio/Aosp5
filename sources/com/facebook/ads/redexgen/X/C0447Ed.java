package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0447Ed {
    public final int A00;
    public final long A01;

    public C0447Ed(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0447Ed(int i, long j, C0446Ec c0446Ec) {
        this(i, j);
    }

    public static C0447Ed A00(Parcel parcel) {
        return new C0447Ed(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
