package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsn implements com.google.android.gms.ads.internal.overlay.zzo, zzcft {
    private final Context zza;
    private final zzbzg zzb;
    private zzdsf zzc;
    private zzcei zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    zzdsn(Context context, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = zzbzgVar;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
            zzbza.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzezx.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            zzbza.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzezx.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() >= this.zzg + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzii)).intValue())) {
                return true;
            }
        }
        zzbza.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdaVar.zze(zzezx.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
        } else {
            zzbza.zzj("Ad inspector failed to load.");
            try {
                com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
                if (zzdaVar != null) {
                    zzdaVar.zze(zzezx.zzd(17, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.zzi = true;
            this.zzd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcei zzceiVar = this.zzd;
        if (zzceiVar == null || zzceiVar.zzaz()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdsf zzdsfVar) {
        this.zzc = zzdsfVar;
    }

    final /* synthetic */ void zzi(String str) {
        JSONObject jSONObjectZze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbih zzbihVar, zzbia zzbiaVar) {
        if (zzl(zzdaVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcei zzceiVarZza = zzceu.zza(this.zza, zzcfx.zza(), "", false, false, null, null, this.zzb, null, null, null, zzawe.zza(), null, null);
                this.zzd = zzceiVarZza;
                zzcfv zzcfvVarZzN = zzceiVarZza.zzN();
                if (zzcfvVarZzN == null) {
                    zzbza.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzdaVar.zze(zzezx.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzdaVar;
                zzcfvVarZzN.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbihVar, null, new zzbig(this.zza), zzbiaVar);
                zzcfvVarZzN.zzA(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzig));
                com.google.android.gms.ads.internal.zzt.zzi();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            } catch (zzcet e) {
                zzbza.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzdaVar.zze(zzezx.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(str);
                }
            });
        }
    }
}
