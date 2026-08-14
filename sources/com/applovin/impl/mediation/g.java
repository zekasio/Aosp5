package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1109a;
    private final y b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final JSONArray d = new JSONArray();
    private final LinkedHashMap<String, Integer> e = new LinkedHashMap<>();
    private final Object f = new Object();
    private List<com.applovin.impl.mediation.a.f> g;

    public g(p pVar) {
        this.f1109a = pVar;
        this.b = pVar.L();
    }

    public boolean a() {
        return this.c.get();
    }

    public void a(Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            String str = (String) this.f1109a.a(com.applovin.impl.sdk.c.d.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<com.applovin.impl.mediation.a.f> listA = a(JsonUtils.getJSONArray(jSONObject, this.f1109a.av().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.g = listA;
                    this.f1109a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.a(listA, activity, this.f1109a));
                } catch (JSONException e) {
                    if (y.a()) {
                        this.b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity) {
        a(fVar, activity, null);
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity, Runnable runnable) {
        List<com.applovin.impl.mediation.a.f> list;
        if (this.f1109a.av().a() && (list = this.g) != null) {
            Iterator<com.applovin.impl.mediation.a.f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                com.applovin.impl.mediation.a.f next = it.next();
                if (next.X().equals(fVar.X())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        i iVarA = this.f1109a.an().a(fVar);
        if (iVarA == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (y.a()) {
                this.b.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
            }
            iVarA.a(MaxAdapterParametersImpl.a(fVar), activity, runnable);
        }
    }

    public LinkedHashMap<String, Integer> b() {
        LinkedHashMap<String, Integer> linkedHashMap;
        synchronized (this.f) {
            linkedHashMap = this.e;
        }
        return linkedHashMap;
    }

    public JSONArray c() {
        JSONArray jSONArray;
        synchronized (this.f) {
            jSONArray = this.d;
        }
        return jSONArray;
    }

    void a(com.applovin.impl.mediation.a.f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zA;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f) {
            zA = a(fVar);
            if (!zA) {
                this.e.put(fVar.X(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", fVar.X());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.d.put(jSONObject);
            }
        }
        if (zA) {
            return;
        }
        this.f1109a.a(fVar);
        this.f1109a.ap().processAdapterInitializationPostback(fVar, j, initializationStatus, str);
        this.f1109a.ab().a(initializationStatus, fVar.X());
    }

    boolean a(com.applovin.impl.mediation.a.f fVar) {
        boolean zContainsKey;
        synchronized (this.f) {
            zContainsKey = this.e.containsKey(fVar.X());
        }
        return zContainsKey;
    }

    private List<com.applovin.impl.mediation.a.f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new com.applovin.impl.mediation.a.f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f1109a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f) {
            this.e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f1109a.ab().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
