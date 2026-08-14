package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f922a;
    private final ScheduledThreadPoolExecutor b = a();

    public MessagingServiceImpl(Context context) {
        this.f922a = context;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(final AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.b.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBroadcastManager.sendBroadcastSync(appLovinCommunicatorMessage, null);
            }
        });
    }

    private ScheduledThreadPoolExecutor a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(5);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
