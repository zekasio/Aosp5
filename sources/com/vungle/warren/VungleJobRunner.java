package com.vungle.warren;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.tasks.JobCreator;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.tasks.runnable.JobRunnable;
import com.vungle.warren.tasks.utility.ThreadPriorityHelper;
import com.vungle.warren.utility.NetworkProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class VungleJobRunner implements JobRunner {
    private JobCreator creator;
    private Executor executor;
    private final NetworkProvider networkProvider;
    private final ThreadPriorityHelper threadPriorityHelper;
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = "VungleJobRunner";
    private long nextCheck = Long.MAX_VALUE;
    private final NetworkProvider.NetworkListener networkListener = new NetworkProvider.NetworkListener() { // from class: com.vungle.warren.VungleJobRunner.1
        @Override // com.vungle.warren.utility.NetworkProvider.NetworkListener
        public void onChanged(int i) {
            VungleJobRunner.this.executePendingJobs();
        }
    };
    private List<PendingJob> pendingJobs = new CopyOnWriteArrayList();
    private Runnable pendingRunnable = new PendingRunnable(new WeakReference(this));

    private static class PendingJob {
        JobInfo info;
        private final long uptimeMillis;

        PendingJob(long j, JobInfo jobInfo) {
            this.uptimeMillis = j;
            this.info = jobInfo;
        }
    }

    private static class PendingRunnable implements Runnable {
        WeakReference<VungleJobRunner> runner;

        PendingRunnable(WeakReference<VungleJobRunner> weakReference) {
            this.runner = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }
    }

    VungleJobRunner(JobCreator jobCreator, Executor executor, ThreadPriorityHelper threadPriorityHelper, NetworkProvider networkProvider) {
        this.creator = jobCreator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.networkProvider = networkProvider;
    }

    @Override // com.vungle.warren.tasks.JobRunner
    public synchronized void execute(JobInfo jobInfo) {
        JobInfo jobInfoCopy = jobInfo.copy();
        String jobTag = jobInfoCopy.getJobTag();
        long delay = jobInfoCopy.getDelay();
        jobInfoCopy.setDelay(0L);
        if (jobInfoCopy.getUpdateCurrent()) {
            for (PendingJob pendingJob : this.pendingJobs) {
                if (pendingJob.info.getJobTag().equals(jobTag)) {
                    Log.d(TAG, "replacing pending job with new " + jobTag);
                    this.pendingJobs.remove(pendingJob);
                }
            }
        }
        this.pendingJobs.add(new PendingJob(SystemClock.uptimeMillis() + delay, jobInfoCopy));
        executePendingJobs();
    }

    @Override // com.vungle.warren.tasks.JobRunner
    public synchronized void cancelPendingJob(String str) {
        ArrayList arrayList = new ArrayList();
        for (PendingJob pendingJob : this.pendingJobs) {
            if (pendingJob.info.getJobTag().equals(str)) {
                arrayList.add(pendingJob);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void executePendingJobs() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMin = Long.MAX_VALUE;
        long j = 0;
        for (PendingJob pendingJob : this.pendingJobs) {
            if (jUptimeMillis < pendingJob.uptimeMillis) {
                jMin = Math.min(jMin, pendingJob.uptimeMillis);
            } else {
                boolean z = true;
                if (pendingJob.info.getRequiredNetworkType() == 1 && this.networkProvider.getCurrentNetworkType() == -1) {
                    j++;
                    z = false;
                }
                if (z) {
                    this.pendingJobs.remove(pendingJob);
                    this.executor.execute(new JobRunnable(pendingJob.info, this.creator, this, this.threadPriorityHelper));
                }
            }
        }
        if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
            handler.removeCallbacks(this.pendingRunnable);
            handler.postAtTime(this.pendingRunnable, TAG, jMin);
        }
        this.nextCheck = jMin;
        if (j > 0) {
            this.networkProvider.addListener(this.networkListener);
        } else {
            this.networkProvider.removeListener(this.networkListener);
        }
    }
}
