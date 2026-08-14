package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpi extends zzgpm {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgpi(Iterable iterable, int i, boolean z, zzgph zzgphVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzN();
            return;
        }
        this.zzg = zzgqw.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzJ() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzK() throws zzgqy {
        if (!this.zzf.hasNext()) {
            throw zzgqy.zzj();
        }
        zzN();
    }

    private final void zzL(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzJ()) {
            if (i2 > 0) {
                throw zzgqy.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int iMin = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzgtq.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzM() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzgtq.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final void zzA(int i) {
        this.zzj = i;
        zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzgtq.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzd() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zze(int i) throws zzgqy {
        if (i < 0) {
            throw zzgqy.zzf();
        }
        int iZzd = i + zzd();
        int i2 = this.zzj;
        if (iZzd > i2) {
            throw zzgqy.zzj();
        }
        this.zzj = iZzd;
        zzM();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int iZza = zza() & UByte.MAX_VALUE;
            int iZza2 = (zza() & UByte.MAX_VALUE) << 8;
            return iZza | iZza2 | ((zza() & UByte.MAX_VALUE) << 16) | ((zza() & UByte.MAX_VALUE) << 24);
        }
        this.zzm = 4 + j2;
        int iZza3 = zzgtq.zza(j2) & UByte.MAX_VALUE;
        int iZza4 = (zzgtq.zza(1 + j2) & UByte.MAX_VALUE) << 8;
        return iZza3 | iZza4 | ((zzgtq.zza(2 + j2) & UByte.MAX_VALUE) << 16) | ((zzgtq.zza(j2 + 3) & UByte.MAX_VALUE) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzk = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzgqy.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            long jZza = ((long) zza()) & 255;
            long jZza2 = (((long) zza()) & 255) << 8;
            long jZza3 = (((long) zza()) & 255) << 16;
            long jZza4 = (((long) zza()) & 255) << 24;
            long jZza5 = (((long) zza()) & 255) << 32;
            long jZza6 = (((long) zza()) & 255) << 40;
            return jZza | jZza2 | jZza3 | jZza4 | jZza5 | jZza6 | ((((long) zza()) & 255) << 48) | ((255 & ((long) zza())) << 56);
        }
        this.zzm = 8 + j2;
        long jZza7 = ((long) zzgtq.zza(j2)) & 255;
        long jZza8 = (((long) zzgtq.zza(1 + j2)) & 255) << 8;
        long jZza9 = (((long) zzgtq.zza(j2 + 2)) & 255) << 16;
        long jZza10 = (((long) zzgtq.zza(3 + j2)) & 255) << 24;
        long jZza11 = (((long) zzgtq.zza(j2 + 4)) & 255) << 32;
        long jZza12 = (((long) zzgtq.zza(5 + j2)) & 255) << 40;
        return jZza7 | jZza8 | jZza9 | jZza10 | jZza11 | jZza12 | ((((long) zzgtq.zza(j2 + 6)) & 255) << 48) | ((((long) zzgtq.zza(j2 + 7)) & 255) << 56);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZza = zza();
            j |= ((long) (bZza & 127)) << i;
            if ((bZza & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzgqy.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final long zzu() throws IOException {
        return zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final zzgpe zzw() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzgtq.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return zzgpe.zzz(bArr);
            }
        }
        if (iZzj > 0 && iZzj <= zzJ()) {
            byte[] bArr2 = new byte[iZzj];
            zzL(bArr2, 0, iZzj);
            return zzgpe.zzz(bArr2);
        }
        if (iZzj == 0) {
            return zzgpe.zzb;
        }
        if (iZzj < 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzgtq.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzgqw.zzb);
                this.zzm += j3;
                return str;
            }
        }
        if (iZzj > 0 && iZzj <= zzJ()) {
            byte[] bArr2 = new byte[iZzj];
            zzL(bArr2, 0, iZzj);
            return new String(bArr2, zzgqw.zzb);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                String strZzg = zzgtv.zzg(this.zzg, (int) (j2 - this.zzn), iZzj);
                this.zzm += j3;
                return strZzg;
            }
        }
        if (iZzj >= 0 && iZzj <= zzJ()) {
            byte[] bArr = new byte[iZzj];
            zzL(bArr, 0, iZzj);
            return zzgtv.zzh(bArr, 0, iZzj);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final void zzz(int i) throws zzgqy {
        if (this.zzk != i) {
            throw zzgqy.zzb();
        }
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0) {
            if (i <= (((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn) {
                while (i > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzK();
                    }
                    int iMin = Math.min(i, (int) (this.zzo - this.zzm));
                    i -= iMin;
                    this.zzm += (long) iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzgqy.zzj();
        }
        throw zzgqy.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzgqy.zze();
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgqy.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzj() throws IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte bZza = zzgtq.zza(j);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = 2 + j;
                int iZza = (zzgtq.zza(j2) << 7) ^ bZza;
                if (iZza < 0) {
                    i = iZza ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iZza2 = (zzgtq.zza(j3) << Ascii.SO) ^ iZza;
                    if (iZza2 >= 0) {
                        i = iZza2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iZza3 = iZza2 ^ (zzgtq.zza(j4) << Ascii.NAK);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j4 = 5 + j;
                            byte bZza2 = zzgtq.zza(j5);
                            int i2 = (iZza3 ^ (bZza2 << Ascii.FS)) ^ 266354560;
                            if (bZza2 < 0) {
                                j5 = 6 + j;
                                if (zzgtq.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzgtq.zza(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzgtq.zza(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzgtq.zza(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzgtq.zza(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzs();
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte bZza = zzgtq.zza(j3);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = 2 + j3;
                int iZza = (zzgtq.zza(j4) << 7) ^ bZza;
                if (iZza < 0) {
                    j = iZza ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int iZza2 = (zzgtq.zza(j5) << Ascii.SO) ^ iZza;
                    if (iZza2 >= 0) {
                        j = iZza2 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int iZza3 = iZza2 ^ (zzgtq.zza(j6) << Ascii.NAK);
                        if (iZza3 < 0) {
                            j = (-2080896) ^ iZza3;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long jZza = (((long) zzgtq.zza(j7)) << 28) ^ ((long) iZza3);
                            if (jZza >= 0) {
                                j = 266354560 ^ jZza;
                            } else {
                                long j8 = 6 + j3;
                                long jZza2 = jZza ^ (((long) zzgtq.zza(j6)) << 35);
                                if (jZza2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long jZza3 = jZza2 ^ (((long) zzgtq.zza(j8)) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j8 = 8 + j3;
                                        jZza2 = jZza3 ^ (((long) zzgtq.zza(j9)) << 49);
                                        if (jZza2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long jZza4 = (jZza2 ^ (((long) zzgtq.zza(j8)) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzgtq.zza(j9) >= 0) {
                                                    j = jZza4;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = jZza4;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ jZza2;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzm = j5;
                return j;
            }
        }
        return zzs();
    }
}
