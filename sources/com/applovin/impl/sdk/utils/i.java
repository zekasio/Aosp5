package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.y;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1454a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 12, 10, 3, 9, 8, 14};
    private static final int[] c = {15, 13};
    private static final int[] d = {20};

    public static String a(String str, com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bh), str, pVar);
    }

    public static String b(String str, com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bi), str, pVar);
    }

    public static Map<String, String> e(com.applovin.impl.sdk.p pVar) {
        Map<String, String> map = CollectionUtils.map();
        String str = (String) pVar.a(com.applovin.impl.sdk.c.b.af);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            map.put("api_key", pVar.B());
        }
        if (pVar.S() != null) {
            map.putAll(Utils.stringifyObjectMap(pVar.S().e()));
        } else {
            map.putAll(Utils.stringifyObjectMap(pVar.R().i()));
        }
        return map;
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(JSONObject jSONObject, boolean z, com.applovin.impl.sdk.p pVar) {
        pVar.ab().a(jSONObject, z);
    }

    public static void a(int i, com.applovin.impl.sdk.p pVar) {
        if (i == 401) {
            y.i("AppLovinSdk", "SDK key \"" + pVar.B() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            pVar.N().a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.ac, (Object) true);
            pVar.N().a();
        } else if (i >= 400 && i < 500) {
            if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
                pVar.l();
            }
        } else if (i == -1 && ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ae)).booleanValue()) {
            pVar.l();
        }
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.p pVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        return str + str2;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            pVar.a(com.applovin.impl.sdk.c.d.H, string);
            pVar.L();
            if (y.a()) {
                pVar.L().c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.c.c cVarN = pVar.N();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                cVarN.a(jSONObject.getJSONObject("settings"));
                cVarN.a();
            }
        } catch (JSONException e) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("ConnectionUtils", "Unable to parse settings out of API response", e);
            }
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.p.y()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.sdk.c.e.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            pVar.J().updateVariables(jSONObject2);
        }
    }

    public static String a(InputStream inputStream, com.applovin.impl.sdk.p pVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) pVar.a(com.applovin.impl.sdk.c.b.dn)).intValue()];
        while (true) {
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toString("UTF-8");
            }
        }
    }

    public static String f(com.applovin.impl.sdk.p pVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.p.y());
        if (networkInfoB == null) {
            return "unknown";
        }
        int type = networkInfoB.getType();
        int subtype = networkInfoB.getSubtype();
        if (type == 1) {
            return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        if (type != 0) {
            return "unknown";
        }
        if (a(subtype, f1454a)) {
            return "2g";
        }
        if (a(subtype, b)) {
            return "3g";
        }
        if (a(subtype, c)) {
            return "4g";
        }
        if (a(subtype, d)) {
            return "5g";
        }
        return TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
    }

    public static int g(com.applovin.impl.sdk.p pVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.p.y());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f1454a)) {
                    return 4;
                }
                if (a(subtype, b)) {
                    return 5;
                }
                if (a(subtype, c)) {
                    return 6;
                }
                return a(subtype, d) ? 7 : 3;
            }
        }
        return 0;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static String h(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bf), ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dv)).booleanValue() ? "5.0/ad" : "4.0/ad", pVar);
    }

    public static String i(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bg), ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dv)).booleanValue() ? "5.0/ad" : "4.0/ad", pVar);
    }

    public static String j(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bf), "4.0/ad", pVar);
    }

    public static String k(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bg), "4.0/ad", pVar);
    }

    public static String l(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bl), "1.0/variable_config", pVar);
    }

    public static String m(com.applovin.impl.sdk.p pVar) {
        return a((String) pVar.a(com.applovin.impl.sdk.c.b.bm), "1.0/variable_config", pVar);
    }

    public static boolean a() {
        return a((String) null);
    }

    public static boolean a(String str) {
        if (!h.e()) {
            return true;
        }
        if (h.f() && !TextUtils.isEmpty(str)) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }
}
