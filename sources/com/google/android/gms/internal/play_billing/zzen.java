package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import cz.msebera.android.httpclient.impl.client.cache.CacheConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@6.2.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzen<T> implements zzev<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzek zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdy zzl;
    private final zzfm zzm;
    private final zzcq zzn;
    private final zzep zzo;
    private final zzef zzp;

    private zzen(int[] iArr, Object[] objArr, int i, int i2, zzek zzekVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzep zzepVar, zzdy zzdyVar, zzfm zzfmVar, zzcq zzcqVar, zzef zzefVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzcqVar != null && zzcqVar.zzc(zzekVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzepVar;
        this.zzl = zzdyVar;
        this.zzm = zzfmVar;
        this.zzn = zzcqVar;
        this.zzg = zzekVar;
        this.zzp = zzefVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzevVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzevVarZzv.zze();
                    zzevVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzevVarZzv.zze();
                zzevVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzevVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzevVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzevVarZzv.zze();
                    zzevVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzevVarZzv.zze();
                zzevVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzevVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzfw.zzq(obj, j, (1 << (iZzp >>> 20)) | zzfw.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfw.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzfw.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfw.zzb(obj, j2)) != 0;
            case 2:
                return zzfw.zzd(obj, j2) != 0;
            case 3:
                return zzfw.zzd(obj, j2) != 0;
            case 4:
                return zzfw.zzc(obj, j2) != 0;
            case 5:
                return zzfw.zzd(obj, j2) != 0;
            case 6:
                return zzfw.zzc(obj, j2) != 0;
            case 7:
                return zzfw.zzw(obj, j2);
            case 8:
                Object objZzf = zzfw.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzcc) {
                    return !zzcc.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfw.zzf(obj, j2) != null;
            case 10:
                return !zzcc.zzb.equals(zzfw.zzf(obj, j2));
            case 11:
                return zzfw.zzc(obj, j2) != 0;
            case 12:
                return zzfw.zzc(obj, j2) != 0;
            case 13:
                return zzfw.zzc(obj, j2) != 0;
            case 14:
                return zzfw.zzd(obj, j2) != 0;
            case 15:
                return zzfw.zzc(obj, j2) != 0;
            case 16:
                return zzfw.zzd(obj, j2) != 0;
            case 17:
                return zzfw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzev zzevVar) {
        return zzevVar.zzk(zzfw.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzdd) {
            return ((zzdd) obj).zzx();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfw.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfw.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzge zzgeVar) throws IOException {
        if (obj instanceof String) {
            zzgeVar.zzF(i, (String) obj);
        } else {
            zzgeVar.zzd(i, (zzcc) obj);
        }
    }

    static zzfn zzd(Object obj) {
        zzdd zzddVar = (zzdd) obj;
        zzfn zzfnVar = zzddVar.zzc;
        if (zzfnVar != zzfn.zzc()) {
            return zzfnVar;
        }
        zzfn zzfnVarZzf = zzfn.zzf();
        zzddVar.zzc = zzfnVarZzf;
        return zzfnVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.play_billing.zzen zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzeh r34, com.google.android.gms.internal.play_billing.zzep r35, com.google.android.gms.internal.play_billing.zzdy r36, com.google.android.gms.internal.play_billing.zzfm r37, com.google.android.gms.internal.play_billing.zzcq r38, com.google.android.gms.internal.play_billing.zzef r39) {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzeh, com.google.android.gms.internal.play_billing.zzep, com.google.android.gms.internal.play_billing.zzdy, com.google.android.gms.internal.play_billing.zzfm, com.google.android.gms.internal.play_billing.zzcq, com.google.android.gms.internal.play_billing.zzef):com.google.android.gms.internal.play_billing.zzen");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfw.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfw.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfw.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfw.zzf(obj, j)).longValue();
    }

    private final zzdh zzu(int i) {
        int i2 = i / 3;
        return (zzdh) this.zzd[i2 + i2 + 1];
    }

    private final zzev zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzev zzevVar = (zzev) objArr[i3];
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzevVarZzb = zzes.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzevVarZzb;
        return zzevVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzev zzevVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzevVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzevVarZzv.zze();
        if (object != null) {
            zzevVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzev zzevVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzevVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzevVarZzv.zze();
        if (object != null) {
            zzevVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:207:0x0554  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfw.zza(obj, j));
                    byte[] bArr = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfw.zzb(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr2 = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr3 = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr4 = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzdl.zza(zzfw.zzw(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzfw.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr5 = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr6 = zzdl.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzfw.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
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
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzdl.zza(zzN(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzdl.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i4 * 53) + this.zzm.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:562:0x0ce0, code lost:
    
        if (r6 == 1048575) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0ce2, code lost:
    
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0ce6, code lost:
    
        r3 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0cea, code lost:
    
        if (r3 >= r0.zzk) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0cec, code lost:
    
        r5 = r0.zzi;
        r6 = r0.zzc;
        r5 = r5[r3];
        r6 = r6[r5];
        r6 = com.google.android.gms.internal.play_billing.zzfw.zzf(r7, r0.zzs(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0cfe, code lost:
    
        if (r6 != null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d05, code lost:
    
        if (r0.zzu(r5) != null) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d07, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d0a, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzee) r6;
        r1 = (com.google.android.gms.internal.play_billing.zzed) r0.zzw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d12, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d13, code lost:
    
        if (r8 != 0) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d17, code lost:
    
        if (r1 != r37) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d1e, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d21, code lost:
    
        if (r1 > r37) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d23, code lost:
    
        if (r4 != r8) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0d25, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0d2b, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09aa A[PHI: r0 r7 r8 r9 r10 r11 r13
      0x09aa: PHI (r0v34 com.google.android.gms.internal.play_billing.zzen<T>) = 
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v9 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v33 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
     binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r7v29 int) = (r7v6 int), (r7v7 int), (r7v8 int), (r7v13 int), (r7v18 int), (r7v24 int), (r7v33 int) binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r8v75 int) = (r8v49 int), (r8v50 int), (r8v51 int), (r8v55 int), (r8v61 int), (r8v73 int), (r8v78 int) binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r9v59 int) = (r9v30 int), (r9v31 int), (r9v32 int), (r9v37 int), (r9v44 int), (r9v54 int), (r9v61 int) binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r10v72 int) = (r10v34 int), (r10v35 int), (r10v36 int), (r10v50 int), (r10v63 int), (r10v70 int), (r10v75 int) binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r11v36 sun.misc.Unsafe) = 
      (r11v10 sun.misc.Unsafe)
      (r11v11 sun.misc.Unsafe)
      (r11v12 sun.misc.Unsafe)
      (r11v14 sun.misc.Unsafe)
      (r11v22 sun.misc.Unsafe)
      (r11v31 sun.misc.Unsafe)
      (r11v38 sun.misc.Unsafe)
     binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x09aa: PHI (r13v55 com.google.android.gms.internal.play_billing.zzbp) = 
      (r13v37 com.google.android.gms.internal.play_billing.zzbp)
      (r13v38 com.google.android.gms.internal.play_billing.zzbp)
      (r13v39 com.google.android.gms.internal.play_billing.zzbp)
      (r13v44 com.google.android.gms.internal.play_billing.zzbp)
      (r13v50 com.google.android.gms.internal.play_billing.zzbp)
      (r13v53 com.google.android.gms.internal.play_billing.zzbp)
      (r13v57 com.google.android.gms.internal.play_billing.zzbp)
     binds: [B:440:0x0963, B:424:0x090b, B:408:0x08ba, B:333:0x0765, B:284:0x06a6, B:249:0x05f3, B:181:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0c5c A[PHI: r1 r4 r5 r6 r9 r20
      0x0c5c: PHI (r1v186 int) = 
      (r1v162 int)
      (r1v163 int)
      (r1v164 int)
      (r1v165 int)
      (r1v166 int)
      (r1v167 int)
      (r1v170 int)
      (r1v179 int)
      (r1v187 int)
     binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]
      0x0c5c: PHI (r4v84 int) = (r4v55 int), (r4v56 int), (r4v57 int), (r4v58 int), (r4v59 int), (r4v60 int), (r4v63 int), (r4v76 int), (r4v85 int) binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]
      0x0c5c: PHI (r5v118 com.google.android.gms.internal.play_billing.zzbp) = 
      (r5v102 com.google.android.gms.internal.play_billing.zzbp)
      (r5v103 com.google.android.gms.internal.play_billing.zzbp)
      (r5v104 com.google.android.gms.internal.play_billing.zzbp)
      (r5v105 com.google.android.gms.internal.play_billing.zzbp)
      (r5v106 com.google.android.gms.internal.play_billing.zzbp)
      (r5v107 com.google.android.gms.internal.play_billing.zzbp)
      (r5v110 com.google.android.gms.internal.play_billing.zzbp)
      (r5v114 com.google.android.gms.internal.play_billing.zzbp)
      (r5v119 com.google.android.gms.internal.play_billing.zzbp)
     binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]
      0x0c5c: PHI (r6v94 byte[]) = 
      (r6v74 byte[])
      (r6v75 byte[])
      (r6v76 byte[])
      (r6v77 byte[])
      (r6v78 byte[])
      (r6v79 byte[])
      (r6v82 byte[])
      (r6v87 byte[])
      (r6v95 byte[])
     binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]
      0x0c5c: PHI (r9v90 int) = (r9v64 int), (r9v65 int), (r9v66 int), (r9v67 int), (r9v68 int), (r9v69 int), (r9v72 int), (r9v82 int), (r9v91 int) binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]
      0x0c5c: PHI (r20v31 int) = 
      (r20v11 int)
      (r20v12 int)
      (r20v13 int)
      (r20v14 int)
      (r20v15 int)
      (r20v16 int)
      (r20v19 int)
      (r20v25 int)
      (r20v32 int)
     binds: [B:540:0x0c45, B:537:0x0c24, B:533:0x0c03, B:530:0x0be6, B:527:0x0bc9, B:524:0x0bab, B:522:0x0b9e, B:500:0x0b30, B:467:0x0a1b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0c75 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzbp r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbp):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final Object zze() {
        return ((zzdd) this.zzg).zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfw.zzo(obj, j, zzfw.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzfw.zzp(obj, j, zzfw.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzfw.zzm(obj, j, zzfw.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzex.zza;
                    zzfw.zzs(obj, j, zzef.zza(zzfw.zzf(obj, j), zzfw.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzex.zzp(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzi(Object obj, zzge zzgeVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int iZzs = zzs(i7);
            int[] iArr2 = this.zzc;
            int iZzr = zzr(iZzs);
            int i8 = iArr2[i7];
            if (iZzr <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iZzs & i4;
            switch (iZzr) {
                case 0:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzf(i8, zzfw.zza(obj, j));
                    }
                    break;
                case 1:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzo(i8, zzfw.zzb(obj, j));
                    }
                    break;
                case 2:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzJ(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzb(i8, zzfw.zzw(obj, j));
                    }
                    break;
                case 8:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                    }
                    break;
                case 9:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
                case 10:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzH(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzw(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzy(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzA(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzC(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
                case 18:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 19:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 20:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 21:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 22:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 23:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 24:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 25:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzex.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgeVar.zzG(i11, list);
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzev zzevVarZzv = zzv(i7);
                    int i14 = zzex.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzcl) zzgeVar).zzv(i13, list2.get(i15), zzevVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzex.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgeVar.zze(i16, list3);
                    }
                    break;
                case 29:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 30:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 31:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 32:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 33:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 34:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 35:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 36:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 37:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 38:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 39:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 40:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 41:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 42:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 43:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 44:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 45:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 46:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 47:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzev zzevVarZzv2 = zzv(i7);
                    int i19 = zzex.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzcl) zzgeVar).zzq(i18, list4.get(i20), zzevVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzf(i8, zzm(obj, j));
                    }
                    break;
                case 52:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzo(i8, zzn(obj, j));
                    }
                    break;
                case 53:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzt(i8, zzt(obj, j));
                    }
                    break;
                case 54:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzJ(i8, zzt(obj, j));
                    }
                    break;
                case 55:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzr(i8, zzo(obj, j));
                    }
                    break;
                case 56:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzm(i8, zzt(obj, j));
                    }
                    break;
                case 57:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzk(i8, zzo(obj, j));
                    }
                    break;
                case 58:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzb(i8, zzN(obj, j));
                    }
                    break;
                case 59:
                    if (zzM(obj, i8, i7)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                    }
                    break;
                case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
                case 61:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzH(i8, zzo(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzi(i8, zzo(obj, j));
                    }
                    break;
                case 64:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzw(i8, zzo(obj, j));
                    }
                    break;
                case 65:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzy(i8, zzt(obj, j));
                    }
                    break;
                case 66:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzA(i8, zzo(obj, j));
                    }
                    break;
                case 67:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzC(i8, zzt(obj, j));
                    }
                    break;
                case 68:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzfm zzfmVar = this.zzm;
        zzfmVar.zzi(zzfmVar.zzd(obj), zzgeVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfw.zza(obj, j)) != Double.doubleToLongBits(zzfw.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfw.zzb(obj, j)) != Float.floatToIntBits(zzfw.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfw.zzw(obj, j) != zzfw.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
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
                    zZzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzfw.zzc(obj, jZzp) != zzfw.zzc(obj2, jZzp) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzk(java.lang.Object):boolean");
    }
}
