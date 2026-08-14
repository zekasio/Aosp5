package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejt implements zzepn {
    private final zzepn zza;
    private final zzeyx zzb;
    private final Context zzc;
    private final zzbyj zzd;

    public zzejt(zzelk zzelkVar, zzeyx zzeyxVar, Context context, zzbyj zzbyjVar) {
        this.zza = zzelkVar;
        this.zzb = zzeyxVar;
        this.zzc = context;
        this.zzd = zzbyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzl(this.zza.zzb(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return this.zza.zzc((zzeps) obj);
            }
        }, zzbzn.zzf);
    }

    final /* synthetic */ zzeju zzc(zzeps zzepsVar) {
        String str;
        boolean z;
        String strZzm;
        int i;
        float f;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzm = null;
            i = 0;
            f = 0.0f;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            strZzm = this.zzd.zzh().zzm();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzqVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzqVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzeju(zzqVar, str, z, sb.toString(), f, i2, i, strZzm, this.zzb.zzp);
    }
}
