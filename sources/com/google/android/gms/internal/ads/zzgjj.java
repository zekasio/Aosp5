package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjj extends zzgqm implements zzgrx {
    private static final zzgjj zzb;
    private zzgjs zzd;
    private zzgjd zze;
    private int zzf;

    static {
        zzgjj zzgjjVar = new zzgjj();
        zzb = zzgjjVar;
        zzgqm.zzaT(zzgjj.class, zzgjjVar);
    }

    private zzgjj() {
    }

    public static zzgji zzc() {
        return (zzgji) zzb.zzaA();
    }

    public static zzgjj zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgjj zzgjjVar, zzgjs zzgjsVar) {
        zzgjsVar.getClass();
        zzgjjVar.zzd = zzgjsVar;
    }

    static /* synthetic */ void zzh(zzgjj zzgjjVar, zzgjd zzgjdVar) {
        zzgjdVar.getClass();
        zzgjjVar.zze = zzgjdVar;
    }

    public final zzgjd zza() {
        zzgjd zzgjdVar = this.zze;
        return zzgjdVar == null ? zzgjd.zzd() : zzgjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgjj();
        }
        zzgjh zzgjhVar = null;
        if (i2 == 4) {
            return new zzgji(zzgjhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjs zzf() {
        zzgjs zzgjsVar = this.zzd;
        return zzgjsVar == null ? zzgjs.zzd() : zzgjsVar;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
