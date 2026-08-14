package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public interface zzcei extends com.google.android.gms.ads.internal.client.zza, zzdcc, zzcdz, zzbki, zzcff, zzcfj, zzbkv, zzatf, zzcfn, com.google.android.gms.ads.internal.zzl, zzcfq, zzcfr, zzcbj, zzcfs {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcbj
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbj
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbj
    void zzC(zzcfe zzcfeVar);

    @Override // com.google.android.gms.internal.ads.zzcdz
    zzeyc zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcfs
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcfq
    zzapw zzI();

    zzaus zzJ();

    zzbdk zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcfv zzN();

    @Override // com.google.android.gms.internal.ads.zzcfp
    zzcfx zzO();

    @Override // com.google.android.gms.internal.ads.zzcff
    zzeyf zzP();

    IObjectWrapper zzQ();

    zzfut zzR();

    String zzS();

    void zzT(zzeyc zzeycVar, zzeyf zzeyfVar);

    void zzU();

    void zzV();

    void zzW(int i);

    void zzX();

    void zzY();

    void zzZ(boolean z);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbhp zzbhpVar);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzag(zzcfx zzcfxVar);

    void zzah(zzaus zzausVar);

    void zzai(boolean z);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z);

    void zzam(zzbdi zzbdiVar);

    void zzan(boolean z);

    void zzao(zzbdk zzbdkVar);

    void zzap(IObjectWrapper iObjectWrapper);

    void zzaq(int i);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzas(boolean z);

    void zzat(boolean z);

    void zzau(String str, zzbhp zzbhpVar);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z, int i);

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcbj
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbj
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcbj
    zzbbh zzm();

    @Override // com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcbj
    zzbzg zzn();

    @Override // com.google.android.gms.internal.ads.zzcbj
    zzcfe zzq();

    @Override // com.google.android.gms.internal.ads.zzcbj
    void zzt(String str, zzccu zzccuVar);
}
