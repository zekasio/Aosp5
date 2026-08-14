package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarl extends zzasm {
    private static final zzasn zzi = new zzasn();
    private final Context zzj;

    public zzarl(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, Context context) {
        super(zzaqxVar, "GiGLjdugkD/A/Nktl1YTMtFZ30miEp5ujxoBBsS1JjEnt8RpwdFKjPJMmiyB3Gih", "lGLGd1/lOSwZNvJFVMee07xTqqB6gC2uy3r930yIvSk=", zzamvVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn("E");
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzaoh.zza(str.getBytes(), true));
        }
    }
}
