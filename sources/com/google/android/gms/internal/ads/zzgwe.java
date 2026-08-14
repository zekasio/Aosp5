package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwe extends zzgqm implements zzgrx {
    private static final zzgwe zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private zzgqv zzh = zzgqm.zzaM();
    private String zzi = "";
    private String zzj = "";
    private zzgqv zzm = zzaM();

    static {
        zzgwe zzgweVar = new zzgwe();
        zzb = zzgweVar;
        zzgqm.zzaT(zzgwe.class, zzgweVar);
    }

    private zzgwe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\nဌ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", zzgwd.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgwc.class, "zzf", "zzn", zzgwa.zza, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzgwe();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgvz(zzgubVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
