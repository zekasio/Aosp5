package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbw extends zzczy implements zzatf {
    private final Map zzb;
    private final Context zzc;
    private final zzeyc zzd;

    public zzdbw(Context context, Set set, zzeyc zzeycVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzeycVar;
    }

    public final synchronized void zza(View view) {
        zzatg zzatgVar = (zzatg) this.zzb.get(view);
        if (zzatgVar == null) {
            zzatgVar = new zzatg(this.zzc, view);
            zzatgVar.zzc(this);
            this.zzb.put(view, zzatgVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbh)).booleanValue()) {
                zzatgVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbg)).longValue());
                return;
            }
        }
        zzatgVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzatg) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zzc(final zzate zzateVar) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzdbv
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzatf) obj).zzc(zzateVar);
            }
        });
    }
}
