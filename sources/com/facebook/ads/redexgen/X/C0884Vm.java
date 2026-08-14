package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0884Vm implements EG {
    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4h(DJ dj) {
        ByteBuffer buffer = dj.A01;
        byte[] bArrArray = buffer.array();
        int size = buffer.limit();
        C0551Ij c0551Ij = new C0551Ij(bArrArray, size);
        String strA0Q = c0551Ij.A0Q();
        String strA0Q2 = c0551Ij.A0Q();
        long jA0M = c0551Ij.A0M();
        long timescale = C0567Iz.A0F(c0551Ij.A0M(), 1000000L, jA0M);
        long presentationTimeUs = c0551Ij.A0M();
        long id = C0567Iz.A0F(presentationTimeUs, 1000L, jA0M);
        return new Metadata(new EventMessage(strA0Q, strA0Q2, id, c0551Ij.A0M(), Arrays.copyOfRange(bArrArray, c0551Ij.A06(), size), timescale));
    }
}
