package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfyt {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;

    @Nullable
    private Integer zzc;
    private zzfyu zzd;

    private zzfyt() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzfyt(zzfys zzfysVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfyu.zzc;
    }

    public final zzfyt zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzfyt zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzfyt zzd(zzfyu zzfyuVar) {
        this.zzd = zzfyuVar;
        return this;
    }

    public final zzfyw zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzfyw(iIntValue, 12, 16, this.zzd, null);
    }

    public final zzfyt zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
