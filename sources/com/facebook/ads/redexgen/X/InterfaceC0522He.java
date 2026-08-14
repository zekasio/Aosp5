package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0522He {
    @Nullable
    Uri A7k();

    long ACw(C0526Hi c0526Hi) throws IOException;

    void close() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
