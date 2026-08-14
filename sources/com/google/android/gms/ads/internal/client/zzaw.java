package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbza;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbfw zzd;
    private final zzbvi zze;
    private final zzbqz zzf;
    private final zzbfx zzg;
    private zzbsh zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbfw zzbfwVar, zzbvi zzbviVar, zzbqz zzbqzVar, zzbfx zzbfxVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbfwVar;
        this.zze = zzbviVar;
        this.zzf = zzbqzVar;
        this.zzg = zzbfxVar;
    }

    static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzo(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbnf zzbnfVar) {
        return (zzbq) new zzao(this, context, str, zzbnfVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbnf zzbnfVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbnfVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbnf zzbnfVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbnfVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbnf zzbnfVar) {
        return (zzdj) new zzac(this, context, zzbnfVar).zzd(context, false);
    }

    public final zzbeb zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbeb) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbeh zzi(View view, HashMap map, HashMap map2) {
        return (zzbeh) new zzau(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbip zzl(Context context, zzbnf zzbnfVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbip) new zzai(this, context, zzbnfVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbqv zzm(Context context, zzbnf zzbnfVar) {
        return (zzbqv) new zzag(this, context, zzbnfVar).zzd(context, false);
    }

    public final zzbrc zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzbza.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbrc) zzaaVar.zzd(activity, booleanExtra);
    }

    public final zzbuw zzq(Context context, String str, zzbnf zzbnfVar) {
        return (zzbuw) new zzav(this, context, str, zzbnfVar).zzd(context, false);
    }

    public final zzbxr zzr(Context context, zzbnf zzbnfVar) {
        return (zzbxr) new zzae(this, context, zzbnfVar).zzd(context, false);
    }
}
