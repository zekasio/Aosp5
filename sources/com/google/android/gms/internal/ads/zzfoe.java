package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoe implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfoh zzb;

    zzfoe(zzfoh zzfohVar, CharSequence charSequence) {
        this.zzb = zzfohVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfnk.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
