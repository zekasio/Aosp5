package com.google.android.gms.internal.ads;

import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdua implements zzgwy {
    public static zzdua zza() {
        return zzdtz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzgxg.zzb(string);
        return string;
    }
}
