package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyp, zzoc, zzuu, zzrs, zzgy, zzgu, zzku, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjc zza;

    /* synthetic */ zziy(zzjc zzjcVar, zzix zzixVar) {
        this.zza = zzjcVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjc.zzW(this.zza, surfaceTexture);
        this.zza.zzao(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzar(null);
        this.zza.zzao(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzao(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzao(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzao(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(boolean z) {
        this.zza.zzav();
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzb(Exception exc) {
        this.zza.zzr.zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzc(String str, long j, long j2) {
        this.zza.zzr.zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzd(String str) {
        this.zza.zzr.zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zze(zzhb zzhbVar) {
        this.zza.zzr.zzB(zzhbVar);
        this.zza.zzM = null;
        this.zza.zzT = null;
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzf(zzhb zzhbVar) {
        this.zza.zzT = zzhbVar;
        this.zza.zzr.zzC(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzg(zzaf zzafVar, zzhc zzhcVar) {
        this.zza.zzM = zzafVar;
        this.zza.zzr.zzD(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzh(long j) {
        this.zza.zzr.zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzi(Exception exc) {
        this.zza.zzr.zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzj(int i, long j, long j2) {
        this.zza.zzr.zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzk(int i, long j) {
        this.zza.zzr.zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzl(Object obj, long j) {
        this.zza.zzr.zzI(obj, j);
        zzjc zzjcVar = this.zza;
        if (zzjcVar.zzO == obj) {
            zzeb zzebVar = zzjcVar.zzl;
            zzebVar.zzd(26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzdy
                public final void zza(Object obj2) {
                }
            });
            zzebVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzm(final boolean z) {
        zzjc zzjcVar = this.zza;
        if (zzjcVar.zzX == z) {
            return;
        }
        zzjcVar.zzX = z;
        zzeb zzebVar = this.zza.zzl;
        zzebVar.zzd(23, new zzdy() { // from class: com.google.android.gms.internal.ads.zziv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                boolean z2 = z;
                int i = zziy.zzb;
                ((zzcd) obj).zzq(z2);
            }
        });
        zzebVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzn(Exception exc) {
        this.zza.zzr.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzo(String str, long j, long j2) {
        this.zza.zzr.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzp(String str) {
        this.zza.zzr.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzq(zzhb zzhbVar) {
        this.zza.zzr.zzM(zzhbVar);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzr(zzhb zzhbVar) {
        this.zza.zzS = zzhbVar;
        this.zza.zzr.zzN(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzs(long j, int i) {
        this.zza.zzr.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzt(zzaf zzafVar, zzhc zzhcVar) {
        this.zza.zzL = zzafVar;
        this.zza.zzr.zzP(zzafVar, zzhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzu(final zzda zzdaVar) {
        this.zza.zzac = zzdaVar;
        zzeb zzebVar = this.zza.zzl;
        zzebVar.zzd(25, new zzdy() { // from class: com.google.android.gms.internal.ads.zziw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzda zzdaVar2 = zzdaVar;
                int i = zziy.zzb;
                ((zzcd) obj).zzu(zzdaVar2);
            }
        });
        zzebVar.zzc();
    }
}
