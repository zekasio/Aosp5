package com.tapjoy.internal;

import android.content.Context;
import androidx.work.WorkRequest;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyLog;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x5<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile x5<R>.a f1942a;

    public abstract TJPlacement a(Context context, TJPlacementListener tJPlacementListener, R r);

    public x5<R>.a a(R r) {
        return new a(r, new j5(WorkRequest.MIN_BACKOFF_MILLIS));
    }

    public abstract String b(R r);

    public boolean b() {
        return c(null);
    }

    public boolean c(R r) {
        x5<R>.a aVarA;
        if (!a()) {
            return false;
        }
        synchronized (this) {
            if (this.f1942a == null) {
                aVarA = a(r);
                this.f1942a = aVarA;
            } else {
                aVarA = null;
            }
        }
        if (aVarA == null) {
            return false;
        }
        aVarA.a();
        return true;
    }

    public boolean a() {
        return !TapjoyConnectCore.isFullScreenViewOpen();
    }

    public boolean a(Observer observer) {
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            s5.e.addObserver(observer);
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                return false;
            }
            s5.e.deleteObserver(observer);
        }
        if (z6.r.e()) {
            return true;
        }
        s5.c.addObserver(observer);
        if (!z6.r.e()) {
            return false;
        }
        s5.c.deleteObserver(observer);
        return true;
    }

    public final void a(x5<R>.a aVar) {
        synchronized (this) {
            if (this.f1942a == aVar) {
                this.f1942a = null;
            }
        }
    }

    public class a implements Observer, TJPlacementListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final R f1943a;
        public final j5 b;
        public volatile boolean c;
        public TJPlacement d;

        public a(R r, j5 j5Var) {
            this.f1943a = r;
            this.b = j5Var;
        }

        public void a() {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                if (this.b.a()) {
                    a("Timed out");
                    return;
                }
                if (!TapjoyConnectCore.isConnected()) {
                    s5.f1906a.addObserver(this);
                    if (!TapjoyConnectCore.isConnected()) {
                        return;
                    } else {
                        s5.f1906a.deleteObserver(this);
                    }
                }
                TJPlacement tJPlacement = this.d;
                if (tJPlacement == null) {
                    if (!x5.this.a()) {
                        a("Cannot request");
                        return;
                    }
                    TJPlacement tJPlacementA = x5.this.a(TapjoyConnectCore.getContext(), this, this.f1943a);
                    this.d = tJPlacementA;
                    tJPlacementA.requestContent();
                    return;
                }
                if (tJPlacement.isContentReady()) {
                    if (x5.this.a((Observer) this)) {
                        this.d.showContent();
                        a(null);
                    }
                }
            }
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onClick(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentDismiss(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentReady(TJPlacement tJPlacement) {
            a();
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentShow(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            a(tJError.message);
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestSuccess(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            a();
        }

        public void a(String str) {
            synchronized (this) {
                String strB = x5.this.b(this.f1943a);
                if (str == null) {
                    TapjoyLog.i("SystemPlacement", "Placement " + strB + " is presented now");
                } else {
                    TapjoyLog.i("SystemPlacement", "Cannot show placement " + strB + " now (" + str + ")");
                }
                this.c = true;
                this.d = null;
                s5.f1906a.deleteObserver(this);
                s5.e.deleteObserver(this);
                s5.c.deleteObserver(this);
            }
            x5.this.a(this);
        }
    }
}
