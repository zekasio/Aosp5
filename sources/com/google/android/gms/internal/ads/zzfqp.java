package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfqp extends zzfqf implements Set {

    @CheckForNull
    private transient zzfqk zza;

    zzfqp() {
    }

    static int zzh(int i) {
        double d;
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfnu.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
            d = iHighestOneBit;
            Double.isNaN(d);
        } while (d * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfqo zzj(int i) {
        return new zzfqo(i);
    }

    public static zzfqp zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfqp zzm() {
        return zzfrz.zza;
    }

    public static zzfqp zzn(Object obj) {
        return new zzfsg(obj);
    }

    public static zzfqp zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfqp zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfqp) && zzr() && ((zzfqp) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfsf.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfsf.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public zzfqk zzd() {
        zzfqk zzfqkVar = this.zza;
        if (zzfqkVar != null) {
            return zzfqkVar;
        }
        zzfqk zzfqkVarZzi = zzi();
        this.zza = zzfqkVarZzi;
        return zzfqkVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzfsj iterator();

    zzfqk zzi() {
        return zzfqk.zzj(toArray());
    }

    boolean zzr() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfqp zzs(int i, Object... objArr) {
        if (i == 0) {
            return zzfrz.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfsg(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzfrr.zza(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iZza = zzfqc.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfsg(obj4);
        }
        if (zzh(i4) < iZzh / 2) {
            return zzs(i4, objArr);
        }
        if (zzt(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzfrz(objArr, i3, objArr2, i2, i4);
    }
}
