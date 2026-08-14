package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeni implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeni(zzfuu zzfuuVar, zzeyx zzeyxVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeyxVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzenj zzc(final zzeni zzeniVar) {
        final ArrayList arrayList = zzeniVar.zzb.zzg;
        return arrayList == null ? new zzenj() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzenj() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzenj() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                this.zza.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeni.zzc(this.zza);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeni.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
