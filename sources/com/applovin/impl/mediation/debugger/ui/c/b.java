package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f1079a;
    private List<c> b;
    private final List<c> d;
    private final List<c> e;
    private final List<c> f;
    private final List<c> g;
    private SpannedString h;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    b(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(context);
        this.f1079a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.h = new SpannedString(spannableString);
        } else {
            this.h = new SpannedString("");
        }
        this.b = c();
        this.d = a(bVar.r());
        this.e = a(bVar.u());
        this.f = b(bVar.s());
        this.g = h();
        notifyDataSetChanged();
    }

    public com.applovin.impl.mediation.debugger.b.c.b a() {
        return this.f1079a;
    }

    public void b() {
        this.b = c();
    }

    public boolean a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return aVar.a() == a.TEST_ADS.ordinal() && aVar.b() == this.g.size() - 1;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int e() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.b.size();
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.d.size();
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.e.size();
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return this.f.size();
        }
        return this.g.size();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return new e("INTEGRATIONS");
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return new e("PERMISSIONS");
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return new e("CONFIGURATION");
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return new e("DEPENDENCIES");
        }
        return new e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.b;
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.d;
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.e;
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return this.f;
        }
        return this.g;
    }

    private List<c> c() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(d());
        arrayList.add(f());
        arrayList.add(g());
        return arrayList;
    }

    private c d() {
        c.a aVarB = c.p().a("SDK").b(this.f1079a.j());
        if (TextUtils.isEmpty(this.f1079a.j())) {
            aVarB.a(a(this.f1079a.d())).c(c(this.f1079a.d()));
        }
        return aVarB.a();
    }

    private c f() {
        c.a aVarB = c.p().a("Adapter").b(this.f1079a.k());
        if (TextUtils.isEmpty(this.f1079a.k())) {
            aVarB.a(a(this.f1079a.e())).c(c(this.f1079a.e()));
        }
        return aVarB.a();
    }

    private c g() {
        return c.p().a("Initialization Status").b(e(this.f1079a.b())).a(false).a();
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.c.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.d dVar : list) {
                arrayList.add(a(dVar.a(), dVar.b(), dVar.c(), true));
            }
        }
        return arrayList;
    }

    private List<c> a(com.applovin.impl.mediation.debugger.b.c.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            arrayList.add(a("Cleartext Traffic", cVar.c(), cVar.b(), false));
        }
        if (this.f1079a.t()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration", p.A(), true));
        }
        return arrayList;
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.b.c.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.a aVar : list) {
                arrayList.add(a(aVar.a(), aVar.b(), aVar.c(), true));
            }
        }
        return arrayList;
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f1079a.w())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.f1079a.w()).a());
        }
        if (this.f1079a.c() == b.EnumC0065b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f1079a.n() != null) {
            arrayList.add(c(this.f1079a.n()));
        }
        if (this.f1079a.x()) {
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.c) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.c), false));
        }
        arrayList.add(a(this.f1079a.c()));
        return arrayList;
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private c a(b.EnumC0065b enumC0065b) {
        c.a aVarP = c.p();
        if (enumC0065b == b.EnumC0065b.READY) {
            aVarP.a(this.c);
        }
        return aVarP.a("Test Mode").b(enumC0065b.a()).b(enumC0065b.b()).c("Restart Required").d(enumC0065b.c()).a(true).a();
    }

    private c a(String str, String str2, boolean z, boolean z2) {
        return c.a(z ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(str).b(z ? null : this.h).c("Instructions").d(str2).a(z ? R.drawable.applovin_ic_check_mark_bordered : b(z2)).c(z ? g.a(R.color.applovin_sdk_checkmarkColor, this.c) : d(z2)).a(!z).a();
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private int b(boolean z) {
        return z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int c(boolean z) {
        return g.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.c);
    }

    private int d(boolean z) {
        return g.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.c);
    }

    private String e(int i) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i) {
            return "Failure";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i) {
            return "Initializing...";
        }
        return "Not Initialized";
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
