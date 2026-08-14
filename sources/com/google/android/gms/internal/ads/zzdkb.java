package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkb {
    private final zzeyx zza;
    private final Executor zzb;
    private final zzdmq zzc;
    private final zzdll zzd;
    private final Context zze;
    private final zzdpi zzf;
    private final zzfdk zzg;
    private final zzfff zzh;
    private final zzeaf zzi;

    public zzdkb(zzeyx zzeyxVar, Executor executor, zzdmq zzdmqVar, Context context, zzdpi zzdpiVar, zzfdk zzfdkVar, zzfff zzfffVar, zzeaf zzeafVar, zzdll zzdllVar) {
        this.zza = zzeyxVar;
        this.zzb = executor;
        this.zzc = zzdmqVar;
        this.zze = context;
        this.zzf = zzdpiVar;
        this.zzg = zzfdkVar;
        this.zzh = zzfffVar;
        this.zzi = zzeafVar;
        this.zzd = zzdllVar;
    }

    private final void zzh(zzcei zzceiVar) {
        zzi(zzceiVar);
        zzceiVar.zzad("/video", zzbho.zzl);
        zzceiVar.zzad("/videoMeta", zzbho.zzm);
        zzceiVar.zzad("/precache", new zzccv());
        zzceiVar.zzad("/delayPageLoaded", zzbho.zzp);
        zzceiVar.zzad("/instrument", zzbho.zzn);
        zzceiVar.zzad("/log", zzbho.zzg);
        zzceiVar.zzad("/click", zzbho.zza(null));
        if (this.zza.zzb != null) {
            zzceiVar.zzN().zzD(true);
            zzceiVar.zzad("/open", new zzbhz(null, null, null, null, null));
        } else {
            zzceiVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzceiVar.getContext())) {
            zzceiVar.zzad("/logScionEvent", new zzbhu(zzceiVar.getContext()));
        }
    }

    private static final void zzi(zzcei zzceiVar) {
        zzceiVar.zzad("/videoClicked", zzbho.zzh);
        zzceiVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdo)).booleanValue()) {
            zzceiVar.zzad("/getNativeAdViewSignals", zzbho.zzs);
        }
        zzceiVar.zzad("/getNativeClickMeta", zzbho.zzt);
    }

    public final zzfut zza(final JSONObject jSONObject) {
        return zzfuj.zzm(zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcei) obj);
            }
        }, this.zzb);
    }

    public final zzfut zzb(final String str, final String str2, final zzeyc zzeycVar, final zzeyf zzeyfVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzd(zzqVar, zzeycVar, zzeyfVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzfut zzc(JSONObject jSONObject, final zzcei zzceiVar) throws Exception {
        final zzbzr zzbzrVarZza = zzbzr.zza(zzceiVar);
        if (this.zza.zzb != null) {
            zzceiVar.zzag(zzcfx.zzd());
        } else {
            zzceiVar.zzag(zzcfx.zze());
        }
        zzceiVar.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdjq
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                this.zza.zzf(zzceiVar, zzbzrVarZza, z);
            }
        });
        zzceiVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzbzrVarZza;
    }

    final /* synthetic */ zzfut zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzeyc zzeycVar, zzeyf zzeyfVar, String str, String str2, Object obj) throws Exception {
        final zzcei zzceiVarZza = this.zzc.zza(zzqVar, zzeycVar, zzeyfVar);
        final zzbzr zzbzrVarZza = zzbzr.zza(zzceiVarZza);
        if (this.zza.zzb != null) {
            zzh(zzceiVarZza);
            zzceiVarZza.zzag(zzcfx.zzd());
        } else {
            zzdli zzdliVarZzb = this.zzd.zzb();
            zzceiVarZza.zzN().zzM(zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, zzdliVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzdliVarZzb, null, null);
            zzi(zzceiVarZza);
        }
        zzceiVarZza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                this.zza.zzg(zzceiVarZza, zzbzrVarZza, z);
            }
        });
        zzceiVarZza.zzab(str, str2, null);
        return zzbzrVarZza;
    }

    final /* synthetic */ zzfut zze(Object obj) throws Exception {
        zzcei zzceiVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzbzr zzbzrVarZza = zzbzr.zza(zzceiVarZza);
        zzh(zzceiVarZza);
        zzceiVarZza.zzN().zzG(new zzcfu() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzcfu
            public final void zza() {
                zzbzrVarZza.zzb();
            }
        });
        zzceiVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdn));
        return zzbzrVarZza;
    }

    final /* synthetic */ void zzf(zzcei zzceiVar, zzbzr zzbzrVar, boolean z) {
        if (this.zza.zza != null && zzceiVar.zzq() != null) {
            zzceiVar.zzq().zzs(this.zza.zza);
        }
        zzbzrVar.zzb();
    }

    final /* synthetic */ void zzg(zzcei zzceiVar, zzbzr zzbzrVar, boolean z) {
        if (!z) {
            zzbzrVar.zze(new zzeek(1, "Html video Web View failed to load."));
            return;
        }
        if (this.zza.zza != null && zzceiVar.zzq() != null) {
            zzceiVar.zzq().zzs(this.zza.zza);
        }
        zzbzrVar.zzb();
    }
}
