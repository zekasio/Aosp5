package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfuf;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzy implements zzfuf {
    final /* synthetic */ zzbrr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;

    zzy(zzac zzacVar, zzbrr zzbrrVar, boolean z) {
        this.zzc = zzacVar;
        this.zza = zzbrrVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                for (Uri uri : arrayList) {
                    if (this.zzc.zzP(uri)) {
                        this.zzc.zzs.zzc(zzac.zzX(uri, this.zzc.zzC, TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE).toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbar.zzgZ)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }
}
