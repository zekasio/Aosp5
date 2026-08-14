package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgai {
    private static final ThreadLocal zza = new zzgah();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzgai(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!zzgas.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgog.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        this.zzc = z;
    }

    private static AlgorithmParameterSpec zzc(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        return (!zzgof.zza() || zzgek.zzc().intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z = this.zzc;
        int i = true != z ? 16 : 28;
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzc(bArr, 0, 12);
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzb, algorithmParameterSpecZzc);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z2 = this.zzc;
        int i2 = true != z2 ? 0 : 12;
        if (z2) {
            length -= 12;
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, i2, length);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z = this.zzc;
        byte[] bArr4 = new byte[z ? length + 28 : length + 16];
        if (z) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzc(bArr, 0, 12);
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(1, this.zzb, algorithmParameterSpecZzc);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.zzc ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
