package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhe extends zzbea implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdie {
    public static final zzfqk zza = zzfqk.zzr("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfuu zzf;
    private View zzg;
    private zzdgd zzi;
    private zzatg zzj;
    private zzbdu zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdhe(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zzb(frameLayout, this);
        this.zzf = zzbzn.zze;
        this.zzj = new zzatg(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzbza.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdhk(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar == null || !zzdgdVar.zzT()) {
            return;
        }
        this.zzi.zzs();
        this.zzi.zzC(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgdVar.zzA(frameLayout, zzl(), zzm(), zzdgd.zzW(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgdVar.zzA(frameLayout, zzl(), zzm(), zzdgd.zzW(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar == null) {
            return false;
        }
        zzdgdVar.zzJ(view, motionEvent, this.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
            this.zzo.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzbs(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzbt(IObjectWrapper iObjectWrapper) {
        this.zzi.zzL((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzbu(zzbdu zzbduVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbduVar;
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar != null) {
            zzdgdVar.zzc().zzb(zzbduVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzbv(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzbw(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdgd)) {
            zzbza.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar != null) {
            zzdgdVar.zzR(this);
        }
        zzu();
        zzdgd zzdgdVar2 = (zzdgd) objUnwrap;
        this.zzi = zzdgdVar2;
        zzdgdVar2.zzQ(this);
        this.zzi.zzI(this.zzd);
        this.zzi.zzr(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdx)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar != null) {
            zzdgdVar.zzR(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized View zzg(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final zzatg zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized JSONObject zzo() {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar == null) {
            return null;
        }
        return zzdgdVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized JSONObject zzp() {
        zzdgd zzdgdVar = this.zzi;
        if (zzdgdVar == null) {
            return null;
        }
        return zzdgdVar.zzk(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized void zzq(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
