package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.a f941a;
    private final y b;
    private InterfaceC0057a c;
    private com.applovin.impl.mediation.a.c d;
    private int e;
    private boolean f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0057a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    a(p pVar) {
        this.b = pVar.L();
        this.f941a = pVar.w();
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0057a interfaceC0057a) {
        if (y.a()) {
            this.b.b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + "...");
        }
        a();
        this.c = interfaceC0057a;
        this.d = cVar;
        this.f941a.a(this);
    }

    public void a() {
        if (y.a()) {
            this.b.b("AdActivityObserver", "Cancelling...");
        }
        this.f941a.b(this);
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = false;
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f) {
            this.f = true;
        }
        this.e++;
        if (y.a()) {
            this.b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.e);
        }
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f) {
            this.e--;
            if (y.a()) {
                this.b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.e);
            }
            if (this.e <= 0) {
                if (y.a()) {
                    this.b.b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.c != null) {
                    if (y.a()) {
                        this.b.b("AdActivityObserver", "Invoking callback...");
                    }
                    this.c.a(this.d);
                }
                a();
            }
        }
    }
}
