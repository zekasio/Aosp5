package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyn implements zzdbh {
    private final String zzc;
    private final zzfdk zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdyn(String str, zzfdk zzfdkVar) {
        this.zzc = str;
        this.zzd = zzfdkVar;
    }

    private final zzfdj zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfdj zzfdjVarZzb = zzfdj.zzb(str);
        zzfdjVarZzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzfdjVarZzb.zza("tid", str2);
        return zzfdjVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zza(String str) {
        zzfdk zzfdkVar = this.zzd;
        zzfdj zzfdjVarZzg = zzg("aaia");
        zzfdjVarZzg.zza("aair", "MalformedJson");
        zzfdkVar.zzb(zzfdjVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzb(String str, String str2) {
        zzfdk zzfdkVar = this.zzd;
        zzfdj zzfdjVarZzg = zzg("adapter_init_finished");
        zzfdjVarZzg.zza("ancn", str);
        zzfdjVarZzg.zza("rqe", str2);
        zzfdkVar.zzb(zzfdjVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzc(String str) {
        zzfdk zzfdkVar = this.zzd;
        zzfdj zzfdjVarZzg = zzg("adapter_init_started");
        zzfdjVarZzg.zza("ancn", str);
        zzfdkVar.zzb(zzfdjVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final void zzd(String str) {
        zzfdk zzfdkVar = this.zzd;
        zzfdj zzfdjVarZzg = zzg("adapter_init_finished");
        zzfdjVarZzg.zza("ancn", str);
        zzfdkVar.zzb(zzfdjVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbh
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
