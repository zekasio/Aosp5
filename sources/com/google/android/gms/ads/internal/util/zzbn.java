package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzaku;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzs;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbn extends zzako {
    private final zzbzs zza;
    private final zzbyz zzb;

    public zzbn(String str, Map map, zzbzs zzbzsVar) {
        super(0, str, new zzbm(zzbzsVar));
        this.zza = zzbzsVar;
        zzbyz zzbyzVar = new zzbyz(null);
        this.zzb = zzbyzVar;
        zzbyzVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzako
    protected final zzaku zzh(zzakk zzakkVar) {
        return zzaku.zzb(zzakkVar, zzall.zzb(zzakkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzako
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzakk zzakkVar = (zzakk) obj;
        this.zzb.zzf(zzakkVar.zzc, zzakkVar.zza);
        zzbyz zzbyzVar = this.zzb;
        byte[] bArr = zzakkVar.zzb;
        if (zzbyz.zzl() && bArr != null) {
            zzbyzVar.zzh(bArr);
        }
        this.zza.zzd(zzakkVar);
    }
}
