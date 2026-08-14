package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahw implements zzahn {
    private final zzaio zza;
    private long zze;
    private String zzg;
    private zzabb zzh;
    private zzahv zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaic zzb = new zzaic(7, 128);
    private final zzaic zzc = new zzaic(8, 128);
    private final zzaic zzd = new zzaic(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzen zzm = new zzen();

    public zzahw(zzaio zzaioVar, boolean z, boolean z2) {
        this.zza = zzaioVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zzh);
        int i = zzew.zza;
        int iZzc = zzenVar.zzc();
        int iZzd = zzenVar.zzd();
        byte[] bArrZzH = zzenVar.zzH();
        this.zze += (long) zzenVar.zza();
        this.zzh.zzq(zzenVar, zzenVar.zza());
        while (true) {
            int iZza = zzaar.zza(bArrZzH, iZzc, iZzd, this.zzf);
            if (iZza == iZzd) {
                zzf(bArrZzH, iZzc, iZzd);
                return;
            }
            int i2 = iZza + 3;
            int i3 = bArrZzH[i2] & Ascii.US;
            int i4 = iZza - iZzc;
            if (i4 > 0) {
                zzf(bArrZzH, iZzc, iZza);
            }
            int i5 = iZzd - iZza;
            long j = this.zze - ((long) i5);
            int i6 = i4 < 0 ? -i4 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i6);
                this.zzc.zzd(i6);
                if (this.zzj) {
                    zzaic zzaicVar = this.zzb;
                    if (zzaicVar.zze()) {
                        this.zzi.zzb(zzaar.zzd(zzaicVar.zza, 4, zzaicVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzaic zzaicVar2 = this.zzc;
                        if (zzaicVar2.zze()) {
                            this.zzi.zza(zzaar.zzc(zzaicVar2.zza, 4, zzaicVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzaic zzaicVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzaicVar3.zza, zzaicVar3.zzb));
                    zzaic zzaicVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzaicVar4.zza, zzaicVar4.zzb));
                    zzaic zzaicVar5 = this.zzb;
                    zzaaq zzaaqVarZzd = zzaar.zzd(zzaicVar5.zza, 4, zzaicVar5.zzb);
                    zzaic zzaicVar6 = this.zzc;
                    zzaap zzaapVarZzc = zzaar.zzc(zzaicVar6.zza, 4, zzaicVar6.zzb);
                    String strZza = zzdn.zza(zzaaqVarZzd.zza, zzaaqVarZzd.zzb, zzaaqVarZzd.zzc);
                    zzabb zzabbVar = this.zzh;
                    zzad zzadVar = new zzad();
                    zzadVar.zzH(this.zzg);
                    zzadVar.zzS("video/avc");
                    zzadVar.zzx(strZza);
                    zzadVar.zzX(zzaaqVarZzd.zze);
                    zzadVar.zzF(zzaaqVarZzd.zzf);
                    zzadVar.zzP(zzaaqVarZzd.zzg);
                    zzadVar.zzI(arrayList);
                    zzabbVar.zzk(zzadVar.zzY());
                    this.zzj = true;
                    this.zzi.zzb(zzaaqVarZzd);
                    this.zzi.zza(zzaapVarZzc);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
            }
            if (this.zzd.zzd(i6)) {
                zzaic zzaicVar7 = this.zzd;
                this.zzm.zzD(this.zzd.zza, zzaar.zzb(zzaicVar7.zza, zzaicVar7.zzb));
                this.zzm.zzF(4);
                this.zza.zza(j2, this.zzm);
            }
            if (this.zzi.zze(j, i5, this.zzj, this.zzl)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i3);
                this.zzc.zzc(i3);
            }
            this.zzd.zzc(i3);
            this.zzi.zzd(j, i3, j3);
            iZzc = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzg = zzaizVar.zzb();
        zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzh = zzabbVarZzv;
        this.zzi = new zzahv(zzabbVarZzv, false, false);
        this.zza.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzaar.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzahv zzahvVar = this.zzi;
        if (zzahvVar != null) {
            zzahvVar.zzc();
        }
    }
}
