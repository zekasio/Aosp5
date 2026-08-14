package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<T> extends a implements b.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.c<T> f1317a;
    private final b.c<T> b;
    private o.a c;
    private com.applovin.impl.sdk.c.b<String> d;
    protected b.a e;
    private com.applovin.impl.sdk.c.b<String> i;

    public abstract void a(int i, String str, T t);

    public abstract void a(T t, int i);

    public u(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.p pVar) {
        this(cVar, pVar, false);
    }

    public u(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.p pVar, boolean z) {
        super("TaskRepeatRequest", pVar, z);
        this.c = o.a.BACKGROUND;
        this.d = null;
        this.i = null;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f1317a = cVar;
        this.e = new b.a();
        this.b = new b.c<T>() { // from class: com.applovin.impl.sdk.e.u.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(T t, int i) {
                u.this.f1317a.a(0);
                u.this.a(t, i);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, T t) {
                long millis;
                boolean z2 = false;
                boolean z3 = i < 200 || i >= 500;
                boolean z4 = i == 429;
                if (i != -1009 && (z3 || z4 || u.this.f1317a.m())) {
                    String strF = u.this.f1317a.f();
                    if (u.this.f1317a.h() <= 0) {
                        if (strF != null && strF.equals(u.this.f1317a.a())) {
                            u uVar = u.this;
                            uVar.c(uVar.i);
                        } else {
                            u uVar2 = u.this;
                            uVar2.c(uVar2.d);
                        }
                        u.this.a(i, str, t);
                        return;
                    }
                    com.applovin.impl.sdk.y yVar = u.this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        u.this.h.d(u.this.g, "Unable to send request due to server failure (code " + i + "). " + u.this.f1317a.h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(u.this.f1317a.k()) + " seconds...");
                    }
                    int iH = u.this.f1317a.h() - 1;
                    u.this.f1317a.a(iH);
                    if (iH == 0) {
                        u uVar3 = u.this;
                        uVar3.c(uVar3.d);
                        if (StringUtils.isValidString(strF) && strF.length() >= 4) {
                            com.applovin.impl.sdk.y yVar2 = u.this.h;
                            if (com.applovin.impl.sdk.y.a()) {
                                u.this.h.c(u.this.g, "Switching to backup endpoint " + strF);
                            }
                            u.this.f1317a.a(strF);
                            z2 = true;
                        }
                    }
                    if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.du)).booleanValue() && z2) {
                        millis = 0;
                    } else {
                        millis = u.this.f1317a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, u.this.f1317a.i())) : u.this.f1317a.k();
                    }
                    o oVarM = pVar.M();
                    u uVar4 = u.this;
                    oVarM.a(uVar4, uVar4.c, millis);
                    return;
                }
                u.this.a(i, str, t);
            }
        };
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.network.b bVarO = d().O();
        if (d().c() || d().d()) {
            if (StringUtils.isValidString(this.f1317a.a()) && this.f1317a.a().length() >= 4) {
                if (TextUtils.isEmpty(this.f1317a.b())) {
                    this.f1317a.b(this.f1317a.e() != null ? "POST" : "GET");
                }
                bVarO.a(this.f1317a, this.e, this.b);
                return;
            } else {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Task has an invalid or null request endpoint.");
                }
                a(AppLovinErrorCodes.INVALID_URL, null, null);
                return;
            }
        }
        com.applovin.impl.sdk.y.i("AppLovinSdk", "AppLovin SDK is disabled");
        a(-22, null, null);
    }

    public void a(o.a aVar) {
        this.c = aVar;
    }

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.d = bVar;
    }

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            d().N().a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
        }
    }
}
