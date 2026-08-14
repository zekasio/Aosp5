package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfrz extends zzfqp {
    static final zzfrz zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfrz(objArr, 0, objArr, 0, 0);
    }

    zzfrz(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZzb = zzfqc.zzb(obj);
        while (true) {
            int i = iZzb & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZzb = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzg);
        return i + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqf
    /* JADX INFO: renamed from: zze */
    public final zzfsj iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    final zzfqk zzi() {
        return zzfqk.zzk(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    final boolean zzr() {
        return true;
    }
}
