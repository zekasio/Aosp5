package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.p;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    public enum b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);

        private final int g;

        b(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a()).getBinder();
    }

    private static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                p pVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (pVar == null) {
                    if (Utils.getBooleanForProbability(1)) {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                    super.handleMessage(message);
                    return;
                }
                e eVarF = pVar.f();
                if (message.what == b.AD.a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, eVarF.getRawFullResponse());
                    bundle.putInt("ad_source", eVarF.getSource().a());
                    Message messageObtain = Message.obtain((Handler) null, b.AD.a());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException e) {
                        y.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == b.AD_DISPLAYED.a()) {
                    k.a(pVar.c(), eVarF);
                    return;
                }
                if (message.what == b.AD_CLICKED.a()) {
                    k.a(pVar.e(), eVarF);
                    return;
                }
                if (message.what == b.AD_VIDEO_STARTED.a()) {
                    k.a(pVar.d(), eVarF);
                    return;
                }
                if (message.what == b.AD_VIDEO_ENDED.a()) {
                    Bundle data = message.getData();
                    k.a(pVar.d(), eVarF, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == b.AD_HIDDEN.a()) {
                    k.b(pVar.c(), eVarF);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
