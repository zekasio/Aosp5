package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzauh implements Comparator {
    zzauh(zzauj zzaujVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzaun zzaunVar = (zzaun) obj;
        zzaun zzaunVar2 = (zzaun) obj2;
        int i = zzaunVar.zzc - zzaunVar2.zzc;
        return i != 0 ? i : (zzaunVar.zza > zzaunVar2.zza ? 1 : (zzaunVar.zza == zzaunVar2.zza ? 0 : -1));
    }
}
