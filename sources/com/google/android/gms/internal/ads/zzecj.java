package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecj implements zzeat {
    private final Context zza;
    private final zzddw zzb;
    private final Executor zzc;
    private final zzeyb zzd;

    public zzecj(Context context, Executor executor, zzddw zzddwVar, zzeyb zzeybVar) {
        this.zza = context;
        this.zzb = zzddwVar;
        this.zzc = executor;
        this.zzd = zzeybVar;
    }

    private static String zzd(zzeyc zzeycVar) {
        try {
            return zzeycVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        String strZzd = zzd(zzeycVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(uri, zzeyoVar, zzeycVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbbs.zzg(context) && !TextUtils.isEmpty(zzd(zzeycVar));
    }

    final /* synthetic */ zzfut zzc(Uri uri, zzeyo zzeyoVar, zzeyc zzeycVar, Object obj) throws Exception {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final zzbzs zzbzsVar = new zzbzs();
            zzdcw zzdcwVarZze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, null), new zzdcz(new zzdee() { // from class: com.google.android.gms.internal.ads.zzeci
                @Override // com.google.android.gms.internal.ads.zzdee
                public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
                    zzbzs zzbzsVar2 = zzbzsVar;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzbzsVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzbzsVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zzdcwVarZze.zza(), null, new zzbzg(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfuj.zzh(zzdcwVarZze.zzg());
        } catch (Throwable th) {
            zzbza.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
