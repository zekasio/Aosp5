package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1445a = true;
    private static final Object b = new Object();
    private static final Collection<CountDownLatch> c = new HashSet();
    private static boolean d = false;
    private static a e = null;

    public static a a(Context context) {
        return b(context);
    }

    private static a b(Context context) {
        a aVar;
        HashSet hashSet;
        Object obj = b;
        synchronized (obj) {
            if (d) {
                return e;
            }
            Collection<CountDownLatch> collection = c;
            boolean zIsEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                a aVarC = c(context);
                synchronized (obj) {
                    d = true;
                    e = aVarC;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    y.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e2) {
                y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
            }
            synchronized (b) {
                aVar = e;
            }
            return aVar;
        }
    }

    private static a c(Context context) {
        a aVarD = d(context);
        if (aVarD == null) {
            aVarD = e(context);
        }
        return aVarD == null ? new a() : aVarD;
    }

    private static a d(Context context) {
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(zIsLimitAdTrackingEnabled);
                aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0080a.ON : a.EnumC0080a.OFF);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context)) {
                    return null;
                }
                y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        }
        if (AppLovinSdkUtils.isFireOS(context)) {
            return null;
        }
        y.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
        return null;
    }

    public static boolean a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private static a e(Context context) {
        if (f1445a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID)));
                boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z);
                aVar.a(z ? a.EnumC0080a.ON : a.EnumC0080a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                y.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th) {
                y.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f1445a = false;
        return null;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1446a;
        private String b = "";
        private EnumC0080a c = EnumC0080a.NOT_SET;

        public void a(EnumC0080a enumC0080a) {
            this.c = enumC0080a;
        }

        public void a(String str) {
            this.b = str;
        }

        public void a(boolean z) {
            this.f1446a = z;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || a() != aVar.a()) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            EnumC0080a enumC0080aC = c();
            EnumC0080a enumC0080aC2 = aVar.c();
            return enumC0080aC != null ? enumC0080aC.equals(enumC0080aC2) : enumC0080aC2 == null;
        }

        public int hashCode() {
            int i = a() ? 79 : 97;
            String strB = b();
            int iHashCode = ((i + 59) * 59) + (strB == null ? 43 : strB.hashCode());
            EnumC0080a enumC0080aC = c();
            return (iHashCode * 59) + (enumC0080aC != null ? enumC0080aC.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + a() + ", advertisingId=" + b() + ", dntCode=" + c() + ")";
        }

        /* JADX INFO: renamed from: com.applovin.impl.sdk.utils.d$a$a, reason: collision with other inner class name */
        public enum EnumC0080a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");

            private final String d;

            EnumC0080a(String str) {
                this.d = str;
            }

            public String a() {
                return this.d;
            }
        }

        public boolean a() {
            return this.f1446a;
        }

        public String b() {
            return this.b;
        }

        public EnumC0080a c() {
            return this.c;
        }
    }
}
