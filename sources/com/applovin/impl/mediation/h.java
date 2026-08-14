package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private final p b;
    private final y c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, i> f1110a = Collections.synchronizedMap(CollectionUtils.map(16));
    private final Object d = new Object();
    private final Map<String, Class<? extends MaxAdapter>> e = CollectionUtils.map();
    private final Set<String> f = new HashSet();
    private final Object g = new Object();
    private final Set<a> h = new HashSet();

    public h(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = pVar;
        this.c = pVar.L();
    }

    public Collection<String> a() {
        Set setUnmodifiableSet;
        synchronized (this.d) {
            HashSet hashSet = new HashSet(this.e.size());
            Iterator<Class<? extends MaxAdapter>> it = this.e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    public Collection<String> b() {
        Set setUnmodifiableSet;
        synchronized (this.d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f);
        }
        return setUnmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new ArrayList(this.h.size());
            Iterator<a> it = this.h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    i a(com.applovin.impl.mediation.a.f fVar) {
        return a(fVar, false);
    }

    i a(com.applovin.impl.mediation.a.f fVar, boolean z) {
        Class<? extends MaxAdapter> clsA;
        i iVar;
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter spec specified");
        }
        String strY = fVar.Y();
        String strX = fVar.X();
        if (TextUtils.isEmpty(strY)) {
            if (y.a()) {
                this.c.e("MediationAdapterManager", "No adapter name provided for " + strX + ", not loading the adapter ");
            }
            return null;
        }
        if (TextUtils.isEmpty(strX)) {
            if (y.a()) {
                this.c.e("MediationAdapterManager", "Unable to find default className for '" + strY + "'");
            }
            return null;
        }
        if (z && (iVar = this.f1110a.get(strX)) != null) {
            return iVar;
        }
        synchronized (this.d) {
            if (!this.f.contains(strX)) {
                if (this.e.containsKey(strX)) {
                    clsA = this.e.get(strX);
                } else {
                    clsA = a(strX);
                    if (clsA == null) {
                        this.f.add(strX);
                        return null;
                    }
                }
                i iVarA = a(fVar, clsA, z);
                if (iVarA != null) {
                    if (y.a()) {
                        this.c.b("MediationAdapterManager", "Loaded " + strY);
                    }
                    this.e.put(strX, clsA);
                    if (z) {
                        this.f1110a.put(fVar.X(), iVarA);
                    }
                    return iVarA;
                }
                if (y.a()) {
                    this.c.e("MediationAdapterManager", "Failed to load " + strY);
                }
                this.f.add(strX);
                return null;
            }
            if (y.a()) {
                this.c.b("MediationAdapterManager", "Not attempting to load " + strY + " due to prior errors");
            }
            return null;
        }
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.g) {
            this.b.L();
            if (y.a()) {
                this.b.L().e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.h.add(new a(str, str2, aVar, this.b));
        }
    }

    private i a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls, boolean z) {
        try {
            return new i(fVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.b.K()), z, this.b);
        } catch (Throwable th) {
            y.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            y.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1111a;
        private final String b;
        private final MaxAdFormat c;
        private final JSONObject d;

        a(String str, String str2, com.applovin.impl.mediation.a.a aVar, p pVar) {
            this.f1111a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (aVar != null) {
                this.c = aVar.getFormat();
                JsonUtils.putString(jSONObject, "format", aVar.getFormat().getLabel());
            } else {
                this.c = null;
            }
        }

        JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f1111a.equals(aVar.f1111a) || !this.b.equals(aVar.b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.c;
            MaxAdFormat maxAdFormat2 = aVar.c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f1111a.hashCode() * 31) + this.b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f1111a + "', operationTag='" + this.b + "', format=" + this.c + '}';
        }
    }
}
