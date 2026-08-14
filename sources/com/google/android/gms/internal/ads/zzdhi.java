package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhi {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzeyx zzc;
    private final zzdgn zzd;
    private final zzdgi zze;
    private final zzdhu zzf;
    private final zzdic zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbdl zzj;
    private final zzdgf zzk;

    public zzdhi(com.google.android.gms.ads.internal.util.zzg zzgVar, zzeyx zzeyxVar, zzdgn zzdgnVar, zzdgi zzdgiVar, zzdhu zzdhuVar, zzdic zzdicVar, Executor executor, Executor executor2, zzdgf zzdgfVar) {
        this.zzb = zzgVar;
        this.zzc = zzeyxVar;
        this.zzj = zzeyxVar.zzi;
        this.zzd = zzdgnVar;
        this.zze = zzdgiVar;
        this.zzf = zzdhuVar;
        this.zzg = zzdicVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgfVar;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzds)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdgi zzdgiVar = this.zze;
        if (zzdgiVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdgiVar.zzc() == 2 || zzdgiVar.zzc() == 1) {
                this.zzb.zzI(this.zzc.zzf, String.valueOf(zzdgiVar.zzc()), z);
            } else if (zzdgiVar.zzc() == 6) {
                this.zzb.zzI(this.zzc.zzf, TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE, z);
                this.zzb.zzI(this.zzc.zzf, TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdie r10) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhi.zzb(com.google.android.gms.internal.ads.zzdie):void");
    }

    public final void zzc(zzdie zzdieVar) {
        if (zzdieVar == null || this.zzf == null || zzdieVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdieVar.zzh().addView(this.zzf.zza());
        } catch (zzcet e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdie zzdieVar) {
        if (zzdieVar == null) {
            return;
        }
        Context context = zzdieVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzbza.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdieVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdieVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcet e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdie zzdieVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdieVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
