package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.appcompat.widget.SearchView$$ExternalSyntheticApiModelOutline0;
import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public class JobInfoScheduler implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "JobInfoScheduler";
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.config = schedulerConfig;
    }

    int getJobId(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        return (int) adler32.getValue();
    }

    private boolean isJobServiceOn(JobScheduler jobScheduler, int i, int i2) {
        Iterator it = jobScheduler.getAllPendingJobs().iterator();
        while (it.hasNext()) {
            JobInfo jobInfoM216m = c$$ExternalSyntheticApiModelOutline0.m216m(it.next());
            int i3 = jobInfoM216m.getExtras().getInt(ATTEMPT_NUMBER);
            if (jobInfoM216m.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobSchedulerM = SearchView$$ExternalSyntheticApiModelOutline0.m(this.context.getSystemService("jobscheduler"));
        int jobId = getJobId(transportContext);
        if (!z && isJobServiceOn(jobSchedulerM, jobId, i)) {
            Logging.d(LOG_TAG, "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext);
        JobInfo.Builder builderConfigureJob = this.config.configureJob(new JobInfo.Builder(jobId, componentName), transportContext.getPriority(), nextCallTime, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(ATTEMPT_NUMBER, i);
        persistableBundle.putString(BACKEND_NAME, transportContext.getBackendName());
        persistableBundle.putInt(EVENT_PRIORITY, PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString(EXTRAS, Base64.encodeToString(transportContext.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        Logging.d(LOG_TAG, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(jobId), Long.valueOf(this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i)), Long.valueOf(nextCallTime), Integer.valueOf(i));
        jobSchedulerM.schedule(builderConfigureJob.build());
    }
}
