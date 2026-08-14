package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyj implements zzczg, com.google.android.gms.ads.internal.client.zza, zzcvi, zzcus {
    private final Context zza;
    private final zzezm zzb;
    private final zzeyo zzc;
    private final zzeyc zzd;
    private final zzeaf zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgt)).booleanValue();
    private final zzfdk zzh;
    private final String zzi;

    public zzdyj(Context context, zzezm zzezmVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzeaf zzeafVar, zzfdk zzfdkVar, String str) {
        this.zza = context;
        this.zzb = zzezmVar;
        this.zzc = zzeyoVar;
        this.zzd = zzeycVar;
        this.zze = zzeafVar;
        this.zzh = zzfdkVar;
        this.zzi = str;
    }

    private final zzfdj zzf(String str) {
        zzfdj zzfdjVarZzb = zzfdj.zzb(str);
        zzfdjVarZzb.zzh(this.zzc, null);
        zzfdjVarZzb.zzf(this.zzd);
        zzfdjVarZzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzfdjVarZzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzfdjVarZzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzfdjVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfdjVarZzb.zza("offline_ad", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        }
        return zzfdjVarZzb;
    }

    private final void zzg(zzfdj zzfdjVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfdjVar);
            return;
        }
        this.zze.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfdjVar), 2));
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String strZzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean zMatches = false;
                    if (str != null && strZzn != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzn);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zzg(zzf(TJAdUnitConstants.String.CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strZza = this.zzb.zza(str);
            zzfdj zzfdjVarZzf = zzf("ifts");
            zzfdjVarZzf.zza("reason", "adapter");
            if (i >= 0) {
                zzfdjVarZzf.zza("arec", String.valueOf(i));
            }
            if (strZza != null) {
                zzfdjVarZzf.zza("areec", strZza);
            }
            this.zzh.zzb(zzfdjVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzb() {
        if (this.zzg) {
            zzfdk zzfdkVar = this.zzh;
            zzfdj zzfdjVarZzf = zzf("ifts");
            zzfdjVarZzf.zza("reason", "blocked");
            zzfdkVar.zzb(zzfdjVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzc(zzded zzdedVar) {
        if (this.zzg) {
            zzfdj zzfdjVarZzf = zzf("ifts");
            zzfdjVarZzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdedVar.getMessage())) {
                zzfdjVarZzf.zza(NotificationCompat.CATEGORY_MESSAGE, zzdedVar.getMessage());
            }
            this.zzh.zzb(zzfdjVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        if (zzh() || this.zzd.zzaj) {
            zzg(zzf("impression"));
        }
    }
}
