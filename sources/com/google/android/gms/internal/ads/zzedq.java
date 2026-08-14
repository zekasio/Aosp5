package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedq implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    private final Executor zzc;

    public zzedq(Context context, zzdes zzdesVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdesVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzeyo zzeyoVar, int i) {
        return zzeyoVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        zzdgi zzdgiVarZzae;
        zzbnq zzbnqVarZzD = ((zzezs) zzeawVar.zzb).zzD();
        zzbnr zzbnrVarZzE = ((zzezs) zzeawVar.zzb).zzE();
        zzbnu zzbnuVarZzd = ((zzezs) zzeawVar.zzb).zzd();
        if (zzbnuVarZzd != null && zzc(zzeyoVar, 6)) {
            zzdgiVarZzae = zzdgi.zzs(zzbnuVarZzd);
        } else if (zzbnqVarZzD != null && zzc(zzeyoVar, 6)) {
            zzdgiVarZzae = zzdgi.zzaf(zzbnqVarZzD);
        } else if (zzbnqVarZzD != null && zzc(zzeyoVar, 2)) {
            zzdgiVarZzae = zzdgi.zzad(zzbnqVarZzD);
        } else if (zzbnrVarZzE != null && zzc(zzeyoVar, 6)) {
            zzdgiVarZzae = zzdgi.zzag(zzbnrVarZzE);
        } else {
            if (zzbnrVarZzE == null || !zzc(zzeyoVar, 1)) {
                throw new zzeek(1, "No native ad mappers");
            }
            zzdgiVarZzae = zzdgi.zzae(zzbnrVarZzE);
        }
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(zzdgiVarZzae.zzc()))) {
            throw new zzeek(1, "No corresponding native ad listener");
        }
        zzdgk zzdgkVarZze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdgu(zzdgiVarZzae), new zzdij(zzbnrVarZzE, zzbnqVarZzD, zzbnuVarZzd, null));
        ((zzecq) zzeawVar.zzc).zzc(zzdgkVarZze.zzj());
        zzdgkVarZze.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzc);
        return zzdgkVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        zzezs zzezsVar = (zzezs) zzeawVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzeyoVar.zza.zza.zzd;
        String string = zzeycVar.zzw.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzeycVar.zzt);
        zzbnl zzbnlVar = (zzbnl) zzeawVar.zzc;
        zzeyx zzeyxVar = zzeyoVar.zza.zza;
        zzezsVar.zzp(context, zzlVar, string, strZzl, zzbnlVar, zzeyxVar.zzi, zzeyxVar.zzg);
    }
}
