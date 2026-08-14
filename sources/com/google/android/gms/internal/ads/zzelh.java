package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelh implements zzepn {
    private final zzeva zza;

    zzelh(zzeva zzevaVar) {
        this.zza = zzevaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        zzeva zzevaVar = this.zza;
        zzepm zzepmVar = null;
        if (zzevaVar != null && zzevaVar.zza() != null && !zzevaVar.zza().isEmpty()) {
            zzepmVar = new zzepm() { // from class: com.google.android.gms.internal.ads.zzelg
                @Override // com.google.android.gms.internal.ads.zzepm
                public final void zzh(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzfuj.zzh(zzepmVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
