package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.AdLoader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzww implements zzws, zzgi {
    public static final zzfqk zza = zzfqk.zzs(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final zzfqk zzb = zzfqk.zzs(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final zzfqk zzc = zzfqk.zzs(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final zzfqk zzd = zzfqk.zzs(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final zzfqk zze = zzfqk.zzs(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final zzfqk zzf = zzfqk.zzs(2800000L, Long.valueOf(TapjoyConstants.SESSION_ID_INACTIVITY_TIME), 1400000L, 1100000L, 870000L);
    private static zzww zzg;
    private final zzfqn zzh;
    private final zzwq zzi;
    private final zzxl zzj;
    private final zzdm zzk;
    private final boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;

    @Deprecated
    public zzww() {
        zzfqn.zzd();
        zzdm zzdmVar = zzdm.zza;
        throw null;
    }

    private final long zzi(int i) {
        Long l = (Long) this.zzh.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.zzh.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void zzj(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.zzt) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.zzt = j2;
        this.zzi.zzb(i2, j3, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzk(int i) {
        int i2 = this.zzp;
        if (i2 == 0 || this.zzl) {
            if (i2 == i) {
                return;
            }
            this.zzp = i;
            if (i != 1 && i != 0 && i != 8) {
                this.zzs = zzi(i);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzj(this.zzm > 0 ? (int) (jElapsedRealtime - this.zzn) : 0, this.zzo, this.zzs);
                this.zzn = jElapsedRealtime;
                this.zzo = 0L;
                this.zzr = 0L;
                this.zzq = 0L;
                this.zzj.zzc();
            }
        }
    }

    private static boolean zzl(zzfl zzflVar, boolean z) {
        return z && !zzflVar.zzb(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x013d, code lost:
    
        if (r3.equals("WS") != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0147, code lost:
    
        if (r3.equals("WF") != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0189, code lost:
    
        if (r3.equals("VE") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0193, code lost:
    
        if (r3.equals("VC") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019d, code lost:
    
        if (r3.equals("VA") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b5, code lost:
    
        if (r3.equals("UY") != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01cd, code lost:
    
        if (r3.equals("UG") != false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e5, code lost:
    
        if (r3.equals("TZ") != false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fd, code lost:
    
        if (r3.equals("TV") != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0223, code lost:
    
        if (r3.equals("TO") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x022d, code lost:
    
        if (r3.equals("TN") != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0234, code lost:
    
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x023b, code lost:
    
        if (r3.equals("TM") != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0253, code lost:
    
        if (r3.equals("TK") != false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025d, code lost:
    
        if (r3.equals("TJ") != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0275, code lost:
    
        if (r3.equals("TG") != false) goto L694;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x027f, code lost:
    
        if (r3.equals("TD") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02a5, code lost:
    
        if (r3.equals("SY") != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02af, code lost:
    
        if (r3.equals("SX") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02b9, code lost:
    
        if (r3.equals("SV") != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02d1, code lost:
    
        if (r3.equals("SS") != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02d8, code lost:
    
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02fb, code lost:
    
        if (r3.equals("SN") != false) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0305, code lost:
    
        if (r3.equals("SM") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x030f, code lost:
    
        if (r3.equals("SL") != false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0327, code lost:
    
        if (r3.equals("SJ") != false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0331, code lost:
    
        if (r3.equals("SI") != false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033b, code lost:
    
        if (r3.equals("SH") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SB") != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L727;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0384, code lost:
    
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x038b, code lost:
    
        if (r3.equals("SA") != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03e9, code lost:
    
        if (r3.equals("PY") != false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x042b, code lost:
    
        if (r3.equals("PM") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0443, code lost:
    
        if (r3.equals("PK") != false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x045b, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L863;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0465, code lost:
    
        if (r3.equals("PF") != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x046c, code lost:
    
        return new int[]{2, 3, 3, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r3.equals("CF") != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050d, code lost:
    
        if (r3.equals("NE") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0533, code lost:
    
        if (r3.equals("MZ") != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x053a, code lost:
    
        return new int[]{3, 1, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (r3.equals("BT") != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0579, code lost:
    
        if (r3.equals("MU") != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0580, code lost:
    
        return new int[]{3, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0587, code lost:
    
        if (r3.equals("MT") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0591, code lost:
    
        if (r3.equals("MS") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x05a9, code lost:
    
        if (r3.equals("MQ") != false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r3.equals("BS") != false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05b3, code lost:
    
        if (r3.equals("MP") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e7, code lost:
    
        if (r3.equals("ML") != false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05ee, code lost:
    
        return new int[]{3, 4, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0611, code lost:
    
        if (r3.equals("MG") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x061b, code lost:
    
        if (r3.equals("MF") != false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0622, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0668, code lost:
    
        return new int[]{3, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066f, code lost:
    
        if (r3.equals("LV") != false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0687, code lost:
    
        if (r3.equals("LT") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0698, code lost:
    
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
    
        if (r3.equals("BQ") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06bb, code lost:
    
        if (r3.equals("LI") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06c5, code lost:
    
        if (r3.equals("LC") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x06cf, code lost:
    
        if (r3.equals("LB") != false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x06d6, code lost:
    
        return new int[]{3, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06eb, code lost:
    
        if (r3.equals("KZ") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x06f5, code lost:
    
        if (r3.equals("KY") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072f, code lost:
    
        if (r3.equals("KI") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0747, code lost:
    
        if (r3.equals("KG") != false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x074e, code lost:
    
        return new int[]{2, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x07c1, code lost:
    
        if (r3.equals("IQ") != false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07c8, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x07cf, code lost:
    
        if (r3.equals("IO") != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x07d6, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0807, code lost:
    
        if (r3.equals("IE") != false) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        if (r3.equals("BM") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081f, code lost:
    
        if (r3.equals("HU") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0829, code lost:
    
        if (r3.equals("HT") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0833, code lost:
    
        if (r3.equals("HR") != false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0875, code lost:
    
        if (r3.equals("GU") != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
    
        if (r3.equals("BL") != false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x088d, code lost:
    
        if (r3.equals("GR") != false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cf, code lost:
    
        if (r3.equals("GL") != false) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d6, code lost:
    
        return new int[]{2, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08dd, code lost:
    
        if (r3.equals("GI") != false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08e4, code lost:
    
        return new int[]{1, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x08eb, code lost:
    
        if (r3.equals("GH") != false) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x08f2, code lost:
    
        return new int[]{3, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0907, code lost:
    
        if (r3.equals("GF") != false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x090e, code lost:
    
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0923, code lost:
    
        if (r3.equals("GD") != false) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x092a, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x093f, code lost:
    
        if (r3.equals("GA") != false) goto L694;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0946, code lost:
    
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x095b, code lost:
    
        if (r3.equals("FO") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x098f, code lost:
    
        if (r3.equals("ET") != false) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0996, code lost:
    
        return new int[]{4, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x099d, code lost:
    
        if (r3.equals("ES") != false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x09a7, code lost:
    
        if (r3.equals("ER") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x09b1, code lost:
    
        if (r3.equals("EG") != false) goto L727;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x09b8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x09bf, code lost:
    
        if (r3.equals("EE") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        if (r3.equals("DZ") != false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x09ee, code lost:
    
        if (r3.equals("DM") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f8, code lost:
    
        if (r3.equals("DK") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x09ff, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a06, code lost:
    
        if (r3.equals("DJ") != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0a0d, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0a30, code lost:
    
        if (r3.equals("CY") != false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0a37, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0a3e, code lost:
    
        if (r3.equals("CX") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0a48, code lost:
    
        if (r3.equals("CW") != false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0a60, code lost:
    
        if (r3.equals("CU") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0a67, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
    
        if (r3.equals("ZW") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        if (r3.equals("CK") != false) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0abe, code lost:
    
        if (r3.equals("CD") != false) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0ac5, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0af6, code lost:
    
        if (r3.equals("BI") != false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0afd, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        if (r3.equals("BG") != false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0b19, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0b20, code lost:
    
        if (r3.equals("BF") != false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0b37, code lost:
    
        if (r3.equals("BD") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0b3e, code lost:
    
        return new int[]{2, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0b45, code lost:
    
        if (r3.equals("AZ") != false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0b4c, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0b53, code lost:
    
        if (r3.equals("AQ") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0b5a, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0b6f, code lost:
    
        if (r3.equals("AI") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0b86, code lost:
    
        if (r3.equals("AF") != false) goto L863;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0b8d, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0ba2, code lost:
    
        if (r3.equals("AD") != false) goto L871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0ba9, code lost:
    
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0bb0, code lost:
    
        if (r3.equals("BZ") != false) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0bcc, code lost:
    
        if (r3.equals("BB") != false) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        if (r3.equals("BA") != false) goto L887;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        if (r3.equals("AX") != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        if (r3.equals("AW") != false) goto L895;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0bfd, code lost:
    
        return new int[]{1, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0125, code lost:
    
        if (r3.equals("YE") != false) goto L821;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] zzm(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzww.zzm(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
        if (zzl(zzflVar, z)) {
            this.zzo += (long) i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzl(zzflVar, z)) {
            zzdl.zzf(this.zzm > 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.zzn);
            this.zzq += (long) i;
            long j = this.zzr;
            long j2 = this.zzo;
            this.zzr = j + j2;
            if (i > 0) {
                this.zzj.zzb((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.zzq >= AdLoader.RETRY_DELAY || this.zzr >= 524288) {
                    this.zzs = (long) this.zzj.zza(0.5f);
                }
                zzj(i, this.zzo, this.zzs);
                this.zzn = jElapsedRealtime;
                this.zzo = 0L;
            }
            this.zzm--;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final synchronized void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzl(zzflVar, z)) {
            if (this.zzm == 0) {
                this.zzn = SystemClock.elapsedRealtime();
            }
            this.zzm++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzf(zzwr zzwrVar) {
        this.zzi.zzc(zzwrVar);
    }

    public static synchronized zzww zzg(Context context) {
        if (zzg == null) {
            Context applicationContext = context == null ? null : context.getApplicationContext();
            int[] iArrZzm = zzm(zzew.zzL(context));
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            zzfqk zzfqkVar = zza;
            map.put(2, (Long) zzfqkVar.get(iArrZzm[0]));
            map.put(3, (Long) zzb.get(iArrZzm[1]));
            map.put(4, (Long) zzc.get(iArrZzm[2]));
            map.put(5, (Long) zzd.get(iArrZzm[3]));
            map.put(10, (Long) zze.get(iArrZzm[4]));
            map.put(9, (Long) zzf.get(iArrZzm[5]));
            map.put(7, (Long) zzfqkVar.get(iArrZzm[0]));
            zzg = new zzww(applicationContext, map, 2000, zzdm.zza, true, null);
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zze(Handler handler, zzwr zzwrVar) {
        zzwrVar.getClass();
        this.zzi.zza(handler, zzwrVar);
    }

    /* synthetic */ zzww(Context context, Map map, int i, zzdm zzdmVar, boolean z, zzwv zzwvVar) {
        this.zzh = zzfqn.zzc(map);
        this.zzi = new zzwq();
        this.zzj = new zzxl(2000);
        this.zzk = zzdmVar;
        this.zzl = true;
        if (context != null) {
            zzel zzelVarZzb = zzel.zzb(context);
            int iZza = zzelVarZzb.zza();
            this.zzp = iZza;
            this.zzs = zzi(iZza);
            zzelVarZzb.zzd(new zzwu(this));
            return;
        }
        this.zzp = 0;
        this.zzs = zzi(0);
    }
}
