package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdqf implements AppEventListener, zzcxj, com.google.android.gms.ads.internal.client.zza, zzcuo, zzcvi, zzcvj, zzcwc, zzcur, zzfdb {
    private final List zza;
    private final zzdpt zzb;
    private long zzc;

    public zzdqf(zzdpt zzdptVar, zzcgd zzcgdVar) {
        this.zzb = zzdptVar;
        this.zza = Collections.singletonList(zzcgdVar);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zze(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zze(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zze(zzcur.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zze(zzcxj.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbB(zzfcu zzfcuVar, String str) {
        zze(zzfct.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbC(zzfcu zzfcuVar, String str, Throwable th) {
        zze(zzfct.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbn(Context context) {
        zze(zzcvj.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbp(Context context) {
        zze(zzcvj.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbq(Context context) {
        zze(zzcvj.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
        zze(zzcuo.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzc(zzfcu zzfcuVar, String str) {
        zze(zzfct.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzd(zzfcu zzfcuVar, String str) {
        zze(zzfct.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        zze(zzcuo.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        zze(zzcvi.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
        zze(zzcuo.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zze(zzcwc.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        zze(zzcuo.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    @ParametersAreNonnullByDefault
    public final void zzp(zzbud zzbudVar, String str, String str2) {
        zze(zzcuo.class, "onRewarded", zzbudVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
        zze(zzcuo.class, "onRewardedVideoCompleted", new Object[0]);
    }
}
