package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqj extends NativeAd.Image {
    private final zzbdx zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    public zzbqj(zzbdx zzbdxVar) {
        double dZzb;
        IObjectWrapper iObjectWrapperZzf;
        this.zza = zzbdxVar;
        Uri uriZze = null;
        try {
            iObjectWrapperZzf = zzbdxVar.zzf();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
        Drawable drawable = iObjectWrapperZzf != null ? (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzf) : null;
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (RemoteException e2) {
            zzbza.zzh("", e2);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (RemoteException e3) {
            zzbza.zzh("", e3);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        try {
            this.zza.zzd();
        } catch (RemoteException e4) {
            zzbza.zzh("", e4);
        }
        try {
            this.zza.zzc();
        } catch (RemoteException e5) {
            zzbza.zzh("", e5);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }
}
