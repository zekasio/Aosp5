package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwf implements zzamb {
    private static final zzgwq zza = zzgwq.zzb(zzgwf.class);
    protected final String zzb;
    long zze;
    zzgwk zzg;
    private zzamc zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    protected zzgwf(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgwq zzgwqVar = zza;
            String str = this.zzb;
            zzgwqVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final void zzb(zzgwk zzgwkVar, ByteBuffer byteBuffer, long j, zzaly zzalyVar) throws IOException {
        this.zze = zzgwkVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgwkVar;
        zzgwkVar.zze(zzgwkVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final void zzc(zzamc zzamcVar) {
        this.zzh = zzamcVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgwq zzgwqVar = zza;
        String str = this.zzb;
        zzgwqVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
