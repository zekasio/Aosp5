package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeib implements AppEventListener, zzcxj, zzcwc, zzcur, zzcvi, com.google.android.gms.ads.internal.client.zza, zzcuo, zzcwz, zzcve, zzdcc {
    private final zzfdk zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzic)).intValue());

    public zzeib(zzfdk zzfdkVar) {
        this.zzj = zzfdkVar;
    }

    private final void zzu() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehs
                    @Override // com.google.android.gms.internal.ads.zzevg
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
            return;
        }
        zzevh.zza(this.zzb, zzeht.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzg.get()) {
            zzevh.zza(this.zzc, new zzevg() { // from class: com.google.android.gms.internal.ads.zzeho
                @Override // com.google.android.gms.internal.ads.zzevg
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zza.offer(new Pair(str, str2))) {
            zzbza.zze("The queue for app events is full, dropping the new event.");
            zzfdk zzfdkVar = this.zzj;
            if (zzfdkVar != null) {
                zzfdj zzfdjVarZzb = zzfdj.zzb("dae_action");
                zzfdjVarZzb.zza("dae_name", str);
                zzfdjVarZzb.zza("dae_data", str2);
                zzfdkVar.zzb(zzfdjVarZzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(zzeVar);
            }
        });
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(zzeVar.zza);
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(zzeVar);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzc() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzb.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzd() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzc.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.set(zzbhVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze.set(zzbkVar);
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzd.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzevh.zza(this.zzd, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(zzsVar);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzc.set(zzcbVar);
        this.zzh.set(true);
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzeia
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzn() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzevh.zza(this.zze, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehl
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(zzbud zzbudVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
            zzevh.zza(this.zzb, zzeht.zza);
        }
        zzevh.zza(this.zzf, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzevh.zza(this.zzb, new zzevg() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }

    public final void zzt(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.set(zzciVar);
    }
}
