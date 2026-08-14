package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcgd implements zzclp {

    @Nullable
    private static zzcgd zza;

    private static synchronized zzcgd zzC(Context context, @Nullable zzbnf zzbnfVar, int i, boolean z, int i2, zzchg zzchgVar) {
        zzcgd zzcgdVar = zza;
        if (zzcgdVar != null) {
            return zzcgdVar;
        }
        zzbar.zzc(context);
        zzezq zzezqVarZzd = zzezq.zzd(context);
        zzbzg zzbzgVarZzc = zzezqVarZzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i2);
        zzezqVarZzd.zze(zzbnfVar);
        zzciu zzciuVar = new zzciu(null);
        zzcge zzcgeVar = new zzcge();
        zzcgeVar.zzd(zzbzgVarZzc);
        zzcgeVar.zzc(context);
        zzciuVar.zzb(new zzcgg(zzcgeVar, null));
        zzciuVar.zzc(new zzckh(zzchgVar, null));
        zzcgd zzcgdVarZza = zzciuVar.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(context, zzbzgVarZzc);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
        zzbxg.zzd(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzas)).booleanValue()) {
                zzawe zzaweVar = new zzawe(new zzawk(context));
                zzdzb zzdzbVar = new zzdzb(new zzdyx(context), zzcgdVarZza.zzz());
                com.google.android.gms.ads.internal.zzt.zzp();
                new zzdzx(context, zzbzgVarZzc, zzaweVar, zzdzbVar, UUID.randomUUID().toString(), zzcgdVarZza.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
            }
        }
        zza = zzcgdVarZza;
        return zzcgdVarZza;
    }

    public static zzcgd zza(Context context, @Nullable zzbnf zzbnfVar, int i) {
        return zzC(context, zzbnfVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzchg());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcks zzb();

    public abstract zzcnx zzc();

    public abstract zzcpg zzd();

    public abstract zzcxd zze();

    public abstract zzddv zzf();

    public abstract zzder zzg();

    public abstract zzdly zzh();

    public abstract zzdqq zzi();

    public abstract zzdsf zzj();

    public abstract zzdsz zzk();

    public abstract zzean zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzac zzo();

    @Override // com.google.android.gms.internal.ads.zzclp
    public final zzeqf zzp(zzbtn zzbtnVar, int i) {
        return zzq(new zzesh(zzbtnVar, i));
    }

    protected abstract zzeqf zzq(zzesh zzeshVar);

    public abstract zzetc zzr();

    public abstract zzeuq zzs();

    public abstract zzewh zzt();

    public abstract zzexv zzu();

    public abstract zzezj zzv();

    public abstract zzezt zzw();

    public abstract zzfdk zzx();

    public abstract zzfep zzy();

    public abstract zzfuu zzz();
}
