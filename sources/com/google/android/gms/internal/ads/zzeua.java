package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeua implements zzcur, zzcwn, zzevq, com.google.android.gms.ads.internal.overlay.zzo, zzcwz, zzcve, zzdcc {
    private final zzfaf zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzeua zzh = null;

    public zzeua(zzfaf zzfafVar) {
        this.zza = zzfafVar;
    }

    public static zzeua zzi(zzeua zzeuaVar) {
        zzeua zzeuaVar2 = new zzeua(zzeuaVar.zza);
        zzeuaVar2.zzh = zzeuaVar;
        return zzeuaVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzb();
            return;
        }
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetu
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzavf) obj).zzf();
            }
        });
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzavf) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.internal.ads.zzevq
    public final void zzbG(zzevq zzevqVar) {
        this.zzh = (zzeua) zzevqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzby();
        } else {
            zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetq
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzby();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zze();
        } else {
            zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetx
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzf(i);
        } else {
            zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetp
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzg() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzg();
        } else {
            zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetz
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) {
                    ((zzcwn) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzh(zzsVar);
        } else {
            zzevh.zza(this.zzg, new zzevg() { // from class: com.google.android.gms.internal.ads.zzeto
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
                }
            });
        }
    }

    public final void zzj() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzj();
            return;
        }
        this.zza.zza();
        zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzavc) obj).zza();
            }
        });
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetn
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((zzavf) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzk(zzeVar);
        } else {
            zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetw
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((zzavf) obj).zzd(zzeVar);
                }
            });
        }
    }

    public final void zzn(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzp(zzavb zzavbVar) {
        this.zzb.set(zzavbVar);
    }

    public final void zzq(zzavf zzavfVar) {
        this.zzd.set(zzavfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzr();
        } else {
            zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzety
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((zzavf) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
    }

    public final void zzl(final zzauy zzauyVar) {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zzl(zzauyVar);
        } else {
            zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzets
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((zzavb) obj).zzd(zzauyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeua zzeuaVar = this.zzh;
        if (zzeuaVar != null) {
            zzeuaVar.zza(zzeVar);
        } else {
            zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetl
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((zzavb) obj).zzc(zzeVar);
                }
            });
            zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzetr
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((zzavb) obj).zzb(zzeVar.zza);
                }
            });
        }
    }
}
