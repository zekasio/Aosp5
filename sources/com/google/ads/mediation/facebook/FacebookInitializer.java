package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class FacebookInitializer implements AudienceNetworkAds.InitListener {
    private static FacebookInitializer instance;
    private boolean mIsInitializing = false;
    private boolean mIsInitialized = false;
    private final ArrayList<Listener> mListeners = new ArrayList<>();

    interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    static FacebookInitializer getInstance() {
        if (instance == null) {
            instance = new FacebookInitializer();
        }
        return instance;
    }

    private FacebookInitializer() {
    }

    void initialize(Context context, String str, Listener listener) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        getInstance().initialize(context, arrayList, listener);
    }

    void initialize(Context context, ArrayList<String> arrayList, Listener listener) {
        if (this.mIsInitializing) {
            this.mListeners.add(listener);
        } else {
            if (this.mIsInitialized) {
                listener.onInitializeSuccess();
                return;
            }
            this.mIsInitializing = true;
            getInstance().mListeners.add(listener);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.11.0.1").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.mIsInitializing = false;
        this.mIsInitialized = initResult.isSuccess();
        for (Listener listener : this.mListeners) {
            if (initResult.isSuccess()) {
                listener.onInitializeSuccess();
            } else {
                listener.onInitializeError(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook"));
            }
        }
        this.mListeners.clear();
    }
}
