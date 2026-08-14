package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends d implements AppLovinCommunicatorSubscriber, a.InterfaceC0063a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f1071a;
    private List<com.applovin.impl.mediation.debugger.b.a.a> b;
    private List<com.applovin.impl.mediation.debugger.b.a.a> d;
    private String e;
    private String f;
    private String g;
    private com.applovin.impl.mediation.debugger.b.b.b h;
    private final StringBuilder i;
    private final AtomicBoolean j;
    private boolean k;
    private List<com.applovin.impl.mediation.debugger.b.c.b> l;
    private List<com.applovin.impl.mediation.debugger.b.c.b> m;
    private List<com.applovin.impl.mediation.debugger.b.c.b> n;
    private List<com.applovin.impl.mediation.debugger.b.a.d> o;
    private List<com.applovin.impl.mediation.debugger.b.a.d> p;
    private List<com.applovin.impl.mediation.debugger.b.c.b> q;
    private List<c> r;
    private List<c> s;
    private List<c> t;
    private List<c> u;
    private List<c> v;
    private List<c> w;
    private List<c> x;

    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b, reason: collision with other inner class name */
    public enum EnumC0070b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.i = new StringBuilder("");
        this.j = new AtomicBoolean();
        this.k = false;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
    }

    public boolean a() {
        return this.j.get();
    }

    public boolean b() {
        return this.k;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public p c() {
        return this.f1071a;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> d() {
        return this.b;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> i() {
        return this.o;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> j() {
        return this.p;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.b> k() {
        return this.q;
    }

    public String l() {
        return this.i.toString();
    }

    public void a(List<com.applovin.impl.mediation.debugger.b.c.b> list, List<com.applovin.impl.mediation.debugger.b.a.a> list2, List<com.applovin.impl.mediation.debugger.b.a.a> list3, com.applovin.impl.mediation.debugger.b.b.b bVar, String str, String str2, String str3, p pVar) {
        this.f1071a = pVar;
        this.b = list2;
        this.d = list3;
        this.h = bVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        if (list != null && this.j.compareAndSet(false, true)) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MediationDebuggerListAdapter", "Populating networks...");
            }
            a(list);
            b(list2);
            c(this.m);
            this.r.addAll(p());
            this.s.addAll(q());
            this.t.addAll(r());
            this.u.addAll(s());
            this.v = d(this.l);
            this.w = d(this.m);
            this.x = d(this.n);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_network_updated");
            arrayList.add("test_mode_network_updated");
            AppLovinCommunicator.getInstance(this.c).subscribe(this, arrayList);
            o();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int e() {
        return EnumC0070b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        if (i == EnumC0070b.APP_INFO.ordinal()) {
            return this.r.size();
        }
        if (i == EnumC0070b.MAX.ordinal()) {
            return this.s.size();
        }
        if (i == EnumC0070b.PRIVACY.ordinal()) {
            return this.t.size();
        }
        if (i == EnumC0070b.ADS.ordinal()) {
            return this.u.size();
        }
        if (i == EnumC0070b.INCOMPLETE_NETWORKS.ordinal()) {
            return this.v.size();
        }
        if (i == EnumC0070b.COMPLETED_NETWORKS.ordinal()) {
            return this.w.size();
        }
        return this.x.size();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i) {
        if (i == EnumC0070b.APP_INFO.ordinal()) {
            return new e("APP INFO");
        }
        if (i == EnumC0070b.MAX.ordinal()) {
            return new e("MAX");
        }
        if (i == EnumC0070b.PRIVACY.ordinal()) {
            return new e("PRIVACY");
        }
        if (i == EnumC0070b.ADS.ordinal()) {
            return new e("ADS");
        }
        if (i == EnumC0070b.INCOMPLETE_NETWORKS.ordinal()) {
            return new e("INCOMPLETE INTEGRATIONS");
        }
        if (i == EnumC0070b.COMPLETED_NETWORKS.ordinal()) {
            return new e("COMPLETED INTEGRATIONS");
        }
        return new e("MISSING INTEGRATIONS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i) {
        if (i == EnumC0070b.APP_INFO.ordinal()) {
            return this.r;
        }
        if (i == EnumC0070b.MAX.ordinal()) {
            return this.s;
        }
        if (i == EnumC0070b.PRIVACY.ordinal()) {
            return this.t;
        }
        if (i == EnumC0070b.ADS.ordinal()) {
            return this.u;
        }
        if (i == EnumC0070b.INCOMPLETE_NETWORKS.ordinal()) {
            return this.v;
        }
        if (i == EnumC0070b.COMPLETED_NETWORKS.ordinal()) {
            return this.w;
        }
        return this.x;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.t = r();
            m();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.v = d(this.l);
            this.w = d(this.m);
            m();
        } else if ("live_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.u = a(appLovinCommunicatorMessage.getMessageData().getString("live_network", null), (String) null);
            m();
        } else if ("test_mode_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.u = a((String) null, appLovinCommunicatorMessage.getMessageData().getString("test_mode_network", null));
            m();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0063a
    public void a(com.applovin.impl.mediation.debugger.b.b.a aVar, String str) {
        String strB;
        List<com.applovin.impl.mediation.debugger.b.b.b> list = aVar.a().get(this.h.a());
        boolean zContains = list != null ? list.contains(this.h) : false;
        if (zContains) {
            strB = "Correct AppLovin entry found at " + str + ".";
        } else {
            strB = b(a.b.MISSING_REQUIRED_ENTRY, str);
        }
        this.s.add(a(strB, zContains));
        m();
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0063a
    public void a(a.b bVar, String str) {
        if (bVar == a.b.DEVELOPER_URI_NOT_FOUND) {
            this.f1071a.L();
            if (y.a()) {
                this.f1071a.L().b("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.s.add(a(b(bVar, str), false));
        m();
    }

    private void o() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.c, this.f1071a));
        sb.append("\nTest Mode - ".concat(this.f1071a.av().a() ? "enabled" : "disabled"));
        if (this.f1071a.S() != null) {
            sb.append("\nTarget SDK - " + this.f1071a.Q().B().j());
        } else {
            sb.append("\nTarget SDK - " + this.f1071a.R().h().get("target_sdk"));
        }
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f1071a.a(com.applovin.impl.sdk.c.b.dU);
        String strA = g.a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strA)) {
            strA = "Disabled";
        }
        sb3.append(strA);
        sb.append(sb3.toString());
        if (this.f1071a.g() && (metaData = Utils.getMetaData(this.f1071a.C())) != null) {
            String str3 = metaData.get("UnityVersion");
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            sb4.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(com.applovin.impl.b.a.a(this.c));
        sb.append(this.f1071a.ae().j());
        sb.append("\n========== NETWORKS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = this.m.iterator();
        while (it.hasNext()) {
            a(sb, it.next().z());
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it2 = this.l.iterator();
        while (it2.hasNext()) {
            a(sb, it2.next().z());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it3 = this.b.iterator();
        while (it3.hasNext()) {
            a(sb, it3.next().f());
        }
        sb.append("\n========== END ==========");
        y.f("MediationDebuggerListAdapter", sb.toString());
        this.i.append(sb.toString());
    }

    private void a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (string.length() + str.length() >= ((Integer) this.f1071a.a(com.applovin.impl.sdk.c.b.ar)).intValue()) {
            y.f("MediationDebuggerListAdapter", string);
            this.i.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (!bVar.g()) {
                if (bVar.a() == b.a.INCOMPLETE_INTEGRATION || bVar.a() == b.a.INVALID_INTEGRATION) {
                    this.l.add(bVar);
                } else if (bVar.a() == b.a.COMPLETE) {
                    this.m.add(bVar);
                } else if (bVar.a() == b.a.MISSING) {
                    this.n.add(bVar);
                }
            }
        }
    }

    private void b(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.mediation.debugger.b.a.c cVarE = it.next().e();
            Iterator<com.applovin.impl.mediation.debugger.b.a.b> it2 = cVarE.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().a());
            }
            Iterator<com.applovin.impl.mediation.debugger.b.a.b> it3 = cVarE.b().iterator();
            while (it3.hasNext()) {
                hashSet2.add(it3.next().a());
            }
        }
        this.o = new ArrayList(hashSet);
        this.p = new ArrayList(hashSet2);
        Collections.sort(this.o);
        Collections.sort(this.p);
    }

    private void c(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (bVar.c() == b.EnumC0065b.READY) {
                this.q.add(bVar);
            }
        }
    }

    private List<c> p() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.c.getPackageName()).a());
        c.a aVarA = c.p().a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(aVarA.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        arrayList.add(c.p().a("Account").b(StringUtils.isValidString(this.g) ? this.g : "None").a());
        arrayList.add(c.p().a("Mediation Provider").b(StringUtils.isValidString(this.f1071a.s()) ? this.f1071a.s() : "None").a());
        arrayList.add(c.p().a("OM SDK Version").b(this.f1071a.ag().c()).a());
        arrayList.add(b(p.A()));
        return arrayList;
    }

    private List<c> q() {
        Map<String, String> metaData;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(c.p().a("SDK Version").b(AppLovinSdk.VERSION).a());
        String str = (String) this.f1071a.a(com.applovin.impl.sdk.c.b.dU);
        c.a aVarA = c.p().a("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(aVarA.b(str).a());
        c.a aVarA2 = c.p().a("Ad Review Version");
        String strA = g.a();
        if (StringUtils.isValidString(strA)) {
            String strB = g.b();
            if (!StringUtils.isValidString(strB) || strB.equals(this.f1071a.B())) {
                aVarA2.b(strA);
            } else {
                StringBuilder sb = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb.append(this.f1071a.g() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb.append(" from the correct account.");
                a(aVarA2, sb.toString());
            }
        } else {
            a(aVarA2, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(aVarA2.a());
        if (this.f1071a.g() && (metaData = Utils.getMetaData(this.f1071a.C())) != null) {
            String str2 = metaData.get("UnityVersion");
            arrayList.add(b("Unity Version", StringUtils.isValidString(str2) ? str2 : "None"));
        }
        return arrayList;
    }

    private List<c> r() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.a(), true, this.c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.b(), false, this.c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.c(), true, this.c));
        return arrayList;
    }

    private List<c> s() {
        return a((String) null, (String) null);
    }

    private List<c> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(c.p().a("View Ad Units (" + this.b.size() + ")").a(this.c).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.d.isEmpty()) {
            arrayList.add(c.p().a("Selective Init Ad Units (" + this.d.size() + ")").a(this.c).a(true).a());
        }
        return arrayList;
    }

    private List<c> d(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(it.next(), this.c));
        }
        return arrayList;
    }

    private c b(String str, String str2) {
        c.a aVarA = c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            aVarA.b(str2);
        } else {
            aVarA.a(R.drawable.applovin_ic_x_mark);
            aVarA.c(com.applovin.impl.sdk.utils.g.a(R.color.applovin_sdk_xmarkColor, this.c));
        }
        return aVarA.a();
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(R.color.applovin_sdk_xmarkColor, this.c)).a(true);
    }

    private c a(String str) {
        c.a aVarP = c.p();
        if (!this.f1071a.av().a()) {
            aVarP.a(this.c);
        }
        c.a aVarA = aVarP.a((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f1071a.av().a()) {
            str = "Enable";
        }
        return aVarA.b(str).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private c b(String str) {
        c.a aVarP = c.p();
        if (this.f1071a.av().a()) {
            aVarP.a(this.c);
        }
        c.a aVarA = aVarP.a((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f1071a.av().a()) {
            str = "Enable";
        }
        return aVarA.b(str).b(-16776961).d("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private c b(boolean z) {
        return c.p().a("Java 8").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.c)).c("Upgrade to Java 8").d("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration").a(!z).a();
    }

    private c a(String str, boolean z) {
        return c.p().a("app-ads.txt").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(com.applovin.impl.sdk.utils.g.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.c)).c("app-ads.txt").d(str).a(true).a();
    }

    private String b(a.b bVar, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = AnonymousClass2.f1073a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".";
        }
        if (i == 3) {
            return "Text file at " + str + " is missing required line:\n\n" + this.h.e();
        }
        return "";
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.b.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1073a;

        static {
            int[] iArr = new int[a.b.values().length];
            f1073a = iArr;
            try {
                iArr[a.b.DEVELOPER_URI_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1073a[a.b.APPADSTXT_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1073a[a.b.MISSING_REQUIRED_ENTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.j.get() + "}";
    }
}
