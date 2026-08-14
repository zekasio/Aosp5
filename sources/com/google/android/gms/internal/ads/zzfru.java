package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfru extends zzfqk {
    final /* synthetic */ zzfrv zza;

    zzfru(zzfrv zzfrvVar) {
        this.zza = zzfrvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfnu.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzfrv zzfrvVar = this.zza;
        int i2 = i + i;
        Object obj = zzfrvVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzfrvVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final boolean zzf() {
        return true;
    }
}
