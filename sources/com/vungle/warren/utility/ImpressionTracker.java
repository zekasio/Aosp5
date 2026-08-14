package com.vungle.warren.utility;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final String TAG = "ImpressionTracker";
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    WeakReference<ViewTreeObserver> weakViewTreeObserver;

    public interface ImpressionListener {
        void onImpression(View view);
    }

    static class TrackingInfo {
        ImpressionListener impressionListener;
        int minViewablePercent;

        TrackingInfo() {
        }
    }

    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler());
    }

    ImpressionTracker(Context context, Map<View, TrackingInfo> map, Handler handler) {
        this.clipRect = new Rect();
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.warren.utility.ImpressionTracker.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ImpressionTracker.this.scheduleVisibilityCheck();
                return true;
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        setViewTreeObserver(context, null);
    }

    private void setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View topView = getTopView(context, view);
            if (topView == null) {
                Log.d(TAG, "Unable to set ViewTreeObserver due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                Log.d(TAG, "The root view tree observer was not alive");
            } else {
                this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            }
        }
    }

    public void addView(View view, ImpressionListener impressionListener) {
        setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.minViewablePercent = 1;
        trackingInfo.impressionListener = impressionListener;
    }

    void removeView(View view) {
        this.trackedViews.remove(view);
    }

    public void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    private View getTopView(Context context, View view) {
        View rootView;
        View viewFindViewById = context instanceof Activity ? ((Activity) context).getWindow().getDecorView().findViewById(R.id.content) : null;
        return (viewFindViewById != null || view == null || (rootView = view.getRootView()) == null) ? viewFindViewById : rootView.findViewById(R.id.content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    class VisibilityRunnable implements Runnable {
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).minViewablePercent)) {
                    this.mVisibleViews.add(view);
                }
            }
            for (View view2 : this.mVisibleViews) {
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view2);
                if (trackingInfo != null && trackingInfo.impressionListener != null) {
                    trackingInfo.impressionListener.onImpression(view2);
                }
                ImpressionTracker.this.removeView(view2);
            }
            this.mVisibleViews.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVisible(View view, int i) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
        long height = ((long) view.getHeight()) * ((long) view.getWidth());
        return height > 0 && jHeight * 100 >= ((long) i) * height;
    }
}
