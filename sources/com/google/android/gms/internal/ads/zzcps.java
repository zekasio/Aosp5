package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcps extends zzcok {
    private final zzbfo zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcps(zzcql zzcqlVar, zzbfo zzbfoVar, Runnable runnable, Executor executor) {
        super(zzcqlVar);
        this.zzc = zzbfoVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzeyd zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzeyd zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zzj() {
        final zzcpq zzcpqVar = new zzcpq(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzcpqVar);
            }
        });
    }

    final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcpq) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcpq) runnable).zza);
        }
    }
}
