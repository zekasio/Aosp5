package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static JSONObject f991a;
    private static final Object b = new Object();
    private static final Map<String, Set<String>> c = Collections.synchronizedMap(CollectionUtils.map());
    private final String d;
    private final MaxAdFormat e;
    private final Map<String, Object> i;
    private final Context j;
    private final a k;

    public interface a {
        void a(JSONArray jSONArray);
    }

    public b(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, p pVar, a aVar) {
        super("TaskCollectSignals", pVar);
        this.d = str;
        this.e = maxAdFormat;
        this.i = map;
        this.j = context;
        this.k = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (b) {
                jSONArray = JsonUtils.getJSONArray(f991a, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (c.size() > 0) {
                    b(jSONArray, f991a);
                    return;
                } else {
                    a(jSONArray, f991a);
                    return;
                }
            }
            y yVar = this.h;
            if (y.a()) {
                this.h.d(this.g, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f.b(com.applovin.impl.sdk.c.d.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (c.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        RunnableC0062b runnableC0062b = new RunnableC0062b(jSONArray.length(), this.k, this.f);
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new com.applovin.impl.mediation.a.h(this.i, jSONArray.getJSONObject(i), jSONObject, this.f), runnableC0062b);
        }
        this.f.M().a(new z(this.f, runnableC0062b), o.a.MAIN, ((Long) this.f.a(com.applovin.impl.sdk.c.a.j)).longValue());
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        Set<String> set = c.get(this.d);
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.d, (Throwable) null);
            return;
        }
        RunnableC0062b runnableC0062b = new RunnableC0062b(set.size(), this.k, this.f);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME, null))) {
                a(new com.applovin.impl.mediation.a.h(this.i, jSONObject2, jSONObject, this.f), runnableC0062b);
            }
        }
        this.f.M().a(new z(this.f, runnableC0062b), o.a.MAIN, ((Long) this.f.a(com.applovin.impl.sdk.c.a.j)).longValue());
    }

    private void a(final com.applovin.impl.mediation.a.h hVar, final g.a aVar) {
        if (hVar.af()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f.ap().collectSignal(b.this.d, b.this.e, hVar, b.this.j, aVar);
                }
            });
        } else {
            this.f.ap().collectSignal(this.d, this.e, hVar, this.j, aVar);
        }
    }

    private void a(String str, Throwable th) {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "No signals collected: " + str, th);
        }
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.c.b$b, reason: collision with other inner class name */
    private static class RunnableC0062b implements g.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f993a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection<com.applovin.impl.mediation.a.g> e;
        private final p f;
        private final y g;

        private RunnableC0062b(int i, a aVar, p pVar) {
            this.c = i;
            this.f993a = aVar;
            this.f = pVar;
            this.g = pVar.L();
            this.b = new Object();
            this.e = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.mediation.a.g.a
        public void a(com.applovin.impl.mediation.a.g gVar) {
            boolean z;
            synchronized (this.b) {
                this.e.add(gVar);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (Utils.isMainThread() && ((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fN)).booleanValue()) {
                    this.f.M().a(new z(this.f, new Runnable() { // from class: com.applovin.impl.mediation.c.b.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RunnableC0062b.this.a();
                        }
                    }), o.a.MEDIATION_MAIN);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<com.applovin.impl.mediation.a.g> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.e);
            }
            JSONArray jSONArray = new JSONArray();
            for (com.applovin.impl.mediation.a.g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.applovin.impl.mediation.a.h hVarA = gVar.a();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, hVarA.Y());
                    jSONObject.put("class", hVarA.X());
                    jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, gVar.c());
                    jSONObject.put("sdk_version", gVar.b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.e())) {
                        jSONObject2.put("error_message", gVar.e());
                    } else {
                        jSONObject2.put("signal", gVar.d());
                    }
                    jSONObject.put(TJAdUnitConstants.String.DATA, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (y.a()) {
                        this.g.b("TaskCollectSignals", "Collected signal from " + hVarA);
                    }
                } catch (JSONException e) {
                    if (y.a()) {
                        this.g.b("TaskCollectSignals", "Failed to create signal data", e);
                    }
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            a aVar = this.f993a;
            if (aVar != null) {
                aVar.a(jSONArray);
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (b) {
            f991a = jSONObject;
        }
    }

    public static void b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    c.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            y.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
        }
    }
}
