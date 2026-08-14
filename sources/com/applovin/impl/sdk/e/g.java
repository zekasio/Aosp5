package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.l f1288a;
    private final AppLovinPostbackListener b;
    private final o.a c;

    public g(com.applovin.impl.sdk.network.l lVar, o.a aVar, com.applovin.impl.sdk.p pVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", pVar);
        if (lVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f1288a = lVar;
        this.b = appLovinPostbackListener;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f1288a.a())) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.c(this.g, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.b;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f1288a.a(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.f1288a.r()) {
            AppLovinPostbackListener appLovinPostbackListener2 = new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    if (g.this.b != null) {
                        g.this.b.onPostbackSuccess(g.this.f1288a.a());
                    }
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i) {
                    g.this.a();
                }
            };
            if (((Boolean) d().a(com.applovin.impl.sdk.c.b.fQ)).booleanValue()) {
                d().aa().a(this.f1288a, appLovinPostbackListener2);
                return;
            } else {
                com.applovin.impl.adview.d.a(this.f1288a, d(), appLovinPostbackListener2);
                return;
            }
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        u<Object> uVar = new u<Object>(this.f1288a, d()) { // from class: com.applovin.impl.sdk.e.g.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final String f1290a;

            {
                this.f1290a = g.this.f1288a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String str : this.f.b(com.applovin.impl.sdk.c.b.bc)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
                                    com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
                                    com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
                                    break;
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                }
                if (g.this.b != null) {
                    g.this.b.onPostbackSuccess(this.f1290a);
                }
                if (g.this.f1288a.p()) {
                    this.f.ab().a(g.this.f1288a.q(), this.f1290a, i, obj, null, true);
                }
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, Object obj) {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Failed to dispatch postback. Error code: " + i + " URL: " + this.f1290a);
                }
                if (g.this.b != null) {
                    g.this.b.onPostbackFailure(this.f1290a, i);
                }
                if (g.this.f1288a.p()) {
                    this.f.ab().a(g.this.f1288a.q(), this.f1290a, i, obj, str, false);
                }
            }
        };
        uVar.a(this.c);
        d().M().a((a) uVar);
    }
}
