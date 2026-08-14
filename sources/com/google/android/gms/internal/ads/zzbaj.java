package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbaj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zzbaj(int i, String str, Object obj, zzbai zzbaiVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbaj zzf(int i, String str, float f) {
        return new zzbag(1, str, Float.valueOf(f));
    }

    public static zzbaj zzg(int i, String str, int i2) {
        return new zzbae(1, str, Integer.valueOf(i2));
    }

    public static zzbaj zzh(int i, String str, long j) {
        return new zzbaf(1, str, Long.valueOf(j));
    }

    public static zzbaj zzi(int i, String str, Boolean bool) {
        return new zzbad(i, str, bool);
    }

    public static zzbaj zzj(int i, String str, String str2) {
        return new zzbah(1, str, str2);
    }

    public static zzbaj zzk(int i, String str) {
        zzbaj zzbajVarZzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzbajVarZzj);
        return zzbajVarZzj;
    }

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
