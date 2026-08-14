package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsi extends zzgow {
    final zzgsm zza;
    zzgoy zzb = zzb();
    final /* synthetic */ zzgso zzc;

    zzgsi(zzgso zzgsoVar) {
        this.zzc = zzgsoVar;
        this.zza = new zzgsm(zzgsoVar, null);
    }

    private final zzgoy zzb() {
        zzgsm zzgsmVar = this.zza;
        if (zzgsmVar.hasNext()) {
            return zzgsmVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgoy
    public final byte zza() {
        zzgoy zzgoyVar = this.zzb;
        if (zzgoyVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgoyVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
