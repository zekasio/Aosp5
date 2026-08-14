package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarx extends zzasm {
    private final zzaqa zzi;
    private final long zzj;
    private final long zzk;

    public zzarx(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, zzaqa zzaqaVar, long j, long j2) {
        super(zzaqxVar, "CchySZwZp0zgVfg6SBe+R4XjFGRJyETMFDNmz2TJwAQ/SC/95iAQtXV4Kn3jVqOs", "8/+tyWwCNq6PB0rUMhC29myQhViveTsZErWXCGX5t00=", zzamvVar, i, 11);
        this.zzi = zzaqaVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaqa zzaqaVar = this.zzi;
        if (zzaqaVar != null) {
            zzapy zzapyVar = new zzapy((String) this.zzf.invoke(null, zzaqaVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzapyVar.zza.longValue());
                if (zzapyVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzapyVar.zzb.longValue());
                }
                if (zzapyVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzapyVar.zzc.longValue());
                }
            }
        }
    }
}
