package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfee implements zzfec {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    zzfee(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzfee zzH(int i) {
        this.zzp = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzb(zzeyn zzeynVar) {
        zzr(zzeynVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzf(boolean z) {
        zzv(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final synchronized zzfeg zzl() {
        zzfef zzfefVar = null;
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfeg(this, zzfefVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final /* bridge */ /* synthetic */ zzfec zzm(int i) {
        zzH(i);
        return this;
    }

    public final synchronized zzfee zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcuh zzcuhVar = (zzcuh) iBinder;
        String strZzk = zzcuhVar.zzk();
        if (!TextUtils.isEmpty(strZzk)) {
            this.zzf = strZzk;
        }
        String strZzi = zzcuhVar.zzi();
        if (!TextUtils.isEmpty(strZzi)) {
            this.zzg = strZzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfee zzr(com.google.android.gms.internal.ads.zzeyn r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzeyf r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzeyf r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzeyc r0 = (com.google.android.gms.internal.ads.zzeyc) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            goto L35
        L34:
            throw r3
        L35:
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfee.zzr(com.google.android.gms.internal.ads.zzeyn):com.google.android.gms.internal.ads.zzfee");
    }

    public final synchronized zzfee zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzib)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfee zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfee zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfee zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfee zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzib)).booleanValue()) {
            this.zzk = zzbsf.zzd(th);
            this.zzj = (String) zzfoh.zzc(zzfng.zzc('\n')).zzd(zzbsf.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfee zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfee zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
