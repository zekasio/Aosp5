package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzatz {
    private final Object zza = new Object();
    private zzatx zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar == null) {
                return null;
            }
            return zzatxVar.zza();
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar == null) {
                return null;
            }
            return zzatxVar.zzb();
        }
    }

    public final void zzc(zzaty zzatyVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzatx();
            }
            this.zzb.zzf(zzatyVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbza.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzatx();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzaty zzatyVar) {
        synchronized (this.zza) {
            zzatx zzatxVar = this.zzb;
            if (zzatxVar == null) {
                return;
            }
            zzatxVar.zzh(zzatyVar);
        }
    }
}
