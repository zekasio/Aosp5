package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpr extends zzgpo {
    private final OutputStream zzg;

    zzgpr(OutputStream outputStream, int i) {
        super(i);
        this.zzg = outputStream;
    }

    private final void zzL() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzO(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzP(int i, boolean z) throws IOException {
        zzM(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzQ(int i, zzgpe zzgpeVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgpeVar.zzd());
        zzgpeVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt, com.google.android.gms.internal.ads.zzgot
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzp(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzh(int i, int i2) throws IOException {
        zzM(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzi(int i) throws IOException {
        zzM(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzj(int i, long j) throws IOException {
        zzM(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzk(long j) throws IOException {
        zzM(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzl(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    final void zzn(int i, zzgrw zzgrwVar, zzgsp zzgspVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzgon) zzgrwVar).zzat(zzgspVar));
        zzgspVar.zzm(zzgrwVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzL();
        int i7 = i2 - i5;
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzr(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzs(int i) throws IOException {
        zzM(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzt(int i, long j) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public final void zzu(long j) throws IOException {
        zzM(10);
        zzg(j);
    }

    public final void zzv(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzE = zzE(length);
            int i = iZzE + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iZzd = zzgtv.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzp(bArr, 0, iZzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzL();
            }
            int iZzE2 = zzE(str.length());
            int i3 = this.zzc;
            try {
                if (iZzE2 == iZzE) {
                    int i4 = i3 + iZzE2;
                    this.zzc = i4;
                    int iZzd2 = zzgtv.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    iZze = (iZzd2 - i3) - iZzE2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzgtv.zze(str);
                    zzf(iZze);
                    this.zzc = zzgtv.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzgtu e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgpq(e2);
            }
        } catch (zzgtu e3) {
            zzJ(str, e3);
        }
    }
}
