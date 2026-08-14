package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeeh {
    private final Clock zza;
    private final zzeei zzb;
    private final zzfff zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgu)).booleanValue();
    private final zzeay zzf;

    public zzeeh(Clock clock, zzeei zzeeiVar, zzeay zzeayVar, zzfff zzfffVar) {
        this.zza = clock;
        this.zzb = zzeeiVar;
        this.zzf = zzeayVar;
        this.zzc = zzfffVar;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeeh zzeehVar, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbv)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzeehVar.zzd.add(str3);
    }

    final zzfut zze(zzeyo zzeyoVar, zzeyc zzeycVar, zzfut zzfutVar, zzffb zzffbVar) {
        zzeyf zzeyfVar = zzeyoVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzeycVar.zzx;
        if (str != null) {
            zzfuj.zzq(zzfutVar, new zzeeg(this, jElapsedRealtime, str, zzeycVar, zzeyfVar, zzffbVar, zzeyoVar), zzbzn.zzf);
        }
        return zzfutVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
