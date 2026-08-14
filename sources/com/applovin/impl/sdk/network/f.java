package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1382a;
    private final y b;
    private final int c;
    private final h d;
    private final ArrayList<j> f;
    private final Object e = new Object();
    private final ArrayList<j> g = new ArrayList<>();
    private long h = 0;
    private final Set<j> i = new HashSet();

    public f(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1382a = pVar;
        this.b = pVar.L();
        int iIntValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.da)).intValue();
        this.c = iIntValue;
        h hVar = new h(this, pVar);
        this.d = hVar;
        this.f = hVar.a(iIntValue);
        hVar.a();
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar) {
        a(jVar, true);
    }

    @Override // com.applovin.impl.sdk.network.k
    public void a(j jVar, boolean z) {
        a(jVar, z, (AppLovinPostbackListener) null);
    }

    public void a(final j jVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(jVar.b())) {
            if (z) {
                jVar.m();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (f.this.e) {
                        f.this.b(jVar);
                        f.this.a(jVar, appLovinPostbackListener);
                    }
                }
            };
            if (Utils.isMainThread()) {
                this.f1382a.M().a(new z(this.f1382a, jVar.p(), runnable), o.a.POSTBACKS);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        synchronized (this.e) {
            while (this.f.size() > this.c) {
                this.f.remove(0);
            }
            this.f.add(jVar);
            d();
            if (y.a()) {
                this.b.b("PersistentPostbackManager", "Enqueued postback: " + jVar);
            }
        }
    }

    private void d() {
        this.h = System.currentTimeMillis();
    }

    long a() {
        return this.h;
    }

    List<j> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            arrayList.ensureCapacity(this.f.size());
            arrayList.addAll(this.f);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.b.b("PersistentPostbackManager", "Preparing to submit postback..." + jVar);
        }
        if (this.f1382a.c() && !jVar.p()) {
            if (y.a()) {
                this.b.b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        synchronized (this.e) {
            if (this.i.contains(jVar)) {
                if (y.a()) {
                    this.b.b("PersistentPostbackManager", "Skip pending postback: " + jVar.b());
                }
                return;
            }
            jVar.l();
            d();
            int iIntValue = ((Integer) this.f1382a.a(com.applovin.impl.sdk.c.b.cY)).intValue();
            if (jVar.k() > iIntValue) {
                if (y.a()) {
                    this.b.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + iIntValue + ". Dequeuing postback: " + jVar);
                }
                d(jVar);
                return;
            }
            synchronized (this.e) {
                this.i.add(jVar);
            }
            this.f1382a.ak().dispatchPostbackRequest(l.b(this.f1382a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).d(jVar.h()).c(jVar.g()).g(jVar.i()).g(jVar.j()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    f.this.d(jVar);
                    y unused = f.this.b;
                    if (y.a()) {
                        f.this.b.b("PersistentPostbackManager", "Successfully submitted postback: " + jVar);
                    }
                    f.this.e();
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i) {
                    y unused = f.this.b;
                    if (y.a()) {
                        f.this.b.c("PersistentPostbackManager", "Failed to submit postback with errorCode " + i + ". Will retry later...  Postback: " + jVar);
                    }
                    f.this.e(jVar);
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.e) {
            this.i.remove(jVar);
            this.f.remove(jVar);
            d();
        }
        if (y.a()) {
            this.b.b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.e) {
            this.i.remove(jVar);
            this.g.add(jVar);
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (f.this.e) {
                    if (f.this.f != null) {
                        Iterator it = new ArrayList(f.this.f).iterator();
                        while (it.hasNext()) {
                            f.this.c((j) it.next());
                        }
                    }
                }
            }
        };
        if (((Boolean) this.f1382a.a(com.applovin.impl.sdk.c.b.cZ)).booleanValue()) {
            this.f1382a.M().a(new z(this.f1382a, runnable), o.a.POSTBACKS);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (this.e) {
            Iterator<j> it = this.g.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.g.clear();
        }
    }
}
