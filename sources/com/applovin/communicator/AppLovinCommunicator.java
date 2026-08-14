package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AppLovinCommunicator f12a;
    private static final Object b = new Object();
    private p c;
    private y d;
    private final a e;
    private final MessagingServiceImpl f;

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (b) {
            if (f12a == null) {
                f12a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f12a;
    }

    private AppLovinCommunicator(Context context) {
        this.e = new a(context);
        this.f = new MessagingServiceImpl(context);
    }

    public boolean hasSubscriber(String str) {
        return this.e.a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (!this.e.a(appLovinCommunicatorSubscriber, str)) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.e.b(appLovinCommunicatorSubscriber, str);
        }
    }

    public boolean respondsToTopic(String str) {
        return this.c.ab().c(str);
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f;
    }

    public void a(p pVar) {
        this.c = pVar;
        this.d = pVar.L();
        a("Attached SDK instance: " + pVar + "...");
    }

    private void a(String str) {
        if (this.d == null || !y.a()) {
            return;
        }
        this.d.b("AppLovinCommunicator", str);
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.c + '}';
    }
}
