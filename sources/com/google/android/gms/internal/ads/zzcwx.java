package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwx extends zzczy implements zzcvi, zzcwn {
    private final zzeyc zzb;
    private final AtomicBoolean zzc;

    public zzcwx(Set set, zzeyc zzeycVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzeycVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhg)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcww
                @Override // com.google.android.gms.internal.ads.zzczx
                public final void zza(Object obj) throws Exception {
                    this.zza.zza((zzcwz) obj);
                }
            });
        }
    }

    final /* synthetic */ void zza(zzcwz zzcwzVar) throws Exception {
        zzcwzVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
