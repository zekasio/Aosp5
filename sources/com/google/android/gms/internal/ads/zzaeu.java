package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaeu implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzaeq
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzaeu.zza;
            return new zzzu[]{new zzaeu(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzew.zzab("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzg;
    private long zzA;
    private zzaet zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzef zzJ;
    private zzef zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzzx zzai;
    private final zzaep zzh;
    private final zzaew zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    public zzaeu() {
        this(0);
    }

    protected static final int zzn(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected static final boolean zzo(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzzv zzzvVar, zzaet zzaetVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zzb, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zzd, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzaetVar.zzb)) {
            zzx(zzzvVar, zze, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        }
        zzabb zzabbVar = zzaetVar.zzV;
        if (!this.zzac) {
            if (zzaetVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, 1, false);
                    this.zzZ++;
                    if ((this.zzn.zzH()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw zzbu.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzH()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        ((zzzk) zzzvVar).zzn(this.zzs.zzH(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzH()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzF(0);
                        zzabbVar.zzr(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzF(0);
                        zzabbVar.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, 1, false);
                            this.zzZ++;
                            this.zzn.zzF(0);
                            this.zzaf = this.zzn.zzk();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzC(i7);
                        ((zzzk) zzzvVar).zzn(this.zzn.zzH(), 0, i7, false);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzn = this.zzn.zzn();
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) (iZzn - i11));
                            } else {
                                this.zzv.putInt(iZzn - i11);
                            }
                            i10++;
                            i11 = iZzn;
                        }
                        int i12 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i12);
                        } else {
                            this.zzv.putShort((short) i12);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzD(this.zzv.array(), i9);
                        zzabbVar.zzr(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzaetVar.zzh;
                if (bArr != null) {
                    this.zzq.zzD(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaetVar.zzb) ? zzaetVar.zzf > 0 : z) {
                this.zzV |= DriveFile.MODE_READ_ONLY;
                this.zzu.zzC(0);
                int iZzd = (this.zzq.zzd() + i) - this.zzZ;
                this.zzn.zzC(4);
                this.zzn.zzH()[0] = (byte) ((iZzd >> 24) & 255);
                this.zzn.zzH()[1] = (byte) ((iZzd >> 16) & 255);
                this.zzn.zzH()[2] = (byte) ((iZzd >> 8) & 255);
                this.zzn.zzH()[3] = (byte) (iZzd & 255);
                zzabbVar.zzr(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int iZzd2 = i + this.zzq.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzaetVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaetVar.zzb)) {
            if (zzaetVar.zzS != null) {
                zzdl.zzf(this.zzq.zzd() == 0);
                zzaetVar.zzS.zzd(zzzvVar);
            }
            while (true) {
                int i13 = this.zzZ;
                if (i13 >= iZzd2) {
                    break;
                }
                int iZzq = zzq(zzzvVar, zzabbVar, iZzd2 - i13);
                this.zzZ += iZzq;
                this.zzaa += iZzq;
            }
        } else {
            byte[] bArrZzH = this.zzm.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i14 = zzaetVar.zzW;
            int i15 = 4 - i14;
            while (this.zzZ < iZzd2) {
                int i16 = this.zzab;
                if (i16 == 0) {
                    int iMin = Math.min(i14, this.zzq.zza());
                    ((zzzk) zzzvVar).zzn(bArrZzH, i15 + iMin, i14 - iMin, false);
                    if (iMin > 0) {
                        this.zzq.zzB(bArrZzH, i15, iMin);
                    }
                    this.zzZ += i14;
                    this.zzm.zzF(0);
                    this.zzab = this.zzm.zzn();
                    this.zzl.zzF(0);
                    zzaaz.zzb(zzabbVar, this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int iZzq2 = zzq(zzzvVar, zzabbVar, i16);
                    this.zzZ += iZzq2;
                    this.zzaa += iZzq2;
                    this.zzab -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaetVar.zzb)) {
            this.zzo.zzF(0);
            zzaaz.zzb(zzabbVar, this.zzo, 4);
            this.zzaa += 4;
        }
        int i17 = this.zzaa;
        zzw();
        return i17;
    }

    private final int zzq(zzzv zzzvVar, zzabb zzabbVar, int i) throws IOException {
        int iZza = this.zzq.zza();
        if (iZza <= 0) {
            return zzaaz.zza(zzabbVar, zzzvVar, i, false);
        }
        int iMin = Math.min(i, iZza);
        zzaaz.zzb(zzabbVar, this.zzq, iMin);
        return iMin;
    }

    private final long zzr(long j) throws zzbu {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzew.zzw(j, j2, 1000L);
        }
        throw zzbu.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzbu {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbu.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzbu {
        if (this.zzB != null) {
            return;
        }
        throw zzbu.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu(com.google.android.gms.internal.ads.zzaet r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzu(com.google.android.gms.internal.ads.zzaet, long, int, int, int):void");
    }

    private final void zzv(zzzv zzzvVar, int i) throws IOException {
        if (this.zzn.zzd() >= i) {
            return;
        }
        if (this.zzn.zzb() < i) {
            zzen zzenVar = this.zzn;
            int iZzb = zzenVar.zzb();
            zzenVar.zzz(Math.max(iZzb + iZzb, i));
        }
        ((zzzk) zzzvVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i - this.zzn.zzd(), false);
        this.zzn.zzE(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzzv zzzvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzb() < i2) {
            zzen zzenVar = this.zzr;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzenVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzzk) zzzvVar).zzn(this.zzr.zzH(), length, i, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzdl.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return zzew.zzab(String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzzvVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzaet zzaetVar = (zzaet) this.zzj.valueAt(i);
                    zzaetVar.zzV.getClass();
                    zzabc zzabcVar = zzaetVar.zzS;
                    if (zzabcVar != null) {
                        zzabcVar.zza(zzaetVar.zzV, zzaetVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzzvVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzaauVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzaauVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzai = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzabc zzabcVar = ((zzaet) this.zzj.valueAt(i)).zzS;
            if (zzabcVar != null) {
                zzabcVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return new zzaev().zza(zzzvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzh(int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzh(int):void");
    }

    protected final void zzk(int i, long j, long j2) throws zzbu {
        zzdl.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzaet();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzt(i);
            this.zzB.zzw = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzbu.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzef(32);
            this.zzK = new zzef(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzN(new zzaaw(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public zzaeu(int i) {
        zzaen zzaenVar = new zzaen();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzaenVar;
        zzaenVar.zza(new zzaes(this, null));
        this.zzk = true;
        this.zzi = new zzaew();
        this.zzj = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzaar.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzS = new int[1];
    }

    protected final void zzl(int i, String str) throws zzbu {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbu.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzt(i);
            this.zzB.zzY = str;
        }
    }

    protected final void zzg(int i, int i2, zzzv zzzvVar) throws IOException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 1;
        int i9 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzaet zzaetVar = (zzaet) this.zzj.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzaetVar.zzb)) {
                    ((zzzk) zzzvVar).zzo(i2, false);
                    return;
                }
                this.zzu.zzC(i2);
                ((zzzk) zzzvVar).zzn(this.zzu.zzH(), 0, i2, false);
                return;
            }
            if (i7 == 16877) {
                zzt(i);
                zzaet zzaetVar2 = this.zzB;
                if (zzaetVar2.zzX != 1685485123 && zzaetVar2.zzX != 1685480259) {
                    ((zzzk) zzzvVar).zzo(i2, false);
                    return;
                }
                zzaetVar2.zzM = new byte[i2];
                ((zzzk) zzzvVar).zzn(zzaetVar2.zzM, 0, i2, false);
                return;
            }
            if (i7 == 16981) {
                zzt(i);
                zzaet zzaetVar3 = this.zzB;
                zzaetVar3.zzh = new byte[i2];
                ((zzzk) zzzvVar).zzn(zzaetVar3.zzh, 0, i2, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzzk) zzzvVar).zzn(bArr, 0, i2, false);
                zzt(i);
                this.zzB.zzi = new zzaba(1, bArr, 0, 0);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(this.zzp.zzH(), (byte) 0);
                ((zzzk) zzzvVar).zzn(this.zzp.zzH(), 4 - i2, i2, false);
                this.zzp.zzF(0);
                this.zzD = (int) this.zzp.zzs();
                return;
            }
            if (i7 == 25506) {
                zzt(i);
                zzaet zzaetVar4 = this.zzB;
                zzaetVar4.zzj = new byte[i2];
                ((zzzk) zzzvVar).zzn(zzaetVar4.zzj, 0, i2, false);
                return;
            }
            if (i7 != 30322) {
                throw zzbu.zza("Unexpected id: " + i7, null);
            }
            zzt(i);
            zzaet zzaetVar5 = this.zzB;
            zzaetVar5.zzu = new byte[i2];
            ((zzzk) zzzvVar).zzn(zzaetVar5.zzu, 0, i2, false);
            return;
        }
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzzvVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzC(0);
        }
        zzaet zzaetVar6 = (zzaet) this.zzj.get(this.zzT);
        if (zzaetVar6 == null) {
            ((zzzk) zzzvVar).zzo(i2 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzaetVar6.zzV.getClass();
        if (this.zzN == 1) {
            zzv(zzzvVar, 3);
            int i10 = (this.zzn.zzH()[2] & 6) >> 1;
            byte b = UByte.MAX_VALUE;
            if (i10 == 0) {
                this.zzR = 1;
                int[] iArrZzz = zzz(this.zzS, 1);
                this.zzS = iArrZzz;
                iArrZzz[0] = (i2 - this.zzU) - 3;
            } else {
                zzv(zzzvVar, 4);
                int i11 = (this.zzn.zzH()[3] & UByte.MAX_VALUE) + 1;
                this.zzR = i11;
                int[] iArrZzz2 = zzz(this.zzS, i11);
                this.zzS = iArrZzz2;
                if (i10 == 2) {
                    int i12 = (i2 - this.zzU) - 4;
                    int i13 = this.zzR;
                    Arrays.fill(iArrZzz2, 0, i13, i12 / i13);
                } else {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            throw zzbu.zza("Unexpected lacing value: 2", null);
                        }
                        int i14 = 0;
                        int i15 = 4;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.zzR - 1;
                            if (i14 >= i17) {
                                this.zzS[i17] = ((i2 - this.zzU) - i15) - i16;
                                break;
                            }
                            this.zzS[i14] = i9;
                            int i18 = i15 + 1;
                            zzv(zzzvVar, i18);
                            if (this.zzn.zzH()[i15] == 0) {
                                throw zzbu.zza("No valid varint length mask found", null);
                            }
                            int i19 = 0;
                            while (true) {
                                if (i19 >= 8) {
                                    j = 0;
                                    i15 = i18;
                                    break;
                                }
                                int i20 = i8 << (7 - i19);
                                if ((this.zzn.zzH()[i15] & i20) != 0) {
                                    int i21 = i18 + i19;
                                    zzv(zzzvVar, i21);
                                    j = this.zzn.zzH()[i15] & b & (i20 ^ (-1));
                                    int i22 = i15 + 1;
                                    while (i22 < i21) {
                                        j = (j << 8) | ((long) (this.zzn.zzH()[i22] & b));
                                        i22++;
                                        i21 = i21;
                                        b = UByte.MAX_VALUE;
                                    }
                                    int i23 = i21;
                                    if (i14 > 0) {
                                        j -= (1 << ((i19 * 7) + 6)) - 1;
                                    }
                                    i15 = i23;
                                } else {
                                    i19++;
                                    i8 = 1;
                                    b = UByte.MAX_VALUE;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzS;
                            int i24 = (int) j;
                            if (i14 != 0) {
                                i24 += iArr[i14 - 1];
                            }
                            iArr[i14] = i24;
                            i16 += i24;
                            i14++;
                            i8 = 1;
                            i9 = 0;
                            b = UByte.MAX_VALUE;
                        }
                        throw zzbu.zza("EBML lacing sample size out of range.", null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        i3 = this.zzR - 1;
                        if (i25 >= i3) {
                            break;
                        }
                        this.zzS[i25] = 0;
                        while (true) {
                            i4 = i27 + 1;
                            zzv(zzzvVar, i4);
                            int i28 = this.zzn.zzH()[i27] & UByte.MAX_VALUE;
                            int[] iArr2 = this.zzS;
                            i5 = iArr2[i25] + i28;
                            iArr2[i25] = i5;
                            if (i28 != 255) {
                                break;
                            } else {
                                i27 = i4;
                            }
                        }
                        i26 += i5;
                        i25++;
                        i27 = i4;
                    }
                    this.zzS[i3] = ((i2 - this.zzU) - i27) - i26;
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzH()[0] << 8) | (this.zzn.zzH()[1] & UByte.MAX_VALUE));
            if (zzaetVar6.zzd == 2) {
                i6 = 1;
                this.zzV = i6;
                this.zzN = 2;
                this.zzQ = 0;
            } else {
                if (i7 == 163) {
                    if ((this.zzn.zzH()[2] & ByteCompanionObject.MIN_VALUE) == 128) {
                        i7 = 163;
                        i6 = 1;
                        this.zzV = i6;
                        this.zzN = 2;
                        this.zzQ = 0;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
                this.zzV = i6;
                this.zzN = 2;
                this.zzQ = 0;
            }
        }
        if (i7 == 163) {
            while (true) {
                int i29 = this.zzQ;
                if (i29 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzu(zzaetVar6, ((long) ((this.zzQ * zzaetVar6.zze) / 1000)) + this.zzO, this.zzV, zzp(zzzvVar, zzaetVar6, this.zzS[i29], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i30 = this.zzQ;
                if (i30 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i30] = zzp(zzzvVar, zzaetVar6, iArr3[i30], true);
                this.zzQ++;
            }
        }
    }

    protected final void zzi(int i, double d) throws zzbu {
        if (i == 181) {
            zzt(i);
            this.zzB.zzP = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzt(i);
                this.zzB.zzC = (float) d;
                break;
            case 21970:
                zzt(i);
                this.zzB.zzD = (float) d;
                break;
            case 21971:
                zzt(i);
                this.zzB.zzE = (float) d;
                break;
            case 21972:
                zzt(i);
                this.zzB.zzF = (float) d;
                break;
            case 21973:
                zzt(i);
                this.zzB.zzG = (float) d;
                break;
            case 21974:
                zzt(i);
                this.zzB.zzH = (float) d;
                break;
            case 21975:
                zzt(i);
                this.zzB.zzI = (float) d;
                break;
            case 21976:
                zzt(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21977:
                zzt(i);
                this.zzB.zzK = (float) d;
                break;
            case 21978:
                zzt(i);
                this.zzB.zzL = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzt(i);
                        this.zzB.zzr = (float) d;
                        break;
                    case 30324:
                        zzt(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30325:
                        zzt(i);
                        this.zzB.zzt = (float) d;
                        break;
                }
                break;
        }
    }

    protected final void zzj(int i, long j) throws zzbu {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzbu.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzbu.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                zzt(i);
                this.zzB.zzd = (int) j;
                return;
            case 136:
                zzt(i);
                this.zzB.zzU = j == 1;
                return;
            case 155:
                this.zzP = zzr(j);
                return;
            case 159:
                zzt(i);
                this.zzB.zzN = (int) j;
                return;
            case 176:
                zzt(i);
                this.zzB.zzl = (int) j;
                return;
            case 179:
                zzs(i);
                this.zzJ.zzc(zzr(j));
                return;
            case 186:
                zzt(i);
                this.zzB.zzm = (int) j;
                return;
            case 215:
                zzt(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzr(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzs(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzt(i);
                this.zzB.zzX = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzbu.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzbu.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzbu.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzbu.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzbu.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzt(i);
                if (i2 == 0) {
                    this.zzB.zzv = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzv = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzv = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzv = 3;
                    return;
                }
            case 21680:
                zzt(i);
                this.zzB.zzn = (int) j;
                return;
            case 21682:
                zzt(i);
                this.zzB.zzp = (int) j;
                return;
            case 21690:
                zzt(i);
                this.zzB.zzo = (int) j;
                return;
            case 21930:
                zzt(i);
                this.zzB.zzT = j == 1;
                return;
            case 21998:
                zzt(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzt(i);
                this.zzB.zzQ = j;
                return;
            case 22203:
                zzt(i);
                this.zzB.zzR = j;
                return;
            case 25188:
                zzt(i);
                this.zzB.zzO = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                zzt(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.zzB.zzq = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzq = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzq = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzq = 3;
                    return;
                }
            case 2352003:
                zzt(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        zzt(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.zzB.zzz = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzz = 1;
                            return;
                        }
                    case 21946:
                        zzt(i);
                        int iZzb = zzq.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzB.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i);
                        this.zzB.zzw = true;
                        int iZza = zzq.zza((int) j);
                        if (iZza != -1) {
                            this.zzB.zzx = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i);
                        this.zzB.zzA = (int) j;
                        return;
                    case 21949:
                        zzt(i);
                        this.zzB.zzB = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
