package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Ch {
    public final C0551Ij A00 = new C0551Ij(10);

    @Nullable
    public final Metadata A00(InterfaceC0408Cd interfaceC0408Cd, @Nullable ES es) throws InterruptedException, IOException {
        int i = 0;
        Metadata metadataA0O = null;
        while (true) {
            try {
                interfaceC0408Cd.AD7(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                if (this.A00.A0G() != C0882Vk.A03) {
                    break;
                }
                this.A00.A0Z(3);
                int iA0D = this.A00.A0D();
                int i2 = iA0D + 10;
                if (metadataA0O == null) {
                    byte[] bArr = new byte[i2];
                    byte[] id3Data = this.A00.A00;
                    System.arraycopy(id3Data, 0, bArr, 0, 10);
                    interfaceC0408Cd.AD7(bArr, 10, iA0D);
                    metadataA0O = new C0882Vk(es).A0O(bArr, i2);
                } else {
                    interfaceC0408Cd.A3K(iA0D);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC0408Cd.AEB();
        interfaceC0408Cd.A3K(i);
        return metadataA0O;
    }
}
