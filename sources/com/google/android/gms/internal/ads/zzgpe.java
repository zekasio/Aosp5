package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgpe implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgpe zzb = new zzgpa(zzgqw.zzd);
    private static final zzgpd zzd;
    private int zzc = 0;

    static {
        int i = zzgop.zza;
        zzd = new zzgpd(null);
        zza = new zzgov();
    }

    zzgpe() {
    }

    static void zzB(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static zzgpb zzt() {
        return new zzgpb(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgpe zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgpe zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgpe zzw(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgpa(bArr2);
    }

    public static zzgpe zzx(String str) {
        return new zzgpa(str.getBytes(zzgqw.zzb));
    }

    public static zzgpe zzy(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            zzgpe zzgpeVarZzw = i == 0 ? null : zzw(bArr, 0, i);
            if (zzgpeVarZzw == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzgpeVarZzw);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    static zzgpe zzz(byte[] bArr) {
        return new zzgpa(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zzc;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zzc = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzgte.zza(this) : zzgte.zza(zzk(0, 47)).concat("..."));
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgqw.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    protected abstract int zzj(int i, int i2, int i3);

    public abstract zzgpe zzk(int i, int i2);

    public abstract zzgpm zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    abstract void zzo(zzgot zzgotVar) throws IOException;

    public abstract boolean zzp();

    protected final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgoy iterator() {
        return new zzgou(this);
    }

    private static zzgpe zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzgpe) it.next();
        }
        int i2 = i >>> 1;
        zzgpe zzgpeVarZzc = zzc(it, i2);
        zzgpe zzgpeVarZzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzgpeVarZzc.zzd() >= zzgpeVarZzc2.zzd()) {
            return zzgso.zzG(zzgpeVarZzc, zzgpeVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzgpeVarZzc.zzd() + "+" + zzgpeVarZzc2.zzd());
    }

    static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }
}
