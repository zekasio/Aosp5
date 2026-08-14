package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnz implements zzggt {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgnz(byte[] bArr) throws GeneralSecurityException {
        zzgog.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZzb = zzggg.zzb(cipherZzb.doFinal(new byte[16]));
        this.zzb = bArrZzb;
        this.zzc = zzggg.zzb(bArrZzb);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgas.zza(1)) {
            return (Cipher) zzgnn.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, this.zza);
        int length = bArr.length;
        double d = length;
        Double.isNaN(d);
        int iMax = Math.max(1, (int) Math.ceil(d / 16.0d));
        byte[] bArrZzd = iMax * 16 == length ? zzgmv.zzd(bArr, (iMax - 1) * 16, this.zzb, 0, 16) : zzgmv.zzc(zzggg.zza(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.zzc);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherZzb.doFinal(zzgmv.zzd(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherZzb.doFinal(zzgmv.zzc(bArrZzd, bArrDoFinal)), i);
    }
}
