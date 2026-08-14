package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoe extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zzoe(int i, int i2, int i3, int i4, zzaf zzafVar, boolean z, Exception exc) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzafVar;
    }
}
