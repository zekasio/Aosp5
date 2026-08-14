package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbl {
    private final zzfbe zza;
    private final zzfut zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfbl(final zzfaj zzfajVar, final zzfbd zzfbdVar, final zzfbe zzfbeVar) {
        this.zza = zzfbeVar;
        this.zzb = zzfuj.zzf(zzfuj.zzm(zzfbdVar.zza(zzfbeVar), new zzftq() { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzb(zzfbdVar, zzfajVar, zzfbeVar, (zzfas) obj);
            }
        }, zzfbeVar.zzb()), Exception.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(zzfbdVar, (Exception) obj);
            }
        }, zzfbeVar.zzb());
    }

    public final synchronized zzfut zza(zzfbe zzfbeVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfbeVar.zza() != null && this.zza.zza().equals(zzfbeVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ zzfut zzb(zzfbd zzfbdVar, zzfaj zzfajVar, zzfbe zzfbeVar, zzfas zzfasVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfbdVar.zzb(zzfasVar);
            if (this.zzc) {
                return zzfuj.zzh(new zzfbc(zzfasVar, zzfbeVar));
            }
            zzfajVar.zzd(zzfbeVar.zza(), zzfasVar);
            return zzfuj.zzh(null);
        }
    }

    final /* synthetic */ zzfut zzc(zzfbd zzfbdVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuf zzfufVar) {
        zzfuj.zzq(zzfuj.zzm(this.zzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzfbi
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzi();
            }
        }, this.zza.zzb()), zzfufVar, this.zza.zzb());
    }
}
