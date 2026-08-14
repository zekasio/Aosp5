package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfpu extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    zzfpu() {
        zzl(3);
    }

    static /* synthetic */ int zzb(zzfpu zzfpuVar) {
        int i = zzfpuVar.zzg;
        zzfpuVar.zzg = i - 1;
        return i;
    }

    static /* synthetic */ Object zzi(zzfpu zzfpuVar) {
        Object obj = zzfpuVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzo() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp(@CheckForNull Object obj) {
        if (zzn()) {
            return -1;
        }
        int iZzb = zzfqc.zzb(obj);
        int iZzo = zzo();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzc = zzfpv.zzc(obj2, iZzb & iZzo);
        if (iZzc != 0) {
            int i = iZzo ^ (-1);
            int i2 = iZzb & i;
            do {
                int i3 = iZzc - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (zzfnp.zza(obj, objArr[i3])) {
                        return i3;
                    }
                }
                iZzc = i4 & iZzo;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzq(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objZzd = zzfpv.zzd(i2);
        if (i4 != 0) {
            zzfpv.zze(objZzd, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int iZzc = zzfpv.zzc(obj, i6);
            while (iZzc != 0) {
                int i7 = iZzc - 1;
                int i8 = iArr[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int iZzc2 = zzfpv.zzc(objZzd, i10);
                zzfpv.zze(objZzd, i10, iZzc);
                iArr[i7] = ((i5 ^ (-1)) & i9) | (iZzc2 & i5);
                iZzc = i8 & i;
            }
        }
        this.zze = objZzd;
        zzs(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzr(@CheckForNull Object obj) {
        if (zzn()) {
            return zzd;
        }
        int iZzo = zzo();
        Object obj2 = this.zze;
        obj2.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        int iZzb = zzfpv.zzb(obj, null, iZzo, obj2, iArr, objArr, null);
        if (iZzb == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Object obj3 = objArr2[iZzb];
        zzm(iZzb, iZzo);
        this.zzg--;
        zzk();
        return obj3;
    }

    private final void zzs(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzn()) {
            return;
        }
        zzk();
        Map mapZzj = zzj();
        if (mapZzj != null) {
            this.zzf = zzfsr.zzb(size(), 3, 1073741823);
            mapZzj.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Object[] objArr = this.zzb;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.zzg, (Object) null);
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        return mapZzj != null ? mapZzj.containsKey(obj) : zzp(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            Object[] objArr = this.zzc;
            objArr.getClass();
            if (zzfnp.zza(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfpp zzfppVar = new zzfpp(this);
        this.zzi = zzfppVar;
        return zzfppVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.get(obj);
        }
        int iZzp = zzp(obj);
        if (iZzp == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[iZzp];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfpr zzfprVar = new zzfpr(this);
        this.zzh = zzfprVar;
        return zzfprVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (zzn()) {
            zzfnu.zzi(zzn(), "Arrays already allocated");
            int i = this.zzf;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzfpv.zzd(iMax2);
            zzs(iMax2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.put(obj, obj2);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int iZzb = zzfqc.zzb(obj);
        int iZzo = zzo();
        int i4 = iZzb & iZzo;
        Object obj3 = this.zze;
        obj3.getClass();
        int iZzc = zzfpv.zzc(obj3, i4);
        if (iZzc != 0) {
            int i5 = iZzo ^ (-1);
            int i6 = iZzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = iZzc - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzfnp.zza(obj, objArr[i8])) {
                    Object obj4 = objArr2[i8];
                    objArr2[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & iZzo;
                i7++;
                if (i11 != 0) {
                    iZzc = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzo() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            Object[] objArr3 = this.zzb;
                            objArr3.getClass();
                            Object obj5 = objArr3[iZze];
                            Object[] objArr4 = this.zzc;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzk();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > iZzo) {
                        iZzo = zzq(iZzo, zzfpv.zza(iZzo), iZzb, i2);
                    } else {
                        iArr[i8] = (i3 & iZzo) | i10;
                    }
                }
            }
        } else if (i3 > iZzo) {
            iZzo = zzq(iZzo, zzfpv.zza(iZzo), iZzb, i2);
        } else {
            Object obj6 = this.zze;
            obj6.getClass();
            zzfpv.zze(obj6, i4, i3);
        }
        int[] iArr2 = this.zza;
        iArr2.getClass();
        int length = iArr2.length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.zza;
            iArr3.getClass();
            this.zza = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.zzb;
            objArr5.getClass();
            this.zzb = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.zzc;
            objArr6.getClass();
            this.zzc = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.zza;
        iArr4.getClass();
        iArr4[i2] = (iZzo ^ (-1)) & iZzb;
        Object[] objArr7 = this.zzb;
        objArr7.getClass();
        objArr7[i2] = obj;
        Object[] objArr8 = this.zzc;
        objArr8.getClass();
        objArr8[i2] = obj2;
        this.zzg = i3;
        zzk();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.remove(obj);
        }
        Object objZzr = zzr(obj);
        if (objZzr == zzd) {
            return null;
        }
        return objZzr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzj = zzj();
        return mapZzj != null ? mapZzj.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfpt zzfptVar = new zzfpt(this);
        this.zzj = zzfptVar;
        return zzfptVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @CheckForNull
    final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzk() {
        this.zzf += 32;
    }

    final void zzl(int i) {
        this.zzf = zzfsr.zzb(8, 1, 1073741823);
    }

    final void zzm(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int iZzb = zzfqc.zzb(obj2) & i2;
        int iZzc = zzfpv.zzc(obj, iZzb);
        if (iZzc == size) {
            zzfpv.zze(obj, iZzb, i + 1);
            return;
        }
        while (true) {
            int i4 = iZzc - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                return;
            }
            iZzc = i6;
        }
    }

    final boolean zzn() {
        return this.zze == null;
    }

    zzfpu(int i) {
        zzl(8);
    }
}
