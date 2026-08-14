package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f728a;
    private final y b;
    private final WeakReference<AppLovinFullscreenActivity> c;
    private final AtomicBoolean d = new AtomicBoolean();
    private Messenger e;

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, p pVar) {
        this.f728a = pVar;
        this.b = pVar.L();
        this.c = new WeakReference<>(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.d.compareAndSet(false, true)) {
            if (y.a()) {
                this.b.b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            messageObtain.replyTo = new Messenger(new b());
            try {
                if (y.a()) {
                    this.b.b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.e.send(messageObtain);
            } catch (RemoteException e) {
                if (y.a()) {
                    this.b.b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.d.compareAndSet(true, false) && y.a()) {
            this.b.b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.c.get();
        if (appLovinFullscreenActivity != null) {
            if (y.a()) {
                this.b.b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (y.a()) {
            this.b.e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f728a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.p(jSONObject, d.a(string), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.c.get();
                    if (appLovinFullscreenActivity != null) {
                        y unused = a.this.b;
                        if (y.a()) {
                            a.this.b.b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C0046a c0046a = new C0046a();
                        com.applovin.impl.adview.activity.b.a.a((e) appLovinAd, c0046a, c0046a, c0046a, null, a.this.f728a, appLovinFullscreenActivity, new a.InterfaceC0048a() { // from class: com.applovin.impl.adview.activity.a.1.1
                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                            public void a(com.applovin.impl.adview.activity.b.a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.d();
                            }

                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0048a
                            public void a(String str2, Throwable th) {
                                com.applovin.impl.adview.p.a((e) appLovinAd, c0046a, str2, th, appLovinFullscreenActivity);
                            }
                        });
                        return;
                    }
                    y unused2 = a.this.b;
                    if (y.a()) {
                        a.this.b.e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i) {
                    a.this.a();
                }
            }, this.f728a));
        } catch (JSONException e) {
            if (y.a()) {
                this.b.b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            a();
        }
    }

    private static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f732a;

        private b(a aVar) {
            this.f732a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what == FullscreenAdService.b.AD.a() && (aVar = this.f732a.get()) != null) {
                aVar.a(com.applovin.impl.sdk.ad.b.a(message.getData().getInt("ad_source")), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    private class C0046a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0046a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }

        private void a(FullscreenAdService.b bVar) {
            a(null, bVar);
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message messageObtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.e.send(messageObtain);
            } catch (RemoteException e) {
                y unused = a.this.b;
                if (y.a()) {
                    a.this.b.b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.a() + ")", e);
                }
            }
        }
    }
}
