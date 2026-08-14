package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgpa extends zzgoz {
    protected final byte[] zza;

    zzgpa(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpe) || zzd() != ((zzgpe) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgpa)) {
            return obj.equals(this);
        }
        zzgpa zzgpaVar = (zzgpa) obj;
        int iZzr = zzr();
        int iZzr2 = zzgpaVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgpaVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgoz
    final boolean zzg(zzgpe zzgpeVar, int i, int i2) {
        if (i2 > zzgpeVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgpeVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgpeVar.zzd());
        }
        if (!(zzgpeVar instanceof zzgpa)) {
            return zzgpeVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgpa zzgpaVar = (zzgpa) zzgpeVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgpaVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgpaVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final int zzi(int i, int i2, int i3) {
        return zzgqw.zzd(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return zzgtv.zzf(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpe zzk(int i, int i2) {
        int iZzq = zzq(i, i2, zzd());
        return iZzq == 0 ? zzgpe.zzb : new zzgox(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final zzgpm zzl() {
        return zzgpm.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    final void zzo(zzgot zzgotVar) throws IOException {
        zzgotVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzp() {
        int iZzc = zzc();
        return zzgtv.zzj(this.zza, iZzc, zzd() + iZzc);
    }
}
