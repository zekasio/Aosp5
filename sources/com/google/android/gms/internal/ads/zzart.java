package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzart extends zzasm {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzart(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, Map map, View view, Context context) {
        super(zzaqxVar, "uJP+jOkstXYybMCjk2UNbhttr8UNt74vp0QYS1O6gudZhXLs5QWRNg4TXtm9Zlmd", "mdZYlvc02sSKOzn2zFon1K3MqwwFkSMjVA38SM16TyQ=", zzamvVar, i, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i) {
        Map map = this.zzi;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.zzi.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context contextZzb = this.zzk;
        if (contextZzb == null) {
            contextZzb = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, contextZzb, this.zzj);
        long j = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzv(j);
            this.zze.zzu(j2);
        }
    }
}
