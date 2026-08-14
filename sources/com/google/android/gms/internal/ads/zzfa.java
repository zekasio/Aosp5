package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfa implements zzfg {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzfl zzd;

    protected zzfa(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzfl zzflVar = this.zzd;
        int i2 = zzew.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzgi) this.zzb.get(i3)).zza(this, zzflVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzfl zzflVar = this.zzd;
        int i = zzew.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgi) this.zzb.get(i2)).zzb(this, zzflVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzfl zzflVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgi) this.zzb.get(i)).zzc(this, zzflVar, this.zza);
        }
    }

    protected final void zzj(zzfl zzflVar) {
        this.zzd = zzflVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgi) this.zzb.get(i)).zzd(this, zzflVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
        zzgiVar.getClass();
        if (this.zzb.contains(zzgiVar)) {
            return;
        }
        this.zzb.add(zzgiVar);
        this.zzc++;
    }
}
