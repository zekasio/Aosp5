package com.applovin.exoplayer2.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f407a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    public static i a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new i(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !a(codecCapabilities) || c(str)) ? false : true, codecCapabilities != null && c(codecCapabilities), z5 || (codecCapabilities != null && e(codecCapabilities)));
    }

    i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f407a = (String) com.applovin.exoplayer2.l.a.b(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = u.b(str2);
    }

    public String toString() {
        return this.f407a;
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.d.profileLevels;
    }

    public boolean a(v vVar) throws l.b {
        if (!b(vVar)) {
            return false;
        }
        if (this.k) {
            if (vVar.q <= 0 || vVar.r <= 0) {
                return true;
            }
            if (ai.f611a >= 21) {
                return a(vVar.q, vVar.r, vVar.s);
            }
            boolean z = vVar.q * vVar.r <= l.b();
            if (!z) {
                a("legacyFrameSize, " + vVar.q + "x" + vVar.r);
            }
            return z;
        }
        if (ai.f611a >= 21) {
            if (vVar.z != -1 && !a(vVar.z)) {
                return false;
            }
            if (vVar.y != -1 && !b(vVar.y)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(v vVar) {
        String strD;
        if (vVar.i == null || this.b == null || (strD = u.d(vVar.i)) == null) {
            return true;
        }
        if (!this.b.equals(strD)) {
            a("codec.mime " + vVar.i + ", " + strD);
            return false;
        }
        Pair<Integer, Integer> pairA = l.a(vVar);
        if (pairA == null) {
            return true;
        }
        int iIntValue = ((Integer) pairA.first).intValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        if (!this.k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = a();
        if (ai.f611a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArrA.length == 0) {
            codecProfileLevelArrA = g(this.d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrA) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        a("codec.profileLevel, " + vVar.i + ", " + strD);
        return false;
    }

    public boolean b() {
        if (ai.f611a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean c(v vVar) {
        if (this.k) {
            return this.e;
        }
        Pair<Integer, Integer> pairA = l.a(vVar);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    public com.applovin.exoplayer2.c.h a(v vVar, v vVar2) {
        int i = !ai.a((Object) vVar.l, (Object) vVar2.l) ? 8 : 0;
        if (this.k) {
            if (vVar.t != vVar2.t) {
                i |= 1024;
            }
            if (!this.e && (vVar.q != vVar2.q || vVar.r != vVar2.r)) {
                i |= 512;
            }
            if (!ai.a(vVar.x, vVar2.x)) {
                i |= 2048;
            }
            if (d(this.f407a) && !vVar.a(vVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.applovin.exoplayer2.c.h(this.f407a, vVar, vVar2, vVar.a(vVar2) ? 3 : 2, 0);
            }
        } else {
            if (vVar.y != vVar2.y) {
                i |= 4096;
            }
            if (vVar.z != vVar2.z) {
                i |= 8192;
            }
            if (vVar.A != vVar2.A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> pairA = l.a(vVar);
                Pair<Integer, Integer> pairA2 = l.a(vVar2);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.applovin.exoplayer2.c.h(this.f407a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.a(vVar2)) {
                i |= 32;
            }
            if (e(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.applovin.exoplayer2.c.h(this.f407a, vVar, vVar2, 1, 0);
            }
        }
        return new com.applovin.exoplayer2.c.h(this.f407a, vVar, vVar2, 0, i);
    }

    public boolean a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || !f(this.f407a) || !a(videoCapabilities, i2, i, d)) {
            a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        b("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
        return true;
    }

    public Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i, i2);
    }

    public boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        a("sampleRate.support, " + i);
        return false;
    }

    public boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("channelCount.aCaps");
            return false;
        }
        if (a(this.f407a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        a("channelCount.support, " + i);
        return false;
    }

    private void a(String str) {
        q.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f407a + ", " + this.b + "] [" + ai.e + "]");
    }

    private void b(String str) {
        q.a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f407a + ", " + this.b + "] [" + ai.e + "]");
    }

    private static int a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((ai.f611a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        q.c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f611a >= 19 && b(codecCapabilities);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f611a >= 21 && d(codecCapabilities);
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f611a >= 21 && f(codecCapabilities);
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ai.a(i, widthAlignment) * widthAlignment, ai.a(i2, heightAlignment) * heightAlignment);
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean c(String str) {
        return ai.f611a <= 22 && ("ODROID-XU3".equals(ai.d) || "Nexus 10".equals(ai.d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    private static boolean d(String str) {
        return ai.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        return "audio/opus".equals(str);
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(ai.b)) ? false : true;
    }
}
