package com.tapjoy.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.tapjoy.internal.d3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g3 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1802a = new int[2];

    @Override // com.tapjoy.internal.d3
    public JSONObject a(View view) {
        if (view == null) {
            return h3.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f1802a);
        int[] iArr = this.f1802a;
        return h3.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.tapjoy.internal.d3
    public void a(View view, JSONObject jSONObject, d3.a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z || Build.VERSION.SDK_INT < 21) {
                while (i < viewGroup.getChildCount()) {
                    ((o3) aVar).a(viewGroup.getChildAt(i), this, jSONObject);
                    i++;
                }
                return;
            }
            HashMap map = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((o3) aVar).a((View) it2.next(), this, jSONObject);
                }
            }
        }
    }
}
