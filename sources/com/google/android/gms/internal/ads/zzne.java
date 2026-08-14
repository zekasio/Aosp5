package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzne {
    private final zzck zza;
    private zzfqk zzb = zzfqk.zzo();
    private zzfqn zzc = zzfqn.zzd();
    private zzss zzd;
    private zzss zze;
    private zzss zzf;

    public zzne(zzck zzckVar) {
        this.zza = zzckVar;
    }

    private static zzss zzj(zzcg zzcgVar, zzfqk zzfqkVar, zzss zzssVar, zzck zzckVar) {
        zzcn zzcnVarZzq = zzcgVar.zzq();
        int iZzh = zzcgVar.zzh();
        Object objZzf = zzcnVarZzq.zzo() ? null : zzcnVarZzq.zzf(iZzh);
        int iZzc = (zzcgVar.zzA() || zzcnVarZzq.zzo()) ? -1 : zzcnVarZzq.zzd(iZzh, zzckVar, false).zzc(zzew.zzv(zzcgVar.zzn()));
        for (int i = 0; i < zzfqkVar.size(); i++) {
            zzss zzssVar2 = (zzss) zzfqkVar.get(i);
            if (zzm(zzssVar2, objZzf, zzcgVar.zzA(), zzcgVar.zze(), zzcgVar.zzf(), iZzc)) {
                return zzssVar2;
            }
        }
        if (zzfqkVar.isEmpty() && zzssVar != null) {
            if (zzm(zzssVar, objZzf, zzcgVar.zzA(), zzcgVar.zze(), zzcgVar.zzf(), iZzc)) {
                return zzssVar;
            }
        }
        return null;
    }

    private final void zzk(zzfqm zzfqmVar, zzss zzssVar, zzcn zzcnVar) {
        if (zzssVar == null) {
            return;
        }
        if (zzcnVar.zza(zzssVar.zza) != -1) {
            zzfqmVar.zza(zzssVar, zzcnVar);
            return;
        }
        zzcn zzcnVar2 = (zzcn) this.zzc.get(zzssVar);
        if (zzcnVar2 != null) {
            zzfqmVar.zza(zzssVar, zzcnVar2);
        }
    }

    private final void zzl(zzcn zzcnVar) {
        zzfqm zzfqmVar = new zzfqm();
        if (this.zzb.isEmpty()) {
            zzk(zzfqmVar, this.zze, zzcnVar);
            if (!zzfnp.zza(this.zzf, this.zze)) {
                zzk(zzfqmVar, this.zzf, zzcnVar);
            }
            if (!zzfnp.zza(this.zzd, this.zze) && !zzfnp.zza(this.zzd, this.zzf)) {
                zzk(zzfqmVar, this.zzd, zzcnVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfqmVar, (zzss) this.zzb.get(i), zzcnVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfqmVar, this.zzd, zzcnVar);
            }
        }
        this.zzc = zzfqmVar.zzc();
    }

    private static boolean zzm(zzss zzssVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzssVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzssVar.zzb != i || zzssVar.zzc != i2) {
                return false;
            }
        } else if (zzssVar.zzb != -1 || zzssVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzcn zza(zzss zzssVar) {
        return (zzcn) this.zzc.get(zzssVar);
    }

    public final zzss zzb() {
        return this.zzd;
    }

    public final zzss zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfqk zzfqkVar = this.zzb;
        if (!(zzfqkVar instanceof List)) {
            Iterator<E> it = zzfqkVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfqkVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfqkVar.get(zzfqkVar.size() - 1);
        }
        return (zzss) obj;
    }

    public final zzss zzd() {
        return this.zze;
    }

    public final zzss zze() {
        return this.zzf;
    }

    public final void zzg(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzss zzssVar, zzcg zzcgVar) {
        this.zzb = zzfqk.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzss) list.get(0);
            zzssVar.getClass();
            this.zzf = zzssVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcgVar.zzq());
    }

    public final void zzi(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        zzl(zzcgVar.zzq());
    }
}
