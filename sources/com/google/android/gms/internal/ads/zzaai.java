package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaai implements zzzv {
    private final zzzv zza;

    public zzaai(zzzv zzzvVar) {
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        return this.zza.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final int zzc(int i) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzg(int i) throws IOException {
        ((zzzk) this.zza).zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzh(byte[] bArr, int i, int i2) throws IOException {
        ((zzzk) this.zza).zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        ((zzzk) this.zza).zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzk(int i) throws IOException {
        ((zzzk) this.zza).zzo(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
