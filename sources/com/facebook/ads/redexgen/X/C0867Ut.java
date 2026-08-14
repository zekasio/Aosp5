package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0867Ut implements InterfaceC0522He {
    public static String[] A04 = {"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    public long A00;
    public boolean A01;
    public final InterfaceC0520Hc A02;
    public final InterfaceC0522He A03;

    public C0867Ut(InterfaceC0522He interfaceC0522He, InterfaceC0520Hc interfaceC0520Hc) {
        this.A03 = (InterfaceC0522He) IK.A01(interfaceC0522He);
        this.A02 = (InterfaceC0520Hc) IK.A01(interfaceC0520Hc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        return this.A03.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final long ACw(C0526Hi dataSpec) throws IOException {
        this.A00 = this.A03.ACw(dataSpec);
        if (this.A00 == 0) {
            return 0L;
        }
        long j = dataSpec.A02;
        if (A04[4].charAt(25) == 'd') {
            throw new RuntimeException();
        }
        A04[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
        if (j == -1 && this.A00 != -1) {
            dataSpec = new C0526Hi(dataSpec.A04, dataSpec.A01, dataSpec.A03, this.A00, dataSpec.A05, dataSpec.A00);
        }
        this.A01 = true;
        this.A02.ACy(dataSpec);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 > 0) {
            this.A02.write(bArr, i, i3);
            long j = this.A00;
            if (j != -1) {
                long j2 = i3;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j - j2;
            }
        }
        return i3;
    }
}
