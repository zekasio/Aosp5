package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdcv extends zzcqm {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdbk zze;
    private final zzdee zzf;
    private final zzcrg zzg;
    private final zzfia zzh;
    private final zzcvb zzi;
    private boolean zzj;

    zzdcv(zzcql zzcqlVar, Context context, @Nullable zzcei zzceiVar, zzdbk zzdbkVar, zzdee zzdeeVar, zzcrg zzcrgVar, zzfia zzfiaVar, zzcvb zzcvbVar) {
        super(zzcqlVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzceiVar);
        this.zze = zzdbkVar;
        this.zzf = zzdeeVar;
        this.zzg = zzcrgVar;
        this.zzh = zzfiaVar;
        this.zzi = zzcvbVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcei zzceiVar = (zzcei) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgn)).booleanValue()) {
                if (!this.zzj && zzceiVar != null) {
                    zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdcu
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(boolean r5, @javax.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzdbk r0 = r4.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzay
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r4.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzC(r0)
            if (r0 == 0) goto L4d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzbza.zzj(r5)
            com.google.android.gms.internal.ads.zzcvb r5 = r4.zzi
            r5.zzb()
            com.google.android.gms.internal.ads.zzbaj r5 = com.google.android.gms.internal.ads.zzbar.zzaz
            com.google.android.gms.internal.ads.zzbap r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L80
            com.google.android.gms.internal.ads.zzfia r5 = r4.zzh
            com.google.android.gms.internal.ads.zzeyo r6 = r4.zza
            com.google.android.gms.internal.ads.zzeyn r6 = r6.zzb
            com.google.android.gms.internal.ads.zzeyf r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
            goto L80
        L4d:
            boolean r0 = r4.zzj
            if (r0 == 0) goto L62
            java.lang.String r0 = "The interstitial ad has been showed."
            com.google.android.gms.internal.ads.zzbza.zzj(r0)
            com.google.android.gms.internal.ads.zzcvb r0 = r4.zzi
            r2 = 10
            r3 = 0
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzezx.zzd(r2, r3, r3)
            r0.zza(r2)
        L62:
            boolean r0 = r4.zzj
            if (r0 != 0) goto L80
            if (r6 != 0) goto L6a
            android.content.Context r6 = r4.zzc
        L6a:
            com.google.android.gms.internal.ads.zzdee r0 = r4.zzf     // Catch: com.google.android.gms.internal.ads.zzded -> L7a
            com.google.android.gms.internal.ads.zzcvb r2 = r4.zzi     // Catch: com.google.android.gms.internal.ads.zzded -> L7a
            r0.zza(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzded -> L7a
            com.google.android.gms.internal.ads.zzdbk r5 = r4.zze     // Catch: com.google.android.gms.internal.ads.zzded -> L7a
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzded -> L7a
            r5 = 1
            r4.zzj = r5
            return r5
        L7a:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcvb r6 = r4.zzi
            r6.zzc(r5)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdcv.zzc(boolean, android.app.Activity):boolean");
    }
}
