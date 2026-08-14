package com.tapjoy.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.t8;
import com.tapjoy.internal.u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e7 extends g7 {
    public static e7 l;
    public final z6 d;
    public final String e;
    public final v7 f;
    public com.tapjoy.internal.c g;
    public boolean h;
    public long i;
    public Context j;
    public boolean k = false;

    public class a extends TJContentActivity.AbstractContentProducer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a7 f1790a;

        public a(a7 a7Var) {
            this.f1790a = a7Var;
        }

        @Override // com.tapjoy.TJContentActivity.AbstractContentProducer, com.tapjoy.TJContentActivity.ContentProducer
        public void dismiss(Activity activity) {
            e7.a(e7.this);
        }

        @Override // com.tapjoy.TJContentActivity.ContentProducer
        public void show(Activity activity) {
            try {
                e7.this.a(activity, this.f1790a);
            } catch (WindowManager.BadTokenException unused) {
                com.tapjoy.internal.a.a("Failed to show the content for \"%s\" caused by invalid activity", e7.this.e);
                a7 a7Var = this.f1790a;
                e7 e7Var = e7.this;
                a7Var.a(e7Var.e, e7Var.c, null);
            }
        }
    }

    public class b implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a7 f1791a;

        public b(a7 a7Var) {
            this.f1791a = a7Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f1791a.a(e7.this.e);
        }
    }

    public class c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1792a;
        public final /* synthetic */ a7 b;

        public c(Activity activity, a7 a7Var) {
            this.f1792a = activity;
            this.b = a7Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Map<String, Object> map;
            String string;
            i7 i7Var;
            e7.l = null;
            g7.a(this.f1792a, e7.this.f.g);
            e7 e7Var = e7.this;
            e7Var.d.g.a(e7Var.f.k, SystemClock.elapsedRealtime() - e7.this.i);
            e7 e7Var2 = e7.this;
            if (!e7Var2.f1806a) {
                this.b.a(e7Var2.e, e7Var2.c, e7Var2.f.h);
            }
            e7 e7Var3 = e7.this;
            if (e7Var3.k && (map = e7Var3.f.k) != null && map.containsKey("action_id") && (string = e7.this.f.k.get("action_id").toString()) != null && string.length() > 0 && (i7Var = e7.this.d.b) != null) {
                String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                String strB = i7Var.c.b();
                String strB2 = i7Var.b.b();
                if (strB2 == null || !str.equals(strB2)) {
                    i7Var.b.a(str);
                    strB = "";
                }
                if (strB.length() != 0) {
                    if (strB.contains(string)) {
                        string = strB;
                    } else {
                        string = strB.concat("," + string);
                    }
                }
                i7Var.c.a(string);
            }
            Activity activity = this.f1792a;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
        }
    }

    public class d implements t8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1793a;
        public final /* synthetic */ a7 b;

        public d(Activity activity, a7 a7Var) {
            this.f1793a = activity;
            this.b = a7Var;
        }
    }

    public e7(z6 z6Var, String str, v7 v7Var, Context context) {
        this.d = z6Var;
        this.e = str;
        this.f = v7Var;
        this.j = context;
    }

    @Override // com.tapjoy.internal.g7
    public void b() throws Throwable {
        y7 y7Var;
        v7 v7Var = this.f;
        y7 y7Var2 = v7Var.f1932a;
        if (y7Var2 != null) {
            y7Var2.b();
        }
        y7 y7Var3 = v7Var.b;
        if (y7Var3 != null) {
            y7Var3.b();
        }
        v7Var.c.b();
        y7 y7Var4 = v7Var.e;
        if (y7Var4 != null) {
            y7Var4.b();
        }
        y7 y7Var5 = v7Var.f;
        if (y7Var5 != null) {
            y7Var5.b();
        }
        w7 w7Var = v7Var.l;
        if (w7Var == null || (y7Var = w7Var.f1937a) == null) {
            return;
        }
        y7Var.b();
    }

    public final void c() {
        com.tapjoy.internal.c cVar = this.g;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // com.tapjoy.internal.g7
    public boolean a() {
        w7 w7Var;
        y7 y7Var;
        y7 y7Var2;
        y7 y7Var3;
        y7 y7Var4;
        y7 y7Var5;
        v7 v7Var = this.f;
        y7 y7Var6 = v7Var.c;
        return (y7Var6 == null || y7Var6.b == null || ((w7Var = v7Var.l) != null && (y7Var5 = w7Var.f1937a) != null && y7Var5.b == null) || (((y7Var = v7Var.b) == null || (y7Var4 = v7Var.f) == null || y7Var.b == null || y7Var4.b == null) && ((y7Var2 = v7Var.f1932a) == null || (y7Var3 = v7Var.e) == null || y7Var2.b == null || y7Var3.b == null))) ? false : true;
    }

    @Override // com.tapjoy.internal.g7
    public void a(a7 a7Var) {
        Activity activityA = com.tapjoy.internal.a.a(this.j);
        if (activityA != null && !activityA.isFinishing()) {
            try {
                a(activityA, a7Var);
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity activityA2 = p6.a();
        try {
            TJContentActivity.start(z6.r.e, new a(a7Var), (activityA2 == null || (activityA2.getWindow().getAttributes().flags & 1024) == 0) ? false : true);
        } catch (ActivityNotFoundException unused2) {
            if (activityA2 != null && !activityA2.isFinishing()) {
                try {
                    a(activityA2, a7Var);
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    com.tapjoy.internal.a.a("Failed to show the content for \"%s\" caused by no registration of TJContentActivity", this.e);
                    a7Var.a(this.e, this.c, null);
                }
            }
            com.tapjoy.internal.a.a("Failed to show the content for \"%s\" caused by no registration of TJContentActivity", this.e);
            a7Var.a(this.e, this.c, null);
        }
    }

    public final void a(Activity activity, a7 a7Var) {
        if (this.h) {
            TapjoyLog.e("com.tapjoy.internal.e7", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.h = true;
        l = this;
        com.tapjoy.internal.c cVar = new com.tapjoy.internal.c(activity, true);
        this.g = cVar;
        cVar.setOnCancelListener(new b(a7Var));
        this.g.setOnDismissListener(new c(activity, a7Var));
        this.g.setCanceledOnTouchOutside(false);
        s8 s8Var = new s8(activity, this.f, new t8(activity, this.f, new d(activity, a7Var)));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(s8Var, new FrameLayout.LayoutParams(-2, -2, 17));
        this.g.setContentView(frameLayout);
        if (Boolean.FALSE.booleanValue()) {
            this.g.getWindow();
            u.a aVar = u.a.RIGHT;
            v vVar = new v(true);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                x xVarA = u.a();
                xVarA.f1938a = false;
                xVarA.b = 60.0f;
                vVar.b.addAnimation(xVarA.a());
                vVar.b.addAnimation(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f));
                vVar.b.addAnimation(u.b().a(1.0f).b(0.3f).a());
            } else if (iOrdinal == 1) {
                x xVarA2 = u.a();
                xVarA2.f1938a = false;
                xVarA2.b = -60.0f;
                vVar.b.addAnimation(xVarA2.a());
                vVar.b.addAnimation(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f));
                vVar.b.addAnimation(u.b().a(-0.4f).b(0.3f).a());
            } else if (iOrdinal == 2) {
                x xVarA3 = u.a();
                xVarA3.f1938a = true;
                xVarA3.b = -60.0f;
                vVar.b.addAnimation(xVarA3.a());
                vVar.b.addAnimation(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f));
                vVar.b.addAnimation(u.b().a(0.3f).b(1.0f).a());
            } else if (iOrdinal == 3) {
                x xVarA4 = u.a();
                xVarA4.f1938a = true;
                xVarA4.b = 60.0f;
                vVar.b.addAnimation(xVarA4.a());
                vVar.b.addAnimation(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f));
                vVar.b.addAnimation(u.b().a(0.3f).b(-0.4f).a());
            }
            vVar.f1916a.setDuration(600L);
            s8Var.startAnimation(vVar.b);
        }
        this.g.show();
        this.g.getWindow().setLayout(-1, -1);
        if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
            this.g.getWindow().setFlags(1024, 1024);
        }
        this.i = SystemClock.elapsedRealtime();
        z6 z6Var = this.d;
        z6Var.g.a(this.f.k);
        a7Var.d(this.e);
    }

    public static /* synthetic */ void a(e7 e7Var) {
        com.tapjoy.internal.c cVar = e7Var.g;
        if (cVar != null) {
            cVar.dismiss();
        }
    }
}
