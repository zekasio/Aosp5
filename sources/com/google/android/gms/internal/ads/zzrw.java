package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrw implements zzuj {
    public final zzuj zza;
    final /* synthetic */ zzrx zzb;
    private boolean zzc;

    public zzrw(zzrx zzrxVar, zzuj zzujVar) {
        this.zzb = zzrxVar;
        this.zza = zzujVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzjo r11, com.google.android.gms.internal.ads.zzgr r12, int r13) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzrx r0 = r10.zzb
            boolean r0 = r0.zzq()
            r1 = -3
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r10.zzc
            r2 = 4
            r3 = -4
            if (r0 == 0) goto L14
            r12.zzc(r2)
            return r3
        L14:
            com.google.android.gms.internal.ads.zzuj r0 = r10.zza
            int r13 = r0.zza(r11, r12, r13)
            r0 = -5
            r4 = -9223372036854775808
            if (r13 != r0) goto L4a
            com.google.android.gms.internal.ads.zzaf r12 = r11.zza
            r12.getClass()
            int r13 = r12.zzC
            r1 = 0
            if (r13 != 0) goto L2e
            int r13 = r12.zzD
            if (r13 == 0) goto L49
            r13 = 0
        L2e:
            com.google.android.gms.internal.ads.zzrx r2 = r10.zzb
            long r2 = r2.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L37
            goto L39
        L37:
            int r1 = r12.zzD
        L39:
            com.google.android.gms.internal.ads.zzad r12 = r12.zzb()
            r12.zzC(r13)
            r12.zzD(r1)
            com.google.android.gms.internal.ads.zzaf r12 = r12.zzY()
            r11.zza = r12
        L49:
            return r0
        L4a:
            com.google.android.gms.internal.ads.zzrx r11 = r10.zzb
            long r6 = r11.zzb
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L72
            if (r13 != r3) goto L5a
            long r8 = r12.zzd
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L68
        L5a:
            if (r13 != r1) goto L72
            long r0 = r11.zzb()
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 != 0) goto L72
            boolean r11 = r12.zzc
            if (r11 != 0) goto L72
        L68:
            r12.zzb()
            r12.zzc(r2)
            r11 = 1
            r10.zzc = r11
            return r3
        L72:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrw.zza(com.google.android.gms.internal.ads.zzjo, com.google.android.gms.internal.ads.zzgr, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
