package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.p3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f1809a;
    public static String[] b = {"x", "y", TJAdUnitConstants.String.WIDTH, TJAdUnitConstants.String.HEIGHT};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static float a(int i) {
        return i / c;
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put(TJAdUnitConstants.String.WIDTH, a(i3));
            jSONObject.put(TJAdUnitConstants.String.HEIGHT, a(i4));
        } catch (JSONException e) {
            a.a("Error with creating viewStateObject", (Exception) e);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f1809a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f1809a != null) {
            Point point = new Point(0, 0);
            f1809a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        try {
            jSONObject.put(TJAdUnitConstants.String.WIDTH, fA);
            jSONObject.put(TJAdUnitConstants.String.HEIGHT, fA2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            a.a("Error with setting ad session id", (Exception) e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            a.a("JSONException during JSONObject.put for name [" + str + "]", (Exception) e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L6
            if (r11 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r10 == 0) goto L98
            if (r11 != 0) goto Ld
            goto L98
        Ld:
            java.lang.String[] r2 = com.tapjoy.internal.h3.b
            int r3 = r2.length
            r4 = 0
        L11:
            if (r4 >= r3) goto L26
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L23
            goto L96
        L23:
            int r4 = r4 + 1
            goto L11
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L96
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L47
            if (r2 != 0) goto L47
            goto L67
        L47:
            boolean r5 = a(r4, r2)
            if (r5 != 0) goto L4e
            goto L96
        L4e:
            r5 = 0
        L4f:
            int r6 = r4.length()
            if (r5 >= r6) goto L67
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L64
            goto L96
        L64:
            int r5 = r5 + 1
            goto L4f
        L67:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            org.json.JSONArray r11 = r11.optJSONArray(r2)
            if (r10 != 0) goto L76
            if (r11 != 0) goto L76
            goto L97
        L76:
            boolean r2 = a(r10, r11)
            if (r2 != 0) goto L7d
            goto L96
        L7d:
            r2 = 0
        L7e:
            int r3 = r10.length()
            if (r2 >= r3) goto L97
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            boolean r3 = b(r3, r4)
            if (r3 != 0) goto L93
            goto L96
        L93:
            int r2 = r2 + 1
            goto L7e
        L96:
            r0 = 0
        L97:
            return r0
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.h3.b(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static void a(JSONObject jSONObject, p3.a aVar) {
        x2 x2Var = aVar.f1881a;
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", x2Var.b);
            jSONObject.put("friendlyObstructionPurpose", x2Var.c);
            jSONObject.put("friendlyObstructionReason", x2Var.d);
        } catch (JSONException e) {
            a.a("Error with setting friendly obstruction", (Exception) e);
        }
    }
}
