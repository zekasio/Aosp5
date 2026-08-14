package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbf extends zzczy implements zzdbh {
    public zzdbf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzp(new zzczx(str2) { // from class: com.google.android.gms.internal.ads.zzdbe
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzb(final String str, final String str2) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdbc
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzc(final String str) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdbb
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzd(final String str) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdbd
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zze() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdba
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzf() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdaz
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzdbh) obj).zzf();
            }
        });
    }
}
