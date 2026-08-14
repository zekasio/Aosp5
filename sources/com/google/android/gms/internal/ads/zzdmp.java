package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmp {
    private final zzcum zza;
    private final zzdca zzb;
    private final zzcvv zzc;
    private final zzcwi zzd;
    private final zzcwu zze;
    private final zzczi zzf;
    private final Executor zzg;
    private final zzdbw zzh;
    private final zzcng zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbwb zzk;
    private final zzapw zzl;
    private final zzcyz zzm;
    private final zzeaf zzn;
    private final zzfff zzo;
    private final zzdpi zzp;
    private final zzfdk zzq;

    public zzdmp(zzcum zzcumVar, zzcvv zzcvvVar, zzcwi zzcwiVar, zzcwu zzcwuVar, zzczi zzcziVar, Executor executor, zzdbw zzdbwVar, zzcng zzcngVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwb zzbwbVar, zzapw zzapwVar, zzcyz zzcyzVar, zzeaf zzeafVar, zzfff zzfffVar, zzdpi zzdpiVar, zzfdk zzfdkVar, zzdca zzdcaVar) {
        this.zza = zzcumVar;
        this.zzc = zzcvvVar;
        this.zzd = zzcwiVar;
        this.zze = zzcwuVar;
        this.zzf = zzcziVar;
        this.zzg = executor;
        this.zzh = zzdbwVar;
        this.zzi = zzcngVar;
        this.zzj = zzbVar;
        this.zzk = zzbwbVar;
        this.zzl = zzapwVar;
        this.zzm = zzcyzVar;
        this.zzn = zzeafVar;
        this.zzo = zzfffVar;
        this.zzp = zzdpiVar;
        this.zzq = zzfdkVar;
        this.zzb = zzdcaVar;
    }

    public static final zzfut zzj(zzcei zzceiVar, String str, String str2) {
        final zzbzs zzbzsVar = new zzbzs();
        zzceiVar.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdmn
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzbzs zzbzsVar2 = zzbzsVar;
                if (z) {
                    zzbzsVar2.zzd(null);
                } else {
                    zzbzsVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzceiVar.zzab(str, str2, null);
        return zzbzsVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(zzcei zzceiVar, zzcei zzceiVar2, Map map) {
        this.zzi.zzh(zzceiVar);
    }

    final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcei zzceiVar, boolean z, zzbhr zzbhrVar) {
        zzaps zzapsVarZzc;
        zzceiVar.zzN().zzM(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new zzbgk() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzbgk
            public final void zzbz(String str, String str2) {
                this.zza.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                this.zza.zze();
            }
        }, z, zzbhrVar, this.zzj, new zzdmo(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null);
        zzceiVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzceiVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcj)).booleanValue() && (zzapsVarZzc = this.zzl.zzc()) != null) {
            zzapsVarZzc.zzo((View) zzceiVar);
        }
        this.zzh.zzm(zzceiVar, this.zzg);
        this.zzh.zzm(new zzatf() { // from class: com.google.android.gms.internal.ads.zzdml
            @Override // com.google.android.gms.internal.ads.zzatf
            public final void zzc(zzate zzateVar) {
                zzceiVar.zzN().zzp(zzateVar.zzd.left, zzateVar.zzd.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzceiVar);
        zzceiVar.zzad("/trackActiveViewUnit", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdmm
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzg(zzceiVar, (zzcei) obj, map);
            }
        });
        this.zzi.zzi(zzceiVar);
    }
}
