package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.tapjoy.TJAdUnitConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", TJAdUnitConstants.String.VIDEO_PAUSED, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1181a;
    private final Map<String, Object> b;
    private final AtomicBoolean c = new AtomicBoolean();

    public EventServiceImpl(p pVar) {
        this.f1181a = pVar;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.bs)).booleanValue()) {
            this.b = JsonUtils.toStringObjectMap((String) pVar.b(com.applovin.impl.sdk.c.d.B, JsonUtils.EMPTY_JSON));
        } else {
            this.b = CollectionUtils.map();
            pVar.a(com.applovin.impl.sdk.c.d.B, JsonUtils.EMPTY_JSON);
        }
    }

    public void maybeTrackAppOpenEvent() {
        if (this.c.compareAndSet(false, true)) {
            this.f1181a.G().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.b.remove(str);
            c();
            return;
        }
        List<String> listB = this.f1181a.b(com.applovin.impl.sdk.c.b.br);
        if (!Utils.objectIsOfType(obj, listB, this.f1181a)) {
            y.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + listB);
            return;
        }
        this.b.put(str, Utils.sanitizeSuperProperty(obj, this.f1181a));
        c();
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.b);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            y.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, CollectionUtils.map());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f1181a.L();
        if (y.a()) {
            this.f1181a.L().b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final u uVar = new u(str, map, this.b);
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f1181a.M().a(new com.applovin.impl.sdk.e.z(this.f1181a, zContains, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.f1181a.al().a(com.applovin.impl.sdk.network.j.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(EventServiceImpl.this.a(uVar, false)).b(EventServiceImpl.this.a(uVar, (Map<String, String>) map2)).c(uVar.b()).b(((Boolean) EventServiceImpl.this.f1181a.a(com.applovin.impl.sdk.c.b.fk)).booleanValue()).a(((Boolean) EventServiceImpl.this.f1181a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()).c(zContains).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            this.f1181a.L();
            if (y.a()) {
                this.f1181a.L().b("AppLovinEventService", "Unable to track event: " + uVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        this.f1181a.L();
        if (y.a()) {
            this.f1181a.L().b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        u uVar = new u(str, CollectionUtils.map(), this.b);
        this.f1181a.al().a(com.applovin.impl.sdk.network.j.o().c(a()).d(b()).a(a(uVar, true)).b(a(uVar, (Map<String, String>) null)).c(uVar.b()).b(((Boolean) this.f1181a.a(com.applovin.impl.sdk.c.b.fk)).booleanValue()).a(((Boolean) this.f1181a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return ((String) this.f1181a.a(com.applovin.impl.sdk.c.b.bj)) + "4.0/pix";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return ((String) this.f1181a.a(com.applovin.impl.sdk.c.b.bk)) + "4.0/pix";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(u uVar, boolean z) {
        Map<String, Object> mapA;
        boolean zContains = this.f1181a.b(com.applovin.impl.sdk.c.b.bq).contains(uVar.a());
        if (this.f1181a.S() != null) {
            mapA = this.f1181a.S().a(null, z, false);
        } else {
            mapA = this.f1181a.R().a(null, z, false);
        }
        mapA.put("event", zContains ? uVar.a() : "postinstall");
        mapA.put("event_id", uVar.d());
        mapA.put("ts", Long.toString(uVar.c()));
        if (!zContains) {
            mapA.put("sub_event", uVar.a());
        }
        return Utils.stringifyObjectMap(mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(u uVar, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        boolean zContains = this.f1181a.b(com.applovin.impl.sdk.c.b.bq).contains(uVar.a());
        map2.put("AppLovin-Event", zContains ? uVar.a() : "postinstall");
        if (!zContains) {
            map2.put("AppLovin-Sub-Event", uVar.a());
        }
        return map2;
    }

    private void c() {
        if (((Boolean) this.f1181a.a(com.applovin.impl.sdk.c.b.bs)).booleanValue()) {
            this.f1181a.a(com.applovin.impl.sdk.c.d.B, CollectionUtils.toJsonString(this.b, JsonUtils.EMPTY_JSON));
        }
    }

    public String toString() {
        return "EventService{}";
    }
}
