package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarz extends zzasm {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzarz(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "yYeL9qjPbrcPTY9ceVqgR0oHzmGoUGEuRTuU4UpOsMR57oewRJ2iJf5VjUsh44nU", "0QJdUleGFbUoMNzD5fazqxL5C8zhAUBMAOlt+v3NY80=", zzamvVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, null);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
