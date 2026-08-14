package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzdih implements zzdgq {
    private final zzbnu zza;
    private final zzcvg zzb;
    private final zzcum zzc;
    private final zzdca zzd;
    private final Context zze;
    private final zzeyc zzf;
    private final zzbzg zzg;
    private final zzeyx zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbnq zzl;
    private final zzbnr zzm;

    public zzdih(zzbnq zzbnqVar, zzbnr zzbnrVar, zzbnu zzbnuVar, zzcvg zzcvgVar, zzcum zzcumVar, zzdca zzdcaVar, Context context, zzeyc zzeycVar, zzbzg zzbzgVar, zzeyx zzeyxVar, byte[] bArr) {
        this.zzl = zzbnqVar;
        this.zzm = zzbnrVar;
        this.zza = zzbnuVar;
        this.zzb = zzcvgVar;
        this.zzc = zzcumVar;
        this.zzd = zzdcaVar;
        this.zze = context;
        this.zzf = zzeycVar;
        this.zzg = zzbzgVar;
        this.zzh = zzeyxVar;
    }

    private final void zzb(View view) {
        try {
            zzbnu zzbnuVar = this.zza;
            if (zzbnuVar != null && !zzbnuVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzbnq zzbnqVar = this.zzl;
            if (zzbnqVar != null && !zzbnqVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzbnr zzbnrVar = this.zzm;
            if (zzbnrVar == null || zzbnrVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                this.zzd.zzr();
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzbza.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            zzbza.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zzb(view2);
        } else {
            zzbza.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbnu zzbnuVar = this.zza;
                if (zzbnuVar != null && !zzbnuVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbnq zzbnqVar = this.zzl;
                if (zzbnqVar != null && !zzbnqVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbnr zzbnrVar = this.zzm;
                if (zzbnrVar == null || zzbnrVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzbza.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzx(zzbfr zzbfrVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[Catch: JSONException -> 0x0044, RemoteException -> 0x0124, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:48:0x00b3, B:49:0x00c8, B:51:0x00ce), top: B:72:0x00b3 }] */
    @Override // com.google.android.gms.internal.ads.zzdgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzy(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdih.zzy(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbnu zzbnuVar = this.zza;
            if (zzbnuVar != null) {
                zzbnuVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzbnq zzbnqVar = this.zzl;
            if (zzbnqVar != null) {
                zzbnqVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbnr zzbnrVar = this.zzm;
            if (zzbnrVar != null) {
                zzbnrVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call untrackView", e);
        }
    }
}
