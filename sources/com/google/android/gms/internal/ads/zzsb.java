package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsb extends zzrt {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgi zzc;

    protected zzsb() {
    }

    protected final void zzA(final Object obj, zzsu zzsuVar) {
        zzdl.zzd(!this.zza.containsKey(obj));
        zzst zzstVar = new zzst() { // from class: com.google.android.gms.internal.ads.zzry
            @Override // com.google.android.gms.internal.ads.zzst
            public final void zza(zzsu zzsuVar2, zzcn zzcnVar) {
                this.zza.zzz(obj, zzsuVar2, zzcnVar);
            }
        };
        zzrz zzrzVar = new zzrz(this, obj);
        this.zza.put(obj, new zzsa(zzsuVar, zzstVar, zzrzVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzsuVar.zzh(handler, zzrzVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzsuVar.zzg(handler2, zzrzVar);
        zzsuVar.zzm(zzstVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zzsuVar.zzi(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected final void zzj() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzi(zzsaVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected final void zzl() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzk(zzsaVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected void zzn(zzgi zzgiVar) {
        this.zzc = zzgiVar;
        this.zzb = zzew.zzD(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected void zzq() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzp(zzsaVar.zzb);
            zzsaVar.zza.zzs(zzsaVar.zzc);
            zzsaVar.zza.zzr(zzsaVar.zzc);
        }
        this.zza.clear();
    }

    protected int zzv(Object obj, int i) {
        return 0;
    }

    protected long zzw(Object obj, long j) {
        return j;
    }

    protected zzss zzx(Object obj, zzss zzssVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public void zzy() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzsa) it.next()).zza.zzy();
        }
    }

    protected abstract void zzz(Object obj, zzsu zzsuVar, zzcn zzcnVar);
}
