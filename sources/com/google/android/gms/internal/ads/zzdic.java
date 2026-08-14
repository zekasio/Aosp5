package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdic {
    private final zzdmq zza;
    private final zzdlf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdic(zzdmq zzdmqVar, zzdlf zzdlfVar) {
        this.zza = zzdmqVar;
        this.zzb = zzdlfVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbyt.zzy(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcet {
        zzcei zzceiVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zzceiVarZza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zzceiVarZza.zzad("/sendMessageToSdk", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhy
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcei) obj, map);
            }
        });
        zzceiVarZza.zzad("/hideValidatorOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcei) obj, map);
            }
        });
        zzceiVarZza.zzad("/open", new zzbhz(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zzceiVarZza), "/loadNativeAdPolicyViolations", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zze(view, windowManager, (zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzceiVarZza), "/showValidatorOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdib
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzbza.zze("Show native ad policy validator overlay.");
                ((zzcei) obj).zzF().setVisibility(0);
            }
        });
        return view2;
    }

    final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcei zzceiVar, Map map) {
        zzbza.zze("Hide native ad policy validator overlay.");
        zzceiVar.zzF().setVisibility(8);
        if (zzceiVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzceiVar.zzF());
        }
        zzceiVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcei zzceiVar, final Map map) {
        zzceiVar.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdhw
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                this.zza.zzd(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhu)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhv)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzceiVar.zzag(zzcfx.zzb(iZzf, iZzf2));
        try {
            zzceiVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhw)).booleanValue());
            zzceiVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhx)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzceiVar.zzF(), layoutParamsZzb);
        final String str = (String) map.get(TJAdUnitConstants.String.ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = ((TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(str) || TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE.equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdhx
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcei zzceiVar2 = zzceiVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                    int i2 = i;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzceiVar2.zzF().getWindowToken() == null) {
                        return;
                    }
                    if (TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(str2) || TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE.equals(str2)) {
                        layoutParams.y = rect2.bottom - i2;
                    } else {
                        layoutParams.y = rect2.top - i2;
                    }
                    windowManager2.updateViewLayout(zzceiVar2.zzF(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzceiVar.loadUrl(str2);
    }
}
