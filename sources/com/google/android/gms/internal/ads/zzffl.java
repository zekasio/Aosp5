package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffl {
    private final zzffs zza;
    private final zzffs zzb;
    private final zzffp zzc;
    private final zzffr zzd;

    private zzffl(zzffp zzffpVar, zzffr zzffrVar, zzffs zzffsVar, zzffs zzffsVar2, boolean z) {
        this.zzc = zzffpVar;
        this.zzd = zzffrVar;
        this.zza = zzffsVar;
        if (zzffsVar2 == null) {
            this.zzb = zzffs.NONE;
        } else {
            this.zzb = zzffsVar2;
        }
    }

    public static zzffl zza(zzffp zzffpVar, zzffr zzffrVar, zzffs zzffsVar, zzffs zzffsVar2, boolean z) {
        zzfgr.zzb(zzffrVar, "ImpressionType is null");
        zzfgr.zzb(zzffsVar, "Impression owner is null");
        if (zzffsVar == zzffs.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzffpVar == zzffp.DEFINED_BY_JAVASCRIPT && zzffsVar == zzffs.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzffrVar == zzffr.DEFINED_BY_JAVASCRIPT && zzffsVar == zzffs.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzffl(zzffpVar, zzffrVar, zzffsVar, zzffsVar2, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfgp.zzh(jSONObject, "impressionOwner", this.zza);
        zzfgp.zzh(jSONObject, "mediaEventsOwner", this.zzb);
        zzfgp.zzh(jSONObject, "creativeType", this.zzc);
        zzfgp.zzh(jSONObject, "impressionType", this.zzd);
        zzfgp.zzh(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
