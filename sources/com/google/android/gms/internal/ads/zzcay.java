package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcay {
    private final Context zza;
    private final zzcbj zzb;
    private final ViewGroup zzc;
    private zzcax zzd;

    public zzcay(Context context, ViewGroup viewGroup, zzcei zzceiVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzceiVar;
        this.zzd = null;
    }

    public final zzcax zza() {
        return this.zzd;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcax zzcaxVar = this.zzd;
        if (zzcaxVar != null) {
            zzcaxVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcbi zzcbiVar, Integer num) {
        if (this.zzd != null) {
            return;
        }
        zzbbb.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcbj zzcbjVar = this.zzb;
        zzcax zzcaxVar = new zzcax(context, zzcbjVar, i5, z, zzcbjVar.zzm().zza(), zzcbiVar, num);
        this.zzd = zzcaxVar;
        this.zzc.addView(zzcaxVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcax zzcaxVar = this.zzd;
        if (zzcaxVar != null) {
            zzcaxVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcax zzcaxVar = this.zzd;
        if (zzcaxVar != null) {
            zzcaxVar.zzu();
        }
    }

    public final void zzf(int i) {
        zzcax zzcaxVar = this.zzd;
        if (zzcaxVar != null) {
            zzcaxVar.zzC(i);
        }
    }
}
