package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzess implements zzgwy {
    public static zzepq zza(Context context, zzbxx zzbxxVar, zzbxy zzbxyVar, Object obj, zzeqi zzeqiVar, zzery zzeryVar, zzgws zzgwsVar, zzgws zzgwsVar2, zzgws zzgwsVar3, zzgws zzgwsVar4, zzgws zzgwsVar5, zzgws zzgwsVar6, zzgws zzgwsVar7, zzgws zzgwsVar8, zzgws zzgwsVar9, Executor executor, zzfen zzfenVar, zzdpi zzdpiVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzerr) obj);
        hashSet.add(zzeqiVar);
        hashSet.add(zzeryVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfm)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfn)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfo)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfp)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzft)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfu)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcw)).booleanValue()) {
            hashSet.add((zzepn) zzgwsVar9.zzb());
        }
        return new zzepq(context, executor, hashSet, zzfenVar, zzdpiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
