package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbzg;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbyt zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzbzg zze;
    private final Random zzf;

    protected zzay() {
        zzbyt zzbytVar = new zzbyt();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbfw(), new zzbvi(), new zzbqz(), new zzbfx());
        String strZzd = zzbyt.zzd();
        zzbzg zzbzgVar = new zzbzg(0, ModuleDescriptor.MODULE_VERSION, true, false, false);
        Random random = new Random();
        this.zzb = zzbytVar;
        this.zzc = zzawVar;
        this.zzd = strZzd;
        this.zze = zzbzgVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzbyt zzb() {
        return zza.zzb;
    }

    public static zzbzg zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
