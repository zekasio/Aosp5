package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbwb;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbwb zzc;
    private final zzbst zzd = new zzbst(false, Collections.emptyList());

    public zzb(Context context, zzbwb zzbwbVar, zzbst zzbstVar) {
        this.zza = context;
        this.zzc = zzbwbVar;
    }

    private final boolean zzd() {
        zzbwb zzbwbVar = this.zzc;
        return (zzbwbVar != null && zzbwbVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbwb zzbwbVar = this.zzc;
            if (zzbwbVar != null) {
                zzbwbVar.zzd(str, null, 3);
                return;
            }
            zzbst zzbstVar = this.zzd;
            if (!zzbstVar.zza || (list = zzbstVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.zza, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
