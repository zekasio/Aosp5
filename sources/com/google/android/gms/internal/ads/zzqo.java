package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqo extends zzgr {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzqo() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzgl
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i) {
        this.zzh = i;
    }

    public final boolean zzo(zzgr zzgrVar) {
        ByteBuffer byteBuffer;
        zzdl.zzd(!zzgrVar.zzd(1073741824));
        zzdl.zzd(!zzgrVar.zzd(DriveFile.MODE_READ_ONLY));
        zzdl.zzd(!zzgrVar.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgrVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgrVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzgrVar.zzd;
            if (zzgrVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgrVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgrVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgrVar.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
