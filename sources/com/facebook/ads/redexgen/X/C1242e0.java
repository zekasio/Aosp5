package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1242e0 implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1242e0(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ACx(int i) throws C1241dz {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1241dz {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1241dz {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1241dz {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
