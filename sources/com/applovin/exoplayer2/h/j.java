package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final AtomicLong h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f467a;
    public final com.applovin.exoplayer2.k.l b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public static long a() {
        return h.getAndIncrement();
    }

    public j(long j, com.applovin.exoplayer2.k.l lVar, long j2) {
        this(j, lVar, lVar.f581a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public j(long j, com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f467a = j;
        this.b = lVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
