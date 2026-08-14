package com.applovin.impl.sdk.d;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1275a;
    private long b;
    private boolean c;
    private long d;
    private long e;
    private int f;
    private Exception g;

    public void a(long j) {
        this.f1275a += j;
    }

    public void b(long j) {
        this.b += j;
    }

    public void a() {
        this.c = true;
    }

    public void b() {
        this.d++;
    }

    public void c() {
        this.e++;
    }

    public void a(Exception exc) {
        this.g = exc;
    }

    public void a(int i) {
        this.f = i;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f1275a + ", totalCachedBytes=" + this.b + ", isHTMLCachingCancelled=" + this.c + ", htmlResourceCacheSuccessCount=" + this.d + ", htmlResourceCacheFailureCount=" + this.e + '}';
    }
}
