package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcon extends zzcok {
    private final Context zzc;
    private final View zzd;
    private final zzcei zze;
    private final zzeyd zzf;
    private final zzcqk zzg;
    private final zzdgt zzh;
    private final zzdce zzi;
    private final zzgws zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    zzcon(zzcql zzcqlVar, Context context, zzeyd zzeydVar, View view, zzcei zzceiVar, zzcqk zzcqkVar, zzdgt zzdgtVar, zzdce zzdceVar, zzgws zzgwsVar, Executor executor) {
        super(zzcqlVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzceiVar;
        this.zzf = zzeydVar;
        this.zzg = zzcqkVar;
        this.zzh = zzdgtVar;
        this.zzi = zzdceVar;
        this.zzj = zzgwsVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcon zzconVar) {
        zzdgt zzdgtVar = zzconVar.zzh;
        if (zzdgtVar.zze() == null) {
            return;
        }
        try {
            zzdgtVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzconVar.zzj.zzb(), ObjectWrapper.wrap(zzconVar.zzc));
        } catch (RemoteException e) {
            zzbza.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhi)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzezc unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzeyd zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzezb.zzb(zzqVar);
        }
        zzeyc zzeycVar = this.zzb;
        if (zzeycVar.zzad) {
            for (String str : zzeycVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzeyd(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzeyd) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final zzeyd zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcok
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcei zzceiVar;
        if (viewGroup == null || (zzceiVar = this.zze) == null) {
            return;
        }
        zzceiVar.zzag(zzcfx.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcom
            @Override // java.lang.Runnable
            public final void run() {
                zzcon.zzi(this.zza);
            }
        });
        super.zzj();
    }
}
