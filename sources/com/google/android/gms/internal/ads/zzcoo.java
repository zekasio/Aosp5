package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    public zzcoo(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9, zzgxl zzgxlVar10) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
        this.zzh = zzgxlVar8;
        this.zzi = zzgxlVar9;
        this.zzj = zzgxlVar10;
    }

    public static zzcon zzc(zzcql zzcqlVar, Context context, zzeyd zzeydVar, View view, zzcei zzceiVar, zzcqk zzcqkVar, zzdgt zzdgtVar, zzdce zzdceVar, zzgws zzgwsVar, Executor executor) {
        return new zzcon(zzcqlVar, context, zzeydVar, view, zzceiVar, zzcqkVar, zzdgtVar, zzdceVar, zzgwsVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcon zzb() {
        return new zzcon(((zzcsl) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcou) this.zzc).zza(), ((zzcot) this.zzd).zza(), ((zzcpf) this.zze).zza(), ((zzcov) this.zzf).zza(), ((zzdeq) this.zzg).zza(), (zzdce) this.zzh.zzb(), zzgwx.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
