package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbho {
    public static final zzbhp zza = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgt
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzbza.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcfjVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbki) zzcfjVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbhp zzb = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgu
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhC)).booleanValue()) {
                zzbza.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzbza.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcfjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbki) zzcfjVar).zzd("openableApp", map2);
        }
    };
    public static final zzbhp zzc = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgm
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzbho.zzc((zzcfj) obj, map);
        }
    };
    public static final zzbhp zzd = new zzbhg();
    public static final zzbhp zze = new zzbhh();
    public static final zzbhp zzf = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgs
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfj zzcfjVar = (zzcfj) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzbza.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcfjVar.getContext(), ((zzcfr) zzcfjVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbhp zzg = new zzbhi();
    public static final zzbhp zzh = new zzbhj();
    public static final zzbhp zzi = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgr
        @Override // com.google.android.gms.internal.ads.zzbhp
        public final void zza(Object obj, Map map) {
            zzcfq zzcfqVar = (zzcfq) obj;
            zzbhp zzbhpVar = zzbho.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzapw zzapwVarZzI = zzcfqVar.zzI();
                if (zzapwVarZzI != null) {
                    zzapwVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbhp zzj = new zzbhk();
    public static final zzbhp zzk = new zzbhl();
    public static final zzbhp zzl = new zzcci();
    public static final zzbhp zzm = new zzccj();
    public static final zzbhp zzn = new zzbgl();
    public static final zzbid zzo = new zzbid();
    public static final zzbhp zzp = new zzbhm();
    public static final zzbhp zzq = new zzbhn();
    public static final zzbhp zzr = new zzbgv();
    public static final zzbhp zzs = new zzbgw();
    public static final zzbhp zzt = new zzbgx();
    public static final zzbhp zzu = new zzbgy();
    public static final zzbhp zzv = new zzbgz();
    public static final zzbhp zzw = new zzbha();
    public static final zzbhp zzx = new zzbhb();
    public static final zzbhp zzy = new zzbhc();
    public static final zzbhp zzz = new zzbhd();
    public static final zzbhp zzA = new zzbhe();

    public static zzbhp zza(final zzdcc zzdccVar) {
        return new zzbhp() { // from class: com.google.android.gms.internal.ads.zzbgq
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzcei zzceiVar = (zzcei) obj;
                zzbho.zzd(map, zzdccVar);
                String str = (String) map.get("u");
                if (str == null) {
                    zzbza.zzj("URL missing from click GMSG.");
                } else {
                    zzfuj.zzq(zzbho.zzb(zzceiVar, str), new zzbhf(zzceiVar), zzbzn.zza);
                }
            }
        };
    }

    public static zzfut zzb(zzcei zzceiVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzapw zzapwVarZzI = zzceiVar.zzI();
            if (zzapwVarZzI != null && zzapwVarZzI.zzf(uriZza)) {
                uriZza = zzapwVarZzI.zza(uriZza, zzceiVar.getContext(), zzceiVar.zzF(), zzceiVar.zzi());
            }
        } catch (zzapx unused) {
            zzbza.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strZzb = zzbxh.zzb(uriZza, zzceiVar.getContext());
        long jLongValue = ((Long) zzbcj.zze.zze()).longValue();
        return (jLongValue <= 0 || jLongValue > 230500000) ? zzfuj.zzh(strZzb) : zzfuj.zze(zzfuj.zzl(zzfuj.zze(zzfua.zzv(zzceiVar.zzR()), Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgn
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbhp zzbhpVar = zzbho.zza;
                if (!((Boolean) zzbcj.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzbzn.zzf), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgo
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzfnj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = r1
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbhp r1 = com.google.android.gms.internal.ads.zzbho.zza
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbbw r1 = com.google.android.gms.internal.ads.zzbcj.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbbw r1 = com.google.android.gms.internal.ads.zzbcj.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbbw r2 = com.google.android.gms.internal.ads.zzbcj.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgo.apply(java.lang.Object):java.lang.Object");
            }
        }, zzbzn.zzf), Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbgp
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str2 = strZzb;
                Throwable th = (Throwable) obj;
                zzbhp zzbhpVar = zzbho.zza;
                if (((Boolean) zzbcj.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzbzn.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcfj r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbho.zzc(com.google.android.gms.internal.ads.zzcfj, java.util.Map):void");
    }

    public static void zzd(Map map, zzdcc zzdccVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzje)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE) && zzdccVar != null) {
            zzdccVar.zzr();
        }
    }
}
