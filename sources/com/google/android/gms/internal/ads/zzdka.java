package com.google.android.gms.internal.ads;

import com.tapjoy.TapjoyAuctionFlags;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdka {
    private final Executor zza;
    private final zzcnq zzb;
    private final zzdbw zzc;

    zzdka(Executor executor, zzcnq zzcnqVar, zzdbw zzdbwVar) {
        this.zza = executor;
        this.zzc = zzdbwVar;
        this.zzb = zzcnqVar;
    }

    public final void zza(final zzcei zzceiVar) {
        if (zzceiVar == null) {
            return;
        }
        this.zzc.zza(zzceiVar.zzF());
        this.zzc.zzm(new zzatf() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzatf
            public final void zzc(zzate zzateVar) {
                zzceiVar.zzN().zzp(zzateVar.zzd.left, zzateVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzm(new zzatf() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzatf
            public final void zzc(zzate zzateVar) {
                zzcei zzceiVar2 = zzceiVar;
                HashMap map = new HashMap();
                map.put("isVisible", true != zzateVar.zzj ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
                zzceiVar2.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzm(this.zzb, this.zza);
        this.zzb.zzf(zzceiVar);
        zzceiVar.zzad("/trackActiveViewUnit", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcei) obj, map);
            }
        });
        zzceiVar.zzad("/untrackActiveViewUnit", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcei) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcei zzceiVar, Map map) {
        this.zzb.zza();
    }
}
