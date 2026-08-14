package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbsf implements zzbsh {
    static zzbsh zza;
    static zzbsh zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzbzg zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    protected zzbsf(Context context, zzbzg zzbzgVar) {
        zzfkq.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzbzgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbsh zza(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbsf.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbsh r1 = com.google.android.gms.internal.ads.zzbsf.zza     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbbw r1 = com.google.android.gms.internal.ads.zzbct.zze     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzhf     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzbsf r1 = new com.google.android.gms.internal.ads.zzbsf     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbzg r2 = com.google.android.gms.internal.ads.zzbzg.zza()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbsf.zza = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.zzbsg r3 = new com.google.android.gms.internal.ads.zzbsg     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbsf.zza = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbsh r3 = com.google.android.gms.internal.ads.zzbsf.zza
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsf.zza(android.content.Context):com.google.android.gms.internal.ads.zzbsh");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x006e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0044, B:20:0x0053, B:21:0x0054, B:22:0x0063, B:23:0x006a, B:14:0x0039, B:15:0x0043), top: B:31:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbsh zzb(android.content.Context r4, com.google.android.gms.internal.ads.zzbzg r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbsf.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbsh r1 = com.google.android.gms.internal.ads.zzbsf.zzb     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L6a
            com.google.android.gms.internal.ads.zzbbw r1 = com.google.android.gms.internal.ads.zzbct.zze     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L63
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzhf     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L63
            com.google.android.gms.internal.ads.zzbsf r1 = new com.google.android.gms.internal.ads.zzbsf     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6e
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L54
            java.lang.Object r5 = r1.zzd     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6e
            java.util.WeakHashMap r2 = r1.zzf     // Catch: java.lang.Throwable -> L51
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L51
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbse r2 = new com.google.android.gms.internal.ads.zzbse     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6e
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6e
            goto L54
        L51:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            throw r4     // Catch: java.lang.Throwable -> L6e
        L54:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbsd r5 = new com.google.android.gms.internal.ads.zzbsd     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbsf.zzb = r1     // Catch: java.lang.Throwable -> L6e
            goto L6a
        L63:
            com.google.android.gms.internal.ads.zzbsg r4 = new com.google.android.gms.internal.ads.zzbsg     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbsf.zzb = r4     // Catch: java.lang.Throwable -> L6e
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbsh r4 = com.google.android.gms.internal.ads.zzbsf.zzb
            return r4
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsf.zzb(android.content.Context, com.google.android.gms.internal.ads.zzbzg):com.google.android.gms.internal.ads.zzbsh");
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfoj.zzc(zzbyt.zzf(zzc(th)));
    }

    protected final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzp = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzp |= zzbyt.zzp(stackTraceElement.getClassName());
                    zEquals |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzp || zEquals) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(Throwable th, String str, float f) {
        boolean zIsCallerInstantApp;
        String packageName;
        if (zzbyt.zzg(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        String strZzc = zzc(th);
        String strZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzib)).booleanValue() ? zzd(th) : "";
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzbza.zzh("Error fetching instant app info", th2);
                zIsCallerInstantApp = false;
            }
            try {
                packageName = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzbza.zzj("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + " " + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", str3).appendQueryParameter("js", this.zzh.zza).appendQueryParameter(VungleMediationAdapter.KEY_APP_ID, packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZzc).appendQueryParameter("eids", TextUtils.join(",", zzbar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "513548808").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbct.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
            if (!TextUtils.isEmpty(strZzd)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strZzd);
            }
            arrayList.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList) {
                final zzbzf zzbzfVar = new zzbzf(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzfVar.zza(str4);
                    }
                });
            }
        }
    }
}
