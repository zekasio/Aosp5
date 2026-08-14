package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzark extends zzasm {
    public zzark(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "/ZAb7KorQmWKePlIS1me8K7MD7h0ktYv6a7eQSuPpVWqAkHhSCd1Ee0//urPm/Fl", "19q79G2Hoay9HG8W07mTTjUi2VQ2m7mmzg4dFY+yKc8=", zzamvVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i = 1;
            boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzamv zzamvVar = this.zze;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzamvVar.zzaa(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
