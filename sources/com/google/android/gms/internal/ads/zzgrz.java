package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.drive.DriveFile;
import cz.msebera.android.httpclient.impl.client.cache.CacheConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrz<T> implements zzgsp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgtq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgrw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgrk zzn;
    private final zzgtg zzo;
    private final zzgpz zzp;
    private final zzgsb zzq;
    private final zzgrr zzr;

    private zzgrz(int[] iArr, Object[] objArr, int i, int i2, zzgrw zzgrwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgsb zzgsbVar, zzgrk zzgrkVar, zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrr zzgrrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgrwVar instanceof zzgqm;
        this.zzj = z;
        boolean z3 = false;
        if (zzgpzVar != null && zzgpzVar.zzh(zzgrwVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgsbVar;
        this.zzn = zzgrkVar;
        this.zzo = zzgtgVar;
        this.zzp = zzgpzVar;
        this.zzg = zzgrwVar;
        this.zzr = zzgrrVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzgtq.zzh(obj, j)).longValue();
    }

    private final zzgqq zzB(int i) {
        int i2 = i / 3;
        return (zzgqq) this.zzd[i2 + i2 + 1];
    }

    private final zzgsp zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgsp zzgspVar = (zzgsp) this.zzd[i3];
        if (zzgspVar != null) {
            return zzgspVar;
        }
        zzgsp zzgspVarZzb = zzgse.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzgspVarZzb;
        return zzgspVarZzb;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzgtg zzgtgVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzh = zzgtq.zzh(obj, zzz(i) & 1048575);
        if (objZzh == null || zzB(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzgsp zzgspVarZzC = zzC(i);
        int iZzz = zzz(i) & 1048575;
        if (!zzS(obj, i)) {
            return zzgspVarZzC.zze();
        }
        Object object = zzb.getObject(obj, iZzz);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzgspVarZzC.zze();
        if (object != null) {
            zzgspVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzgsp zzgspVarZzC = zzC(i2);
        if (!zzW(obj, i, i2)) {
            return zzgspVarZzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzgspVarZzC.zze();
        if (object != null) {
            zzgspVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzH(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzS(obj2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzgspVarZzC = zzC(i);
            if (!zzS(obj, i)) {
                if (zzV(object)) {
                    Object objZze = zzgspVarZzC.zze();
                    zzgspVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzV(object2)) {
                Object objZze2 = zzgspVarZzC.zze();
                zzgspVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgspVarZzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzW(obj2, i2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgsp zzgspVarZzC = zzC(i);
            if (!zzW(obj, i2, i)) {
                if (zzV(object)) {
                    Object objZze = zzgspVarZzC.zze();
                    zzgspVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzV(object2)) {
                Object objZze2 = zzgspVarZzC.zze();
                zzgspVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgspVarZzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzgsh zzgshVar) throws IOException {
        if (zzR(i)) {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzs());
        } else if (this.zzi) {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzr());
        } else {
            zzgtq.zzv(obj, i & 1048575, zzgshVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzw = zzw(i);
        long j = 1048575 & iZzw;
        if (j == 1048575) {
            return;
        }
        zzgtq.zzt(obj, j, (1 << (iZzw >>> 20)) | zzgtq.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgtq.zzt(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        return zzS(obj, i) == zzS(obj2, i);
    }

    private static boolean zzR(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzS(Object obj, int i) {
        int iZzw = zzw(i);
        long j = iZzw & 1048575;
        if (j != 1048575) {
            return (zzgtq.zzd(obj, j) & (1 << (iZzw >>> 20))) != 0;
        }
        int iZzz = zzz(i);
        long j2 = iZzz & 1048575;
        switch (zzy(iZzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzgtq.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgtq.zzc(obj, j2)) != 0;
            case 2:
                return zzgtq.zzf(obj, j2) != 0;
            case 3:
                return zzgtq.zzf(obj, j2) != 0;
            case 4:
                return zzgtq.zzd(obj, j2) != 0;
            case 5:
                return zzgtq.zzf(obj, j2) != 0;
            case 6:
                return zzgtq.zzd(obj, j2) != 0;
            case 7:
                return zzgtq.zzz(obj, j2);
            case 8:
                Object objZzh = zzgtq.zzh(obj, j2);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgpe) {
                    return !zzgpe.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgtq.zzh(obj, j2) != null;
            case 10:
                return !zzgpe.zzb.equals(zzgtq.zzh(obj, j2));
            case 11:
                return zzgtq.zzd(obj, j2) != 0;
            case 12:
                return zzgtq.zzd(obj, j2) != 0;
            case 13:
                return zzgtq.zzd(obj, j2) != 0;
            case 14:
                return zzgtq.zzf(obj, j2) != 0;
            case 15:
                return zzgtq.zzd(obj, j2) != 0;
            case 16:
                return zzgtq.zzf(obj, j2) != 0;
            case 17:
                return zzgtq.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzS(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzU(Object obj, int i, zzgsp zzgspVar) {
        return zzgspVar.zzk(zzgtq.zzh(obj, i & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgqm) {
            return ((zzgqm) obj).zzaX();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i, int i2) {
        return zzgtq.zzd(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzX(Object obj, long j) {
        return ((Boolean) zzgtq.zzh(obj, j)).booleanValue();
    }

    private final void zzY(zzgpu zzgpuVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzZ(int i, Object obj, zzgpu zzgpuVar) throws IOException {
        if (obj instanceof String) {
            zzgpuVar.zzF(i, (String) obj);
        } else {
            zzgpuVar.zzd(i, (zzgpe) obj);
        }
    }

    static zzgth zzd(Object obj) {
        zzgqm zzgqmVar = (zzgqm) obj;
        zzgth zzgthVar = zzgqmVar.zzc;
        if (zzgthVar != zzgth.zzc()) {
            return zzgthVar;
        }
        zzgth zzgthVarZzf = zzgth.zzf();
        zzgqmVar.zzc = zzgthVarZzf;
        return zzgthVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.zzgrz zzl(java.lang.Class r32, com.google.android.gms.internal.ads.zzgrt r33, com.google.android.gms.internal.ads.zzgsb r34, com.google.android.gms.internal.ads.zzgrk r35, com.google.android.gms.internal.ads.zzgtg r36, com.google.android.gms.internal.ads.zzgpz r37, com.google.android.gms.internal.ads.zzgrr r38) {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgsb, com.google.android.gms.internal.ads.zzgrk, com.google.android.gms.internal.ads.zzgtg, com.google.android.gms.internal.ads.zzgpz, com.google.android.gms.internal.ads.zzgrr):com.google.android.gms.internal.ads.zzgrz");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgtq.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgtq.zzh(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzE;
        int iZzE2;
        int iZzF;
        int iZzE3;
        int iZzE4;
        int iZzE5;
        int iZzE6;
        int iZzu;
        int iZzi;
        int iZzD;
        int iZzE7;
        int iZzE8;
        int iZzE9;
        int iZzE10;
        int iZzE11;
        int iZzE12;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int iZzE13 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.zzc.length) {
            int iZzz = zzz(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int iZzy = zzy(iZzz);
            if (iZzy <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                int i9 = i7 >>> 20;
                if (i8 != i4) {
                    i5 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long j = iZzz & i2;
            switch (iZzy) {
                case 0:
                    if ((i5 & i) != 0) {
                        iZzE = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE + 8;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iZzE2 = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE2 + 4;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        iZzF = zzgpt.zzF(unsafe.getLong(obj, j));
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        iZzF = zzgpt.zzF(unsafe.getLong(obj, j));
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        iZzF = zzgpt.zzy(unsafe.getInt(obj, j));
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iZzE = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE + 8;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iZzE2 = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE2 + 4;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iZzE4 = zzgpt.zzE(i6 << 3) + 1;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzgpe)) {
                            iZzF = zzgpt.zzC((String) object);
                            iZzE3 = zzgpt.zzE(i6 << 3);
                            iZzE13 += iZzE3 + iZzF;
                        } else {
                            int i10 = zzgpt.zzf;
                            int iZzd = ((zzgpe) object).zzd();
                            iZzE5 = zzgpt.zzE(iZzd) + iZzd;
                            iZzE6 = zzgpt.zzE(i6 << 3);
                            iZzE4 = iZzE6 + iZzE5;
                            iZzE13 += iZzE4;
                        }
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iZzE4 = zzgsr.zzo(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzE13 += iZzE4;
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzgpe zzgpeVar = (zzgpe) unsafe.getObject(obj, j);
                        int i11 = zzgpt.zzf;
                        int iZzd2 = zzgpeVar.zzd();
                        iZzE5 = zzgpt.zzE(iZzd2) + iZzd2;
                        iZzE6 = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE6 + iZzE5;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        iZzF = zzgpt.zzE(unsafe.getInt(obj, j));
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        iZzF = zzgpt.zzy(unsafe.getInt(obj, j));
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iZzE2 = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE2 + 4;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iZzE = zzgpt.zzE(i6 << 3);
                        iZzE4 = iZzE + 8;
                        iZzE13 += iZzE4;
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzE3 = zzgpt.zzE(i6 << 3);
                        iZzF = zzgpt.zzE((i12 >> 31) ^ (i12 + i12));
                        iZzE13 += iZzE3 + iZzF;
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzE13 += zzgpt.zzE(i6 << 3) + zzgpt.zzF((j2 >> 63) ^ (j2 + j2));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iZzE4 = zzgpt.zzx(i6, (zzgrw) unsafe.getObject(obj, j), zzC(i3));
                        iZzE13 += iZzE4;
                    }
                    break;
                case 18:
                    iZzE4 = zzgsr.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 19:
                    iZzE4 = zzgsr.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 20:
                    iZzE4 = zzgsr.zzm(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 21:
                    iZzE4 = zzgsr.zzx(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 22:
                    iZzE4 = zzgsr.zzk(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 23:
                    iZzE4 = zzgsr.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 24:
                    iZzE4 = zzgsr.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 25:
                    iZzE4 = zzgsr.zza(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzE4;
                    break;
                case 26:
                    iZzu = zzgsr.zzu(i6, (List) unsafe.getObject(obj, j));
                    iZzE13 += iZzu;
                    break;
                case 27:
                    iZzu = zzgsr.zzp(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzE13 += iZzu;
                    break;
                case 28:
                    iZzu = zzgsr.zzc(i6, (List) unsafe.getObject(obj, j));
                    iZzE13 += iZzu;
                    break;
                case 29:
                    iZzu = zzgsr.zzv(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 30:
                    iZzu = zzgsr.zzd(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 31:
                    iZzu = zzgsr.zzf(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 32:
                    iZzu = zzgsr.zzh(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 33:
                    iZzu = zzgsr.zzq(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 34:
                    iZzu = zzgsr.zzs(i6, (List) unsafe.getObject(obj, j), false);
                    iZzE13 += iZzu;
                    break;
                case 35:
                    iZzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 36:
                    iZzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 37:
                    iZzi = zzgsr.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 38:
                    iZzi = zzgsr.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 39:
                    iZzi = zzgsr.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 40:
                    iZzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 41:
                    iZzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 42:
                    iZzi = zzgsr.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 43:
                    iZzi = zzgsr.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 44:
                    iZzi = zzgsr.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 45:
                    iZzi = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 46:
                    iZzi = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 47:
                    iZzi = zzgsr.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzi = zzgsr.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzD = zzgpt.zzD(i6);
                        iZzE7 = zzgpt.zzE(iZzi);
                        iZzE8 = iZzD + iZzE7;
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzu = zzgsr.zzj(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzE13 += iZzu;
                    break;
                case 50:
                    zzgrr.zza(i6, unsafe.getObject(obj, j), zzE(i3));
                    break;
                case 51:
                    if (zzW(obj, i6, i3)) {
                        iZzE9 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE9 + 8;
                        iZzE13 += iZzu;
                    }
                    break;
                case 52:
                    if (zzW(obj, i6, i3)) {
                        iZzE10 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE10 + 4;
                        iZzE13 += iZzu;
                    }
                    break;
                case 53:
                    if (zzW(obj, i6, i3)) {
                        iZzi = zzgpt.zzF(zzA(obj, j));
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 54:
                    if (zzW(obj, i6, i3)) {
                        iZzi = zzgpt.zzF(zzA(obj, j));
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 55:
                    if (zzW(obj, i6, i3)) {
                        iZzi = zzgpt.zzy(zzq(obj, j));
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 56:
                    if (zzW(obj, i6, i3)) {
                        iZzE9 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE9 + 8;
                        iZzE13 += iZzu;
                    }
                    break;
                case 57:
                    if (zzW(obj, i6, i3)) {
                        iZzE10 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE10 + 4;
                        iZzE13 += iZzu;
                    }
                    break;
                case 58:
                    if (zzW(obj, i6, i3)) {
                        iZzu = zzgpt.zzE(i6 << 3) + 1;
                        iZzE13 += iZzu;
                    }
                    break;
                case 59:
                    if (zzW(obj, i6, i3)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgpe) {
                            int i13 = zzgpt.zzf;
                            int iZzd3 = ((zzgpe) object2).zzd();
                            iZzE11 = zzgpt.zzE(iZzd3) + iZzd3;
                            iZzE12 = zzgpt.zzE(i6 << 3);
                            iZzu = iZzE12 + iZzE11;
                            iZzE13 += iZzu;
                        } else {
                            iZzi = zzgpt.zzC((String) object2);
                            iZzE8 = zzgpt.zzE(i6 << 3);
                            iZzE13 += iZzE8 + iZzi;
                        }
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzW(obj, i6, i3)) {
                        iZzu = zzgsr.zzo(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzE13 += iZzu;
                    }
                    break;
                case 61:
                    if (zzW(obj, i6, i3)) {
                        zzgpe zzgpeVar2 = (zzgpe) unsafe.getObject(obj, j);
                        int i14 = zzgpt.zzf;
                        int iZzd4 = zzgpeVar2.zzd();
                        iZzE11 = zzgpt.zzE(iZzd4) + iZzd4;
                        iZzE12 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE12 + iZzE11;
                        iZzE13 += iZzu;
                    }
                    break;
                case 62:
                    if (zzW(obj, i6, i3)) {
                        iZzi = zzgpt.zzE(zzq(obj, j));
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzW(obj, i6, i3)) {
                        iZzi = zzgpt.zzy(zzq(obj, j));
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 64:
                    if (zzW(obj, i6, i3)) {
                        iZzE10 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE10 + 4;
                        iZzE13 += iZzu;
                    }
                    break;
                case 65:
                    if (zzW(obj, i6, i3)) {
                        iZzE9 = zzgpt.zzE(i6 << 3);
                        iZzu = iZzE9 + 8;
                        iZzE13 += iZzu;
                    }
                    break;
                case 66:
                    if (zzW(obj, i6, i3)) {
                        int iZzq = zzq(obj, j);
                        iZzE8 = zzgpt.zzE(i6 << 3);
                        iZzi = zzgpt.zzE((iZzq >> 31) ^ (iZzq + iZzq));
                        iZzE13 += iZzE8 + iZzi;
                    }
                    break;
                case 67:
                    if (zzW(obj, i6, i3)) {
                        long jZzA = zzA(obj, j);
                        iZzE13 += zzgpt.zzE(i6 << 3) + zzgpt.zzF((jZzA >> 63) ^ (jZzA + jZzA));
                    }
                    break;
                case 68:
                    if (zzW(obj, i6, i3)) {
                        iZzu = zzgpt.zzx(i6, (zzgrw) unsafe.getObject(obj, j), zzC(i3));
                        iZzE13 += iZzu;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzgtg zzgtgVar = this.zzo;
        int iZza = iZzE13 + zzgtgVar.zza(zzgtgVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzgtq.zzh(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzgrr.zzb(object)) {
            zzgrq zzgrqVarZzb = zzgrq.zza().zzb();
            zzgrr.zzc(zzgrqVarZzb, object);
            unsafe.putObject(obj, j, zzgrqVarZzb);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgoq zzgoqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgor.zzp(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgor.zzb(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzgor.zzm(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, Long.valueOf(zzgoqVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzgor.zzj(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzgoqVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzgor.zzp(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzgor.zzb(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzgor.zzm(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzgoqVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzgor.zzj(bArr, i, zzgoqVar);
                int i13 = zzgoqVar.zza;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzgtv.zzj(bArr, iZzj2, iZzj2 + i13)) {
                        throw zzgqy.zzd();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i13, zzgqw.zzb));
                    iZzj2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                Object objZzG = zzG(obj, i4, i8);
                int iZzo = zzgor.zzo(objZzG, zzC(i8), bArr, i, i2, zzgoqVar);
                zzP(obj, i4, i8, objZzG);
                return iZzo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzgor.zza(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, zzgoqVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzgor.zzj(bArr, i, zzgoqVar);
                int i14 = zzgoqVar.zza;
                zzgqq zzgqqVarZzB = zzB(i8);
                if (zzgqqVarZzB == null || zzgqqVarZzB.zza(i14)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    zzd(obj).zzj(i3, Long.valueOf(i14));
                }
                return iZzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzgor.zzj(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzgpm.zzF(zzgoqVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzgor.zzm(bArr, i, zzgoqVar);
                unsafe.putObject(obj, j, Long.valueOf(zzgpm.zzG(zzgoqVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objZzG2 = zzG(obj, i4, i8);
                int iZzn = zzgor.zzn(objZzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgoqVar);
                zzP(obj, i4, i8, objZzG2);
                return iZzn;
            default:
                return i;
        }
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgoq zzgoqVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzgqv zzgqvVarZzd = (zzgqv) unsafe.getObject(obj, j2);
        if (!zzgqvVarZzd.zzc()) {
            int size = zzgqvVarZzd.size();
            zzgqvVarZzd = zzgqvVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgqvVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzgpv zzgpvVar = (zzgpv) zzgqvVarZzd;
                    int iZzj3 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i12 = zzgoqVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzgpvVar.zze(Double.longBitsToDouble(zzgor.zzp(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 1) {
                    zzgpv zzgpvVar2 = (zzgpv) zzgqvVarZzd;
                    zzgpvVar2.zze(Double.longBitsToDouble(zzgor.zzp(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzgor.zzj(bArr, i8, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                zzgpvVar2.zze(Double.longBitsToDouble(zzgor.zzp(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgqf zzgqfVar = (zzgqf) zzgqvVarZzd;
                    int iZzj4 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i13 = zzgoqVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzgqfVar.zze(Float.intBitsToFloat(zzgor.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 5) {
                    zzgqf zzgqfVar2 = (zzgqf) zzgqvVarZzd;
                    zzgqfVar2.zze(Float.intBitsToFloat(zzgor.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzgor.zzj(bArr, i9, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                zzgqfVar2.zze(Float.intBitsToFloat(zzgor.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i9;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzgrl zzgrlVar = (zzgrl) zzgqvVarZzd;
                    int iZzj5 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i14 = zzgoqVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzgor.zzm(bArr, iZzj5, zzgoqVar);
                        zzgrlVar.zzg(zzgoqVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 0) {
                    zzgrl zzgrlVar2 = (zzgrl) zzgqvVarZzd;
                    int iZzm = zzgor.zzm(bArr, iZzj2, zzgoqVar);
                    zzgrlVar2.zzg(zzgoqVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzgor.zzj(bArr, iZzm, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzgor.zzm(bArr, iZzj6, zzgoqVar);
                        zzgrlVar2.zzg(zzgoqVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgor.zzf(bArr, iZzj2, zzgqvVarZzd, zzgoqVar);
                }
                if (i5 == 0) {
                    return zzgor.zzl(i3, bArr, i, i2, zzgqvVarZzd, zzgoqVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzgrl zzgrlVar3 = (zzgrl) zzgqvVarZzd;
                    int iZzj7 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i15 = zzgoqVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzgrlVar3.zzg(zzgor.zzp(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 1) {
                    zzgrl zzgrlVar4 = (zzgrl) zzgqvVarZzd;
                    zzgrlVar4.zzg(zzgor.zzp(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzgor.zzj(bArr, i10, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                zzgrlVar4.zzg(zzgor.zzp(bArr, iZzj2));
                            }
                        }
                    }
                    return i10;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzgqn zzgqnVar = (zzgqn) zzgqvVarZzd;
                    int iZzj8 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i16 = zzgoqVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzgqnVar.zzh(zzgor.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 5) {
                    zzgqn zzgqnVar2 = (zzgqn) zzgqvVarZzd;
                    zzgqnVar2.zzh(zzgor.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzgor.zzj(bArr, i11, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                zzgqnVar2.zzh(zzgor.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgos zzgosVar = (zzgos) zzgqvVarZzd;
                    iZzj = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i17 = zzgoqVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzgor.zzm(bArr, iZzj, zzgoqVar);
                        zzgosVar.zze(zzgoqVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzgqy.zzj();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzgos zzgosVar2 = (zzgos) zzgqvVarZzd;
                    int iZzm2 = zzgor.zzm(bArr, iZzj2, zzgoqVar);
                    zzgosVar2.zze(zzgoqVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzgor.zzj(bArr, iZzm2, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzgor.zzm(bArr, iZzj9, zzgoqVar);
                        zzgosVar2.zze(zzgoqVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZzj2 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                        int i18 = zzgoqVar.zza;
                        if (i18 < 0) {
                            throw zzgqy.zzf();
                        }
                        if (i18 == 0) {
                            zzgqvVarZzd.add("");
                        } else {
                            zzgqvVarZzd.add(new String(bArr, iZzj2, i18, zzgqw.zzb));
                            iZzj2 += i18;
                        }
                        while (iZzj2 < i2) {
                            int iZzj10 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                iZzj2 = zzgor.zzj(bArr, iZzj10, zzgoqVar);
                                int i19 = zzgoqVar.zza;
                                if (i19 < 0) {
                                    throw zzgqy.zzf();
                                }
                                if (i19 == 0) {
                                    zzgqvVarZzd.add("");
                                } else {
                                    zzgqvVarZzd.add(new String(bArr, iZzj2, i19, zzgqw.zzb));
                                    iZzj2 += i19;
                                }
                            }
                        }
                    } else {
                        iZzj2 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                        int i20 = zzgoqVar.zza;
                        if (i20 < 0) {
                            throw zzgqy.zzf();
                        }
                        if (i20 == 0) {
                            zzgqvVarZzd.add("");
                        } else {
                            int i21 = iZzj2 + i20;
                            if (!zzgtv.zzj(bArr, iZzj2, i21)) {
                                throw zzgqy.zzd();
                            }
                            zzgqvVarZzd.add(new String(bArr, iZzj2, i20, zzgqw.zzb));
                            iZzj2 = i21;
                        }
                        while (iZzj2 < i2) {
                            int iZzj11 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                            if (i3 == zzgoqVar.zza) {
                                iZzj2 = zzgor.zzj(bArr, iZzj11, zzgoqVar);
                                int i22 = zzgoqVar.zza;
                                if (i22 < 0) {
                                    throw zzgqy.zzf();
                                }
                                if (i22 == 0) {
                                    zzgqvVarZzd.add("");
                                } else {
                                    int i23 = iZzj2 + i22;
                                    if (!zzgtv.zzj(bArr, iZzj2, i23)) {
                                        throw zzgqy.zzd();
                                    }
                                    zzgqvVarZzd.add(new String(bArr, iZzj2, i22, zzgqw.zzb));
                                    iZzj2 = i23;
                                }
                            }
                        }
                    }
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzgor.zze(zzC(i6), i3, bArr, i, i2, zzgqvVarZzd, zzgoqVar);
                }
                return iZzj2;
            case 28:
                if (i5 == 2) {
                    int iZzj12 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i24 = zzgoqVar.zza;
                    if (i24 < 0) {
                        throw zzgqy.zzf();
                    }
                    if (i24 > bArr.length - iZzj12) {
                        throw zzgqy.zzj();
                    }
                    if (i24 == 0) {
                        zzgqvVarZzd.add(zzgpe.zzb);
                    } else {
                        zzgqvVarZzd.add(zzgpe.zzw(bArr, iZzj12, i24));
                        iZzj12 += i24;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzgor.zzj(bArr, iZzj12, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzgor.zzj(bArr, iZzj13, zzgoqVar);
                        int i25 = zzgoqVar.zza;
                        if (i25 < 0) {
                            throw zzgqy.zzf();
                        }
                        if (i25 > bArr.length - iZzj12) {
                            throw zzgqy.zzj();
                        }
                        if (i25 == 0) {
                            zzgqvVarZzd.add(zzgpe.zzb);
                        } else {
                            zzgqvVarZzd.add(zzgpe.zzw(bArr, iZzj12, i25));
                            iZzj12 += i25;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzj = zzgor.zzl(i3, bArr, i, i2, zzgqvVarZzd, zzgoqVar);
                    }
                    return iZzj2;
                }
                iZzj = zzgor.zzf(bArr, iZzj2, zzgqvVarZzd, zzgoqVar);
                zzgsr.zzC(obj, i4, zzgqvVarZzd, zzB(i6), null, this.zzo);
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzgqn zzgqnVar3 = (zzgqn) zzgqvVarZzd;
                    int iZzj14 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i26 = zzgoqVar.zza + iZzj14;
                    while (iZzj14 < i26) {
                        iZzj14 = zzgor.zzj(bArr, iZzj14, zzgoqVar);
                        zzgqnVar3.zzh(zzgpm.zzF(zzgoqVar.zza));
                    }
                    if (iZzj14 == i26) {
                        return iZzj14;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 0) {
                    zzgqn zzgqnVar4 = (zzgqn) zzgqvVarZzd;
                    int iZzj15 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    zzgqnVar4.zzh(zzgpm.zzF(zzgoqVar.zza));
                    while (iZzj15 < i2) {
                        int iZzj16 = zzgor.zzj(bArr, iZzj15, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzgor.zzj(bArr, iZzj16, zzgoqVar);
                        zzgqnVar4.zzh(zzgpm.zzF(zzgoqVar.zza));
                    }
                    return iZzj15;
                }
                return iZzj2;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i5 == 2) {
                    zzgrl zzgrlVar5 = (zzgrl) zzgqvVarZzd;
                    int iZzj17 = zzgor.zzj(bArr, iZzj2, zzgoqVar);
                    int i27 = zzgoqVar.zza + iZzj17;
                    while (iZzj17 < i27) {
                        iZzj17 = zzgor.zzm(bArr, iZzj17, zzgoqVar);
                        zzgrlVar5.zzg(zzgpm.zzG(zzgoqVar.zzb));
                    }
                    if (iZzj17 == i27) {
                        return iZzj17;
                    }
                    throw zzgqy.zzj();
                }
                if (i5 == 0) {
                    zzgrl zzgrlVar6 = (zzgrl) zzgqvVarZzd;
                    int iZzm3 = zzgor.zzm(bArr, iZzj2, zzgoqVar);
                    zzgrlVar6.zzg(zzgpm.zzG(zzgoqVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj18 = zzgor.zzj(bArr, iZzm3, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzgor.zzm(bArr, iZzj18, zzgoqVar);
                        zzgrlVar6.zzg(zzgpm.zzG(zzgoqVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzgsp zzgspVarZzC = zzC(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzgor.zzc(zzgspVarZzC, bArr, i, i2, i28, zzgoqVar);
                    zzgqvVarZzd.add(zzgoqVar.zzc);
                    while (iZzc < i2) {
                        int iZzj19 = zzgor.zzj(bArr, iZzc, zzgoqVar);
                        if (i3 != zzgoqVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzgor.zzc(zzgspVarZzC, bArr, iZzj19, i2, i28, zzgoqVar);
                        zzgqvVarZzd.add(zzgoqVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zza(Object obj) {
        int iZzE;
        int iZzE2;
        int iZzF;
        int iZzE3;
        int iZzE4;
        int iZzE5;
        int iZzE6;
        int iZzo;
        int iZzE7;
        int iZzF2;
        int iZzD;
        int iZzE8;
        if (!this.zzj) {
            return zzp(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzz = zzz(i2);
            int iZzy = zzy(iZzz);
            int i3 = this.zzc[i2];
            int i4 = iZzz & 1048575;
            if (iZzy >= zzgqe.DOUBLE_LIST_PACKED.zza() && iZzy <= zzgqe.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (iZzy) {
                case 0:
                    if (zzS(obj, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 1:
                    if (zzS(obj, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 2:
                    if (zzS(obj, i2)) {
                        iZzF = zzgpt.zzF(zzgtq.zzf(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 3:
                    if (zzS(obj, i2)) {
                        iZzF = zzgpt.zzF(zzgtq.zzf(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 4:
                    if (zzS(obj, i2)) {
                        iZzF = zzgpt.zzy(zzgtq.zzd(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 5:
                    if (zzS(obj, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 6:
                    if (zzS(obj, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 7:
                    if (zzS(obj, i2)) {
                        iZzE4 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE4 + 1;
                        i += iZzo;
                    }
                    break;
                case 8:
                    if (zzS(obj, i2)) {
                        Object objZzh = zzgtq.zzh(obj, j);
                        if (objZzh instanceof zzgpe) {
                            int i6 = i3 << 3;
                            int i7 = zzgpt.zzf;
                            int iZzd = ((zzgpe) objZzh).zzd();
                            iZzE5 = zzgpt.zzE(iZzd) + iZzd;
                            iZzE6 = zzgpt.zzE(i6);
                            iZzo = iZzE6 + iZzE5;
                            i += iZzo;
                        } else {
                            iZzF = zzgpt.zzC((String) objZzh);
                            iZzE3 = zzgpt.zzE(i3 << 3);
                            i += iZzE3 + iZzF;
                        }
                    }
                    break;
                case 9:
                    if (zzS(obj, i2)) {
                        iZzo = zzgsr.zzo(i3, zzgtq.zzh(obj, j), zzC(i2));
                        i += iZzo;
                    }
                    break;
                case 10:
                    if (zzS(obj, i2)) {
                        zzgpe zzgpeVar = (zzgpe) zzgtq.zzh(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzgpt.zzf;
                        int iZzd2 = zzgpeVar.zzd();
                        iZzE5 = zzgpt.zzE(iZzd2) + iZzd2;
                        iZzE6 = zzgpt.zzE(i8);
                        iZzo = iZzE6 + iZzE5;
                        i += iZzo;
                    }
                    break;
                case 11:
                    if (zzS(obj, i2)) {
                        iZzF = zzgpt.zzE(zzgtq.zzd(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 12:
                    if (zzS(obj, i2)) {
                        iZzF = zzgpt.zzy(zzgtq.zzd(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 13:
                    if (zzS(obj, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 14:
                    if (zzS(obj, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 15:
                    if (zzS(obj, i2)) {
                        int iZzd3 = zzgtq.zzd(obj, j);
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        iZzF = zzgpt.zzE((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 16:
                    if (zzS(obj, i2)) {
                        long jZzf = zzgtq.zzf(obj, j);
                        iZzE7 = zzgpt.zzE(i3 << 3);
                        iZzF2 = zzgpt.zzF((jZzf >> 63) ^ (jZzf + jZzf));
                        iZzo = iZzE7 + iZzF2;
                        i += iZzo;
                    }
                    break;
                case 17:
                    if (zzS(obj, i2)) {
                        iZzo = zzgpt.zzx(i3, (zzgrw) zzgtq.zzh(obj, j), zzC(i2));
                        i += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 19:
                    iZzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 20:
                    iZzo = zzgsr.zzm(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 21:
                    iZzo = zzgsr.zzx(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 22:
                    iZzo = zzgsr.zzk(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 23:
                    iZzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 24:
                    iZzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 25:
                    iZzo = zzgsr.zza(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 26:
                    iZzo = zzgsr.zzu(i3, (List) zzgtq.zzh(obj, j));
                    i += iZzo;
                    break;
                case 27:
                    iZzo = zzgsr.zzp(i3, (List) zzgtq.zzh(obj, j), zzC(i2));
                    i += iZzo;
                    break;
                case 28:
                    iZzo = zzgsr.zzc(i3, (List) zzgtq.zzh(obj, j));
                    i += iZzo;
                    break;
                case 29:
                    iZzo = zzgsr.zzv(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 30:
                    iZzo = zzgsr.zzd(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 31:
                    iZzo = zzgsr.zzf(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 32:
                    iZzo = zzgsr.zzh(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 33:
                    iZzo = zzgsr.zzq(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 34:
                    iZzo = zzgsr.zzs(i3, (List) zzgtq.zzh(obj, j), false);
                    i += iZzo;
                    break;
                case 35:
                    iZzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 36:
                    iZzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 37:
                    iZzF = zzgsr.zzn((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 38:
                    iZzF = zzgsr.zzy((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 39:
                    iZzF = zzgsr.zzl((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 40:
                    iZzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 41:
                    iZzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 42:
                    iZzF = zzgsr.zzb((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 43:
                    iZzF = zzgsr.zzw((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 44:
                    iZzF = zzgsr.zze((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 45:
                    iZzF = zzgsr.zzg((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 46:
                    iZzF = zzgsr.zzi((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 47:
                    iZzF = zzgsr.zzr((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzF = zzgsr.zzt((List) unsafe.getObject(obj, j));
                    if (iZzF > 0) {
                        iZzD = zzgpt.zzD(i3);
                        iZzE8 = zzgpt.zzE(iZzF);
                        iZzE3 = iZzD + iZzE8;
                        i += iZzE3 + iZzF;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzo = zzgsr.zzj(i3, (List) zzgtq.zzh(obj, j), zzC(i2));
                    i += iZzo;
                    break;
                case 50:
                    zzgrr.zza(i3, zzgtq.zzh(obj, j), zzE(i2));
                    break;
                case 51:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 52:
                    if (zzW(obj, i3, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 53:
                    if (zzW(obj, i3, i2)) {
                        iZzF = zzgpt.zzF(zzA(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 54:
                    if (zzW(obj, i3, i2)) {
                        iZzF = zzgpt.zzF(zzA(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 55:
                    if (zzW(obj, i3, i2)) {
                        iZzF = zzgpt.zzy(zzq(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 56:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 57:
                    if (zzW(obj, i3, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 58:
                    if (zzW(obj, i3, i2)) {
                        iZzE4 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE4 + 1;
                        i += iZzo;
                    }
                    break;
                case 59:
                    if (zzW(obj, i3, i2)) {
                        Object objZzh2 = zzgtq.zzh(obj, j);
                        if (objZzh2 instanceof zzgpe) {
                            int i10 = i3 << 3;
                            int i11 = zzgpt.zzf;
                            int iZzd4 = ((zzgpe) objZzh2).zzd();
                            iZzE5 = zzgpt.zzE(iZzd4) + iZzd4;
                            iZzE6 = zzgpt.zzE(i10);
                            iZzo = iZzE6 + iZzE5;
                            i += iZzo;
                        } else {
                            iZzF = zzgpt.zzC((String) objZzh2);
                            iZzE3 = zzgpt.zzE(i3 << 3);
                            i += iZzE3 + iZzF;
                        }
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzW(obj, i3, i2)) {
                        iZzo = zzgsr.zzo(i3, zzgtq.zzh(obj, j), zzC(i2));
                        i += iZzo;
                    }
                    break;
                case 61:
                    if (zzW(obj, i3, i2)) {
                        zzgpe zzgpeVar2 = (zzgpe) zzgtq.zzh(obj, j);
                        int i12 = i3 << 3;
                        int i13 = zzgpt.zzf;
                        int iZzd5 = zzgpeVar2.zzd();
                        iZzE5 = zzgpt.zzE(iZzd5) + iZzd5;
                        iZzE6 = zzgpt.zzE(i12);
                        iZzo = iZzE6 + iZzE5;
                        i += iZzo;
                    }
                    break;
                case 62:
                    if (zzW(obj, i3, i2)) {
                        iZzF = zzgpt.zzE(zzq(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzW(obj, i3, i2)) {
                        iZzF = zzgpt.zzy(zzq(obj, j));
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 64:
                    if (zzW(obj, i3, i2)) {
                        iZzE2 = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE2 + 4;
                        i += iZzo;
                    }
                    break;
                case 65:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzgpt.zzE(i3 << 3);
                        iZzo = iZzE + 8;
                        i += iZzo;
                    }
                    break;
                case 66:
                    if (zzW(obj, i3, i2)) {
                        int iZzq = zzq(obj, j);
                        iZzE3 = zzgpt.zzE(i3 << 3);
                        iZzF = zzgpt.zzE((iZzq >> 31) ^ (iZzq + iZzq));
                        i += iZzE3 + iZzF;
                    }
                    break;
                case 67:
                    if (zzW(obj, i3, i2)) {
                        long jZzA = zzA(obj, j);
                        iZzE7 = zzgpt.zzE(i3 << 3);
                        iZzF2 = zzgpt.zzF((jZzA >> 63) ^ (jZzA + jZzA));
                        iZzo = iZzE7 + iZzF2;
                        i += iZzo;
                    }
                    break;
                case 68:
                    if (zzW(obj, i3, i2)) {
                        iZzo = zzgpt.zzx(i3, (zzgrw) zzgtq.zzh(obj, j), zzC(i2));
                        i += iZzo;
                    }
                    break;
            }
        }
        zzgtg zzgtgVar = this.zzo;
        return i + zzgtgVar.zza(zzgtgVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzz = zzz(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzz;
            int iHashCode = 37;
            switch (zzy(iZzz)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(Double.doubleToLongBits(zzgtq.zzb(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzgtq.zzc(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzgqw.zza(zzgtq.zzz(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzgtq.zzh(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzh = zzgtq.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzgtq.zzd(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzgqw.zzc(zzgtq.zzf(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzh2 = zzgtq.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    iZzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzgtq.zzh(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 51:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 53:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zza(zzX(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 59:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzgtq.zzh(obj, j)).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 61:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 62:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzq(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgqw.zzc(zzA(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzW(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzgtq.zzh(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzo.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0407, code lost:
    
        if (r0 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0409, code lost:
    
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x040f, code lost:
    
        r10 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0414, code lost:
    
        if (r10 >= r8.zzm) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0416, code lost:
    
        zzD(r28, r8.zzk[r10], null, r8.zzo, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0429, code lost:
    
        if (r9 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x042d, code lost:
    
        if (r6 != r31) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0434, code lost:
    
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0437, code lost:
    
        if (r6 > r31) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0439, code lost:
    
        if (r7 != r9) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0441, code lost:
    
        throw com.google.android.gms.internal.ads.zzgqy.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzgoq r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgoq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final Object zze() {
        return ((zzgqm) this.zzg).zzaD();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzV(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgqm
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.ads.zzgqm r0 = (com.google.android.gms.internal.ads.zzgqm) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzaU(r2)
            r0.zza = r1
            r0.zzaS()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L62
            int r2 = r7.zzz(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzy(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L4c
            switch(r2) {
                case 17: goto L4c;
                case 18: goto L46;
                case 19: goto L46;
                case 20: goto L46;
                case 21: goto L46;
                case 22: goto L46;
                case 23: goto L46;
                case 24: goto L46;
                case 25: goto L46;
                case 26: goto L46;
                case 27: goto L46;
                case 28: goto L46;
                case 29: goto L46;
                case 30: goto L46;
                case 31: goto L46;
                case 32: goto L46;
                case 33: goto L46;
                case 34: goto L46;
                case 35: goto L46;
                case 36: goto L46;
                case 37: goto L46;
                case 38: goto L46;
                case 39: goto L46;
                case 40: goto L46;
                case 41: goto L46;
                case 42: goto L46;
                case 43: goto L46;
                case 44: goto L46;
                case 45: goto L46;
                case 46: goto L46;
                case 47: goto L46;
                case 48: goto L46;
                case 49: goto L46;
                case 50: goto L34;
                default: goto L33;
            }
        L33:
            goto L5f
        L34:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzgrz.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5f
            r6 = r5
            com.google.android.gms.internal.ads.zzgrq r6 = (com.google.android.gms.internal.ads.zzgrq) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L5f
        L46:
            com.google.android.gms.internal.ads.zzgrk r2 = r7.zzn
            r2.zzb(r8, r3)
            goto L5f
        L4c:
            boolean r2 = r7.zzS(r8, r1)
            if (r2 == 0) goto L5f
            com.google.android.gms.internal.ads.zzgsp r2 = r7.zzC(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzgrz.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L5f:
            int r1 = r1 + 3
            goto L1d
        L62:
            com.google.android.gms.internal.ads.zzgtg r0 = r7.zzo
            r0.zzm(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L70
            com.google.android.gms.internal.ads.zzgpz r0 = r7.zzp
            r0.zze(r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & iZzz;
            switch (zzy(iZzz)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzgtq.zzr(obj, j, zzgtq.zzb(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 1:
                    if (zzS(obj2, i)) {
                        zzgtq.zzs(obj, j, zzgtq.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 2:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 3:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 4:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 5:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 6:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 7:
                    if (zzS(obj2, i)) {
                        zzgtq.zzp(obj, j, zzgtq.zzz(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 8:
                    if (zzS(obj2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzS(obj2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 11:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 12:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 13:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 14:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 15:
                    if (zzS(obj2, i)) {
                        zzgtq.zzt(obj, j, zzgtq.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 16:
                    if (zzS(obj2, i)) {
                        zzgtq.zzu(obj, j, zzgtq.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgsr.zzI(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzW(obj2, i2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzW(obj2, i2, i)) {
                        zzgtq.zzv(obj, j, zzgtq.zzh(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzgsr.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgsr.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x061d A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:153:0x05eb, B:167:0x0618, B:169:0x061d, B:170:0x0622), top: B:195:0x05eb }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0655 A[LOOP:2: B:185:0x0651->B:187:0x0655, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0628 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzgsh r19, com.google.android.gms.internal.ads.zzgpy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgsh, com.google.android.gms.internal.ads.zzgpy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ed, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ef, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0300, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x032c, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034f, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgoq r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgoq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzz = zzz(i);
            long j = iZzz & 1048575;
            switch (zzy(iZzz)) {
                case 0:
                    if (!zzQ(obj, obj2, i) || Double.doubleToLongBits(zzgtq.zzb(obj, j)) != Double.doubleToLongBits(zzgtq.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzQ(obj, obj2, i) || Float.floatToIntBits(zzgtq.zzc(obj, j)) != Float.floatToIntBits(zzgtq.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzf(obj, j) != zzgtq.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzf(obj, j) != zzgtq.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzf(obj, j) != zzgtq.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzz(obj, j) != zzgtq.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzQ(obj, obj2, i) || !zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzQ(obj, obj2, i) || !zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzQ(obj, obj2, i) || !zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzf(obj, j) != zzgtq.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzd(obj, j) != zzgtq.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzQ(obj, obj2, i) || zzgtq.zzf(obj, j) != zzgtq.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzQ(obj, obj2, i) || !zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zZzH = zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j));
                    break;
                case 50:
                    zZzH = zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzw = zzw(i) & 1048575;
                    if (zzgtq.zzd(obj, jZzw) != zzgtq.zzd(obj2, jZzw) || !zzgsr.zzH(zzgtq.zzh(obj, j), zzgtq.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.ads.zzgsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrz.zzk(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzm(Object obj, zzgpu zzgpuVar) throws IOException {
        int i;
        int i2 = 1048575;
        if (this.zzj) {
            if (this.zzh) {
                this.zzp.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int iZzz = zzz(i3);
                int i4 = this.zzc[i3];
                switch (zzy(iZzz)) {
                    case 0:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzf(i4, zzgtq.zzb(obj, iZzz & 1048575));
                        }
                        break;
                    case 1:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzo(i4, zzgtq.zzc(obj, iZzz & 1048575));
                        }
                        break;
                    case 2:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzt(i4, zzgtq.zzf(obj, iZzz & 1048575));
                        }
                        break;
                    case 3:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzJ(i4, zzgtq.zzf(obj, iZzz & 1048575));
                        }
                        break;
                    case 4:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzr(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 5:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzm(i4, zzgtq.zzf(obj, iZzz & 1048575));
                        }
                        break;
                    case 6:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzk(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 7:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzb(i4, zzgtq.zzz(obj, iZzz & 1048575));
                        }
                        break;
                    case 8:
                        if (zzS(obj, i3)) {
                            zzZ(i4, zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar);
                        }
                        break;
                    case 9:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzv(i4, zzgtq.zzh(obj, iZzz & 1048575), zzC(i3));
                        }
                        break;
                    case 10:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzd(i4, (zzgpe) zzgtq.zzh(obj, iZzz & 1048575));
                        }
                        break;
                    case 11:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzH(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 12:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzi(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 13:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzw(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 14:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzy(i4, zzgtq.zzf(obj, iZzz & 1048575));
                        }
                        break;
                    case 15:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzA(i4, zzgtq.zzd(obj, iZzz & 1048575));
                        }
                        break;
                    case 16:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzC(i4, zzgtq.zzf(obj, iZzz & 1048575));
                        }
                        break;
                    case 17:
                        if (zzS(obj, i3)) {
                            zzgpuVar.zzq(i4, zzgtq.zzh(obj, iZzz & 1048575), zzC(i3));
                        }
                        break;
                    case 18:
                        zzgsr.zzL(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 19:
                        zzgsr.zzP(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 20:
                        zzgsr.zzS(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 21:
                        zzgsr.zzaa(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 22:
                        zzgsr.zzR(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 23:
                        zzgsr.zzO(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 24:
                        zzgsr.zzN(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 25:
                        zzgsr.zzJ(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 26:
                        zzgsr.zzY(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar);
                        break;
                    case 27:
                        zzgsr.zzT(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, zzC(i3));
                        break;
                    case 28:
                        zzgsr.zzK(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar);
                        break;
                    case 29:
                        zzgsr.zzZ(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 30:
                        zzgsr.zzM(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 31:
                        zzgsr.zzU(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 32:
                        zzgsr.zzV(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 33:
                        zzgsr.zzW(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 34:
                        zzgsr.zzX(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, false);
                        break;
                    case 35:
                        zzgsr.zzL(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 36:
                        zzgsr.zzP(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 37:
                        zzgsr.zzS(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 38:
                        zzgsr.zzaa(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 39:
                        zzgsr.zzR(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 40:
                        zzgsr.zzO(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 41:
                        zzgsr.zzN(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 42:
                        zzgsr.zzJ(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 43:
                        zzgsr.zzZ(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 44:
                        zzgsr.zzM(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 45:
                        zzgsr.zzU(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 46:
                        zzgsr.zzV(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case 47:
                        zzgsr.zzW(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        zzgsr.zzX(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, true);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzgsr.zzQ(i4, (List) zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar, zzC(i3));
                        break;
                    case 50:
                        zzY(zzgpuVar, i4, zzgtq.zzh(obj, iZzz & 1048575), i3);
                        break;
                    case 51:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzf(i4, zzn(obj, iZzz & 1048575));
                        }
                        break;
                    case 52:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzo(i4, zzo(obj, iZzz & 1048575));
                        }
                        break;
                    case 53:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzt(i4, zzA(obj, iZzz & 1048575));
                        }
                        break;
                    case 54:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzJ(i4, zzA(obj, iZzz & 1048575));
                        }
                        break;
                    case 55:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzr(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case 56:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzm(i4, zzA(obj, iZzz & 1048575));
                        }
                        break;
                    case 57:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzk(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case 58:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzb(i4, zzX(obj, iZzz & 1048575));
                        }
                        break;
                    case 59:
                        if (zzW(obj, i4, i3)) {
                            zzZ(i4, zzgtq.zzh(obj, iZzz & 1048575), zzgpuVar);
                        }
                        break;
                    case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzv(i4, zzgtq.zzh(obj, iZzz & 1048575), zzC(i3));
                        }
                        break;
                    case 61:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzd(i4, (zzgpe) zzgtq.zzh(obj, iZzz & 1048575));
                        }
                        break;
                    case 62:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzH(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzi(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case 64:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzw(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case 65:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzy(i4, zzA(obj, iZzz & 1048575));
                        }
                        break;
                    case 66:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzA(i4, zzq(obj, iZzz & 1048575));
                        }
                        break;
                    case 67:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzC(i4, zzA(obj, iZzz & 1048575));
                        }
                        break;
                    case 68:
                        if (zzW(obj, i4, i3)) {
                            zzgpuVar.zzq(i4, zzgtq.zzh(obj, iZzz & 1048575), zzC(i3));
                        }
                        break;
                }
            }
            zzgtg zzgtgVar = this.zzo;
            zzgtgVar.zzr(zzgtgVar.zzd(obj), zzgpuVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < length2) {
            int iZzz2 = zzz(i5);
            int[] iArr = this.zzc;
            int i8 = iArr[i5];
            int iZzy = zzy(iZzz2);
            if (iZzy <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i2;
                if (i10 != i6) {
                    i7 = unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzz2 & i2;
            switch (iZzy) {
                case 0:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzf(i8, zzgtq.zzb(obj, j));
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzo(i8, zzgtq.zzc(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzt(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzJ(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzr(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzm(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzk(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzb(i8, zzgtq.zzz(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i7 & i) != 0) {
                        zzZ(i8, unsafe.getObject(obj, j), zzgpuVar);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzv(i8, unsafe.getObject(obj, j), zzC(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzd(i8, (zzgpe) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzH(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzi(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzw(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzy(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzA(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzC(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i7 & i) != 0) {
                        zzgpuVar.zzq(i8, unsafe.getObject(obj, j), zzC(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    zzgsr.zzL(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    zzgsr.zzP(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    zzgsr.zzS(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    zzgsr.zzaa(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    zzgsr.zzR(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    zzgsr.zzO(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    zzgsr.zzN(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    zzgsr.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    continue;
                    i5 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    zzgsr.zzY(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar);
                    break;
                case 27:
                    zzgsr.zzT(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i5));
                    break;
                case 28:
                    zzgsr.zzK(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar);
                    break;
                case 29:
                    zzgsr.zzZ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 30:
                    zzgsr.zzM(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 31:
                    zzgsr.zzU(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 32:
                    zzgsr.zzV(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 33:
                    zzgsr.zzW(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 34:
                    zzgsr.zzX(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, false);
                    break;
                case 35:
                    zzgsr.zzL(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 36:
                    zzgsr.zzP(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 37:
                    zzgsr.zzS(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 38:
                    zzgsr.zzaa(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 39:
                    zzgsr.zzR(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 40:
                    zzgsr.zzO(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 41:
                    zzgsr.zzN(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 42:
                    zzgsr.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 43:
                    zzgsr.zzZ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 44:
                    zzgsr.zzM(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 45:
                    zzgsr.zzU(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 46:
                    zzgsr.zzV(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case 47:
                    zzgsr.zzW(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzgsr.zzX(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzgsr.zzQ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzgpuVar, zzC(i5));
                    break;
                case 50:
                    zzY(zzgpuVar, i8, unsafe.getObject(obj, j), i5);
                    break;
                case 51:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzf(i8, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzo(i8, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzt(i8, zzA(obj, j));
                    }
                    break;
                case 54:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzJ(i8, zzA(obj, j));
                    }
                    break;
                case 55:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzr(i8, zzq(obj, j));
                    }
                    break;
                case 56:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzm(i8, zzA(obj, j));
                    }
                    break;
                case 57:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzk(i8, zzq(obj, j));
                    }
                    break;
                case 58:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzb(i8, zzX(obj, j));
                    }
                    break;
                case 59:
                    if (zzW(obj, i8, i5)) {
                        zzZ(i8, unsafe.getObject(obj, j), zzgpuVar);
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzv(i8, unsafe.getObject(obj, j), zzC(i5));
                    }
                    break;
                case 61:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzd(i8, (zzgpe) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzH(i8, zzq(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzi(i8, zzq(obj, j));
                    }
                    break;
                case 64:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzw(i8, zzq(obj, j));
                    }
                    break;
                case 65:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzy(i8, zzA(obj, j));
                    }
                    break;
                case 66:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzA(i8, zzq(obj, j));
                    }
                    break;
                case 67:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzC(i8, zzA(obj, j));
                    }
                    break;
                case 68:
                    if (zzW(obj, i8, i5)) {
                        zzgpuVar.zzq(i8, unsafe.getObject(obj, j), zzC(i5));
                    }
                    break;
            }
            i5 += 3;
            i2 = 1048575;
        }
        zzgtg zzgtgVar2 = this.zzo;
        zzgtgVar2.zzr(zzgtgVar2.zzd(obj), zzgpuVar);
    }
}
