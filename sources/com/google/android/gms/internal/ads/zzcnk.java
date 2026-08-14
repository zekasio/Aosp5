package com.google.android.gms.internal.ads;

import com.tapjoy.TapjoyConstants;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnk implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzcnk(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcrc) this.zza).zza();
        zzbzg zzbzgVarZza = ((zzcgu) this.zzb).zza();
        JSONObject jSONObject = (JSONObject) this.zzc.zzb();
        String str = (String) this.zzd.zzb();
        boolean zEquals = TapjoyConstants.TJC_PLUGIN_NATIVE.equals(str);
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatb(UUID.randomUUID().toString(), zzbzgVarZza, str, jSONObject, false, zEquals);
    }
}
