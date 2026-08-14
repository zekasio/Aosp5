package com.tapjoy.internal;

import android.view.View;
import com.tapjoy.internal.d3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f3 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3 f1797a;

    public f3(d3 d3Var) {
        this.f1797a = d3Var;
    }

    @Override // com.tapjoy.internal.d3
    public JSONObject a(View view) {
        return h3.a(0, 0, 0, 0);
    }

    @Override // com.tapjoy.internal.d3
    public void a(View view, JSONObject jSONObject, d3.a aVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        v2 v2Var = v2.c;
        if (v2Var != null) {
            Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(v2Var.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View viewC = ((q2) it.next()).c();
                if (viewC != null && viewC.isAttachedToWindow() && viewC.isShown()) {
                    View view2 = viewC;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewC.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fA = a.a(rootView);
                                int size = arrayList.size();
                                while (size > 0 && a.a((View) arrayList.get(size - 1)) > fA) {
                                    size--;
                                }
                                arrayList.add(size, rootView);
                            }
                        } else {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o3) aVar).a((View) it2.next(), this.f1797a, jSONObject);
        }
    }
}
