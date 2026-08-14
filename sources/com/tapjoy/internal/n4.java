package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import com.vungle.warren.model.Advertisement;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n4 {
    public static String f = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TJAdUnitJSBridge f1862a;
    public e2 b;
    public f2 c;
    public o2 d;
    public s2 e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1863a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;

        public a(String str, boolean z, JSONObject jSONObject, String str2) {
            this.f1863a = str;
            this.b = z;
            this.c = jSONObject;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_LOADED)) {
                    if (this.b) {
                        float f = Float.parseFloat(this.c.optString(TJAdUnitConstants.String.VIDEO_SKIPOFFSET, "0.0"));
                        e2 e2Var = n4.this.b;
                        t2 t2Var = t2.STANDALONE;
                        com.tapjoy.internal.a.a((Object) t2Var, "Position is null");
                        e2Var.a(new u2(true, Float.valueOf(f), true, t2Var));
                    } else {
                        e2 e2Var2 = n4.this.b;
                        t2 t2Var2 = t2.STANDALONE;
                        com.tapjoy.internal.a.a((Object) t2Var2, "Position is null");
                        e2Var2.a(new u2(false, null, false, t2Var2));
                    }
                } else if (this.f1863a.equals("impression")) {
                    n4.this.b.a();
                } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_BUFFER_START)) {
                    s2 s2Var = n4.this.e;
                    com.tapjoy.internal.a.b(s2Var.f1902a);
                    s2Var.f1902a.e.a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
                } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_BUFFER_END)) {
                    s2 s2Var2 = n4.this.e;
                    com.tapjoy.internal.a.b(s2Var2.f1902a);
                    s2Var2.f1902a.e.a("bufferFinish");
                } else {
                    float f2 = 0.0f;
                    if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_START)) {
                        if (!n4.this.f1862a.a().isMuted()) {
                            f2 = 1.0f;
                        }
                        n4.this.e.a(n4.this.f1862a.a().getVideoView().getDuration(), f2);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE)) {
                        s2 s2Var3 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var3.f1902a);
                        s2Var3.f1902a.e.a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_MIDPOINT)) {
                        s2 s2Var4 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var4.f1902a);
                        s2Var4.f1902a.e.a(TJAdUnitConstants.String.VIDEO_MIDPOINT);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE)) {
                        s2 s2Var5 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var5.f1902a);
                        s2Var5.f1902a.e.a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_PAUSED)) {
                        s2 s2Var6 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var6.f1902a);
                        s2Var6.f1902a.e.a("pause");
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_PLAYING)) {
                        s2 s2Var7 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var7.f1902a);
                        s2Var7.f1902a.e.a("resume");
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_SKIPPED)) {
                        s2 s2Var8 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var8.f1902a);
                        s2Var8.f1902a.e.a(TJAdUnitConstants.String.VIDEO_SKIPPED);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VOLUME_CHANGED)) {
                        if (!n4.this.f1862a.a().isMuted()) {
                            f2 = 1.0f;
                        }
                        s2 s2Var9 = n4.this.e;
                        s2Var9.a(f2);
                        com.tapjoy.internal.a.b(s2Var9.f1902a);
                        JSONObject jSONObject = new JSONObject();
                        h3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                        h3.a(jSONObject, "deviceVolume", Float.valueOf(b3.c().f1759a));
                        s2Var9.f1902a.e.a("volumeChange", jSONObject);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.AD_USER_INTERACTION)) {
                        n4.this.e.a(r2.CLICK);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.VIDEO_COMPLETE)) {
                        s2 s2Var10 = n4.this.e;
                        com.tapjoy.internal.a.b(s2Var10.f1902a);
                        s2Var10.f1902a.e.a(TJAdUnitConstants.String.VIDEO_COMPLETE);
                    } else if (this.f1863a.equals(TJAdUnitConstants.String.SESSION_ERROR)) {
                        try {
                            if (this.c.getString("errorType").equals(Advertisement.KEY_VIDEO)) {
                                n4.this.c.a(k2.VIDEO, this.c.getString(TJAdUnitConstants.String.MESSAGE));
                            } else {
                                n4.this.c.a(k2.GENERIC, this.c.getString(TJAdUnitConstants.String.MESSAGE));
                            }
                            TapjoyLog.d("TJOMViewabilityAgent", "Session Error: " + this.c.getString("errorType") + ", " + this.c.getString(TJAdUnitConstants.String.MESSAGE));
                        } catch (JSONException e) {
                            TapjoyLog.d("TJOMViewabilityAgent", "Failed to getting session error information: " + e.getMessage());
                        }
                    } else {
                        if (!this.f1863a.equals(TJAdUnitConstants.String.SESSION_FINISH)) {
                            TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent: event name '" + this.f1863a + "' not found");
                            n4.this.f1862a.invokeJSCallback(this.d, false);
                            return;
                        }
                        n4.this.c.a();
                        n4.this.c = null;
                    }
                }
                StringBuilder sbA = w1.a("triggerEvent: event name '");
                sbA.append(this.f1863a);
                sbA.append("'");
                TapjoyLog.d("TJOMViewabilityAgent", sbA.toString());
                n4.this.f1862a.invokeJSCallback(this.d, true);
            } catch (Exception e2) {
                StringBuilder sbA2 = w1.a("triggerEvent exception:");
                sbA2.append(e2.getMessage());
                TapjoyLog.d("TJOMViewabilityAgent", sbA2.toString());
                n4.this.f1862a.invokeJSCallback(this.d, false);
            }
        }
    }

    public n4(TJAdUnitJSBridge tJAdUnitJSBridge) {
        com.tapjoy.internal.a.a("Tapjoy", "Name is null or empty");
        com.tapjoy.internal.a.a("13.0.1", "Version is null or empty");
        this.d = new o2("Tapjoy", "13.0.1");
        this.f1862a = tJAdUnitJSBridge;
    }

    public void a(String str) {
        if (x1.f1939a.b()) {
            this.f1862a.invokeJSCallback(str, true);
            TapjoyUtil.runOnMainThread(new m4(this));
        } else {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not start -- TJOMViewabilityAgent is not initialized");
            this.f1862a.invokeJSCallback(str, false);
        }
    }

    public void a(JSONObject jSONObject, String str) {
        if (!x1.f1939a.b()) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not triggerEvent -- TJOMViewabilityAgent is not initialized");
            this.f1862a.invokeJSCallback(str, false);
        } else {
            if (jSONObject == null) {
                TapjoyLog.d("TJOMViewabilityAgent", "Can not triggerEvent -- json parameter is null");
                this.f1862a.invokeJSCallback(str, false);
                return;
            }
            String strOptString = jSONObject.optString("eventName", null);
            if (strOptString == null) {
                TapjoyLog.d("TJOMViewabilityAgent", "triggerEvent: params json did not contain 'eventName'");
                this.f1862a.invokeJSCallback(str, false);
            } else {
                TapjoyUtil.runOnMainThread(new a(strOptString, jSONObject.optBoolean(TJAdUnitConstants.String.VIDEO_SKIPPABLE, false), jSONObject, str));
            }
        }
    }

    public final List<p2> a(JSONArray jSONArray) {
        p2 p2Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString(TJAdUnitConstants.String.VENDOR_JS_URL, null);
                if (strOptString == null) {
                    TapjoyLog.d("TJOMViewabilityAgent", "Vendor JS URL not found. Skipping.");
                } else {
                    try {
                        URL url = new URL(strOptString);
                        String strOptString2 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_NAME, null);
                        String strOptString3 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_PARAMETERS, null);
                        if (strOptString3 != null && strOptString2 != null) {
                            com.tapjoy.internal.a.a(strOptString2, "VendorKey is null or empty");
                            com.tapjoy.internal.a.a((Object) url, "ResourceURL is null");
                            com.tapjoy.internal.a.a(strOptString3, "VerificationParameters is null or empty");
                            p2Var = new p2(strOptString2, url, strOptString3);
                        } else {
                            com.tapjoy.internal.a.a((Object) url, "ResourceURL is null");
                            p2Var = new p2(null, url, null);
                        }
                        arrayList.add(p2Var);
                    } catch (Exception unused) {
                        TapjoyLog.d("TJOMViewabilityAgent", "Malformed vendor JS URL. Skipping " + strOptString);
                    }
                }
            } catch (JSONException unused2) {
                TapjoyLog.d("TJOMViewabilityAgent", "Malformed vendor object. Skipping.");
            }
        }
        return arrayList;
    }
}
