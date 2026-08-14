package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgz {
    private final AudioManager zza;
    private final zzgx zzb;
    private zzgy zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgz(Context context, Handler handler, zzgy zzgyVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzgyVar;
        this.zzb = new zzgx(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzew.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        zzgy zzgyVar = this.zzc;
        if (zzgyVar != null) {
            zziy zziyVar = (zziy) zzgyVar;
            boolean zZzy = zziyVar.zza.zzy();
            zziyVar.zza.zzat(zZzy, i, zzjc.zzag(zZzy, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzgy zzgyVar = this.zzc;
        if (zzgyVar != null) {
            ((zziy) zzgyVar).zza.zzaq();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzgz zzgzVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgzVar.zzg(3);
                return;
            } else {
                zzgzVar.zzf(0);
                zzgzVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzgzVar.zzf(-1);
            zzgzVar.zze();
        } else if (i == 1) {
            zzgzVar.zzg(1);
            zzgzVar.zzf(1);
        } else {
            zzee.zze("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
