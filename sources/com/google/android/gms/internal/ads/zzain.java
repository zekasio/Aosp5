package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzain implements zzaja {
    private final zzaim zza;
    private final zzen zzb = new zzen(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzain(zzaim zzaimVar) {
        this.zza = zzaimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void zza(zzen zzenVar, int i) {
        int i2 = i & 1;
        int iZzc = i2 != 0 ? zzenVar.zzc() + zzenVar.zzk() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzenVar.zzF(iZzc);
            this.zzd = 0;
        }
        while (zzenVar.zza() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzk = zzenVar.zzk();
                    zzenVar.zzF(zzenVar.zzc() - 1);
                    if (iZzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzenVar.zza(), 3 - this.zzd);
                zzenVar.zzB(this.zzb.zzH(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int iZzk2 = this.zzb.zzk();
                    int iZzk3 = this.zzb.zzk();
                    this.zze = (iZzk2 & 128) != 0;
                    this.zzc = (((iZzk2 & 15) << 8) | iZzk3) + 3;
                    int iZzb = this.zzb.zzb();
                    int i5 = this.zzc;
                    if (iZzb < i5) {
                        int iZzb2 = this.zzb.zzb();
                        this.zzb.zzz(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, iZzb2 + iZzb2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzenVar.zza(), this.zzc - i3);
                zzenVar.zzB(this.zzb.zzH(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzE(i7);
                    } else {
                        if (zzew.zzg(this.zzb.zzH(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzE(this.zzc - 4);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void zzb(zzeu zzeuVar, zzzx zzzxVar, zzaiz zzaizVar) {
        this.zza.zzb(zzeuVar, zzzxVar, zzaizVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void zzc() {
        this.zzf = true;
    }
}
