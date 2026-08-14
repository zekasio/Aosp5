package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzt implements zzabb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzabb
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaaz.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws IOException {
        int iZza = zzrVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzk(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final /* synthetic */ void zzq(zzen zzenVar, int i) {
        zzaaz.zzb(this, zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzr(zzen zzenVar, int i, int i2) {
        zzenVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzs(long j, int i, int i2, int i3, zzaba zzabaVar) {
    }
}
