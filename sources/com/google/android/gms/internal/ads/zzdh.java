package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdh implements zzde {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdc zze = zzdc.zza;
    private zzdc zzf;
    private zzdc zzg;
    private zzdc zzh;
    private boolean zzi;
    private zzdg zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdh() {
        zzdc zzdcVar = zzdc.zza;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd != 2) {
            throw new zzdd(zzdcVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzdcVar.zzb;
        }
        this.zze = zzdcVar;
        zzdc zzdcVar2 = new zzdc(i, zzdcVar.zzc, 2);
        this.zzf = zzdcVar2;
        this.zzi = true;
        return zzdcVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zzb() {
        int iZza;
        zzdg zzdgVar = this.zzj;
        if (zzdgVar != null && (iZza = zzdgVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdgVar.zzd(this.zzl);
            this.zzo += (long) iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc() {
        if (zzg()) {
            zzdc zzdcVar = this.zze;
            this.zzg = zzdcVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzdg(zzdcVar.zzb, zzdcVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzdg zzdgVar = this.zzj;
                if (zzdgVar != null) {
                    zzdgVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        zzdg zzdgVar = this.zzj;
        if (zzdgVar != null) {
            zzdgVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdg zzdgVar = this.zzj;
            zzdgVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzdgVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdc.zza;
        zzdc zzdcVar = zzdc.zza;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzdg zzdgVar = this.zzj;
        return zzdgVar == null || zzdgVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            double d = this.zzc;
            double d2 = j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        long j3 = this.zzn;
        zzdg zzdgVar = this.zzj;
        zzdgVar.getClass();
        long jZzb = j3 - ((long) zzdgVar.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzew.zzw(j, jZzb, j2) : zzew.zzw(j, jZzb * ((long) i), j2 * ((long) i2));
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
