package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyd {
    private final zzxn zza = new zzxn();
    private final zzxz zzb;
    private final zzyc zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzyd(Context context) {
        zzxz zzxzVarZzc;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzew.zza;
            zzxzVarZzc = zzyb.zzc(applicationContext);
            if (zzxzVarZzc == null) {
                zzxzVarZzc = zzya.zzc(applicationContext);
            }
        } else {
            zzxzVarZzc = null;
        }
        this.zzb = zzxzVarZzc;
        this.zzc = zzxzVarZzc != null ? zzyc.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzyd zzydVar, Display display) {
        if (display == null) {
            zzee.zze("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzydVar.zzk = -9223372036854775807L;
            zzydVar.zzl = -9223372036854775807L;
        } else {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            zzydVar.zzk = j;
            zzydVar.zzl = (j * 80) / 100;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzew.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzxy.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzew.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (fZza == f) {
            return;
        }
        if (fZza != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                f2 = 0.02f;
            }
            if (Math.abs(fZza - this.zzg) < f2) {
                return;
            }
        } else if (fZza == -1.0f && this.zza.zzb() < 30) {
            return;
        }
        this.zzg = fZza;
        zzn(false);
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzew.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzxy.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zza.zzc();
            long j3 = this.zzq + ((long) ((jZzc * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzyc zzycVar = this.zzc;
        if (zzycVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j4 = zzycVar.zza;
        if (j4 == -9223372036854775807L) {
            return j;
        }
        long j5 = this.zzk;
        long j6 = j4 + (((j - j4) / j5) * j5);
        if (j <= j6) {
            j2 = j6 - j5;
        } else {
            j6 = j5 + j6;
            j2 = j6;
        }
        long j7 = this.zzl;
        if (j6 - j >= j - j2) {
            j6 = j2;
        }
        return j6 - j7;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzyc zzycVar = this.zzc;
            zzycVar.getClass();
            zzycVar.zzb();
            this.zzb.zzb(new zzxx(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxz zzxzVar = this.zzb;
        if (zzxzVar != null) {
            zzxzVar.zza();
            zzyc zzycVar = this.zzc;
            zzycVar.getClass();
            zzycVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzxv)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
