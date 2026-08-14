package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgsk() {
    }

    static /* bridge */ /* synthetic */ zzgpe zza(zzgsk zzgskVar, zzgpe zzgpeVar, zzgpe zzgpeVar2) {
        zzgskVar.zzb(zzgpeVar);
        zzgskVar.zzb(zzgpeVar2);
        zzgpe zzgsoVar = (zzgpe) zzgskVar.zza.pop();
        while (!zzgskVar.zza.isEmpty()) {
            zzgsoVar = new zzgso((zzgpe) zzgskVar.zza.pop(), zzgsoVar);
        }
        return zzgsoVar;
    }

    private final void zzb(zzgpe zzgpeVar) {
        zzgsn zzgsnVar;
        if (!zzgpeVar.zzh()) {
            if (!(zzgpeVar instanceof zzgso)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgpeVar.getClass()))));
            }
            zzgso zzgsoVar = (zzgso) zzgpeVar;
            zzb(zzgsoVar.zzd);
            zzb(zzgsoVar.zze);
            return;
        }
        int iZzc = zzc(zzgpeVar.zzd());
        int iZzc2 = zzgso.zzc(iZzc + 1);
        if (this.zza.isEmpty() || ((zzgpe) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgpeVar);
            return;
        }
        int iZzc3 = zzgso.zzc(iZzc);
        zzgpe zzgsoVar2 = (zzgpe) this.zza.pop();
        while (true) {
            zzgsnVar = null;
            if (this.zza.isEmpty() || ((zzgpe) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgsoVar2 = new zzgso((zzgpe) this.zza.pop(), zzgsoVar2);
            }
        }
        zzgso zzgsoVar3 = new zzgso(zzgsoVar2, zzgpeVar);
        while (!this.zza.isEmpty()) {
            if (((zzgpe) this.zza.peek()).zzd() >= zzgso.zzc(zzc(zzgsoVar3.zzd()) + 1)) {
                break;
            } else {
                zzgsoVar3 = new zzgso((zzgpe) this.zza.pop(), zzgsoVar3);
            }
        }
        this.zza.push(zzgsoVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzgso.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzgsk(zzgsj zzgsjVar) {
    }
}
