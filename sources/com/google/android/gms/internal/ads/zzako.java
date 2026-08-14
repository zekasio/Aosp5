package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzako implements Comparable {
    private final zzakz zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaks zzf;
    private Integer zzg;
    private zzakr zzh;
    private boolean zzi;
    private zzajx zzj;
    private zzakn zzk;
    private final zzakc zzl;

    public zzako(int i, String str, zzaks zzaksVar) {
        Uri uri;
        String host;
        this.zza = zzakz.zza ? new zzakz() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaksVar;
        this.zzl = new zzakc();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzako) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzajx zzd() {
        return this.zzj;
    }

    public final zzako zze(zzajx zzajxVar) {
        this.zzj = zzajxVar;
        return this;
    }

    public final zzako zzf(zzakr zzakrVar) {
        this.zzh = zzakrVar;
        return this;
    }

    public final zzako zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzaku zzh(zzakk zzakkVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzajw {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzakz.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakx zzakxVar) {
        zzaks zzaksVar;
        synchronized (this.zze) {
            zzaksVar = this.zzf;
        }
        if (zzaksVar != null) {
            zzaksVar.zza(zzakxVar);
        }
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzakr zzakrVar = this.zzh;
        if (zzakrVar != null) {
            zzakrVar.zzb(this);
        }
        if (zzakz.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzakm(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzakn zzaknVar;
        synchronized (this.zze) {
            zzaknVar = this.zzk;
        }
        if (zzaknVar != null) {
            zzaknVar.zza(this);
        }
    }

    final void zzs(zzaku zzakuVar) {
        zzakn zzaknVar;
        synchronized (this.zze) {
            zzaknVar = this.zzk;
        }
        if (zzaknVar != null) {
            zzaknVar.zzb(this, zzakuVar);
        }
    }

    final void zzt(int i) {
        zzakr zzakrVar = this.zzh;
        if (zzakrVar != null) {
            zzakrVar.zzc(this, i);
        }
    }

    final void zzu(zzakn zzaknVar) {
        synchronized (this.zze) {
            this.zzk = zzaknVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzajw {
        return null;
    }

    public final zzakc zzy() {
        return this.zzl;
    }
}
