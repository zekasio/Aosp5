package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinAdLoadListener f1311a;
    private final a b;

    r(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessVastResponse", pVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f1311a = appLovinAdLoadListener;
        this.b = (a) eVar;
    }

    public static r a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, pVar), appLovinAdLoadListener, pVar);
    }

    public static r a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, pVar), appLovinAdLoadListener, pVar);
    }

    public static r a(com.applovin.impl.sdk.utils.t tVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        return new d(tVar, eVar, appLovinAdLoadListener, pVar);
    }

    protected com.applovin.impl.sdk.utils.t a(String str) {
        try {
            return com.applovin.impl.sdk.utils.u.a(str, this.f);
        } catch (Throwable th) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Failed to process VAST response", th);
            }
            a(com.applovin.impl.c.f.XML_PARSING);
            return null;
        }
    }

    void a(com.applovin.impl.sdk.utils.t tVar) {
        int iA = this.b.a();
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Finished parsing XML at depth " + iA);
        }
        this.b.a(tVar);
        if (com.applovin.impl.c.m.a(tVar)) {
            int iIntValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.eK)).intValue();
            if (iA < iIntValue) {
                com.applovin.impl.sdk.y yVar2 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "VAST response is wrapper. Resolving...");
                }
                this.f.M().a((com.applovin.impl.sdk.e.a) new x(this.b, this.f1311a, this.f));
                return;
            }
            com.applovin.impl.sdk.y yVar3 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.e(this.g, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(com.applovin.impl.c.f.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (com.applovin.impl.c.m.b(tVar)) {
            com.applovin.impl.sdk.y yVar4 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "VAST response is inline. Rendering ad...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new t(this.b, this.f1311a, this.f));
            return;
        }
        com.applovin.impl.sdk.y yVar5 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "VAST response is an error");
        }
        a(com.applovin.impl.c.f.NO_WRAPPER_RESPONSE);
    }

    void a(com.applovin.impl.c.f fVar) {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Failed to process VAST response due to VAST error code " + fVar);
        }
        com.applovin.impl.c.m.a(this.b, this.f1311a, fVar, -6, this.f);
    }

    private static final class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f1313a;

        c(com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            this.f1313a = eVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f1313a, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f.a(com.applovin.impl.sdk.c.b.eJ)).intValue()) {
                    a(a(string));
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "VAST response is over max length");
                }
                a(com.applovin.impl.c.f.XML_PARSING);
                return;
            }
            com.applovin.impl.sdk.y yVar3 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.e(this.g, "No VAST response received.");
            }
            a(com.applovin.impl.c.f.NO_WRAPPER_RESPONSE);
        }
    }

    private static final class b extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1312a;

        b(String str, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            this.f1312a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a(a(this.f1312a));
        }
    }

    private static final class d extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.utils.t f1314a;

        d(com.applovin.impl.sdk.utils.t tVar, com.applovin.impl.c.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
            super(eVar, appLovinAdLoadListener, pVar);
            if (tVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f1314a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Processing VAST Wrapper response...");
            }
            a(this.f1314a);
        }
    }

    private static final class a extends com.applovin.impl.c.e {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.p pVar) {
            super(jSONObject, jSONObject2, bVar, pVar);
        }

        void a(com.applovin.impl.sdk.utils.t tVar) {
            if (tVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f906a.add(tVar);
        }
    }
}
