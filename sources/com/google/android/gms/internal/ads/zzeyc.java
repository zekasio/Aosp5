package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyc {
    public final String zzA;
    public final zzbvy zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzeza zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbri zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbup zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzeyh zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05c5 A[PHI: r24 r74
      0x05c5: PHI (r24v75 java.util.List) = 
      (r24v5 java.util.List)
      (r24v6 java.util.List)
      (r24v7 java.util.List)
      (r24v8 java.util.List)
      (r24v9 java.util.List)
      (r24v10 java.util.List)
      (r24v11 java.util.List)
      (r24v12 java.util.List)
      (r24v13 java.util.List)
      (r24v14 java.util.List)
      (r24v15 java.util.List)
      (r24v16 java.util.List)
      (r24v17 java.util.List)
      (r24v18 java.util.List)
      (r24v19 java.util.List)
      (r24v20 java.util.List)
      (r24v21 java.util.List)
      (r24v22 java.util.List)
      (r24v23 java.util.List)
      (r24v24 java.util.List)
      (r24v25 java.util.List)
      (r24v26 java.util.List)
      (r24v27 java.util.List)
      (r24v28 java.util.List)
      (r24v29 java.util.List)
      (r24v30 java.util.List)
      (r24v31 java.util.List)
      (r24v32 java.util.List)
      (r24v33 java.util.List)
      (r24v34 java.util.List)
      (r24v35 java.util.List)
      (r24v36 java.util.List)
      (r24v37 java.util.List)
      (r24v38 java.util.List)
      (r24v39 java.util.List)
      (r24v40 java.util.List)
      (r24v41 java.util.List)
      (r24v42 java.util.List)
      (r24v43 java.util.List)
      (r24v44 java.util.List)
      (r24v45 java.util.List)
      (r24v46 java.util.List)
      (r24v47 java.util.List)
      (r24v48 java.util.List)
      (r24v49 java.util.List)
      (r24v50 java.util.List)
      (r24v51 java.util.List)
      (r24v52 java.util.List)
      (r24v53 java.util.List)
      (r24v54 java.util.List)
      (r24v55 java.util.List)
      (r24v56 java.util.List)
      (r24v57 java.util.List)
      (r24v58 java.util.List)
      (r24v59 java.util.List)
      (r24v60 java.util.List)
      (r24v61 java.util.List)
      (r24v62 java.util.List)
      (r24v63 java.util.List)
      (r24v64 java.util.List)
      (r24v65 java.util.List)
      (r24v66 java.util.List)
      (r24v67 java.util.List)
      (r24v68 java.util.List)
      (r24v69 java.util.List)
      (r24v70 java.util.List)
      (r24v71 java.util.List)
      (r24v72 java.util.List)
      (r24v73 java.util.List)
      (r24v76 java.util.List)
     binds: [B:217:0x05c0, B:214:0x05af, B:211:0x059e, B:208:0x058d, B:205:0x057c, B:202:0x056b, B:199:0x0559, B:196:0x0547, B:193:0x0535, B:190:0x0523, B:187:0x0511, B:184:0x04ff, B:181:0x04ed, B:178:0x04db, B:175:0x04c9, B:172:0x04b7, B:169:0x04a5, B:166:0x0493, B:163:0x0481, B:160:0x046f, B:157:0x045d, B:154:0x044b, B:151:0x043a, B:148:0x0428, B:145:0x0416, B:142:0x0404, B:139:0x03f2, B:136:0x03e0, B:133:0x03ce, B:130:0x03bc, B:127:0x03ab, B:124:0x0399, B:121:0x0388, B:118:0x0376, B:115:0x0364, B:112:0x0352, B:109:0x0340, B:106:0x032e, B:103:0x031c, B:100:0x030a, B:97:0x02f8, B:94:0x02e6, B:91:0x02d4, B:88:0x02c2, B:85:0x02b0, B:82:0x029e, B:79:0x028c, B:76:0x027a, B:73:0x0268, B:70:0x0257, B:67:0x0245, B:64:0x0233, B:61:0x0221, B:58:0x020f, B:55:0x01fe, B:52:0x01ec, B:49:0x01da, B:46:0x01c8, B:43:0x01b6, B:40:0x01a4, B:37:0x0192, B:34:0x0181, B:31:0x016f, B:28:0x015e, B:25:0x014c, B:22:0x013b, B:19:0x0129, B:16:0x0117, B:13:0x0105, B:11:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x05c5: PHI (r74v71 java.util.List) = 
      (r74v1 java.util.List)
      (r74v2 java.util.List)
      (r74v3 java.util.List)
      (r74v4 java.util.List)
      (r74v5 java.util.List)
      (r74v6 java.util.List)
      (r74v7 java.util.List)
      (r74v8 java.util.List)
      (r74v9 java.util.List)
      (r74v10 java.util.List)
      (r74v11 java.util.List)
      (r74v12 java.util.List)
      (r74v13 java.util.List)
      (r74v14 java.util.List)
      (r74v15 java.util.List)
      (r74v16 java.util.List)
      (r74v17 java.util.List)
      (r74v18 java.util.List)
      (r74v19 java.util.List)
      (r74v20 java.util.List)
      (r74v21 java.util.List)
      (r74v22 java.util.List)
      (r74v23 java.util.List)
      (r74v24 java.util.List)
      (r74v25 java.util.List)
      (r74v26 java.util.List)
      (r74v27 java.util.List)
      (r74v28 java.util.List)
      (r74v29 java.util.List)
      (r74v30 java.util.List)
      (r74v31 java.util.List)
      (r74v32 java.util.List)
      (r74v33 java.util.List)
      (r74v34 java.util.List)
      (r74v35 java.util.List)
      (r74v36 java.util.List)
      (r74v37 java.util.List)
      (r74v38 java.util.List)
      (r74v39 java.util.List)
      (r74v40 java.util.List)
      (r74v41 java.util.List)
      (r74v42 java.util.List)
      (r74v43 java.util.List)
      (r74v44 java.util.List)
      (r74v45 java.util.List)
      (r74v46 java.util.List)
      (r74v47 java.util.List)
      (r74v48 java.util.List)
      (r74v49 java.util.List)
      (r74v50 java.util.List)
      (r74v51 java.util.List)
      (r74v52 java.util.List)
      (r74v53 java.util.List)
      (r74v54 java.util.List)
      (r74v55 java.util.List)
      (r74v56 java.util.List)
      (r74v57 java.util.List)
      (r74v58 java.util.List)
      (r74v59 java.util.List)
      (r74v60 java.util.List)
      (r74v61 java.util.List)
      (r74v62 java.util.List)
      (r74v63 java.util.List)
      (r74v64 java.util.List)
      (r74v65 java.util.List)
      (r74v66 java.util.List)
      (r74v67 java.util.List)
      (r74v68 java.util.List)
      (r74v69 java.util.List)
      (r74v72 java.util.List)
     binds: [B:217:0x05c0, B:214:0x05af, B:211:0x059e, B:208:0x058d, B:205:0x057c, B:202:0x056b, B:199:0x0559, B:196:0x0547, B:193:0x0535, B:190:0x0523, B:187:0x0511, B:184:0x04ff, B:181:0x04ed, B:178:0x04db, B:175:0x04c9, B:172:0x04b7, B:169:0x04a5, B:166:0x0493, B:163:0x0481, B:160:0x046f, B:157:0x045d, B:154:0x044b, B:151:0x043a, B:148:0x0428, B:145:0x0416, B:142:0x0404, B:139:0x03f2, B:136:0x03e0, B:133:0x03ce, B:130:0x03bc, B:127:0x03ab, B:124:0x0399, B:121:0x0388, B:118:0x0376, B:115:0x0364, B:112:0x0352, B:109:0x0340, B:106:0x032e, B:103:0x031c, B:100:0x030a, B:97:0x02f8, B:94:0x02e6, B:91:0x02d4, B:88:0x02c2, B:85:0x02b0, B:82:0x029e, B:79:0x028c, B:76:0x027a, B:73:0x0268, B:70:0x0257, B:67:0x0245, B:64:0x0233, B:61:0x0221, B:58:0x020f, B:55:0x01fe, B:52:0x01ec, B:49:0x01da, B:46:0x01c8, B:43:0x01b6, B:40:0x01a4, B:37:0x0192, B:34:0x0181, B:31:0x016f, B:28:0x015e, B:25:0x014c, B:22:0x013b, B:19:0x0129, B:16:0x0117, B:13:0x0105, B:11:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzeyc(android.util.JsonReader r76) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instruction units count: 2724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyc.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (TapjoyConstants.TJC_PLUGIN_NATIVE.equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if (TJAdUnitConstants.String.LANDSCAPE.equalsIgnoreCase(str)) {
            return 6;
        }
        return TJAdUnitConstants.String.PORTRAIT.equalsIgnoreCase(str) ? 7 : -1;
    }
}
