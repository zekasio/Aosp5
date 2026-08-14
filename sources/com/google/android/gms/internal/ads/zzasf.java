package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasf extends zzasm {
    public zzasf(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "p7ASQw11uHfpr3F0dNO7FI4pxn6scCXfF77Ws5Wp6CJNKFLlAI1vk4wHUcU9a/Df", "Cm9abA75+yJPlHfzXp8tIbRygnDIUgXcqbjtuqZQZF0=", zzamvVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzaqs zzaqsVar = new zzaqs((String) this.zzf.invoke(null, null));
            this.zze.zzp(zzaqsVar.zza.longValue());
            this.zze.zzq(zzaqsVar.zzb.longValue());
        }
    }
}
