package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcm {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    public static final zzn zzb;
    private static final zzbg zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public Object zzc = zza;
    public zzbg zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Deprecated
    public boolean zzj;
    public zzaw zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzq = new Object();

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("androidx.media3.common.Timeline");
        zzajVar.zzb(Uri.EMPTY);
        zzr = zzajVar.zzc();
        zzs = zzew.zzP(1);
        zzt = zzew.zzP(2);
        zzu = zzew.zzP(3);
        zzv = zzew.zzP(4);
        zzw = zzew.zzP(5);
        zzx = zzew.zzP(6);
        zzy = zzew.zzP(7);
        zzz = zzew.zzP(8);
        zzA = zzew.zzP(9);
        zzB = zzew.zzP(10);
        zzC = zzew.zzP(11);
        zzD = zzew.zzP(12);
        zzE = zzew.zzP(13);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcl
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzcm zzcmVar = (zzcm) obj;
            if (zzew.zzU(this.zzc, zzcmVar.zzc) && zzew.zzU(this.zzd, zzcmVar.zzd) && zzew.zzU(null, null) && zzew.zzU(this.zzk, zzcmVar.zzk) && this.zze == zzcmVar.zze && this.zzf == zzcmVar.zzf && this.zzg == zzcmVar.zzg && this.zzh == zzcmVar.zzh && this.zzi == zzcmVar.zzi && this.zzl == zzcmVar.zzl && this.zzn == zzcmVar.zzn && this.zzo == zzcmVar.zzo && this.zzp == zzcmVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaw zzawVar = this.zzk;
        int iHashCode2 = ((iHashCode * 961) + (zzawVar == null ? 0 : zzawVar.hashCode())) * 31;
        long j = this.zze;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzf;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzg;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzl ? 1 : 0);
        long j4 = this.zzn;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzcm zza(Object obj, zzbg zzbgVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzaw zzawVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zzd = zzbgVar == null ? zzr : zzbgVar;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzawVar != null;
        this.zzk = zzawVar;
        this.zzm = 0L;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzdl.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
