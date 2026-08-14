package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaih extends zzzg {
    public zzaih(zzeu zzeuVar, long j, long j2) {
        super(new zzzb(), new zzaig(zzeuVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
