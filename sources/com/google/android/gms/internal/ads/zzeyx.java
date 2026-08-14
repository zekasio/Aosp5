package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyx {
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    public final zzbjx zzb;
    public final zzeib zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbdl zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzeyk zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    /* synthetic */ zzeyx(zzeyv zzeyvVar, zzeyw zzeywVar) {
        this.zze = zzeyvVar.zzb;
        this.zzf = zzeyvVar.zzc;
        this.zzr = zzeyvVar.zzs;
        int i = zzeyvVar.zza.zza;
        long j = zzeyvVar.zza.zzb;
        Bundle bundle = zzeyvVar.zza.zzc;
        int i2 = zzeyvVar.zza.zzd;
        List list = zzeyvVar.zza.zze;
        boolean z = zzeyvVar.zza.zzf;
        int i3 = zzeyvVar.zza.zzg;
        boolean z2 = true;
        if (!zzeyvVar.zza.zzh && !zzeyvVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzeyvVar.zza.zzi, zzeyvVar.zza.zzj, zzeyvVar.zza.zzk, zzeyvVar.zza.zzl, zzeyvVar.zza.zzm, zzeyvVar.zza.zzn, zzeyvVar.zza.zzo, zzeyvVar.zza.zzp, zzeyvVar.zza.zzq, zzeyvVar.zza.zzr, zzeyvVar.zza.zzs, zzeyvVar.zza.zzt, zzeyvVar.zza.zzu, zzeyvVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzeyvVar.zza.zzw), zzeyvVar.zza.zzx);
        this.zza = zzeyvVar.zzd != null ? zzeyvVar.zzd : zzeyvVar.zzh != null ? zzeyvVar.zzh.zzf : null;
        this.zzg = zzeyvVar.zzf;
        this.zzh = zzeyvVar.zzg;
        this.zzi = zzeyvVar.zzf == null ? null : zzeyvVar.zzh == null ? new zzbdl(new NativeAdOptions.Builder().build()) : zzeyvVar.zzh;
        this.zzj = zzeyvVar.zzi;
        this.zzk = zzeyvVar.zzm;
        this.zzl = zzeyvVar.zzj;
        this.zzm = zzeyvVar.zzk;
        this.zzn = zzeyvVar.zzl;
        this.zzb = zzeyvVar.zzn;
        this.zzo = new zzeyk(zzeyvVar.zzo, null);
        this.zzp = zzeyvVar.zzp;
        this.zzc = zzeyvVar.zzq;
        this.zzq = zzeyvVar.zzr;
    }

    public final zzbfo zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcI));
    }
}
