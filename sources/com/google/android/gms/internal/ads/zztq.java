package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zztq implements zzxc, zzsh {
    final /* synthetic */ zztv zza;
    private final Uri zzc;
    private final zzgh zzd;
    private final zztl zze;
    private final zzzx zzf;
    private final zzdo zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzabb zzm;
    private boolean zzn;
    private final zzaau zzh = new zzaau();
    private boolean zzj = true;
    private final long zzb = zzsj.zza();
    private zzfl zzl = zzi(0);

    public zztq(zztv zztvVar, Uri uri, zzfg zzfgVar, zztl zztlVar, zzzx zzzxVar, zzdo zzdoVar) {
        this.zza = zztvVar;
        this.zzc = uri;
        this.zzd = new zzgh(zzfgVar);
        this.zze = zztlVar;
        this.zzf = zzzxVar;
        this.zzg = zzdoVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zztq zztqVar, long j, long j2) {
        zztqVar.zzh.zza = j;
        zztqVar.zzk = j2;
        zztqVar.zzj = true;
        zztqVar.zzn = false;
    }

    private final zzfl zzi(long j) {
        zzfj zzfjVar = new zzfj();
        zzfjVar.zzd(this.zzc);
        zzfjVar.zzc(j);
        zzfjVar.zza(6);
        zzfjVar.zzb(zztv.zzb);
        return zzfjVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[LOOP:0: B:3:0x0004->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #6 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:13:0x0041, B:22:0x0077, B:24:0x0082, B:26:0x008e, B:28:0x0098, B:30:0x00a4, B:32:0x00ae, B:34:0x00ba, B:36:0x00c4, B:38:0x00d6, B:40:0x00e0, B:41:0x00e6, B:50:0x0116, B:51:0x011d, B:53:0x012a, B:55:0x0132, B:57:0x014f, B:59:0x016a, B:60:0x016f, B:62:0x0173, B:44:0x00f0, B:47:0x0104, B:17:0x004d, B:20:0x0063), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(zzen zzenVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zztv.zzq(this.zza, true), this.zzk);
        int iZza = zzenVar.zza();
        zzabb zzabbVar = this.zzm;
        zzabbVar.getClass();
        zzaaz.zzb(zzabbVar, zzenVar, iZza);
        zzabbVar.zzs(jMax, 1, iZza, 0, null);
        this.zzn = true;
    }
}
