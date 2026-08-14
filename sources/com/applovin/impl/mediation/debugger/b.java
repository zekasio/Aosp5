package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.c.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements b.c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<MaxDebuggerActivity> f1020a;
    private static final AtomicBoolean b = new AtomicBoolean();
    private final p c;
    private final y d;
    private final Context e;
    private final com.applovin.impl.mediation.debugger.ui.b.b f;
    private boolean i;
    private boolean k;
    private Map<String, List<?>> l;
    private final a m;
    private final Map<String, com.applovin.impl.mediation.debugger.b.c.b> g = CollectionUtils.map();
    private final AtomicBoolean h = new AtomicBoolean();
    private int j = 2;

    public b(p pVar) {
        this.c = pVar;
        this.d = pVar.L();
        Context contextY = p.y();
        this.e = contextY;
        com.applovin.impl.mediation.debugger.ui.b.b bVar = new com.applovin.impl.mediation.debugger.ui.b.b(contextY);
        this.f = bVar;
        this.m = new a(pVar, bVar);
    }

    public void a() {
        if (this.h.compareAndSet(false, true)) {
            this.c.M().a(new c(this, this.c), o.a.MEDIATION_MAIN);
        }
    }

    public boolean b() {
        return this.i;
    }

    public void a(boolean z, int i) {
        this.i = z;
        this.j = i;
    }

    public void c() {
        a((Map<String, List<?>>) null);
    }

    public void a(Map<String, List<?>> map) {
        this.l = map;
        a();
        if (!g() && b.compareAndSet(false, true)) {
            if (!this.k) {
                f();
                this.k = true;
            }
            Intent intent = new Intent(this.e, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            y.f("AppLovinSdk", "Starting mediation debugger...");
            this.e.startActivity(intent);
            return;
        }
        y.i("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List<?> a(String str) {
        Map<String, List<?>> map = this.l;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.l.get(str);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f + "}";
    }

    private void f() {
        this.c.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.b.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Started mediation debugger");
                    if (!b.this.g() || b.f1020a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = b.f1020a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(b.this.f, b.this.c.w());
                    }
                    b.b.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    y.f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = b.f1020a = null;
                }
            }
        });
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (bVar.e() && bVar.a() == b.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Activity activityX = b.this.c.x();
                        if (activityX == null || activityX.isFinishing()) {
                            y.i("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
                        } else {
                            new AlertDialog.Builder(activityX).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.b.2.1
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    b.this.c();
                                }
                            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        WeakReference<MaxDebuggerActivity> weakReference = f1020a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private List<com.applovin.impl.mediation.debugger.b.c.b> a(JSONObject jSONObject, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = new com.applovin.impl.mediation.debugger.b.c.b(jSONObject2, pVar);
                arrayList.add(bVar);
                this.g.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.b.c.b> list, p pVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.a.a(jSONObject2, this.g, pVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(List<com.applovin.impl.mediation.debugger.b.a.a> list, p pVar) {
        List<String> initializationAdUnitIds = pVar.C().getInitializationAdUnitIds();
        if (initializationAdUnitIds == null || initializationAdUnitIds.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(initializationAdUnitIds.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            if (initializationAdUnitIds.contains(aVar.a())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private com.applovin.impl.mediation.debugger.b.b.b a(JSONObject jSONObject) {
        return new com.applovin.impl.mediation.debugger.b.b.b(JsonUtils.getString(jSONObject, "required_app_ads_txt_entry", ""));
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(JSONObject jSONObject, int i) {
        List<com.applovin.impl.mediation.debugger.b.c.b> listA = a(jSONObject, this.c);
        List<com.applovin.impl.mediation.debugger.b.a.a> listA2 = a(jSONObject, listA, this.c);
        List<com.applovin.impl.mediation.debugger.b.a.a> listA3 = a(listA2, this.c);
        com.applovin.impl.mediation.debugger.b.b.b bVarA = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f.a(listA, listA2, listA3, bVarA, JsonUtils.getString(jSONObject2, TJAdUnitConstants.String.TITLE, null), JsonUtils.getString(jSONObject2, TJAdUnitConstants.String.MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), this.c);
        if (bVarA.g()) {
            this.m.a();
        }
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.c();
                }
            }, TimeUnit.SECONDS.toMillis(this.j));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(int i, String str, JSONObject jSONObject) {
        if (y.a()) {
            this.d.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        y.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f.a(null, null, null, null, null, null, null, this.c);
        this.h.set(false);
    }
}
