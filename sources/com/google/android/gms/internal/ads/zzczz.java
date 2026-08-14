package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczz {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzevq zzo;

    public final zzczz zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdbu(zzaVar, executor));
        return this;
    }

    public final zzczz zzb(zzcur zzcurVar, Executor executor) {
        this.zzi.add(new zzdbu(zzcurVar, executor));
        return this;
    }

    public final zzczz zzc(zzcve zzcveVar, Executor executor) {
        this.zzl.add(new zzdbu(zzcveVar, executor));
        return this;
    }

    public final zzczz zzd(zzcvi zzcviVar, Executor executor) {
        this.zzf.add(new zzdbu(zzcviVar, executor));
        return this;
    }

    public final zzczz zze(zzcuo zzcuoVar, Executor executor) {
        this.zze.add(new zzdbu(zzcuoVar, executor));
        return this;
    }

    public final zzczz zzf(zzcwc zzcwcVar, Executor executor) {
        this.zzh.add(new zzdbu(zzcwcVar, executor));
        return this;
    }

    public final zzczz zzg(zzcwn zzcwnVar, Executor executor) {
        this.zzg.add(new zzdbu(zzcwnVar, executor));
        return this;
    }

    public final zzczz zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdbu(zzoVar, executor));
        return this;
    }

    public final zzczz zzi(zzcwz zzcwzVar, Executor executor) {
        this.zzm.add(new zzdbu(zzcwzVar, executor));
        return this;
    }

    public final zzczz zzj(zzcxj zzcxjVar, Executor executor) {
        this.zzb.add(new zzdbu(zzcxjVar, executor));
        return this;
    }

    public final zzczz zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdbu(appEventListener, executor));
        return this;
    }

    public final zzczz zzl(zzdcc zzdccVar, Executor executor) {
        this.zzd.add(new zzdbu(zzdccVar, executor));
        return this;
    }

    public final zzczz zzm(zzevq zzevqVar) {
        this.zzo = zzevqVar;
        return this;
    }

    public final zzdab zzn() {
        return new zzdab(this, null);
    }
}
