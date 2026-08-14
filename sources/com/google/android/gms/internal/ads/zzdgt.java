package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgt {
    public static final zzdgt zza = new zzdgt(new zzdgr());
    private final zzbey zzb;
    private final zzbev zzc;
    private final zzbfl zzd;
    private final zzbfi zze;
    private final zzbkg zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdgt(zzdgr zzdgrVar) {
        this.zzb = zzdgrVar.zza;
        this.zzc = zzdgrVar.zzb;
        this.zzd = zzdgrVar.zzc;
        this.zzg = new SimpleArrayMap(zzdgrVar.zzf);
        this.zzh = new SimpleArrayMap(zzdgrVar.zzg);
        this.zze = zzdgrVar.zzd;
        this.zzf = zzdgrVar.zze;
    }

    public final zzbev zza() {
        return this.zzc;
    }

    public final zzbey zzb() {
        return this.zzb;
    }

    public final zzbfb zzc(String str) {
        return (zzbfb) this.zzh.get(str);
    }

    public final zzbfe zzd(String str) {
        return (zzbfe) this.zzg.get(str);
    }

    public final zzbfi zze() {
        return this.zze;
    }

    public final zzbfl zzf() {
        return this.zzd;
    }

    public final zzbkg zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
