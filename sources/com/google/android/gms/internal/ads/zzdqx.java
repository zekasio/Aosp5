package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqx implements zzdqh {
    private final long zza;
    private final zzdqm zzb;
    private final zzext zzc;

    zzdqx(long j, Context context, zzdqm zzdqmVar, zzcgd zzcgdVar, String str) {
        this.zza = j;
        this.zzb = zzdqmVar;
        zzexv zzexvVarZzu = zzcgdVar.zzu();
        zzexvVarZzu.zzb(context);
        zzexvVarZzu.zza(str);
        this.zzc = zzexvVarZzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdqv(this));
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqh
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdqw(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
