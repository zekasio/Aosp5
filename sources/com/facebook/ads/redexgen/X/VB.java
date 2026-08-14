package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VB implements InterfaceC0522He {
    public static byte[] A07;
    public static String[] A08 = {"XY5JZk6rXZ0NPH7SICFbrzLAUaQN4bdH", "HnCNMjQ424yFS", "kyBc0", "GnRsDPDWJf0qkzwG5UAakx0LVXBsKD8t", "8DLCIs9NQKYqN", "T4UYq1MMo7qynT2Sse3Gz88uK5Ayy8ub", "yyLccmqAJUyLoqB1F9xK1icYlgZtX35P", "UgvPXgEXHuOjKzkqR3R9kUCYtrFgRRdg"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    @Nullable
    public final I0<? super VB> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-38, 6, Ascii.FF, 3, -5, -73, 5, 6, Ascii.VT, -73, 6, 7, -4, 5, -73, -3, 0, 3, -4, -73, -5, -4, 10, -6, 9, 0, 7, Ascii.VT, 6, 9, -73, -3, 6, 9, -47, -73, -14};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.ContentDataSource> */
    public VB(Context context, @Nullable I0<? super VB> i0) {
        this.A05 = context.getContentResolver();
        this.A06 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final long ACw(C0526Hi c0526Hi) throws C0518Ha {
        try {
            this.A02 = c0526Hi.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 12));
            if (this.A01 != null) {
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                long jSkip = this.A03.skip(c0526Hi.A03 + startOffset) - startOffset;
                long skipped = c0526Hi.A03;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A08[2] = "hKUpJ";
                if (jSkip == skipped) {
                    long assetFileDescriptorLength = -1;
                    if (c0526Hi.A02 != -1) {
                        long skipped2 = c0526Hi.A02;
                        this.A00 = skipped2;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                long channelSize = channel.position();
                                assetFileDescriptorLength = size - channelSize;
                            }
                            this.A00 = assetFileDescriptorLength;
                        } else {
                            this.A00 = length - jSkip;
                        }
                    }
                    this.A04 = true;
                    I0<? super VB> i0 = this.A06;
                    if (i0 != null) {
                        i0.ACb(this, c0526Hi);
                    }
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(A00(0, 36, 35) + this.A02);
        } catch (IOException e) {
            throw new C0518Ha(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws C0518Ha {
        int length;
        int i;
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                    } catch (IOException e) {
                        throw new C0518Ha(e);
                    }
                } finally {
                    if (length == i) {
                    }
                    throw new RuntimeException();
                }
                if (this.A04) {
                    this.A04 = false;
                    String[] strArr = A08;
                    if (strArr[6].charAt(21) != strArr[3].charAt(21)) {
                        String[] strArr2 = A08;
                        strArr2[5] = "49IvJFCSRSvhrewf7IAXf1OPFzRU50IL";
                        strArr2[0] = "4e2AtDz0XDbCK0xcLVm9895RacU2kPwa";
                        I0<? super VB> i0 = this.A06;
                        if (i0 != null) {
                            i0.ACa(this);
                        }
                    }
                    throw new RuntimeException();
                }
                throw th;
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e2) {
                    throw new C0518Ha(e2);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    I0<? super VB> i02 = this.A06;
                    if (i02 != null) {
                        i02.ACa(this);
                    }
                }
            }
        } catch (IOException e3) {
            throw new C0518Ha(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws C0518Ha {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (A08[7].charAt(11) != 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[1] = "ibErvL6ImcJTe";
        strArr[4] = "i4reTFCBluewh";
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0518Ha(e);
            }
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0518Ha(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super VB> i0 = this.A06;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
