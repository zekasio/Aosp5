package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemd implements zzepn {
    private final Context zza;
    private final zzfuu zzb;

    public zzemd(Context context, zzfuu zzfuuVar) {
        this.zza = context;
        this.zzb = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strZze;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzaue zzaueVarZzg = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzg();
                Bundle bundle = null;
                if (zzaueVarZzg != null && (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN())) {
                    if (zzaueVarZzg.zzh()) {
                        zzaueVarZzg.zzg();
                    }
                    zzatu zzatuVarZza = zzaueVarZzg.zza();
                    if (zzatuVarZza != null) {
                        strZzj = zzatuVarZza.zzd();
                        strZze = zzatuVarZza.zze();
                        strZzk = zzatuVarZza.zzf();
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzw(strZzj);
                        }
                        if (strZzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzy(strZzk);
                        }
                    } else {
                        strZzj = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzj();
                        strZzk = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzk();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeme(bundle);
            }
        });
    }
}
