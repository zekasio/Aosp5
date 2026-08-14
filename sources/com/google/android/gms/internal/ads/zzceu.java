package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzceu {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcei, java.lang.Object] */
    public static final zzcei zza(final Context context, final zzcfx zzcfxVar, final String str, final boolean z, final boolean z2, final zzapw zzapwVar, final zzbbt zzbbtVar, final zzbzg zzbzgVar, zzbbj zzbbjVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzawe zzaweVar, final zzeyc zzeycVar, final zzeyf zzeyfVar) throws zzcet {
        zzbar.zzc(context);
        try {
            final zzbbj zzbbjVar2 = null;
            zzfok zzfokVar = new zzfok(context, zzcfxVar, str, z, z2, zzapwVar, zzbbtVar, zzbzgVar, zzbbjVar2, zzlVar, zzaVar, zzaweVar, zzeycVar, zzeyfVar) { // from class: com.google.android.gms.internal.ads.zzceq
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcfx zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzapw zzf;
                public final /* synthetic */ zzbbt zzg;
                public final /* synthetic */ zzbzg zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzawe zzk;
                public final /* synthetic */ zzeyc zzl;
                public final /* synthetic */ zzeyf zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzaweVar;
                    this.zzl = zzeycVar;
                    this.zzm = zzeyfVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcfx zzcfxVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzapw zzapwVar2 = this.zzf;
                    zzbbt zzbbtVar2 = this.zzg;
                    zzbzg zzbzgVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzawe zzaweVar2 = this.zzk;
                    zzeyc zzeycVar2 = this.zzl;
                    zzeyf zzeyfVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfb.zza;
                        zzcex zzcexVar = new zzcex(new zzcfb(new zzcfw(context2), zzcfxVar2, str2, z3, z4, zzapwVar2, zzbbtVar2, zzbzgVar2, null, zzlVar2, zzaVar2, zzaweVar2, zzeycVar2, zzeyfVar2));
                        zzcexVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcexVar, zzaweVar2, z4));
                        zzcexVar.setWebChromeClient(new zzceh(zzcexVar));
                        return zzcexVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzfokVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcet("Webview initialization failed.", th);
        }
    }
}
