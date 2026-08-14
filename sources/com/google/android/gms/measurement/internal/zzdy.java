package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdy extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzdy(zzfr zzfrVar, long j) {
        super(zzfrVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)(21:87|6|(1:10)(2:11|(1:13))|83|14|(4:16|(1:18)(1:20)|85|21)|26|(1:31)(1:30)|32|SW:33|43|(1:45)|89|46|(1:48)|49|(3:51|(1:53)(1:54)|55)|(3:57|(1:59)(1:60)|61)|65|(2:68|(1:70)(4:71|(3:74|(1:92)(1:93)|72)|91|77))(1:77)|(2:79|80)(2:81|82))|5|26|(2:28|31)(0)|32|SW:33|43|(0)|89|46|(0)|49|(0)|(0)|65|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01db, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
    
        r11.zzt.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194 A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024c  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzd() {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        zza();
        return this.zzj;
    }

    final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0275  */
    /* JADX WARN: Type inference failed for: r9v33, types: [com.google.android.gms.measurement.internal.zzgk, com.google.android.gms.measurement.internal.zzlb] */
    /* JADX WARN: Type inference failed for: r9v34, types: [com.google.android.gms.measurement.internal.zzgk] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.zzq zzj(java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    final String zzk() {
        zza();
        return this.zzl;
    }

    final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    final List zzn() {
        return this.zzh;
    }

    final void zzo() {
        String str;
        zzg();
        if (this.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        this.zzt.zzay().zzc().zza(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.zzm = str;
        this.zzn = this.zzt.zzav().currentTimeMillis();
    }

    final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
