package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfds {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfds(Context context, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzbzgVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzp());
        map.put(TapjoyConstants.TJC_APP_PLACEMENT, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(this.zza) ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        List listZzb = zzbar.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgw)).booleanValue()) {
            listZzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzx(this.zza) ? TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE : "0");
        }
    }
}
