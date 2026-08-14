package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f925a;
    private final Set<b> b = new HashSet(32);
    private final Object c = new Object();

    public a(Context context) {
        this.f925a = context;
    }

    public boolean a(String str) {
        synchronized (this.c) {
            Iterator<b> it = this.b.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            y.i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.c) {
            b bVarA = a(str, appLovinCommunicatorSubscriber);
            if (bVarA != null) {
                y.i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                if (!bVarA.c()) {
                    bVarA.a(true);
                    AppLovinBroadcastManager.registerReceiver(bVarA, new IntentFilter(str));
                }
                return true;
            }
            b bVar = new b(str, appLovinCommunicatorSubscriber);
            this.b.add(bVar);
            AppLovinBroadcastManager.registerReceiver(bVar, new IntentFilter(str));
            return true;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        b bVarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.c) {
                bVarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (bVarA != null) {
                bVarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(bVarA);
            }
        }
    }

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.b) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }
}
