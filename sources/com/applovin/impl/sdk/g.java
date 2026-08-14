package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import cz.msebera.android.httpclient.client.cache.HeaderConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1327a;
    private final Object b = new Object();
    private final LinkedHashMap<String, Bundle> c = new LinkedHashMap<String, Bundle>() { // from class: com.applovin.impl.sdk.g.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, Bundle> entry) {
            return size() > 16;
        }
    };
    private final Set<a> d = Collections.synchronizedSet(new HashSet());

    public interface a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public g(p pVar) {
        this.f1327a = pVar;
        if (StringUtils.isValidString(a())) {
            AppLovinCommunicator.getInstance(p.y()).subscribe(this, "safedk_ad_info");
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.b) {
            bundle = this.c.get(str);
        }
        return bundle;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.c.remove(str);
        }
    }

    public void a(a aVar) {
        this.d.add(aVar);
    }

    public void b(a aVar) {
        this.d.remove(aVar);
    }

    public static String a() {
        return c("getVersion");
    }

    public static String b() {
        return c("getSdkKey");
    }

    private static String c(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(HeaderConstants.PUBLIC);
            if (bundle == null) {
                this.f1327a.L();
                if (y.a()) {
                    this.f1327a.L().d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle(HeaderConstants.PRIVATE);
            if (bundle2 == null) {
                this.f1327a.L();
                if (y.a()) {
                    this.f1327a.L().d("AppLovinSdk", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) == null) {
                this.f1327a.L();
                if (y.a()) {
                    this.f1327a.L().d("AppLovinSdk", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f1327a.L();
                if (y.a()) {
                    this.f1327a.L().d("AppLovinSdk", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                this.f1327a.L();
                if (y.a()) {
                    this.f1327a.L().b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                }
                this.c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            for (final a aVar : new HashSet(this.d)) {
                this.f1327a.M().a(new com.applovin.impl.sdk.e.z(this.f1327a, new Runnable() { // from class: com.applovin.impl.sdk.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.onCreativeIdGenerated(string, string2);
                    }
                }), o.a.BACKGROUND);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "g";
    }
}
