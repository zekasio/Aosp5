package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PG extends InputStream {
    public static byte[] A04;
    public static String[] A05 = {"5FxkjmViipfuOEmeGZRh1rWuAhi58BIY", "P0uDFh8HOwAWvDVGkGeATzc", "FQ2HPVuJ9Fju5P7EfteSFhbDkCSiUGCr", "lMnDCDrcSzZtU6RMhKfYe1rO633Hkzz8", "BZaCeAJ4mpNw1z6aTzzGkvXJAvKgKDg7", "gl5vlYV0aCgrCc0s0sEnhviYHRKbo8Yg", "Tgc0UJMQxUN8PgOF6KJ9ZKrej2a3tpw", "OSPCme8ftb56UzOVrw2bgiBSvmZFYlRk"};

    @Nullable
    public MessageDigest A00;
    public final C0946Xx A01;
    public final PF A02;
    public final FileInputStream A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[7].charAt(24) == 'i') {
                break;
            }
            A05[7] = "wkBtkBfOXubsKwfKzYpxBJzZI93GSJMw";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b = bArrCopyOfRange[i4];
            String[] strArr = A05;
            if (strArr[0].charAt(11) == strArr[3].charAt(11)) {
                break;
            }
            String[] strArr2 = A05;
            strArr2[1] = "6MRboz4pfSS0DylRcsmX7nz";
            strArr2[6] = "Z3yJOYkAPU5AGas9ZlGFYfEzislvm9u";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 45);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A04 = new byte[]{-104, -113, ByteCompanionObject.MIN_VALUE, Ascii.VT, Ascii.SUB, 19};
    }

    static {
        A01();
    }

    public PG(C0946Xx c0946Xx, FileInputStream fileInputStream, PF pf) {
        this.A03 = fileInputStream;
        this.A02 = pf;
        this.A01 = c0946Xx;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 30));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return read(new byte[1]);
    }

    @Override // java.io.InputStream
    @SuppressLint({"CatchGeneralException"})
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A03.read(bArr, i, i2);
        MessageDigest messageDigest = this.A00;
        if (messageDigest != null) {
            if (A05[7].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A05[2] = "wFnf9K6AarqF2rYbRIkm3wGElU25UaCd";
            try {
                if (i3 > 0) {
                    messageDigest.update(bArr, i, i3);
                } else if (i3 == -1) {
                    this.A02.A87(C0635Lu.A05(messageDigest.digest()));
                    this.A00 = null;
                }
            } catch (Exception e) {
                this.A00 = null;
                this.A01.A06().A9I(A00(3, 3, 122), C03298z.A13, new AnonymousClass90(e));
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = (int) j;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (i > 0) {
            int i2 = read(bArr, 0, Math.min(i, 1024));
            if (i2 <= 0) {
                break;
            }
            i -= i2;
            j2 += (long) i2;
        }
        return j2;
    }
}
