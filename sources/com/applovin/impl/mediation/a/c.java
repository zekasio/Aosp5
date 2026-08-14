package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.mediation.i;
import com.applovin.impl.sdk.p;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends a implements com.applovin.impl.sdk.ad.g {
    private final AtomicReference<com.applovin.impl.sdk.b.c> c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;
    private boolean f;
    private boolean g;

    public boolean T() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public c(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i, map, jSONObject, jSONObject2, null, pVar);
        this.e = new AtomicBoolean();
        this.c = new AtomicReference<>();
        this.d = new AtomicBoolean();
    }

    private c(c cVar, i iVar) {
        super(cVar.C(), cVar.ag(), cVar.W(), cVar.V(), iVar, cVar.b);
        this.e = new AtomicBoolean();
        this.c = cVar.c;
        this.d = cVar.d;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(i iVar) {
        return new c(this, iVar);
    }

    public long D() {
        long jB = b("ad_hidden_timeout_ms", -1L);
        return jB >= 0 ? jB : a("ad_hidden_timeout_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.G)).longValue());
    }

    public boolean E() {
        if (b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.H)).booleanValue();
    }

    public long F() {
        long jB = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jB >= 0 ? jB : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.I)).longValue());
    }

    public long G() {
        if (x() > 0) {
            return SystemClock.elapsedRealtime() - x();
        }
        return -1L;
    }

    public long H() {
        long jB = b("fullscreen_display_delay_ms", -1L);
        return jB >= 0 ? jB : ((Long) this.b.a(com.applovin.impl.sdk.c.a.u)).longValue();
    }

    public long I() {
        return b("ahdm", ((Long) this.b.a(com.applovin.impl.sdk.c.a.w)).longValue());
    }

    public boolean J() {
        return b("susaode", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.v)).booleanValue();
    }

    public String K() {
        return b("bcode", "");
    }

    public String L() {
        return a("mcode", "");
    }

    public boolean M() {
        return this.d.get();
    }

    public void N() {
        this.d.set(true);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.c.set(cVar);
    }

    public com.applovin.impl.sdk.b.c O() {
        return this.c.getAndSet(null);
    }

    public AtomicBoolean P() {
        return this.e;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long Q() {
        return R() - (SystemClock.elapsedRealtime() - x());
    }

    public long R() {
        long jB = b("ad_expiration_ms", -1L);
        return jB < 0 ? a("ad_expiration_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.C)).longValue()) : jB;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void S() {
        this.g = true;
    }
}
