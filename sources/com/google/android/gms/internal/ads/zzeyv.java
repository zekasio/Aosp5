package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyv {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbdl zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbjx zzn;
    private zzeib zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzeyi zzo = new zzeyi();
    private boolean zzp = false;
    private boolean zzr = false;

    public final zzeyv zzA(zzbdl zzbdlVar) {
        this.zzh = zzbdlVar;
        return this;
    }

    public final zzeyv zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzeyv zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzeyv zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzeyv zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzeyv zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzeyx zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzeyx(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzeyv zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzeyi zzo() {
        return this.zzo;
    }

    public final zzeyv zzp(zzeyx zzeyxVar) {
        this.zzo.zza(zzeyxVar.zzo.zza);
        this.zza = zzeyxVar.zzd;
        this.zzb = zzeyxVar.zze;
        this.zzs = zzeyxVar.zzr;
        this.zzc = zzeyxVar.zzf;
        this.zzd = zzeyxVar.zza;
        this.zzf = zzeyxVar.zzg;
        this.zzg = zzeyxVar.zzh;
        this.zzh = zzeyxVar.zzi;
        this.zzi = zzeyxVar.zzj;
        zzq(zzeyxVar.zzl);
        zzD(zzeyxVar.zzm);
        this.zzp = zzeyxVar.zzp;
        this.zzq = zzeyxVar.zzc;
        this.zzr = zzeyxVar.zzq;
        return this;
    }

    public final zzeyv zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzeyv zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzeyv zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzeyv zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzeyv zzu(zzeib zzeibVar) {
        this.zzq = zzeibVar;
        return this;
    }

    public final zzeyv zzv(zzbjx zzbjxVar) {
        this.zzn = zzbjxVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzeyv zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzeyv zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzeyv zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzeyv zzz(int i) {
        this.zzm = i;
        return this;
    }
}
