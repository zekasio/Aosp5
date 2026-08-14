package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcch extends zzalx {
    static final zzcch zzb = new zzcch();

    zzcch() {
    }

    @Override // com.google.android.gms.internal.ads.zzalx
    public final zzamb zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzamd() : "mvhd".equals(str) ? new zzame() : new zzamf(str);
    }
}
