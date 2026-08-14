package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g implements AppLovinBroadcastManager.Receiver, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1386a;
    private final y b;
    private final int c;
    private final i d;
    private final List<j> f;
    private final Object e = new Object();
    private final Set<j> g = new HashSet();
    private final List<j> h = new ArrayList();

    public g(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1386a = pVar;
        this.b = pVar.L();
        int iIntValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.da)).intValue();
        this.c = iIntValue;
        i iVar = new i(this, pVar);
        this.d = iVar;
        this.f = iVar.a(iIntValue);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
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
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.b.e("PersistentPostbackManagerV2", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                jVar.m();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (g.this.e) {
                        g.this.c(jVar);
                        g.this.a(jVar, appLovinPostbackListener);
                    }
                }
            }, Utils.isMainThread(), jVar.p());
        }
    }

    @Override // com.applovin.impl.sdk.network.k
    public void c() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (g.this.e) {
                    Iterator it = new ArrayList(g.this.f).iterator();
                    while (it.hasNext()) {
                        g.this.b((j) it.next());
                    }
                }
            }
        }, ((Boolean) this.f1386a.a(com.applovin.impl.sdk.c.b.cZ)).booleanValue(), false);
    }

    protected List<j> a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            arrayList.ensureCapacity(this.f.size());
            arrayList.addAll(this.f);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        a(jVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final j jVar, final AppLovinPostbackListener appLovinPostbackListener) {
        if (y.a()) {
            this.b.b("PersistentPostbackManagerV2", "Preparing to submit postback: " + jVar);
        }
        if (this.f1386a.c() && !jVar.p()) {
            if (y.a()) {
                this.b.b("PersistentPostbackManagerV2", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(jVar.b())) {
            if (y.a()) {
                this.b.e("PersistentPostbackManagerV2", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.e) {
            if (this.g.contains(jVar)) {
                if (y.a()) {
                    this.b.b("PersistentPostbackManagerV2", "Skipping in progress postback: " + jVar.b());
                }
                return;
            }
            jVar.l();
            Integer num = (Integer) this.f1386a.a(com.applovin.impl.sdk.c.b.cY);
            if (jVar.k() > num.intValue()) {
                if (y.a()) {
                    this.b.d("PersistentPostbackManagerV2", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + jVar);
                }
                d(jVar);
                return;
            }
            synchronized (this.e) {
                this.g.add(jVar);
            }
            l lVarB = l.b(this.f1386a).a(jVar.b()).c(jVar.c()).c(jVar.d()).b(jVar.a()).d(jVar.e()).a(jVar.f() != null ? new JSONObject(jVar.f()) : null).d(jVar.h()).c(jVar.g()).g(jVar.i()).g(jVar.j()).a();
            if (y.a()) {
                this.b.b("PersistentPostbackManagerV2", "Submitting postback: " + jVar);
            }
            this.f1386a.ak().dispatchPostbackRequest(lVarB, new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.g.3
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    g.this.d(jVar);
                    y unused = g.this.b;
                    if (y.a()) {
                        g.this.b.b("PersistentPostbackManagerV2", "Successfully submit postback: " + jVar);
                    }
                    g.this.b();
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i) {
                    y unused = g.this.b;
                    if (y.a()) {
                        g.this.b.c("PersistentPostbackManagerV2", "Failed to submit postback: " + jVar + " with error code: " + i + "; will retry later...");
                    }
                    g.this.e(jVar);
                    com.applovin.impl.sdk.utils.k.a(appLovinPostbackListener, str, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(j jVar) {
        synchronized (this.e) {
            while (this.f.size() > this.c) {
                this.f.remove(0);
            }
            this.f.add(jVar);
        }
        if (y.a()) {
            this.b.b("PersistentPostbackManagerV2", "Enqueued postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        synchronized (this.e) {
            this.g.remove(jVar);
            this.f.remove(jVar);
        }
        if (y.a()) {
            this.b.b("PersistentPostbackManagerV2", "Dequeued postback: " + jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(j jVar) {
        synchronized (this.e) {
            this.g.remove(jVar);
            this.h.add(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this.e) {
            Iterator<j> it = this.h.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            this.h.clear();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        this.f1386a.M().a((com.applovin.impl.sdk.e.a) this.d);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    private void a(Runnable runnable, boolean z, boolean z2) {
        if (z) {
            this.f1386a.M().a(new z(this.f1386a, z2, runnable), o.a.POSTBACKS);
        } else {
            runnable.run();
        }
    }
}
