package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public class g6 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f1804a = new ArrayList();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Map<String, Object> f1805a;

        public a(g6 g6Var, String str) {
        }

        public Object a(String str) {
            Map<String, Object> map = this.f1805a;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    public boolean a(String str, boolean z) {
        Iterator<a> it = this.f1804a.iterator();
        while (it.hasNext()) {
            Object objA = it.next().a(str);
            if (objA != null) {
                if (objA instanceof Boolean) {
                    return ((Boolean) objA).booleanValue();
                }
                if (!(objA instanceof String)) {
                    continue;
                } else {
                    if ("true".equals(objA)) {
                        return true;
                    }
                    if (TJAdUnitConstants.String.FALSE.equals(objA)) {
                        return false;
                    }
                }
            }
        }
        return z;
    }

    @Override // java.util.Observable
    public void setChanged() {
        super.setChanged();
        notifyObservers();
    }

    public static long a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        throw new IllegalArgumentException();
    }
}
