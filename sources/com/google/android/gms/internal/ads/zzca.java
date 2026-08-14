package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzca {
    private final zzy zza = new zzy();

    public final zzca zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzca zzb(zzcc zzccVar) {
        zzy zzyVar = this.zza;
        zzaa zzaaVar = zzccVar.zzd;
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            zzyVar.zza(zzaaVar.zza(i));
        }
        return this;
    }

    public final zzca zzc(int... iArr) {
        zzy zzyVar = this.zza;
        for (int i = 0; i < 21; i++) {
            zzyVar.zza(iArr[i]);
        }
        return this;
    }

    public final zzca zzd(int i, boolean z) {
        zzy zzyVar = this.zza;
        if (z) {
            zzyVar.zza(i);
        }
        return this;
    }

    public final zzcc zze() {
        return new zzcc(this.zza.zzb(), null);
    }
}
