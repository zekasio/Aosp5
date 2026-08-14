package com.google.android.gms.internal.ads;

import com.tapjoy.TapjoyAuctionFlags;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhh implements zzbhp {
    zzbhh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ((zzcei) obj).zzal(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("custom_close")));
    }
}
