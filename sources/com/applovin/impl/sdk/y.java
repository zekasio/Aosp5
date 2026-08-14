package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f1510a;
    private final p b;

    y(p pVar) {
        this.b = pVar;
        if (pVar.e()) {
            return;
        }
        f1510a = pVar;
        a("SDK Session Begin");
        AppLovinBroadcastManager.registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.y.1
            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map<String, Object> map) {
                y.this.a("SDK Session End");
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
        lVar.a().a(str).a();
        f("AppLovinSdk", lVar.toString());
    }

    public void a(String str, String str2) {
        if (a(this.b)) {
            a(str, str2, false);
        }
    }

    private void a(String str, String str2, boolean z) {
        int iIntValue;
        if (StringUtils.isValidString(str2) && (iIntValue = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.ar)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * iIntValue;
                int iMin = Math.min(length, i3 + iIntValue);
                if (z) {
                    Log.d(str, str2.substring(i3, iMin));
                } else {
                    b(str, str2.substring(i3, iMin));
                }
            }
        }
    }

    public void b(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void c(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void a(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }

    public void b(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        c(str, str2, null);
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static boolean a() {
        p pVar = f1510a;
        return pVar == null || a(pVar);
    }

    public static boolean a(p pVar) {
        return pVar != null && pVar.N().d();
    }

    public static void j(String str, String str2) {
        f(str, str2);
    }
}
