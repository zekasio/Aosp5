package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhg implements zzbhp {
    zzbhg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (zzceiVar.zzJ() != null) {
            zzceiVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzceiVar.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzM = zzceiVar.zzM();
        if (zzlVarZzM != null) {
            zzlVarZzM.zzb();
        } else {
            zzbza.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
