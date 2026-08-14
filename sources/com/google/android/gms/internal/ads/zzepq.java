package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepq {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfen zzd;
    private final zzdpi zze;

    public zzepq(Context context, Executor executor, Set set, zzfen zzfenVar, zzdpi zzdpiVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfenVar;
        this.zze = zzdpiVar;
    }

    public final zzfut zza(final Object obj) {
        zzfec zzfecVarZza = zzfeb.zza(this.zza, 8);
        zzfecVarZza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzepn zzepnVar : this.zzb) {
            zzfut zzfutVarZzb = zzepnVar.zzb();
            final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            zzfutVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(jElapsedRealtime, zzepnVar);
                }
            }, zzbzn.zzf);
            arrayList.add(zzfutVarZzb);
        }
        zzfut zzfutVarZza = zzfuj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzepp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzepm zzepmVar = (zzepm) ((zzfut) it.next()).get();
                    if (zzepmVar != null) {
                        zzepmVar.zzh(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfep.zza()) {
            zzfem.zza(zzfutVarZza, this.zzd, zzfecVarZza);
        }
        return zzfutVarZza;
    }

    public final void zzb(long j, zzepn zzepnVar) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbco.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfoj.zzc(zzepnVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbQ)).booleanValue()) {
            zzdph zzdphVarZza = this.zze.zza();
            zzdphVarZza.zzb("action", "lat_ms");
            zzdphVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdphVarZza.zzb("lat_id", String.valueOf(zzepnVar.zza()));
            zzdphVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            zzdphVarZza.zzh();
        }
    }
}
