package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsz extends com.google.android.gms.ads.internal.client.zzdi {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsn zzc;
    private final zzfuu zzd;
    private final zzdta zze;
    private zzdsf zzf;

    zzdsz(Context context, zzdsn zzdsnVar, zzdta zzdtaVar, zzfuu zzfuuVar) {
        this.zzb = context;
        this.zzc = zzdsnVar;
        this.zzd = zzfuuVar;
        this.zze = zzdtaVar;
    }

    private static AdRequest zzj() {
        return new AdRequest.Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzk(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else {
            if (!(obj instanceof AdView)) {
                if (obj instanceof NativeAd) {
                    responseInfo = ((NativeAd) obj).getResponseInfo();
                }
                return "";
            }
            responseInfo = ((AdView) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdnVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzdnVarZzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzl(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsx(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzc.zzk(str2);
        }
    }

    private final synchronized void zzm(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsy(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OutOfContextTester.setAdAsShown");
            this.zzc.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdta.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdta.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdsf zzdsfVar) {
        this.zzf = zzdsfVar;
    }

    protected final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzl(zzk(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzh(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsz.zzh(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void zzi(String str, String str2) {
        Activity activityZzg = this.zzc.zzg();
        if (activityZzg == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziC)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
            this.zza.remove(str);
        }
        zzm(zzk(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(activityZzg);
            return;
        }
        if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(activityZzg);
            return;
        }
        if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdso
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
            return;
        }
        if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdsp
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziC)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
            Intent intent = new Intent();
            intent.setClassName(this.zzb, OutOfContextTestingActivity.CLASS_NAME);
            intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzb, intent);
        }
    }
}
