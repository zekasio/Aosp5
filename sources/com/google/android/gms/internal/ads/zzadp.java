package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadp implements zzbp {
    public final String zzf;

    public zzadp(String str) {
        this.zzf = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
