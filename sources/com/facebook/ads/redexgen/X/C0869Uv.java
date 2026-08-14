package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0869Uv implements InterfaceC0522He {
    public final int A00;
    public final InterfaceC0522He A01;
    public final C0555In A02;

    public C0869Uv(InterfaceC0522He interfaceC0522He, C0555In c0555In, int i) {
        this.A01 = (InterfaceC0522He) IK.A01(interfaceC0522He);
        this.A02 = (C0555In) IK.A01(c0555In);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    @Nullable
    public final Uri A7k() {
        return this.A01.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final long ACw(C0526Hi c0526Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACw(c0526Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
