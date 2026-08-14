package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffo extends zzffk {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzffm zzb;
    private final zzffl zzc;
    private zzfhi zze;
    private zzfgl zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    zzffo(zzffl zzfflVar, zzffm zzffmVar) {
        this.zzc = zzfflVar;
        this.zzb = zzffmVar;
        zzk(null);
        if (zzffmVar.zzd() == zzffn.HTML || zzffmVar.zzd() == zzffn.JAVASCRIPT) {
            this.zzf = new zzfgm(zzffmVar.zza());
        } else {
            this.zzf = new zzfgo(zzffmVar.zzi(), null);
        }
        this.zzf.zzj();
        zzffz.zza().zzd(this);
        zzfge.zza().zzd(this.zzf.zza(), zzfflVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfhi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zzb(View view, zzffq zzffqVar, String str) {
        zzfgb zzfgbVar;
        if (this.zzh) {
            return;
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfgbVar = null;
                break;
            } else {
                zzfgbVar = (zzfgb) it.next();
                if (zzfgbVar.zzb().get() == view) {
                    break;
                }
            }
        }
        if (zzfgbVar == null) {
            this.zzd.add(new zzfgb(view, zzffqVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfge.zza().zzc(this.zzf.zza());
        zzffz.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzffo> collectionZzc = zzffz.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzffo zzffoVar : collectionZzc) {
            if (zzffoVar != this && zzffoVar.zzf() == view) {
                zzffoVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzffz.zza().zzf(this);
        this.zzf.zzh(zzfgf.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfgl zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
