package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdf implements zzde {
    protected zzdc zzb;
    protected zzdc zzc;
    private zzdc zzd;
    private zzdc zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdf() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzdc.zza;
        zzdc zzdcVar = zzdc.zza;
        this.zze = zzdcVar;
        this.zzb = zzdcVar;
        this.zzc = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        this.zzd = zzdcVar;
        this.zze = zzi(zzdcVar);
        return zzg() ? this.zze : zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzdc.zza;
        zzdc zzdcVar = zzdc.zza;
        this.zze = zzdcVar;
        this.zzb = zzdcVar;
        this.zzc = zzdcVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public boolean zzg() {
        return this.zze != zzdc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzdc zzi(zzdc zzdcVar) throws zzdd {
        throw null;
    }

    protected final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
