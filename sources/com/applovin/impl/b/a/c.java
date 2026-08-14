package com.applovin.impl.b.a;

import android.net.Uri;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkSettings;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements AppLovinSdkSettings.TermsFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f864a;
    private a b;
    private Uri c;
    private Uri d;
    private List<Uri> e;
    private final Object f;
    private boolean g;
    private List<Uri> h;
    private final Object i;
    private boolean j;

    public enum a {
        TERMS(CookieSpecs.DEFAULT),
        UNIFIED("unified");

        private final String c;

        a(String str) {
            this.c = str;
        }

        public String a() {
            return this.c;
        }
    }

    public c(boolean z, Uri uri, Uri uri2) {
        this(z, a.TERMS, uri, uri2, Collections.emptyList(), false, Collections.emptyList(), false);
    }

    public c(boolean z, a aVar, Uri uri, Uri uri2, List<Uri> list, boolean z2, List<Uri> list2, boolean z3) {
        this.f = new Object();
        this.i = new Object();
        this.f864a = z;
        this.b = aVar;
        this.c = uri;
        this.d = uri2;
        this.e = list;
        this.g = z2;
        this.h = list2;
        this.j = z3;
        if (z) {
            y.f("ConsentFlowSettings", "Creating with initial values: isEnabled=" + z + ",\n\tprivacyPolicyUri=" + uri + ",\n\ttermsOfServiceUri=" + uri2 + ",\n\tadvertisingPartnerUris=" + list + ",\n\tshouldIncludeDefaultAdvertisingPartnerUris=" + z2 + ",\n\tanalyticsPartnerUris=" + list2 + ",\n\tshouldIncludeDefaultAnalyticsPartnerUris=" + z3);
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setEnabled(boolean z) {
        y.f("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z);
        this.f864a = z;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public boolean isEnabled() {
        return this.f864a;
    }

    public a a() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        y.f("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.c = uri;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        y.f("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.d = uri;
    }

    @Override // com.applovin.sdk.AppLovinSdkSettings.TermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.d;
    }

    public List<Uri> b() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public boolean c() {
        return this.g;
    }

    public List<Uri> d() {
        ArrayList arrayList;
        synchronized (this.i) {
            arrayList = new ArrayList(this.h);
        }
        return arrayList;
    }

    public boolean e() {
        return this.j;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f864a + ", privacyPolicyUri=" + this.c + ", termsOfServiceUri=" + this.d + ", advertisingPartnerUris=" + this.e + ", analyticsPartnerUris=" + this.h + '}';
    }
}
