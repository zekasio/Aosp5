package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkc implements zztc, zzpu {
    final /* synthetic */ zzkg zza;
    private final zzke zzb;

    public zzkc(zzkg zzkgVar, zzke zzkeVar) {
        this.zza = zzkgVar;
        this.zzb = zzkeVar;
    }

    private final Pair zzf(int i, zzss zzssVar) {
        zzss zzssVarZzc;
        zzss zzssVar2 = null;
        if (zzssVar != null) {
            zzke zzkeVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkeVar.zzc.size()) {
                    zzssVarZzc = null;
                    break;
                }
                if (((zzss) zzkeVar.zzc.get(i2)).zzd == zzssVar.zzd) {
                    zzssVarZzc = zzssVar.zzc(Pair.create(zzkeVar.zzb, zzssVar.zza));
                    break;
                }
                i2++;
            }
            if (zzssVarZzc == null) {
                return null;
            }
            zzssVar2 = zzssVarZzc;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzssVar2);
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaf(int i, zzss zzssVar, final zzso zzsoVar) {
        final Pair pairZzf = zzf(0, zzssVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // java.lang.Runnable
                public final void run() {
                    zzkc zzkcVar = this.zza;
                    Pair pair = pairZzf;
                    zzkcVar.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzss) pair.second, zzsoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzag(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final Pair pairZzf = zzf(0, zzssVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjz
                @Override // java.lang.Runnable
                public final void run() {
                    zzkc zzkcVar = this.zza;
                    Pair pair = pairZzf;
                    zzkcVar.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar, zzsoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzah(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final Pair pairZzf = zzf(0, zzssVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // java.lang.Runnable
                public final void run() {
                    zzkc zzkcVar = this.zza;
                    Pair pair = pairZzf;
                    zzkcVar.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar, zzsoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzai(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zzssVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzkc zzkcVar = this.zza;
                    Pair pair = pairZzf;
                    zzkcVar.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar, zzsoVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaj(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final Pair pairZzf = zzf(0, zzssVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkb
                @Override // java.lang.Runnable
                public final void run() {
                    zzkc zzkcVar = this.zza;
                    Pair pair = pairZzf;
                    zzkcVar.zza.zzh.zzaj(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar, zzsoVar);
                }
            });
        }
    }
}
