package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapp implements zzaps {
    private static zzapp zzb;
    private final Context zzc;
    private final zzfje zzd;
    private final zzfjl zze;
    private final zzfjn zzf;
    private final zzaqr zzg;
    private final zzfhp zzh;
    private final Executor zzi;
    private final zzfjk zzj;
    private final zzarh zzl;
    private final zzaqy zzm;
    private final zzaqp zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzapp(Context context, zzfhp zzfhpVar, zzfje zzfjeVar, zzfjl zzfjlVar, zzfjn zzfjnVar, zzaqr zzaqrVar, Executor executor, zzfhk zzfhkVar, int i, zzarh zzarhVar, zzaqy zzaqyVar, zzaqp zzaqpVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfhpVar;
        this.zzd = zzfjeVar;
        this.zze = zzfjlVar;
        this.zzf = zzfjnVar;
        this.zzg = zzaqrVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzarhVar;
        this.zzm = zzaqyVar;
        this.zzn = zzaqpVar;
        this.zzq = false;
        this.zzj = new zzapn(this, zzfhkVar);
    }

    public static synchronized zzapp zza(String str, Context context, boolean z, boolean z2) {
        return zzb(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized zzapp zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (zzb == null) {
            zzfhq zzfhqVarZza = zzfhr.zza();
            zzfhqVarZza.zza(str);
            zzfhqVarZza.zzc(z);
            zzfhr zzfhrVarZzd = zzfhqVarZza.zzd();
            zzfhp zzfhpVarZza = zzfhp.zza(context, executor, z2);
            zzaqa zzaqaVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcT)).booleanValue() ? zzaqa.zzc(context) : null;
            zzarh zzarhVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcU)).booleanValue() ? zzarh.zzd(context, executor) : null;
            zzaqy zzaqyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue() ? new zzaqy() : null;
            zzaqp zzaqpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcn)).booleanValue() ? new zzaqp() : null;
            zzfii zzfiiVarZze = zzfii.zze(context, executor, zzfhpVarZza, zzfhrVarZzd);
            zzaqq zzaqqVar = new zzaqq(context);
            zzaqr zzaqrVar = new zzaqr(zzfhrVarZzd, zzfiiVarZze, new zzarf(context, zzaqqVar), zzaqqVar, zzaqaVarZzc, zzarhVarZzd, zzaqyVar, zzaqpVar);
            int iZzb = zzfir.zzb(context, zzfhpVarZza);
            zzfhk zzfhkVar = new zzfhk();
            zzapp zzappVar = new zzapp(context, zzfhpVarZza, new zzfje(context, iZzb), new zzfjl(context, iZzb, new zzapm(zzfhpVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbU)).booleanValue()), new zzfjn(context, zzaqrVar, zzfhpVarZza, zzfhkVar), zzaqrVar, executor, zzfhkVar, iZzb, zzarhVarZzd, zzaqyVar, zzaqpVar);
            zzb = zzappVar;
            zzappVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb A[Catch: all -> 0x0128, zzgqy -> 0x012a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {zzgqy -> 0x012a, blocks: (B:6:0x0021, B:8:0x0032, B:11:0x0037, B:12:0x0043, B:14:0x0051, B:16:0x005f, B:19:0x006c, B:26:0x009b, B:30:0x00b4, B:36:0x00cd, B:40:0x00df, B:42:0x00e5, B:44:0x00ed, B:45:0x00ef, B:33:0x00be, B:34:0x00c5, B:22:0x0073, B:24:0x0089, B:47:0x00fb, B:49:0x010a, B:51:0x0119), top: B:61:0x0021, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzapp r12) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapp.zzj(com.google.android.gms.internal.ads.zzapp):void");
    }

    private final void zzs() {
        zzarh zzarhVar = this.zzl;
        if (zzarhVar != null) {
            zzarhVar.zzh();
        }
    }

    private final zzfjd zzt(int i) {
        if (zzfir.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbS)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfhs zzfhsVarZza = this.zzf.zza();
        if (zzfhsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfhsVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfhs zzfhsVarZza = this.zzf.zza();
        if (zzfhsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfhsVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcl)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfhs zzfhsVarZza = this.zzf.zza();
        if (zzfhsVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfhsVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzk(MotionEvent motionEvent) {
        zzfhs zzfhsVarZza = this.zzf.zza();
        if (zzfhsVarZza != null) {
            try {
                zzfhsVarZza.zzd(null, motionEvent);
            } catch (zzfjm e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfjd zzfjdVarZzt = zzt(1);
        if (zzfjdVarZzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfjdVarZzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqp zzaqpVar = this.zzn;
        if (zzaqpVar != null) {
            zzaqpVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaps
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfjd zzfjdVarZzb = this.zzf.zzb();
                if ((zzfjdVarZzb == null || zzfjdVarZzb.zzd(3600L)) && zzfir.zza(this.zzr)) {
                    this.zzi.execute(new zzapo(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
