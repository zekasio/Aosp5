package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyLog;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1842a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n4 c;

    public l4(n4 n4Var, JSONObject jSONObject, String str) {
        this.c = n4Var;
        this.f1842a = jSONObject;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!x1.f1939a.f1767a) {
                x1.f1939a.a(this.c.f1862a.a().getWebView().getContext().getApplicationContext());
            }
            if (!x1.f1939a.f1767a) {
                TapjoyLog.d("TJOMViewabilityAgent", "Failed to initialize");
                this.c.f1862a.invokeJSCallback(this.b, false);
                return;
            }
            TapjoyLog.d("TJOMViewabilityAgent", "initialized");
            List<p2> listA = this.c.a(this.f1842a.optJSONArray(TJAdUnitConstants.String.VENDORS));
            o2 o2Var = this.c.d;
            String str = n4.f;
            a.a((Object) o2Var, "Partner is null");
            a.a((Object) str, "OM SDK JS script content is null");
            a.a((Object) listA, "VerificationScriptResources is null");
            h2 h2Var = new h2(o2Var, null, str, listA, "", "", i2.NATIVE);
            g2 g2VarA = g2.a(j2.VIDEO, m2.BEGIN_TO_RENDER, n2.NATIVE, n2.NATIVE, false);
            n4 n4Var = this.c;
            if (!x1.f1939a.f1767a) {
                throw new IllegalStateException("Method called before OM SDK activation");
            }
            a.a((Object) g2VarA, "AdSessionConfiguration is null");
            a.a((Object) h2Var, "AdSessionContext is null");
            n4Var.c = new q2(g2VarA, h2Var);
            this.c.c.a(this.c.f1862a.a().getWebView());
            n4 n4Var2 = this.c;
            n4Var2.e = s2.a(n4Var2.c);
            n4 n4Var3 = this.c;
            f2 f2Var = n4Var3.c;
            q2 q2Var = (q2) f2Var;
            a.a((Object) f2Var, "AdSession is null");
            if (q2Var.e.b != null) {
                throw new IllegalStateException("AdEvents already exists for AdSession");
            }
            a.a(q2Var);
            e2 e2Var = new e2(q2Var);
            q2Var.e.b = e2Var;
            n4Var3.b = e2Var;
            this.c.f1862a.invokeJSCallback(this.b, true);
        } catch (Exception e) {
            StringBuilder sbA = w1.a("Failed to init with exception: ");
            sbA.append(e.getMessage());
            TapjoyLog.d("TJOMViewabilityAgent", sbA.toString());
            this.c.f1862a.invokeJSCallback(this.b, false);
        }
    }
}
