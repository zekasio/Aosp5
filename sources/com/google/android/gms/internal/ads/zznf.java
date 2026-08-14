package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zznf implements zzlb {
    private final zzdm zza;
    private final zzck zzb;
    private final zzcm zzc;
    private final zzne zzd;
    private final SparseArray zze;
    private zzeb zzf;
    private zzcg zzg;
    private zzdv zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zznf zznfVar) {
        final zzlc zzlcVarZzU = zznfVar.zzU();
        zznfVar.zzZ(zzlcVarZzU, 1028, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
        zznfVar.zzf.zze();
    }

    private final zzlc zzab(int i, zzss zzssVar) {
        zzcg zzcgVar = this.zzg;
        zzcgVar.getClass();
        if (zzssVar != null) {
            return this.zzd.zza(zzssVar) != null ? zzaa(zzssVar) : zzV(zzcn.zza, i, zzssVar);
        }
        zzcn zzcnVarZzq = zzcgVar.zzq();
        if (i >= zzcnVarZzq.zzc()) {
            zzcnVarZzq = zzcn.zza;
        }
        return zzV(zzcnVarZzq, i, null);
    }

    private final zzlc zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzlc zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzlc zzae(zzbw zzbwVar) {
        zzbn zzbnVar;
        return (!(zzbwVar instanceof zzhj) || (zzbnVar = ((zzhj) zzbwVar).zzj) == null) ? zzU() : zzaa(new zzss(zzbnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzA(final String str) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1012, new zzdy() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzB(final zzhb zzhbVar) {
        final zzlc zzlcVarZzac = zzac();
        zzZ(zzlcVarZzac, 1013, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzC(final zzhb zzhbVar) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1007, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzD(final zzaf zzafVar, final zzhc zzhcVar) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1009, new zzdy() { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zze(zzlcVarZzad, zzafVar, zzhcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzE(final long j) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1010, new zzdy(j) { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzF(final Exception exc) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1014, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzG(final int i, final long j, final long j2) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1011, new zzdy(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzli
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzH(final int i, final long j) {
        final zzlc zzlcVarZzac = zzac();
        zzZ(zzlcVarZzac, 1018, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzh(zzlcVarZzac, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzI(final Object obj, final long j) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj2) {
                ((zzle) obj2).zzn(zzlcVarZzad, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzJ(final Exception exc) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1030, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlo
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzK(final String str, final long j, final long j2) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1016, new zzdy(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlz
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzL(final String str) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1019, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzM(final zzhb zzhbVar) {
        final zzlc zzlcVarZzac = zzac();
        zzZ(zzlcVarZzac, 1020, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzo(zzlcVarZzac, zzhbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzN(final zzhb zzhbVar) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1015, new zzdy() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzO(final long j, final int i) {
        final zzlc zzlcVarZzac = zzac();
        zzZ(zzlcVarZzac, 1021, new zzdy(j, i) { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzP(final zzaf zzafVar, final zzhc zzhcVar) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1017, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzp(zzlcVarZzad, zzafVar, zzhcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzQ() {
        zzdv zzdvVar = this.zzh;
        zzdl.zzb(zzdvVar);
        zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // java.lang.Runnable
            public final void run() {
                zznf.zzW(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzR(zzle zzleVar) {
        this.zzf.zzf(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzS(final zzcg zzcgVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzdl.zzf(z);
        zzcgVar.getClass();
        this.zzg = zzcgVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdz() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdz
            public final void zza(Object obj, zzaa zzaaVar) {
                this.zza.zzX(zzcgVar, (zzle) obj, zzaaVar);
            }
        });
    }

    protected final zzlc zzU() {
        return zzaa(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzlc zzV(zzcn zzcnVar, int i, zzss zzssVar) {
        zzss zzssVar2 = true == zzcnVar.zzo() ? null : zzssVar;
        long jZza = this.zza.zza();
        boolean z = zzcnVar.equals(this.zzg.zzq()) && i == this.zzg.zzg();
        long jZzz = 0;
        if (zzssVar2 == null || !zzssVar2.zzb()) {
            if (z) {
                jZzz = this.zzg.zzm();
            } else if (!zzcnVar.zzo()) {
                long j = zzcnVar.zze(i, this.zzc, 0L).zzm;
                jZzz = zzew.zzz(0L);
            }
        } else if (z && this.zzg.zze() == zzssVar2.zzb && this.zzg.zzf() == zzssVar2.zzc) {
            jZzz = this.zzg.zzn();
        }
        return new zzlc(jZza, zzcnVar, i, zzssVar2, jZzz, this.zzg.zzq(), this.zzg.zzg(), this.zzd.zzb(), this.zzg.zzn(), this.zzg.zzp());
    }

    final /* synthetic */ void zzX(zzcg zzcgVar, zzle zzleVar, zzaa zzaaVar) {
        zzleVar.zzi(zzcgVar, new zzld(zzaaVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzY(final int i, final long j, final long j2) {
        final zzlc zzlcVarZzaa = zzaa(this.zzd.zzc());
        zzZ(zzlcVarZzaa, 1006, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzf(zzlcVarZzaa, i, j, j2);
            }
        });
    }

    protected final void zzZ(zzlc zzlcVar, int i, zzdy zzdyVar) {
        this.zze.put(i, zzlcVar);
        zzeb zzebVar = this.zzf;
        zzebVar.zzd(i, zzdyVar);
        zzebVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zza(final zzcc zzccVar) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaf(int i, zzss zzssVar, final zzso zzsoVar) {
        final zzlc zzlcVarZzab = zzab(i, zzssVar);
        zzZ(zzlcVarZzab, 1004, new zzdy() { // from class: com.google.android.gms.internal.ads.zzln
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzg(zzlcVarZzab, zzsoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzag(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzlcVarZzab = zzab(i, zzssVar);
        zzZ(zzlcVarZzab, 1002, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzah(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzlcVarZzab = zzab(i, zzssVar);
        zzZ(zzlcVarZzab, 1001, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzai(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar, final IOException iOException, final boolean z) {
        final zzlc zzlcVarZzab = zzab(i, zzssVar);
        zzZ(zzlcVarZzab, 1003, new zzdy() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzj(zzlcVarZzab, zzsjVar, zzsoVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaj(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzlcVarZzab = zzab(i, zzssVar);
        zzZ(zzlcVarZzab, 1000, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzb(final zzt zztVar) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 29, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzc(final int i, final boolean z) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 30, new zzdy(i, z) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzd(final boolean z) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 3, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zze(final boolean z) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 7, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzf(final zzbg zzbgVar, final int i) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 1, new zzdy(zzbgVar, i) { // from class: com.google.android.gms.internal.ads.zzmo
            public final /* synthetic */ zzbg zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzg(final zzbm zzbmVar) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzh(final boolean z, final int i) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 5, new zzdy(z, i) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzi(final zzby zzbyVar) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzj(final int i) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzk(zzlcVarZzU, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzk(final int i) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 6, new zzdy(i) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzl(final zzbw zzbwVar) {
        final zzlc zzlcVarZzae = zzae(zzbwVar);
        zzZ(zzlcVarZzae, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzl(zzlcVarZzae, zzbwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzm(final zzbw zzbwVar) {
        final zzlc zzlcVarZzae = zzae(zzbwVar);
        zzZ(zzlcVarZzae, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzn(final boolean z, final int i) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, -1, new zzdy(z, i) { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzp() {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, -1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzq(final boolean z) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 23, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzr(final int i, final int i2) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 24, new zzdy(i, i2) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzt(final zzcy zzcyVar) {
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzu(final zzda zzdaVar) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 25, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzlc zzlcVar = zzlcVarZzad;
                zzda zzdaVar2 = zzdaVar;
                ((zzle) obj).zzq(zzlcVar, zzdaVar2);
                int i = zzdaVar2.zzc;
                int i2 = zzdaVar2.zzd;
                int i3 = zzdaVar2.zze;
                float f = zzdaVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzv(final float f) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 22, new zzdy(f) { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzw(zzle zzleVar) {
        this.zzf.zzb(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzx() {
        if (this.zzi) {
            return;
        }
        final zzlc zzlcVarZzU = zzU();
        this.zzi = true;
        zzZ(zzlcVarZzU, -1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzy(final Exception exc) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1029, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzz(final String str, final long j, final long j2) {
        final zzlc zzlcVarZzad = zzad();
        zzZ(zzlcVarZzad, 1008, new zzdy(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmh
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    private final zzlc zzaa(zzss zzssVar) {
        this.zzg.getClass();
        zzcn zzcnVarZza = zzssVar == null ? null : this.zzd.zza(zzssVar);
        if (zzssVar != null && zzcnVarZza != null) {
            return zzV(zzcnVarZza, zzcnVarZza.zzn(zzssVar.zza, this.zzb).zzd, zzssVar);
        }
        int iZzg = this.zzg.zzg();
        zzcn zzcnVarZzq = this.zzg.zzq();
        if (iZzg >= zzcnVarZzq.zzc()) {
            zzcnVarZzq = zzcn.zza;
        }
        return zzV(zzcnVarZzq, iZzg, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzT(List list, zzss zzssVar) {
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        zzcgVar.getClass();
        zzneVar.zzh(list, zzssVar, zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzo(final zzcf zzcfVar, final zzcf zzcfVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        zzcgVar.getClass();
        zzneVar.zzg(zzcgVar);
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
                zzleVar.zzm(zzlcVarZzU, zzcfVar, zzcfVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzs(zzcn zzcnVar, final int i) {
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        zzcgVar.getClass();
        zzneVar.zzi(zzcgVar);
        final zzlc zzlcVarZzU = zzU();
        zzZ(zzlcVarZzU, 0, new zzdy(i) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
            }
        });
    }

    public zznf(zzdm zzdmVar) {
        zzdmVar.getClass();
        this.zza = zzdmVar;
        this.zzf = new zzeb(zzew.zzE(), zzdmVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzdz
            public final void zza(Object obj, zzaa zzaaVar) {
            }
        });
        zzck zzckVar = new zzck();
        this.zzb = zzckVar;
        this.zzc = new zzcm();
        this.zzd = new zzne(zzckVar);
        this.zze = new SparseArray();
    }
}
