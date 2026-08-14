package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfxv {

    @Nullable
    private zzfyf zza = null;

    @Nullable
    private zzgok zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzfxv() {
    }

    /* synthetic */ zzfxv(zzfxu zzfxuVar) {
    }

    public final zzfxv zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfxv zzb(zzgok zzgokVar) {
        this.zzb = zzgokVar;
        return this;
    }

    public final zzfxv zzc(zzfyf zzfyfVar) {
        this.zza = zzfyfVar;
        return this;
    }

    public final zzfxx zzd() throws GeneralSecurityException {
        zzgok zzgokVar;
        zzgoj zzgojVarZzb;
        zzfyf zzfyfVar = this.zza;
        if (zzfyfVar == null || (zzgokVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfyfVar.zza() != zzgokVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzfyfVar.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzc() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzb() == zzfyd.zzc) {
            zzgojVarZzb = zzgoj.zzb(new byte[0]);
        } else if (this.zza.zzb() == zzfyd.zzb) {
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzb() != zzfyd.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzb()))));
            }
            zzgojVarZzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzfxx(this.zza, this.zzb, zzgojVarZzb, this.zzc, null);
    }
}
