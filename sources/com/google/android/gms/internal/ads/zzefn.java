package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefn implements zzeba {
    private final Context zza;
    private final Executor zzb;
    private final zzdlz zzc;

    public zzefn(Context context, Executor executor, zzdlz zzdlzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdlzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) {
        try {
            ((zzezs) zzeawVar.zzb).zzk(zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString());
        } catch (Exception e) {
            zzbza.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeawVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, final zzeaw zzeawVar) throws zzezc, zzeek {
        zzdlv zzdlvVarZze = this.zzc.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdlw(new zzdee() { // from class: com.google.android.gms.internal.ads.zzefj
            @Override // com.google.android.gms.internal.ads.zzdee
            public final void zza(boolean z, Context context, zzcvb zzcvbVar) throws zzded {
                zzeaw zzeawVar2 = zzeawVar;
                try {
                    ((zzezs) zzeawVar2.zzb).zzv(z);
                    ((zzezs) zzeawVar2.zzb).zzA();
                } catch (zzezc e) {
                    zzbza.zzk("Cannot show rewarded video.", e);
                    throw new zzded(e.getCause());
                }
            }
        }));
        zzdlvVarZze.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzb);
        zzcvv zzcvvVarZze = zzdlvVarZze.zze();
        zzcum zzcumVarZzb = zzdlvVarZze.zzb();
        ((zzecr) zzeawVar.zzc).zzc(new zzefm(this, zzdlvVarZze.zza(), zzcumVarZzb, zzcvvVarZze, zzdlvVarZze.zzg()));
        return zzdlvVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        if (((zzezs) zzeawVar.zzb).zzC()) {
            zze(zzeyoVar, zzeycVar, zzeawVar);
            return;
        }
        ((zzecr) zzeawVar.zzc).zzd(new zzefl(this, zzeyoVar, zzeycVar, zzeawVar));
        ((zzezs) zzeawVar.zzb).zzh(this.zza, zzeyoVar.zza.zza.zzd, null, (zzbuo) zzeawVar.zzc, zzeycVar.zzw.toString());
    }
}
