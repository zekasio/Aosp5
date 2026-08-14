package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzfut;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbo {
    private static zzakr zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbj zza = new zzbg();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbo(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzbo.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzakr r1 = com.google.android.gms.ads.internal.util.zzbo.zzb     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            com.google.android.gms.internal.ads.zzbar.zzc(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L34
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzdY     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.zzakr r4 = com.google.android.gms.ads.internal.util.zzax.zzb(r4)     // Catch: java.lang.Throwable -> L3d
            goto L39
        L34:
            r1 = 0
            com.google.android.gms.internal.ads.zzakr r4 = com.google.android.gms.internal.ads.zzalv.zza(r4, r1)     // Catch: java.lang.Throwable -> L3d
        L39:
            com.google.android.gms.ads.internal.util.zzbo.zzb = r4     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbo.<init>(android.content.Context):void");
    }

    public final zzfut zza(String str) {
        zzbzs zzbzsVar = new zzbzs();
        zzb.zza(new zzbn(str, null, zzbzsVar));
        return zzbzsVar;
    }

    public final zzfut zzb(int i, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbyz zzbyzVar = new zzbyz(null);
        zzbi zzbiVar = new zzbi(this, i, str, zzblVar, zzbhVar, bArr, map, zzbyzVar);
        if (zzbyz.zzl()) {
            try {
                zzbyzVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzajw e) {
                zzbza.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
