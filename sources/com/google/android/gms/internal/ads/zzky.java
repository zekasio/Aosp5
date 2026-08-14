package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzky {
    private final Context zza;
    private final Handler zzb;
    private final zzku zzc;
    private final AudioManager zzd;
    private zzkx zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzky(Context context, Handler handler, zzku zzkuVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkuVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzdl.zzb(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzkx zzkxVar = new zzkx(this, null);
        try {
            zzew.zzA(applicationContext, zzkxVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkxVar;
        } catch (RuntimeException e) {
            zzee.zzf("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzee.zzf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        final int iZzg = zzg(this.zzd, this.zzf);
        final boolean zZzi = zzi(this.zzd, this.zzf);
        if (this.zzg == iZzg && this.zzh == zZzi) {
            return;
        }
        this.zzg = iZzg;
        this.zzh = zZzi;
        zzeb zzebVar = ((zziy) this.zzc).zza.zzl;
        zzebVar.zzd(30, new zzdy() { // from class: com.google.android.gms.internal.ads.zzit
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                int i = iZzg;
                boolean z = zZzi;
                int i2 = zziy.zzb;
                ((zzcd) obj).zzc(i, z);
            }
        });
        zzebVar.zzc();
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        return zzew.zza >= 23 ? audioManager.isStreamMute(i) : zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzew.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzkx zzkxVar = this.zze;
        if (zzkxVar != null) {
            try {
                this.zza.unregisterReceiver(zzkxVar);
            } catch (RuntimeException e) {
                zzee.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzh();
        zziy zziyVar = (zziy) this.zzc;
        final zzt zztVarZzal = zzjc.zzal(zziyVar.zza.zzz);
        if (zztVarZzal.equals(zziyVar.zza.zzab)) {
            return;
        }
        zziyVar.zza.zzab = zztVarZzal;
        zzeb zzebVar = zziyVar.zza.zzl;
        zzebVar.zzd(29, new zzdy() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzt zztVar = zztVarZzal;
                int i2 = zziy.zzb;
                ((zzcd) obj).zzb(zztVar);
            }
        });
        zzebVar.zzc();
    }
}
