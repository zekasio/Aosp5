package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzn extends zzdzo {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzctt zzd;
    private final TelephonyManager zze;
    private final zzdzf zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzayr.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzayr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzayr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzayr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzayr.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzayr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzayr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzayr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzayr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzayr.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzayr.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzayr.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzayr.CONNECTING);
    }

    zzdzn(Context context, zzctt zzcttVar, zzdzf zzdzfVar, zzdzb zzdzbVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzdzbVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcttVar;
        this.zzf = zzdzfVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzayi zza(zzdzn zzdznVar, Bundle bundle) {
        zzayb zzaybVarZza = zzayi.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzdznVar.zzg = 2;
        } else {
            zzdznVar.zzg = 1;
            if (i == 0) {
                zzaybVarZza.zzb(2);
            } else if (i != 1) {
                zzaybVarZza.zzb(1);
            } else {
                zzaybVarZza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zzaybVarZza.zza(i3);
        }
        return (zzayi) zzaybVarZza.zzal();
    }

    static /* bridge */ /* synthetic */ zzayr zzb(zzdzn zzdznVar, Bundle bundle) {
        return (zzayr) zzb.get(zzezi.zza(zzezi.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzayr.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzdzn zzdznVar, boolean z, ArrayList arrayList, zzayi zzayiVar, zzayr zzayrVar) {
        zzaym zzaymVarZzg = zzayn.zzg();
        zzaymVarZzg.zza(arrayList);
        zzaymVarZzg.zzi(zzg(Settings.Global.getInt(zzdznVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzaymVarZzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzi(zzdznVar.zzc, zzdznVar.zze));
        zzaymVarZzg.zzf(zzdznVar.zzf.zze());
        zzaymVarZzg.zze(zzdznVar.zzf.zzb());
        zzaymVarZzg.zzb(zzdznVar.zzf.zza());
        zzaymVarZzg.zzc(zzayrVar);
        zzaymVarZzg.zzd(zzayiVar);
        zzaymVarZzg.zzk(zzdznVar.zzg);
        zzaymVarZzg.zzl(zzg(z));
        zzaymVarZzg.zzh(zzdznVar.zzf.zzd());
        zzaymVarZzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        zzaymVarZzg.zzm(zzg(Settings.Global.getInt(zzdznVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzayn) zzaymVarZzg.zzal()).zzax();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfuj.zzq(this.zzd.zzb(), new zzdzm(this, z), zzbzn.zzf);
    }
}
