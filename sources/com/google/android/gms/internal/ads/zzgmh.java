package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgmh extends zzgqm implements zzgrx {
    private static final zzgmh zzb;
    private String zzd = "";
    private zzgqv zze = zzaM();

    static {
        zzgmh zzgmhVar = new zzgmh();
        zzb = zzgmhVar;
        zzgqm.zzaT(zzgmh.class, zzgmhVar);
    }

    private zzgmh() {
    }

    public static zzgmh zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzglg.class});
        }
        if (i2 == 3) {
            return new zzgmh();
        }
        zzgmf zzgmfVar = null;
        if (i2 == 4) {
            return new zzgmg(zzgmfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzd() {
        return this.zze;
    }
}
