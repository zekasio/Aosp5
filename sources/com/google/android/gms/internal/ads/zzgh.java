package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgh implements zzfg {
    private final zzfg zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int iZza = this.zza.zza(bArr, i, i2);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        this.zzc = zzflVar.zza;
        this.zzd = Collections.emptyMap();
        long jZzb = this.zza.zzb(zzflVar);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.zzc = uriZzc;
        this.zzd = zze();
        return jZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    public zzgh(zzfg zzfgVar) {
        zzfgVar.getClass();
        this.zza = zzfgVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
        zzgiVar.getClass();
        this.zza.zzf(zzgiVar);
    }
}
