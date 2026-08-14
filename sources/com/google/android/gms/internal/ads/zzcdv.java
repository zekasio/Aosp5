package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdv extends zzcba implements zzgi, zzle {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdg zzc;
    private final zzwc zzd;
    private final zzcbi zze;
    private final WeakReference zzf;
    private final zzty zzg;
    private zzhu zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcaz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final ArrayList zzr;
    private volatile zzcdi zzs;
    private final Object zzq = new Object();
    private final Set zzt = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcdv(android.content.Context r6, com.google.android.gms.internal.ads.zzcbi r7, com.google.android.gms.internal.ads.zzcbj r8) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbi, com.google.android.gms.internal.ads.zzcbj):void");
    }

    private final boolean zzab() {
        return this.zzs != null && this.zzs.zzq();
    }

    public final void finalize() {
        zzC().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzA() {
        if (zzab()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzB() {
        if (zzab()) {
            return this.zzs.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzr.isEmpty()) {
                long j = this.zzn;
                Map mapZze = ((zzgd) this.zzr.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfnb.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzE(Uri[] uriArr, String str) {
        zzF(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzG() {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzD(this);
            this.zzh.zzt();
            this.zzh = null;
            zzD().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzH(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzg(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzI(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzJ(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzK(zzcaz zzcazVar) {
        this.zzk = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzL(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzM(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzN(boolean z) {
        this.zzh.zzu(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzO(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzB();
            if (i >= 2) {
                return;
            }
            zzwc zzwcVar = this.zzd;
            zzvo zzvoVarZzc = zzwcVar.zzc().zzc();
            zzvoVarZzc.zzo(i, !z);
            zzwcVar.zzj(zzvoVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzP(int i) {
        Iterator it = this.zzt.iterator();
        while (it.hasNext()) {
            zzcdf zzcdfVar = (zzcdf) ((WeakReference) it.next()).get();
            if (zzcdfVar != null) {
                zzcdfVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzQ(Surface surface, boolean z) {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzv(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzR(float f, boolean z) {
        zzhu zzhuVar = this.zzh;
        if (zzhuVar != null) {
            zzhuVar.zzw(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzS() {
        this.zzh.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final boolean zzT() {
        return this.zzh != null;
    }

    final /* synthetic */ zzfg zzU(String str, boolean z) {
        zzcbi zzcbiVar = this.zze;
        return new zzcdy(str, true != z ? null : this, zzcbiVar.zzd, zzcbiVar.zzf, zzcbiVar.zzn, zzcbiVar.zzo);
    }

    final /* synthetic */ zzfg zzV(String str, boolean z) {
        zzcbi zzcbiVar = this.zze;
        zzcdf zzcdfVar = new zzcdf(str, true != z ? null : this, zzcbiVar.zzd, zzcbiVar.zzf, zzcbiVar.zzi);
        this.zzt.add(new WeakReference(zzcdfVar));
        return zzcdfVar;
    }

    final /* synthetic */ zzfg zzW(String str, boolean z) {
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzf(str);
        zzfoVar.zze(true != z ? null : this);
        zzfoVar.zzc(this.zze.zzd);
        zzfoVar.zzd(this.zze.zzf);
        zzfoVar.zzb(true);
        return zzfoVar.zza();
    }

    final /* synthetic */ zzfg zzX(zzff zzffVar) {
        return new zzcdi(this.zzb, zzffVar.zza(), this.zzo, this.zzp, this, new zzcdl(this), null);
    }

    final zzsu zzY(Uri uri) {
        zzaj zzajVar = new zzaj();
        zzajVar.zzb(uri);
        zzbg zzbgVarZzc = zzajVar.zzc();
        zzty zztyVar = this.zzg;
        zztyVar.zza(this.zze.zzg);
        return zztyVar.zzb(zzbgVarZzc);
    }

    final /* synthetic */ void zzZ(boolean z, long j) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzi(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
        this.zzl += i;
    }

    final /* synthetic */ zzkn[] zzaa(Handler handler, zzyp zzypVar, zzoc zzocVar, zzuu zzuuVar, zzrs zzrsVar) {
        Context context = this.zzb;
        zzrc zzrcVar = zzrc.zzb;
        zznq zznqVar = zznq.zza;
        zzde[] zzdeVarArr = new zzde[0];
        zzot zzotVar = new zzot();
        zznq zznqVar2 = zznq.zza;
        if (zznqVar == null) {
            if (zznqVar2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            zznqVar = zznqVar2;
        }
        zzotVar.zzb(zznqVar);
        zzotVar.zzc(zzdeVarArr);
        return new zzkn[]{new zzpl(context, zzqt.zza, zzrcVar, false, handler, zzocVar, zzotVar.zzd()), new zzxs(this.zzb, zzqt.zza, zzrc.zzb, 0L, false, handler, zzypVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzfgVar instanceof zzgd) {
            synchronized (this.zzq) {
                this.zzr.add((zzgd) zzfgVar);
            }
        } else if (zzfgVar instanceof zzcdi) {
            this.zzs = (zzcdi) zzfgVar;
            final zzcbj zzcbjVar = (zzcbj) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() && zzcbjVar != null && this.zzs.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzs.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzs.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbj zzcbjVar2 = zzcbjVar;
                        Map map2 = map;
                        int i = zzcdv.zza;
                        zzcbjVar2.zzd("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zze(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
        zzcbj zzcbjVar = (zzcbj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() || zzcbjVar == null || zzafVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzafVar.zzl;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcbjVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzf(zzlc zzlcVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzg(zzlc zzlcVar, zzso zzsoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh(zzlc zzlcVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzi(zzcg zzcgVar, zzld zzldVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzj(zzlc zzlcVar, zzsj zzsjVar, zzso zzsoVar, IOException iOException, boolean z) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            if (this.zze.zzk) {
                zzcazVar.zzl("onLoadException", iOException);
            } else {
                zzcazVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzk(zzlc zzlcVar, int i) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzl(zzlc zzlcVar, zzbw zzbwVar) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzk("onPlayerError", zzbwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzm(zzlc zzlcVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzn(zzlc zzlcVar, Object obj, long j) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final /* synthetic */ void zzo(zzlc zzlcVar, zzhb zzhbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzp(zzlc zzlcVar, zzaf zzafVar, zzhc zzhcVar) {
        zzcbj zzcbjVar = (zzcbj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() || zzcbjVar == null || zzafVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzafVar.zzt));
        map.put("bitRate", String.valueOf(zzafVar.zzi));
        map.put("resolution", zzafVar.zzr + "x" + zzafVar.zzs);
        String str = zzafVar.zzl;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcbjVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzq(zzlc zzlcVar, zzda zzdaVar) {
        zzcaz zzcazVar = this.zzk;
        if (zzcazVar != null) {
            zzcazVar.zzC(zzdaVar.zzc, zzdaVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final int zzt() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzv() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzx() {
        if (zzab() && this.zzs.zzp()) {
            return Math.min(this.zzl, this.zzs.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzy() {
        return this.zzh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final long zzz() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzF(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsu zztkVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zztkVar = zzY(uriArr[0]);
            } else {
                zzsu[] zzsuVarArr = new zzsu[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzsuVarArr[i] = zzY(uriArr[i]);
                }
                zztkVar = new zztk(false, false, zzsuVarArr);
            }
            this.zzh.zzE(zztkVar);
            this.zzh.zzs();
            zzD().incrementAndGet();
        }
    }
}
