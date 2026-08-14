package com.google.android.gms.internal.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgh {
    private static final zzgk zznh;
    private static final int zzni;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static final class zza extends zzgk {
        zza() {
        }

        @Override // com.google.android.gms.internal.games.zzgk
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zznh.zza(th, th2);
    }

    private static Integer zzcw() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0006, B:6:0x000e, B:7:0x0014, B:9:0x001c, B:10:0x0022), top: B:24:0x0006 }] */
    static {
        /*
            java.lang.Integer r0 = zzcw()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L14
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L28
            r2 = 19
            if (r1 < r2) goto L14
            com.google.android.gms.internal.games.zzgn r1 = new com.google.android.gms.internal.games.zzgn     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            goto L61
        L14:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L22
            com.google.android.gms.internal.games.zzgl r1 = new com.google.android.gms.internal.games.zzgl     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            goto L61
        L22:
            com.google.android.gms.internal.games.zzgh$zza r1 = new com.google.android.gms.internal.games.zzgh$zza     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            goto L61
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            r1 = move-exception
            r0 = 0
        L2c:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.games.zzgh$zza> r3 = com.google.android.gms.internal.games.zzgh.zza.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.games.zzgh$zza r1 = new com.google.android.gms.internal.games.zzgh$zza
            r1.<init>()
        L61:
            com.google.android.gms.internal.games.zzgh.zznh = r1
            if (r0 != 0) goto L67
            r0 = 1
            goto L6b
        L67:
            int r0 = r0.intValue()
        L6b:
            com.google.android.gms.internal.games.zzgh.zzni = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.games.zzgh.<clinit>():void");
    }
}
