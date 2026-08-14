package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdcz {
    private final zzdee zza;
    private final zzcei zzb;

    public zzdcz(zzdee zzdeeVar, zzcei zzceiVar) {
        this.zza = zzdeeVar;
        this.zzb = zzceiVar;
    }

    public static final zzdbu zzh(zzfdz zzfdzVar) {
        return new zzdbu(zzfdzVar, zzbzn.zzf);
    }

    public static final zzdbu zzi(zzdej zzdejVar) {
        return new zzdbu(zzdejVar, zzbzn.zzf);
    }

    public final View zza() {
        zzcei zzceiVar = this.zzb;
        if (zzceiVar == null) {
            return null;
        }
        return zzceiVar.zzG();
    }

    public final View zzb() {
        zzcei zzceiVar = this.zzb;
        if (zzceiVar != null) {
            return zzceiVar.zzG();
        }
        return null;
    }

    public final zzcei zzc() {
        return this.zzb;
    }

    public final zzdbu zzd(Executor executor) {
        final zzcei zzceiVar = this.zzb;
        return new zzdbu(new zzczb() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzczb
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL;
                zzcei zzceiVar2 = zzceiVar;
                if (zzceiVar2 == null || (zzlVarZzL = zzceiVar2.zzL()) == null) {
                    return;
                }
                zzlVarZzL.zzb();
            }
        }, executor);
    }

    public final zzdee zze() {
        return this.zza;
    }

    public Set zzf(zzctm zzctmVar) {
        return Collections.singleton(new zzdbu(zzctmVar, zzbzn.zzf));
    }

    public Set zzg(zzctm zzctmVar) {
        return Collections.singleton(new zzdbu(zzctmVar, zzbzn.zzf));
    }
}
