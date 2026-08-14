package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeb {
    private final zzdm zza;
    private final zzdv zzb;
    private final zzdz zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeb(Looper looper, zzdm zzdmVar, zzdz zzdzVar) {
        this(new CopyOnWriteArraySet(), looper, zzdmVar, zzdzVar);
    }

    public static /* synthetic */ boolean zzg(zzeb zzebVar, Message message) {
        Iterator it = zzebVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzb(zzebVar.zzc);
            if (zzebVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdl.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzeb zza(Looper looper, zzdz zzdzVar) {
        return new zzeb(this.zzd, looper, this.zza, zzdzVar);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzea(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzdv zzdvVar = this.zzb;
            zzdvVar.zzk(zzdvVar.zzb(0));
        }
        boolean zIsEmpty = this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (zIsEmpty) {
            while (!this.zze.isEmpty()) {
                ((Runnable) this.zze.peekFirst()).run();
                this.zze.removeFirst();
            }
        }
    }

    public final void zzd(final int i, final zzdy zzdyVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdx
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                zzdy zzdyVar2 = zzdyVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzea) it.next()).zza(i2, zzdyVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        for (zzea zzeaVar : this.zzd) {
            if (zzeaVar.zza.equals(obj)) {
                zzeaVar.zzc(this.zzc);
                this.zzd.remove(zzeaVar);
            }
        }
    }

    private zzeb(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdm zzdmVar, zzdz zzdzVar) {
        this.zza = zzdmVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdzVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdmVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdw
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzeb.zzg(this.zza, message);
                return true;
            }
        });
        this.zzi = true;
    }
}
