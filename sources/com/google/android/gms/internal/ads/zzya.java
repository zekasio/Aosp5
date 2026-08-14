package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzya implements zzxz {
    private final WindowManager zza;

    private zzya(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxz zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzya(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzb(zzxx zzxxVar) {
        zzyd.zzb(zzxxVar.zza, this.zza.getDefaultDisplay());
    }
}
