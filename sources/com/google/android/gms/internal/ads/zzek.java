package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzek extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    /* synthetic */ zzek(zzel zzelVar, zzej zzejVar) {
        this.zza = zzelVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 0
            r1 = 5
            if (r10 != 0) goto Ld
            goto L52
        Ld:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L51
            r2 = 1
            if (r10 == 0) goto L4f
            boolean r3 = r10.isConnected()
            if (r3 != 0) goto L1b
            goto L4f
        L1b:
            int r3 = r10.getType()
            r4 = 2
            r5 = 9
            r6 = 6
            r7 = 4
            if (r3 == 0) goto L39
            if (r3 == r2) goto L37
            if (r3 == r7) goto L39
            if (r3 == r1) goto L39
            if (r3 == r6) goto L35
            if (r3 == r5) goto L33
            r0 = 8
            goto L52
        L33:
            r0 = 7
            goto L52
        L35:
            r0 = 5
            goto L52
        L37:
            r0 = 2
            goto L52
        L39:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L35;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L40;
                case 17: goto L4b;
                case 18: goto L37;
                case 19: goto L40;
                case 20: goto L42;
                default: goto L40;
            }
        L40:
            r0 = 6
            goto L52
        L42:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r2 = 29
            if (r10 < r2) goto L52
            r0 = 9
            goto L52
        L4b:
            r0 = 4
            goto L52
        L4d:
            r0 = 3
            goto L52
        L4f:
            r0 = 1
            goto L52
        L51:
        L52:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r2 = 31
            if (r10 < r2) goto L7c
            if (r0 != r1) goto L7c
            com.google.android.gms.internal.ads.zzel r10 = r8.zza
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L78
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L78
            if (r0 == 0) goto L76
            com.google.android.gms.internal.ads.zzei r2 = new com.google.android.gms.internal.ads.zzei     // Catch: java.lang.RuntimeException -> L78
            r2.<init>(r10)     // Catch: java.lang.RuntimeException -> L78
            java.util.concurrent.Executor r9 = com.google.android.gms.internal.ads.zzg$$ExternalSyntheticApiModelOutline0.m(r9)     // Catch: java.lang.RuntimeException -> L78
            com.google.android.gms.internal.ads.zzg$$ExternalSyntheticApiModelOutline0.m(r0, r9, r2)     // Catch: java.lang.RuntimeException -> L78
            com.google.android.gms.internal.ads.zzg$$ExternalSyntheticApiModelOutline0.m(r0, r2)     // Catch: java.lang.RuntimeException -> L78
            return
        L76:
            r9 = 0
            throw r9     // Catch: java.lang.RuntimeException -> L78
        L78:
            com.google.android.gms.internal.ads.zzel.zzc(r10, r1)
            return
        L7c:
            com.google.android.gms.internal.ads.zzel r9 = r8.zza
            com.google.android.gms.internal.ads.zzel.zzc(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzek.onReceive(android.content.Context, android.content.Intent):void");
    }
}
