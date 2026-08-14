package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeev implements zzeba {
    private final Context zza;
    private final zzdlz zzb;

    public zzeev(Context context, zzdlz zzdlzVar) {
        this.zza = context;
        this.zzb = zzdlzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        zzecz zzeczVar = new zzecz(zzeycVar, (zzbpc) zzeawVar.zzb, AdFormat.REWARDED);
        zzdlv zzdlvVarZze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdlw(zzeczVar));
        zzeczVar.zzb(zzdlvVarZze.zzc());
        ((zzecq) zzeawVar.zzc).zzc(zzdlvVarZze.zzn());
        return zzdlvVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            if (zzeyoVar.zza.zza.zzo.zza == 3) {
                ((zzbpc) zzeawVar.zzb).zzo(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeeu(this, zzeawVar, null), (zzbnl) zzeawVar.zzc);
            } else {
                ((zzbpc) zzeawVar.zzb).zzp(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeeu(this, zzeawVar, null), (zzbnl) zzeawVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
