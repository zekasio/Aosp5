package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebn implements zzeba {
    private final Context zza;
    private final zzcny zzb;

    zzebn(Context context, zzcny zzcnyVar) {
        this.zza = context;
        this.zzb = zzcnyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        zzecz zzeczVar = new zzecz(zzeycVar, (zzbpc) zzeawVar.zzb, AdFormat.APP_OPEN_AD);
        zzcnv zzcnvVarZza = this.zzb.zza(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdcz(zzeczVar, null), new zzcnw(zzeycVar.zzab));
        zzeczVar.zzb(zzcnvVarZza.zzc());
        ((zzecq) zzeawVar.zzc).zzc(zzcnvVarZza.zzi());
        return zzcnvVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            ((zzbpc) zzeawVar.zzb).zzi(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzebm(zzeawVar, null), (zzbnl) zzeawVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzezc(e);
        }
    }
}
