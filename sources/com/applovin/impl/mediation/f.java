package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1103a;
    private final Map<String, d> b = CollectionUtils.map(4);
    private final Object c = new Object();
    private final Map<String, com.applovin.impl.mediation.a.a> d = CollectionUtils.map(4);
    private final Object e = new Object();

    public interface b {
        void a(MaxAd maxAd);
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1108a;
        private final AtomicBoolean b;
        private int c;
        private volatile a.InterfaceC0058a d;
        private volatile b e;

        static /* synthetic */ int f(d dVar) {
            int i = dVar.c;
            dVar.c = i + 1;
            return i;
        }

        private d(String str) {
            this.b = new AtomicBoolean();
            this.f1108a = str;
        }
    }

    public enum a {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");

        private final String g;

        a(String str) {
            this.g = str;
        }

        public String a() {
            return this.g;
        }
    }

    public f(p pVar) {
        this.f1103a = pVar;
    }

    public boolean a(String str) {
        boolean z;
        synchronized (this.e) {
            z = this.d.get(str) != null;
        }
        return z;
    }

    public void a(String str, String str2) {
        synchronized (this.c) {
            this.b.remove(c(str, str2));
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0058a interfaceC0058a) {
        com.applovin.impl.mediation.a.a aVarB = (this.f1103a.av().b() || Utils.isDspDemoApp(p.y())) ? null : b(str);
        if (aVarB != null) {
            aVarB.a(str2);
            aVarB.i().e().a(interfaceC0058a);
            interfaceC0058a.onAdLoaded(aVarB);
            if (aVarB.f().endsWith("load")) {
                interfaceC0058a.onAdRevenuePaid(aVarB);
            }
        }
        d dVarB = b(str, str2);
        if (!dVarB.b.compareAndSet(false, true)) {
            if (dVarB.d != null && dVarB.d != interfaceC0058a) {
                y.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            dVarB.d = interfaceC0058a;
            return;
        }
        if (aVarB == null) {
            dVarB.d = interfaceC0058a;
        }
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(CollectionUtils.map());
        mapSynchronizedMap.put("art", aVar.a());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new c(map, map2, mapSynchronizedMap, dVarB, maxAdFormat, SystemClock.elapsedRealtime(), this, this.f1103a, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final Map<String, Object> map2, final Map<String, Object> map3, final Context context, final a.InterfaceC0058a interfaceC0058a) {
        this.f1103a.M().a(new com.applovin.impl.mediation.c.b(str, maxAdFormat, map, context, this.f1103a, new b.a() { // from class: com.applovin.impl.mediation.f.1
            @Override // com.applovin.impl.mediation.c.b.a
            public void a(JSONArray jSONArray) {
                f.this.f1103a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.c(str, maxAdFormat, map, map2, map3, jSONArray, context, f.this.f1103a, interfaceC0058a));
            }
        }), com.applovin.impl.mediation.d.c.a(maxAdFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.e) {
            if (this.d.containsKey(aVar.getAdUnitId())) {
                y.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.d.put(aVar.getAdUnitId(), aVar);
        }
    }

    private com.applovin.impl.mediation.a.a b(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.e) {
            aVar = this.d.get(str);
            this.d.remove(str);
        }
        return aVar;
    }

    private d b(String str, String str2) {
        d dVar;
        synchronized (this.c) {
            String strC = c(str, str2);
            dVar = this.b.get(strC);
            if (dVar == null) {
                dVar = new d(str2);
                this.b.put(strC, dVar);
            }
        }
        return dVar;
    }

    private String c(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    private static class c implements a.InterfaceC0058a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f1106a;
        private final WeakReference<Context> b;
        private final f c;
        private final d d;
        private final MaxAdFormat e;
        private final Map<String, Object> f;
        private final Map<String, Object> g;
        private final Map<String, Object> h;
        private final int i;
        private long j;

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, d dVar, MaxAdFormat maxAdFormat, long j, f fVar, p pVar, Context context) {
            this.f1106a = pVar;
            this.b = new WeakReference<>(context);
            this.c = fVar;
            this.d = dVar;
            this.e = maxAdFormat;
            this.g = map2;
            this.f = map;
            this.h = map3;
            this.j = j;
            if (CollectionUtils.getBoolean(map2, AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES)) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) pVar.a(com.applovin.impl.sdk.c.a.N)).intValue());
            } else {
                this.i = ((Integer) pVar.a(com.applovin.impl.sdk.c.a.N)).intValue();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.d.f1108a);
            aVar.a(SystemClock.elapsedRealtime() - this.j);
            this.d.c = 0;
            if (this.d.d == null) {
                this.c.a(aVar);
                this.d.b.set(false);
                return;
            }
            aVar.i().e().a(this.d.d);
            this.d.d.onAdLoaded(aVar);
            if (aVar.f().endsWith("load")) {
                this.d.d.onAdRevenuePaid(aVar);
            }
            a.InterfaceC0058a interfaceC0058a = this.d.d;
            this.d.d = null;
            if (((Boolean) this.f1106a.a(com.applovin.impl.sdk.c.a.W)).booleanValue()) {
                this.d.e = interfaceC0058a;
            } else {
                b(maxAd);
            }
        }

        @Override // com.applovin.impl.mediation.f.b
        public void a(MaxAd maxAd) {
            if (maxAd == null) {
                this.d.e = null;
                return;
            }
            if (!(maxAd instanceof com.applovin.impl.mediation.a.c) || !((com.applovin.impl.mediation.a.c) maxAd).T()) {
                if (this.d.e == null) {
                    this.c.a((com.applovin.impl.mediation.a.a) maxAd);
                    return;
                }
                this.d.e.a(maxAd);
                this.d.e = null;
                b(maxAd);
                return;
            }
            this.d.e = null;
            b(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f1106a.a(com.applovin.impl.sdk.c.a.O, this.e) || this.d.c >= this.i) {
                this.d.c = 0;
                this.d.b.set(false);
                if (this.d.d != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.d.f1108a);
                    maxErrorImpl.setRequestLatencyMillis(SystemClock.elapsedRealtime() - this.j);
                    com.applovin.impl.sdk.utils.k.a(this.d.d, str, maxError);
                    this.d.d = null;
                    return;
                }
                return;
            }
            d.f(this.d);
            final int iPow = (int) Math.pow(2.0d, this.d.c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.f.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.g.put("retry_delay_sec", Integer.valueOf(iPow));
                    c.this.g.put("retry_attempt", Integer.valueOf(c.this.d.c));
                    Context contextY = (Context) c.this.b.get();
                    if (contextY == null) {
                        p unused = c.this.f1106a;
                        contextY = p.y();
                    }
                    c.this.h.put("art", a.EXPONENTIAL_RETRY.a());
                    c.this.h.put("era", Integer.valueOf(c.this.d.c));
                    c.this.c.a(str, c.this.e, c.this.f, c.this.g, c.this.h, contextY, c.this);
                }
            }, TimeUnit.SECONDS.toMillis(iPow));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        private void b(MaxAd maxAd) {
            if ((!this.f1106a.b(com.applovin.impl.sdk.c.a.M).contains(maxAd.getAdUnitId()) && !this.f1106a.a(com.applovin.impl.sdk.c.a.L, maxAd.getFormat())) || this.f1106a.av().a() || this.f1106a.av().b()) {
                this.d.b.set(false);
                return;
            }
            Context contextY = this.b.get();
            if (contextY == null) {
                contextY = p.y();
            }
            this.j = SystemClock.elapsedRealtime();
            this.h.put("art", a.SEQUENTIAL_OR_PRECACHE.a());
            this.c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.g, this.h, contextY, this);
        }
    }
}
