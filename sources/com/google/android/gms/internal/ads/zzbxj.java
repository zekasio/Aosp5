package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbxj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxk zza;
    private final String zzb;

    public zzbxj(zzbxk zzbxkVar, String str) {
        this.zza = zzbxkVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbxi zzbxiVar : this.zza.zzb) {
                zzbxiVar.zza.zzb(zzbxiVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
