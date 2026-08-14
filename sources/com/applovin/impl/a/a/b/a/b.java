package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f717a;
    private List<com.applovin.impl.a.a.a.a> b;
    private final AtomicBoolean d;
    private List<com.applovin.impl.mediation.debugger.ui.d.c> e;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.d = new AtomicBoolean();
        this.e = new ArrayList();
    }

    public void a() {
        this.d.compareAndSet(true, false);
    }

    public boolean b() {
        return this.e.size() == 0;
    }

    public p c() {
        return this.f717a;
    }

    public List<com.applovin.impl.a.a.a.a> d() {
        return this.b;
    }

    public void a(List<com.applovin.impl.a.a.a.a> list, p pVar) {
        Activity activityX;
        this.f717a = pVar;
        this.b = list;
        if (!(this.c instanceof Activity) && (activityX = pVar.x()) != null) {
            this.c = activityX;
        }
        if (list != null && this.d.compareAndSet(false, true)) {
            this.e = a(this.b);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.b.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int e() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        return this.e.size();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
        return new e("RECENT ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
        return this.e;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.a.a.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.a.a.a.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.a.a.b.a.a.a(it.next(), this.c));
        }
        return arrayList;
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.d.get() + "}";
    }
}
