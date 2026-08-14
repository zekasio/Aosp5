package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnd {
    private final ECPublicKey zza;

    public zzgnd(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzgnc zza(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        KeyPair keyPairZzb = zzgne.zzb(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzb.getPublic();
        byte[] bArrZze = zzgne.zze((ECPrivateKey) keyPairZzb.getPrivate(), this.zza);
        byte[] bArrZzj = zzgne.zzj(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] bArrZzb = zzgmv.zzb(bArrZzj, bArrZze);
        Mac mac = (Mac) zzgnn.zzb.zza(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] bArrDoFinal = mac.doFinal(bArrZzb);
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i4 = 0;
        while (true) {
            mac.update(bArrDoFinal2);
            mac.update(bArr2);
            mac.update((byte) i3);
            bArrDoFinal2 = mac.doFinal();
            int length = bArrDoFinal2.length;
            int i5 = i4 + length;
            if (i5 >= i) {
                System.arraycopy(bArrDoFinal2, 0, bArr3, i4, i - i4);
                return new zzgnc(bArrZzj, bArr3);
            }
            System.arraycopy(bArrDoFinal2, 0, bArr3, i4, length);
            i3++;
            i4 = i5;
        }
    }
}
