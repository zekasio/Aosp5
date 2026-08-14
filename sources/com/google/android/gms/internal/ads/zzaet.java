package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaet {
    public byte[] zzM;
    public zzabc zzS;
    public boolean zzT;
    public zzabb zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaba zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    protected zzaet() {
    }

    private static Pair zzf(zzen zzenVar) throws zzbu {
        try {
            zzenVar.zzG(16);
            long jZzq = zzenVar.zzq();
            if (jZzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzq != 826496599) {
                zzee.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzc = zzenVar.zzc() + 20;
            byte[] bArrZzH = zzenVar.zzH();
            while (true) {
                int length = bArrZzH.length;
                if (iZzc >= length - 4) {
                    throw zzbu.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrZzH[iZzc] == 0 && bArrZzH[iZzc + 1] == 0 && bArrZzH[iZzc + 2] == 1 && bArrZzH[iZzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzH, iZzc, length)));
                }
                iZzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                i = bArr[i3] & 255;
                if (i != 255) {
                    break;
                }
                i3++;
                i4 += 255;
            }
            int i5 = i4 + i;
            int i6 = i3 + 1;
            int i7 = 0;
            while (true) {
                i2 = bArr[i6] & 255;
                if (i2 != 255) {
                    break;
                }
                i6++;
                i7 += 255;
            }
            int i8 = i6 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i8, bArr2, 0, i5);
            int i10 = i8 + i5;
            if (bArr[i10] != 3) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzen zzenVar) throws zzbu {
        try {
            int iZzi = zzenVar.zzi();
            if (iZzi == 1) {
                return true;
            }
            if (iZzi == 65534) {
                zzenVar.zzF(24);
                if (zzenVar.zzr() == zzaeu.zzf.getMostSignificantBits()) {
                    if (zzenVar.zzr() == zzaeu.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05a7  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.internal.ads.zzzx r20, int r21) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zze(com.google.android.gms.internal.ads.zzzx, int):void");
    }
}
