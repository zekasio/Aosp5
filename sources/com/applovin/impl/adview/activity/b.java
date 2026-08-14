package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f737a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    public b(Activity activity) {
        this.f737a = activity;
        int rotation = Utils.getRotation(activity);
        this.c = rotation;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.d = zIsTablet;
        this.b = a(rotation, zIsTablet);
        this.e = zIsTablet && 2 == a(activity);
    }

    public void a(e eVar) {
        int i;
        if (eVar.F() && (i = this.b) != -1) {
            a(i);
        } else {
            a(eVar.p());
        }
    }

    private int a(int i, boolean z) {
        if (z && this.e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    private void a(e.b bVar) {
        if (bVar == e.b.ACTIVITY_PORTRAIT) {
            if (this.d && this.e) {
                int i = this.c;
                if (i != 1 && i != 3) {
                    a(1);
                    return;
                } else if (i == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i2 = this.c;
            if (i2 != 0 && i2 != 2) {
                a(1);
                return;
            } else {
                a(i2 != 0 ? 9 : 1);
                return;
            }
        }
        if (bVar == e.b.ACTIVITY_LANDSCAPE) {
            if (this.d && this.e) {
                int i3 = this.c;
                if (i3 != 0 && i3 != 2) {
                    a(0);
                    return;
                } else {
                    a(i3 != 2 ? 0 : 8);
                    return;
                }
            }
            int i4 = this.c;
            if (i4 != 1 && i4 != 3) {
                a(0);
            } else {
                a(i4 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i) {
        try {
            this.f737a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }
}
