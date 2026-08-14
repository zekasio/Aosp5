package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.f> f987a;
    private final Activity b;

    public a(List<com.applovin.impl.mediation.a.f> list, Activity activity, p pVar) {
        super("TaskAutoInitAdapters", pVar, true);
        this.f987a = list;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f987a.size() > 0) {
                y yVar = this.h;
                if (y.a()) {
                    y yVar2 = this.h;
                    String str = this.g;
                    StringBuilder sb = new StringBuilder("Auto-initing ");
                    sb.append(this.f987a.size());
                    sb.append(" adapters");
                    sb.append(this.f.av().a() ? " in test mode" : "");
                    sb.append("...");
                    yVar2.b(str, sb.toString());
                }
                if (TextUtils.isEmpty(this.f.s())) {
                    this.f.d(AppLovinMediationProvider.MAX);
                } else if (!this.f.f()) {
                    y.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f.s());
                }
                if (this.b == null) {
                    y.i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.a.P)).booleanValue()) {
                    com.applovin.impl.mediation.a.f fVar = this.f987a.get(0);
                    this.f.M().a(new C0061a(fVar, this.f987a, this.f, this.b), o.a.MAIN, fVar.al());
                } else {
                    for (final com.applovin.impl.mediation.a.f fVar2 : this.f987a) {
                        this.f.M().a(new Runnable() { // from class: com.applovin.impl.mediation.c.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                y unused = a.this.h;
                                if (y.a()) {
                                    a.this.h.b(a.this.g, "Auto-initing adapter: " + fVar2);
                                }
                                a.this.f.ao().a(fVar2, a.this.b);
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            y yVar3 = this.h;
            if (y.a()) {
                this.h.b(this.g, "Failed to auto-init adapters", th);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c.a$a, reason: collision with other inner class name */
    public static class C0061a extends com.applovin.impl.sdk.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.f f989a;
        private final List<com.applovin.impl.mediation.a.f> b;
        private final Activity c;

        private C0061a(com.applovin.impl.mediation.a.f fVar, List<com.applovin.impl.mediation.a.f> list, p pVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.X(), pVar, true);
            this.c = activity;
            this.f989a = fVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Auto-initing " + this.f989a + "...");
            }
            this.f.ao().a(this.f989a, this.c, new Runnable() { // from class: com.applovin.impl.mediation.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    y unused = C0061a.this.h;
                    if (y.a()) {
                        C0061a.this.h.b(C0061a.this.g, "Initialization task for adapter '" + C0061a.this.f989a.Y() + "' finished");
                    }
                    int iIndexOf = C0061a.this.b.indexOf(C0061a.this.f989a);
                    if (iIndexOf < C0061a.this.b.size() - 1) {
                        com.applovin.impl.mediation.a.f fVar = (com.applovin.impl.mediation.a.f) C0061a.this.b.get(iIndexOf + 1);
                        C0061a.this.f.M().a(new C0061a(fVar, C0061a.this.b, C0061a.this.f, C0061a.this.c), o.a.MAIN, fVar.al());
                    } else {
                        y unused2 = C0061a.this.h;
                        if (y.a()) {
                            C0061a.this.h.b(C0061a.this.g, "Finished initializing adapters");
                        }
                    }
                }
            });
        }
    }
}
