package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcap extends TextureView implements zzcbm {
    protected final zzcbd zza;
    protected final zzcbn zzb;
    protected final Integer zzc;

    public zzcap(Context context, Integer num) {
        super(context);
        this.zza = new zzcbd();
        this.zzb = new zzcbn(context, this);
        this.zzc = num;
    }

    public void zzA(int i) {
    }

    public void zzB(String str, String[] strArr) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i);

    public abstract void zzr(zzcao zzcaoVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f, float f2);

    public void zzw(int i) {
    }

    public void zzx(int i) {
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
