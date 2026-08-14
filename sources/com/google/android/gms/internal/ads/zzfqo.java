package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqo extends zzfqd {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfqo() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfqd, com.google.android.gms.internal.ads.zzfqe
    public final /* bridge */ /* synthetic */ zzfqe zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfqo zzg(Iterable iterable) {
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    zzfqo(int i) {
        super(i);
        this.zzd = new Object[zzfqp.zzh(i)];
    }

    public final zzfqp zzh() {
        zzfqp zzfqpVarZzs;
        int i = this.zzb;
        if (i == 0) {
            return zzfrz.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfsg(obj);
        }
        if (this.zzd == null || zzfqp.zzh(i) != this.zzd.length) {
            zzfqpVarZzs = zzfqp.zzs(this.zzb, this.zza);
            this.zzb = zzfqpVarZzs.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfqp.zzt(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zzfqpVarZzs = new zzfrz(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfqpVarZzs;
    }

    public final zzfqo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzfqp.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (iZzh <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iZza = zzfqc.zza(iHashCode);
                while (true) {
                    Object[] objArr2 = this.zzd;
                    int i = iZza & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
