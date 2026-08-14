package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzcor {
    private final zzcqk zza;
    private final View zzb;
    private final zzeyd zzc;
    private final zzcei zzd;

    public zzcor(View view, zzcei zzceiVar, zzcqk zzcqkVar, zzeyd zzeydVar) {
        this.zzb = view;
        this.zzd = zzceiVar;
        this.zza = zzcqkVar;
        this.zzc = zzeydVar;
    }

    public static final zzdbu zzf(final Context context, final zzbzg zzbzgVar, final zzeyc zzeycVar, final zzeyx zzeyxVar) {
        return new zzdbu(new zzcwc() { // from class: com.google.android.gms.internal.ads.zzcop
            @Override // com.google.android.gms.internal.ads.zzcwc
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzbzgVar.zza, zzeycVar.zzD.toString(), zzeyxVar.zzf);
            }
        }, zzbzn.zzf);
    }

    public static final Set zzg(zzcqb zzcqbVar) {
        return Collections.singleton(new zzdbu(zzcqbVar, zzbzn.zzf));
    }

    public static final zzdbu zzh(zzcpz zzcpzVar) {
        return new zzdbu(zzcpzVar, zzbzn.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcei zzb() {
        return this.zzd;
    }

    public final zzcqk zzc() {
        return this.zza;
    }

    public zzcwa zzd(Set set) {
        return new zzcwa(set);
    }

    public final zzeyd zze() {
        return this.zzc;
    }
}
