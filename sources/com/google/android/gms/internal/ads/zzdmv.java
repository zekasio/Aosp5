package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmv implements zzcvj {
    private final zzcei zza;

    zzdmv(zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbn(Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbp(Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbq(Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.onResume();
        }
    }
}
