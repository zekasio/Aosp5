package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzkr {
    private final zzht zza;

    @Deprecated
    public zzkr(Context context, zzcdr zzcdrVar, byte[] bArr) {
        this.zza = new zzht(context, zzcdrVar, null);
    }

    @Deprecated
    public final zzkr zza(final zzjp zzjpVar) {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        zzjpVar.getClass();
        zzhtVar.zzf = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhl
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzjpVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzkr zzb(final zzwk zzwkVar) {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        zzwkVar.getClass();
        zzhtVar.zze = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhm
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzwkVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzks zzc() {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        zzhtVar.zzq = true;
        return new zzks(zzhtVar);
    }
}
