package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqi implements zzepn {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbya zzd;

    public zzeqi(zzbya zzbyaVar, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzbyaVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzf(zzfuj.zzl(zzfuj.zzh(this.zzb), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return new zzeqj((String) obj);
            }
        }, this.zza), Throwable.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ zzfut zzc(Throwable th) throws Exception {
        return zzfuj.zzh(new zzeqj(this.zzb));
    }
}
