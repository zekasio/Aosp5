package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AppInitializer {
    private static final String SECTION_NAME = "Startup";
    private static volatile AppInitializer sInstance;
    private static final Object sLock = new Object();
    final Context mContext;
    final Set<Class<? extends Initializer<?>>> mDiscovered = new HashSet();
    final Map<Class<?>, Object> mInitialized = new HashMap();

    AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new AppInitializer(context);
                }
            }
        }
        return sInstance;
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> cls) {
        return (T) doInitialize(cls, new HashSet());
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> cls) {
        return this.mDiscovered.contains(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #1 {all -> 0x0089, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0016, B:11:0x001e, B:24:0x0062, B:25:0x0067, B:26:0x0068, B:30:0x0073, B:31:0x0088, B:13:0x0022, B:15:0x0036, B:16:0x003a, B:18:0x0040, B:20:0x004e, B:21:0x0052), top: B:42:0x0009, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0016, B:11:0x001e, B:24:0x0062, B:25:0x0067, B:26:0x0068, B:30:0x0073, B:31:0x0088, B:13:0x0022, B:15:0x0036, B:16:0x003a, B:18:0x0040, B:20:0x004e, B:21:0x0052), top: B:42:0x0009, outer: #2, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> r6, java.util.Set<java.lang.Class<?>> r7) {
        /*
            r5 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            boolean r1 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L10
            java.lang.String r1 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L89
            androidx.tracing.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L89
        L10:
            boolean r1 = r7.contains(r6)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L73
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r5.mInitialized     // Catch: java.lang.Throwable -> L89
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L68
            r7.add(r6)     // Catch: java.lang.Throwable -> L89
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L61
            androidx.startup.Initializer r1 = (androidx.startup.Initializer) r1     // Catch: java.lang.Throwable -> L61
            java.util.List r2 = r1.dependencies()     // Catch: java.lang.Throwable -> L61
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L52
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L61
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L61
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L61
            java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = r5.mInitialized     // Catch: java.lang.Throwable -> L61
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L3a
            r5.doInitialize(r3, r7)     // Catch: java.lang.Throwable -> L61
            goto L3a
        L52:
            android.content.Context r2 = r5.mContext     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r1.create(r2)     // Catch: java.lang.Throwable -> L61
            r7.remove(r6)     // Catch: java.lang.Throwable -> L61
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.mInitialized     // Catch: java.lang.Throwable -> L61
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L61
            goto L6e
        L61:
            r6 = move-exception
            androidx.startup.StartupException r7 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L89
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L89
            throw r7     // Catch: java.lang.Throwable -> L89
        L68:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.mInitialized     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r7.get(r6)     // Catch: java.lang.Throwable -> L89
        L6e:
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r1
        L73:
            java.lang.String r7 = "Cannot initialize %s. Cycle detected."
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L89
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L89
            r2 = 0
            r1[r2] = r6     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = java.lang.String.format(r7, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L89
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L89
            throw r7     // Catch: java.lang.Throwable -> L89
        L89:
            r6 = move-exception
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            throw r6     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            goto L92
        L91:
            throw r6
        L92:
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.AppInitializer.doInitialize(java.lang.Class, java.util.Set):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    void discoverAndInitialize() {
        try {
            try {
                Trace.beginSection(SECTION_NAME);
                Bundle bundle = this.mContext.getPackageManager().getProviderInfo(new ComponentName(this.mContext.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.mContext.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (Initializer.class.isAssignableFrom(cls)) {
                                this.mDiscovered.add((Class<? extends Initializer<?>>) cls);
                                doInitialize(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                Trace.endSection();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new StartupException(e);
        }
    }
}
