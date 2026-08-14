package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfje {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfje(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfjf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfjf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return "FBAMTD" + (this.zzd - 1);
    }

    private final String zzf() {
        return "LATMTD" + (this.zzd - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzasr r8, com.google.android.gms.internal.ads.zzfjk r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfje.zza(com.google.android.gms.internal.ads.zzasr, com.google.android.gms.internal.ads.zzfjk):boolean");
    }

    final zzasu zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzasu zzasuVarZzh = zzasu.zzh(zzgpe.zzv(Hex.stringToBytes(string)));
            String strZzk = zzasuVarZzh.zzk();
            File fileZzb = zzfjf.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfjf.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfjf.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzasuVarZzh;
                }
            }
        } catch (zzgqy unused) {
        }
        return null;
    }

    public final zzfjd zzc(int i) {
        zzasu zzasuVarZzb = zzb(1);
        if (zzasuVarZzb == null) {
            return null;
        }
        String strZzk = zzasuVarZzb.zzk();
        File fileZzb = zzfjf.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfjf.zzb(strZzk, "pcam", zzd());
        }
        return new zzfjd(zzasuVarZzb, fileZzb, zzfjf.zzb(strZzk, "pcbc", zzd()), zzfjf.zzb(strZzk, "pcopt", zzd()));
    }
}
