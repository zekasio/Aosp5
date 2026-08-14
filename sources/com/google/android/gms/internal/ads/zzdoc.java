package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdoc implements zzcxj, zzcwc, zzcur, zzcvi, com.google.android.gms.ads.internal.client.zza, zzczv {
    private final zzawe zza;
    private boolean zzb = false;

    public zzdoc(zzawe zzaweVar, @Nullable zzevx zzevxVar) {
        this.zza = zzaweVar;
        zzaweVar.zzc(2);
        if (zzevxVar != null) {
            zzaweVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(final zzeyo zzeyoVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzeyo zzeyoVar2 = zzeyoVar;
                zzawp zzawpVar = (zzawp) zzaxtVar.zza().zzaB();
                zzaxh zzaxhVar = (zzaxh) zzaxtVar.zza().zzd().zzaB();
                zzaxhVar.zza(zzeyoVar2.zzb.zzb.zzb);
                zzawpVar.zzb(zzaxhVar);
                zzaxtVar.zze(zzawpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzd() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zze(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdob
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawzVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzf(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawzVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzi(final zzawz zzawzVar) {
        this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdnz
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzaxtVar.zzf(zzawzVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        this.zza.zzc(3);
    }
}
