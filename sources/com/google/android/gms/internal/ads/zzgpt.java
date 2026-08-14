package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgpt extends zzgot {
    private static final Logger zza = Logger.getLogger(zzgpt.class.getName());
    private static final boolean zzb = zzgtq.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgpu zze;

    private zzgpt() {
    }

    /* synthetic */ zzgpt(zzgps zzgpsVar) {
    }

    static int zzA(zzgrw zzgrwVar, zzgsp zzgspVar) {
        int iZzat = ((zzgon) zzgrwVar).zzat(zzgspVar);
        return zzE(iZzat) + iZzat;
    }

    static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzgtv.zze(str);
        } catch (zzgtu unused) {
            length = str.getBytes(zzgqw.zzb).length;
        }
        return zzE(length) + length;
    }

    public static int zzD(int i) {
        return zzE(i << 3);
    }

    public static int zzE(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzF(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzgpt zzG(byte[] bArr) {
        return new zzgpp(bArr, 0, bArr.length);
    }

    public static zzgpt zzH(OutputStream outputStream, int i) {
        return new zzgpr(outputStream, i);
    }

    public static int zzw(zzgpe zzgpeVar) {
        int iZzd = zzgpeVar.zzd();
        return zzE(iZzd) + iZzd;
    }

    @Deprecated
    static int zzx(int i, zzgrw zzgrwVar, zzgsp zzgspVar) {
        int iZzat = ((zzgon) zzgrwVar).zzat(zzgspVar);
        int iZzE = zzE(i << 3);
        return iZzE + iZzE + iZzat;
    }

    public static int zzy(int i) {
        if (i >= 0) {
            return zzE(i);
        }
        return 10;
    }

    public static int zzz(zzgrc zzgrcVar) {
        int iZza = zzgrcVar.zza();
        return zzE(iZza) + iZza;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzJ(String str, zzgtu zzgtuVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgtuVar);
        byte[] bytes = str.getBytes(zzgqw.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgpq(e);
        }
    }

    public abstract void zzN() throws IOException;

    public abstract void zzO(byte b) throws IOException;

    public abstract void zzP(int i, boolean z) throws IOException;

    public abstract void zzQ(int i, zzgpe zzgpeVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgot
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    abstract void zzn(int i, zzgrw zzgrwVar, zzgsp zzgspVar) throws IOException;

    public abstract void zzo(int i, String str) throws IOException;

    public abstract void zzq(int i, int i2) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i, long j) throws IOException;

    public abstract void zzu(long j) throws IOException;
}
