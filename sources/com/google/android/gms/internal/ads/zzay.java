package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzay {
    public final Uri zza;
    public final List zze;
    public final zzfqk zzg;

    @Deprecated
    public final List zzh;
    public final Object zzi;
    public final String zzb = null;
    public final zzas zzc = null;
    public final zzai zzd = null;
    public final String zzf = null;

    /* synthetic */ zzay(Uri uri, String str, zzas zzasVar, zzai zzaiVar, List list, String str2, zzfqk zzfqkVar, Object obj, zzax zzaxVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfqkVar;
        zzfqh zzfqhVarZzi = zzfqk.zzi();
        if (zzfqkVar.size() > 0) {
            throw null;
        }
        this.zzh = zzfqhVarZzi.zzi();
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzayVar = (zzay) obj;
        if (this.zza.equals(zzayVar.zza)) {
            String str = zzayVar.zzb;
            if (zzew.zzU(null, null)) {
                zzas zzasVar = zzayVar.zzc;
                if (zzew.zzU(null, null)) {
                    zzai zzaiVar = zzayVar.zzd;
                    if (zzew.zzU(null, null) && this.zze.equals(zzayVar.zze)) {
                        String str2 = zzayVar.zzf;
                        if (zzew.zzU(null, null) && this.zzg.equals(zzayVar.zzg)) {
                            Object obj2 = zzayVar.zzi;
                            if (zzew.zzU(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
