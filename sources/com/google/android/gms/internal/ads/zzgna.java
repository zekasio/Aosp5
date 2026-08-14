package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgna implements zzfvw {
    private static final byte[] zza = new byte[0];
    private final zzgnd zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzgmy zze;
    private final int zzf;

    public zzgna(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzgmy zzgmyVar) throws GeneralSecurityException {
        zzgcj.zzb(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzgnd(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zzf = i;
        this.zze = zzgmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgnc zzgncVarZza = this.zzb.zza(this.zzc, this.zzd, bArr2, this.zze.zza(), this.zzf);
        byte[] bArrZza = this.zze.zzb(zzgncVarZza.zzb()).zza(bArr, zza);
        byte[] bArrZza2 = zzgncVarZza.zza();
        return ByteBuffer.allocate(bArrZza2.length + bArrZza.length).put(bArrZza2).put(bArrZza).array();
    }
}
