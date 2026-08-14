package com.vungle.warren.tasks;

/* JADX INFO: loaded from: classes3.dex */
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
