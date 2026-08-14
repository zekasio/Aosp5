package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzctp implements zzcwc, zzcvj {
    private final Context zza;
    private final zzeyc zzb;
    private final zzbrh zzc;

    public zzctp(Context context, zzeyc zzeycVar, zzbrh zzbrhVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeycVar;
        this.zzc = zzbrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbn(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbp(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        zzbri zzbriVar = this.zzb.zzae;
        if (zzbriVar == null || !zzbriVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
