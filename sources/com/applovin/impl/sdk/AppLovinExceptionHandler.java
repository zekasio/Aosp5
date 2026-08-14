package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.tapjoy.TJAdUnitConstants;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AppLovinExceptionHandler f1179a = new AppLovinExceptionHandler();
    private final Set<p> b = new HashSet(2);
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    public static AppLovinExceptionHandler shared() {
        return f1179a;
    }

    public void enable() {
        if (this.c.compareAndSet(false, true)) {
            this.d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void addSdk(p pVar) {
        this.b.add(pVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long jLongValue = 1000;
        for (p pVar : this.b) {
            if (!pVar.e()) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("AppLovinExceptionHandler", "Detected unhandled exception");
                }
                pVar.aj().a(t.a.CRASH, CollectionUtils.map("top_main_method", th.toString()));
                pVar.G().trackEventSynchronously(TJAdUnitConstants.String.VIDEO_PAUSED);
                jLongValue = ((Long) pVar.a(com.applovin.impl.sdk.c.b.dA)).longValue();
            }
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
