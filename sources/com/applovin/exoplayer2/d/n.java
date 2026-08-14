package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import com.vungle.warren.utility.platform.Platform;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f256a;
    public final UUID b;
    public final byte[] c;
    public final boolean d;

    static {
        f256a = Platform.MANUFACTURER_AMAZON.equals(ai.c) && ("AFTM".equals(ai.d) || "AFTB".equals(ai.d));
    }

    public n(UUID uuid, byte[] bArr, boolean z) {
        this.b = uuid;
        this.c = bArr;
        this.d = z;
    }
}
