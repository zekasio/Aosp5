package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnn {
    private final String zza;
    private final zzfnm zzb;
    private zzfnm zzc;

    /* synthetic */ zzfnn(String str, zzfnl zzfnlVar) {
        zzfnm zzfnmVar = new zzfnm(null);
        this.zzb = zzfnmVar;
        this.zzc = zzfnmVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfnm zzfnmVar = this.zzb.zzb;
        String str = "";
        while (zzfnmVar != null) {
            Object obj = zzfnmVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzfnmVar = zzfnmVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfnn zza(@CheckForNull Object obj) {
        zzfnm zzfnmVar = new zzfnm(null);
        this.zzc.zzb = zzfnmVar;
        this.zzc = zzfnmVar;
        zzfnmVar.zza = obj;
        return this;
    }
}
