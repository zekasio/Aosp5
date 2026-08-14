package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzz implements zzfvo {
    private static final byte[] zza = new byte[0];
    private final zzgld zzb;
    private final zzfvo zzc;

    public zzfzz(zzgld zzgldVar, zzfvo zzfvoVar) {
        this.zzb = zzgldVar;
        this.zzc = zzfvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((zzfvo) zzfxf.zzj(this.zzb.zzg(), this.zzc.zza(bArr3, zza), zzfvo.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzax = zzfxf.zzd(this.zzb).zzax();
        byte[] bArrZzb = this.zzc.zzb(bArrZzax, zza);
        byte[] bArrZzb2 = ((zzfvo) zzfxf.zzj(this.zzb.zzg(), bArrZzax, zzfvo.class)).zzb(bArr, bArr2);
        int length = bArrZzb.length;
        return ByteBuffer.allocate(length + 4 + bArrZzb2.length).putInt(length).put(bArrZzb).put(bArrZzb2).array();
    }
}
