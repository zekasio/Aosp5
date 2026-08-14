package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfzd {

    @Nullable
    private zzfzn zza = null;

    @Nullable
    private zzgok zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzfzd() {
    }

    /* synthetic */ zzfzd(zzfzc zzfzcVar) {
    }

    public final zzfzd zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfzd zzb(zzgok zzgokVar) {
        this.zzb = zzgokVar;
        return this;
    }

    public final zzfzd zzc(zzfzn zzfznVar) {
        this.zza = zzfznVar;
        return this;
    }

    public final zzfzf zzd() throws GeneralSecurityException {
        zzgok zzgokVar;
        zzgoj zzgojVarZzb;
        zzfzn zzfznVar = this.zza;
        if (zzfznVar == null || (zzgokVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfznVar.zza() != zzgokVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzfznVar.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzc() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzb() == zzfzl.zzc) {
            zzgojVarZzb = zzgoj.zzb(new byte[0]);
        } else if (this.zza.zzb() == zzfzl.zzb) {
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzb() != zzfzl.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzb()))));
            }
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzfzf(this.zza, this.zzb, zzgojVarZzb, this.zzc, null);
    }
}
