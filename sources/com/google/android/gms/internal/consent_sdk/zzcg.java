package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcg<T> implements zzcl<T> {
    private static final Object zza = new Object();
    private volatile zzcl<T> zzb;
    private volatile Object zzc = zza;

    private zzcg(zzcl<T> zzclVar) {
        this.zzb = zzclVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final T zzb() {
        T tZzb = (T) this.zzc;
        Object obj = zza;
        if (tZzb == obj) {
            synchronized (this) {
                tZzb = (T) this.zzc;
                if (tZzb == obj) {
                    tZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && !(obj2 instanceof zzcj) && obj2 != tZzb) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZzb);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 118 + String.valueOf(strValueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = tZzb;
                    this.zzb = null;
                }
            }
        }
        return tZzb;
    }

    public static <P extends zzcl<T>, T> zzcl<T> zza(P p) {
        p.getClass();
        return p instanceof zzcg ? p : new zzcg(p);
    }
}
