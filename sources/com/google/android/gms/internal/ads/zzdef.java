package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdef implements zzcwc, com.google.android.gms.ads.internal.overlay.zzo, zzcvi {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcei zzc;
    private final zzeyc zzd;
    private final zzbzg zze;
    private final zzawo zzf;

    public zzdef(Context context, zzcei zzceiVar, zzeyc zzeycVar, zzbzg zzbzgVar, zzawo zzawoVar) {
        this.zzb = context;
        this.zzc = zzceiVar;
        this.zzd = zzeycVar;
        this.zze = zzbzgVar;
        this.zzf = zzawoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeH)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeH)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        zzeas zzeasVar;
        zzear zzearVar;
        zzawo zzawoVar;
        if ((this.zzf == zzawo.REWARD_BASED_VIDEO_AD || (zzawoVar = this.zzf) == zzawo.INTERSTITIAL || zzawoVar == zzawo.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb)) {
            zzbzg zzbzgVar = this.zze;
            String str = zzbzgVar.zzb + "." + zzbzgVar.zzc;
            String strZza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzearVar = zzear.VIDEO;
                zzeasVar = zzeas.DEFINED_BY_JAVASCRIPT;
            } else {
                zzeasVar = this.zzd.zzZ == 2 ? zzeas.UNSPECIFIED : zzeas.BEGIN_TO_RENDER;
                zzearVar = zzear.HTML_DISPLAY;
            }
            IObjectWrapper iObjectWrapperZza = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzeasVar, zzearVar, this.zzd.zzam);
            this.zza = iObjectWrapperZza;
            if (iObjectWrapperZza != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
