package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ak {
    public static final g.a<p> h = new g.a() { // from class: com.applovin.exoplayer2.p$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return p.m257$r8$lambda$2z2sB96fqLegmebYg4owYHuMdo(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f669a;
    public final String b;
    public final int c;
    public final v d;
    public final int e;
    public final com.applovin.exoplayer2.h.o f;
    final boolean g;

    /* JADX INFO: renamed from: $r8$lambda$2z2sB96fqLegmebYg4owYHu-Mdo, reason: not valid java name */
    public static /* synthetic */ p m257$r8$lambda$2z2sB96fqLegmebYg4owYHuMdo(Bundle bundle) {
        return new p(bundle);
    }

    public static p a(IOException iOException, int i) {
        return new p(0, iOException, i);
    }

    public static p a(Throwable th, String str, int i, v vVar, int i2, boolean z, int i3) {
        return new p(1, th, null, i3, str, i, vVar, vVar == null ? 4 : i2, z);
    }

    @Deprecated
    public static p a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    public static p a(RuntimeException runtimeException, int i) {
        return new p(2, runtimeException, i);
    }

    private p(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private p(int i, Throwable th, String str, int i2, String str2, int i3, v vVar, int i4, boolean z) {
        this(a(i, str, str2, i3, vVar, i4), th, i2, i, str2, i3, vVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private p(Bundle bundle) {
        super(bundle);
        this.f669a = bundle.getInt(a(1001), 2);
        this.b = bundle.getString(a(1002));
        this.c = bundle.getInt(a(1003), -1);
        this.d = (v) com.applovin.exoplayer2.l.c.a(v.F, bundle.getBundle(a(1004)));
        this.e = bundle.getInt(a(1005), 4);
        this.g = bundle.getBoolean(a(1006), false);
        this.f = null;
    }

    private p(String str, Throwable th, int i, int i2, String str2, int i3, v vVar, int i4, com.applovin.exoplayer2.h.o oVar, long j, boolean z) {
        super(str, th, i, j);
        com.applovin.exoplayer2.l.a.a(!z || i2 == 1);
        com.applovin.exoplayer2.l.a.a(th != null || i2 == 3);
        this.f669a = i2;
        this.b = str2;
        this.c = i3;
        this.d = vVar;
        this.e = i4;
        this.f = oVar;
        this.g = z;
    }

    p a(com.applovin.exoplayer2.h.o oVar) {
        return new p((String) com.applovin.exoplayer2.l.ai.a(getMessage()), getCause(), this.i, this.f669a, this.b, this.c, this.d, this.e, oVar, this.j, this.g);
    }

    private static String a(int i, String str, String str2, int i2, v vVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + vVar + ", format_supported=" + h.a(i3);
        } else if (i == 3) {
            str3 = "Remote error";
        } else {
            str3 = "Unexpected runtime error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }
}
