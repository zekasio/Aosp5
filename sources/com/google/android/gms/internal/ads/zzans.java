package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzans extends zzgqm implements zzgrx {
    private static final zzans zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzanu zzM;
    private zzann zzaC;
    private long zzaI;
    private zzane zzaL;
    private zzang zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzaob zzaW;
    private zzanp zzae;
    private zzanr zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzaod zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgqv zzaf = zzaM();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgqv zzaz = zzaM();
    private int zzaA = 1000;
    private zzgqv zzaB = zzaM();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzans zzansVar = new zzans();
        zzb = zzansVar;
        zzgqm.zzaT(zzans.class, zzansVar);
    }

    private zzans() {
    }

    static /* synthetic */ void zzA(zzans zzansVar, long j) {
        zzansVar.zzd |= 134217728;
        zzansVar.zzH = j;
    }

    static /* synthetic */ void zzB(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzd |= DriveFile.MODE_READ_ONLY;
        zzansVar.zzI = str;
    }

    static /* synthetic */ void zzC(zzans zzansVar, long j) {
        zzansVar.zzd |= DriveFile.MODE_WRITE_ONLY;
        zzansVar.zzJ = j;
    }

    static /* synthetic */ void zzD(zzans zzansVar, long j) {
        zzansVar.zzd |= 1073741824;
        zzansVar.zzK = j;
    }

    static /* synthetic */ void zzE(zzans zzansVar, long j) {
        zzansVar.zzd |= Integer.MIN_VALUE;
        zzansVar.zzL = j;
    }

    static /* synthetic */ void zzF(zzans zzansVar, long j) {
        zzansVar.zze |= 2;
        zzansVar.zzN = j;
    }

    static /* synthetic */ void zzG(zzans zzansVar, long j) {
        zzansVar.zze |= 4;
        zzansVar.zzO = j;
    }

    static /* synthetic */ void zzH(zzans zzansVar, long j) {
        zzansVar.zze |= 8;
        zzansVar.zzP = j;
    }

    static /* synthetic */ void zzI(zzans zzansVar, long j) {
        zzansVar.zze |= 16;
        zzansVar.zzQ = j;
    }

    static /* synthetic */ void zzJ(zzans zzansVar, long j) {
        zzansVar.zze |= 32;
        zzansVar.zzR = j;
    }

    static /* synthetic */ void zzK(zzans zzansVar, long j) {
        zzansVar.zze |= 64;
        zzansVar.zzS = j;
    }

    static /* synthetic */ void zzL(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zze |= 128;
        zzansVar.zzT = str;
    }

    static /* synthetic */ void zzM(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zze |= 256;
        zzansVar.zzU = str;
    }

    static /* synthetic */ void zzN(zzans zzansVar, long j) {
        zzansVar.zze |= 4096;
        zzansVar.zzY = j;
    }

    static /* synthetic */ void zzO(zzans zzansVar, long j) {
        zzansVar.zze |= 8192;
        zzansVar.zzZ = j;
    }

    static /* synthetic */ void zzP(zzans zzansVar, long j) {
        zzansVar.zze |= 16384;
        zzansVar.zzaa = j;
    }

    static /* synthetic */ void zzQ(zzans zzansVar, zzanp zzanpVar) {
        zzanpVar.getClass();
        zzansVar.zzae = zzanpVar;
        zzansVar.zze |= 262144;
    }

    static /* synthetic */ void zzR(zzans zzansVar, zzanp zzanpVar) {
        zzanpVar.getClass();
        zzgqv zzgqvVar = zzansVar.zzaf;
        if (!zzgqvVar.zzc()) {
            zzansVar.zzaf = zzgqm.zzaN(zzgqvVar);
        }
        zzansVar.zzaf.add(zzanpVar);
    }

    static /* synthetic */ void zzT(zzans zzansVar, zzanr zzanrVar) {
        zzanrVar.getClass();
        zzansVar.zzag = zzanrVar;
        zzansVar.zze |= 524288;
    }

    static /* synthetic */ void zzU(zzans zzansVar, long j) {
        zzansVar.zze |= 2097152;
        zzansVar.zzai = j;
    }

    static /* synthetic */ void zzV(zzans zzansVar, long j) {
        zzansVar.zze |= 4194304;
        zzansVar.zzaj = j;
    }

    static /* synthetic */ void zzW(zzans zzansVar, long j) {
        zzansVar.zze |= 8388608;
        zzansVar.zzak = j;
    }

    static /* synthetic */ void zzX(zzans zzansVar, long j) {
        zzansVar.zze |= 67108864;
        zzansVar.zzan = j;
    }

    static /* synthetic */ void zzY(zzans zzansVar, long j) {
        zzansVar.zze |= 134217728;
        zzansVar.zzao = j;
    }

    static /* synthetic */ void zzZ(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zze |= DriveFile.MODE_READ_ONLY;
        zzansVar.zzap = str;
    }

    public static zzamv zza() {
        return (zzamv) zzb.zzaA();
    }

    static /* synthetic */ void zzaa(zzans zzansVar, long j) {
        zzansVar.zzf |= 512;
        zzansVar.zzaE = j;
    }

    static /* synthetic */ void zzab(zzans zzansVar, long j) {
        zzansVar.zzf |= 1024;
        zzansVar.zzaF = j;
    }

    static /* synthetic */ void zzac(zzans zzansVar, long j) {
        zzansVar.zzf |= 2048;
        zzansVar.zzaG = j;
    }

    static /* synthetic */ void zzad(zzans zzansVar, long j) {
        zzansVar.zzf |= 4096;
        zzansVar.zzaH = j;
    }

    static /* synthetic */ void zzae(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzf |= 32768;
        zzansVar.zzaK = str;
    }

    static /* synthetic */ void zzaf(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzf |= 4194304;
        zzansVar.zzaR = str;
    }

    static /* synthetic */ void zzag(zzans zzansVar, boolean z) {
        zzansVar.zzf |= 16777216;
        zzansVar.zzaT = z;
    }

    static /* synthetic */ void zzah(zzans zzansVar, long j) {
        zzansVar.zzf |= 67108864;
        zzansVar.zzaV = j;
    }

    static /* synthetic */ void zzam(zzans zzansVar, int i) {
        zzansVar.zzW = i - 1;
        zzansVar.zze |= 1024;
    }

    static /* synthetic */ void zzan(zzans zzansVar, int i) {
        zzansVar.zzX = i - 1;
        zzansVar.zze |= 2048;
    }

    static /* synthetic */ void zzao(zzans zzansVar, int i) {
        zzansVar.zzad = i - 1;
        zzansVar.zze |= 131072;
    }

    static /* synthetic */ void zzap(zzans zzansVar, int i) {
        zzansVar.zzaw = i - 1;
        zzansVar.zzf |= 8;
    }

    static /* synthetic */ void zzaq(zzans zzansVar, int i) {
        zzansVar.zzax = i - 1;
        zzansVar.zzf |= 16;
    }

    static /* synthetic */ void zzar(zzans zzansVar, int i) {
        zzansVar.zzaP = i - 1;
        zzansVar.zzf |= 1048576;
    }

    static /* synthetic */ void zzas(zzans zzansVar, int i) {
        zzansVar.zzaS = 5;
        zzansVar.zzf |= 8388608;
    }

    public static zzans zzd() {
        return zzb;
    }

    public static zzans zze(byte[] bArr, zzgpy zzgpyVar) throws zzgqy {
        return (zzans) zzgqm.zzaI(zzb, bArr, zzgpyVar);
    }

    static /* synthetic */ void zzi(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzd |= 1;
        zzansVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzd |= 2;
        zzansVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzans zzansVar, long j) {
        zzansVar.zzd |= 4;
        zzansVar.zzi = j;
    }

    static /* synthetic */ void zzl(zzans zzansVar, long j) {
        zzansVar.zzd |= 16;
        zzansVar.zzk = j;
    }

    static /* synthetic */ void zzm(zzans zzansVar, long j) {
        zzansVar.zzd |= 32;
        zzansVar.zzl = j;
    }

    static /* synthetic */ void zzn(zzans zzansVar, long j) {
        zzansVar.zzd |= 1024;
        zzansVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzans zzansVar, long j) {
        zzansVar.zzd |= 2048;
        zzansVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzans zzansVar, long j) {
        zzansVar.zzd |= 8192;
        zzansVar.zzt = j;
    }

    static /* synthetic */ void zzq(zzans zzansVar, long j) {
        zzansVar.zzd |= 16384;
        zzansVar.zzu = j;
    }

    static /* synthetic */ void zzr(zzans zzansVar, long j) {
        zzansVar.zzd |= 32768;
        zzansVar.zzv = j;
    }

    static /* synthetic */ void zzs(zzans zzansVar, long j) {
        zzansVar.zzd |= 65536;
        zzansVar.zzw = j;
    }

    static /* synthetic */ void zzt(zzans zzansVar, long j) {
        zzansVar.zzd |= 524288;
        zzansVar.zzz = j;
    }

    static /* synthetic */ void zzu(zzans zzansVar, long j) {
        zzansVar.zzd |= 1048576;
        zzansVar.zzA = j;
    }

    static /* synthetic */ void zzv(zzans zzansVar, long j) {
        zzansVar.zzd |= 2097152;
        zzansVar.zzB = j;
    }

    static /* synthetic */ void zzw(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzd |= 4194304;
        zzansVar.zzC = str;
    }

    static /* synthetic */ void zzx(zzans zzansVar, String str) {
        str.getClass();
        zzansVar.zzd |= 16777216;
        zzansVar.zzE = str;
    }

    static /* synthetic */ void zzy(zzans zzansVar, long j) {
        zzansVar.zzd |= 33554432;
        zzansVar.zzF = j;
    }

    static /* synthetic */ void zzz(zzans zzansVar, long j) {
        zzansVar.zzd |= 67108864;
        zzansVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int iZza = zzanb.zza(this.zzaS);
        if (iZza == 0) {
            return 3;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgqq zzgqqVar = zzany.zza;
            return zzaQ(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001aဌW\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^ဌTÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzana.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzanp.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgqqVar, "zzX", zzgqqVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgqqVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzanx.zza, "zzas", zzanz.zza, "zzap", "zzat", zzamw.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgqqVar, "zzV", "zzD", "zzax", zzgqqVar, "zzay", "zzaz", zzanl.class, "zzaA", zzgqqVar, "zzaB", zzamy.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzani.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new zzans();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzamv(zzamuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaob zzf() {
        zzaob zzaobVar = this.zzaW;
        return zzaobVar == null ? zzaob.zzd() : zzaobVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
