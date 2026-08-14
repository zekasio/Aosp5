package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzni implements zznm {
    public static final zzfok zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzng
        @Override // com.google.android.gms.internal.ads.zzfok
        public final Object zza() {
            return zzni.zzl();
        }
    };
    private static final Random zzb = new Random();
    private final zzcm zzc;
    private final zzck zzd;
    private final HashMap zze;
    private final zzfok zzf;
    private zznl zzg;
    private zzcn zzh;
    private String zzi;

    public zzni() {
        throw null;
    }

    private final zznh zzk(int i, zzss zzssVar) {
        long j = Long.MAX_VALUE;
        zznh zznhVar = null;
        for (zznh zznhVar2 : this.zze.values()) {
            zznhVar2.zzg(i, zzssVar);
            if (zznhVar2.zzj(i, zzssVar)) {
                long j2 = zznhVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zznhVar = zznhVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzew.zza;
                    if (zznhVar.zze != null && zznhVar2.zze != null) {
                        zznhVar = zznhVar2;
                    }
                }
            }
        }
        if (zznhVar != null) {
            return zznhVar;
        }
        String strZzl = zzl();
        zznh zznhVar3 = new zznh(this, strZzl, i, zzssVar);
        this.zze.put(strZzl, zznhVar3);
        return zznhVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzlc zzlcVar) {
        if (zzlcVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zznh zznhVar = (zznh) this.zze.get(this.zzi);
        zznh zznhVarZzk = zzk(zzlcVar.zzc, zzlcVar.zzd);
        this.zzi = zznhVarZzk.zzb;
        zzh(zzlcVar);
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null || !zzssVar.zzb()) {
            return;
        }
        if (zznhVar != null && zznhVar.zzd == zzlcVar.zzd.zzd && zznhVar.zze != null && zznhVar.zze.zzb == zzlcVar.zzd.zzb && zznhVar.zze.zzc == zzlcVar.zzd.zzc) {
            return;
        }
        zzss zzssVar2 = zzlcVar.zzd;
        String unused = zzk(zzlcVar.zzc, new zzss(zzssVar2.zza, zzssVar2.zzd)).zzb;
        String unused2 = zznhVarZzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized String zze(zzcn zzcnVar, zzss zzssVar) {
        return zzk(zzcnVar.zzn(zzssVar.zza, this.zzd).zzd, zzssVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzf(zzlc zzlcVar) {
        zznl zznlVar;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            it.remove();
            if (zznhVar.zzf && (zznlVar = this.zzg) != null) {
                zznlVar.zzd(zzlcVar, zznhVar.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzg(zznl zznlVar) {
        this.zzg = zznlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r10.zzd.zzd < r0.zzd) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zznm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzlc r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzni.zzh(com.google.android.gms.internal.ads.zzlc):void");
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzi(zzlc zzlcVar, int i) {
        if (this.zzg == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            if (zznhVar.zzk(zzlcVar)) {
                it.remove();
                if (zznhVar.zzf) {
                    boolean zEquals = zznhVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && zEquals && zznhVar.zzg) {
                        z = true;
                    }
                    if (zEquals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzlcVar, zznhVar.zzb, z);
                }
            }
        }
        zzm(zzlcVar);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final synchronized void zzj(zzlc zzlcVar) {
        if (this.zzg == null) {
            throw null;
        }
        zzcn zzcnVar = this.zzh;
        this.zzh = zzlcVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznh zznhVar = (zznh) it.next();
            if (!zznhVar.zzl(zzcnVar, this.zzh) || zznhVar.zzk(zzlcVar)) {
                it.remove();
                if (zznhVar.zzf) {
                    if (zznhVar.zzb.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzlcVar, zznhVar.zzb, false);
                }
            }
        }
        zzm(zzlcVar);
    }

    public zzni(zzfok zzfokVar) {
        this.zzf = zzfokVar;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        this.zze = new HashMap();
        this.zzh = zzcn.zza;
    }
}
