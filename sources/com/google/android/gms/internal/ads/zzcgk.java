package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcgk implements zzgwy {
    private final zzcgg zza;

    public zzcgk(zzcgg zzcggVar) {
        this.zza = zzcggVar;
    }

    public final WeakReference zza() {
        WeakReference weakReferenceZzf = this.zza.zzf();
        zzgxg.zzb(weakReferenceZzf);
        return weakReferenceZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        WeakReference weakReferenceZzf = this.zza.zzf();
        zzgxg.zzb(weakReferenceZzf);
        return weakReferenceZzf;
    }
}
