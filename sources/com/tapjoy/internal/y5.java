package com.tapjoy.internal;

import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class y5 {
    public static String c;
    public static Map<String, String> d;
    public static boolean e;
    public static Map<String, Object> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1949a = UUID.randomUUID().toString();
    public final TapjoyURLConnection b = new TapjoyURLConnection();

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1950a;
        public final /* synthetic */ Map b;

        public a(String str, Map map) {
            this.f1950a = str;
            this.b = map;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            StringBuilder sbA = w1.a("Beacon_id = ");
            sbA.append(y5.this.f1949a);
            TapjoyLog.i("Tapjoy", sbA.toString());
            TapjoyURLConnection tapjoyURLConnection = y5.this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(y5.c);
            sb.append("/");
            String str = (String) y5.f.get(this.f1950a);
            if (str == null) {
                str = "";
            }
            sb.append(str);
            tapjoyURLConnection.getResponseFromURL(sb.toString(), (Map<String, String>) null, (Map<String, String>) null, this.b);
        }
    }

    public static void a(Map<String, String> map, Map<String, Object> map2) {
        String str = (String) map2.get("url");
        if (str == null) {
            str = "";
        }
        c = str;
        e = true;
        d = map;
        f = map2;
    }

    public void a(String str, Map<String, String> map) {
        Map<String, Object> map2 = f;
        if (map2 == null || map2.get(str) == null) {
            return;
        }
        HashMap map3 = new HashMap(d);
        map3.put("sdk_beacon_id", this.f1949a);
        if (map != null) {
            map3.putAll(map);
        }
        new a(str, map3).start();
    }
}
