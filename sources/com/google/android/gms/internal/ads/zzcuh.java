package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcuh extends com.google.android.gms.ads.internal.client.zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeay zzh;
    private final Bundle zzi;

    public zzcuh(zzeyc zzeycVar, String str, zzeay zzeayVar, zzeyf zzeyfVar, String str2) {
        String string = null;
        this.zzb = zzeycVar == null ? null : zzeycVar.zzac;
        this.zzc = str2;
        this.zzd = zzeyfVar == null ? null : zzeyfVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = zzeycVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzeayVar.zzc();
        this.zzh = zzeayVar;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgs)).booleanValue() || zzeyfVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzeyfVar.zzj;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziw)).booleanValue() || zzeyfVar == null || TextUtils.isEmpty(zzeyfVar.zzh)) ? "" : zzeyfVar.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzeay zzeayVar = this.zzh;
        if (zzeayVar != null) {
            return zzeayVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
