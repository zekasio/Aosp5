package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f1265a;
    protected final Context b;
    protected final SharedPreferences c;
    private final Map<String, Object> d = CollectionUtils.map();
    private final Object e = new Object();

    public c(p pVar) {
        this.f1265a = pVar;
        Context contextY = p.y();
        this.b = contextY;
        this.c = contextY.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        b();
    }

    public <T> T a(b<T> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.e) {
            Object obj = this.d.get(bVar.a());
            if (obj == null) {
                return bVar.b();
            }
            return bVar.a(obj);
        }
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        Iterator<String> it = b(bVar).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString(it.next()));
        }
        return arrayList;
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.e) {
            this.d.put(bVar.a(), obj);
        }
    }

    public void a() {
        String strE = e();
        synchronized (this.e) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.d.get(bVar.a());
                if (obj != null) {
                    this.f1265a.a(strE + bVar.a(), obj, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public void b() {
        String strE = e();
        synchronized (this.e) {
            for (b<?> bVar : b.c()) {
                try {
                    Object objA = this.f1265a.a(strE + bVar.a(), null, bVar.b().getClass(), this.c);
                    if (objA != null) {
                        this.d.put(bVar.a(), objA);
                    }
                } catch (Exception e) {
                    y.c("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e);
                }
            }
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> bVarA = a(next, (b) null);
                        if (bVarA != null) {
                            Object objA = a(next, jSONObject, bVarA.b());
                            this.d.put(bVarA.a(), objA);
                            if (bVarA == b.fd) {
                                this.d.put(b.fe.a(), Long.valueOf(System.currentTimeMillis()));
                            } else if (bVarA == b.aw) {
                                try {
                                    CollectionUtils.setShouldUseArrayMap(b.aw.a(objA).booleanValue());
                                } catch (Throwable unused) {
                                    y.i("SettingsManager", "Failed to update \"uam\" setting for static contexts");
                                }
                            }
                        }
                    } catch (JSONException e) {
                        y.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                    } catch (Throwable th) {
                        y.c("SettingsManager", "Unable to convert setting object ", th);
                    }
                }
            }
        }
    }

    public void c() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.f1265a.a(this.c);
    }

    private String e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f1265a.B()) + ".";
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.e) {
            Iterator<b<?>> it = b.c().iterator();
            while (it.hasNext()) {
                b<T> bVar2 = (b) it.next();
                if (bVar2.a().equals(str)) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    public boolean d() {
        return this.f1265a.C().isVerboseLoggingEnabled() || ((Boolean) a(b.ah)).booleanValue();
    }
}
