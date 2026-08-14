package com.applovin.exoplayer2.h;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.o;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i.a f465a;
    private final SparseArray<r> b;
    private final int[] c;
    private long d;
    private long e;
    private long f;
    private float g;
    private float h;

    public f(Context context, com.applovin.exoplayer2.e.l lVar) {
        this(new o.a(context), lVar);
    }

    public f(i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        this.f465a = aVar;
        SparseArray<r> sparseArrayA = a(aVar, lVar);
        this.b = sparseArrayA;
        this.c = new int[sparseArrayA.size()];
        for (int i = 0; i < this.b.size(); i++) {
            this.c[i] = this.b.keyAt(i);
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }

    private static SparseArray<r> a(i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        SparseArray<r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(r.class).getConstructor(null).newInstance(null));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new u.a(aVar, lVar));
        return sparseArray;
    }
}
