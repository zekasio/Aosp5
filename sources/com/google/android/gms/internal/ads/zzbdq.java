package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdq extends NativeAd.AdChoicesInfo {
    private final zzbdp zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbdq(zzbdp zzbdpVar) {
        IBinder iBinder;
        this.zza = zzbdpVar;
        try {
            this.zzc = zzbdpVar.zzg();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbdpVar.zzh()) {
                zzbdx zzbdvVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbdvVar = iInterfaceQueryLocalInterface instanceof zzbdx ? (zzbdx) iInterfaceQueryLocalInterface : new zzbdv(iBinder);
                }
                if (zzbdvVar != null) {
                    this.zzb.add(new zzbdy(zzbdvVar));
                }
            }
        } catch (RemoteException e2) {
            zzbza.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
