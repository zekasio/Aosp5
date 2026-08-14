package com.tapjoy.internal;

import com.tapjoy.TJAppSetId;
import com.tapjoy.TJTaskHandler;
import com.tapjoy.TapjoyConnectCore;

/* JADX INFO: loaded from: classes2.dex */
public class s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TapjoyConnectCore f1904a;

    public class a implements TJTaskHandler<String> {
        public a() {
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(String str) {
            TapjoyConnectCore.f0 = str;
            new Thread(new r4(this)).start();
        }
    }

    public s4(TapjoyConnectCore tapjoyConnectCore) {
        this.f1904a = tapjoyConnectCore;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1904a.a();
        new TJAppSetId().fetch(TapjoyConnectCore.c, new a());
    }
}
