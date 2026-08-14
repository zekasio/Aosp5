package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzy {
    public static int zza(zzzv zzzvVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iZzb = zzzvVar.zzb(bArr, i + i3, i2 - i3);
            if (iZzb == -1) {
                break;
            }
            i3 += iZzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbu {
        if (!z) {
            throw zzbu.zza(str, null);
        }
    }

    public static boolean zzc(zzzv zzzvVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzzvVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzzv zzzvVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzzk) zzzvVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzzv zzzvVar, int i) throws IOException {
        try {
            ((zzzk) zzzvVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
