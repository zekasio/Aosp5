package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzju {
    private final zzck zza = new zzck();
    private final zzcm zzb = new zzcm();
    private final zzlb zzc;
    private final zzdv zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjr zzh;
    private zzjr zzi;
    private zzjr zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzju(zzlb zzlbVar, zzdv zzdvVar) {
        this.zzc = zzlbVar;
        this.zzd = zzdvVar;
    }

    private final boolean zzA(zzcn zzcnVar, zzss zzssVar) {
        if (zzC(zzssVar)) {
            return zzcnVar.zze(zzcnVar.zzn(zzssVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzcnVar.zza(zzssVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcn zzcnVar) {
        zzjr zzjrVarZzg = this.zzh;
        if (zzjrVarZzg == null) {
            return true;
        }
        int iZza = zzcnVar.zza(zzjrVarZzg.zzb);
        while (true) {
            iZza = zzcnVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjrVarZzg.zzg() != null && !zzjrVarZzg.zzf.zzg) {
                zzjrVarZzg = zzjrVarZzg.zzg();
            }
            zzjr zzjrVarZzg2 = zzjrVarZzg.zzg();
            if (iZza == -1 || zzjrVarZzg2 == null || zzcnVar.zza(zzjrVarZzg2.zzb) != iZza) {
                break;
            }
            zzjrVarZzg = zzjrVarZzg2;
        }
        boolean zZzm = zzm(zzjrVarZzg);
        zzjrVarZzg.zzf = zzg(zzcnVar, zzjrVarZzg.zzf);
        return !zZzm;
    }

    private static final boolean zzC(zzss zzssVar) {
        return !zzssVar.zzb() && zzssVar.zze == -1;
    }

    private final long zzs(zzcn zzcnVar, Object obj, int i) {
        zzcnVar.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0L;
    }

    private final zzjs zzt(zzcn zzcnVar, zzjr zzjrVar, long j) {
        long j2;
        zzjs zzjsVar = zzjrVar.zzf;
        long jZze = (zzjrVar.zze() + zzjsVar.zze) - j;
        if (!zzjsVar.zzg) {
            zzss zzssVar = zzjsVar.zza;
            zzcnVar.zzn(zzssVar.zza, this.zza);
            if (!zzssVar.zzb()) {
                int iZze = this.zza.zze(zzssVar.zze);
                this.zza.zzl(zzssVar.zze);
                if (iZze != this.zza.zza(zzssVar.zze)) {
                    return zzv(zzcnVar, zzssVar.zza, zzssVar.zze, iZze, zzjsVar.zze, zzssVar.zzd);
                }
                zzs(zzcnVar, zzssVar.zza, zzssVar.zze);
                return zzw(zzcnVar, zzssVar.zza, 0L, zzjsVar.zze, zzssVar.zzd);
            }
            int i = zzssVar.zzb;
            if (this.zza.zza(i) == -1) {
                return null;
            }
            int iZzf = this.zza.zzf(i, zzssVar.zzc);
            if (iZzf < 0) {
                return zzv(zzcnVar, zzssVar.zza, i, iZzf, zzjsVar.zzc, zzssVar.zzd);
            }
            long jLongValue = zzjsVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                zzcm zzcmVar = this.zzb;
                zzck zzckVar = this.zza;
                Pair pairZzm = zzcnVar.zzm(zzcmVar, zzckVar, zzckVar.zzd, -9223372036854775807L, Math.max(0L, jZze));
                if (pairZzm == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzm.second).longValue();
            }
            zzs(zzcnVar, zzssVar.zza, zzssVar.zzb);
            return zzw(zzcnVar, zzssVar.zza, Math.max(0L, jLongValue), zzjsVar.zzc, zzssVar.zzd);
        }
        long j3 = 0;
        int iZzi = zzcnVar.zzi(zzcnVar.zza(zzjsVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
        if (iZzi == -1) {
            return null;
        }
        int i2 = zzcnVar.zzd(iZzi, this.zza, true).zzd;
        Object obj = this.zza.zzc;
        obj.getClass();
        long j4 = zzjsVar.zza.zzd;
        if (zzcnVar.zze(i2, this.zzb, 0L).zzo == iZzi) {
            Pair pairZzm2 = zzcnVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, jZze));
            if (pairZzm2 == null) {
                return null;
            }
            obj = pairZzm2.first;
            long jLongValue2 = ((Long) pairZzm2.second).longValue();
            zzjr zzjrVarZzg = zzjrVar.zzg();
            if (zzjrVarZzg == null || !zzjrVarZzg.zzb.equals(obj)) {
                j4 = this.zze;
                this.zze = 1 + j4;
            } else {
                j4 = zzjrVarZzg.zzf.zza.zzd;
            }
            j2 = jLongValue2;
            j3 = -9223372036854775807L;
        } else {
            j2 = 0;
        }
        zzss zzssVarZzx = zzx(zzcnVar, obj, j2, j4, this.zzb, this.zza);
        if (j3 != -9223372036854775807L && zzjsVar.zzc != -9223372036854775807L) {
            zzcnVar.zzn(zzjsVar.zza.zza, this.zza).zzb();
        }
        return zzu(zzcnVar, zzssVarZzx, j3, j2);
    }

    private final zzjs zzu(zzcn zzcnVar, zzss zzssVar, long j, long j2) {
        zzcnVar.zzn(zzssVar.zza, this.zza);
        return zzssVar.zzb() ? zzv(zzcnVar, zzssVar.zza, zzssVar.zzb, zzssVar.zzc, j, zzssVar.zzd) : zzw(zzcnVar, zzssVar.zza, j2, j, zzssVar.zzd);
    }

    private final zzjs zzv(zzcn zzcnVar, Object obj, int i, int i2, long j, long j2) {
        zzss zzssVar = new zzss(obj, i, i2, j2);
        long jZzg = zzcnVar.zzn(zzssVar.zza, this.zza).zzg(zzssVar.zzb, zzssVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzssVar.zzb);
        long jMax = 0;
        if (jZzg != -9223372036854775807L && jZzg <= 0) {
            jMax = Math.max(0L, (-1) + jZzg);
        }
        return new zzjs(zzssVar, jMax, j, -9223372036854775807L, jZzg, false, false, false, false);
    }

    private final zzjs zzw(zzcn zzcnVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzcnVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(iZzc);
        }
        zzss zzssVar = new zzss(obj, j3, iZzc);
        boolean zZzC = zzC(zzssVar);
        boolean zZzA = zzA(zzcnVar, zzssVar);
        boolean zZzz = zzz(zzcnVar, zzssVar, zZzC);
        if (iZzc != -1) {
            this.zza.zzl(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzh(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new zzjs(zzssVar, jMax, j2, j6, j5, false, zZzC, zZzA, zZzz);
    }

    private static zzss zzx(zzcn zzcnVar, Object obj, long j, long j2, zzcm zzcmVar, zzck zzckVar) {
        zzcnVar.zzn(obj, zzckVar);
        zzcnVar.zze(zzckVar.zzd, zzcmVar, 0L);
        zzcnVar.zza(obj);
        if (zzckVar.zze == 0) {
            zzckVar.zzb();
        }
        zzcnVar.zzn(obj, zzckVar);
        int iZzd = zzckVar.zzd(j);
        return iZzd == -1 ? new zzss(obj, j2, zzckVar.zzc(j)) : new zzss(obj, iZzd, zzckVar.zze(iZzd), j2);
    }

    private final void zzy() {
        final zzfqh zzfqhVarZzi = zzfqk.zzi();
        for (zzjr zzjrVarZzg = this.zzh; zzjrVarZzg != null; zzjrVarZzg = zzjrVarZzg.zzg()) {
            zzfqhVarZzi.zzf(zzjrVarZzg.zzf.zza);
        }
        zzjr zzjrVar = this.zzi;
        final zzss zzssVar = zzjrVar == null ? null : zzjrVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(zzfqhVarZzi, zzssVar);
            }
        });
    }

    private final boolean zzz(zzcn zzcnVar, zzss zzssVar, boolean z) {
        int iZza = zzcnVar.zza(zzssVar.zza);
        return !zzcnVar.zze(zzcnVar.zzd(iZza, this.zza, false).zzd, this.zzb, 0L).zzi && zzcnVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzjr zza() {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar == null) {
            return null;
        }
        if (zzjrVar == this.zzi) {
            this.zzi = zzjrVar.zzg();
        }
        zzjrVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjr zzjrVar2 = this.zzh;
            this.zzl = zzjrVar2.zzb;
            this.zzm = zzjrVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjr zzb() {
        zzjr zzjrVar = this.zzi;
        boolean z = false;
        if (zzjrVar != null && zzjrVar.zzg() != null) {
            z = true;
        }
        zzdl.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjr zzc() {
        return this.zzj;
    }

    public final zzjr zzd() {
        return this.zzh;
    }

    public final zzjr zze() {
        return this.zzi;
    }

    public final zzjs zzf(long j, zzkh zzkhVar) {
        zzjr zzjrVar = this.zzj;
        return zzjrVar == null ? zzu(zzkhVar.zza, zzkhVar.zzb, zzkhVar.zzc, zzkhVar.zzr) : zzt(zzkhVar.zza, zzjrVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzjs zzg(com.google.android.gms.internal.ads.zzcn r19, com.google.android.gms.internal.ads.zzjs r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzss r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzss r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzck r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzck r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzck r4 = r0.zza
            r4.zzl(r1)
        L6e:
            com.google.android.gms.internal.ads.zzjs r15 = new com.google.android.gms.internal.ads.zzjs
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzju.zzg(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzjs):com.google.android.gms.internal.ads.zzjs");
    }

    public final zzss zzh(zzcn zzcnVar, Object obj, long j) {
        long j2;
        int iZza;
        int i = zzcnVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzcnVar.zza(obj2)) == -1 || zzcnVar.zzd(iZza, this.zza, false).zzd != i) {
            zzjr zzjrVarZzg = this.zzh;
            while (true) {
                if (zzjrVarZzg == null) {
                    zzjr zzjrVarZzg2 = this.zzh;
                    while (true) {
                        if (zzjrVarZzg2 != null) {
                            int iZza2 = zzcnVar.zza(zzjrVarZzg2.zzb);
                            if (iZza2 != -1 && zzcnVar.zzd(iZza2, this.zza, false).zzd == i) {
                                j2 = zzjrVarZzg2.zzf.zza.zzd;
                                break;
                            }
                            zzjrVarZzg2 = zzjrVarZzg2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else {
                    if (zzjrVarZzg.zzb.equals(obj)) {
                        j2 = zzjrVarZzg.zzf.zza.zzd;
                        break;
                    }
                    zzjrVarZzg = zzjrVarZzg.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcnVar.zzn(obj, this.zza);
        zzcnVar.zze(this.zza.zzd, this.zzb, 0L);
        int iZza3 = zzcnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcmVar = this.zzb;
            if (iZza3 < zzcmVar.zzo) {
                return zzx(zzcnVar, obj3, j, j3, zzcmVar, this.zza);
            }
            zzcnVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzck zzckVar = this.zza;
            if (zzckVar.zzd(zzckVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjr zzjrVarZzg = this.zzh;
        zzdl.zzb(zzjrVarZzg);
        this.zzl = zzjrVarZzg.zzb;
        this.zzm = zzjrVarZzg.zzf.zza.zzd;
        while (zzjrVarZzg != null) {
            zzjrVarZzg.zzn();
            zzjrVarZzg = zzjrVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzj(zzfqh zzfqhVar, zzss zzssVar) {
        this.zzc.zzT(zzfqhVar.zzi(), zzssVar);
    }

    public final void zzk(long j) {
        zzjr zzjrVar = this.zzj;
        if (zzjrVar != null) {
            zzjrVar.zzm(j);
        }
    }

    public final boolean zzl(zzsq zzsqVar) {
        zzjr zzjrVar = this.zzj;
        return zzjrVar != null && zzjrVar.zza == zzsqVar;
    }

    public final boolean zzm(zzjr zzjrVar) {
        boolean z = false;
        zzdl.zzf(zzjrVar != null);
        if (zzjrVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjrVar;
        while (zzjrVar.zzg() != null) {
            zzjrVar = zzjrVar.zzg();
            if (zzjrVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjrVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjr zzjrVar = this.zzj;
        if (zzjrVar != null) {
            return !zzjrVar.zzf.zzi && zzjrVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzo(com.google.android.gms.internal.ads.zzcn r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzjr r2 = r0.zzh
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.zzjs r5 = r2.zzf
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.zzjs r3 = r0.zzg(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.zzjs r9 = r0.zzt(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.zzm(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.zzb
            long r12 = r9.zzb
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8f
            com.google.android.gms.internal.ads.zzss r10 = r5.zza
            com.google.android.gms.internal.ads.zzss r11 = r9.zza
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.zzc
            com.google.android.gms.internal.ads.zzjs r9 = r3.zza(r9)
            r2.zzf = r9
            long r9 = r5.zze
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.zze
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.zzq()
            long r7 = r3.zze
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.zze()
            long r7 = r7 + r9
        L67:
            com.google.android.gms.internal.ads.zzjr r1 = r0.zzi
            if (r2 != r1) goto L7b
            com.google.android.gms.internal.ads.zzjs r1 = r2.zzf
            boolean r1 = r1.zzf
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            boolean r2 = r0.zzm(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.google.android.gms.internal.ads.zzjr r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.zzm(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzju.zzo(com.google.android.gms.internal.ads.zzcn, long, long):boolean");
    }

    public final boolean zzp(zzcn zzcnVar, int i) {
        this.zzf = i;
        return zzB(zzcnVar);
    }

    public final boolean zzq(zzcn zzcnVar, boolean z) {
        this.zzg = z;
        return zzB(zzcnVar);
    }

    public final zzjr zzr(zzko[] zzkoVarArr, zzwk zzwkVar, zzwt zzwtVar, zzkg zzkgVar, zzjs zzjsVar, zzwl zzwlVar) {
        zzjr zzjrVar = this.zzj;
        zzjr zzjrVar2 = new zzjr(zzkoVarArr, zzjrVar == null ? 1000000000000L : (zzjrVar.zze() + zzjrVar.zzf.zze) - zzjsVar.zzb, zzwkVar, zzwtVar, zzkgVar, zzjsVar, zzwlVar, null);
        zzjr zzjrVar3 = this.zzj;
        if (zzjrVar3 != null) {
            zzjrVar3.zzo(zzjrVar2);
        } else {
            this.zzh = zzjrVar2;
            this.zzi = zzjrVar2;
        }
        this.zzl = null;
        this.zzj = zzjrVar2;
        this.zzk++;
        zzy();
        return zzjrVar2;
    }
}
