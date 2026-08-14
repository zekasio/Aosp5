package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.mediation.i;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.vungle.warren.model.Advertisement;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends e implements com.applovin.impl.sdk.ad.g, b.a {
    private final AtomicBoolean c;
    private final AtomicBoolean d;
    private com.applovin.impl.sdk.b e;
    private WeakReference<a> f;

    public interface a {
        void onAdExpiredOld(d dVar);
    }

    public d(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i, map, jSONObject, jSONObject2, null, pVar);
        this.c = new AtomicBoolean();
        this.d = new AtomicBoolean();
        this.f = new WeakReference<>(null);
    }

    private d(d dVar, i iVar) {
        super(dVar.C(), dVar.ag(), dVar.W(), dVar.V(), iVar, dVar.b);
        this.c = new AtomicBoolean();
        this.d = new AtomicBoolean();
        this.f = new WeakReference<>(null);
    }

    @Override // com.applovin.impl.mediation.a.a
    public com.applovin.impl.mediation.a.a a(i iVar) {
        return new d(this, iVar);
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f942a.a(maxNativeAdView);
    }

    public MaxNativeAdView D() {
        return this.f942a.c();
    }

    public String E() {
        return BundleUtils.getString(Advertisement.KEY_TEMPLATE, "", ah());
    }

    public boolean F() {
        return b("inacc", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.V)).booleanValue();
    }

    public boolean G() {
        return this.f942a == null;
    }

    public AtomicBoolean H() {
        return this.c;
    }

    public AtomicBoolean I() {
        return this.d;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long Q() {
        return J() - (SystemClock.elapsedRealtime() - x());
    }

    public long J() {
        long jB = b("ad_expiration_ms", -1L);
        return jB < 0 ? a("ad_expiration_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.D)).longValue()) : jB;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void S() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public void a(a aVar) {
        if (this.c.get() || this.e != null) {
            return;
        }
        com.applovin.impl.sdk.b bVar = new com.applovin.impl.sdk.b(this.b, this);
        this.e = bVar;
        bVar.a(this);
        this.f = new WeakReference<>(aVar);
    }

    public void K() {
        a(true);
    }

    private void a(boolean z) {
        com.applovin.impl.sdk.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
            this.e = null;
        }
        if (z) {
            this.f.clear();
        }
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        if (getNativeAd() != null) {
            getNativeAd().setExpired();
        }
        a(false);
        a aVar = this.f.get();
        if (aVar != null) {
            aVar.onAdExpiredOld(this);
            this.f.clear();
        }
    }
}
