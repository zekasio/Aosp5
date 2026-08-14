package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaol {
    static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    static String zza(zzans zzansVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrZzg;
        byte[] bArrZzax = zzansVar.zzax();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcO)).booleanValue()) {
            Vector vectorZzb = zzb(bArrZzax, 255);
            if (vectorZzb == null || vectorZzb.size() == 0) {
                bArrZzg = zzg(zzf(4096).zzax(), str, true);
            } else {
                zzaoe zzaoeVarZza = zzaof.zza();
                int size = vectorZzb.size();
                for (int i = 0; i < size; i++) {
                    zzaoeVarZza.zza(zzgpe.zzv(zzg((byte[]) vectorZzb.get(i), str, false)));
                }
                zzaoeVarZza.zzb(zzgpe.zzv(zze(bArrZzax)));
                bArrZzg = ((zzaof) zzaoeVarZza.zzal()).zzax();
            }
        } else {
            if (zzaqz.zza == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrZza = zzaqz.zza.zza(bArrZzax, str != null ? str.getBytes() : new byte[0]);
            zzaoe zzaoeVarZza2 = zzaof.zza();
            zzaoeVarZza2.zza(zzgpe.zzv(bArrZza));
            zzaoeVarZza2.zzc(3);
            bArrZzg = ((zzaof) zzaoeVarZza2.zzal()).zzax();
        }
        return zzaoh.zza(bArrZzg, true);
    }

    static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzaok(null)).start();
            }
        }
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zzd) {
            zzd();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzc) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = zzc.digest();
        }
        return bArrDigest;
    }

    static zzans zzf(int i) {
        zzamv zzamvVarZza = zzans.zza();
        zzamvVarZza.zzD(4096L);
        return (zzans) zzamvVarZza.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzaom[] zzaomVarArr = new zzapl().zzcG;
        int length3 = zzaomVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzaomVarArr[i2].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgol(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
