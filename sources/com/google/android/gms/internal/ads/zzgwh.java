package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwh extends zzgwf implements zzamb {
    private int zza;

    protected zzgwh(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    protected final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzama.zzc(byteBuffer.get());
        zzama.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
