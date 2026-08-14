package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsr {
    private static final Class zza;
    private static final zzgtg zzb;
    private static final zzgtg zzc;
    private static final zzgtg zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgti();
    }

    public static zzgtg zzA() {
        return zzc;
    }

    public static zzgtg zzB() {
        return zzd;
    }

    static Object zzC(Object obj, int i, List list, zzgqq zzgqqVar, Object obj2, zzgtg zzgtgVar) {
        if (zzgqqVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (zzgqqVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzD(obj, i, iIntValue, obj2, zzgtgVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgqqVar.zza(iIntValue2)) {
                    obj2 = zzD(obj, i, iIntValue2, obj2, zzgtgVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzD(Object obj, int i, int i2, Object obj2, zzgtg zzgtgVar) {
        if (obj2 == null) {
            obj2 = zzgtgVar.zzc(obj);
        }
        zzgtgVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzE(zzgpz zzgpzVar, Object obj, Object obj2) {
        zzgpzVar.zza(obj2);
        throw null;
    }

    static void zzF(zzgtg zzgtgVar, Object obj, Object obj2) {
        zzgtgVar.zzo(obj, zzgtgVar.zze(zzgtgVar.zzd(obj), zzgtgVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgqm.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzI(zzgrr zzgrrVar, Object obj, Object obj2, long j) {
        zzgtq.zzv(obj, j, zzgrr.zzc(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzc(i, list, z);
    }

    public static void zzK(int i, List list, zzgpu zzgpuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zze(i, list);
    }

    public static void zzL(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzg(i, list, z);
    }

    public static void zzM(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzj(i, list, z);
    }

    public static void zzN(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzl(i, list, z);
    }

    public static void zzO(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzn(i, list, z);
    }

    public static void zzP(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzp(i, list, z);
    }

    public static void zzQ(int i, List list, zzgpu zzgpuVar, zzgsp zzgspVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgpuVar.zzq(i, list.get(i2), zzgspVar);
        }
    }

    public static void zzR(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzs(i, list, z);
    }

    public static void zzS(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzu(i, list, z);
    }

    public static void zzT(int i, List list, zzgpu zzgpuVar, zzgsp zzgspVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgpuVar.zzv(i, list.get(i2), zzgspVar);
        }
    }

    public static void zzU(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzx(i, list, z);
    }

    public static void zzV(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzz(i, list, z);
    }

    public static void zzW(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzB(i, list, z);
    }

    public static void zzX(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzD(i, list, z);
    }

    public static void zzY(int i, List list, zzgpu zzgpuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzG(i, list);
    }

    public static void zzZ(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzI(i, list, z);
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgpu zzgpuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgpuVar.zzK(i, list, z);
    }

    private static zzgtg zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgtg) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = size * zzgpt.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzD += zzgpt.zzw((zzgpe) list.get(i2));
        }
        return iZzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgpt.zzD(i));
    }

    static int zze(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzgpt.zzy(zzgqnVar.zze(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzgpt.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzy;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzgsp zzgspVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzx += zzgpt.zzx(i, (zzgrw) list.get(i2), zzgspVar);
        }
        return iZzx;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgpt.zzD(i));
    }

    static int zzl(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzgpt.zzy(zzgqnVar.zze(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzgpt.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzy;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgpt.zzD(i));
    }

    static int zzn(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            iZzF = 0;
            while (i < size) {
                iZzF += zzgpt.zzF(zzgrlVar.zze(i));
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                iZzF += zzgpt.zzF(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzF;
    }

    static int zzo(int i, Object obj, zzgsp zzgspVar) {
        if (!(obj instanceof zzgrc)) {
            return zzgpt.zzE(i << 3) + zzgpt.zzA((zzgrw) obj, zzgspVar);
        }
        int i2 = zzgpt.zzf;
        int iZza = ((zzgrc) obj).zza();
        return zzgpt.zzE(i << 3) + zzgpt.zzE(iZza) + iZza;
    }

    static int zzp(int i, List list, zzgsp zzgspVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = zzgpt.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzD += obj instanceof zzgrc ? zzgpt.zzz((zzgrc) obj) : zzgpt.zzA((zzgrw) obj, zzgspVar);
        }
        return iZzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgpt.zzD(i));
    }

    static int zzr(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            iZzE = 0;
            while (i < size) {
                int iZze = zzgqnVar.zze(i);
                iZzE += zzgpt.zzE((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzE += zzgpt.zzE((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzE;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgpt.zzD(i));
    }

    static int zzt(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            iZzF = 0;
            while (i < size) {
                long jZze = zzgrlVar.zze(i);
                iZzF += zzgpt.zzF((jZze >> 63) ^ (jZze + jZze));
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzF += zzgpt.zzF((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzF;
    }

    static int zzu(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzgre;
        int iZzD = zzgpt.zzD(i) * size;
        if (z) {
            zzgre zzgreVar = (zzgre) list;
            while (i2 < size) {
                Object objZzf = zzgreVar.zzf(i2);
                iZzD += objZzf instanceof zzgpe ? zzgpt.zzw((zzgpe) objZzf) : zzgpt.zzC((String) objZzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzD += obj instanceof zzgpe ? zzgpt.zzw((zzgpe) obj) : zzgpt.zzC((String) obj);
                i2++;
            }
        }
        return iZzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgpt.zzD(i));
    }

    static int zzw(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqnVar = (zzgqn) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgpt.zzE(zzgqnVar.zze(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgpt.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgpt.zzD(i));
    }

    static int zzy(List list) {
        int iZzF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrlVar = (zzgrl) list;
            iZzF = 0;
            while (i < size) {
                iZzF += zzgpt.zzF(zzgrlVar.zze(i));
                i++;
            }
        } else {
            iZzF = 0;
            while (i < size) {
                iZzF += zzgpt.zzF(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzF;
    }

    public static zzgtg zzz() {
        return zzb;
    }
}
