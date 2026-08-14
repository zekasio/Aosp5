package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasi extends zzasm {
    public zzasi(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "1vYYgGa1kSZn3v+ZOQuFaiTzDZd9yTFr5T4txRDl4On2u8cPqYe1RveVsleWcOe5", "9xUiBAiiy8Ja1KXne+aVhWFydz8zlt4gmIBXdZB7YyQ=", zzamvVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzag(3);
        boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (zBooleanValue) {
                this.zze.zzag(2);
            } else {
                this.zze.zzag(1);
            }
        }
    }
}
