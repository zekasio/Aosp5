package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwq {
    public static zzgwq zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgwl(cls.getSimpleName()) : new zzgwn(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
