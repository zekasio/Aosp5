package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcng implements zzatf, zzcvj, com.google.android.gms.ads.internal.overlay.zzo, zzcvi {
    private final zzcnb zza;
    private final zzcnc zzb;
    private final zzbmr zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnf zzh = new zzcnf();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcng(zzbmo zzbmoVar, zzcnc zzcncVar, Executor executor, zzcnb zzcnbVar, Clock clock) {
        this.zza = zzcnbVar;
        this.zzd = zzbmoVar.zza("google.afma.activeView.handleUpdate", zzbmc.zza, zzbmc.zza);
        this.zzb = zzcncVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcei) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbF() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final synchronized void zzbn(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final synchronized void zzbp(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final synchronized void zzbq(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zzc(zzate zzateVar) {
        zzcnf zzcnfVar = this.zzh;
        zzcnfVar.zza = zzateVar.zzj;
        zzcnfVar.zzf = zzateVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            this.zzh.zzd = this.zzf.elapsedRealtime();
            final JSONObject jSONObjectZza = this.zzb.zzb(this.zzh);
            for (final zzcei zzceiVar : this.zzc) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcne
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzceiVar.zzl("AFMA_updateActiveView", jSONObjectZza);
                    }
                });
            }
            zzbzq.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzh(zzcei zzceiVar) {
        this.zzc.add(zzceiVar);
        this.zza.zzd(zzceiVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
