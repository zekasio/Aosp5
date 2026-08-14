package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpn extends zzdf {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    zzpn() {
    }

    private static void zzo(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int iFloatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzj;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.zzb.zzd;
        if (i2 == 536870912) {
            byteBufferZzj = zzj((i / 3) * 4);
            while (iPosition < iLimit) {
                zzo(((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 24), byteBufferZzj);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferZzj = zzj(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & UByte.MAX_VALUE;
                int i4 = (byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 8;
                zzo(i3 | i4 | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE) << 24), byteBufferZzj);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final zzdc zzi(zzdc zzdcVar) throws zzdd {
        int i = zzdcVar.zzd;
        if (zzew.zzV(i)) {
            return i != 4 ? new zzdc(zzdcVar.zzb, zzdcVar.zzc, 4) : zzdc.zza;
        }
        throw new zzdd(zzdcVar);
    }
}
