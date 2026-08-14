package com.applovin.exoplayer2.f;

import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.exoplayer2.c.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f406a;
    public final String b;

    public h(Throwable th, i iVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(iVar == null ? null : iVar.f407a);
        super(sb.toString(), th);
        this.f406a = iVar;
        this.b = ai.f611a >= 21 ? a(th) : null;
    }

    private static String a(Throwable th) {
        if (c$$ExternalSyntheticApiModelOutline0.m$2(th)) {
            return c$$ExternalSyntheticApiModelOutline0.m220m((Object) th).getDiagnosticInfo();
        }
        return null;
    }
}
