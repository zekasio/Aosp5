package com.applovin.impl.mediation.debugger.c;

import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1040a;

    public interface a {
        void a(a.b bVar);

        void a(String str);
    }

    public b(p pVar, a aVar) {
        super("TaskFetchDeveloperUri", pVar);
        this.f1040a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf;
        if (this.f.S() != null) {
            strValueOf = String.valueOf(this.f.Q().B().d());
        } else {
            strValueOf = String.valueOf(this.f.R().h().get("package_name"));
        }
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<String>(com.applovin.impl.sdk.network.c.a(this.f).b("GET").a("https://play.google.com/store/apps/details?id=" + strValueOf).a("").c(false).a(), this.f) { // from class: com.applovin.impl.mediation.debugger.c.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    y yVar2 = this.h;
                    if (y.a()) {
                        this.h.e(this.g, "No developer URI found - response is empty");
                    }
                    b.this.f1040a.a(a.b.DEVELOPER_URI_NOT_FOUND);
                }
                Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    y yVar3 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Found developer URI: " + strGroup);
                    }
                    b.this.f1040a.a(strGroup);
                    return;
                }
                y yVar4 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to find developer URI from the Play Store listing metadata");
                }
                b.this.f1040a.a(a.b.DEVELOPER_URI_NOT_FOUND);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, String str2) {
                y yVar2 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch developer URI due to: " + str + ", and received error code: " + i);
                }
                b.this.f1040a.a(a.b.DEVELOPER_URI_NOT_FOUND);
            }
        });
    }
}
