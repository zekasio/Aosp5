package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaj {
    private String zza;
    private Uri zzb;
    private final zzal zzc = new zzal();
    private final zzar zzd = new zzar(null);
    private final List zze = Collections.emptyList();
    private final zzfqk zzf = zzfqk.zzo();
    private final zzau zzg = new zzau();
    private final zzbd zzh = zzbd.zza;

    public final zzaj zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaj zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbg zzc() {
        zzba zzbaVar;
        Uri uri = this.zzb;
        zzav zzavVar = null;
        if (uri != null) {
            zzbaVar = new zzba(uri, null, null, null, this.zze, null, this.zzf, null, null);
        } else {
            zzbaVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbg(str, new zzap(this.zzc, null), zzbaVar, new zzaw(this.zzg), zzbm.zza, this.zzh, null);
    }
}
