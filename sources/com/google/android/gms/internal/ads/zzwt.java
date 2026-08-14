package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwt {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzwm[] zzd = new zzwm[100];

    public zzwt(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzwm zzb() {
        zzwm zzwmVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzwm[] zzwmVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzwmVar = zzwmVarArr[i2];
            if (zzwmVar == null) {
                throw null;
            }
            zzwmVarArr[i2] = null;
        } else {
            zzwmVar = new zzwm(new byte[65536], 0);
            int i3 = this.zzb;
            zzwm[] zzwmVarArr2 = this.zzd;
            int length = zzwmVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzwm[]) Arrays.copyOf(zzwmVarArr2, length + length);
                return zzwmVar;
            }
        }
        return zzwmVar;
    }

    public final synchronized void zzc(zzwm zzwmVar) {
        zzwm[] zzwmVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzwmVarArr[i] = zzwmVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzwn zzwnVar) {
        while (zzwnVar != null) {
            zzwm[] zzwmVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzwmVarArr[i] = zzwnVar.zzc();
            this.zzb--;
            zzwnVar = zzwnVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int iMax = Math.max(0, zzew.zze(this.zza, 65536) - this.zzb);
        int i = this.zzc;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i, (Object) null);
        this.zzc = iMax;
    }
}
