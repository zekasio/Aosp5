package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaal {
    private final zzen zza = new zzen(10);

    public final zzbq zza(zzzv zzzvVar, zzadm zzadmVar) throws Throwable {
        zzbq zzbqVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zzzk) zzzvVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int iZzj = this.zza.zzj();
                int i2 = iZzj + 10;
                if (zzbqVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzzk) zzzvVar).zzm(bArr, 10, iZzj, false);
                    zzbqVarZza = zzado.zza(bArr, i2, zzadmVar, new zzacp());
                } else {
                    ((zzzk) zzzvVar).zzl(iZzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzvVar.zzj();
        ((zzzk) zzzvVar).zzl(i, false);
        return zzbqVarZza;
    }
}
