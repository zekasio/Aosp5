package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdi extends zzdf {
    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.zzb.zzd;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i += i;
            }
        }
        ByteBuffer byteBufferZzj = zzj(i);
        int i3 = this.zzb.zzd;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferZzj.put((byte) 0);
                byteBufferZzj.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sZza = (short) (zzew.zza(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferZzj.put((byte) (sZza & 255));
                byteBufferZzj.put((byte) ((sZza >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                byteBufferZzj.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final zzdc zzi(zzdc zzdcVar) throws zzdd {
        int i = zzdcVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzdc.zza;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new zzdd(zzdcVar);
            }
        }
        return new zzdc(zzdcVar.zzb, zzdcVar.zzc, 2);
    }
}
