package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdks implements com.google.android.gms.ads.internal.client.zza, zzbgi, com.google.android.gms.ads.internal.overlay.zzo, zzbgk, com.google.android.gms.ads.internal.overlay.zzz {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbgi zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbgk zzd;
    private com.google.android.gms.ads.internal.overlay.zzz zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final synchronized void zza(String str, Bundle bundle) {
        zzbgi zzbgiVar = this.zzb;
        if (zzbgiVar != null) {
            zzbgiVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbF() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbF();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void zzbz(String str, String str2) {
        zzbgk zzbgkVar = this.zzd;
        if (zzbgkVar != null) {
            zzbgkVar.zzbz(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zze;
        if (zzzVar != null) {
            zzzVar.zzg();
        }
    }

    protected final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbgi zzbgiVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbgk zzbgkVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar) {
        this.zza = zzaVar;
        this.zzb = zzbgiVar;
        this.zzc = zzoVar;
        this.zzd = zzbgkVar;
        this.zze = zzzVar;
    }
}
