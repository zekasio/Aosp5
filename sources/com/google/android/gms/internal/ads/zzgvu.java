package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvu extends zzgqm implements zzgrx {
    private static final zzgvu zzb;
    private zzgur zzB;
    private zzguj zzD;
    private int zzd;
    private int zze;
    private int zzf;
    private zzgun zzj;
    private zzgvi zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzgvq zzu;
    private boolean zzv;
    private zzgvt zzz;
    private byte zzF = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgqv zzk = zzaM();
    private zzgqv zzl = zzaM();
    private String zzm = "";
    private zzgqv zzp = zzgqm.zzaM();
    private String zzq = "";
    private zzgpe zzt = zzgpe.zzb;
    private String zzw = "";
    private zzgqv zzx = zzgqm.zzaM();
    private zzgqv zzy = zzgqm.zzaM();
    private zzgqv zzA = zzaM();
    private String zzC = "";
    private zzgqv zzE = zzaM();

    static {
        zzgvu zzgvuVar = new zzgvu();
        zzb = zzgvuVar;
        zzgqm.zzaT(zzgvu.class, zzgvuVar);
    }

    private zzgvu() {
    }

    public static zzgul zza() {
        return (zzgul) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgvu zzgvuVar, String str) {
        str.getClass();
        zzgvuVar.zzd |= 4;
        zzgvuVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzgvu zzgvuVar, String str) {
        str.getClass();
        zzgvuVar.zzd |= 8;
        zzgvuVar.zzh = str;
    }

    static /* synthetic */ void zzi(zzgvu zzgvuVar, zzgun zzgunVar) {
        zzgunVar.getClass();
        zzgvuVar.zzj = zzgunVar;
        zzgvuVar.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzgvu zzgvuVar, zzgvo zzgvoVar) {
        zzgvoVar.getClass();
        zzgqv zzgqvVar = zzgvuVar.zzk;
        if (!zzgqvVar.zzc()) {
            zzgvuVar.zzk = zzgqm.zzaN(zzgqvVar);
        }
        zzgvuVar.zzk.add(zzgvoVar);
    }

    static /* synthetic */ void zzk(zzgvu zzgvuVar, String str) {
        zzgvuVar.zzd |= 64;
        zzgvuVar.zzm = str;
    }

    static /* synthetic */ void zzl(zzgvu zzgvuVar) {
        zzgvuVar.zzd &= -65;
        zzgvuVar.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgvu zzgvuVar, zzgvi zzgviVar) {
        zzgviVar.getClass();
        zzgvuVar.zzn = zzgviVar;
        zzgvuVar.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzgvu zzgvuVar, zzgvq zzgvqVar) {
        zzgvqVar.getClass();
        zzgvuVar.zzu = zzgvqVar;
        zzgvuVar.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzgvu zzgvuVar, Iterable iterable) {
        zzgqv zzgqvVar = zzgvuVar.zzx;
        if (!zzgqvVar.zzc()) {
            zzgvuVar.zzx = zzgqm.zzaN(zzgqvVar);
        }
        zzgon.zzav(iterable, zzgvuVar.zzx);
    }

    static /* synthetic */ void zzp(zzgvu zzgvuVar, Iterable iterable) {
        zzgqv zzgqvVar = zzgvuVar.zzy;
        if (!zzgqvVar.zzc()) {
            zzgvuVar.zzy = zzgqm.zzaN(zzgqvVar);
        }
        zzgon.zzav(iterable, zzgvuVar.zzy);
    }

    static /* synthetic */ void zzq(zzgvu zzgvuVar, int i) {
        zzgvuVar.zze = i - 1;
        zzgvuVar.zzd |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        if (i2 == 2) {
            return zzaQ(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgvo.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgvj.zza, "zzf", zzguk.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgvy.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgwe.class, "zzB", "zzC", "zzD", "zzE", zzguv.class});
        }
        if (i2 == 3) {
            return new zzgvu();
        }
        zzgub zzgubVar = null;
        if (i2 == 4) {
            return new zzgul(zzgubVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzF = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
