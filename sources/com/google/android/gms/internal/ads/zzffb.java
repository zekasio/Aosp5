package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffb {
    private final zzeeh zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzeyp zzf;
    private final zzeyq zzg;
    private final Clock zzh;
    private final zzapw zzi;

    public zzffb(zzeeh zzeehVar, zzbzg zzbzgVar, String str, String str2, Context context, zzeyp zzeypVar, zzeyq zzeyqVar, Clock clock, zzapw zzapwVar) {
        this.zza = zzeehVar;
        this.zzb = zzbzgVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzeypVar;
        this.zzg = zzeyqVar;
        this.zzh = clock;
        this.zzi = zzapwVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzh(String str) {
        return TextUtils.isEmpty(str) ? "" : zzbyz.zzl() ? "fakeForAdDebugLog" : str;
    }

    private static String zzi(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzeyo zzeyoVar, zzeyc zzeycVar, List list) {
        return zzd(zzeyoVar, zzeycVar, false, "", "", list);
    }

    public final List zzd(zzeyo zzeyoVar, zzeyc zzeycVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strZzi = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzeyoVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE), "@gw_sdkver@", this.zzb);
            if (zzeycVar != null) {
                strZzi = zzbxh.zzc(zzi(zzi(zzi(strZzi, "@gw_qdata@", zzeycVar.zzz), "@gw_adnetid@", zzeycVar.zzy), "@gw_allocid@", zzeycVar.zzx), this.zze, zzeycVar.zzX);
            }
            String strZzi2 = zzi(zzi(zzi(strZzi, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzda)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzi2);
            }
            if (this.zzi.zzf(Uri.parse(strZzi2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzi2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzi2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzi2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzeyc r10, java.util.List r11, com.google.android.gms.internal.ads.zzbud r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzdb
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzeyq r4 = r9.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfnq r4 = com.google.android.gms.internal.ads.zzfnq.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzeyp r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzeyp r4 = r9.zzf
        L37:
            com.google.android.gms.internal.ads.zzfnq r4 = com.google.android.gms.internal.ads.zzfnq.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfez r5 = new com.google.android.gms.internal.ads.zzfnj() { // from class: com.google.android.gms.internal.ads.zzfez
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfez r0 = new com.google.android.gms.internal.ads.zzfez
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzfez) com.google.android.gms.internal.ads.zzfez.zza com.google.android.gms.internal.ads.zzfez
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfez.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfez.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfnj
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzeyp r1 = (com.google.android.gms.internal.ads.zzeyp) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzffb.zza(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfez.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfnq r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzffa r7 = new com.google.android.gms.internal.ads.zzfnj() { // from class: com.google.android.gms.internal.ads.zzffa
                static {
                    /*
                        com.google.android.gms.internal.ads.zzffa r0 = new com.google.android.gms.internal.ads.zzffa
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzffa) com.google.android.gms.internal.ads.zzffa.zza com.google.android.gms.internal.ads.zzffa
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffa.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffa.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfnj
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzeyp r1 = (com.google.android.gms.internal.ads.zzeyp) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzffb.zzb(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffa.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfnq r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzi(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzi(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzX
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbxh.zzc(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzbza.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffb.zze(com.google.android.gms.internal.ads.zzeyc, java.util.List, com.google.android.gms.internal.ads.zzbud):java.util.List");
    }
}
