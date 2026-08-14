package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfkr;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbk {
    private final Context zza;
    private final String zzb;
    private final zzbzg zzc;
    private final zzbbg zzd;
    private final zzbbj zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcap zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcbk(Context context, zzbzg zzbzgVar, String str, zzbbj zzbbjVar, zzbbg zzbbgVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzbzgVar;
        this.zzb = str;
        this.zze = zzbbjVar;
        this.zzd = zzbbgVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzy);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                zzbza.zzk("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzcap zzcapVar) {
        zzbbb.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcapVar.zzj());
        this.zzn = zzcapVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbbb.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbbb.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbcz.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TapjoyAuctionFlags.AUCTION_TYPE, "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
            String strValueOf = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbcVar.zze));
            String strValueOf2 = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbcVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzp();
                final Context context = this.zza;
                final String str = this.zzc.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzp());
                bundle.putString("eids", TextUtils.join(",", zzbar.zza()));
                com.google.android.gms.ads.internal.client.zzay.zzb();
                zzbyt.zzx(context, str, "gmob-apps", bundle, true, new zzbys() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzbys
                    public final boolean zza(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        zzfkr zzfkrVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzH(context2, str3, str2);
                        return true;
                    }
                });
                this.zzo = true;
                return;
            }
            String str2 = this.zzh[i];
            if (str2 != null) {
                Long lValueOf = Long.valueOf(jArr[i]);
                Objects.toString(lValueOf);
                bundle.putString("fh_".concat(lValueOf.toString()), str2);
            }
            i++;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcap zzcapVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbbb.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long jNanoTime = com.google.android.gms.ads.internal.zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            long j = jNanoTime - this.zzq;
            com.google.android.gms.ads.internal.util.zzbf zzbfVar = this.zzf;
            double d = j;
            Double.isNaN(nanos);
            Double.isNaN(d);
            zzbfVar.zzb(nanos / d);
        }
        this.zzp = this.zzm;
        this.zzq = jNanoTime;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzz)).longValue();
        long jZza = zzcapVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jZza - this.zzg[i])) {
                String[] strArr2 = this.zzh;
                int i2 = 8;
                Bitmap bitmap = zzcapVar.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j2);
                        j2--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i++;
        }
    }
}
