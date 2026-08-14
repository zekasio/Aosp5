package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpy extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcpy(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcpy zza(Context context, View view, zzeyc zzeycVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcpy zzcpyVar = new zzcpy(context);
        if (!zzeycVar.zzv.isEmpty() && (resources = zzcpyVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzeyd zzeydVar = (zzeyd) zzeycVar.zzv.get(0);
            zzcpyVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzeydVar.zza * displayMetrics.density), (int) (zzeydVar.zzb * displayMetrics.density)));
        }
        zzcpyVar.zzb = view;
        zzcpyVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zzb(zzcpyVar, zzcpyVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zza(zzcpyVar, zzcpyVar);
        JSONObject jSONObject = zzeycVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcpyVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcpyVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcpyVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcpyVar.addView(relativeLayout);
        return zzcpyVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbyt.zzy(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(TJAdUnitConstants.String.HEIGHT, 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
