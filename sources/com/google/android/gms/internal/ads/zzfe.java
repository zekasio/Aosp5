package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfe extends zzfa {
    private zzfl zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfe() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(zzew.zzH(this.zzb), this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        zzi(zzflVar);
        this.zza = zzflVar;
        Uri uri = zzflVar.zza;
        String scheme = uri.getScheme();
        zzdl.zze(TJAdUnitConstants.String.DATA.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrZzah = zzew.zzah(uri.getSchemeSpecificPart(), ",");
        if (strArrZzah.length != 2) {
            throw zzbu.zzb("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uri))), null);
        }
        String str = strArrZzah[1];
        if (strArrZzah[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzbu.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.zzb = zzew.zzab(URLDecoder.decode(str, zzfnh.zza.name()));
        }
        long j = zzflVar.zzf;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzfh(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzflVar.zzg;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzj(zzflVar);
        long j3 = zzflVar.zzg;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        zzfl zzflVar = this.zza;
        if (zzflVar != null) {
            return zzflVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
