package com.applovin.impl.mediation.debugger.c;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import cz.msebera.android.httpclient.HttpHost;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0066a f1038a;
    private final String b;
    private String c;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0066a {
        void a(a.b bVar, String str);

        void a(String str, String str2);
    }

    public a(p pVar, String str, InterfaceC0066a interfaceC0066a) {
        super("TaskFetchAppAdsContent", pVar);
        this.b = str;
        this.f1038a = interfaceC0066a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Uri uri = Uri.parse(this.b);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(uri.getAuthority()).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.c cVarA = com.applovin.impl.sdk.network.c.a(this.f).b("GET").a(uriBuild.toString()).c(new Uri.Builder().scheme(HttpHost.DEFAULT_SCHEME_NAME).authority(uri.getAuthority()).appendPath("app-ads.txt").build().toString()).a("").c(false).a();
        this.c = uriBuild.toString();
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Looking up app-ads.txt at " + this.c);
        }
        this.f.M().a((com.applovin.impl.sdk.e.a) new u<String>(cVarA, this.f) { // from class: com.applovin.impl.mediation.debugger.c.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    y yVar2 = this.h;
                    if (y.a()) {
                        this.h.e(this.g, "No app-ads.txt found");
                    }
                    a.this.f1038a.a(a.b.APPADSTXT_NOT_FOUND, a.this.c);
                    return;
                }
                y yVar3 = this.h;
                if (y.a()) {
                    this.h.b(this.g, "Found app-ads.txt");
                }
                a.this.f1038a.a(str, a.this.c);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, String str2) {
                y yVar2 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch app-ads.txt due to: " + str + ", and received error code: " + i);
                }
                a.this.f1038a.a(a.b.APPADSTXT_NOT_FOUND, a.this.c);
            }
        });
    }
}
