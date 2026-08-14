package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzqx zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqx r11 = new com.google.android.gms.internal.ads.zzqx
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3f
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3f
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            r5 = 22
            if (r3 > r5) goto L3d
            java.lang.String r3 = "ODROID-XU3"
            java.lang.String r5 = com.google.android.gms.internal.ads.zzew.zzd
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L2c
            java.lang.String r3 = "Nexus 10"
            java.lang.String r5 = com.google.android.gms.internal.ads.zzew.zzd
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r8 = 1
            goto L40
        L3f:
            r8 = 0
        L40:
            r3 = 21
            if (r4 == 0) goto L52
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L52
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L52
            r9 = 1
            goto L53
        L52:
            r9 = 0
        L53:
            if (r20 != 0) goto L66
            if (r4 == 0) goto L64
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L64
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L64
            goto L66
        L64:
            r10 = 0
            goto L67
        L66:
            r10 = 1
        L67:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqx");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzew.zze(i, widthAlignment) * widthAlignment, zzew.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzee.zza("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzew.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointZzi = zzi(videoCapabilities, i, i2);
        int i3 = pointZzi.x;
        int i4 = pointZzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzaf zzafVar, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairZzb = zzrp.zzb(zzafVar);
        if (pairZzb == null) {
            return true;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        int iIntValue2 = ((Integer) pairZzb.second).intValue();
        int i = 8;
        if ("video/dolby-vision".equals(zzafVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.zzh && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = zzh();
        if (zzew.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
            if (codecProfileLevel2.profile == iIntValue && ((codecProfileLevel2.level >= iIntValue2 || !z) && (!"video/hevc".equals(this.zzb) || iIntValue != 2 || (!"sailfish".equals(zzew.zzb) && !"marlin".equals(zzew.zzb))))) {
                return true;
            }
        }
        zzj("codec.profileLevel, " + zzafVar.zzj + ", " + this.zzc);
        return false;
    }

    private final boolean zzm(zzaf zzafVar) {
        return this.zzb.equals(zzafVar.zzm) || this.zzb.equals(zzrp.zze(zzafVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzhc zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i = true != zzew.zzU(zzafVar.zzm, zzafVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i |= 512;
            }
            if (!zzew.zzU(zzafVar.zzy, zzafVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzew.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zze(zzafVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, true != zzafVar.zze(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair pairZzb = zzrp.zzb(zzafVar);
                Pair pairZzb2 = zzrp.zzb(zzafVar2);
                if (pairZzb != null && pairZzb2 != null) {
                    int iIntValue = ((Integer) pairZzb.first).intValue();
                    int iIntValue2 = ((Integer) pairZzb2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhc(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zze(zzafVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzhc(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzhc(this.zza, zzafVar, zzafVar2, 0, i);
    }

    public final boolean zzd(zzaf zzafVar) {
        return zzm(zzafVar) && zzl(zzafVar, false);
    }

    public final boolean zze(zzaf zzafVar) throws zzrj {
        if (!zzm(zzafVar) || !zzl(zzafVar, true)) {
            return false;
        }
        if (this.zzh) {
            if (zzafVar.zzr <= 0 || zzafVar.zzs <= 0) {
                return true;
            }
            if (zzew.zza >= 21) {
                return zzg(zzafVar.zzr, zzafVar.zzs, zzafVar.zzt);
            }
            boolean z = zzafVar.zzr * zzafVar.zzs <= zzrp.zza();
            if (!z) {
                zzj("legacyFrameSize, " + zzafVar.zzr + "x" + zzafVar.zzs);
            }
            return z;
        }
        if (zzew.zza >= 21) {
            int i = zzafVar.zzA;
            if (i != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i)) {
                    zzj("sampleRate.support, " + i);
                    return false;
                }
            }
            int i2 = zzafVar.zzz;
            if (i2 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzj("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((zzew.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            int i3 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                            zzee.zze("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i3 + "]");
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i2) {
                            zzj("channelCount.support, " + i2);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzaf zzafVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair pairZzb = zzrp.zzb(zzafVar);
        return pairZzb != null && ((Integer) pairZzb.first).intValue() == 42;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzew.zza >= 29) {
            int iZza = zzqw.zza(videoCapabilities, i, i2, d);
            if (iZza == 2) {
                return true;
            }
            if (iZza == 1) {
                zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzew.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            zzee.zza("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzew.zze + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqx(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbt.zzh(str2);
    }
}
