package com.google.ads.mediation.tapjoy;

import android.app.Activity;
import android.util.Log;
import com.tapjoy.TJConnectListener;
import com.tapjoy.Tapjoy;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TapjoyInitializer implements TJConnectListener {
    private static TapjoyInitializer instance;
    private final ArrayList<Listener> initListeners = new ArrayList<>();
    private InitStatus status = InitStatus.UNINITIALIZED;

    private enum InitStatus {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    interface Listener {
        void onInitializeFailed(String str);

        void onInitializeSucceeded();
    }

    static TapjoyInitializer getInstance() {
        if (instance == null) {
            instance = new TapjoyInitializer();
        }
        return instance;
    }

    private TapjoyInitializer() {
    }

    void initialize(Activity activity, String str, Hashtable<String, Object> hashtable, Listener listener) {
        if (this.status.equals(InitStatus.INITIALIZED) || Tapjoy.isConnected()) {
            listener.onInitializeSucceeded();
            return;
        }
        this.initListeners.add(listener);
        if (this.status.equals(InitStatus.INITIALIZING)) {
            return;
        }
        this.status = InitStatus.INITIALIZING;
        Log.i(TapjoyMediationAdapter.TAG, "Connecting to Tapjoy for Tapjoy-AdMob adapter.");
        Tapjoy.connect(activity, str, hashtable, this);
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectSuccess() {
        this.status = InitStatus.INITIALIZED;
        Iterator<Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSucceeded();
        }
        this.initListeners.clear();
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectFailure() {
        this.status = InitStatus.UNINITIALIZED;
        Iterator<Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeFailed("Tapjoy failed to connect.");
        }
        this.initListeners.clear();
    }
}
