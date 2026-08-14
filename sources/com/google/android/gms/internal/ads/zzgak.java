package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgak {
    int[] zza;
    private final int zzb;

    public zzgak(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgag.zzd(bArr);
        this.zzb = i;
    }

    private final void zzf(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i2);
            if (i2 == i) {
                zzgmv.zza(byteBuffer, byteBuffer2, byteBufferZzc, iRemaining % 64);
            } else {
                zzgmv.zza(byteBuffer, byteBuffer2, byteBufferZzc, 64);
            }
        }
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i);

    final ByteBuffer zzc(byte[] bArr, int i) {
        int[] iArrZzb = zzb(zzgag.zzd(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgag.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrZzb[i2] = iArrZzb[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zzf(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zzf(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
