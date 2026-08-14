package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwk {
    private zzwj zza;
    private zzws zzb;

    public void zzh() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzi(zzk zzkVar) {
        throw null;
    }

    public boolean zzl() {
        throw null;
    }

    public abstract zzwl zzn(zzko[] zzkoVarArr, zzur zzurVar, zzss zzssVar, zzcn zzcnVar) throws zzhj;

    public abstract void zzo(Object obj);

    protected final zzws zzp() {
        zzws zzwsVar = this.zzb;
        zzdl.zzb(zzwsVar);
        return zzwsVar;
    }

    public final void zzq(zzwj zzwjVar, zzws zzwsVar) {
        this.zza = zzwjVar;
        this.zzb = zzwsVar;
    }

    protected final void zzr() {
        zzwj zzwjVar = this.zza;
        if (zzwjVar != null) {
            zzwjVar.zzj();
        }
    }
}
