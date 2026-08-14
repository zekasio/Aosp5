package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzdq zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    /* synthetic */ zzdt(String str, Object obj, Object obj2, zzdq zzdqVar, zzds zzdsVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzdqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzab r4 = com.google.android.gms.measurement.internal.zzdr.zza
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.zzd
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzdt.zza
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.zzh     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r3.zzd     // Catch: java.lang.Throwable -> L6b
            goto L20
        L1e:
            java.lang.Object r0 = r3.zzh     // Catch: java.lang.Throwable -> L6b
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            return r0
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            java.util.List r4 = com.google.android.gms.measurement.internal.zzdu.zzb()     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            com.google.android.gms.measurement.internal.zzdt r0 = (com.google.android.gms.measurement.internal.zzdt) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            com.google.android.gms.measurement.internal.zzdq r2 = r0.zzc     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzdt.zza     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.zzh = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
        L59:
            com.google.android.gms.measurement.internal.zzdq r4 = r3.zzc
            if (r4 != 0) goto L60
            java.lang.Object r4 = r3.zzd
            return r4
        L60:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.IllegalStateException -> L65 java.lang.SecurityException -> L68
            return r4
        L65:
            java.lang.Object r4 = r3.zzd
            return r4
        L68:
            java.lang.Object r4 = r3.zzd
            return r4
        L6b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            goto L72
        L71:
            throw r4
        L72:
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdt.zza(java.lang.Object):java.lang.Object");
    }

    public final String zzb() {
        return this.zzb;
    }
}
