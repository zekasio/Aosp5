package com.applovin.impl.a.a;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.impl.a.a.b.a.b;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.drive.DriveFile;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements j.a {
    private static WeakReference<MaxCreativeDebuggerActivity> f;
    private static final AtomicBoolean l = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f705a;
    private final Context b;
    private final b e;
    private j h;
    private com.applovin.impl.sdk.utils.p i;
    private int j;
    private boolean k;
    private final List<com.applovin.impl.a.a.a.a> c = new ArrayList(10);
    private final Object d = new Object();
    private WeakReference<View> g = new WeakReference<>(null);

    public a(p pVar) {
        this.f705a = pVar;
        Context contextY = p.y();
        this.b = contextY;
        this.e = new b(contextY);
    }

    public void a() {
        if (c() && this.h == null) {
            j jVar = new j(this.f705a, this);
            this.h = jVar;
            jVar.a();
        }
    }

    public void a(Object obj) {
        if (c() && obj != null) {
            if (!c.a(obj) || c(obj)) {
                if (c.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.d) {
                    this.c.add(0, new com.applovin.impl.a.a.a.a(obj, System.currentTimeMillis()));
                    if (this.c.size() > 10) {
                        this.c.remove(r6.size() - 1);
                    }
                }
            }
        }
    }

    public void b() {
        ArrayList arrayList;
        if (!h() && l.compareAndSet(false, true)) {
            synchronized (this.d) {
                arrayList = new ArrayList(this.c);
            }
            this.e.a(arrayList, this.f705a);
            if (!this.k) {
                i();
                this.k = true;
            }
            Intent intent = new Intent(this.b, (Class<?>) MaxCreativeDebuggerActivity.class);
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            y.f("AppLovinSdk", "Starting Creative Debugger...");
            this.b.startActivity(intent);
            return;
        }
        y.i("AppLovinSdk", "Creative Debugger is already showing");
    }

    public boolean c() {
        return ((Boolean) this.f705a.a(com.applovin.impl.sdk.c.b.bW)).booleanValue() && this.f705a.C().isCreativeDebuggerEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference<MaxCreativeDebuggerActivity> weakReference = f;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof e) {
            format = ((e) obj).getAdZone().b();
        } else {
            format = obj instanceof com.applovin.impl.mediation.a.a ? ((com.applovin.impl.mediation.a.a) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    private void i() {
        this.f705a.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.a.a.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Started Creative Debugger");
                    if (!a.this.h() || a.f.get() != activity) {
                        MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                        WeakReference unused = a.f = new WeakReference(maxCreativeDebuggerActivity);
                        maxCreativeDebuggerActivity.a(a.this.e, a.this.f705a.w());
                    }
                    a.l.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Creative Debugger destroyed");
                    WeakReference unused = a.f = null;
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.utils.j.a
    public void d() {
        if (this.j == 0) {
            this.i = com.applovin.impl.sdk.utils.p.a(TimeUnit.SECONDS.toMillis(3L), this.f705a, new Runnable() { // from class: com.applovin.impl.a.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.j = 0;
                }
            });
        }
        int i = this.j;
        if (i % 2 == 0) {
            this.j = i + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.j.a
    public void e() {
        int i = this.j;
        if (i % 2 == 1) {
            this.j = i + 1;
        }
        if (this.j / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.j();
                }
            });
            this.j = 0;
            this.i.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.g.get() != null || h()) {
            return;
        }
        Activity activityA = this.f705a.w().a();
        if (activityA == null) {
            this.f705a.L();
            if (y.a()) {
                this.f705a.L().e("AppLovinSdk", "Failed to display Creative Debugger button");
                return;
            }
            return;
        }
        View viewFindViewById = activityA.findViewById(R.id.content);
        if (viewFindViewById instanceof FrameLayout) {
            final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            final View viewA = a(activityA);
            frameLayout.addView(viewA);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            viewA.startAnimation(alphaAnimation);
            final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.a.a.a.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (viewA.getParent() != null || a.this.g.get() == null) {
                        return;
                    }
                    frameLayout.addView(viewA);
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.a.a.a.5
                @Override // java.lang.Runnable
                public void run() {
                    frameLayout.removeView(viewA);
                    a.this.g = new WeakReference(null);
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
            }, TimeUnit.SECONDS.toMillis(5L));
            this.g = new WeakReference<>(viewA);
        }
    }

    private View a(Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(k());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.a.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                a.this.b();
            }
        });
        if (h.d()) {
            view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    private Drawable k() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public void a(com.applovin.impl.a.a.a.a aVar, Context context, boolean z) {
        Object objC = aVar.c();
        String strA = a(aVar);
        l lVar = new l();
        if (z) {
            lVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lVar.b(strA);
        String strB = this.f705a.af().b(objC);
        if (strB != null) {
            lVar.a("\nBid Response:\n");
            lVar.a(strB);
        }
        String str = "AppLovin Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(HTTP.PLAIN_TEXT_TYPE).putExtra("android.intent.extra.SUBJECT", objC instanceof e ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME));
                if (!(objC instanceof e)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(com.applovin.impl.a.a.a.a aVar) {
        String strF;
        Object objC = aVar.c();
        l lVar = new l();
        lVar.b("Ad Info:\n");
        if (objC instanceof e) {
            e eVar = (e) objC;
            lVar.a("Network", "APPLOVIN").a(eVar).b(eVar);
        } else if (objC instanceof com.applovin.impl.mediation.a.a) {
            lVar.a((com.applovin.impl.mediation.a.a) objC);
        }
        lVar.a(this.f705a);
        lVar.a("Epoch Timestamp (ms)", Long.valueOf(aVar.d()));
        if (this.f705a.S() != null) {
            strF = this.f705a.Q().v();
        } else {
            strF = this.f705a.R().f();
        }
        lVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(strF) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f705a.a(com.applovin.impl.sdk.c.b.dU)).a("App Package Name", this.b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f705a.q()).a("Ad Review Version", g.a()).a(d(objC)).a("User ID", this.f705a.o() != null ? this.f705a.o() : "None");
        return lVar.toString();
    }

    public String b(Object obj) {
        JSONObject jSONObjectD;
        if (obj instanceof e) {
            return ((e) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof com.applovin.impl.mediation.a.a)) {
            return null;
        }
        String strL = ((com.applovin.impl.mediation.a.a) obj).l();
        return (!c.b(obj) || (jSONObjectD = new com.applovin.impl.sdk.ad.c(strL, this.f705a).d()) == null) ? strL : jSONObjectD.toString();
    }

    private Bundle d(Object obj) {
        Bundle bundleA = this.f705a.am().a(Utils.getAdServeId(obj));
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
