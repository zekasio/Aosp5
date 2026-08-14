package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwm {
    private final List zza = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzfwk) it.next()).zza = false;
        }
    }

    public final zzfwm zza(zzfwk zzfwkVar) {
        if (zzfwkVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzfwkVar.zza) {
            zzd();
        }
        zzfwkVar.zzf = this;
        this.zza.add(zzfwkVar);
        return this;
    }

    public final zzfwp zzb() throws GeneralSecurityException {
        int iZza;
        int i;
        zzgli zzgliVarZzd = zzgll.zzd();
        List list = this.zza;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            if (((zzfwk) list.get(i2)).zze == zzfwl.zza && ((zzfwk) list.get(i2 + 1)).zze != zzfwl.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzfwk zzfwkVar : this.zza) {
            zzfwg unused = zzfwkVar.zzb;
            if (zzfwkVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzfwkVar.zze == zzfwl.zza) {
                iZza = 0;
                while (true) {
                    if (iZza != 0 && !hashSet.contains(Integer.valueOf(iZza))) {
                        break;
                    }
                    iZza = zzgek.zza();
                }
            } else {
                zzfwl unused2 = zzfwkVar.zze;
                iZza = 0;
            }
            Integer numValueOf = Integer.valueOf(iZza);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + iZza + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            zzfwk.zza(zzfwkVar);
            zzfwu zzfwuVar = zzfwkVar.zzd;
            zzfwg zzfwgVarZzc = zzfwkVar.zzc();
            if (zzfwg.zza.equals(zzfwgVarZzc)) {
                i = 3;
            } else if (zzfwg.zzb.equals(zzfwgVarZzc)) {
                i = 4;
            } else {
                if (!zzfwg.zzc.equals(zzfwgVarZzc)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i = 5;
            }
            zzgea zzgeaVarZza = ((zzgcx) zzfwuVar).zza();
            zzgky zzgkyVarZzc = zzfxf.zzc(zzgeaVarZza.zzb());
            zzglj zzgljVarZzd = zzglk.zzd();
            zzgljVarZzd.zzb(iZza);
            zzgljVarZzd.zzd(i);
            zzgljVarZzd.zza(zzgkyVarZzc);
            zzgljVarZzd.zzc(zzgeaVarZza.zzb().zze());
            zzgliVarZzd.zza((zzglk) zzgljVarZzd.zzal());
            if (zzfwkVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgliVarZzd.zzb(num.intValue());
        return zzfwp.zza((zzgll) zzgliVarZzd.zzal());
    }
}
