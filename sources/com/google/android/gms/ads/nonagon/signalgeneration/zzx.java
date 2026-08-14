package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfuf;
import com.google.android.gms.internal.ads.zzfut;
import com.tapjoy.TapjoyAuctionFlags;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzx implements zzfuf {
    final /* synthetic */ zzfut zza;
    final /* synthetic */ zzbxv zzb;
    final /* synthetic */ zzbxo zzc;
    final /* synthetic */ zzfec zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzac zzf;

    zzx(zzac zzacVar, zzfut zzfutVar, zzbxv zzbxvVar, zzbxo zzbxoVar, zzfec zzfecVar, long j) {
        this.zzf = zzacVar;
        this.zza = zzfutVar;
        this.zzb = zzbxvVar;
        this.zzc = zzbxoVar;
        this.zzd = zzfecVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzac zzacVar = this.zzf;
        zzf.zzc(zzacVar.zzr, zzacVar.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jCurrentTimeMillis)));
        zzfen zzfenVarZzr = zzac.zzr(this.zza, this.zzb);
        if (((Boolean) zzbcd.zze.zze()).booleanValue() && zzfenVarZzr != null) {
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzg(th);
            zzfecVar.zzf(false);
            zzfenVarZzr.zza(zzfecVar);
            zzfenVarZzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzao zzaoVar = (zzao) obj;
        zzfen zzfenVarZzr = zzac.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzhd)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzbza.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                return;
            }
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzc("QueryInfo generation has been disabled.");
            zzfecVar.zzf(false);
            zzfenVarZzr.zza(zzfecVar);
            zzfenVarZzr.zzg();
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzaoVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzac zzacVar = this.zzf;
                    zzf.zzc(zzacVar.zzr, zzacVar.zzj, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                        return;
                    }
                    zzfenVarZzr.zza(this.zzd);
                    zzfenVarZzr.zzg();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzaoVar.zzb);
                    String strOptString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        zzbza.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzac zzacVar2 = this.zzf;
                        zzf.zzc(zzacVar2.zzr, zzacVar2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                        zzfec zzfecVar2 = this.zzd;
                        zzfecVar2.zzc("Request ID empty");
                        zzfecVar2.zzf(false);
                        if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                            return;
                        }
                        zzfenVarZzr.zza(this.zzd);
                        zzfenVarZzr.zzg();
                        return;
                    }
                    zzac zzacVar3 = this.zzf;
                    zzac.zzG(zzacVar3, strOptString, zzaoVar.zzb, zzacVar3.zzj);
                    Bundle bundle = zzaoVar.zzc;
                    zzac zzacVar4 = this.zzf;
                    if (zzacVar4.zzw && bundle != null && bundle.getInt(zzacVar4.zzy, -1) == -1) {
                        zzac zzacVar5 = this.zzf;
                        bundle.putInt(zzacVar5.zzy, zzacVar5.zzz.get());
                    }
                    zzac zzacVar6 = this.zzf;
                    if (zzacVar6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzacVar6.zzx))) {
                        if (TextUtils.isEmpty(this.zzf.zzB)) {
                            zzac zzacVar7 = this.zzf;
                            com.google.android.gms.ads.internal.util.zzs zzsVarZzp = com.google.android.gms.ads.internal.zzt.zzp();
                            zzac zzacVar8 = this.zzf;
                            zzacVar7.zzB = zzsVarZzp.zzc(zzacVar8.zzg, zzacVar8.zzA.zza);
                        }
                        zzac zzacVar9 = this.zzf;
                        bundle.putString(zzacVar9.zzx, zzacVar9.zzB);
                    }
                    this.zzc.zzc(zzaoVar.zza, zzaoVar.zzb, bundle);
                    zzac zzacVar10 = this.zzf;
                    zzdpn zzdpnVar = zzacVar10.zzr;
                    zzdpd zzdpdVar = zzacVar10.zzj;
                    Pair pair = new Pair("tqgt", String.valueOf(jCurrentTimeMillis));
                    String str = "na";
                    if (((Boolean) zzba.zzc().zzb(zzbar.zziK)).booleanValue()) {
                        try {
                            str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE : "0";
                        } catch (JSONException e2) {
                            zzbza.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    zzf.zzc(zzdpnVar, zzdpdVar, "sgs", pair, new Pair("tpc", str));
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                        return;
                    }
                    zzfenVarZzr.zza(this.zzd);
                    zzfenVarZzr.zzg();
                } catch (JSONException e3) {
                    zzbza.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e3.toString());
                    zzac zzacVar11 = this.zzf;
                    zzf.zzc(zzacVar11.zzr, zzacVar11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                    zzfec zzfecVar3 = this.zzd;
                    zzfecVar3.zzg(e3);
                    zzfecVar3.zzf(false);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                        return;
                    }
                    zzfenVarZzr.zza(this.zzd);
                    zzfenVarZzr.zzg();
                }
            } catch (RemoteException e4) {
                zzfec zzfecVar4 = this.zzd;
                zzfecVar4.zzg(e4);
                zzfecVar4.zzf(false);
                zzbza.zzh("", e4);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbcd.zze.zze()).booleanValue() || zzfenVarZzr == null) {
                    return;
                }
                zzfenVarZzr.zza(this.zzd);
                zzfenVarZzr.zzg();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbcd.zze.zze()).booleanValue() && zzfenVarZzr != null) {
                zzfenVarZzr.zza(this.zzd);
                zzfenVarZzr.zzg();
            }
            throw th;
        }
    }
}
