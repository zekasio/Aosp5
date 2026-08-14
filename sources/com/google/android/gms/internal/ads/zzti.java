package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzti implements zzsq, zzsp {
    private final zzsq[] zza;
    private zzsp zze;
    private zzur zzf;
    private final zzsd zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzul zzh = new zzsc(new zzul[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzsq[] zzg = new zzsq[0];

    public zzti(zzsd zzsdVar, long[] jArr, zzsq[] zzsqVarArr, byte... bArr) {
        this.zzi = zzsdVar;
        this.zza = zzsqVarArr;
        for (int i = 0; i < zzsqVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zztg(zzsqVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        zzsq[] zzsqVarArr = this.zzg;
        return (zzsqVarArr.length > 0 ? zzsqVarArr[0] : this.zza[0]).zza(j, zzkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzsq zzsqVar : this.zzg) {
            long jZzd = zzsqVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzsqVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzsq zzsqVar2 : this.zzg) {
                    if (zzsqVar2 == zzsqVar) {
                        break;
                    }
                    if (zzsqVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzsq[] zzsqVarArr = this.zzg;
            if (i >= zzsqVarArr.length) {
                return jZze;
            }
            if (zzsqVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int length2 = zzweVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzweVarArr.length;
            if (i >= length) {
                break;
            }
            zzuj zzujVar = zzujVarArr[i];
            num = zzujVar != null ? (Integer) this.zzb.get(zzujVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzwe zzweVar = zzweVarArr[i];
            if (zzweVar != null) {
                zzcp zzcpVar = (zzcp) this.zzd.get(zzweVar.zze());
                zzcpVar.getClass();
                int i2 = 0;
                while (true) {
                    zzsq[] zzsqVarArr = this.zza;
                    if (i2 >= zzsqVarArr.length) {
                        break;
                    }
                    if (zzsqVarArr[i2].zzh().zza(zzcpVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        this.zzb.clear();
        zzuj[] zzujVarArr2 = new zzuj[length];
        Object[] objArr = new zzwe[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        Object[] objArr2 = new zzuj[length];
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzweVarArr.length; i4++) {
                objArr2[i4] = iArr[i4] == i3 ? zzujVarArr[i4] : num;
                if (iArr2[i4] == i3) {
                    zzwe zzweVar2 = zzweVarArr[i4];
                    zzweVar2.getClass();
                    zzcp zzcpVar2 = (zzcp) this.zzd.get(zzweVar2.zze());
                    zzcpVar2.getClass();
                    objArr[i4] = new zztf(zzweVar2, zzcpVar2);
                } else {
                    objArr[i4] = num;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            Object[] objArr3 = objArr2;
            Object[] objArr4 = objArr;
            long jZzf = this.zza[i3].zzf(objArr, zArr, objArr2, zArr2, j2);
            if (i5 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzweVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    Object obj = objArr3[i6];
                    obj.getClass();
                    zzujVarArr2[i6] = obj;
                    this.zzb.put(obj, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzdl.zzf(objArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            objArr2 = objArr3;
            objArr = objArr4;
            num = null;
        }
        System.arraycopy(zzujVarArr2, 0, zzujVarArr, 0, length);
        zzsq[] zzsqVarArr2 = (zzsq[]) arrayList.toArray(new zzsq[0]);
        this.zzg = zzsqVarArr2;
        this.zzh = new zzsc(zzsqVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        zzsp zzspVar = this.zze;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzur zzurVar = this.zzf;
        zzurVar.getClass();
        return zzurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        this.zzc.remove(zzsqVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzsq zzsqVar2 : this.zza) {
            i += zzsqVar2.zzh().zzc;
        }
        zzcp[] zzcpVarArr = new zzcp[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzsq[] zzsqVarArr = this.zza;
            if (i2 >= zzsqVarArr.length) {
                this.zzf = new zzur(zzcpVarArr);
                zzsp zzspVar = this.zze;
                zzspVar.getClass();
                zzspVar.zzi(this);
                return;
            }
            zzur zzurVarZzh = zzsqVarArr[i2].zzh();
            int i4 = zzurVarZzh.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzcp zzcpVarZzb = zzurVarZzh.zzb(i5);
                zzcp zzcpVarZzc = zzcpVarZzb.zzc(i2 + ":" + zzcpVarZzb.zzc);
                this.zzd.put(zzcpVarZzc, zzcpVarZzb);
                zzcpVarArr[i3] = zzcpVarZzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        for (zzsq zzsqVar : this.zzg) {
            zzsqVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        for (zzsq zzsqVar : this.zza) {
            zzsqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zze = zzspVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzsq zzsqVar : this.zza) {
            zzsqVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzsq zzn(int i) {
        zzsq zzsqVar = this.zza[i];
        return zzsqVar instanceof zztg ? ((zztg) zzsqVar).zza : zzsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzsq) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
