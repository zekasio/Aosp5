package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexp implements zzeir {
    private final Context zza;
    private final Executor zzb;
    private final zzcgd zzc;
    private final zzexf zzd;
    private final zzevt zze;
    private final zzeyp zzf;
    private final zzfep zzg;
    private final zzeyv zzh;
    private zzfut zzi;

    public zzexp(Context context, Executor executor, zzcgd zzcgdVar, zzevt zzevtVar, zzexf zzexfVar, zzeyv zzeyvVar, zzeyp zzeypVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgdVar;
        this.zze = zzevtVar;
        this.zzd = zzexfVar;
        this.zzh = zzeyvVar;
        this.zzf = zzeypVar;
        this.zzg = zzcgdVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdly zzk(zzevr zzevrVar) {
        zzexo zzexoVar = (zzexo) zzevrVar;
        zzdly zzdlyVarZzh = this.zzc.zzh();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zza);
        zzctxVar.zzh(zzexoVar.zza);
        String str = zzexoVar.zzb;
        zzctxVar.zzg(this.zzf);
        zzdlyVarZzh.zzd(zzctxVar.zzi());
        zzdlyVarZzh.zzc(new zzczz().zzn());
        return zzdlyVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzeir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl r9, java.lang.String r10, com.google.android.gms.internal.ads.zzeip r11, com.google.android.gms.internal.ads.zzeiq r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexp.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeip, com.google.android.gms.internal.ads.zzeiq):boolean");
    }

    final /* synthetic */ void zzi() {
        this.zzd.zza(zzezx.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
