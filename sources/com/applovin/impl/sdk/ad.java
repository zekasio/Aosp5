package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f1220a;
    private final Runnable e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private final WeakReference<View> g;
    private final long h;
    private int k;
    private float l;
    private float m;
    private long n;
    private final Object b = new Object();
    private final Rect c = new Rect();
    private WeakReference<ViewTreeObserver> i = new WeakReference<>(null);
    private WeakReference<View> j = new WeakReference<>(null);
    private long o = Long.MIN_VALUE;
    private final Handler d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public ad(final View view, p pVar, a aVar) {
        this.f1220a = pVar.L();
        this.h = ((Long) pVar.a(com.applovin.impl.sdk.c.b.ci)).longValue();
        this.g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.e = new Runnable() { // from class: com.applovin.impl.sdk.ad.1
            @Override // java.lang.Runnable
            public void run() {
                View view2 = (View) ad.this.g.get();
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                View view3 = (View) ad.this.j.get();
                if (viewGroup == null || view3 == null) {
                    return;
                }
                if (ad.this.b(viewGroup, view3)) {
                    y unused = ad.this.f1220a;
                    if (y.a()) {
                        ad.this.f1220a.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                    }
                    ad.this.a();
                    a aVar2 = (a) weakReference.get();
                    if (aVar2 != null) {
                        aVar2.onLogVisibilityImpression();
                        return;
                    }
                    return;
                }
                ad.this.b();
            }
        };
        this.f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.ad.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ad.this.b();
                ad.this.b(view);
                return true;
            }
        };
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        View viewD;
        if (eVar instanceof com.applovin.impl.mediation.a.b) {
            viewD = eVar.r();
        } else if (!(eVar instanceof com.applovin.impl.mediation.a.d)) {
            return;
        } else {
            viewD = ((com.applovin.impl.mediation.a.d) eVar).D();
        }
        a(eVar.O(), eVar.P(), eVar.R(), eVar.U(), viewD);
    }

    public void a(int i, float f, float f2, long j, View view) {
        synchronized (this.b) {
            if (y.a()) {
                this.f1220a.b("VisibilityTracker", "Tracking visibility for " + view);
            }
            a();
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.j = weakReference;
            this.k = i;
            this.l = f;
            this.m = f2;
            this.n = j;
            a(weakReference.get());
        }
    }

    public void a() {
        synchronized (this.b) {
            this.d.removeMessages(0);
            b(this.g.get());
            this.o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    private void a(View view) {
        View rootView = Utils.getRootView(this.g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            if (y.a()) {
                this.f1220a.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (y.a()) {
                this.f1220a.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.d.postDelayed(this.e, this.h);
    }

    private boolean a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.height());
        if (jPxToDp < this.k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.c.width() * this.c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (!a(view, view2)) {
            return false;
        }
        if (this.o == Long.MIN_VALUE) {
            this.o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.o >= this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        ViewTreeObserver viewTreeObserver = this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f);
            } else if (y.a()) {
                this.f1220a.b("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (y.a()) {
            this.f1220a.b("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.i.clear();
    }
}
