package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrv implements zztl {
    private final zzaab zza;
    private zzzu zzb;
    private zzzv zzc;

    public zzrv(zzaab zzaabVar) {
        this.zza = zzaabVar;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final long zzb() {
        zzzv zzzvVar = this.zzc;
        if (zzzvVar != null) {
            return zzzvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzc() {
        zzzu zzzuVar = this.zzb;
        if (zzzuVar instanceof zzafc) {
            ((zzafc) zzzuVar).zze();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    @Override // com.google.android.gms.internal.ads.zztl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzr r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzzx r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzzk r6 = new com.google.android.gms.internal.ads.zzzk
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzzu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzaab r8 = r7.zza
            com.google.android.gms.internal.ads.zzzu[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.zzb = r8
            goto L7f
        L20:
            r0 = 0
        L21:
            if (r0 >= r10) goto L7b
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r2 == 0) goto L3f
            r7.zzb = r1     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r1 != 0) goto L37
            long r0 = r6.zzf()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L38
        L37:
            r13 = 1
        L38:
            com.google.android.gms.internal.ads.zzdl.zzf(r13)
            r6.zzj()
            goto L7b
        L3f:
            com.google.android.gms.internal.ads.zzzu r1 = r7.zzb
            if (r1 != 0) goto L71
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L6f
            goto L71
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzzu r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzf()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L5a
        L59:
            r13 = 1
        L5a:
            com.google.android.gms.internal.ads.zzdl.zzf(r13)
            r6.zzj()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzzu r1 = r7.zzb
            if (r1 != 0) goto L71
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L6f
            goto L71
        L6f:
            r1 = 0
            goto L72
        L71:
            r1 = 1
        L72:
            com.google.android.gms.internal.ads.zzdl.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L21
        L7b:
            com.google.android.gms.internal.ads.zzzu r10 = r7.zzb
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.zzzu r8 = r7.zzb
            r8.zzb(r15)
            return
        L85:
            com.google.android.gms.internal.ads.zzus r10 = new com.google.android.gms.internal.ads.zzus
            java.lang.String r8 = com.google.android.gms.internal.ads.zzew.zzK(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            goto La3
        La2:
            throw r10
        La3:
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrv.zzd(com.google.android.gms.internal.ads.zzr, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzzx):void");
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final int zza(zzaau zzaauVar) throws IOException {
        zzzu zzzuVar = this.zzb;
        zzzuVar.getClass();
        zzzv zzzvVar = this.zzc;
        zzzvVar.getClass();
        return zzzuVar.zza(zzzvVar, zzaauVar);
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzf(long j, long j2) {
        zzzu zzzuVar = this.zzb;
        zzzuVar.getClass();
        zzzuVar.zzc(j, j2);
    }
}
