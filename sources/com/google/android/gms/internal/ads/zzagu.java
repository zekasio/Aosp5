package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzagu extends zzagy {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzagu() {
    }

    public static boolean zzd(zzen zzenVar) {
        return zzk(zzenVar, zza);
    }

    private static boolean zzk(zzen zzenVar, byte[] bArr) {
        if (zzenVar.zza() < 8) {
            return false;
        }
        int iZzc = zzenVar.zzc();
        byte[] bArr2 = new byte[8];
        zzenVar.zzB(bArr2, 0, 8);
        zzenVar.zzF(iZzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final long zza(zzen zzenVar) {
        return zzg(zzaas.zzb(zzenVar.zzH()));
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws zzbu {
        if (zzk(zzenVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd());
            int i = bArrCopyOf[9] & UByte.MAX_VALUE;
            List listZzc = zzaas.zzc(bArrCopyOf);
            if (zzagvVar.zza != null) {
                return true;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/opus");
            zzadVar.zzw(i);
            zzadVar.zzT(48000);
            zzadVar.zzI(listZzc);
            zzagvVar.zza = zzadVar.zzY();
            return true;
        }
        if (!zzk(zzenVar, zzb)) {
            zzdl.zzb(zzagvVar.zza);
            return false;
        }
        zzdl.zzb(zzagvVar.zza);
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzenVar.zzG(8);
        zzbq zzbqVarZzb = zzabh.zzb(zzfqk.zzn(zzabh.zzc(zzenVar, false, false).zzb));
        if (zzbqVarZzb == null) {
            return true;
        }
        zzad zzadVarZzb = zzagvVar.zza.zzb();
        zzadVarZzb.zzM(zzbqVarZzb.zzd(zzagvVar.zza.zzk));
        zzagvVar.zza = zzadVarZzb.zzY();
        return true;
    }
}
