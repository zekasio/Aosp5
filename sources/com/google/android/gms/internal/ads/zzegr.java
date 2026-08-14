package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegr {
    private final zzddw zza;

    public zzegr(Context context, zzddw zzddwVar) {
        this.zza = zzddwVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, View view, zzegn zzegnVar) {
        zzdcw zzdcwVarZze = this.zza.zze(new zzcrb(zzeyoVar, zzeycVar, null), new zzegp(this, new zzdee() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzdee
            public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
            }
        }));
        zzegnVar.zzd(new zzegq(this, zzdcwVarZze));
        return zzdcwVarZze.zzg();
    }
}
