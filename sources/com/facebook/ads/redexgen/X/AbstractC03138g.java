package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@VisibleForTesting
public abstract class AbstractC03138g<T> {
    public EnumC03128f A00;

    @Nullable
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8g != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final EnumC03128f A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8g != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(EnumC03128f enumC03128f) {
        this.A00 = enumC03128f;
    }
}
