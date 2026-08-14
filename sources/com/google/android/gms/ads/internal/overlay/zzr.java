package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import cz.msebera.android.httpclient.client.config.CookieSpecs;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        this.zzb = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int iZzy = zzbyt.zzy(context, zzqVar.zza);
        zzay.zzb();
        int iZzy2 = zzbyt.zzy(context, 0);
        zzay.zzb();
        int iZzy3 = zzbyt.zzy(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(iZzy, iZzy2, iZzy3, zzbyt.zzy(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int iZzy4 = zzbyt.zzy(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iZzy4, zzbyt.zzy(context, zzqVar.zzd + zzqVar.zzc), 17));
        long jLongValue = ((Long) zzba.zzc().zzb(zzbar.zzaW)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzp zzpVar = ((Boolean) zzba.zzc().zzb(zzbar.zzaX)).booleanValue() ? new zzp(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzpVar);
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zzb(zzbar.zzaV);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || CookieSpecs.DEFAULT.equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (resourcesZzd == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZzd.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZzd.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            zzbza.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
        } else {
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.zzb;
        if (zzadVar != null) {
            zzadVar.zzi();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((Long) zzba.zzc().zzb(zzbar.zzaW)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
