package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfqj extends zzfqk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfqk zzc;

    zzfqj(zzfqk zzfqkVar, int i, int i2) {
        this.zzc = zzfqkVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfnu.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    @CheckForNull
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfqk
    /* JADX INFO: renamed from: zzh */
    public final zzfqk subList(int i, int i2) {
        zzfnu.zzg(i, i2, this.zzb);
        zzfqk zzfqkVar = this.zzc;
        int i3 = this.zza;
        return zzfqkVar.subList(i + i3, i2 + i3);
    }
}
