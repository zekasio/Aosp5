package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcyv implements AppEventListener, OnAdMetadataChangedListener, zzcuo, com.google.android.gms.ads.internal.client.zza, zzcwz, zzcvi, zzcwn, com.google.android.gms.ads.internal.overlay.zzo, zzcve, zzdcc {
    private final zzcyt zza = new zzcyt(this, null);

    @Nullable
    private zzeib zzb;

    @Nullable
    private zzeif zzc;

    @Nullable
    private zzeua zzd;

    @Nullable
    private zzexf zze;

    private static void zzw(Object obj, zzcyu zzcyuVar) {
        if (obj != null) {
            zzcyuVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).onAdClicked();
            }
        });
        zzw(this.zzc, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyk
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeif) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyc
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxl
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyp
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxo
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxp
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxq
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzbr();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxr
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzby();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxk
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzg() {
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxx
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcym
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzh(zzsVar);
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzh(zzsVar);
            }
        });
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyo
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzh(zzsVar);
            }
        });
    }

    public final zzcyt zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyd
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzj();
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxs
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzk(zzeVar);
            }
        });
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxt
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzk(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxv
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzm();
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyl
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyq
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzo();
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(final zzbud zzbudVar, final String str, final String str2) {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxw
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzp(zzbudVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxm
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxn
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxy
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzr();
            }
        });
        zzw(this.zzc, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcxz
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeif) obj).zzr();
            }
        });
        zzw(this.zze, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcya
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzexf) obj).zzr();
            }
        });
        zzw(this.zzd, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyb
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeua) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzw(this.zzb, new zzcyu() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza(Object obj) {
                ((zzeib) obj).zzs();
            }
        });
    }
}
