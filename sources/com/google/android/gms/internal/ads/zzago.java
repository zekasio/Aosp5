package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzago extends zzagy {
    private zzaah zza;
    private zzagn zzb;

    zzago() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final long zza(zzen zzenVar) {
        if (!zzd(zzenVar.zzH())) {
            return -1L;
        }
        int i = (zzenVar.zzH()[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6) {
            zzenVar.zzG(4);
            zzenVar.zzu();
        } else if (i == 7) {
            i = 7;
            zzenVar.zzG(4);
            zzenVar.zzu();
        }
        int iZza = zzaad.zza(zzenVar, i);
        zzenVar.zzF(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) {
        byte[] bArrZzH = zzenVar.zzH();
        zzaah zzaahVar = this.zza;
        if (zzaahVar == null) {
            zzaah zzaahVar2 = new zzaah(bArrZzH, 17);
            this.zza = zzaahVar2;
            zzagvVar.zza = zzaahVar2.zzc(Arrays.copyOfRange(bArrZzH, 9, zzenVar.zzd()), null);
            return true;
        }
        if ((bArrZzH[0] & 127) == 3) {
            zzaag zzaagVarZzb = zzaae.zzb(zzenVar);
            zzaah zzaahVarZzf = zzaahVar.zzf(zzaagVarZzb);
            this.zza = zzaahVarZzf;
            this.zzb = new zzagn(zzaahVarZzf, zzaagVarZzb);
            return true;
        }
        if (!zzd(bArrZzH)) {
            return true;
        }
        zzagn zzagnVar = this.zzb;
        if (zzagnVar != null) {
            zzagnVar.zza(j);
            zzagvVar.zzb = this.zzb;
        }
        zzagvVar.zza.getClass();
        return false;
    }
}
