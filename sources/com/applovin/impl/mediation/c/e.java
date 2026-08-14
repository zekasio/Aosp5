package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f998a = new AtomicBoolean();
    private final String b;
    private final MaxAdFormat c;
    private final JSONObject d;
    private final List<com.applovin.impl.mediation.a.a> e;
    private final a.InterfaceC0058a i;
    private final WeakReference<Context> j;
    private long k;
    private final List<MaxNetworkResponseInfo> l;

    e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, p pVar, a.InterfaceC0058a interfaceC0058a) {
        super("TaskProcessMediationWaterfall:" + str + ":" + maxAdFormat.getLabel(), pVar);
        this.b = str;
        this.c = maxAdFormat;
        this.d = jSONObject;
        this.i = interfaceC0058a;
        this.j = new WeakReference<>(context);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.e = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.e.add(com.applovin.impl.mediation.a.a.a(i, map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, pVar));
        }
        this.l = new ArrayList(this.e.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.k = SystemClock.elapsedRealtime();
        if (this.d.optBoolean("is_testing", false) && !this.f.av().a() && f998a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", e.this.f.x());
                }
            });
        }
        if (this.e.size() > 0) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Starting waterfall for " + this.e.size() + " ad(s)...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new a(0, this.e));
            return;
        }
        y yVar2 = this.h;
        if (y.a()) {
            this.h.d(this.g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.b, this.c, this.d, this.f);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.d, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.c.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(maxErrorImpl);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f.at().a(aVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        y yVar = this.h;
        if (y.a()) {
            this.h.c(this.g, "Waterfall loaded in " + jElapsedRealtime + "ms for " + aVar.Y());
        }
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, jElapsedRealtime, this.l));
        k.a((MaxAdListener) this.i, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f.P().a(com.applovin.impl.sdk.d.f.r);
        } else if (maxError.getCode() == -5001) {
            this.f.P().a(com.applovin.impl.sdk.d.f.s);
        } else {
            this.f.P().a(com.applovin.impl.sdk.d.f.t);
        }
        ArrayList arrayList = new ArrayList(this.l.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.l) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
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
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        y yVar = this.h;
        if (y.a()) {
            this.h.c(this.g, "Waterfall failed in " + jElapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.d, "waterfall_name", ""), JsonUtils.getString(this.d, "waterfall_test_name", ""), jElapsedRealtime, this.l));
        k.a(this.i, this.b, maxError);
    }

    private class a extends com.applovin.impl.sdk.e.a {
        private final long b;
        private final int c;
        private final com.applovin.impl.mediation.a.a d;
        private final List<com.applovin.impl.mediation.a.a> e;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
        }

        a(int i, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.g, e.this.f);
            this.b = SystemClock.elapsedRealtime();
            this.c = i;
            this.d = list.get(i);
            this.e = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Loading ad " + (this.c + 1) + " of " + this.e.size() + ": " + this.d.Y());
            }
            a("started to load ad");
            Context context = (Context) e.this.j.get();
            this.f.ap().loadThirdPartyMediatedAd(e.this.b, this.d, context instanceof Activity ? (Activity) context : this.f.x(), new com.applovin.impl.mediation.d.a(e.this.i) { // from class: com.applovin.impl.mediation.c.e.a.1
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
                    int i = a.this.c;
                    while (true) {
                        i++;
                        if (i >= a.this.e.size()) {
                            e.this.a(aVar);
                            return;
                        } else {
                            a aVar2 = a.this;
                            aVar2.a((com.applovin.impl.mediation.a.a) aVar2.e.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                        }
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
                    aVar.a(aVar.d, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                    if (a.this.c < a.this.e.size() - 1) {
                        a.this.f.M().a(e.this.new a(a.this.c + 1, a.this.e), com.applovin.impl.mediation.d.c.a(e.this.c));
                    } else {
                        e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            e.this.l.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.d.c.a(aVar.X(), this.f)), aVar.k(), aVar.m(), j, maxError));
        }
    }
}
