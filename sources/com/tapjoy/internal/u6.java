package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCorePlacement;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.r8;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class u6 extends g7 {
    public static u6 p;
    public final z6 d;
    public final String e;
    public final q7 f;
    public boolean g;
    public boolean h;
    public long i;
    public Context j;
    public r8 k;
    public Activity l;
    public a7 m;
    public Handler n;
    public Runnable o;

    public class a implements r8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1922a;
        public final /* synthetic */ a7 b;

        public a(Activity activity, a7 a7Var) {
            this.f1922a = activity;
            this.b = a7Var;
        }

        public void a(a8 a8Var) {
            if (!TextUtils.isEmpty(a8Var.h)) {
                ((TJCorePlacement.f) u6.this.b).a(this.f1922a, a8Var.h, com.tapjoy.internal.a.a(a8Var.i));
                u6.this.f1806a = true;
            } else if (!TextUtils.isEmpty(a8Var.g)) {
                g7.a(this.f1922a, a8Var.g);
            }
            this.b.a(u6.this.e, null);
            if (a8Var.j) {
                u6.a(u6.this);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u6.a(u6.this);
        }
    }

    public u6(z6 z6Var, String str, q7 q7Var, Context context) {
        this.d = z6Var;
        this.e = str;
        this.f = q7Var;
        this.j = context;
    }

    @Override // com.tapjoy.internal.g7
    public boolean a() {
        return this.f.a();
    }

    @Override // com.tapjoy.internal.g7
    public void b() throws Throwable {
        Iterator<b8> it = this.f.f1890a.iterator();
        while (it.hasNext()) {
            for (a8 a8Var : it.next().c) {
                y7 y7Var = a8Var.k;
                if (y7Var != null) {
                    y7Var.b();
                }
                y7 y7Var2 = a8Var.l;
                if (y7Var2 != null) {
                    y7Var2.b();
                }
            }
        }
    }

    @Override // com.tapjoy.internal.g7
    public void a(a7 a7Var) {
        this.m = a7Var;
        Activity activityA = p6.a();
        this.l = activityA;
        if (activityA != null && !activityA.isFinishing()) {
            try {
                a(this.l, a7Var);
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity activityA2 = com.tapjoy.internal.a.a(this.j);
        this.l = activityA2;
        if (activityA2 != null && !activityA2.isFinishing()) {
            try {
                a(this.l, a7Var);
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        com.tapjoy.internal.a.a("Failed to show the content for \"%s\". No usable activity found.", this.e);
        a7Var.a(this.e, this.c, null);
    }

    public final void a(Activity activity, a7 a7Var) {
        if (this.g) {
            TapjoyLog.e("com.tapjoy.internal.u6", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.g = true;
        this.h = true;
        p = this;
        this.k = new r8(activity, this.f, new a(activity, a7Var));
        Window window = activity.getWindow();
        r8 r8Var = this.k;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        Window.Callback callback = window.getCallback();
        window.setCallback(null);
        window.addContentView(r8Var, layoutParams);
        window.setCallback(callback);
        this.i = SystemClock.elapsedRealtime();
        z6 z6Var = this.d;
        z6Var.g.a(this.f.b);
        a7Var.d(this.e);
        if (this.f.c > 0.0f) {
            this.n = new Handler(Looper.getMainLooper());
            b bVar = new b();
            this.o = bVar;
            this.n.postDelayed(bVar, (long) (this.f.c * 1000.0f));
        }
    }

    public static /* synthetic */ void a(u6 u6Var) {
        a7 a7Var;
        if (u6Var.h) {
            u6Var.h = false;
            Handler handler = u6Var.n;
            if (handler != null) {
                handler.removeCallbacks(u6Var.o);
                u6Var.o = null;
                u6Var.n = null;
            }
            if (p == u6Var) {
                p = null;
            }
            u6Var.d.a(u6Var.f.b, SystemClock.elapsedRealtime() - u6Var.i);
            if (!u6Var.f1806a && (a7Var = u6Var.m) != null) {
                a7Var.a(u6Var.e, u6Var.c, null);
                u6Var.m = null;
            }
            ViewGroup viewGroup = (ViewGroup) u6Var.k.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(u6Var.k);
            }
            u6Var.k = null;
            Activity activity = u6Var.l;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
            u6Var.l = null;
        }
    }
}
