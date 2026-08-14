package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasc extends zzasm {
    private List zzi;
    private final Context zzj;

    public zzasc(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, Context context) {
        super(zzaqxVar, "CRusF084WLXlYQUHrYrs2r/R+2VKdiClv0NdEd7QrkclQLbsoBgPD6jF9jLeUeO0", "2PenHGVoRtCO3QQhfYSZVJz6AfJrwJ5fA2DWAmwbKY4=", zzamvVar, i, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, contextZzb);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
