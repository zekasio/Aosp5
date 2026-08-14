package com.applovin.impl.communicator;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.y;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {
    private final String b;
    private final WeakReference<AppLovinCommunicatorSubscriber> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f926a = true;
    private final Set<String> d = new LinkedHashSet();
    private final Object e = new Object();

    b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.b = str;
        this.c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.b;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.c.get();
    }

    public boolean c() {
        return this.f926a;
    }

    public void a(boolean z) {
        this.f926a = z;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        boolean z;
        if (b() == null) {
            y.i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.e) {
            if (this.d.contains(communicatorMessageImpl.getUniqueId())) {
                z = false;
            } else {
                this.d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            }
        }
        if (z) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.c.get();
        b bVar = (b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = bVar.c.get();
        if (a().equals(bVar.a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }
}
