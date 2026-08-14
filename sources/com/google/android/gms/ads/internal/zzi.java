package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjl;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzi implements Runnable, zzaps {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfhp zzi;
    private Context zzj;
    private final Context zzk;
    private zzbzg zzl;
    private final zzbzg zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzbzg zzbzgVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzbzgVar;
        this.zzm = zzbzgVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().zzb(zzbar.zzbX)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = zzfhp.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbar.zzbT)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbar.zzbY)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzbW)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzcX)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zzb(zzbar.zzcQ)).booleanValue()) {
            zzbzn.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (zzbyt.zzv()) {
            zzbzn.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzaps zzj() {
        return zzi() == 2 ? (zzaps) this.zze.get() : (zzaps) this.zzd.get();
    }

    private final void zzm() {
        zzaps zzapsVarZzj = zzj();
        if (this.zzc.isEmpty() || zzapsVarZzj == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzapsVarZzj.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzapsVarZzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzp(boolean z) {
        this.zzd.set(zzapv.zzu(this.zzl.zza, zzq(this.zzj), z, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzcX)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbar.zzaQ)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzp(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzapp zzappVarZza = zzapp.zza(this.zzl.zza, zzq(this.zzj), z2, this.zzn);
                    this.zze.set(zzappVarZza);
                    if (this.zzg && !zzappVarZza.zzr()) {
                        this.zzo = 1;
                        zzp(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzp(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzapp.zza(this.zzm.zza, zzq(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzfhp zzfhpVar = this.zzi;
        zzh zzhVar = new zzh(this);
        return new zzfjl(this.zzj, zzfir.zzb(context, zzfhpVar), zzhVar, ((Boolean) zzba.zzc().zzb(zzbar.zzbU)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            zzbza.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzaps zzapsVarZzj = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzja)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
        }
        if (zzapsVarZzj == null) {
            return "";
        }
        zzm();
        return zzapsVarZzj.zzf(zzq(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzg(Context context) {
        zzaps zzapsVarZzj;
        if (!zzd() || (zzapsVarZzj = zzj()) == null) {
            return "";
        }
        zzm();
        return zzapsVarZzj.zzg(zzq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zzb(zzbar.zziZ)).booleanValue()) {
            zzaps zzapsVarZzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbar.zzja)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return zzapsVarZzj != null ? zzapsVarZzj.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzaps zzapsVarZzj2 = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzja)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
        }
        return zzapsVarZzj2 != null ? zzapsVarZzj2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzk(MotionEvent motionEvent) {
        zzaps zzapsVarZzj = zzj();
        if (zzapsVarZzj == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzm();
            zzapsVarZzj.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzl(int i, int i2, int i3) {
        zzaps zzapsVarZzj = zzj();
        if (zzapsVarZzj == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzm();
            zzapsVarZzj.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaps zzapsVarZzj;
        if (!zzd() || (zzapsVarZzj = zzj()) == null) {
            return;
        }
        zzapsVarZzj.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzo(View view) {
        zzaps zzapsVarZzj = zzj();
        if (zzapsVarZzj != null) {
            zzapsVarZzj.zzo(view);
        }
    }
}
