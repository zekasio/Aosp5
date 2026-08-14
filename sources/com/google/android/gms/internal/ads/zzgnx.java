package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnx {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & UByte.MAX_VALUE) >> 4));
            sb.append("0123456789abcdef".charAt(b & Ascii.SI));
        }
        return sb.toString();
    }
}
