package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmv implements zzcuo, zzcwc, zzcvi, com.google.android.gms.ads.internal.client.zza, zzcve {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzeyo zze;
    private final zzeyc zzf;
    private final zzffb zzg;
    private final zzezg zzh;
    private final zzapw zzi;
    private final zzbbt zzj;
    private final zzfen zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzctr zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbbv zzq;

    zzcmv(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzeyo zzeyoVar, zzeyc zzeycVar, zzffb zzffbVar, zzezg zzezgVar, View view, zzcei zzceiVar, zzapw zzapwVar, zzbbt zzbbtVar, zzbbv zzbbvVar, zzfen zzfenVar, zzctr zzctrVar, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzeyoVar;
        this.zzf = zzeycVar;
        this.zzg = zzffbVar;
        this.zzh = zzezgVar;
        this.zzi = zzapwVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzceiVar);
        this.zzj = zzbbtVar;
        this.zzq = zzbbvVar;
        this.zzk = zzfenVar;
        this.zzn = zzctrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        int i;
        String strZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzda)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbcj.zzh.zze()).booleanValue()) {
            zzezg zzezgVar = this.zzh;
            zzffb zzffbVar = this.zzg;
            zzeyo zzeyoVar = this.zze;
            zzeyc zzeycVar = this.zzf;
            zzezgVar.zza(zzffbVar.zzd(zzeyoVar, zzeycVar, false, strZzh, null, zzeycVar.zzd));
            return;
        }
        if (((Boolean) zzbcj.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzfuj.zzq((zzfua) zzfuj.zzn(zzfua.zzv(zzfuj.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmu(this, strZzh), this.zzb);
    }

    private final void zzt(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbcj.zzd.zze()).booleanValue()) {
            zzfuj.zzq(zzfuj.zze(zzfua.zzv(this.zzj.zza()), Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzcmp
                @Override // com.google.android.gms.internal.ads.zzfnj
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzbzn.zzf), new zzcmt(this), this.zzb);
            return;
        }
        zzezg zzezgVar = this.zzh;
        zzffb zzffbVar = this.zzg;
        zzeyo zzeyoVar = this.zze;
        zzeyc zzeycVar = this.zzf;
        zzezgVar.zzc(zzffbVar.zzc(zzeyoVar, zzeycVar, zzeycVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
        zzezg zzezgVar = this.zzh;
        zzffb zzffbVar = this.zzg;
        zzeyo zzeyoVar = this.zze;
        zzeyc zzeycVar = this.zzf;
        zzezgVar.zza(zzffbVar.zzc(zzeyoVar, zzeycVar, zzeycVar.zzh));
    }

    final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    final /* synthetic */ void zzh(int i, int i2) {
        zzt(i - 1, i2);
    }

    final /* synthetic */ void zzi(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzffb.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdh)).intValue();
            if (iIntValue > 0) {
                zzt(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdi)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdg)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzn() {
        zzctr zzctrVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzezg zzezgVar = this.zzh;
            zzffb zzffbVar = this.zzg;
            zzeyo zzeyoVar = this.zze;
            zzeyc zzeycVar = this.zzf;
            zzezgVar.zza(zzffbVar.zzc(zzeyoVar, zzeycVar, zzeycVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzde)).booleanValue() && (zzctrVar = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzffb.zzg(zzctrVar.zzb().zzn, zzctrVar.zza().zzf())));
            }
            zzezg zzezgVar2 = this.zzh;
            zzffb zzffbVar2 = this.zzg;
            zzeyo zzeyoVar2 = this.zze;
            zzeyc zzeycVar2 = this.zzf;
            zzezgVar2.zza(zzffbVar2.zzc(zzeyoVar2, zzeycVar2, zzeycVar2.zzg));
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(zzbud zzbudVar, String str, String str2) {
        zzezg zzezgVar = this.zzh;
        zzffb zzffbVar = this.zzg;
        zzeyc zzeycVar = this.zzf;
        zzezgVar.zza(zzffbVar.zze(zzeycVar, zzeycVar.zzi, zzbudVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
        zzezg zzezgVar = this.zzh;
        zzffb zzffbVar = this.zzg;
        zzeyo zzeyoVar = this.zze;
        zzeyc zzeycVar = this.zzf;
        zzezgVar.zza(zzffbVar.zzc(zzeyoVar, zzeycVar, zzeycVar.zzj));
    }
}
