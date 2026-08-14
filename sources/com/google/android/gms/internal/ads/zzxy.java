package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxy {
    public static void zza(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzee.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
