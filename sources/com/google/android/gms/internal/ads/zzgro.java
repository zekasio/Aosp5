package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgro implements zzgsq {
    private static final zzgru zza = new zzgrm();
    private final zzgru zzb;

    public zzgro() {
        zzgru zzgruVar;
        zzgru[] zzgruVarArr = new zzgru[2];
        zzgruVarArr[0] = zzgqh.zza();
        try {
            zzgruVar = (zzgru) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzgruVar = zza;
        }
        zzgruVarArr[1] = zzgruVar;
        zzgrn zzgrnVar = new zzgrn(zzgruVarArr);
        zzgqw.zzf(zzgrnVar, "messageInfoFactory");
        this.zzb = zzgrnVar;
    }

    private static boolean zzb(zzgrt zzgrtVar) {
        return zzgrtVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsp zza(Class cls) {
        zzgsr.zzG(cls);
        zzgrt zzgrtVarZzb = this.zzb.zzb(cls);
        return zzgrtVarZzb.zzb() ? zzgqm.class.isAssignableFrom(cls) ? zzgsa.zzc(zzgsr.zzB(), zzgqb.zzb(), zzgrtVarZzb.zza()) : zzgsa.zzc(zzgsr.zzz(), zzgqb.zza(), zzgrtVarZzb.zza()) : zzgqm.class.isAssignableFrom(cls) ? zzb(zzgrtVarZzb) ? zzgrz.zzl(cls, zzgrtVarZzb, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), zzgqb.zzb(), zzgrs.zzb()) : zzgrz.zzl(cls, zzgrtVarZzb, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), null, zzgrs.zzb()) : zzb(zzgrtVarZzb) ? zzgrz.zzl(cls, zzgrtVarZzb, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzz(), zzgqb.zza(), zzgrs.zza()) : zzgrz.zzl(cls, zzgrtVarZzb, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzA(), null, zzgrs.zza());
    }
}
