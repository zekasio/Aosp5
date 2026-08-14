package com.tapjoy;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyPluginAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TJOfferwallDiscoverView f1731a;
    public static PopupWindow b;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1732a;
        public final /* synthetic */ TJOfferwallDiscoverListener b;
        public final /* synthetic */ String c;
        public final /* synthetic */ float d;

        public a(Activity activity, TJOfferwallDiscoverListener tJOfferwallDiscoverListener, String str, float f) {
            this.f1732a = activity;
            this.b = tJOfferwallDiscoverListener;
            this.c = str;
            this.d = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJOfferwallDiscoverView tJOfferwallDiscoverView = TapjoyPluginAPI.f1731a;
            if (tJOfferwallDiscoverView != null) {
                tJOfferwallDiscoverView.clearContent();
            }
            TapjoyPluginAPI.f1731a = new TJOfferwallDiscoverView(this.f1732a);
            TapjoyPluginAPI.f1731a.setListener(this.b);
            TapjoyPluginAPI.f1731a.requestContent(this.f1732a, this.c);
            float screenDensityScale = new TapjoyDisplayMetricsUtil(this.f1732a).getScreenDensityScale();
            this.f1732a.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            TapjoyPluginAPI.b = TapjoyPluginAPI.CreatePopupWindow(this.f1732a, TapjoyPluginAPI.f1731a, -1, (int) (this.d * screenDensityScale));
            TapjoyPluginAPI.b.setInputMethodMode(1);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f1733a;
        public final /* synthetic */ int b;

        public b(Activity activity, int i) {
            this.f1733a = activity;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            PopupWindow popupWindow = TapjoyPluginAPI.b;
            if (popupWindow == null || popupWindow.isShowing() || this.f1733a.isFinishing() || this.f1733a.isDestroyed()) {
                return;
            }
            TapjoyPluginAPI.b.showAtLocation(this.f1733a.getWindow().getDecorView().getRootView(), GravityCompat.END, 0, this.b);
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TapjoyPluginAPI.b != null) {
                if (Build.VERSION.SDK_INT < 22 || TapjoyPluginAPI.b.isAttachedInDecor()) {
                    TapjoyPluginAPI.b.dismiss();
                    TJOfferwallDiscoverView tJOfferwallDiscoverView = TapjoyPluginAPI.f1731a;
                    if (tJOfferwallDiscoverView != null) {
                        tJOfferwallDiscoverView.clearContent();
                        TapjoyPluginAPI.f1731a = null;
                    }
                }
            }
        }
    }

    public static PopupWindow CreatePopupWindow(Activity activity, ViewGroup viewGroup, int i, int i2) {
        PopupWindow popupWindow = new PopupWindow(viewGroup, i, i2);
        popupWindow.getContentView().setSystemUiVisibility(activity.getWindow().getAttributes().flags);
        try {
            Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(popupWindow, 1002);
        } catch (IllegalAccessException e) {
            TapjoyLog.d("TapjoyPluginAPI", String.format("Unable to set popUpWindow window layout type: %s", e.getLocalizedMessage()));
        } catch (NoSuchMethodException e2) {
            TapjoyLog.d("TapjoyPluginAPI", String.format("Unable to set popUpWindow window layout type: %s", e2.getLocalizedMessage()));
        } catch (InvocationTargetException e3) {
            TapjoyLog.d("TapjoyPluginAPI", String.format("Unable to set popUpWindow window layout type: %s", e3.getLocalizedMessage()));
        }
        return popupWindow;
    }

    public static void DestroyOWDiscover() {
        TapjoyUtil.runOnMainThread(new c());
    }

    public static void RequestOWDiscover(Activity activity, String str, float f, TJOfferwallDiscoverListener tJOfferwallDiscoverListener) {
        TapjoyUtil.runOnMainThread(new a(activity, tJOfferwallDiscoverListener, str, f));
    }

    public static void ShowOWDiscover(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        TapjoyUtil.runOnMainThread(new b(activity, displayMetrics.heightPixels - b.getHeight()));
    }
}
