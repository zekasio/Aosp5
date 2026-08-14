package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfyc {

    @Nullable
    private Integer zza;

    @Nullable
    private Integer zzb;

    @Nullable
    private Integer zzc;
    private zzfyd zzd;

    private zzfyc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzfyc(zzfyb zzfybVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfyd.zzc;
    }

    public final zzfyc zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzfyc zzd(zzfyd zzfydVar) {
        this.zzd = zzfydVar;
        return this;
    }

    public final zzfyf zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.intValue();
        return new zzfyf(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    public final zzfyc zza(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzfyc zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
