package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwi extends zzczy implements zzbgi {
    private final Bundle zzb;

    zzcwi(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbgi
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcwh
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
