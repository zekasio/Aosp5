package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import cz.msebera.android.httpclient.HttpHeaders;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafy {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbp zza(zzen zzenVar) {
        String str;
        int iZzc = zzenVar.zzc() + zzenVar.zze();
        int iZze = zzenVar.zze();
        int i = (iZze >> 24) & 255;
        zzbp zzadiVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZze & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZze2 = zzenVar.zze();
                    if (zzenVar.zze() == 1684108385) {
                        zzenVar.zzG(8);
                        String strZzw = zzenVar.zzw(iZze2 - 16);
                        zzadiVar = new zzadi("und", strZzw, strZzw);
                    } else {
                        zzee.zze("MetadataUtil", "Failed to parse comment attribute: ".concat(zzafj.zzf(iZze)));
                    }
                    return zzadiVar;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return zze(iZze, "TIT2", zzenVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return zze(iZze, "TCOM", zzenVar);
                }
                if (i2 == 6578553) {
                    return zze(iZze, "TDRC", zzenVar);
                }
                if (i2 == 4280916) {
                    return zze(iZze, "TPE1", zzenVar);
                }
                if (i2 == 7630703) {
                    return zze(iZze, "TSSE", zzenVar);
                }
                if (i2 == 6384738) {
                    return zze(iZze, "TALB", zzenVar);
                }
                if (i2 == 7108978) {
                    return zze(iZze, "USLT", zzenVar);
                }
                if (i2 == 6776174) {
                    return zze(iZze, "TCON", zzenVar);
                }
                if (i2 == 6779504) {
                    return zze(iZze, "TIT1", zzenVar);
                }
            } else {
                if (iZze == 1735291493) {
                    int iZzb = zzb(zzenVar);
                    String str2 = (iZzb <= 0 || iZzb > 192) ? null : zza[iZzb - 1];
                    if (str2 != null) {
                        zzadiVar = new zzadx("TCON", null, zzfqk.zzp(str2));
                    } else {
                        zzee.zze("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return zzadiVar;
                }
                if (iZze == 1684632427) {
                    return zzd(1684632427, "TPOS", zzenVar);
                }
                if (iZze == 1953655662) {
                    return zzd(1953655662, "TRCK", zzenVar);
                }
                if (iZze == 1953329263) {
                    return zzc(1953329263, "TBPM", zzenVar, true, false);
                }
                if (iZze == 1668311404) {
                    return zzc(1668311404, "TCMP", zzenVar, true, true);
                }
                if (iZze == 1668249202) {
                    int iZze3 = zzenVar.zze();
                    if (zzenVar.zze() == 1684108385) {
                        int iZze4 = zzenVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
                        if (iZze4 == 13) {
                            str = "image/jpeg";
                        } else if (iZze4 == 14) {
                            str = "image/png";
                            iZze4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzee.zze("MetadataUtil", "Unrecognized cover art flags: " + iZze4);
                        } else {
                            zzenVar.zzG(4);
                            int i3 = iZze3 - 16;
                            byte[] bArr = new byte[i3];
                            zzenVar.zzB(bArr, 0, i3);
                            zzadiVar = new zzada(str, null, 3, bArr);
                        }
                    } else {
                        zzee.zze("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzadiVar;
                }
                if (iZze == 1631670868) {
                    return zze(1631670868, "TPE2", zzenVar);
                }
                if (iZze == 1936682605) {
                    return zze(1936682605, "TSOT", zzenVar);
                }
                if (iZze == 1936679276) {
                    return zze(1936679276, "TSO2", zzenVar);
                }
                if (iZze == 1936679282) {
                    return zze(1936679282, "TSOA", zzenVar);
                }
                if (iZze == 1936679265) {
                    return zze(1936679265, "TSOP", zzenVar);
                }
                if (iZze == 1936679791) {
                    return zze(1936679791, "TSOC", zzenVar);
                }
                if (iZze == 1920233063) {
                    return zzc(1920233063, "ITUNESADVISORY", zzenVar, false, false);
                }
                if (iZze == 1885823344) {
                    return zzc(1885823344, "ITUNESGAPLESS", zzenVar, false, true);
                }
                if (iZze == 1936683886) {
                    return zze(1936683886, "TVSHOWSORT", zzenVar);
                }
                if (iZze == 1953919848) {
                    return zze(1953919848, "TVSHOW", zzenVar);
                }
                if (iZze == 757935405) {
                    String strZzw2 = null;
                    String strZzw3 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (zzenVar.zzc() < iZzc) {
                        int iZzc2 = zzenVar.zzc();
                        int iZze5 = zzenVar.zze();
                        int iZze6 = zzenVar.zze();
                        zzenVar.zzG(4);
                        if (iZze6 == 1835360622) {
                            strZzw2 = zzenVar.zzw(iZze5 - 12);
                        } else if (iZze6 == 1851878757) {
                            strZzw3 = zzenVar.zzw(iZze5 - 12);
                        } else {
                            if (iZze6 == 1684108385) {
                                i5 = iZze5;
                            }
                            if (iZze6 == 1684108385) {
                                i4 = iZzc2;
                            }
                            zzenVar.zzG(iZze5 - 12);
                        }
                    }
                    if (strZzw2 != null && strZzw3 != null && i4 != -1) {
                        zzenVar.zzF(i4);
                        zzenVar.zzG(16);
                        zzadiVar = new zzadr(strZzw2, strZzw3, zzenVar.zzw(i5 - 16));
                    }
                    return zzadiVar;
                }
            }
            zzee.zza("MetadataUtil", "Skipped unknown metadata entry: " + zzafj.zzf(iZze));
            return null;
        } finally {
            zzenVar.zzF(iZzc);
        }
    }

    private static int zzb(zzen zzenVar) {
        zzenVar.zzG(4);
        if (zzenVar.zze() == 1684108385) {
            zzenVar.zzG(8);
            return zzenVar.zzk();
        }
        zzee.zze("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzadp zzc(int i, String str, zzen zzenVar, boolean z, boolean z2) {
        int iZzb = zzb(zzenVar);
        if (z2) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z ? new zzadx(str, null, zzfqk.zzp(Integer.toString(iZzb))) : new zzadi("und", str, Integer.toString(iZzb));
        }
        zzee.zze("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzafj.zzf(i)));
        return null;
    }

    private static zzadx zzd(int i, String str, zzen zzenVar) {
        int iZze = zzenVar.zze();
        if (zzenVar.zze() == 1684108385 && iZze >= 22) {
            zzenVar.zzG(10);
            int iZzo = zzenVar.zzo();
            if (iZzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzo);
                String string = sb.toString();
                int iZzo2 = zzenVar.zzo();
                if (iZzo2 > 0) {
                    string = string + "/" + iZzo2;
                }
                return new zzadx(str, null, zzfqk.zzp(string));
            }
        }
        zzee.zze("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzafj.zzf(i)));
        return null;
    }

    private static zzadx zze(int i, String str, zzen zzenVar) {
        int iZze = zzenVar.zze();
        if (zzenVar.zze() == 1684108385) {
            zzenVar.zzG(8);
            return new zzadx(str, null, zzfqk.zzp(zzenVar.zzw(iZze - 16)));
        }
        zzee.zze("MetadataUtil", "Failed to parse text attribute: ".concat(zzafj.zzf(i)));
        return null;
    }
}
