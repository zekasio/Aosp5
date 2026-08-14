package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhb implements zzfgg {
    private static final zzfhb zza = new zzfhb();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfgx();
    private static final Runnable zze = new zzfgy();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfgu zzk = new zzfgu();
    private final zzfgi zzj = new zzfgi();
    private final zzfgv zzl = new zzfgv(new zzfhe());

    zzfhb() {
    }

    public static zzfhb zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfhb zzfhbVar) {
        zzfhbVar.zzg = 0;
        zzfhbVar.zzi.clear();
        zzfhbVar.zzh = false;
        for (zzffo zzffoVar : zzffz.zza().zzb()) {
        }
        zzfhbVar.zzm = System.nanoTime();
        zzfhbVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfgh zzfghVarZza = zzfhbVar.zzj.zza();
        if (zzfhbVar.zzk.zze().size() > 0) {
            for (String str : zzfhbVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzfgp.zza(0, 0, 0, 0);
                View viewZza = zzfhbVar.zzk.zza(str);
                zzfgh zzfghVarZzb = zzfhbVar.zzj.zzb();
                String strZzc = zzfhbVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfghVarZzb.zza(viewZza);
                    zzfgp.zzb(jSONObjectZza2, str);
                    zzfgp.zzf(jSONObjectZza2, strZzc);
                    zzfgp.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfgp.zzi(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfhbVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfhbVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfgp.zza(0, 0, 0, 0);
            zzfhbVar.zzk(null, zzfghVarZza, jSONObjectZza3, 1, false);
            zzfgp.zzi(jSONObjectZza3);
            zzfhbVar.zzl.zzd(jSONObjectZza3, zzfhbVar.zzk.zzf(), jNanoTime);
            boolean z = zzfhbVar.zzh;
        } else {
            zzfhbVar.zzl.zzb();
        }
        zzfhbVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfhbVar.zzm;
        if (zzfhbVar.zzf.size() > 0) {
            for (zzfha zzfhaVar : zzfhbVar.zzf) {
                int i = zzfhbVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfhaVar.zzb();
                if (zzfhaVar instanceof zzfgz) {
                    int i2 = zzfhbVar.zzg;
                    ((zzfgz) zzfhaVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfgh zzfghVar, JSONObject jSONObject, int i, boolean z) {
        zzfghVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zza(View view, zzfgh zzfghVar, JSONObject jSONObject, boolean z) {
        int iZzk;
        boolean z2;
        if (zzfgs.zzb(view) != null || (iZzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfghVar.zza(view);
        zzfgp.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfgp.zzb(jSONObjectZza, strZzd);
            zzfgp.zze(jSONObjectZza, Boolean.valueOf(this.zzk.zzj(view)));
            this.zzk.zzh();
        } else {
            zzfgt zzfgtVarZzb = this.zzk.zzb(view);
            if (zzfgtVarZzb != null) {
                zzfgp.zzd(jSONObjectZza, zzfgtVarZzb);
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfghVar, jSONObjectZza, iZzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfgw(this));
    }
}
