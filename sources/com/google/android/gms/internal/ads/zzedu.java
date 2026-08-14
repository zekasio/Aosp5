package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedu implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    private zzbnu zzc;
    private final zzbzg zzd;

    public zzedu(Context context, zzdes zzdesVar, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = zzdesVar;
        this.zzd = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeek(2, "Unified must be used for RTB.");
        }
        zzdgi zzdgiVarZzs = zzdgi.zzs(this.zzc);
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(zzdgiVarZzs.zzc()))) {
            throw new zzeek(1, "No corresponding native ad listener");
        }
        zzdgk zzdgkVarZze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdgu(zzdgiVarZzs), new zzdij(null, null, this.zzc, null));
        ((zzecq) zzeawVar.zzc).zzc(zzdgkVarZze.zzi());
        return zzdgkVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            zzeds zzedsVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzby)).intValue()) {
                ((zzbpc) zzeawVar.zzb).zzm(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedt(this, zzeawVar, zzedsVar), (zzbnl) zzeawVar.zzc);
            } else {
                ((zzbpc) zzeawVar.zzb).zzn(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedt(this, zzeawVar, zzedsVar), (zzbnl) zzeawVar.zzc, zzeyoVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzezc(e);
        }
    }
}
