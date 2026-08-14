package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalb implements zzakn {
    private final Map zza = new HashMap();
    private final zzaka zzb;
    private final BlockingQueue zzc;
    private final zzakf zzd;

    zzalb(zzaka zzakaVar, BlockingQueue blockingQueue, zzakf zzakfVar, byte[] bArr) {
        this.zzd = zzakfVar;
        this.zzb = zzakaVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final synchronized void zza(zzako zzakoVar) {
        String strZzj = zzakoVar.zzj();
        List list = (List) this.zza.remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzala.zzb) {
            zzala.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
        }
        zzako zzakoVar2 = (zzako) list.remove(0);
        this.zza.put(strZzj, list);
        zzakoVar2.zzu(this);
        try {
            this.zzc.put(zzakoVar2);
        } catch (InterruptedException e) {
            zzala.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final void zzb(zzako zzakoVar, zzaku zzakuVar) {
        List list;
        zzajx zzajxVar = zzakuVar.zzb;
        if (zzajxVar == null || zzajxVar.zza(System.currentTimeMillis())) {
            zza(zzakoVar);
            return;
        }
        String strZzj = zzakoVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzala.zzb) {
                zzala.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzako) it.next(), zzakuVar, null);
            }
        }
    }

    final synchronized boolean zzc(zzako zzakoVar) {
        String strZzj = zzakoVar.zzj();
        if (!this.zza.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzakoVar.zzu(this);
            if (zzala.zzb) {
                zzala.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List arrayList = (List) this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzakoVar.zzm("waiting-for-response");
        arrayList.add(zzakoVar);
        this.zza.put(strZzj, arrayList);
        if (zzala.zzb) {
            zzala.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
