package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.mediation.BuildConfig;
import com.vungle.mediation.VungleNetworkSettings;
import com.vungle.warren.InitCallback;
import com.vungle.warren.Plugin;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.error.VungleException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class VungleInitializer implements InitCallback {
    private static final VungleInitializer instance = new VungleInitializer();
    private final AtomicBoolean mIsInitializing = new AtomicBoolean(false);
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ArrayList<VungleInitializationListener> mInitListeners = new ArrayList<>();

    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    @Override // com.vungle.warren.InitCallback
    public void onAutoCacheAdAvailable(String str) {
    }

    public static VungleInitializer getInstance() {
        return instance;
    }

    private VungleInitializer() {
        Plugin.addWrapperInfo(VungleApiClient.WrapperFramework.admob, BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    public void initialize(final String str, final Context context, VungleInitializationListener vungleInitializationListener) {
        if (Vungle.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
            return;
        }
        if (this.mIsInitializing.getAndSet(true)) {
            this.mInitListeners.add(vungleInitializationListener);
            return;
        }
        VungleNetworkSettings.setVungleSettingsChangedListener(new VungleNetworkSettings.VungleSettingsChangedListener() { // from class: com.google.ads.mediation.vungle.VungleInitializer.1
            @Override // com.vungle.mediation.VungleNetworkSettings.VungleSettingsChangedListener
            public void onVungleSettingsChanged(VungleSettings vungleSettings) {
                if (Vungle.isInitialized()) {
                    VungleInitializer.this.updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
                    Vungle.init(str, context.getApplicationContext(), VungleInitializer.this, vungleSettings);
                }
            }
        });
        updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        Vungle.init(str, context.getApplicationContext(), this, VungleNetworkSettings.getVungleSettings());
        this.mInitListeners.add(vungleInitializationListener);
    }

    @Override // com.vungle.warren.InitCallback
    public void onSuccess() {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleInitializer.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VungleInitializer.this.mInitListeners.iterator();
                while (it.hasNext()) {
                    ((VungleInitializationListener) it.next()).onInitializeSuccess();
                }
                VungleInitializer.this.mInitListeners.clear();
            }
        });
        this.mIsInitializing.set(false);
    }

    @Override // com.vungle.warren.InitCallback
    public void onError(VungleException vungleException) {
        final AdError adError = VungleMediationAdapter.getAdError(vungleException);
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleInitializer.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VungleInitializer.this.mInitListeners.iterator();
                while (it.hasNext()) {
                    ((VungleInitializationListener) it.next()).onInitializeError(adError);
                }
                VungleInitializer.this.mInitListeners.clear();
            }
        });
        this.mIsInitializing.set(false);
    }

    public void updateCoppaStatus(int i) {
        if (i == 0) {
            Vungle.updateUserCoppaStatus(false);
        } else {
            if (i != 1) {
                return;
            }
            Vungle.updateUserCoppaStatus(true);
        }
    }
}
