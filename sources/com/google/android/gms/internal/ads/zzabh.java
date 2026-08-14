package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzbq zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrZzai = zzew.zzai(str, "=");
            if (strArrZzai.length != 2) {
                zzee.zze("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrZzai[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacu.zzb(new zzen(Base64.decode(strArrZzai[1], 0))));
                } catch (RuntimeException e) {
                    zzee.zzf("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaek(strArrZzai[0], strArrZzai[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    public static zzabe zzc(zzen zzenVar, boolean z, boolean z2) throws zzbu {
        if (z) {
            zzd(3, zzenVar, false);
        }
        String strZzx = zzenVar.zzx((int) zzenVar.zzq(), zzfnh.zzc);
        int length = strZzx.length();
        long jZzq = zzenVar.zzq();
        String[] strArr = new String[(int) jZzq];
        int length2 = length + 15;
        for (int i = 0; i < jZzq; i++) {
            String strZzx2 = zzenVar.zzx((int) zzenVar.zzq(), zzfnh.zzc);
            strArr[i] = strZzx2;
            length2 = length2 + 4 + strZzx2.length();
        }
        if (z2 && (zzenVar.zzk() & 1) == 0) {
            throw zzbu.zza("framing bit expected to be set", null);
        }
        return new zzabe(strZzx, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzen zzenVar, boolean z) throws zzbu {
        if (zzenVar.zza() < 7) {
            if (z) {
                return false;
            }
            throw zzbu.zza("too short header: " + zzenVar.zza(), null);
        }
        if (zzenVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbu.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzenVar.zzk() == 118 && zzenVar.zzk() == 111 && zzenVar.zzk() == 114 && zzenVar.zzk() == 98 && zzenVar.zzk() == 105 && zzenVar.zzk() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzbu.zza("expected characters 'vorbis'", null);
    }
}
