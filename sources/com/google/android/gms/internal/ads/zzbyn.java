package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyn implements zzaty {
    final zzbyk zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbyl zzf = new zzbyl();

    public zzbyn(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzbyk(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zza(boolean z) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (!z) {
            this.zze.zzt(jCurrentTimeMillis);
            this.zze.zzJ(this.zza.zzd);
            return;
        }
        if (jCurrentTimeMillis - this.zze.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaN)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = this.zze.zzc();
        }
        this.zzg = true;
    }

    public final zzbyc zzb(Clock clock, String str) {
        return new zzbyc(clock, this, this.zzf.zza(), str);
    }

    public final void zzc(zzbyc zzbycVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbycVar);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzf(zzlVar, j);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public final Bundle zzk(Context context, zzfad zzfadVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(TapjoyConstants.TJC_APP_PLACEMENT, this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbyc) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfadVar.zzc(hashSet);
        return bundle;
    }
}
