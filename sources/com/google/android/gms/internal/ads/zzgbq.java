package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbq {
    private static final byte[] zza = new byte[0];
    private final zzgbp zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgbq(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgbp zzgbpVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgbpVar;
    }

    static zzgbq zzc(byte[] bArr, byte[] bArr2, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrZzb = zzgcc.zzb(zzgbtVar.zzb(), zzgboVar.zzc(), zzgbpVar.zzb());
        byte[] bArr4 = zzgcc.zzl;
        byte[] bArr5 = zza;
        byte[] bArrZzb2 = zzgmv.zzb(zzgcc.zza, zzgboVar.zze(bArr4, bArr5, "psk_id_hash", bArrZzb), zzgboVar.zze(zzgcc.zzl, bArr3, "info_hash", bArrZzb));
        byte[] bArrZze = zzgboVar.zze(bArr2, bArr5, "secret", bArrZzb);
        return new zzgbq(bArr, zzgboVar.zzd(bArrZze, bArrZzb2, "key", bArrZzb, zzgbpVar.zza()), zzgboVar.zzd(bArrZze, bArrZzb2, "base_nonce", bArrZzb, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgbpVar);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] bArrZzc;
        byte[] bArr = this.zze;
        BigInteger bigInteger = this.zzg;
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else {
                if (byteArray[0] != 0) {
                    throw new GeneralSecurityException("integer too large");
                }
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        bArrZzc = zzgmv.zzc(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return bArrZzc;
    }

    final byte[] zza() {
        return this.zzf;
    }

    final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
