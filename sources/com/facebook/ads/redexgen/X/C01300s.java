package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01300s {
    public static InterfaceC01250n A00;

    @Nullable
    public final InterfaceC01250n A00(C0947Xy c0947Xy, AdPlacementType adPlacementType) {
        InterfaceC01250n interfaceC01250n = A00;
        if (interfaceC01250n != null) {
            return interfaceC01250n;
        }
        int i = C01290r.A00[adPlacementType.ordinal()];
        if (i == 1) {
            return new C1220dd();
        }
        if (i == 2) {
            return new C1219dc();
        }
        if (i == 3) {
            return new C1217da(c0947Xy);
        }
        if (i == 4) {
            return new C0482Fq(c0947Xy);
        }
        if (i != 5) {
            return null;
        }
        return new C0474Fi();
    }
}
