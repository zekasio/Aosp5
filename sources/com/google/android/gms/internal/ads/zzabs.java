package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabs implements zzabk {
    public final zzfqk zza;
    private final int zzb;

    private zzabs(int i, zzfqk zzfqkVar) {
        this.zzb = i;
        this.zza = zzfqkVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzabs zzc(int i, zzen zzenVar) {
        zzabk zzabtVar;
        String str;
        zzfqh zzfqhVar = new zzfqh();
        int iZzd = zzenVar.zzd();
        int i2 = -2;
        while (zzenVar.zza() > 8) {
            int iZzg = zzenVar.zzg();
            int iZzc = zzenVar.zzc() + zzenVar.zzg();
            zzenVar.zzE(iZzc);
            if (iZzg != 1414744396) {
                zzabt zzabtVar2 = null;
                switch (iZzg) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iZzi = zzenVar.zzi();
                                String str2 = iZzi != 1 ? iZzi != 85 ? iZzi != 255 ? iZzi != 8192 ? iZzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iZzi2 = zzenVar.zzi();
                                    int iZzg2 = zzenVar.zzg();
                                    zzenVar.zzG(6);
                                    int iZzn = zzew.zzn(zzenVar.zzo());
                                    int iZzi3 = zzenVar.zzi();
                                    byte[] bArr = new byte[iZzi3];
                                    zzenVar.zzB(bArr, 0, iZzi3);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzS(str2);
                                    zzadVar.zzw(iZzi2);
                                    zzadVar.zzT(iZzg2);
                                    if ("audio/raw".equals(str2) && iZzn != 0) {
                                        zzadVar.zzN(iZzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iZzi3 > 0) {
                                        zzadVar.zzI(zzfqk.zzp(bArr));
                                    }
                                    zzabtVar = new zzabt(zzadVar.zzY());
                                } else {
                                    zzee.zze("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZzi);
                                }
                            } else {
                                zzee.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzew.zzO(i2)));
                            }
                            break;
                        } else {
                            zzenVar.zzG(4);
                            int iZzg3 = zzenVar.zzg();
                            int iZzg4 = zzenVar.zzg();
                            zzenVar.zzG(4);
                            int iZzg5 = zzenVar.zzg();
                            switch (iZzg5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzee.zze("StreamFormatChunk", "Ignoring track with unsupported compression " + iZzg5);
                            } else {
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzX(iZzg3);
                                zzadVar2.zzF(iZzg4);
                                zzadVar2.zzS(str);
                                zzabtVar2 = new zzabt(zzadVar2.zzY());
                            }
                        }
                        zzabtVar = zzabtVar2;
                        break;
                    case 1751742049:
                        zzabtVar = zzabp.zzb(zzenVar);
                        break;
                    case 1752331379:
                        zzabtVar = zzabq.zzb(zzenVar);
                        break;
                    case 1852994675:
                        zzabtVar = zzabu.zzb(zzenVar);
                        break;
                    default:
                        zzabtVar = zzabtVar2;
                        break;
                }
            } else {
                zzabtVar = zzc(zzenVar.zzg(), zzenVar);
            }
            if (zzabtVar != null) {
                if (zzabtVar.zza() == 1752331379) {
                    int i3 = ((zzabq) zzabtVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzee.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfqhVar.zzf(zzabtVar);
            }
            zzenVar.zzF(iZzc);
            zzenVar.zzE(iZzd);
        }
        return new zzabs(i, zzfqhVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return this.zzb;
    }

    public final zzabk zzb(Class cls) {
        zzfqk zzfqkVar = this.zza;
        int size = zzfqkVar.size();
        int i = 0;
        while (i < size) {
            zzabk zzabkVar = (zzabk) zzfqkVar.get(i);
            i++;
            if (zzabkVar.getClass() == cls) {
                return zzabkVar;
            }
        }
        return null;
    }
}
