package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1226a;
    private final String b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");

        private final String d;

        a(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.d;
        }
    }

    public c(String str, p pVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = str;
        this.f1226a = pVar;
    }

    public String a() {
        return this.b;
    }

    public a b() {
        if (a(com.applovin.impl.sdk.c.b.bo) != null) {
            return a.REGULAR;
        }
        if (a(com.applovin.impl.sdk.c.b.bp) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String c() {
        String strA = a(com.applovin.impl.sdk.c.b.bo);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(com.applovin.impl.sdk.c.b.bp);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public JSONObject d() {
        if (b() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.b.substring(c().length()), 0), "UTF-8"));
                this.f1226a.L();
                if (y.a()) {
                    this.f1226a.L().b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.f1226a.L();
                if (!y.a()) {
                    return null;
                }
                this.f1226a.L().b("AdToken", "Unable to decode token '" + this.b + "' into JSON", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f1226a.L();
            if (!y.a()) {
                return null;
            }
            this.f1226a.L().b("AdToken", "Unable to process ad response from token '" + this.b + "'", e2);
            return null;
        }
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.f1226a.b(bVar)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.b) + ", type=" + b() + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.b;
        String str2 = ((c) obj).b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
