package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxl {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzxk) obj).zza - ((zzxk) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzxk) obj).zzc, ((zzxk) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzxk[] zzd = new zzxk[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzxl(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            zzxk zzxkVar = (zzxk) this.zzc.get(i2);
            i += zzxkVar.zzb;
            if (i >= f3) {
                return zzxkVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzxk) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzxk zzxkVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzxk[] zzxkVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzxkVar = zzxkVarArr[i3];
        } else {
            zzxkVar = new zzxk(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzxkVar.zza = i4;
        zzxkVar.zzb = i;
        zzxkVar.zzc = f;
        this.zzc.add(zzxkVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzxk zzxkVar2 = (zzxk) this.zzc.get(0);
            int i7 = zzxkVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzxk[] zzxkVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzxkVarArr2[i8] = zzxkVar2;
                }
            } else {
                zzxkVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
