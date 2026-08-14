package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzetk implements zzeir {
    protected final zzcgd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeua zzd;
    private final zzevt zze;
    private final zzbzg zzf;
    private final ViewGroup zzg;
    private final zzfep zzh;
    private final zzeyv zzi;

    @Nullable
    private zzfut zzj;

    protected zzetk(Context context, Executor executor, zzcgd zzcgdVar, zzevt zzevtVar, zzeua zzeuaVar, zzeyv zzeyvVar, zzbzg zzbzgVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgdVar;
        this.zze = zzevtVar;
        this.zzd = zzeuaVar;
        this.zzi = zzeyvVar;
        this.zzf = zzbzgVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgdVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzctv zzm(zzevr zzevrVar) {
        zzetj zzetjVar = (zzetj) zzevrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
            zzcoh zzcohVar = new zzcoh(this.zzg);
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzd(this.zzb);
            zzctxVar.zzh(zzetjVar.zza);
            zzctz zzctzVarZzi = zzctxVar.zzi();
            zzczz zzczzVar = new zzczz();
            zzczzVar.zzc(this.zzd, this.zzc);
            zzczzVar.zzl(this.zzd, this.zzc);
            return zze(zzcohVar, zzctzVarZzi, zzczzVar.zzn());
        }
        zzeua zzeuaVarZzi = zzeua.zzi(this.zzd);
        zzczz zzczzVar2 = new zzczz();
        zzczzVar2.zzb(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzg(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzh(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzi(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzc(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzl(zzeuaVarZzi, this.zzc);
        zzczzVar2.zzm(zzeuaVarZzi);
        zzcoh zzcohVar2 = new zzcoh(this.zzg);
        zzctx zzctxVar2 = new zzctx();
        zzctxVar2.zzd(this.zzb);
        zzctxVar2.zzh(zzetjVar.zza);
        return zze(zzcohVar2, zzctxVar2.zzi(), zzczzVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzfut zzfutVar = this.zzj;
        return (zzfutVar == null || zzfutVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzeir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzeip r10, com.google.android.gms.internal.ads.zzeiq r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetk.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeip, com.google.android.gms.internal.ads.zzeiq):boolean");
    }

    protected abstract zzctv zze(zzcoh zzcohVar, zzctz zzctzVar, zzdab zzdabVar);

    final /* synthetic */ void zzk() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
