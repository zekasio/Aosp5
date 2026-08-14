package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlu extends zzcqm {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdee zze;
    private final zzdbk zzf;
    private final zzcvb zzg;
    private final zzcwi zzh;
    private final zzcrg zzi;
    private final zzbut zzj;
    private final zzfia zzk;
    private final zzeyq zzl;
    private boolean zzm;

    zzdlu(zzcql zzcqlVar, Context context, zzcei zzceiVar, zzdee zzdeeVar, zzdbk zzdbkVar, zzcvb zzcvbVar, zzcwi zzcwiVar, zzcrg zzcrgVar, zzeyc zzeycVar, zzfia zzfiaVar, zzeyq zzeyqVar) {
        super(zzcqlVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdeeVar;
        this.zzd = new WeakReference(zzceiVar);
        this.zzf = zzdbkVar;
        this.zzg = zzcvbVar;
        this.zzh = zzcwiVar;
        this.zzi = zzcrgVar;
        this.zzk = zzfiaVar;
        zzbup zzbupVar = zzeycVar.zzm;
        this.zzj = new zzbvn(zzbupVar != null ? zzbupVar.zza : "", zzbupVar != null ? zzbupVar.zzb : 1);
        this.zzl = zzeyqVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcei zzceiVar = (zzcei) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgn)).booleanValue()) {
                if (!this.zzm && zzceiVar != null) {
                    zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzceiVar.destroy();
                        }
                    });
                }
            } else if (zzceiVar != null) {
                zzceiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbut zzc() {
        return this.zzj;
    }

    public final zzeyq zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcei zzceiVar = (zzcei) this.zzd.get();
        return (zzceiVar == null || zzceiVar.zzaB()) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbza.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzbza.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzezx.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzded e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
