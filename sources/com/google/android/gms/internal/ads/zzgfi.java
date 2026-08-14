package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgfi {

    @Nullable
    private zzgfu zza = null;

    @Nullable
    private zzgok zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgfi() {
    }

    /* synthetic */ zzgfi(zzgfh zzgfhVar) {
    }

    public final zzgfi zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfi zzb(zzgok zzgokVar) {
        this.zzb = zzgokVar;
        return this;
    }

    public final zzgfi zzc(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
        return this;
    }

    public final zzgfk zzd() throws GeneralSecurityException {
        zzgok zzgokVar;
        zzgoj zzgojVarZzb;
        zzgfu zzgfuVar = this.zza;
        if (zzgfuVar == null || (zzgokVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfuVar.zza() != zzgokVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfuVar.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzd() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzgfs.zzd) {
            zzgojVarZzb = zzgoj.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzgfs.zzc || this.zza.zzc() == zzgfs.zzb) {
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzc() != zzgfs.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgfk(this.zza, this.zzb, zzgojVarZzb, this.zzc, null);
    }
}
