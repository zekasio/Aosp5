package com.google.android.gms.internal.ads;

import com.tapjoy.TapjoyAuctionFlags;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhq implements zzbhp {
    private final zzbhr zza;

    public zzbhq(zzbhr zzbhrVar, byte[] bArr) {
        this.zza = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        boolean zEquals = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("transparentBackground"));
        boolean zEquals2 = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzbza.zzh("Fail to parse float", e);
        }
        this.zza.zzc(zEquals);
        this.zza.zzb(zEquals2, f);
        zzceiVar.zzat(zEquals);
    }
}
