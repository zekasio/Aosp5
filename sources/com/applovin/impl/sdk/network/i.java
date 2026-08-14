package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f1391a;
    private final y b;

    i(g gVar, p pVar) {
        super("PersistentPostbackQueueSaveTaskV2", pVar);
        this.f1391a = gVar;
        this.b = pVar.L();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f1391a.a());
    }

    public List<j> a(int i) {
        ArrayList arrayList = new ArrayList();
        v vVarW = this.f.W();
        p pVar = this.f;
        if (!vVarW.b("persistent_postback_cache.json", p.y())) {
            y.i("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file does not exist.");
            return arrayList;
        }
        p pVar2 = this.f;
        String strA = vVarW.a(vVarW.a("persistent_postback_cache.json", p.y()));
        if (TextUtils.isEmpty(strA)) {
            y.i("PersistentPostbackQueueSaveTaskV2", "Postbacks queue file has no content.");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(strA).getJSONArray("pb");
            if (y.a()) {
                this.b.b("PersistentPostbackQueueSaveTaskV2", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f.a(com.applovin.impl.sdk.c.b.cY);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    j jVar = new j(jSONArray.getJSONObject(i2), this.f);
                    if (jVar.k() < num.intValue()) {
                        arrayList.add(jVar);
                    } else {
                        y.i("PersistentPostbackQueueSaveTaskV2", "Skipping deserialization because maximum attempt count exceeded for postback: " + jVar);
                    }
                } catch (Throwable th) {
                    y.c("PersistentPostbackQueueSaveTaskV2", "Unable to deserialize postback from json", th);
                }
            }
            if (y.a()) {
                this.b.b("PersistentPostbackQueueSaveTaskV2", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            y.c("PersistentPostbackQueueSaveTaskV2", "Failed to load postback queue", th2);
        }
        return arrayList;
    }

    private void a(List<j> list) {
        JSONArray jSONArray = new JSONArray();
        for (j jVar : list) {
            try {
                jSONArray.put(jVar.n());
            } catch (Throwable th) {
                y.c("PersistentPostbackQueueSaveTaskV2", "Unable to serialize postback to JSON: " + jVar, th);
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
                this.b.b("PersistentPostbackQueueSaveTaskV2", "Exported postback queue to disk.");
            }
        } catch (Throwable th2) {
            y.c("PersistentPostbackQueueSaveTaskV2", "Unable to export postbacks to disk: " + jSONArray, th2);
        }
    }
}
