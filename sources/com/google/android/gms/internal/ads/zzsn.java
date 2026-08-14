package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsn extends zzut {
    private final boolean zzb;
    private final zzcm zzc;
    private final zzck zzd;
    private zzsl zze;
    private zzsk zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzsn(zzsu zzsuVar, boolean z) {
        boolean z2;
        super(zzsuVar);
        if (z) {
            zzsuVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        zzsuVar.zzL();
        this.zze = zzsl.zzq(zzsuVar.zzI());
    }

    private final Object zzJ(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzsl.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzK(long j) {
        zzsk zzskVar = this.zzf;
        int iZza = this.zze.zza(zzskVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        zzsl zzslVar = this.zze;
        zzck zzckVar = this.zzd;
        zzslVar.zzd(iZza, zzckVar, false);
        long j2 = zzckVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzskVar.zzs(j);
    }

    public final zzcn zzB() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    protected final zzss zzC(zzss zzssVar) {
        Object obj = zzssVar.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zzsl.zzd;
        }
        return zzssVar.zzc(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzD(com.google.android.gms.internal.ads.zzcn r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzK(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcm.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzsl.zzd
            com.google.android.gms.internal.ads.zzsl r15 = com.google.android.gms.internal.ads.zzsl.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzsk r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzsl r8 = r14.zze
            com.google.android.gms.internal.ads.zzss r5 = r5.zza
            java.lang.Object r5 = r5.zza
            com.google.android.gms.internal.ads.zzck r9 = r14.zzd
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzsl r5 = r14.zze
            com.google.android.gms.internal.ads.zzcm r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcm r9 = r14.zzc
            com.google.android.gms.internal.ads.zzck r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzsl r0 = r14.zze
            com.google.android.gms.internal.ads.zzsl r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzsl r15 = com.google.android.gms.internal.ads.zzsl.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzK(r4)
            com.google.android.gms.internal.ads.zzss r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzJ(r0)
            com.google.android.gms.internal.ads.zzss r1 = r15.zzc(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzsl r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zzsk r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzD(com.google.android.gms.internal.ads.zzcn):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzE() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzA(null, ((zzut) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzut, com.google.android.gms.internal.ads.zzsu
    public final void zzF(zzsq zzsqVar) {
        ((zzsk) zzsqVar).zzt();
        if (zzsqVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut, com.google.android.gms.internal.ads.zzsu
    /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
    public final zzsk zzH(zzss zzssVar, zzwt zzwtVar, long j) {
        zzsk zzskVar = new zzsk(zzssVar, zzwtVar, j, null);
        zzskVar.zzu(this.zza);
        if (this.zzh) {
            zzskVar.zzr(zzssVar.zzc(zzJ(zzssVar.zza)));
        } else {
            this.zzf = zzskVar;
            if (!this.zzg) {
                this.zzg = true;
                zzA(null, ((zzut) this).zza);
            }
        }
        return zzskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzrt
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzsu
    public final void zzy() {
    }
}
