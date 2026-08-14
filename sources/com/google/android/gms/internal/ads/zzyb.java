package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyb implements DisplayManager.DisplayListener, zzxz {
    private final DisplayManager zza;
    private zzxx zzb;

    private zzyb(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxz zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(TJAdUnitConstants.String.DISPLAY);
        if (displayManager != null) {
            return new zzyb(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzxx zzxxVar = this.zzb;
        if (zzxxVar == null || i != 0) {
            return;
        }
        zzyd.zzb(zzxxVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzb(zzxx zzxxVar) {
        this.zzb = zzxxVar;
        this.zza.registerDisplayListener(this, zzew.zzD(null));
        zzyd.zzb(zzxxVar.zza, zzd());
    }
}
