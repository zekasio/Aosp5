package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpo extends zzdf {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzew.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.zzg);
        this.zzj += (long) (iMin / this.zzb.zze);
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.zzi + i2) - this.zzh.length;
        ByteBuffer byteBufferZzj = zzj(length);
        int iZzf = zzew.zzf(length, 0, this.zzi);
        byteBufferZzj.put(this.zzh, 0, iZzf);
        int iZzf2 = zzew.zzf(length - iZzf, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iZzf2);
        byteBufferZzj.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iZzf2;
        int i4 = this.zzi - iZzf;
        this.zzi = i4;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, iZzf, bArr, 0, i4);
        byteBuffer.get(this.zzh, this.zzi, i3);
        this.zzi += i3;
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzde
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final zzdc zzi(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd != 2) {
            throw new zzdd(zzdcVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzdc.zza : zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzl() {
        if (this.zzf) {
            int i = this.zzi;
            if (i > 0) {
                this.zzj += (long) (i / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzm() {
        this.zzh = zzew.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }
}
