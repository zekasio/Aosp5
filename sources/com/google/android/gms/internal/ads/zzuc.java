package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzuc {
    private final zzen zza = new zzen(32);
    private zzub zzb;
    private zzub zzc;
    private zzub zzd;
    private long zze;
    private final zzwt zzf;

    public zzuc(zzwt zzwtVar, byte[] bArr) {
        this.zzf = zzwtVar;
        zzub zzubVar = new zzub(0L, 65536);
        this.zzb = zzubVar;
        this.zzc = zzubVar;
        this.zzd = zzubVar;
    }

    private final int zzi(int i) {
        zzub zzubVar = this.zzd;
        if (zzubVar.zzc == null) {
            zzwm zzwmVarZzb = this.zzf.zzb();
            zzub zzubVar2 = new zzub(this.zzd.zzb, 65536);
            zzubVar.zzc = zzwmVarZzb;
            zzubVar.zzd = zzubVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzub zzj(zzub zzubVar, long j) {
        while (j >= zzubVar.zzb) {
            zzubVar = zzubVar.zzd;
        }
        return zzubVar;
    }

    private static zzub zzk(zzub zzubVar, long j, ByteBuffer byteBuffer, int i) {
        zzub zzubVarZzj = zzj(zzubVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzubVarZzj.zzb - j));
            byteBuffer.put(zzubVarZzj.zzc.zza, zzubVarZzj.zza(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzubVarZzj.zzb) {
                zzubVarZzj = zzubVarZzj.zzd;
            }
        }
        return zzubVarZzj;
    }

    private static zzub zzl(zzub zzubVar, long j, byte[] bArr, int i) {
        zzub zzubVarZzj = zzj(zzubVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzubVarZzj.zzb - j));
            System.arraycopy(zzubVarZzj.zzc.zza, zzubVarZzj.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzubVarZzj.zzb) {
                zzubVarZzj = zzubVarZzj.zzd;
            }
        }
        return zzubVarZzj;
    }

    private static zzub zzm(zzub zzubVar, zzgr zzgrVar, zzue zzueVar, zzen zzenVar) {
        zzub zzubVarZzl;
        int iZzo;
        if (zzgrVar.zzk()) {
            long j = zzueVar.zzb;
            zzenVar.zzC(1);
            zzub zzubVarZzl2 = zzl(zzubVar, j, zzenVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzenVar.zzH()[0];
            int i = b & ByteCompanionObject.MIN_VALUE;
            int i2 = b & 127;
            zzgo zzgoVar = zzgrVar.zza;
            byte[] bArr = zzgoVar.zza;
            if (bArr == null) {
                zzgoVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzubVarZzl = zzl(zzubVarZzl2, j2, zzgoVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzenVar.zzC(2);
                zzubVarZzl = zzl(zzubVarZzl, j3, zzenVar.zzH(), 2);
                j3 += 2;
                iZzo = zzenVar.zzo();
            } else {
                iZzo = 1;
            }
            int[] iArr = zzgoVar.zzd;
            if (iArr == null || iArr.length < iZzo) {
                iArr = new int[iZzo];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgoVar.zze;
            if (iArr3 == null || iArr3.length < iZzo) {
                iArr3 = new int[iZzo];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iZzo * 6;
                zzenVar.zzC(i3);
                zzubVarZzl = zzl(zzubVarZzl, j3, zzenVar.zzH(), i3);
                j3 += (long) i3;
                zzenVar.zzF(0);
                for (int i4 = 0; i4 < iZzo; i4++) {
                    iArr2[i4] = zzenVar.zzo();
                    iArr4[i4] = zzenVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzueVar.zza - ((int) (j3 - zzueVar.zzb));
            }
            zzaba zzabaVar = zzueVar.zzc;
            int i5 = zzew.zza;
            zzgoVar.zzc(iZzo, iArr2, iArr4, zzabaVar.zzb, zzgoVar.zza, zzabaVar.zza, zzabaVar.zzc, zzabaVar.zzd);
            long j4 = zzueVar.zzb;
            int i6 = (int) (j3 - j4);
            zzueVar.zzb = j4 + ((long) i6);
            zzueVar.zza -= i6;
        } else {
            zzubVarZzl = zzubVar;
        }
        if (!zzgrVar.zze()) {
            zzgrVar.zzi(zzueVar.zza);
            return zzk(zzubVarZzl, zzueVar.zzb, zzgrVar.zzb, zzueVar.zza);
        }
        zzenVar.zzC(4);
        zzub zzubVarZzl3 = zzl(zzubVarZzl, zzueVar.zzb, zzenVar.zzH(), 4);
        int iZzn = zzenVar.zzn();
        zzueVar.zzb += 4;
        zzueVar.zza -= 4;
        zzgrVar.zzi(iZzn);
        zzub zzubVarZzk = zzk(zzubVarZzl3, zzueVar.zzb, zzgrVar.zzb, iZzn);
        zzueVar.zzb += (long) iZzn;
        int i7 = zzueVar.zza - iZzn;
        zzueVar.zza = i7;
        ByteBuffer byteBuffer = zzgrVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzgrVar.zze = ByteBuffer.allocate(i7);
        } else {
            zzgrVar.zze.clear();
        }
        return zzk(zzubVarZzk, zzueVar.zzb, zzgrVar.zze, zzueVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzub zzubVar = this.zzd;
        if (j == zzubVar.zzb) {
            this.zzd = zzubVar.zzd;
        }
    }

    public final int zza(zzr zzrVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzub zzubVar = this.zzd;
        int iZza = zzrVar.zza(zzubVar.zzc.zza, zzubVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzub zzubVar;
        if (j != -1) {
            while (true) {
                zzubVar = this.zzb;
                if (j < zzubVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzubVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzubVar.zza) {
                this.zzc = zzubVar;
            }
        }
    }

    public final void zzd(zzgr zzgrVar, zzue zzueVar) {
        zzm(this.zzc, zzgrVar, zzueVar, this.zza);
    }

    public final void zze(zzgr zzgrVar, zzue zzueVar) {
        this.zzc = zzm(this.zzc, zzgrVar, zzueVar, this.zza);
    }

    public final void zzf() {
        zzub zzubVar = this.zzb;
        if (zzubVar.zzc != null) {
            this.zzf.zzd(zzubVar);
            zzubVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzub zzubVar2 = this.zzb;
        this.zzc = zzubVar2;
        this.zzd = zzubVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzenVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzub zzubVar = this.zzd;
            zzenVar.zzB(zzubVar.zzc.zza, zzubVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
