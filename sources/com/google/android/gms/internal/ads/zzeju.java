package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeju implements zzepm {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeju(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzezi.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzezi.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzezi.zzg(bundle, "ene", true, this.zza.zzj);
        zzezi.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzezi.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzezi.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzezi.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzezi.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzezi.zzc(bundle, "format", this.zzb);
        zzezi.zzf(bundle, "fluid", TJAdUnitConstants.String.HEIGHT, this.zzc);
        zzezi.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(r0));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzezi.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(r0));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(TJAdUnitConstants.String.HEIGHT, this.zza.zzb);
            bundle2.putInt(TJAdUnitConstants.String.WIDTH, this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt(TJAdUnitConstants.String.HEIGHT, zzqVar.zzb);
                bundle3.putInt(TJAdUnitConstants.String.WIDTH, zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
