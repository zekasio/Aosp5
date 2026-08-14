package com.tapjoy.internal;

import com.tapjoy.TJAppSetId;
import com.tapjoy.TJTaskHandler;
import com.tapjoy.TapjoyConnectCore;

/* JADX INFO: loaded from: classes2.dex */
public class u4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapjoyConnectCore f1920a;

    public class a implements TJTaskHandler<String> {
        public a() {
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(String str) {
            TapjoyConnectCore.f0 = str;
            new Thread(new t4(this)).start();
        }
    }

    public u4(TapjoyConnectCore tapjoyConnectCore) {
        this.f1920a = tapjoyConnectCore;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1920a.a();
        new TJAppSetId().fetch(TapjoyConnectCore.c, new a());
    }
}
