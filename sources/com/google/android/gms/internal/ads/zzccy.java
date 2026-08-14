package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccy extends zzccu {
    public zzccy(zzcbj zzcbjVar) {
        super(zzcbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzt(String str) {
        String strZze = zzbyt.zze(str);
        zzcbj zzcbjVar = (zzcbj) this.zzc.get();
        if (zzcbjVar != null && strZze != null) {
            zzcbjVar.zzt(strZze, this);
        }
        zzbza.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZze, "noop", "Noop cache is a noop.");
        return false;
    }
}
