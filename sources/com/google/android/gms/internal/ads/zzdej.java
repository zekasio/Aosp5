package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdej implements zzcuo, zzdbl {
    private final zzbwn zza;
    private final Context zzb;
    private final zzbxf zzc;
    private final View zzd;
    private String zze;
    private final zzawo zzf;

    public zzdej(zzbwn zzbwnVar, Context context, zzbxf zzbxfVar, View view, zzawo zzawoVar) {
        this.zza = zzbwnVar;
        this.zzb = context;
        this.zzc = zzbxfVar;
        this.zzd = view;
        this.zzf = zzawoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzg() {
        if (this.zzf == zzawo.APP_OPEN) {
            return;
        }
        String strZzd = this.zzc.zzd(this.zzb);
        this.zze = strZzd;
        this.zze = String.valueOf(strZzd).concat(this.zzf == zzawo.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    @ParametersAreNonnullByDefault
    public final void zzp(zzbud zzbudVar, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbxf zzbxfVar = this.zzc;
                Context context = this.zzb;
                zzbxfVar.zzo(context, zzbxfVar.zza(context), this.zza.zza(), zzbudVar.zzc(), zzbudVar.zzb());
            } catch (RemoteException e) {
                zzbza.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
    }
}
