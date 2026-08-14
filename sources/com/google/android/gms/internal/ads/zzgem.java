package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgem {

    @Nullable
    private zzgex zza = null;

    @Nullable
    private zzgok zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgem() {
    }

    /* synthetic */ zzgem(zzgel zzgelVar) {
    }

    public final zzgem zza(zzgok zzgokVar) throws GeneralSecurityException {
        this.zzb = zzgokVar;
        return this;
    }

    public final zzgem zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgem zzc(zzgex zzgexVar) {
        this.zza = zzgexVar;
        return this;
    }

    public final zzgeo zzd() throws GeneralSecurityException {
        zzgok zzgokVar;
        zzgoj zzgojVarZzb;
        zzgex zzgexVar = this.zza;
        if (zzgexVar == null || (zzgokVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgexVar.zza() != zzgokVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgexVar.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzd() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzgev.zzd) {
            zzgojVarZzb = zzgoj.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzgev.zzc || this.zza.zzc() == zzgev.zzb) {
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzc() != zzgev.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgeo(this.zza, this.zzb, zzgojVarZzb, this.zzc, null);
    }
}
