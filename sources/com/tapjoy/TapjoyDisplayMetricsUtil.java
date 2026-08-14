package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyDisplayMetricsUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1726a;
    public Configuration b;
    public DisplayMetrics c = new DisplayMetrics();

    public TapjoyDisplayMetricsUtil(Context context) {
        this.f1726a = context;
        ((WindowManager) this.f1726a.getSystemService("window")).getDefaultDisplay().getMetrics(this.c);
        this.b = this.f1726a.getResources().getConfiguration();
    }

    public int getScreenDensityDPI() {
        return this.c.densityDpi;
    }

    public float getScreenDensityScale() {
        return this.c.density;
    }

    public int getScreenLayoutSize() {
        return this.b.screenLayout & 15;
    }
}
