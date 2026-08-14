package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.q;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f314a;
    public final String b;
    public final x.a c;
    public final int d;
    public final byte[] e;

    public l(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        com.applovin.exoplayer2.l.a.a((bArr2 == null) ^ (i == 0));
        this.f314a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new x.a(a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                q.c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
