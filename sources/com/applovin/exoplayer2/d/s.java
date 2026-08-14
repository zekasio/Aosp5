package com.applovin.exoplayer2.d;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.k.l f259a;
    public final Uri b;
    public final Map<String, List<String>> c;
    public final long d;

    public s(com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f259a = lVar;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
