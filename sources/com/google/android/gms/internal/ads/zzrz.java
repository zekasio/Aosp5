package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrz implements zztc, zzpu {
    final /* synthetic */ zzsb zza;
    private final Object zzb;
    private zztb zzc;
    private zzpt zzd;

    public zzrz(zzsb zzsbVar, Object obj) {
        this.zza = zzsbVar;
        this.zzc = zzsbVar.zze(null);
        this.zzd = zzsbVar.zzc(null);
        this.zzb = obj;
    }

    private final zzso zzf(zzso zzsoVar) {
        zzsb zzsbVar = this.zza;
        Object obj = this.zzb;
        long j = zzsoVar.zzc;
        zzsbVar.zzw(obj, j);
        zzsb zzsbVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzsoVar.zzd;
        zzsbVar2.zzw(obj2, j2);
        return (j == zzsoVar.zzc && j2 == zzsoVar.zzd) ? zzsoVar : new zzso(1, zzsoVar.zza, zzsoVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzss zzssVar) {
        zzss zzssVarZzx;
        if (zzssVar != null) {
            zzssVarZzx = this.zza.zzx(this.zzb, zzssVar);
            if (zzssVarZzx == null) {
                return false;
            }
        } else {
            zzssVarZzx = null;
        }
        this.zza.zzv(this.zzb, 0);
        zztb zztbVar = this.zzc;
        int i2 = zztbVar.zza;
        if (!zzew.zzU(zztbVar.zzb, zzssVarZzx)) {
            this.zzc = this.zza.zzf(0, zzssVarZzx, 0L);
        }
        zzpt zzptVar = this.zzd;
        int i3 = zzptVar.zza;
        if (zzew.zzU(zzptVar.zzb, zzssVarZzx)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzssVarZzx);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaf(int i, zzss zzssVar, zzso zzsoVar) {
        if (zzg(0, zzssVar)) {
            this.zzc.zzc(zzf(zzsoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzag(int i, zzss zzssVar, zzsj zzsjVar, zzso zzsoVar) {
        if (zzg(0, zzssVar)) {
            this.zzc.zze(zzsjVar, zzf(zzsoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzah(int i, zzss zzssVar, zzsj zzsjVar, zzso zzsoVar) {
        if (zzg(0, zzssVar)) {
            this.zzc.zzg(zzsjVar, zzf(zzsoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzai(int i, zzss zzssVar, zzsj zzsjVar, zzso zzsoVar, IOException iOException, boolean z) {
        if (zzg(0, zzssVar)) {
            this.zzc.zzi(zzsjVar, zzf(zzsoVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaj(int i, zzss zzssVar, zzsj zzsjVar, zzso zzsoVar) {
        if (zzg(0, zzssVar)) {
            this.zzc.zzk(zzsjVar, zzf(zzsoVar));
        }
    }
}
