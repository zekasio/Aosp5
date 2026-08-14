package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcba {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    protected static AtomicInteger zzC() {
        return zza;
    }

    protected static AtomicInteger zzD() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract void zzE(Uri[] uriArr, String str);

    public abstract void zzF(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void zzG();

    public abstract void zzH(long j);

    public abstract void zzI(int i);

    public abstract void zzJ(int i);

    public abstract void zzK(zzcaz zzcazVar);

    public abstract void zzL(int i);

    public abstract void zzM(int i);

    public abstract void zzN(boolean z);

    public abstract void zzO(boolean z);

    public abstract void zzP(int i);

    public abstract void zzQ(Surface surface, boolean z) throws IOException;

    public abstract void zzR(float f, boolean z) throws IOException;

    public abstract void zzS();

    public abstract boolean zzT();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
