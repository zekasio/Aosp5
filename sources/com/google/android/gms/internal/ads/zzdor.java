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
public final class zzdor implements zzczg, com.google.android.gms.ads.internal.client.zza, zzcvi, zzcus {
    private final Context zza;
    private final zzezm zzb;
    private final zzdpi zzc;
    private final zzeyo zzd;
    private final zzeyc zze;
    private final zzeaf zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgt)).booleanValue();

    public zzdor(Context context, zzezm zzezmVar, zzdpi zzdpiVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzeaf zzeafVar) {
        this.zza = context;
        this.zzb = zzezmVar;
        this.zzc = zzdpiVar;
        this.zzd = zzeyoVar;
        this.zze = zzeycVar;
        this.zzf = zzeafVar;
    }

    private final zzdph zzf(String str) {
        zzdph zzdphVarZza = this.zzc.zza();
        zzdphVarZza.zze(this.zzd.zzb.zzb);
        zzdphVarZza.zzd(this.zze);
        zzdphVarZza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zzdphVarZza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zzdphVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdphVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzdphVarZza.zzb("offline_ad", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgC)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1;
            zzdphVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zzdphVarZza.zzc("ragent", zzlVar.zzp);
                zzdphVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zzdphVarZza;
    }

    private final void zzg(zzdph zzdphVar) {
        if (!this.zze.zzaj) {
            zzdphVar.zzg();
            return;
        }
        this.zzf.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdphVar.zzf(), 2));
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zzg(zzf(TJAdUnitConstants.String.CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdph zzdphVarZzf = zzf("ifts");
            zzdphVarZzf.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdphVarZzf.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdphVarZzf.zzb("areec", strZza);
            }
            zzdphVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzb() {
        if (this.zzh) {
            zzdph zzdphVarZzf = zzf("ifts");
            zzdphVarZzf.zzb("reason", "blocked");
            zzdphVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzc(zzded zzdedVar) {
        if (this.zzh) {
            zzdph zzdphVarZzf = zzf("ifts");
            zzdphVarZzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdedVar.getMessage())) {
                zzdphVarZzf.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdedVar.getMessage());
            }
            zzdphVarZzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzd() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zze() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        if (zzh() || this.zze.zzaj) {
            zzg(zzf("impression"));
        }
    }
}
