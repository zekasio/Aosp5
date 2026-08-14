package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafh extends zzafj {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzafh(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final String toString() {
        return zzf(this.zzd) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzafh zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzafh zzafhVar = (zzafh) this.zzc.get(i2);
            if (zzafhVar.zzd == i) {
                return zzafhVar;
            }
        }
        return null;
    }

    public final zzafi zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzafi zzafiVar = (zzafi) this.zzb.get(i2);
            if (zzafiVar.zzd == i) {
                return zzafiVar;
            }
        }
        return null;
    }

    public final void zzc(zzafh zzafhVar) {
        this.zzc.add(zzafhVar);
    }

    public final void zzd(zzafi zzafiVar) {
        this.zzb.add(zzafiVar);
    }
}
