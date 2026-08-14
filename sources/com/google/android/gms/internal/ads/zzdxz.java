package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxz extends zzbtc {
    private final Context zza;
    private final zzeqv zzb;
    private final zzeqt zzc;
    private final zzdyh zzd;
    private final zzfuu zze;
    private final zzdye zzf;
    private final zzbtz zzg;

    zzdxz(Context context, zzeqv zzeqvVar, zzeqt zzeqtVar, zzdye zzdyeVar, zzdyh zzdyhVar, zzfuu zzfuuVar, zzbtz zzbtzVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeqvVar;
        this.zzc = zzeqtVar;
        this.zzf = zzdyeVar;
        this.zzd = zzdyhVar;
        this.zze = zzfuuVar;
        this.zzg = zzbtzVar;
    }

    private final void zzc(zzfut zzfutVar, zzbtg zzbtgVar) {
        zzfuj.zzq(zzfuj.zzm(zzfua.zzv(zzfutVar), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzezw.zza((InputStream) obj));
            }
        }, zzbzn.zza), new zzdxy(this, zzbtgVar), zzbzn.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfut zzb(com.google.android.gms.internal.ads.zzbsv r9, int r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxz.zzb(com.google.android.gms.internal.ads.zzbsv, int):com.google.android.gms.internal.ads.zzfut");
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zze(zzbsv zzbsvVar, zzbtg zzbtgVar) {
        zzc(zzb(zzbsvVar, Binder.getCallingUid()), zzbtgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zzf(zzbsr zzbsrVar, zzbtg zzbtgVar) {
        int callingUid = Binder.getCallingUid();
        zzeqv zzeqvVar = this.zzb;
        zzeqvVar.zza(new zzeqk(zzbsrVar, callingUid));
        final zzeqw zzeqwVarZzb = zzeqvVar.zzb();
        zzfda zzfdaVarZzb = zzeqwVarZzb.zzb();
        zzfcf zzfcfVarZza = zzfdaVarZzb.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzi()).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzeqwVarZzb.zza().zza(new JSONObject());
            }
        }).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxu
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzfcfVarZza, zzbtgVar);
        if (((Boolean) zzbck.zzd.zze()).booleanValue()) {
            final zzdyh zzdyhVar = this.zzd;
            zzdyhVar.getClass();
            zzfcfVarZza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxs
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyhVar.zzb();
                }
            }, this.zze);
        }
    }
}
