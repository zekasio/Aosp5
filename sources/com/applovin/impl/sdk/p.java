package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.b.a.c;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f1402a;
    public static p b;
    protected static Context c;
    private static final long e = System.currentTimeMillis();
    private static final boolean f;
    private static a g;
    private s A;
    private q B;
    private r C;
    private com.applovin.impl.sdk.c.e D;
    private o E;
    private com.applovin.impl.sdk.utils.q F;
    private e G;
    private d H;
    private v I;
    private com.applovin.impl.sdk.d.c J;
    private SessionTracker K;
    private w L;
    private ae M;
    private com.applovin.impl.sdk.network.d N;
    private m O;
    private com.applovin.impl.sdk.utils.o P;
    private k Q;
    private com.applovin.impl.b.a.b R;
    private com.applovin.impl.a.a.a S;
    private com.applovin.impl.sdk.a.f T;
    private x U;
    private ArrayService V;
    private t W;
    private PostbackServiceImpl X;
    private com.applovin.impl.sdk.network.k Y;
    private g Z;
    private com.applovin.impl.mediation.h aa;
    private com.applovin.impl.mediation.g ab;
    private MediationServiceImpl ac;
    private com.applovin.mediation.hybridAds.d ad;
    private com.applovin.impl.mediation.j ae;
    private com.applovin.impl.mediation.debugger.b af;
    private z ag;
    private com.applovin.impl.mediation.f ah;
    private com.applovin.impl.mediation.debugger.ui.testmode.c ai;
    private List<MaxAdFormat> aj;
    private final Object ak = new Object();
    private final AtomicBoolean al = new AtomicBoolean(true);
    private final AtomicBoolean am = new AtomicBoolean();
    private boolean an = false;
    private boolean ao = false;
    private boolean ap = false;
    private boolean aq = false;
    private boolean ar = false;
    private int as = 0;
    private AppLovinSdk.SdkInitializationListener at;
    private AppLovinSdk.SdkInitializationListener au;
    private AppLovinSdkConfiguration av;
    protected com.applovin.impl.sdk.c.c d;
    private String h;
    private WeakReference<Activity> i;
    private long j;
    private boolean k;
    private AppLovinSdkSettings l;
    private AppLovinUserSegment m;
    private AppLovinTargetingData n;
    private String o;
    private AppLovinAdServiceImpl p;
    private AppLovinNativeAdService q;
    private EventServiceImpl r;
    private UserServiceImpl s;
    private AppLovinCFService t;
    private VariableServiceImpl u;
    private AppLovinSdk v;
    private y w;
    private com.applovin.impl.sdk.e.o x;
    private com.applovin.impl.sdk.network.b y;
    private com.applovin.impl.sdk.d.g z;

    public static Context y() {
        return c;
    }

    public static long z() {
        return e;
    }

    public static boolean A() {
        return f;
    }

    public String B() {
        return this.h;
    }

    public AppLovinSdkSettings C() {
        return this.l;
    }

    public AppLovinUserSegment D() {
        return this.m;
    }

    public AppLovinAdServiceImpl E() {
        return this.p;
    }

    public AppLovinNativeAdService F() {
        return this.q;
    }

    public EventServiceImpl G() {
        return this.r;
    }

    public UserServiceImpl H() {
        return this.s;
    }

    public AppLovinCFService I() {
        return this.t;
    }

    public VariableServiceImpl J() {
        return this.u;
    }

    public AppLovinSdk K() {
        return this.v;
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.v = appLovinSdk;
    }

    public y L() {
        return this.w;
    }

    public com.applovin.impl.sdk.e.o M() {
        return this.x;
    }

    public com.applovin.impl.sdk.c.c N() {
        return this.d;
    }

    public com.applovin.impl.sdk.network.b O() {
        return this.y;
    }

    public com.applovin.impl.sdk.d.g P() {
        return this.z;
    }

    public s Q() {
        return this.A;
    }

    public q R() {
        return this.B;
    }

    public r S() {
        return this.C;
    }

    public o T() {
        return this.E;
    }

    public e U() {
        return this.G;
    }

    public d V() {
        return this.H;
    }

    public v W() {
        return this.I;
    }

    public com.applovin.impl.sdk.d.c X() {
        return this.J;
    }

    public SessionTracker Y() {
        return this.K;
    }

    public w Z() {
        return this.L;
    }

    public ae aa() {
        return this.M;
    }

    public m ab() {
        return this.O;
    }

    public com.applovin.impl.sdk.utils.o ac() {
        return this.P;
    }

    public k ad() {
        return this.Q;
    }

    public com.applovin.impl.b.a.b ae() {
        return this.R;
    }

    public com.applovin.impl.a.a.a af() {
        return this.S;
    }

    public com.applovin.impl.sdk.a.f ag() {
        return this.T;
    }

    public x ah() {
        return this.U;
    }

    public ArrayService ai() {
        return this.V;
    }

    public t aj() {
        return this.W;
    }

    public PostbackServiceImpl ak() {
        return this.X;
    }

    public com.applovin.impl.sdk.network.k al() {
        return this.Y;
    }

    public g am() {
        return this.Z;
    }

    public com.applovin.impl.mediation.h an() {
        return this.aa;
    }

    public com.applovin.impl.mediation.g ao() {
        return this.ab;
    }

    public MediationServiceImpl ap() {
        return this.ac;
    }

    public com.applovin.mediation.hybridAds.d aq() {
        return this.ad;
    }

    public com.applovin.impl.mediation.j ar() {
        return this.ae;
    }

    public com.applovin.impl.mediation.debugger.b as() {
        return this.af;
    }

    public z at() {
        return this.ag;
    }

    public com.applovin.impl.mediation.f au() {
        return this.ah;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.c av() {
        return this.ai;
    }

    public boolean aw() {
        return this.ap;
    }

    public AppLovinSdkConfiguration ax() {
        return this.av;
    }

    static {
        boolean z;
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.p$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Utils.logJava8MethodReference();
                }
            });
            z = true;
        } finally {
            z = false;
            try {
            } finally {
            }
        }
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.at = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.p.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(p.this.av);
                }
            });
        }
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.h = str;
        this.j = System.currentTimeMillis();
        this.an = true;
        this.l = appLovinSdkSettings;
        this.m = new j();
        this.n = new AppLovinTargetingDataImpl();
        this.av = new SdkConfigurationImpl(null, this);
        c = context.getApplicationContext();
        if (context instanceof Activity) {
            this.i = new WeakReference<>((Activity) context);
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(str)) {
            this.k = true;
            b = this;
        } else if (f1402a == null) {
            f1402a = this;
        } else {
            y.i("AppLovinSdk", "Multiple SDK instances detected");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.D = new com.applovin.impl.sdk.c.e(this);
        this.d = new com.applovin.impl.sdk.c.c(this);
        this.w = new y(this);
        this.I = new v(this);
        this.G = new e(this);
        this.r = new EventServiceImpl(this);
        this.s = new UserServiceImpl(this);
        this.t = new i(this) { // from class: com.applovin.impl.sdk.p.2
        };
        this.u = new VariableServiceImpl(this);
        this.J = new com.applovin.impl.sdk.d.c(this);
        this.x = new com.applovin.impl.sdk.e.o(this);
        this.y = new com.applovin.impl.sdk.network.b(this);
        this.z = new com.applovin.impl.sdk.d.g(this);
        this.T = new com.applovin.impl.sdk.a.f(this);
        this.P = new com.applovin.impl.sdk.utils.o(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dF)).booleanValue()) {
            this.A = new s(this);
            this.C = new r(this);
        } else {
            this.B = new q(this);
        }
        this.p = new AppLovinAdServiceImpl(this);
        this.q = new AppLovinNativeAdService(this);
        this.K = new SessionTracker(this);
        this.L = new w(this);
        this.M = new ae(this);
        this.X = new PostbackServiceImpl(this);
        this.Z = new g(this);
        this.aa = new com.applovin.impl.mediation.h(this);
        this.ab = new com.applovin.impl.mediation.g(this);
        this.ac = new MediationServiceImpl(this);
        this.ad = new com.applovin.mediation.hybridAds.d(this);
        this.ag = new z(this);
        this.af = new com.applovin.impl.mediation.debugger.b(this);
        this.ae = new com.applovin.impl.mediation.j();
        this.ah = new com.applovin.impl.mediation.f(this);
        this.E = new o(this);
        this.P = new com.applovin.impl.sdk.utils.o(this);
        this.Q = new k(this);
        this.ai = new com.applovin.impl.mediation.debugger.ui.testmode.c(this);
        this.R = new com.applovin.impl.b.a.b(this);
        this.S = new com.applovin.impl.a.a.a(this);
        this.U = new x(this);
        this.V = new ArrayService(this);
        this.W = new t(this);
        this.Y = (((Boolean) a(com.applovin.impl.sdk.c.b.dc)).booleanValue() || Boolean.parseBoolean(appLovinSdkSettings.getExtraParameters().get(AppLovinSdkExtraParameterKey.USE_NEW_POSTBACK_MANAGER))) ? new com.applovin.impl.sdk.network.g(this) : new com.applovin.impl.sdk.network.f(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.bH)).booleanValue()) {
            this.H = new d(this);
        }
        this.O = new m(this);
        this.F = new com.applovin.impl.sdk.utils.q(this);
        this.ab.a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (appLovinSdkSettings.isExceptionHandlerEnabled() && ((Boolean) a(com.applovin.impl.sdk.c.b.au)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dq)).booleanValue()) {
            this.N = new com.applovin.impl.sdk.network.d(context);
        }
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            y.i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this)) {
            y.i("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + str + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if (Utils.isProguardRulesOmitted()) {
            y.i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this)) {
            y.i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        N().a(com.applovin.impl.sdk.c.b.ah, Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (TextUtils.isEmpty((String) this.D.b(com.applovin.impl.sdk.c.d.d, (Object) null, defaultSharedPreferences))) {
            this.ap = true;
            this.D.a(com.applovin.impl.sdk.c.d.d, Boolean.toString(true), defaultSharedPreferences);
        } else {
            this.D.a(com.applovin.impl.sdk.c.d.d, Boolean.toString(false), defaultSharedPreferences);
        }
        if (((Boolean) this.D.b(com.applovin.impl.sdk.c.d.e, false)).booleanValue()) {
            if (y.a()) {
                this.w.b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.aq = true;
        } else {
            if (y.a()) {
                this.w.b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.D.a(com.applovin.impl.sdk.c.d.e, true);
            this.D.a(com.applovin.impl.sdk.c.d.s, Boolean.valueOf(this.R.b()));
        }
        String str2 = (String) this.D.b(com.applovin.impl.sdk.c.d.f, null);
        if (StringUtils.isValidString(str2)) {
            if (AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str2)) {
                this.D.a(com.applovin.impl.sdk.c.d.f, AppLovinSdk.VERSION);
            }
        } else {
            this.D.a(com.applovin.impl.sdk.c.d.f, AppLovinSdk.VERSION);
        }
        final boolean zA = com.applovin.impl.sdk.utils.i.a(y());
        this.x.a(new com.applovin.impl.sdk.e.z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.p.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (p.this.ak) {
                    if (!((Boolean) p.this.a(com.applovin.impl.sdk.c.b.dr)).booleanValue() || zA) {
                        p.this.b();
                    }
                    if (((Boolean) p.this.a(com.applovin.impl.sdk.c.b.dq)).booleanValue() && !zA) {
                        y unused = p.this.w;
                        if (y.a()) {
                            p.this.w.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                        }
                        p.this.az();
                    }
                    if (p.this.R.c() == c.a.TERMS) {
                        if (p.this.f()) {
                            y unused2 = p.this.w;
                            if (y.a()) {
                                p.this.w.b("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                            }
                            p.this.R.a(false);
                            p.this.R.a(p.this.x(), new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.p.3.1
                                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                }
                            });
                        } else {
                            y unused3 = p.this.w;
                            if (y.a()) {
                                p.this.w.b("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + p.this.o);
                            }
                        }
                    }
                }
            }
        }), o.a.MAIN, StringUtils.parseInt(appLovinSdkSettings.getExtraParameters().get(AppLovinSdkExtraParameterKey.INITIALIZATION_DELAY_MILLIS), ((Integer) a(com.applovin.impl.sdk.c.b.er)).intValue()));
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void a(boolean z) {
        synchronized (this.ak) {
            this.an = false;
            this.ao = z;
        }
        if (this.d == null || this.x == null) {
            return;
        }
        List<String> listB = b(com.applovin.impl.sdk.c.a.f1262a);
        if (listB.isEmpty()) {
            this.x.e();
            k();
            return;
        }
        long jLongValue = ((Long) a(com.applovin.impl.sdk.c.a.b)).longValue();
        com.applovin.impl.sdk.e.z zVar = new com.applovin.impl.sdk.e.z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.p.4
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.x.a()) {
                    return;
                }
                y unused = p.this.w;
                if (y.a()) {
                    p.this.w.b("AppLovinSdk", "Timing out adapters init...");
                }
                p.this.x.e();
                p.this.k();
            }
        });
        if (y.a()) {
            this.w.b("AppLovinSdk", "Waiting for required adapters to init: " + listB + " - timing out in " + jLongValue + "ms...");
        }
        this.x.a(zVar, o.a.MEDIATION_TIMEOUT, jLongValue, true);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (this.x.a()) {
            return;
        }
        List<String> listB = b(com.applovin.impl.sdk.c.a.f1262a);
        if (listB.size() <= 0 || !this.ab.b().keySet().containsAll(listB)) {
            return;
        }
        if (y.a()) {
            this.w.b("AppLovinSdk", "All required adapters initialized");
        }
        this.x.e();
        k();
    }

    public void a() {
        synchronized (this.ak) {
            if (!this.an && !this.ao) {
                b();
            }
        }
    }

    public void b() {
        synchronized (this.ak) {
            this.an = true;
            M().d();
            ay();
        }
    }

    private void ay() {
        com.applovin.impl.sdk.e.o oVarM = M();
        int i = this.as + 1;
        this.as = i;
        oVarM.a(new com.applovin.impl.sdk.e.i(i, this, new i.a() { // from class: com.applovin.impl.sdk.p.5
            @Override // com.applovin.impl.sdk.e.i.a
            public void a(JSONObject jSONObject) {
                boolean z = jSONObject.length() > 0;
                com.applovin.impl.sdk.utils.i.d(jSONObject, p.this);
                com.applovin.impl.sdk.utils.i.c(jSONObject, p.this);
                h.a(p.this);
                com.applovin.impl.sdk.utils.i.e(jSONObject, p.this);
                com.applovin.impl.sdk.utils.i.a(jSONObject, z, p.this);
                com.applovin.impl.mediation.d.b.a(jSONObject, p.this);
                com.applovin.impl.mediation.d.b.a(jSONObject);
                com.applovin.impl.mediation.d.b.b(jSONObject, p.this);
                p.this.as().a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                p pVar = p.this;
                pVar.aj = pVar.b(jSONObject);
                if (z) {
                    List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                    p pVar2 = p.this;
                    pVar2.av = new SdkConfigurationImpl(listExplode, pVar2);
                }
                com.applovin.impl.sdk.utils.i.f(jSONObject, p.this);
                p.this.av().a(jSONObject);
                p.this.a(jSONObject);
                Boolean bool = (Boolean) p.this.a(com.applovin.impl.sdk.c.d.u);
                if (bool == null) {
                    boolean z2 = p.this.av.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
                    p.this.ar = z2;
                    p.this.a(com.applovin.impl.sdk.c.d.u, Boolean.valueOf(z2));
                } else if (bool.booleanValue()) {
                    p.this.ar = true;
                } else {
                    p.this.ar = false;
                    if (p.this.av.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                        p.this.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.u, true);
                    }
                }
                if (p.this.e() || !p.this.f()) {
                    p.this.e("Initializing SDK in non-MAX environment...");
                } else if (p.this.R.c() != c.a.UNIFIED) {
                    p.this.e("Initializing SDK in MAX environment...");
                } else {
                    Activity activityX = p.this.x();
                    if (p.this.am.compareAndSet(false, true)) {
                        p.this.R.a(false);
                        p.this.R.a(activityX, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.p.5.1
                            @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                            public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                p.this.e("Initializing SDK in MAX environment...");
                            }
                        });
                    } else {
                        p.this.e("Initializing SDK in MAX environment...");
                    }
                }
                if (((Boolean) p.this.a(com.applovin.impl.sdk.c.b.dq)).booleanValue() && !z && com.applovin.impl.sdk.utils.i.a(p.y())) {
                    y unused = p.this.w;
                    if (y.a()) {
                        p.this.w.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    p.this.az();
                }
            }
        }), o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (y.a()) {
            this.w.b("AppLovinSdk", str);
        }
        M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.n(this));
    }

    public boolean c() {
        boolean z;
        synchronized (this.ak) {
            z = this.an;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.ak) {
            z = this.ao;
        }
        return z;
    }

    public boolean e() {
        return this.k;
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(s(), AppLovinMediationProvider.MAX);
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public boolean h() {
        Map<String, String> extraParameters = C().getExtraParameters();
        if (!extraParameters.containsKey("eifc")) {
            return false;
        }
        boolean zEquals = "iOf8gUDWef".equals(extraParameters.get("eifc"));
        if (!zEquals) {
            y.i("AppLovinSdk", "Invalid internal features code. Please contact your account manager to get the code.");
        }
        return zEquals;
    }

    public void i() {
        String str = (String) this.D.b(com.applovin.impl.sdk.c.d.f, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
                y.i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void j() {
        this.O.a();
    }

    public void k() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((this.R.h() && this.R.c() == c.a.UNIFIED) || (sdkInitializationListener = this.at) == null) {
            return;
        }
        if (d()) {
            this.at = null;
            this.au = null;
            this.ab.a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.au == sdkInitializationListener) {
                return;
            }
            this.ab.a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(com.applovin.impl.sdk.c.b.ap)).booleanValue()) {
                this.at = null;
            } else {
                this.au = sdkInitializationListener;
            }
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.p.6
            @Override // java.lang.Runnable
            public void run() {
                y unused = p.this.w;
                if (y.a()) {
                    p.this.w.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                }
                sdkInitializationListener.onSdkInitialized(p.this.av);
            }
        }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.aq)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        this.N.a(new d.a() { // from class: com.applovin.impl.sdk.p.7
            @Override // com.applovin.impl.sdk.network.d.a
            public void b() {
            }

            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                y unused = p.this.w;
                if (y.a()) {
                    p.this.w.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (p.this.ak) {
                    if (!p.this.an) {
                        p.this.b();
                    }
                }
                p.this.N.b(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            y.i("AppLovinSdk", (String) it.next());
        }
    }

    public void l() {
        y.i("AppLovinSdk", "Resetting SDK state...");
        long jB = this.z.b(com.applovin.impl.sdk.d.f.i);
        this.d.c();
        this.d.a();
        this.z.a();
        this.z.b(com.applovin.impl.sdk.d.f.i, jB + 1);
        if (this.al.compareAndSet(true, false)) {
            b();
        } else {
            this.al.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MaxAdFormat> b(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) this.d.a(bVar);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.d.b(bVar);
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.d.c(bVar);
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        this.D.a(dVar, t);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.D.a(dVar, t, sharedPreferences);
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        this.D.a(str, t, editor);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b(dVar, (Object) null);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t) {
        return (T) this.D.b(dVar, t);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) this.D.b(dVar, t, sharedPreferences);
    }

    public <T> T a(String str, T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t, cls, sharedPreferences);
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.D.a(dVar);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.D.a(sharedPreferences);
    }

    public static String a(String str) {
        return a(str, (List<String>) null);
    }

    public static String a(int i) {
        return a(i, (List<String>) null);
    }

    public static String a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextY = y();
        return a(contextY.getResources().getIdentifier(str, "string", contextY.getPackageName()), list);
    }

    public static String a(int i, List<String> list) {
        String string = y().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.aj;
        return (list == null || list.size() <= 0 || this.aj.contains(maxAdFormat)) ? false : true;
    }

    public void m() {
        a((Map<String, List<?>>) null);
    }

    public void a(Map<String, List<?>> map) {
        this.af.a(map);
    }

    public void n() {
        this.S.b();
    }

    public void a(long j) {
        this.E.a(j);
    }

    public void b(String str) {
        y.f("AppLovinSdk", "Setting plugin version: " + str);
        this.d.a(com.applovin.impl.sdk.c.b.dU, str);
    }

    public void c(String str) {
        if (y.a()) {
            this.w.b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            y.i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.F.a(str);
    }

    public String o() {
        return this.F.a();
    }

    public String p() {
        return this.F.b();
    }

    public String q() {
        return this.F.c();
    }

    public AppLovinTargetingDataImpl r() {
        return (AppLovinTargetingDataImpl) this.n;
    }

    public void d(String str) {
        this.o = str;
        b(com.applovin.impl.sdk.c.d.I);
    }

    public String s() {
        String str = (String) a(com.applovin.impl.sdk.c.d.I);
        return StringUtils.isValidString(str) ? str : this.o;
    }

    public static a a(Context context) {
        if (g == null) {
            g = new a(context);
        }
        return g;
    }

    public Activity t() {
        WeakReference<Activity> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean u() {
        return this.aq;
    }

    public boolean v() {
        return this.ar;
    }

    public a w() {
        return g;
    }

    public Activity x() {
        Activity activityA = a(y()).a();
        return activityA != null ? activityA : t();
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.h + "', enabled=" + this.ao + ", isFirstSession=" + this.ap + '}';
    }
}
