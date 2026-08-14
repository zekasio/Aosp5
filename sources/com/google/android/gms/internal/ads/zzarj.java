package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarj extends zzasm {
    public zzarj(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "GUdp6/tGzuoJNZywBLuqH0y3dpUv7J3MkxyADruu/kitYzedjgPwRFENlGnCDlJr", "hxygDHcsiGHhJW67le8OZpQ9Ae4yI4lOwJgTFo0BE4w=", zzamvVar, i, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zzf.invoke(null, null);
        synchronized (this.zze) {
            this.zze.zzg(str);
        }
    }
}
