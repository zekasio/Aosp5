package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class s {
    private static final AtomicReference<d.a> E = new AtomicReference<>();
    private static final AtomicReference<b> F = new AtomicReference<>();
    private static final AtomicReference<Integer> G = new AtomicReference<>();
    private final int A;
    private final int B;
    private final p C;
    private final Context D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1421a;
    private final j b;
    private final c c;
    private final d d;
    private final f e;
    private final h f;
    private final String g;
    private final String h;
    private final double i;
    private final boolean j;
    private String k;
    private long l;
    private final a m;
    private final g n;
    private boolean o;
    private e p;
    private e q;
    private e r;
    private e s;
    private e t;
    private e u;
    private e v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public i p() {
        return this.f1421a;
    }

    public j q() {
        return this.b;
    }

    public c r() {
        return this.c;
    }

    public d s() {
        return this.d;
    }

    public f t() {
        return this.e;
    }

    public h u() {
        return this.f;
    }

    public String v() {
        return this.g;
    }

    public String w() {
        return this.h;
    }

    public double x() {
        return this.i;
    }

    public boolean y() {
        return this.j;
    }

    public String z() {
        return this.k;
    }

    public long A() {
        return this.l;
    }

    public a B() {
        return this.m;
    }

    public g C() {
        return this.n;
    }

    public boolean D() {
        return this.o;
    }

    protected s(p pVar) {
        this.C = pVar;
        Context contextY = p.y();
        this.D = contextY;
        this.w = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.es)).intValue();
        this.x = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.et)).intValue();
        this.y = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eu)).intValue();
        this.z = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.ev)).intValue();
        this.A = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.ew)).intValue();
        this.B = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.ex)).intValue();
        this.f1421a = new i();
        this.b = new j();
        this.c = new c();
        this.d = new d();
        this.e = new f();
        this.f = new h();
        this.g = AppLovinSdkUtils.isFireOS(contextY) ? "fireos" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
        int orientation = AppLovinSdkUtils.getOrientation(contextY);
        if (orientation == 1) {
            this.h = TJAdUnitConstants.String.PORTRAIT;
        } else if (orientation == 2) {
            this.h = TJAdUnitConstants.String.LANDSCAPE;
        } else {
            this.h = "none";
        }
        double offset = TimeZone.getDefault().getOffset(new Date().getTime());
        Double.isNaN(offset);
        double dRound = Math.round((offset * 10.0d) / 3600000.0d);
        Double.isNaN(dRound);
        this.i = dRound / 10.0d;
        SensorManager sensorManager = (SensorManager) contextY.getSystemService("sensor");
        this.j = (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
        if (com.applovin.impl.sdk.utils.h.f()) {
            LocaleList locales = contextY.getResources().getConfiguration().getLocales();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.k = sb.toString();
        }
        try {
            this.l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.n = new g();
        this.m = new a();
    }

    public b a() {
        return F.get();
    }

    protected d.a b() {
        return E.get();
    }

    protected Integer c() {
        return G.get();
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.s.1
            @Override // java.lang.Runnable
            public void run() {
                s.E.set(com.applovin.impl.sdk.utils.d.a(context));
                if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.s.1.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                s.F.set(new b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        y.f("DataProvider", "Could not collect AppSet ID.");
                    }
                }
            }
        }).start();
    }

    public d.a d() {
        d.a aVarA = com.applovin.impl.sdk.utils.d.a(this.D);
        if (aVarA == null) {
            return new d.a();
        }
        if (((Boolean) this.C.a(com.applovin.impl.sdk.c.b.dI)).booleanValue()) {
            if (aVarA.a() && !((Boolean) this.C.a(com.applovin.impl.sdk.c.b.dH)).booleanValue()) {
                aVarA.a("");
            }
            E.set(aVarA);
        } else {
            aVarA = new d.a();
        }
        boolean z = false;
        if (StringUtils.isValidString(aVarA.b())) {
            List<String> testDeviceAdvertisingIds = this.C.C().getTestDeviceAdvertisingIds();
            if (testDeviceAdvertisingIds != null && testDeviceAdvertisingIds.contains(aVarA.b())) {
                z = true;
            }
            this.o = z;
        } else {
            this.o = false;
        }
        return aVarA;
    }

    protected void e() {
        this.C.M().a(new com.applovin.impl.sdk.e.f(this.C, new f.a() { // from class: com.applovin.impl.sdk.s.2
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(d.a aVar) {
                s.E.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.C.M().a(new com.applovin.impl.sdk.e.z(this.C, true, new Runnable() { // from class: com.applovin.impl.sdk.s.3
            @Override // java.lang.Runnable
            public void run() {
                s.G.set(s.this.c.b());
            }
        }), o.a.CACHING_OTHER);
    }

    protected String f() {
        e eVar = this.u;
        if (eVar == null || eVar.a()) {
            e eVar2 = new e(com.applovin.impl.sdk.utils.i.f(this.C), this.B);
            this.u = eVar2;
            return (String) eVar2.b;
        }
        return (String) this.u.b;
    }

    protected Long g() {
        e eVar = this.q;
        if (eVar == null || eVar.a()) {
            try {
                e eVar2 = new e(Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.z);
                this.q = eVar2;
                Long l = (Long) eVar2.b;
                l.longValue();
                return l;
            } catch (Throwable th) {
                this.C.L();
                if (!y.a()) {
                    return null;
                }
                this.C.L().b("DataProvider", "Unable to collect free space.", th);
                return null;
            }
        }
        Long l2 = (Long) this.q.b;
        l2.longValue();
        return l2;
    }

    protected Float h() {
        e eVar = this.s;
        if (eVar == null || eVar.a()) {
            if (this.C.ac() == null) {
                return null;
            }
            e eVar2 = new e(Float.valueOf(this.C.ac().c()), this.w);
            this.s = eVar2;
            Float f2 = (Float) eVar2.b;
            f2.floatValue();
            return f2;
        }
        Float f3 = (Float) this.s.b;
        f3.floatValue();
        return f3;
    }

    protected Float i() {
        e eVar = this.t;
        if (eVar == null || eVar.a()) {
            if (this.C.ac() == null) {
                return null;
            }
            e eVar2 = new e(Float.valueOf(this.C.ac().b()), this.w);
            this.t = eVar2;
            Float f2 = (Float) eVar2.b;
            f2.floatValue();
            return f2;
        }
        Float f3 = (Float) this.t.b;
        f3.floatValue();
        return f3;
    }

    protected Integer j() {
        e eVar = this.v;
        if (eVar == null || eVar.a()) {
            try {
                e eVar2 = new e(Integer.valueOf((int) ((Settings.System.getInt(this.D.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.x);
                this.v = eVar2;
                Integer num = (Integer) eVar2.b;
                num.intValue();
                return num;
            } catch (Settings.SettingNotFoundException e2) {
                this.C.L();
                if (!y.a()) {
                    return null;
                }
                this.C.L().b("DataProvider", "Unable to collect screen brightness", e2);
                return null;
            }
        }
        Integer num2 = (Integer) this.v.b;
        num2.intValue();
        return num2;
    }

    protected long k() {
        List listAsList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.D.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j2 = listAsList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (listAsList.contains("SelectToSpeakService")) {
            j2 |= 512;
        }
        if (listAsList.contains("SoundAmplifierService")) {
            j2 |= 2;
        }
        if (listAsList.contains("SpeechToTextAccessibilityService")) {
            j2 |= 128;
        }
        if (listAsList.contains("SwitchAccessService")) {
            j2 |= 4;
        }
        if ((this.D.getResources().getConfiguration().uiMode & 48) == 32) {
            j2 |= 1024;
        }
        if (b("accessibility_enabled")) {
            j2 |= 8;
        }
        if (b("touch_exploration_enabled")) {
            j2 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (b("accessibility_display_inversion_enabled")) {
                j2 |= 32;
            }
            if (b("skip_first_use_hints")) {
                j2 |= 64;
            }
        }
        if (b("lock_screen_allow_remote_input")) {
            j2 |= 2048;
        }
        if (b("enabled_accessibility_audio_description_by_default")) {
            j2 |= 4096;
        }
        if (b("accessibility_shortcut_on_lock_screen")) {
            j2 |= 8192;
        }
        if (b("wear_talkback_enabled")) {
            j2 |= 16384;
        }
        if (b("hush_gesture_used")) {
            j2 |= 32768;
        }
        if (b("high_text_contrast_enabled")) {
            j2 |= 65536;
        }
        if (b("accessibility_display_magnification_enabled")) {
            j2 |= 131072;
        }
        if (b("accessibility_display_magnification_navbar_enabled")) {
            j2 |= 262144;
        }
        if (b("accessibility_captioning_enabled")) {
            j2 |= 524288;
        }
        if (b("accessibility_display_daltonizer_enabled")) {
            j2 |= 1048576;
        }
        if (b("accessibility_autoclick_enabled")) {
            j2 |= 2097152;
        }
        if (b("accessibility_large_pointer_icon")) {
            j2 |= 4194304;
        }
        if (b("reduce_bright_colors_activated")) {
            j2 |= 8388608;
        }
        if (b("reduce_bright_colors_persist_across_reboots")) {
            j2 |= 16777216;
        }
        if (b("tty_mode_enabled")) {
            j2 |= 33554432;
        }
        return b("rtt_calling_mode") ? j2 | 67108864 : j2;
    }

    protected float l() {
        try {
            return Settings.System.getFloat(this.D.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            this.C.L();
            if (!y.a()) {
                return -1.0f;
            }
            this.C.L().b("DataProvider", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    protected boolean m() {
        e eVar = this.r;
        if (eVar == null || eVar.a()) {
            e eVar2 = new e(Boolean.valueOf(Utils.isVPNConnected()), this.z);
            this.r = eVar2;
            return ((Boolean) eVar2.b).booleanValue();
        }
        return ((Boolean) this.r.b).booleanValue();
    }

    protected boolean n() {
        ConnectivityManager connectivityManager;
        if (!com.applovin.impl.sdk.utils.h.f() || (connectivityManager = (ConnectivityManager) this.D.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getRestrictBackgroundStatus() == 3;
        } catch (Throwable th) {
            this.C.L();
            if (y.a()) {
                this.C.L().b("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    protected boolean o() {
        try {
            if (!H()) {
                if (!I()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean H() {
        String str = Build.TAGS;
        return str != null && str.contains(a("lz}$blpz"));
    }

    private boolean I() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(a(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    private String a(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    private boolean b(String str) {
        try {
            return Settings.Secure.getInt(this.D.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1427a;
        private final int b;

        public b(String str, int i) {
            this.f1427a = str;
            this.b = i;
        }

        public String a() {
            return this.f1427a;
        }

        public int b() {
            return this.b;
        }
    }

    protected class i {
        private final PowerManager b;

        private i() {
            this.b = (PowerManager) s.this.D.getSystemService("power");
        }

        protected Integer a() {
            if (s.this.p == null || s.this.p.a()) {
                if (this.b == null || !com.applovin.impl.sdk.utils.h.d()) {
                    return null;
                }
                s sVar = s.this;
                sVar.p = new e(Integer.valueOf(this.b.isPowerSaveMode() ? 1 : 0), s.this.y);
                Integer num = (Integer) s.this.p.b;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) s.this.p.b;
            num2.intValue();
            return num2;
        }
    }

    protected class j {
        private final TelephonyManager b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private e h;

        public String b() {
            return this.d;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.f;
        }

        public String e() {
            return this.g;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) s.this.D.getSystemService("phone");
            this.b = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.d = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.e = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect carrier", th);
                }
            }
            try {
                this.c = this.b.getNetworkOperator();
            } catch (Throwable th2) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect get network operator", th2);
                }
            }
            String str = this.c;
            if (str == null) {
                return;
            }
            int iMin = Math.min(3, str.length());
            this.f = this.c.substring(0, iMin);
            this.g = this.c.substring(iMin);
        }

        protected Integer a() {
            e eVar = this.h;
            if (eVar == null || eVar.a()) {
                if (!com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", s.this.D) || this.b == null || !com.applovin.impl.sdk.utils.h.f()) {
                    return null;
                }
                e eVar2 = new e(Integer.valueOf(this.b.getDataNetworkType()), s.this.B);
                this.h = eVar2;
                Integer num = (Integer) eVar2.b;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) this.h.b;
            num2.intValue();
            return num2;
        }
    }

    protected class d {
        private e b;
        private e c;
        private final Intent d;
        private BatteryManager e;

        private d() {
            this.d = s.this.D.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (com.applovin.impl.sdk.utils.h.d()) {
                this.e = (BatteryManager) s.this.D.getSystemService("batterymanager");
            }
        }

        protected Integer a() {
            int intProperty;
            BatteryManager batteryManager;
            e eVar = this.b;
            if (eVar == null || eVar.a()) {
                if (com.applovin.impl.sdk.utils.h.d() && (batteryManager = this.e) != null) {
                    intProperty = batteryManager.getIntProperty(4);
                } else {
                    Intent intent = this.d;
                    if (intent == null) {
                        return null;
                    }
                    int intExtra = intent.getIntExtra("level", -1);
                    int intExtra2 = this.d.getIntExtra("scale", -1);
                    if (intExtra < 0 || intExtra2 < 0) {
                        return null;
                    }
                    intProperty = (int) ((intExtra / intExtra2) * 100.0f);
                }
                e eVar2 = new e(Integer.valueOf(intProperty), s.this.y);
                this.b = eVar2;
                Integer num = (Integer) eVar2.b;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) this.b.b;
            num2.intValue();
            return num2;
        }

        protected Integer b() {
            int intExtra;
            BatteryManager batteryManager;
            e eVar = this.c;
            if (eVar == null || eVar.a()) {
                if (com.applovin.impl.sdk.utils.h.g() && (batteryManager = this.e) != null) {
                    intExtra = batteryManager.getIntProperty(6);
                } else {
                    Intent intent = this.d;
                    if (intent == null || (intExtra = intent.getIntExtra("status", -1)) < 0) {
                        return null;
                    }
                }
                e eVar2 = new e(Integer.valueOf(intExtra), s.this.y);
                this.c = eVar2;
                Integer num = (Integer) eVar2.b;
                num.intValue();
                return num;
            }
            Integer num2 = (Integer) this.c.b;
            num2.intValue();
            return num2;
        }
    }

    protected class c {
        private e b;
        private e c;
        private e d;
        private final AudioManager e;

        private c() {
            this.e = (AudioManager) s.this.D.getSystemService("audio");
        }

        protected int a() {
            e eVar = this.d;
            if (eVar == null || eVar.a()) {
                s sVar = s.this;
                e eVar2 = new e(Integer.valueOf(sVar.C.ad().a()), s.this.y);
                this.d = eVar2;
                return ((Integer) eVar2.b).intValue();
            }
            return ((Integer) this.d.b).intValue();
        }

        protected Integer b() {
            e eVar = this.b;
            if (eVar == null || eVar.a()) {
                if (this.e == null) {
                    return null;
                }
                try {
                    e eVar2 = new e(Integer.valueOf((int) (this.e.getStreamVolume(3) * ((Float) s.this.C.a(com.applovin.impl.sdk.c.b.eh)).floatValue())), s.this.x);
                    this.b = eVar2;
                    Integer num = (Integer) eVar2.b;
                    num.intValue();
                    return num;
                } catch (Throwable th) {
                    s.this.C.L();
                    if (y.a()) {
                        s.this.C.L().b("DataProvider", "Unable to collect device volume", th);
                    }
                    return null;
                }
            }
            Integer num2 = (Integer) this.b.b;
            num2.intValue();
            return num2;
        }

        protected String c() {
            e eVar = this.c;
            if (eVar == null || eVar.a()) {
                if (this.e == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                if (com.applovin.impl.sdk.utils.h.e()) {
                    for (AudioDeviceInfo audioDeviceInfo : this.e.getDevices(2)) {
                        sb.append(audioDeviceInfo.getType());
                        sb.append(",");
                    }
                } else {
                    if (this.e.isWiredHeadsetOn()) {
                        sb.append("3,");
                    }
                    if (this.e.isBluetoothScoOn()) {
                        sb.append("7,");
                    }
                    if (this.e.isBluetoothA2dpOn()) {
                        sb.append(8);
                    }
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                String string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    s.this.C.L();
                    if (y.a()) {
                        s.this.C.L().b("DataProvider", "No sound outputs detected");
                    }
                }
                e eVar2 = new e(string, r3.z);
                this.c = eVar2;
                return (String) eVar2.b;
            }
            return (String) this.c.b;
        }
    }

    protected class f {
        private int b;
        private int c;
        private int d;
        private float e;
        private float f;
        private float g;
        private double h;

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public float d() {
            return this.e;
        }

        public float e() {
            return this.f;
        }

        public float f() {
            return this.g;
        }

        public double g() {
            return this.h;
        }

        private f() {
            DisplayMetrics displayMetrics = s.this.D.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.g = displayMetrics.density;
            this.e = displayMetrics.xdpi;
            this.f = displayMetrics.ydpi;
            this.d = displayMetrics.densityDpi;
            Point pointA = com.applovin.impl.sdk.utils.h.a(s.this.D);
            this.b = pointA.x;
            this.c = pointA.y;
            double dSqrt = Math.sqrt(Math.pow(this.b, 2.0d) + Math.pow(this.c, 2.0d));
            double d = this.e;
            Double.isNaN(d);
            this.h = dSqrt / d;
        }
    }

    protected class h {
        private long b;
        private e c;
        private e d;
        private e e;
        private final ActivityManager f;

        public long d() {
            return this.b;
        }

        private h() {
            ActivityManager activityManager = (ActivityManager) s.this.D.getSystemService("activity");
            this.f = activityManager;
            if (activityManager == null) {
                return;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                activityManager.getMemoryInfo(memoryInfo);
                this.b = memoryInfo.totalMem;
            } catch (Throwable th) {
                s.this.C.L();
                if (y.a()) {
                    s.this.C.L().b("DataProvider", "Unable to collect memory info.", th);
                }
            }
        }

        protected Long a() {
            e eVar = this.c;
            if (eVar == null || eVar.a()) {
                if (this.f == null) {
                    return null;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                try {
                    this.f.getMemoryInfo(memoryInfo);
                    e eVar2 = new e(Long.valueOf(memoryInfo.availMem), s.this.w);
                    this.c = eVar2;
                    Long l = (Long) eVar2.b;
                    l.longValue();
                    return l;
                } catch (Throwable th) {
                    s.this.C.L();
                    if (y.a()) {
                        s.this.C.L().b("DataProvider", "Unable to collect available memory.", th);
                    }
                    return null;
                }
            }
            Long l2 = (Long) this.c.b;
            l2.longValue();
            return l2;
        }

        protected Long b() {
            e eVar = this.d;
            if (eVar == null || eVar.a()) {
                if (this.f == null) {
                    return null;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                try {
                    this.f.getMemoryInfo(memoryInfo);
                    e eVar2 = new e(Long.valueOf(memoryInfo.threshold), s.this.w);
                    this.d = eVar2;
                    Long l = (Long) eVar2.b;
                    l.longValue();
                    return l;
                } catch (Throwable th) {
                    s.this.C.L();
                    if (y.a()) {
                        s.this.C.L().b("DataProvider", "Unable to collect low memory threshold.", th);
                    }
                    return null;
                }
            }
            Long l2 = (Long) this.d.b;
            l2.longValue();
            return l2;
        }

        protected Boolean c() {
            e eVar = this.e;
            if (eVar == null || eVar.a()) {
                if (this.f == null) {
                    return null;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                try {
                    this.f.getMemoryInfo(memoryInfo);
                    e eVar2 = new e(Boolean.valueOf(memoryInfo.lowMemory), s.this.w);
                    this.e = eVar2;
                    Boolean bool = (Boolean) eVar2.b;
                    bool.booleanValue();
                    return bool;
                } catch (Throwable th) {
                    s.this.C.L();
                    if (y.a()) {
                        s.this.C.L().b("DataProvider", "Unable to collect has low memory.", th);
                    }
                    return null;
                }
            }
            Boolean bool2 = (Boolean) this.e.b;
            bool2.booleanValue();
            return bool2;
        }
    }

    public class a {
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final Long g;
        private final long h;
        private final int i;
        private final int j;

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }

        public Long g() {
            return this.g;
        }

        public long h() {
            return this.h;
        }

        public int i() {
            return this.i;
        }

        public int j() {
            return this.j;
        }

        private a() throws PackageManager.NameNotFoundException {
            PackageManager packageManager = s.this.D.getPackageManager();
            ApplicationInfo applicationInfo = s.this.D.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(s.this.D.getPackageName(), 0);
            this.b = packageManager.getApplicationLabel(applicationInfo).toString();
            this.c = packageInfo.versionName;
            this.i = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.d = str;
            this.e = StringUtils.toShortSHA1Hash(str);
            this.h = file.lastModified();
            this.g = Long.valueOf(packageInfo.firstInstallTime);
            this.j = applicationInfo.targetSdkVersion;
            this.f = packageManager.getInstallerPackageName(str);
        }

        protected Long a() {
            Long l = (Long) s.this.C.a(com.applovin.impl.sdk.c.d.g);
            if (l != null) {
                return l;
            }
            s.this.C.a(com.applovin.impl.sdk.c.d.g, Long.valueOf(this.h));
            return null;
        }
    }

    public class g {
        private final SharedPreferences b;

        private g() {
            this.b = PreferenceManager.getDefaultSharedPreferences(s.this.D);
        }

        public String a() {
            return (String) s.this.C.b(com.applovin.impl.sdk.c.d.q, null, this.b);
        }

        protected Object b() {
            String strA = com.applovin.impl.sdk.c.d.r.a();
            if (!this.b.contains(strA)) {
                return null;
            }
            String str = (String) com.applovin.impl.sdk.c.e.a(strA, "", String.class, this.b);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(strA, Integer.MAX_VALUE, Integer.class, this.b);
            Long l = (Long) com.applovin.impl.sdk.c.e.a(strA, Long.MAX_VALUE, Long.class, this.b);
            return StringUtils.isValidString(str) ? str : (num == null || num.intValue() == Integer.MAX_VALUE) ? (l == null || l.longValue() == Long.MAX_VALUE) ? (Boolean) com.applovin.impl.sdk.c.e.a(strA, false, Boolean.class, this.b) : l : num;
        }
    }

    private class e {
        private final Object b;
        private final long c;

        private e(Object obj, long j) {
            this.b = obj;
            this.c = b() + j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return !((Boolean) s.this.C.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() || this.c - b() <= 0;
        }

        private long b() {
            return System.currentTimeMillis() / 1000;
        }
    }
}
