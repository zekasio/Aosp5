package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;
    public static final zzaw zza = new zzaw(new zzau());
    private static final String zzh = zzew.zzP(0);
    private static final String zzi = zzew.zzP(1);
    private static final String zzj = zzew.zzP(2);
    private static final String zzk = zzew.zzP(3);
    private static final String zzl = zzew.zzP(4);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzat
    };

    private zzaw(zzau zzauVar) {
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        long j = zzawVar.zzc;
        long j2 = zzawVar.zzd;
        long j3 = zzawVar.zze;
        float f = zzawVar.zzf;
        float f2 = zzawVar.zzg;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
