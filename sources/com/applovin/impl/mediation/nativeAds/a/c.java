package com.applovin.impl.mediation.nativeAds.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<View, Integer> f1162a = new WeakHashMap<>();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference<View> e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    public interface a {
        void a(int i, int i2);
    }

    public c(View view) {
        this.e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mediation.nativeAds.a.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
            this.f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f = null;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(View view, int i) {
        synchronized (this.b) {
            this.f1162a.put(view, Integer.valueOf(i));
            b();
        }
    }

    public void a(View view) {
        synchronized (this.b) {
            this.f1162a.remove(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.nativeAds.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this.b) {
                    c.this.d = false;
                    int iMin = -1;
                    int iMax = -1;
                    for (Map.Entry entry : c.this.f1162a.entrySet()) {
                        if (c.this.b((View) entry.getKey())) {
                            Integer num = (Integer) entry.getValue();
                            if (iMin == -1 && iMax == -1) {
                                iMin = num.intValue();
                                iMax = num.intValue();
                            } else {
                                iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                                iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                            }
                        }
                    }
                    if (c.this.g != null) {
                        c.this.g.a(iMin, iMax);
                    }
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
