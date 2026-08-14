package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcex extends FrameLayout implements zzcei {
    private final zzcei zza;
    private final zzcay zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcex(zzcei zzceiVar) {
        super(zzceiVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzceiVar;
        this.zzb = new zzcay(zzceiVar.zzE(), this, this);
        addView((View) zzceiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void destroy() {
        final IObjectWrapper iObjectWrapperZzQ = zzQ();
        if (iObjectWrapperZzQ == null) {
            this.zza.destroy();
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcev
            @Override // java.lang.Runnable
            public final void run() {
                IObjectWrapper iObjectWrapper = iObjectWrapperZzQ;
                com.google.android.gms.ads.internal.zzt.zzA();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof zzffk) {
                        ((zzffk) objUnwrap).zzc();
                    }
                }
            }
        });
        zzfkr zzfkrVar = com.google.android.gms.ads.internal.util.zzs.zza;
        final zzcei zzceiVar = this.zza;
        zzceiVar.getClass();
        zzfkrVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcew
            @Override // java.lang.Runnable
            public final void run() {
                zzceiVar.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeD)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcei
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcei
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzB(int i) {
        this.zzb.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final void zzC(zzcfe zzcfeVar) {
        this.zza.zzC(zzcfeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcdz
    public final zzeyc zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfq
    public final zzapw zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzaus zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzbdk zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzcfv zzN() {
        return ((zzcfb) this.zza).zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfp
    public final zzcfx zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcff
    public final zzeyf zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final IObjectWrapper zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzfut zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzT(zzeyc zzeycVar, zzeyf zzeyfVar) {
        this.zza.zzT(zzeycVar, zzeyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzU() {
        this.zzb.zzd();
        this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzV() {
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzW(int i) {
        this.zza.zzW(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzY() {
        zzcei zzceiVar = this.zza;
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcfb zzcfbVar = (zzcfb) zzceiVar;
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(zzcfbVar.getContext())));
        zzcfbVar.zzd(TapjoyConstants.TJC_VOLUME, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzZ(boolean z) {
        this.zza.zzZ(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zza(String str) {
        ((zzcfb) this.zza).zzaO(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaD(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar, String str, String str2, int i) {
        this.zza.zzaE(zzbrVar, zzeafVar, zzdpiVar, zzfdkVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zza.zzaF(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zza.zzaG(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaH(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzad(String str, zzbhp zzbhpVar) {
        this.zza.zzad(str, zzbhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzu());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzaf(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzag(zzcfx zzcfxVar) {
        this.zza.zzag(zzcfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzah(zzaus zzausVar) {
        this.zza.zzah(zzausVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzai(boolean z) {
        this.zza.zzai(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzam(zzbdi zzbdiVar) {
        this.zza.zzam(zzbdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzao(zzbdk zzbdkVar) {
        this.zza.zzao(zzbdkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zza.zzap(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaq(int i) {
        this.zza.zzaq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzar(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzat(boolean z) {
        this.zza.zzat(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzau(String str, zzbhp zzbhpVar) {
        this.zza.zzau(str, zzbhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzay(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaF)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.zza.zzbj();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final String zzbl() {
        return this.zza.zzbl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        this.zza.zzc(zzateVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcbj
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzbbg zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfb) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final zzbbh zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcbj
    public final zzbzg zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzcay zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzccu zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final zzcfe zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final void zzt(String str, zzccu zzccuVar) {
        this.zza.zzt(str, zzccuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
