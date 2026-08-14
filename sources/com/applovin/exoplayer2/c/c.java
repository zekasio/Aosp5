package com.applovin.exoplayer2.c;

import android.media.MediaCodec;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f97a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final MediaCodec.CryptoInfo i;
    private final a j;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = ai.f611a >= 24 ? new a(cryptoInfo) : null;
    }

    public void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.f97a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        this.i.numSubSamples = i;
        this.i.numBytesOfClearData = iArr;
        this.i.numBytesOfEncryptedData = iArr2;
        this.i.key = bArr;
        this.i.iv = bArr2;
        this.i.mode = i2;
        if (ai.f611a >= 24) {
            ((a) com.applovin.exoplayer2.l.a.b(this.j)).a(i3, i4);
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f98a;
        private final MediaCodec.CryptoInfo.Pattern b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f98a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2) {
            this.b.set(i, i2);
            this.f98a.setPattern(this.b);
        }
    }
}
