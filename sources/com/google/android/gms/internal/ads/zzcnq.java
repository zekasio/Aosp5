package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnq implements zzatf {
    private zzcei zza;
    private final Executor zzb;
    private final zzcnc zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnf zzg = new zzcnf();

    public zzcnq(Executor executor, zzcnc zzcncVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcncVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        zzcnf zzcnfVar = this.zzg;
        zzcnfVar.zza = this.zzf ? false : zzateVar.zzj;
        zzcnfVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzateVar;
        if (this.zze) {
            zzg();
        }
    }

    final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }
}
