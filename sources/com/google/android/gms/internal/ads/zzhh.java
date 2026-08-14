package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhh implements zzjq {
    private final zzkt zza;
    private final zzhg zzb;
    private zzkn zzc;
    private zzjq zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhh(zzhg zzhgVar, zzdm zzdmVar) {
        this.zzb = zzhgVar;
        this.zza = new zzkt(zzdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzkn r0 = r5.zzc
            if (r0 == 0) goto L66
            boolean r0 = r0.zzM()
            if (r0 != 0) goto L66
            com.google.android.gms.internal.ads.zzkn r0 = r5.zzc
            boolean r0 = r0.zzN()
            if (r0 != 0) goto L1d
            if (r6 != 0) goto L66
            com.google.android.gms.internal.ads.zzkn r6 = r5.zzc
            boolean r6 = r6.zzG()
            if (r6 == 0) goto L1d
            goto L66
        L1d:
            com.google.android.gms.internal.ads.zzjq r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zza()
            boolean r2 = r5.zze
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.zzkt r2 = r5.zza
            long r2 = r2.zza()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            com.google.android.gms.internal.ads.zzkt r6 = r5.zza
            r6.zze()
            goto L72
        L3a:
            r2 = 0
            r5.zze = r2
            boolean r2 = r5.zzf
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.zzkt r2 = r5.zza
            r2.zzd()
        L46:
            com.google.android.gms.internal.ads.zzkt r2 = r5.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzby r6 = r6.zzc()
            com.google.android.gms.internal.ads.zzkt r0 = r5.zza
            com.google.android.gms.internal.ads.zzby r0 = r0.zzc()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L72
            com.google.android.gms.internal.ads.zzkt r0 = r5.zza
            r0.zzg(r6)
            com.google.android.gms.internal.ads.zzhg r0 = r5.zzb
            r0.zza(r6)
            goto L72
        L66:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L72
            com.google.android.gms.internal.ads.zzkt r6 = r5.zza
            r6.zzd()
        L72:
            boolean r6 = r5.zze
            if (r6 == 0) goto L7d
            com.google.android.gms.internal.ads.zzkt r6 = r5.zza
            long r0 = r6.zza()
            goto L86
        L7d:
            com.google.android.gms.internal.ads.zzjq r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zza()
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhh.zzb(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final zzby zzc() {
        zzjq zzjqVar = this.zzd;
        return zzjqVar != null ? zzjqVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzkn zzknVar) {
        if (zzknVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzkn zzknVar) throws zzhj {
        zzjq zzjqVar;
        zzjq zzjqVarZzi = zzknVar.zzi();
        if (zzjqVarZzi == null || zzjqVarZzi == (zzjqVar = this.zzd)) {
            return;
        }
        if (zzjqVar != null) {
            throw zzhj.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzjqVarZzi;
        this.zzc = zzknVar;
        zzjqVarZzi.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final void zzg(zzby zzbyVar) {
        zzjq zzjqVar = this.zzd;
        if (zzjqVar != null) {
            zzjqVar.zzg(zzbyVar);
            zzbyVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbyVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
