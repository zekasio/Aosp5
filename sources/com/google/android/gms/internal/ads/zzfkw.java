package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkw extends zzfkt {
    private static zzfkw zzc;

    private zzfkw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfkw zzi(Context context) {
        zzfkw zzfkwVar;
        synchronized (zzfkw.class) {
            if (zzc == null) {
                zzc = new zzfkw(context);
            }
            zzfkwVar = zzc;
        }
        return zzfkwVar;
    }

    public final zzfks zzh(long j, boolean z) throws IOException {
        synchronized (zzfkw.class) {
            if (zzo()) {
                return zzb(null, null, j, z);
            }
            return new zzfks();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfkw.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
