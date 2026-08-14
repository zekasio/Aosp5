package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxv extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzxt zzd;
    private boolean zze;

    /* synthetic */ zzxv(zzxt zzxtVar, SurfaceTexture surfaceTexture, boolean z, zzxu zzxuVar) {
        super(surfaceTexture);
        this.zzd = zzxtVar;
        this.zza = z;
    }

    public static zzxv zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdl.zzf(z2);
        return new zzxt().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        String strEglQueryString;
        int i;
        if (!zzc) {
            if (zzew.zza >= 24 && ((zzew.zza >= 26 || !("samsung".equals(zzew.zzc) || "XT1650".equals(zzew.zzd))) && ((zzew.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                i = 2;
                if (strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    i = 1;
                }
            } else {
                i = 0;
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
