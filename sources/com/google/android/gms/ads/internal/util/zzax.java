package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbyt;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzax extends zzald {
    private final Context zzc;

    private zzax(Context context, zzalc zzalcVar) {
        super(zzalcVar);
        this.zzc = context;
    }

    public static zzakr zzb(Context context) {
        zzakr zzakrVar = new zzakr(new zzalk(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzalp(null, null)), 4);
        zzakrVar.zzd();
        return zzakrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzald, com.google.android.gms.internal.ads.zzakh
    public final zzakk zza(zzako zzakoVar) throws zzakx {
        if (zzakoVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdZ), zzakoVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzbyt.zzt(this.zzc, 13400000)) {
                    zzakk zzakkVarZza = new zzbjk(this.zzc).zza(zzakoVar);
                    if (zzakkVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzakoVar.zzk())));
                        return zzakkVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzakoVar.zzk())));
                }
            }
        }
        return super.zza(zzakoVar);
    }
}
