package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0444Ea {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0444Ea(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C0444Ea(int i, long j, long j2, EZ ez) {
        this(i, j, j2);
    }

    public static C0444Ea A00(Parcel parcel) {
        return new C0444Ea(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
