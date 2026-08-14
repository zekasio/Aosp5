package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexf implements OnAdMetadataChangedListener, zzcwc, zzcur, zzcuo, zzcve, zzcwz, zzevq, zzdcc {
    private final zzfaf zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzexf(zzfaf zzfafVar) {
        this.zza = zzfafVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbvd) obj).zzf(zzeVar);
            }
        });
        zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewm
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbvd) obj).zze(i);
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzg(i);
            }
        });
    }

    public final void zzb(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzevq
    public final void zzbG(zzevq zzevqVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewu
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzl();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzd(zzbuz zzbuzVar) {
        this.zzd.set(zzbuzVar);
    }

    public final void zze(zzbvd zzbvdVar) {
        this.zzc.set(zzbvdVar);
    }

    @Deprecated
    public final void zzf(zzbuj zzbujVar) {
        this.zze.set(zzbujVar);
    }

    @Deprecated
    public final void zzg(zzbue zzbueVar) {
        this.zzg.set(zzbueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzevh.zza(this.zzh, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final void zzi(zzbve zzbveVar) {
        this.zzf.set(zzbveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        this.zza.zza();
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewr
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zzg();
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zzi(zzeVar);
            }
        });
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewx
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbvd) obj).zzg();
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewy
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zzj();
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzj();
            }
        });
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(final zzbud zzbudVar, final String str, final String str2) {
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                zzbud zzbudVar2 = zzbudVar;
                ((zzbuz) obj).zzk(new zzbvn(zzbudVar2.zzc(), zzbudVar2.zzb()));
            }
        });
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzexc
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                zzbud zzbudVar2 = zzbudVar;
                ((zzbve) obj).zze(new zzbvn(zzbudVar2.zzc(), zzbudVar2.zzb()), str, str2);
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zze(zzbudVar);
            }
        });
        zzevh.zza(this.zzg, new zzevg() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbue) obj).zze(zzbudVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewq
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuj) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzbuz) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
    }
}
