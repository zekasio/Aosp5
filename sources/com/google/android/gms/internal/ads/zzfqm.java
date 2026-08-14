package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqm {
    Object[] zza;
    int zzb;
    zzfql zzc;

    public zzfqm() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfqe.zze(length, i2));
        }
    }

    public final zzfqm zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfpj.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfqm zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfqn zzc() {
        zzfql zzfqlVar = this.zzc;
        if (zzfqlVar != null) {
            throw zzfqlVar.zza();
        }
        zzfry zzfryVarZzi = zzfry.zzi(this.zzb, this.zza, this);
        zzfql zzfqlVar2 = this.zzc;
        if (zzfqlVar2 == null) {
            return zzfryVarZzi;
        }
        throw zzfqlVar2.zza();
    }

    zzfqm(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
