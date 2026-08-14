package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhu {
    private final zzdmq zza;
    private final zzdlf zzb;
    private final zzcnq zzc;
    private final zzdgq zzd;

    public zzdhu(zzdmq zzdmqVar, zzdlf zzdlfVar, zzcnq zzcnqVar, zzdgq zzdgqVar) {
        this.zza = zzdmqVar;
        this.zzb = zzdlfVar;
        this.zzc = zzcnqVar;
        this.zzd = zzdgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcet {
        zzcei zzceiVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zzceiVarZza;
        view.setVisibility(8);
        zzceiVarZza.zzad("/sendMessageToSdk", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdho
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcei) obj, map);
            }
        });
        zzceiVarZza.zzad("/adMuted", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhp
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzceiVarZza), "/loadHtml", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhq
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, final Map map) {
                final zzdhu zzdhuVar = this.zza;
                zzcei zzceiVar = (zzcei) obj;
                zzceiVar.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdht
                    @Override // com.google.android.gms.internal.ads.zzcft
                    public final void zza(boolean z) {
                        zzdhuVar.zzd(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzceiVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzceiVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zzceiVarZza), "/showOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhr
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzceiVarZza), "/hideOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhs
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcei) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcei zzceiVar, Map map) {
        this.zzd.zzg();
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(zzcei zzceiVar, Map map) {
        zzbza.zzi("Showing native ads overlay.");
        zzceiVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcei zzceiVar, Map map) {
        zzbza.zzi("Hiding native ads overlay.");
        zzceiVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
