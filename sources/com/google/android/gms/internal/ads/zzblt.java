package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblt implements zzbkk, zzbls {
    private final zzbls zza;
    private final HashSet zzb = new HashSet();

    public zzblt(zzbls zzblsVar) {
        this.zza = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, com.google.android.gms.internal.ads.zzbkv
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, com.google.android.gms.internal.ads.zzbkv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbkj.zzc(this, str, str2);
    }

    public final void zzc() {
        for (AbstractMap.SimpleEntry simpleEntry : this.zzb) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbhp) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbhp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbkj.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, com.google.android.gms.internal.ads.zzbki
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbkj.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbkj.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzq(String str, zzbhp zzbhpVar) {
        this.zza.zzq(str, zzbhpVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbhpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzr(String str, zzbhp zzbhpVar) {
        this.zza.zzr(str, zzbhpVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbhpVar));
    }
}
