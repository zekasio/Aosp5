package com.tapjoy.internal;

import androidx.work.WorkRequest;
import com.tapjoy.internal.g6;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class w5 extends g6 {
    public static final Map<String, String> g = Collections.unmodifiableMap(new HashMap());
    public final g6.a b;
    public final g6.a c;
    public final g6.a d;
    public final g6.a e;
    public final g6.a f;

    public w5() {
        g6.a aVar = new g6.a(this, "BuildConfig");
        this.f1804a.add(aVar);
        this.b = aVar;
        g6.a aVar2 = new g6.a(this, "ServerFinal");
        this.f1804a.add(aVar2);
        this.c = aVar2;
        g6.a aVar3 = new g6.a(this, "AppRuntime");
        this.f1804a.add(aVar3);
        this.d = aVar3;
        aVar3.f1805a = new ConcurrentHashMap();
        g6.a aVar4 = new g6.a(this, "ConnectFlags");
        this.f1804a.add(aVar4);
        this.e = aVar4;
        g6.a aVar5 = new g6.a(this, "ServerDefault");
        this.f1804a.add(aVar5);
        this.f = aVar5;
        g6.a aVar6 = new g6.a(this, "SDKDefault");
        this.f1804a.add(aVar6);
        HashMap map = new HashMap();
        map.put("placement_request_content_retry_timeout", -1);
        map.put("placement_request_content_retry_backoff", Arrays.asList(0L, 500L, Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS), Double.valueOf(2.0d)));
        aVar6.f1805a = map;
    }

    public void a(Map map) {
        Map<String, Object> map2;
        Map<String, Object> map3;
        if (map != null) {
            map2 = (Map) map.get("final");
            map3 = (Map) map.get(CookieSpecs.DEFAULT);
        } else {
            map2 = null;
            map3 = null;
        }
        this.c.f1805a = map2;
        this.f.f1805a = map3;
        setChanged();
    }

    public void a(Hashtable<String, ?> hashtable) {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : hashtable.entrySet()) {
            String key = g.get(entry.getKey());
            if (key == null) {
                key = entry.getKey();
            }
            this.d.f1805a.remove(key);
            map.put(key, entry.getValue());
        }
        this.e.f1805a = map;
        setChanged();
    }
}
