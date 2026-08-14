package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoe extends zzcqm {
    private final zzcei zzc;
    private final int zzd;
    private final Context zze;
    private final zzcnt zzf;
    private final zzdee zzg;
    private final zzdbk zzh;
    private final zzcvb zzi;
    private final boolean zzj;
    private boolean zzk;

    zzcoe(zzcql zzcqlVar, Context context, zzcei zzceiVar, int i, zzcnt zzcntVar, zzdee zzdeeVar, zzdbk zzdbkVar, zzcvb zzcvbVar) {
        super(zzcqlVar);
        this.zzk = false;
        this.zzc = zzceiVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcntVar;
        this.zzg = zzdeeVar;
        this.zzh = zzdbkVar;
        this.zzi = zzcvbVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeQ)).booleanValue();
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zzb() {
        super.zzb();
        zzcei zzceiVar = this.zzc;
        if (zzceiVar != null) {
            zzceiVar.destroy();
        }
    }

    public final void zzc(zzaus zzausVar) {
        zzcei zzceiVar = this.zzc;
        if (zzceiVar != null) {
            zzceiVar.zzah(zzausVar);
        }
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
    public final void zzd(Activity activity, zzavf zzavfVar, boolean z) throws RemoteException {
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context)) {
                zzbza.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaz)).booleanValue()) {
                    new zzfia(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzk) {
            zzbza.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzezx.zzd(10, null, null));
        }
        if (this.zzk) {
            return;
        }
        try {
            this.zzg.zza(z, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzk = true;
        } catch (zzded e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
