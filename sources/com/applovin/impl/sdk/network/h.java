package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1390a = TimeUnit.SECONDS.toMillis(5);
    private final AtomicLong b;
    private final f c;
    private final y d;

    h(f fVar, p pVar) {
        super("PersistentPostbackQueueSaveTask", pVar);
        this.b = new AtomicLong();
        this.d = pVar.L();
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.c.a() > this.b.get()) {
            a(this.c.b());
        }
        a();
    }

    void a() {
        this.b.set(System.currentTimeMillis());
        this.f.M().a(this, o.a.POSTBACKS, f1390a);
    }

    ArrayList<j> a(int i) {
        ArrayList<j> arrayList = new ArrayList<>();
        try {
            v vVarW = this.f.W();
            p pVar = this.f;
            if (vVarW.b("persistent_postback_cache.json", p.y())) {
                p pVar2 = this.f;
                String strA = vVarW.a(vVarW.a("persistent_postback_cache.json", p.y()));
                if (StringUtils.isValidString(strA)) {
                    JSONArray jSONArray = new JSONObject(strA).getJSONArray("pb");
                    if (y.a()) {
                        this.d.b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int iIntValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.cY)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        try {
                            j jVar = new j(jSONArray.getJSONObject(i2), this.f);
                            if (jVar.k() < iIntValue) {
                                arrayList.add(jVar);
                            } else if (y.a()) {
                                this.d.b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                            }
                        } catch (Throwable th) {
                            if (y.a()) {
                                this.d.b("PersistentPostbackQueueSaveTask", "Unable to deserialize postback request from json", th);
                            }
                        }
                    }
                    if (y.a()) {
                        this.d.b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.d.b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th2);
            }
        }
        return arrayList;
    }

    private void a(List<j> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().n());
            } catch (Throwable th) {
                if (y.a()) {
                    this.d.b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            v vVarW = this.f.W();
            p pVar = this.f;
            vVarW.a(byteArrayInputStream, vVarW.a("persistent_postback_cache.json", p.y()));
            if (y.a()) {
                this.d.b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (y.a()) {
                this.d.b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }
}
