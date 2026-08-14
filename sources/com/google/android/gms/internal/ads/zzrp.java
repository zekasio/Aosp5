package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzrj {
        int i;
        int iMax = zzd;
        if (iMax == -1) {
            zzqx zzqxVarZzc = zzc("video/avc", false, false);
            if (zzqxVarZzc != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzqxVarZzc.zzh()) {
                    int i2 = codecProfileLevel.level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                }
                iMax = Math.max(iMax2, zzew.zza >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            zzd = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x02d5, blocks: (B:148:0x026a, B:150:0x027c, B:161:0x0298, B:177:0x02c5), top: B:484:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r19) {
        /*
            Method dump skipped, instruction units count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzb(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public static zzqx zzc(String str, boolean z, boolean z2) throws zzrj {
        List listZzf = zzf(str, false, false);
        if (listZzf.isEmpty()) {
            return null;
        }
        return (zzqx) listZzf.get(0);
    }

    public static zzqx zzd() throws zzrj {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzaf zzafVar) {
        Pair pairZzb;
        if ("audio/eac3-joc".equals(zzafVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzafVar.zzm) || (pairZzb = zzb(zzafVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzrj {
        int i;
        zzrh zzrhVar = new zzrh(str, z, z2);
        HashMap map = zzc;
        List list = (List) map.get(zzrhVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzrhVar, zzew.zza >= 21 ? new zzrn(z, z2) : new zzrm(null));
        if (z && arrayListZzh.isEmpty() && (i = zzew.zza) >= 21 && i <= 23) {
            arrayListZzh = zzh(zzrhVar, new zzrm(null));
            if (!arrayListZzh.isEmpty()) {
                zzee.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzqx) arrayListZzh.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (zzew.zza < 26 && zzew.zzb.equals("R9") && arrayListZzh.size() == 1 && ((zzqx) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzqx.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzi(arrayListZzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrf
                @Override // com.google.android.gms.internal.ads.zzro
                public final int zza(Object obj) {
                    int i2 = zzrp.zza;
                    String str2 = ((zzqx) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzew.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (zzew.zza < 21 && arrayListZzh.size() > 1) {
            String str2 = ((zzqx) arrayListZzh.get(0)).zza;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                zzi(arrayListZzh, new zzro() { // from class: com.google.android.gms.internal.ads.zzrg
                    @Override // com.google.android.gms.internal.ads.zzro
                    public final int zza(Object obj) {
                        int i2 = zzrp.zza;
                        return ((zzqx) obj).zza.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (zzew.zza < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqx) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzqx) arrayListZzh.remove(0));
        }
        zzfqk zzfqkVarZzm = zzfqk.zzm(arrayListZzh);
        map.put(zzrhVar, zzfqkVarZzm);
        return zzfqkVarZzm;
    }

    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzro() { // from class: com.google.android.gms.internal.ads.zzrd
            @Override // com.google.android.gms.internal.ads.zzro
            public final int zza(Object obj) {
                zzaf zzafVar2 = zzafVar;
                int i = zzrp.zza;
                return ((zzqx) obj).zzd(zzafVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0209 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020f A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0222 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0227 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c2 A[Catch: Exception -> 0x0310, TRY_ENTER, TryCatch #1 {Exception -> 0x0310, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0033, B:14:0x0041, B:16:0x0047, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:30:0x007d, B:33:0x0085, B:35:0x008d, B:37:0x0095, B:39:0x009d, B:41:0x00a7, B:43:0x00b1, B:45:0x00bb, B:47:0x00c5, B:49:0x00cf, B:51:0x00d9, B:53:0x00e3, B:55:0x00ed, B:58:0x00f5, B:60:0x00fd, B:62:0x0105, B:64:0x010f, B:66:0x0119, B:68:0x0121, B:70:0x012b, B:72:0x0135, B:74:0x0139, B:76:0x0141, B:78:0x0149, B:80:0x014f, B:82:0x0157, B:84:0x015f, B:86:0x0167, B:176:0x02ba, B:179:0x02c2, B:181:0x02c8, B:182:0x02e2, B:183:0x0303, B:89:0x0171, B:90:0x0176, B:92:0x017e, B:95:0x0189, B:97:0x0191, B:100:0x019c, B:102:0x01a4, B:105:0x01af, B:107:0x01b7, B:110:0x01c2, B:112:0x01ca), top: B:192:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzrh r23, com.google.android.gms.internal.ads.zzrk r24) throws com.google.android.gms.internal.ads.zzrj {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzh(com.google.android.gms.internal.ads.zzrh, com.google.android.gms.internal.ads.zzrk):java.util.ArrayList");
    }

    private static void zzi(List list, final zzro zzroVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzre
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzro zzroVar2 = zzroVar;
                int i = zzrp.zza;
                return zzroVar2.zza(obj2) - zzroVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzew.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbt.zzg(str)) {
            return true;
        }
        String strZza = zzfnb.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
