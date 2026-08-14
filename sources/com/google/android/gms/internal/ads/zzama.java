package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzama {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << Ascii.DLE) & 16711680) | (65280 & (bArr[2] << 8)) | (bArr[3] & UByte.MAX_VALUE);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << Ascii.DLE) & 16711680) | (65280 & (bArr[2] << 8)) | (bArr[3] & UByte.MAX_VALUE);
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long jZze = zze(byteBuffer) << 32;
        if (jZze >= 0) {
            return jZze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
