package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbxf {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    private String zze = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final AtomicReference zzj = new AtomicReference(null);
    private final BlockingQueue zzk = new ArrayBlockingQueue(20);
    private final Object zzl = new Object();

    private final void zzA(Context context, String str, String str2) {
        if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method declaredMethod = (Method) this.zzi.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzi.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzC(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzC(str2, false);
            }
        }
    }

    private final void zzB(Context context, final String str, String str2, Bundle bundle) {
        if (zzu(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzbza.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzv(context)) {
                zzD("logEventInternal", new zzbxe() { // from class: com.google.android.gms.internal.ads.zzbwr
                    @Override // com.google.android.gms.internal.ads.zzbxe
                    public final void zza(zzcfz zzcfzVar) throws RemoteException {
                        zzcfzVar.zzo("am", str, bundle2);
                    }
                });
                return;
            }
            if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method declaredMethod = (Method) this.zzi.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzC("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzC("logEventInternal", true);
                }
            }
        }
    }

    private final void zzC(String str, boolean z) {
        if (this.zza.get()) {
            return;
        }
        zzbza.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            zzbza.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final void zzD(final String str, final zzbxe zzbxeVar) {
        synchronized (this.zzj) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbws
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(zzbxeVar, str);
                }
            }, null);
            if (this.zzj.get() != null) {
                futureTask.run();
            } else {
                this.zzk.offer(futureTask);
            }
        }
    }

    private final boolean zzE(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbwo.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzC("getInstance", z);
                return false;
            }
        }
        return true;
    }

    static final boolean zzv(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaf)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzag)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzah)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzw(String str, Object obj, zzbxd zzbxdVar) {
        synchronized (this.zzj) {
            if (((zzcfz) this.zzj.get()) != null) {
                try {
                    return zzbxdVar.zza((zzcfz) this.zzj.get());
                } catch (Exception unused) {
                    zzC(str, false);
                }
            }
            return obj;
        }
    }

    private final Object zzx(String str, Context context) {
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return null;
        }
        try {
            return zzy(context, str).invoke(this.zzg.get(), null);
        } catch (Exception unused) {
            zzC(str, true);
            return null;
        }
    }

    private final Method zzy(Context context, String str) {
        Method method = (Method) this.zzi.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.zzi.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzC(str, false);
            return null;
        }
    }

    private final ExecutorService zzz() {
        ExecutorService threadPoolExecutor;
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfkq.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzae)).intValue(), new zzbxc(this), 2);
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzae)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzae)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxc(this));
            }
            zzbwo.zza(this.zzb, null, threadPoolExecutor);
        }
        return (ExecutorService) this.zzb.get();
    }

    public final String zza(Context context) {
        if (!zzu(context)) {
            return null;
        }
        if (zzv(context)) {
            Long l = (Long) zzw("getAdEventId", null, new zzbxd() { // from class: com.google.android.gms.internal.ads.zzbwt
                @Override // com.google.android.gms.internal.ads.zzbxd
                public final Object zza(zzcfz zzcfzVar) {
                    return Long.valueOf(zzcfzVar.zzc());
                }
            });
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objZzx = zzx("generateEventId", context);
        if (objZzx != null) {
            return objZzx.toString();
        }
        return null;
    }

    public final String zzb(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zze;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zze = (String) zzw("getAppIdOrigin", this.zze, new zzbxd() { // from class: com.google.android.gms.internal.ads.zzbwx
                    @Override // com.google.android.gms.internal.ads.zzbxd
                    public final Object zza(zzcfz zzcfzVar) {
                        return zzcfzVar.zze();
                    }
                });
            } else {
                this.zze = "fa";
            }
            return this.zze;
        }
    }

    public final String zzc(final Context context) {
        if (!zzu(context)) {
            return null;
        }
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzad)).longValue();
        if (zzv(context)) {
            try {
                return jLongValue < 0 ? (String) zzw("getAppInstanceId", null, zzbwy.zza) : (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbwz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzf();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) zzx("getAppInstanceId", context);
        }
        try {
            return (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzg(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzd(Context context) {
        if (!zzu(context)) {
            return "";
        }
        if (zzv(context)) {
            return (String) zzw("getCurrentScreenNameOrScreenClass", "", new zzbxd() { // from class: com.google.android.gms.internal.ads.zzbwu
                @Override // com.google.android.gms.internal.ads.zzbxd
                public final Object zza(zzcfz zzcfzVar) throws RemoteException {
                    String strZzh = zzcfzVar.zzh();
                    return (strZzh == null && (strZzh = zzcfzVar.zzg()) == null) ? "" : strZzh;
                }
            });
        }
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return "";
        }
        try {
            String str = (String) zzy(context, "getCurrentScreenName").invoke(this.zzg.get(), null);
            if (str == null) {
                str = (String) zzy(context, "getCurrentScreenClass").invoke(this.zzg.get(), null);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            zzC("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zzd = (String) zzw("getGmpAppId", this.zzd, new zzbxd() { // from class: com.google.android.gms.internal.ads.zzbwq
                    @Override // com.google.android.gms.internal.ads.zzbxd
                    public final Object zza(zzcfz zzcfzVar) {
                        return zzcfzVar.zzi();
                    }
                });
            } else {
                this.zzd = (String) zzx("getGmpAppId", context);
            }
            return this.zzd;
        }
    }

    final /* synthetic */ String zzf() throws Exception {
        return (String) zzw("getAppInstanceId", null, zzbwy.zza);
    }

    final /* synthetic */ String zzg(Context context) throws Exception {
        return (String) zzx("getAppInstanceId", context);
    }

    public final void zzh(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("beginAdUnitExposure", new zzbxe() { // from class: com.google.android.gms.internal.ads.zzbwp
                    @Override // com.google.android.gms.internal.ads.zzbxe
                    public final void zza(zzcfz zzcfzVar) throws RemoteException {
                        zzcfzVar.zzl(str);
                    }
                });
            } else {
                zzA(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzi(Context context, final String str) {
        if (zzu(context)) {
            if (zzv(context)) {
                zzD("endAdUnitExposure", new zzbxe() { // from class: com.google.android.gms.internal.ads.zzbww
                    @Override // com.google.android.gms.internal.ads.zzbxe
                    public final void zza(zzcfz zzcfzVar) throws RemoteException {
                        zzcfzVar.zzn(str);
                    }
                });
            } else {
                zzA(context, str, "endAdUnitExposure");
            }
        }
    }

    final /* synthetic */ void zzj(zzbxe zzbxeVar, String str) {
        if (((zzcfz) this.zzj.get()) != null) {
            try {
                zzbxeVar.zza((zzcfz) this.zzj.get());
            } catch (Exception unused) {
                zzC(str, false);
            }
        }
    }

    public final void zzk(Context context, String str) {
        zzB(context, "_aa", str, null);
    }

    public final void zzl(Context context, String str) {
        zzB(context, "_aq", str, null);
    }

    public final void zzm(Context context, String str) {
        zzB(context, "_ac", str, null);
    }

    public final void zzn(Context context, String str) {
        zzB(context, "_ai", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i) {
        if (zzu(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzB(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzp(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzak)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzq(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzbxg.zzd(context).zzb().zzd(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzak)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzr(final Bundle bundle) {
        zzD("setConsent", new zzbxe() { // from class: com.google.android.gms.internal.ads.zzbxb
            @Override // com.google.android.gms.internal.ads.zzbxe
            public final void zza(zzcfz zzcfzVar) throws RemoteException {
                zzcfzVar.zzr(bundle);
            }
        });
    }

    @Deprecated
    public final void zzs(final Context context, final String str) {
        if (zzu(context) && (context instanceof Activity)) {
            if (zzv(context)) {
                zzD("setScreenName", new zzbxe() { // from class: com.google.android.gms.internal.ads.zzbwv
                    @Override // com.google.android.gms.internal.ads.zzbxe
                    public final void zza(zzcfz zzcfzVar) throws RemoteException {
                        Context context2 = context;
                        zzcfzVar.zzs(ObjectWrapper.wrap(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (zzE(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
                Method declaredMethod = (Method) this.zzi.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.zzi.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        zzC("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    zzC("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean zzt() {
        synchronized (this.zzl) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzu(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzY
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzai
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzf
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.ads.internal.client.zzay.zzb()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.zzbyt.zzt(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.ads.internal.client.zzay.zzb()
            boolean r5 = com.google.android.gms.internal.ads.zzbyt.zzu(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.zzbza.zzj(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zzf
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zzf
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zzf
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxf.zzu(android.content.Context):boolean");
    }
}
