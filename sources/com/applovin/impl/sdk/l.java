package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1339a;
    private final y b;
    private final long c;
    private final long d;
    private final int e;
    private Handler h;
    private a k;
    private WeakReference<View> f = new WeakReference<>(null);
    private int g = 0;
    private final HandlerThread i = new HandlerThread("BlackViewDetector");
    private final Runnable j = new Runnable() { // from class: com.applovin.impl.sdk.l.1
        @Override // java.lang.Runnable
        public void run() {
            l.this.b();
        }
    };

    public interface a {
        void a(View view);
    }

    private interface b {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    static /* synthetic */ int d(l lVar) {
        int i = lVar.g;
        lVar.g = i + 1;
        return i;
    }

    public l(p pVar) {
        this.f1339a = pVar;
        this.b = pVar.L();
        this.c = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fI)).longValue();
        this.d = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fH)).longValue();
        this.e = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.fJ)).intValue();
    }

    public void a(View view, a aVar) {
        if (((Boolean) this.f1339a.a(com.applovin.impl.sdk.c.b.fG)).booleanValue()) {
            View view2 = this.f.get();
            if (view2 != null) {
                if (y.a()) {
                    this.b.d("BlackViewDetector", "Monitoring is already in progress for a view:" + view2);
                    return;
                }
                return;
            }
            this.k = aVar;
            this.f = new WeakReference<>(view);
            this.g = 0;
            if (y.a()) {
                this.b.b("BlackViewDetector", "Started monitoring view: " + view);
            }
            this.i.start();
            Handler handler = new Handler(this.i.getLooper());
            this.h = handler;
            handler.postDelayed(this.j, this.d);
        }
    }

    public void a() {
        if (this.f.get() == null) {
            return;
        }
        if (y.a()) {
            this.b.b("BlackViewDetector", "Stopped monitoring view: " + this.f.get());
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacks(this.j);
            this.h = null;
            this.i.quit();
        }
        this.f.clear();
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        View view = this.f.get();
        if (view == null) {
            if (y.a()) {
                this.b.d("BlackViewDetector", "Monitored view no longer exists.");
            }
            a();
            return;
        }
        if (y.a()) {
            this.b.b("BlackViewDetector", "Checking for black view: " + view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            if (y.a()) {
                this.b.d("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
            }
            this.g = 0;
            c();
            return;
        }
        a(view, new b() { // from class: com.applovin.impl.sdk.l.2
            @Override // com.applovin.impl.sdk.l.b
            public void a(Bitmap bitmap) {
                int i = measuredWidth / l.this.e;
                int i2 = measuredHeight / l.this.e;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < measuredHeight; i4 += i2) {
                    for (int i5 = i3; i5 < measuredWidth; i5 += i) {
                        if (!l.this.a(bitmap.getPixel(i5, i4))) {
                            l.this.g = 0;
                            bitmap.recycle();
                            l.this.c();
                            return;
                        }
                    }
                }
                l.d(l.this);
                bitmap.recycle();
                l.this.c();
            }

            @Override // com.applovin.impl.sdk.l.b
            public void a(boolean z) {
                if (z) {
                    l.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        long j = this.c;
        if (j > 0) {
            if (this.g > 1) {
                d();
                a();
                return;
            }
            Handler handler = this.h;
            if (handler != null) {
                handler.postDelayed(this.j, j);
                return;
            }
            if (y.a()) {
                this.b.d("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            a();
            return;
        }
        if (this.g == 1) {
            d();
        }
        a();
    }

    private void d() {
        final View view = this.f.get();
        if (y.a()) {
            this.b.d("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.3
            @Override // java.lang.Runnable
            public void run() {
                if (l.this.k != null) {
                    l.this.k.a(view);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        return Color.red(i) == 0 && Color.blue(i) == 0 && Color.green(i) == 0;
    }

    private void a(View view, final b bVar) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activityB = this.f1339a.w().b();
            if (activityB == null) {
                if (y.a()) {
                    this.b.e("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                bVar.a(false);
                return;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            try {
                PixelCopy.request(activityB.getWindow(), new Rect(i, i2, measuredWidth + i, measuredHeight + i2), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.applovin.impl.sdk.l.4
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public void onPixelCopyFinished(int i3) {
                        if (i3 != 0) {
                            y unused = l.this.b;
                            if (y.a()) {
                                l.this.b.e("BlackViewDetector", "Failed to capture screenshot with error code: " + i3);
                            }
                            bVar.a(true);
                            return;
                        }
                        bVar.a(bitmapCreateBitmap);
                    }
                }, new Handler());
                return;
            } catch (Throwable th) {
                if (y.a()) {
                    this.b.e("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                bVar.a(true);
                return;
            }
        }
        if (y.a()) {
            this.b.d("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        bVar.a(true);
    }
}
