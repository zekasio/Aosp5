package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczi extends zzczy implements zzbgk {
    public zzczi(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final synchronized void zzbz(final String str, final String str2) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
