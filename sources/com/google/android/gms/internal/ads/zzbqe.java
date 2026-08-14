package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqe extends zzbqf implements zzbhp {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcei zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbab zzk;
    private float zzl;
    private int zzm;

    public zzbqe(zzcei zzceiVar, Context context, zzbab zzbabVar) {
        super(zzceiVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzceiVar;
        this.zzi = context;
        this.zzk = zzbabVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbyt.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbyt.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.zzh.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] iArrZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activityZzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzbyt.zzw(this.zza, iArrZzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = zzbyt.zzw(this.zza, iArrZzN[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbqd zzbqdVar = new zzbqd();
        zzbab zzbabVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbqdVar.zze(zzbabVar.zza(intent));
        zzbab zzbabVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbqdVar.zzc(zzbabVar2.zza(intent2));
        zzbqdVar.zza(this.zzk.zzb());
        zzbqdVar.zzd(this.zzk.zzc());
        zzbqdVar.zzb(true);
        boolean z = zzbqdVar.zza;
        boolean z2 = zzbqdVar.zzb;
        boolean z3 = zzbqdVar.zzc;
        boolean z4 = zzbqdVar.zzd;
        boolean z5 = zzbqdVar.zze;
        zzcei zzceiVar = this.zzh;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzceiVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            zzbza.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[PHI: r2
      0x006f: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:11:0x0046, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.zzi
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L15
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r6.zzi
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.google.android.gms.ads.internal.util.zzs.zzO(r0)
            r0 = r0[r1]
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.gms.internal.ads.zzcei r2 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r2 = r2.zzO()
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzcei r2 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r2 = r2.zzO()
            boolean r2 = r2.zzi()
            if (r2 != 0) goto L88
        L2a:
            com.google.android.gms.internal.ads.zzcei r2 = r6.zzh
            int r2 = r2.getWidth()
            com.google.android.gms.internal.ads.zzcei r3 = r6.zzh
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbaj r4 = com.google.android.gms.internal.ads.zzbar.zzP
            com.google.android.gms.internal.ads.zzbap r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6f
            if (r2 != 0) goto L5c
            com.google.android.gms.internal.ads.zzcei r2 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r2 = r2.zzO()
            if (r2 == 0) goto L5b
            com.google.android.gms.internal.ads.zzcei r2 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r2 = r2.zzO()
            int r2 = r2.zzb
            goto L5c
        L5b:
            r2 = 0
        L5c:
            if (r3 != 0) goto L6f
            com.google.android.gms.internal.ads.zzcei r3 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r3 = r3.zzO()
            if (r3 == 0) goto L70
            com.google.android.gms.internal.ads.zzcei r1 = r6.zzh
            com.google.android.gms.internal.ads.zzcfx r1 = r1.zzO()
            int r1 = r1.zza
            goto L70
        L6f:
            r1 = r3
        L70:
            com.google.android.gms.internal.ads.zzbyt r3 = com.google.android.gms.ads.internal.client.zzay.zzb()
            android.content.Context r4 = r6.zzi
            int r2 = r3.zzb(r4, r2)
            r6.zzf = r2
            com.google.android.gms.internal.ads.zzbyt r2 = com.google.android.gms.ads.internal.client.zzay.zzb()
            android.content.Context r3 = r6.zzi
            int r1 = r2.zzb(r3, r1)
            r6.zzg = r1
        L88:
            int r0 = r8 - r0
            int r1 = r6.zzf
            int r2 = r6.zzg
            r6.zzf(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.zzcei r0 = r6.zzh
            com.google.android.gms.internal.ads.zzcfv r0 = r0.zzN()
            r0.zzB(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqe.zzb(int, int):void");
    }
}
