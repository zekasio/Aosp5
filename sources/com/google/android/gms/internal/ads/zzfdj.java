package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdj {
    private final HashMap zza;
    private final zzfdp zzb;

    private zzfdj() {
        HashMap map = new HashMap();
        this.zza = map;
        this.zzb = new zzfdp(com.google.android.gms.ads.internal.zzt.zzB());
        map.put("new_csi", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
    }

    public static zzfdj zzb(String str) {
        zzfdj zzfdjVar = new zzfdj();
        zzfdjVar.zza.put("action", str);
        return zzfdjVar;
    }

    public static zzfdj zzc(String str) {
        zzfdj zzfdjVar = new zzfdj();
        zzfdjVar.zza.put("request_id", str);
        return zzfdjVar;
    }

    public final zzfdj zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfdj zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfdj zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfdj zzf(zzeyc zzeycVar) {
        this.zza.put("aai", zzeycVar.zzx);
        return this;
    }

    public final zzfdj zzg(zzeyf zzeyfVar) {
        if (!TextUtils.isEmpty(zzeyfVar.zzb)) {
            this.zza.put("gqi", zzeyfVar.zzb);
        }
        return this;
    }

    public final zzfdj zzh(zzeyo zzeyoVar, zzbyn zzbynVar) {
        zzeyn zzeynVar = zzeyoVar.zzb;
        zzg(zzeynVar.zzb);
        if (!zzeynVar.zza.isEmpty()) {
            switch (((zzeyc) zzeynVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzbynVar != null) {
                        this.zza.put("as", true != zzbynVar.zzj() ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfdj zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap map = new HashMap(this.zza);
        for (zzfdo zzfdoVar : this.zzb.zza()) {
            map.put(zzfdoVar.zza, zzfdoVar.zzb);
        }
        return map;
    }
}
