package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfex extends zzgqm implements zzgrx {
    private static final zzfex zzb;
    private zzgqv zzd = zzaM();

    static {
        zzfex zzfexVar = new zzfex();
        zzb = zzfexVar;
        zzgqm.zzaT(zzfex.class, zzfexVar);
    }

    private zzfex() {
    }

    public static zzfeu zzc() {
        return (zzfeu) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzfex zzfexVar, zzfew zzfewVar) {
        zzfewVar.getClass();
        zzgqv zzgqvVar = zzfexVar.zzd;
        if (!zzgqvVar.zzc()) {
            zzfexVar.zzd = zzgqm.zzaN(zzgqvVar);
        }
        zzfexVar.zzd.add(zzfewVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfew.class});
        }
        if (i2 == 3) {
            return new zzfex();
        }
        zzfet zzfetVar = null;
        if (i2 == 4) {
            return new zzfeu(zzfetVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
