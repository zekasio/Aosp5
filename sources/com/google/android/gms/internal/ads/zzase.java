package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzase extends zzasm {
    private final StackTraceElement[] zzi;

    public zzase(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzaqxVar, "mI62XAU6hkSJHBt5knDDlPT1Fqr4dlfaZ+n4XjM0AiKKuoUuq7VAlzpsb6e8DhEf", "XDZeV64PENx+9tx6tUBxGqpVXuPWj1qf1leYJ9jGf1Q=", zzamvVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaqo zzaqoVar = new zzaqo((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzaqoVar.zza.longValue());
                if (zzaqoVar.zzb.booleanValue()) {
                    this.zze.zzac(true != zzaqoVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
