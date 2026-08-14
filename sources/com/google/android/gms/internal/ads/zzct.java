package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzct {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfqk zzh;
    private final zzfqk zzi;
    private final int zzj;
    private final int zzk;
    private final zzfqk zzl;
    private zzfqk zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzct() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfqk.zzo();
        this.zzi = zzfqk.zzo();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfqk.zzo();
        this.zzm = zzfqk.zzo();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzct zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzew.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfqk.zzp(zzew.zzN(locale));
            }
        }
        return this;
    }

    public zzct zze(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    protected zzct(zzcu zzcuVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzcuVar.zzl;
        this.zzf = zzcuVar.zzm;
        this.zzg = zzcuVar.zzn;
        this.zzh = zzcuVar.zzo;
        this.zzi = zzcuVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzcuVar.zzu;
        this.zzm = zzcuVar.zzv;
        this.zzn = zzcuVar.zzw;
        this.zzp = new HashSet(zzcuVar.zzC);
        this.zzo = new HashMap(zzcuVar.zzB);
    }
}
