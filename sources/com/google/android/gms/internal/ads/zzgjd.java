package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjd extends zzgqm implements zzgrx {
    private static final zzgjd zzb;
    private zzgld zzd;

    static {
        zzgjd zzgjdVar = new zzgjd();
        zzb = zzgjdVar;
        zzgqm.zzaT(zzgjd.class, zzgjdVar);
    }

    private zzgjd() {
    }

    public static zzgjc zza() {
        return (zzgjc) zzb.zzaA();
    }

    public static zzgjd zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgjd zzgjdVar, zzgld zzgldVar) {
        zzgldVar.getClass();
        zzgjdVar.zzd = zzgldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgjd();
        }
        zzgjb zzgjbVar = null;
        if (i2 == 4) {
            return new zzgjc(zzgjbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgld zze() {
        zzgld zzgldVar = this.zzd;
        return zzgldVar == null ? zzgld.zzd() : zzgldVar;
    }
}
