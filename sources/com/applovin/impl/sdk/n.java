package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class n implements AppLovinBroadcastManager.Receiver {
    private static AlertDialog b;
    private static final AtomicBoolean c = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f1345a;
    private com.applovin.impl.sdk.utils.p d;

    public interface a {
        void a();

        void b();
    }

    n(o oVar, p pVar) {
        this.f1345a = oVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a(long j, p pVar, a aVar) {
        if (j <= 0) {
            return;
        }
        AlertDialog alertDialog = b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (c.getAndSet(true)) {
                if (j < this.d.a()) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.d.a() + "ms)");
                    }
                    this.d.d();
                } else {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.d.a() + " milliseconds");
                        return;
                    }
                    return;
                }
            }
            pVar.L();
            if (y.a()) {
                pVar.L().b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
            }
            this.d = com.applovin.impl.sdk.utils.p.a(j, pVar, new AnonymousClass1(pVar, aVar));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.n$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f1346a;
        final /* synthetic */ a b;

        AnonymousClass1(p pVar, a aVar) {
            this.f1346a = pVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.f1345a.d()) {
                this.f1346a.L();
                if (y.a()) {
                    this.f1346a.L().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                    return;
                }
                return;
            }
            Activity activityA = this.f1346a.w().a();
            if (activityA == null || !com.applovin.impl.sdk.utils.i.a(p.y())) {
                if (activityA == null) {
                    this.f1346a.L();
                    if (y.a()) {
                        this.f1346a.L().e("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
                    }
                } else {
                    this.f1346a.L();
                    if (y.a()) {
                        this.f1346a.L().e("ConsentAlertManager", "No internet available - rescheduling consent alert...");
                    }
                }
                n.c.set(false);
                n.this.a(((Long) this.f1346a.a(com.applovin.impl.sdk.c.b.aS)).longValue(), this.f1346a, this.b);
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.1.1
                @Override // java.lang.Runnable
                public void run() {
                    AlertDialog unused = n.b = new AlertDialog.Builder(AnonymousClass1.this.f1346a.w().a()).setTitle((CharSequence) AnonymousClass1.this.f1346a.a(com.applovin.impl.sdk.c.b.aT)).setMessage((CharSequence) AnonymousClass1.this.f1346a.a(com.applovin.impl.sdk.c.b.aU)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.f1346a.a(com.applovin.impl.sdk.c.b.aV), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.1.1.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            AnonymousClass1.this.b.a();
                            dialogInterface.dismiss();
                            n.c.set(false);
                        }
                    }).setNegativeButton((CharSequence) AnonymousClass1.this.f1346a.a(com.applovin.impl.sdk.c.b.aW), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.1.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            AnonymousClass1.this.b.b();
                            dialogInterface.dismiss();
                            n.c.set(false);
                            n.this.a(((Long) AnonymousClass1.this.f1346a.a(com.applovin.impl.sdk.c.b.aR)).longValue(), AnonymousClass1.this.f1346a, AnonymousClass1.this.b);
                        }
                    }).create();
                    n.b.show();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (this.d == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.d.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.d.c();
        }
    }
}
