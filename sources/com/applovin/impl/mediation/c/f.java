package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f1003a = new AtomicBoolean();
    private final String b;
    private final MaxAdFormat c;
    private final JSONObject d;
    private final a.InterfaceC0058a e;
    private final WeakReference<Context> i;
    private final Queue<com.applovin.impl.mediation.a.a> j;
    private final Object k;
    private final int l;
    private long m;
    private final List<MaxNetworkResponseInfo> n;
    private final AtomicBoolean o;
    private final AtomicBoolean p;
    private final AtomicBoolean q;
    private com.applovin.impl.mediation.a.a r;

    private enum b {
        ALL,
        BIDDING,
        TAG
    }

    public f(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, p pVar, a.InterfaceC0058a interfaceC0058a) {
        super("TaskProcessMediationWaterfallV2:" + str + ":" + maxAdFormat.getLabel(), pVar);
        this.k = new Object();
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.q = new AtomicBoolean();
        this.b = str;
        this.c = maxAdFormat;
        this.d = jSONObject;
        this.e = interfaceC0058a;
        this.i = new WeakReference<>(context);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.j = new LinkedList();
        for (int i = 0; i < jSONArray.length(); i++) {
            this.j.add(com.applovin.impl.mediation.a.a.a(i, map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, pVar));
        }
        int size = this.j.size();
        this.l = size;
        this.n = new ArrayList(size);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.m = SystemClock.elapsedRealtime();
        if (this.d.optBoolean("is_testing", false) && !this.f.av().a() && f1003a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.f.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", f.this.f.x());
                }
            });
        }
        if (this.j.isEmpty()) {
            y yVar = this.h;
            if (y.a()) {
                this.h.d(this.g, "No ads were returned from the server");
            }
            Utils.maybeHandleNoFillResponseForPublisher(this.b, this.c, this.d, this.f);
            JSONObject jSONObject = JsonUtils.getJSONObject(this.d, "settings", new JSONObject());
            long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
            final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
            if (j > 0) {
                long millis = TimeUnit.SECONDS.toMillis(j);
                Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.a(maxErrorImpl);
                    }
                };
                if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
                    com.applovin.impl.sdk.utils.f.a(millis, this.f, runnable);
                    return;
                } else {
                    AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                    return;
                }
            }
            a(maxErrorImpl);
            return;
        }
        y yVar2 = this.h;
        if (y.a()) {
            this.h.b(this.g, "Starting waterfall for " + this.l + " ad(s)...");
        }
        if (this.f.a(com.applovin.impl.sdk.c.a.X, this.c)) {
            a(b.TAG);
            a(b.BIDDING, o.a.MEDIATION_MAIN);
        } else {
            a(b.ALL);
        }
    }

    private boolean a(b bVar) {
        return a(bVar, (o.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(b bVar, o.a aVar) {
        com.applovin.impl.mediation.a.a aVarC = c(bVar);
        if (aVarC == null) {
            d(bVar);
            return false;
        }
        a aVar2 = new a(aVarC, bVar);
        if (aVar != null) {
            this.f.M().a(aVar2, aVar);
            return true;
        }
        this.f.M().a((com.applovin.impl.sdk.e.a) aVar2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.a.a b(b bVar) {
        return a(bVar, true);
    }

    private com.applovin.impl.mediation.a.a c(b bVar) {
        return a(bVar, false);
    }

    private com.applovin.impl.mediation.a.a a(b bVar, boolean z) {
        com.applovin.impl.mediation.a.a next;
        synchronized (this.k) {
            Iterator<com.applovin.impl.mediation.a.a> it = this.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (bVar == b.BIDDING) {
                    if (next.m()) {
                        break;
                    }
                } else if (bVar != b.TAG || !next.m()) {
                    break;
                }
            }
            if (z) {
                return next;
            }
            if (next != null) {
                this.j.remove(next);
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (!this.q.compareAndSet(false, true)) {
            if (this.r != null && aVar.b() > this.r.b()) {
                this.f.at().a(aVar);
                aVar.a(new MaxAdWaterfallInfoImpl(aVar, SystemClock.elapsedRealtime() - this.m, this.n));
                k.a((f.b) this.e, (MaxAd) aVar);
                return;
            }
            k.a((f.b) this.e, (MaxAd) this.r);
            return;
        }
        this.r = aVar;
        this.f.at().a(aVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        y yVar = this.h;
        if (y.a()) {
            this.h.c(this.g, "Waterfall loaded in " + jElapsedRealtime + "ms for " + aVar.Y());
        }
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, jElapsedRealtime, this.n));
        k.a((MaxAdListener) this.e, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        int i = 0;
        if (this.q.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f.P().a(com.applovin.impl.sdk.d.f.r);
            } else if (maxError.getCode() == -5001) {
                this.f.P().a(com.applovin.impl.sdk.d.f.s);
            } else {
                this.f.P().a(com.applovin.impl.sdk.d.f.t);
            }
            ArrayList arrayList = new ArrayList(this.n.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.n) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
                while (i < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                    i++;
                    sb.append(i);
                    sb.append(") ");
                    sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                    sb.append("\n..code: ");
                    sb.append(maxNetworkResponseInfo2.getError().getCode());
                    sb.append("\n..message: ");
                    sb.append(maxNetworkResponseInfo2.getError().getMessage());
                    sb.append("\n");
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            y yVar = this.h;
            if (y.a()) {
                this.h.c(this.g, "Waterfall failed in " + jElapsedRealtime + "ms with error: " + maxError);
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.d, "waterfall_name", ""), JsonUtils.getString(this.d, "waterfall_test_name", ""), jElapsedRealtime, this.n));
            k.a(this.e, this.b, maxError);
            k.a((f.b) this.e, (MaxAd) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        if (b.BIDDING == bVar) {
            this.o.compareAndSet(false, true);
        } else if (b.TAG == bVar) {
            this.p.compareAndSet(false, true);
        }
    }

    private class a extends com.applovin.impl.sdk.e.a {
        private final long b;
        private final com.applovin.impl.mediation.a.a c;
        private final b d;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
        }

        a(com.applovin.impl.mediation.a.a aVar, b bVar) {
            super(f.this.g, f.this.f);
            this.b = SystemClock.elapsedRealtime();
            this.c = aVar;
            this.d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Loading ad " + (this.c.C() + 1) + " of " + f.this.l + ": " + this.c.Y());
            }
            a("started to load ad");
            Context context = (Context) f.this.i.get();
            this.f.ap().loadThirdPartyMediatedAd(f.this.b, this.c, context instanceof Activity ? (Activity) context : this.f.x(), new com.applovin.impl.mediation.d.a(f.this.e) { // from class: com.applovin.impl.mediation.c.f.a.1
                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.a("loaded ad");
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.b;
                    y unused = a.this.h;
                    if (y.a()) {
                        a.this.h.b(a.this.g, "Ad loaded in " + jElapsedRealtime + "ms");
                    }
                    com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                    Iterator it = f.this.j.iterator();
                    while (it.hasNext()) {
                        a.this.a((com.applovin.impl.mediation.a.a) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                    f.this.a(aVar);
                    if (b.ALL == a.this.d) {
                        k.a((f.b) f.this.e, maxAd);
                    }
                }

                @Override // com.applovin.impl.mediation.d.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.b;
                    y unused = a.this.h;
                    if (y.a()) {
                        a.this.h.b(a.this.g, "Ad failed to load in " + jElapsedRealtime + " ms with error: " + maxError);
                    }
                    a.this.a("failed to load ad: " + maxError.getCode());
                    a aVar = a.this;
                    aVar.a(aVar.c, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                    if (!f.this.q.get()) {
                        if (f.this.a(a.this.d, b.BIDDING == a.this.d ? o.a.MEDIATION_MAIN : com.applovin.impl.mediation.d.c.a(f.this.c))) {
                            f.this.d(a.this.d);
                            if ((f.this.p.get() && f.this.o.get()) || b.ALL == a.this.d) {
                                f.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!((Boolean) a.this.f.a(com.applovin.impl.sdk.c.a.Y)).booleanValue()) {
                        k.a((f.b) f.this.e, (MaxAd) f.this.r);
                        return;
                    }
                    if (!(f.this.r instanceof com.applovin.impl.mediation.a.c) || !((com.applovin.impl.mediation.a.c) f.this.r).T()) {
                        com.applovin.impl.mediation.a.a aVarB = f.this.b(a.this.d);
                        if (f.this.r == null || aVarB == null || f.this.r.b() >= aVarB.b()) {
                            k.a((f.b) f.this.e, (MaxAd) f.this.r);
                            return;
                        } else {
                            f.this.a(a.this.d, b.BIDDING == a.this.d ? o.a.MEDIATION_MAIN : com.applovin.impl.mediation.d.c.a(f.this.c));
                            return;
                        }
                    }
                    k.a((f.b) f.this.e, (MaxAd) f.this.r);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            f.this.n.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.X(), this.f)), aVar.k(), aVar.m(), j, maxError));
        }
    }
}
