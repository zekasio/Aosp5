package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggs {
    private final zzggl zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    /* synthetic */ zzggs(zzggl zzgglVar, List list, Integer num, zzggr zzggrVar) {
        this.zza = zzgglVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggs)) {
            return false;
        }
        zzggs zzggsVar = (zzggs) obj;
        if (this.zza.equals(zzggsVar.zza) && this.zzb.equals(zzggsVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzggsVar.zzc;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
