package com.applovin.exoplayer2.f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.tapjoy.TapjoyAuctionFlags;
import cz.msebera.android.httpclient.impl.client.cache.CacheConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f411a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<i>> b = new HashMap<>();
    private static int c = -1;

    private interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int getScore(T t);
    }

    private static int a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int b(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int c(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int e(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /* 60 */:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public static i a() throws b {
        return a("audio/raw", false, false);
    }

    public static i a(String str, boolean z, boolean z2) throws b {
        List<i> listB = b(str, z, z2);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    public static synchronized List<i> b(String str, boolean z, boolean z2) throws b {
        c dVar;
        a aVar = new a(str, z, z2);
        HashMap<a, List<i>> map = b;
        List<i> list = map.get(aVar);
        if (list != null) {
            return list;
        }
        if (ai.f611a >= 21) {
            dVar = new e(z, z2);
        } else {
            dVar = new d();
        }
        ArrayList<i> arrayListA = a(aVar, dVar);
        if (z && arrayListA.isEmpty() && 21 <= ai.f611a && ai.f611a <= 23) {
            arrayListA = a(aVar, new d());
            if (!arrayListA.isEmpty()) {
                q.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f407a);
            }
        }
        a(str, arrayListA);
        List<i> listUnmodifiableList = Collections.unmodifiableList(arrayListA);
        map.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static List<i> a(List<i> list, final v vVar) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new f() { // from class: com.applovin.exoplayer2.f.l$$ExternalSyntheticLambda5
            @Override // com.applovin.exoplayer2.f.l.f
            public final int getScore(Object obj) {
                return l.a(vVar, (i) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, i iVar) {
        try {
            return iVar.a(vVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    public static int b() throws b {
        if (c == -1) {
            int iMax = 0;
            i iVarA = a("video/avc", false, false);
            if (iVarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = iVarA.a();
                int length = codecProfileLevelArrA.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(a(codecProfileLevelArrA[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ai.f611a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(com.applovin.exoplayer2.v r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.v):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[Catch: Exception -> 0x0154, TRY_ENTER, TryCatch #4 {Exception -> 0x0154, blocks: (B:3:0x0008, B:5:0x001b, B:63:0x0125, B:8:0x002d, B:11:0x0038, B:57:0x00fe, B:60:0x0106, B:62:0x010c, B:64:0x012f, B:65:0x0152), top: B:79:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.l.a r24, com.applovin.exoplayer2.f.l.c r25) throws com.applovin.exoplayer2.f.l.b {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.f.l$a, com.applovin.exoplayer2.f.l$c):java.util.ArrayList");
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (ai.f611a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (ai.f611a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(ai.b) || ("Xiaomi".equals(ai.c) && ai.b.startsWith("HM")))) {
            return false;
        }
        if (ai.f611a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(ai.b) || "protou".equals(ai.b) || "ville".equals(ai.b) || "villeplus".equals(ai.b) || "villec2".equals(ai.b) || ai.b.startsWith("gee") || "C6602".equals(ai.b) || "C6603".equals(ai.b) || "C6606".equals(ai.b) || "C6616".equals(ai.b) || "L36h".equals(ai.b) || "SO-02E".equals(ai.b))) {
            return false;
        }
        if (ai.f611a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(ai.b) || "C1505".equals(ai.b) || "C1604".equals(ai.b) || "C1605".equals(ai.b))) {
            return false;
        }
        if (ai.f611a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(ai.c) && (ai.b.startsWith("zeroflte") || ai.b.startsWith("zerolte") || ai.b.startsWith("zenlte") || "SC-05G".equals(ai.b) || "marinelteatt".equals(ai.b) || "404SC".equals(ai.b) || "SC-04G".equals(ai.b) || "SCV31".equals(ai.b)))) {
            return false;
        }
        if (ai.f611a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(ai.c) && (ai.b.startsWith("d2") || ai.b.startsWith("serrano") || ai.b.startsWith("jflte") || ai.b.startsWith("santos") || ai.b.startsWith("t0"))) {
            return false;
        }
        if (ai.f611a <= 19 && ai.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(String str, List<i> list) {
        if ("audio/raw".equals(str)) {
            if (ai.f611a < 26 && ai.b.equals("R9") && list.size() == 1 && list.get(0).f407a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            a(list, new f() { // from class: com.applovin.exoplayer2.f.l$$ExternalSyntheticLambda6
                @Override // com.applovin.exoplayer2.f.l.f
                public final int getScore(Object obj) {
                    return l.b((i) obj);
                }
            });
        }
        if (ai.f611a < 21 && list.size() > 1) {
            String str2 = list.get(0).f407a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new f() { // from class: com.applovin.exoplayer2.f.l$$ExternalSyntheticLambda7
                    @Override // com.applovin.exoplayer2.f.l.f
                    public final int getScore(Object obj) {
                        return l.a((i) obj);
                    }
                });
            }
        }
        if (ai.f611a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f407a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(i iVar) {
        String str = iVar.f407a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ai.f611a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(i iVar) {
        return iVar.f407a.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return ai.f611a >= 29 && b(mediaCodecInfo);
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (ai.f611a >= 29) {
            return d(mediaCodecInfo);
        }
        return !e(mediaCodecInfo);
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (ai.f611a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (ai.f611a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        if (strArr.length < 3) {
            q.c("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f411a.matcher(strArr[1]);
        if (!matcher.matches()) {
            q.c("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numB = b(strGroup);
        if (numB == null) {
            q.c("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numC = c(str2);
        if (numC == null) {
            q.c("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair<>(numB, numC);
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        if (strArr.length < 4) {
            q.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f411a.matcher(strArr[1]);
        if (!matcher.matches()) {
            q.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(strGroup)) {
            if (!TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE.equals(strGroup)) {
                q.c("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = 2;
        }
        String str2 = strArr[3];
        Integer numA = a(str2);
        if (numA == null) {
            q.c("MediaCodecUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair<>(Integer.valueOf(i), numA);
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            } else {
                q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int iB = b(i2);
            if (iB == -1) {
                q.c("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iC = c(i);
            if (iC == -1) {
                q.c("MediaCodecUtil", "Unknown AVC level: " + i);
                return null;
            }
            return new Pair<>(Integer.valueOf(iB), Integer.valueOf(iC));
        } catch (NumberFormatException unused) {
            q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        if (strArr.length < 3) {
            q.c("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iD = d(i);
            if (iD == -1) {
                q.c("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iE = e(i2);
            if (iE == -1) {
                q.c("MediaCodecUtil", "Unknown VP9 level: " + i2);
                return null;
            }
            return new Pair<>(Integer.valueOf(iD), Integer.valueOf(iE));
        } catch (NumberFormatException unused) {
            q.c("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr, com.applovin.exoplayer2.m.b bVar) {
        if (strArr.length < 4) {
            q.c("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i = 1;
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                q.c("MediaCodecUtil", "Unknown AV1 profile: " + i2);
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                q.c("MediaCodecUtil", "Unknown AV1 bit depth: " + i4);
                return null;
            }
            if (i4 != 8) {
                i = (bVar == null || !(bVar.d != null || bVar.c == 7 || bVar.c == 6)) ? 2 : 4096;
            }
            int iF = f(i3);
            if (iF == -1) {
                q.c("MediaCodecUtil", "Unknown AV1 level: " + i3);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(iF));
        } catch (NumberFormatException unused) {
            q.c("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> e(String str, String[] strArr) {
        int iG;
        if (strArr.length != 3) {
            q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(u.a(Integer.parseInt(strArr[1], 16))) && (iG = g(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iG), 0);
            }
        } catch (NumberFormatException unused) {
            q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    private static <T> void a(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.exoplayer2.f.l$$ExternalSyntheticLambda4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.a(fVar, obj, obj2);
            }
        });
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f413a;
        private MediaCodecInfo[] b;

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return true;
        }

        public e(boolean z, boolean z2) {
            this.f413a = (z || z2) ? 1 : 0;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            c();
            return this.b.length;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f413a).getCodecInfos();
            }
        }
    }

    private static final class d implements c {
        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return false;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        private d() {
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f412a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.f412a = str;
            this.b = z;
            this.c = z2;
        }

        public int hashCode() {
            return ((((this.f412a.hashCode() + 31) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f412a, aVar.f412a) && this.b == aVar.b && this.c == aVar.c;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b2 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b2 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b2 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b2 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b2 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b2 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b2 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b2 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b2 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b2 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b2 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b2 = Ascii.VT;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b2 = Ascii.FF;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b2 = Ascii.CR;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b2 = Ascii.SO;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b2 = Ascii.SI;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b2 = Ascii.DLE;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b2 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b2 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b2 = Ascii.EM;
                }
                break;
        }
        switch (b2) {
        }
        return null;
    }

    private static Integer b(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer c(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b2 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b2 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b2 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b2 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b2 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b2 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b2 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b2 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b2 = 8;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b2 = 9;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b2 = 10;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b2 = Ascii.VT;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b2 = Ascii.FF;
                }
                break;
        }
        switch (b2) {
        }
        return null;
    }
}
