package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import androidx.core.content.pm.PackageInfoCompat$$ExternalSyntheticApiModelOutline0;
import java.lang.reflect.Method;
import okio.Okio$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbt {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = PackageInfoCompat$$ExternalSyntheticApiModelOutline0.m$3().getDeclaredMethod("scheduleAsPackage", Okio$$ExternalSyntheticApiModelOutline0.m1813m(), String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        zza = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        zzb = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = androidx.appcompat.widget.SearchView$$ExternalSyntheticApiModelOutline0.m(r7)
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r8 == 0) goto L75
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0.m(r5, r8)
            if (r5 == 0) goto L1a
            goto L75
        L1a:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.zzbt.zzb
            r8 = 0
            if (r5 == 0) goto L40
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            if (r5 == 0) goto L40
            int r5 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            goto L41
        L2f:
            r5 = move-exception
            goto L32
        L31:
            r5 = move-exception
        L32:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L40
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
        L40:
            r5 = 0
        L41:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            java.lang.String r1 = "UploadAlarm"
            if (r0 == 0) goto L70
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            r2[r8] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.String r3 = "com.google.android.gms"
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            r3 = 2
            r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            r5 = 3
            r2[r5] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Object r5 = r0.invoke(r7, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            if (r5 == 0) goto L74
            int r8 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L68 java.lang.IllegalAccessException -> L6a
            goto L74
        L68:
            r5 = move-exception
            goto L6b
        L6a:
            r5 = move-exception
        L6b:
            java.lang.String r8 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r8, r5)
        L70:
            int r8 = com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0.m(r7, r6)
        L74:
            return r8
        L75:
            int r5 = com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0.m(r7, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
