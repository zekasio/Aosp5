package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tapjoy.TapjoyAuctionFlags;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemi implements zzepm {
    public final String zza;
    public final boolean zzb;

    public zzemi(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        }
    }
}
