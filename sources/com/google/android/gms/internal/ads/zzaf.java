package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaf {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzal;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbq zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzq zzy;
    public final int zzz;
    private static final zzaf zzG = new zzaf(new zzad());
    private static final String zzH = zzew.zzP(0);
    private static final String zzI = zzew.zzP(1);
    private static final String zzJ = zzew.zzP(2);
    private static final String zzK = zzew.zzP(3);
    private static final String zzL = zzew.zzP(4);
    private static final String zzM = zzew.zzP(5);
    private static final String zzN = zzew.zzP(6);
    private static final String zzO = zzew.zzP(7);
    private static final String zzP = zzew.zzP(8);
    private static final String zzQ = zzew.zzP(9);
    private static final String zzR = zzew.zzP(10);
    private static final String zzS = zzew.zzP(11);
    private static final String zzT = zzew.zzP(12);
    private static final String zzU = zzew.zzP(13);
    private static final String zzV = zzew.zzP(14);
    private static final String zzW = zzew.zzP(15);
    private static final String zzX = zzew.zzP(16);
    private static final String zzY = zzew.zzP(17);
    private static final String zzZ = zzew.zzP(18);
    private static final String zzaa = zzew.zzP(19);
    private static final String zzab = zzew.zzP(20);
    private static final String zzac = zzew.zzP(21);
    private static final String zzad = zzew.zzP(22);
    private static final String zzae = zzew.zzP(23);
    private static final String zzaf = zzew.zzP(24);
    private static final String zzag = zzew.zzP(25);
    private static final String zzah = zzew.zzP(26);
    private static final String zzai = zzew.zzP(27);
    private static final String zzaj = zzew.zzP(28);
    private static final String zzak = zzew.zzP(29);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzab
    };

    private zzaf(zzad zzadVar) {
        this.zzb = zzadVar.zza;
        this.zzc = zzadVar.zzb;
        this.zzd = zzew.zzQ(zzadVar.zzc);
        this.zze = zzadVar.zzd;
        this.zzf = 0;
        int i = zzadVar.zze;
        this.zzg = i;
        int i2 = zzadVar.zzf;
        this.zzh = i2;
        this.zzi = i2 != -1 ? i2 : i;
        this.zzj = zzadVar.zzg;
        this.zzk = zzadVar.zzh;
        this.zzl = zzadVar.zzi;
        this.zzm = zzadVar.zzj;
        this.zzn = zzadVar.zzk;
        this.zzo = zzadVar.zzl == null ? Collections.emptyList() : zzadVar.zzl;
        zzx zzxVar = zzadVar.zzm;
        this.zzp = zzxVar;
        this.zzq = zzadVar.zzn;
        this.zzr = zzadVar.zzo;
        this.zzs = zzadVar.zzp;
        this.zzt = zzadVar.zzq;
        this.zzu = zzadVar.zzr == -1 ? 0 : zzadVar.zzr;
        this.zzv = zzadVar.zzs == -1.0f ? 1.0f : zzadVar.zzs;
        this.zzw = zzadVar.zzt;
        this.zzx = zzadVar.zzu;
        this.zzy = zzadVar.zzv;
        this.zzz = zzadVar.zzw;
        this.zzA = zzadVar.zzx;
        this.zzB = zzadVar.zzy;
        this.zzC = zzadVar.zzz == -1 ? 0 : zzadVar.zzz;
        this.zzD = zzadVar.zzA != -1 ? zzadVar.zzA : 0;
        this.zzE = zzadVar.zzB;
        this.zzF = (zzadVar.zzC != 0 || zzxVar == null) ? zzadVar.zzC : 1;
    }

    public static String zzd(zzaf zzafVar) {
        if (zzafVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(zzafVar.zzb);
        sb.append(", mimeType=");
        sb.append(zzafVar.zzm);
        if (zzafVar.zzi != -1) {
            sb.append(", bitrate=");
            sb.append(zzafVar.zzi);
        }
        if (zzafVar.zzj != null) {
            sb.append(", codecs=");
            sb.append(zzafVar.zzj);
        }
        if (zzafVar.zzp != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                zzx zzxVar = zzafVar.zzp;
                if (i >= zzxVar.zzb) {
                    break;
                }
                UUID uuid = zzxVar.zza(i).zza;
                if (uuid.equals(zzo.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzo.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzo.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzo.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzo.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid.toString() + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            zzfnk.zzb(sb, linkedHashSet, ",");
            sb.append(']');
        }
        if (zzafVar.zzr != -1 && zzafVar.zzs != -1) {
            sb.append(", res=");
            sb.append(zzafVar.zzr);
            sb.append("x");
            sb.append(zzafVar.zzs);
        }
        if (zzafVar.zzt != -1.0f) {
            sb.append(", fps=");
            sb.append(zzafVar.zzt);
        }
        if (zzafVar.zzz != -1) {
            sb.append(", channels=");
            sb.append(zzafVar.zzz);
        }
        if (zzafVar.zzA != -1) {
            sb.append(", sample_rate=");
            sb.append(zzafVar.zzA);
        }
        if (zzafVar.zzd != null) {
            sb.append(", language=");
            sb.append(zzafVar.zzd);
        }
        if (zzafVar.zzc != null) {
            sb.append(", label=");
            sb.append(zzafVar.zzc);
        }
        if (zzafVar.zze != 0) {
            ArrayList arrayList = new ArrayList();
            if ((zzafVar.zze & 1) != 0) {
                arrayList.add(CookieSpecs.DEFAULT);
            }
            if ((zzafVar.zze & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            zzfnk.zzb(sb, arrayList, ",");
            sb.append("]");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.zzal;
            if ((i2 == 0 || (i = zzafVar.zzal) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzew.zzU(this.zzb, zzafVar.zzb) && zzew.zzU(this.zzc, zzafVar.zzc) && zzew.zzU(this.zzj, zzafVar.zzj) && zzew.zzU(this.zzl, zzafVar.zzl) && zzew.zzU(this.zzm, zzafVar.zzm) && zzew.zzU(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzew.zzU(this.zzk, zzafVar.zzk) && zzew.zzU(this.zzy, zzafVar.zzy) && zzew.zzU(this.zzp, zzafVar.zzp) && zze(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzA(i);
        return new zzaf(zzadVar);
    }

    public final boolean zze(zzaf zzafVar) {
        if (this.zzo.size() != zzafVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzal;
        if (i != 0) {
            return i;
        }
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + 527;
        String str3 = this.zzd;
        int iHashCode3 = (((((((((i2 * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
        String str4 = this.zzj;
        int iHashCode4 = ((iHashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbq zzbqVar = this.zzk;
        int iHashCode5 = (iHashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
        String str5 = this.zzl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzm;
        int iHashCode7 = ((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.zzal = iHashCode7;
        return iHashCode7;
    }
}
