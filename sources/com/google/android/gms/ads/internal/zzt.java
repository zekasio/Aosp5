package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzatz;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzawb;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzeaq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbxf zzA;
    private final zzcg zzB;
    private final zzccn zzC;
    private final zzcaa zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzceu zze;
    private final zzaa zzf;
    private final zzatz zzg;
    private final zzbyj zzh;
    private final zzab zzi;
    private final zzavm zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbba zzm;
    private final zzaw zzn;
    private final zzbtv zzo;
    private final zzbkl zzp;
    private final zzbzt zzq;
    private final zzblw zzr;
    private final zzw zzs;
    private final zzbv zzt;
    private final com.google.android.gms.ads.internal.overlay.zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbnb zzw;
    private final zzbw zzx;
    private final zzeaq zzy;
    private final zzawb zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzceu zzceuVar = new zzceu();
        zzaa zzaaVarZzn = zzaa.zzn(Build.VERSION.SDK_INT);
        zzatz zzatzVar = new zzatz();
        zzbyj zzbyjVar = new zzbyj();
        zzab zzabVar = new zzab();
        zzavm zzavmVar = new zzavm();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbba zzbbaVar = new zzbba();
        zzaw zzawVar = new zzaw();
        zzbtv zzbtvVar = new zzbtv();
        zzbkl zzbklVar = new zzbkl();
        zzbzt zzbztVar = new zzbzt();
        zzblw zzblwVar = new zzblw();
        zzw zzwVar = new zzw();
        zzbv zzbvVar = new zzbv();
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = new com.google.android.gms.ads.internal.overlay.zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar2 = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbnb zzbnbVar = new zzbnb();
        zzbw zzbwVar = new zzbw();
        zzeap zzeapVar = new zzeap();
        zzawb zzawbVar = new zzawb();
        zzbxf zzbxfVar = new zzbxf();
        zzcg zzcgVar = new zzcg();
        zzccn zzccnVar = new zzccn();
        zzcaa zzcaaVar = new zzcaa();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzceuVar;
        this.zzf = zzaaVarZzn;
        this.zzg = zzatzVar;
        this.zzh = zzbyjVar;
        this.zzi = zzabVar;
        this.zzj = zzavmVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbbaVar;
        this.zzn = zzawVar;
        this.zzo = zzbtvVar;
        this.zzp = zzbklVar;
        this.zzq = zzbztVar;
        this.zzr = zzblwVar;
        this.zzt = zzbvVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar2;
        this.zzw = zzbnbVar;
        this.zzx = zzbwVar;
        this.zzy = zzeapVar;
        this.zzz = zzawbVar;
        this.zzA = zzbxfVar;
        this.zzB = zzcgVar;
        this.zzC = zzccnVar;
        this.zzD = zzcaaVar;
    }

    public static zzeaq zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzatz zzb() {
        return zza.zzg;
    }

    public static zzavm zzc() {
        return zza.zzj;
    }

    public static zzawb zzd() {
        return zza.zzz;
    }

    public static zzbba zze() {
        return zza.zzm;
    }

    public static zzblw zzf() {
        return zza.zzr;
    }

    public static zzbnb zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzbtv zzm() {
        return zza.zzo;
    }

    public static zzbxf zzn() {
        return zza.zzA;
    }

    public static zzbyj zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzt;
    }

    public static zzbw zzu() {
        return zza.zzx;
    }

    public static zzcg zzv() {
        return zza.zzB;
    }

    public static zzbzt zzw() {
        return zza.zzq;
    }

    public static zzcaa zzx() {
        return zza.zzD;
    }

    public static zzccn zzy() {
        return zza.zzC;
    }

    public static zzceu zzz() {
        return zza.zze;
    }
}
