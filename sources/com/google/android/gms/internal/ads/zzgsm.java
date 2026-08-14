package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsm implements Iterator {
    private final ArrayDeque zza;
    private zzgoz zzb;

    /* synthetic */ zzgsm(zzgpe zzgpeVar, zzgsl zzgslVar) {
        if (!(zzgpeVar instanceof zzgso)) {
            this.zza = null;
            this.zzb = (zzgoz) zzgpeVar;
            return;
        }
        zzgso zzgsoVar = (zzgso) zzgpeVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgsoVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgsoVar);
        this.zzb = zzb(zzgsoVar.zzd);
    }

    private final zzgoz zzb(zzgpe zzgpeVar) {
        while (zzgpeVar instanceof zzgso) {
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            this.zza.push(zzgsoVar);
            zzgpeVar = zzgsoVar.zzd;
        }
        return (zzgoz) zzgpeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgoz next() {
        zzgoz zzgozVarZzb;
        zzgoz zzgozVar = this.zzb;
        if (zzgozVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgozVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgozVarZzb = zzb(((zzgso) this.zza.pop()).zze);
        } while (zzgozVarZzb.zzD());
        this.zzb = zzgozVarZzb;
        return zzgozVar;
    }
}
