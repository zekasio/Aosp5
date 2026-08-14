package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzari extends zzasm {
    private final Activity zzi;
    private final View zzj;

    public zzari(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, View view, Activity activity) {
        super(zzaqxVar, "igtIy1RPdtSwwFM0MzyB8nIIZ5v2CDGgVI3q8yVZqtR6IDXyW0WRS0Qe3gwz+vAY", "frdByYsbmru5qm4CvqXIK0tqT/G3yjsT+PIiwI69Mdg=", zzamvVar, i, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzci);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, bool);
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
