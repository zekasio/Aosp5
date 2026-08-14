package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfff {
    private final Context zza;
    private final Executor zzb;
    private final zzbzf zzc;
    private final zzfep zzd;

    zzfff(Context context, Executor executor, zzbzf zzbzfVar, zzfep zzfepVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzbzfVar;
        this.zzd = zzfepVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    final /* synthetic */ void zzb(String str, zzfen zzfenVar) {
        zzfec zzfecVarZza = zzfeb.zza(this.zza, 14);
        zzfecVarZza.zzh();
        zzfecVarZza.zzf(this.zzc.zza(str));
        if (zzfenVar == null) {
            this.zzd.zzb(zzfecVarZza.zzl());
        } else {
            zzfenVar.zza(zzfecVarZza);
            zzfenVar.zzg();
        }
    }

    public final void zzc(final String str, final zzfen zzfenVar) {
        if (zzfep.zza() && ((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(str, zzfenVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
