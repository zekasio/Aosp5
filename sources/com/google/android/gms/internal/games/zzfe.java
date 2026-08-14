package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.zap$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfe {
    private final AtomicReference<zzfd> zzha = new AtomicReference<>();

    protected abstract zzfd zzag();

    public final void flush() {
        zzfd zzfdVar = this.zzha.get();
        if (zzfdVar != null) {
            zzfdVar.flush();
        }
    }

    public final void zzb(String str, int i) {
        zzfd zzfdVarZzag = this.zzha.get();
        if (zzfdVarZzag == null) {
            zzfdVarZzag = zzag();
            if (!zap$$ExternalSyntheticBackportWithForwarding0.m(this.zzha, null, zzfdVarZzag)) {
                zzfdVarZzag = this.zzha.get();
            }
        }
        zzfdVarZzag.zze(str, i);
    }
}
