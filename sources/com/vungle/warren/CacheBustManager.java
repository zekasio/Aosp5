package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.tasks.CacheBustJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.utility.ActivityManager;

/* JADX INFO: loaded from: classes3.dex */
public class CacheBustManager {
    public static final String CACHE_BUST_INTERVAL = "cache_bust_interval";
    private static final int DEFAULT_REFRESH_RATE = 0;
    static final long MINIMUM_REFRESH_RATE = 900000;
    public static final String NEXT_CACHE_BUST = "next_cache_bust";
    public static final int NO_VALUE = Integer.MIN_VALUE;
    private JobRunner jobRunner;
    private long refreshElapsed;
    private long startTrackingTime;
    private int status;
    long refreshRate = 0;
    private long overrideRefreshRate = -2147483648L;

    protected CacheBustManager(JobRunner jobRunner) {
        this.jobRunner = jobRunner;
        if (ActivityManager.getInstance().isInitialized()) {
            setLifecycleListener();
        } else {
            Log.e("CacheBustManager", "No lifecycle listener set");
            VungleLogger.error("CacheBustManager#deliverError", "No lifecycle listener set");
        }
        this.status = 0;
    }

    public synchronized void startBust() {
        if (this.status == 1) {
            return;
        }
        this.status = 1;
        if (this.refreshRate == 0) {
            this.jobRunner.execute(CacheBustJob.makeJobInfo());
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong(CACHE_BUST_INTERVAL, this.refreshRate);
            bundle.putLong(NEXT_CACHE_BUST, getCurrentTime() + this.refreshRate);
            this.jobRunner.execute(CacheBustJob.makeJobInfo().setReschedulePolicy(this.refreshRate, 0).setExtras(bundle));
        }
        this.startTrackingTime = getCurrentTime();
    }

    void overrideRefreshRate(long j) {
        this.overrideRefreshRate = j;
        this.refreshRate = j;
    }

    public void setRefreshRate(long j) {
        long j2 = this.overrideRefreshRate;
        if (j2 != -2147483648L) {
            this.refreshRate = j2;
            return;
        }
        long jMax = j > 0 ? Math.max(j, 900000L) : 0L;
        if (jMax != this.refreshRate) {
            this.refreshRate = jMax;
            if (this.status == 1) {
                this.jobRunner.cancelPendingJob(CacheBustJob.TAG);
                this.status = 0;
                startBust();
            }
        }
    }

    private void setLifecycleListener() {
        ActivityManager.getInstance().addListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.CacheBustManager.1
            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStart() {
                super.onStart();
                CacheBustManager.this.resumeCacheBust();
            }

            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStop() {
                super.onStop();
                CacheBustManager.this.stopCacheBust();
            }
        });
    }

    void resumeCacheBust() {
        if (this.status != 0 || this.refreshRate == 0) {
            return;
        }
        this.status = 1;
        Bundle bundle = new Bundle();
        bundle.putLong(CACHE_BUST_INTERVAL, this.refreshRate);
        bundle.putLong(NEXT_CACHE_BUST, getCurrentTime() + this.refreshRate);
        this.jobRunner.execute(CacheBustJob.makeJobInfo().setDelay(this.refreshRate - this.refreshElapsed).setReschedulePolicy(this.refreshRate, 0).setExtras(bundle));
        this.refreshElapsed = 0L;
        this.startTrackingTime = getCurrentTime();
    }

    void stopCacheBust() {
        if (this.refreshRate != 0) {
            this.refreshElapsed = (getCurrentTime() - this.startTrackingTime) % this.refreshRate;
        }
        this.jobRunner.cancelPendingJob(CacheBustJob.TAG);
        this.status = 0;
    }

    long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }
}
