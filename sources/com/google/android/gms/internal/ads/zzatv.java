package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzatv {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzatu zza(boolean z) {
        synchronized (this.zzb) {
            zzatu zzatuVar = null;
            if (this.zzc.isEmpty()) {
                zzbza.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzatu zzatuVar2 = (zzatu) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzatuVar2.zzi();
                }
                return zzatuVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzatu zzatuVar3 : this.zzc) {
                int iZzb = zzatuVar3.zzb();
                if (iZzb > i2) {
                    i = i3;
                }
                int i4 = iZzb > i2 ? iZzb : i2;
                if (iZzb > i2) {
                    zzatuVar = zzatuVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzatuVar;
        }
    }

    public final void zzb(zzatu zzatuVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzbza.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzatuVar.zzj(i);
            zzatuVar.zzn();
            this.zzc.add(zzatuVar);
        }
    }

    public final boolean zzc(zzatu zzatuVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzatu zzatuVar2 = (zzatu) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && !zzatuVar.equals(zzatuVar2) && zzatuVar2.zzf().equals(zzatuVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzatuVar.equals(zzatuVar2) && zzatuVar2.zzd().equals(zzatuVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzatu zzatuVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzatuVar);
        }
    }
}
