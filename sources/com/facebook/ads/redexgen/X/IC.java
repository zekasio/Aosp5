package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IC {
    public static byte[] A08;
    public static String[] A09 = {"XONorMmEkuhCG9piVxKUh1vkXNNJ", "9nfZq9rsOYHCIqBCRPzuDpg7UYzPD2Yl", "Yz44fu3QSKzu2i5DyXETxtSOt38Z3WJk", "HOY3mHCHBdW1ht", "XI2xTZ9JkVa2GEn", "4OCnssyPGh2MUqheTrzmDcc0Epkw2MIq", "4Z9FwJdzaIh4z0baUKFOBcRAp1yx", "rZsSxCWfylE928lHlC5xkXC43RMRLxAb"};
    public C0558Iq A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final IM A03;
    public final HashMap<String, IB> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        String[] strArr = A09;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "3hiG2MwLP1vY28w2jyIZHTbcKAlMPBPZ";
        strArr2[2] = "9NEv2gVVsGFA2BwX54IQqGQXEg3TAXQS";
        A08 = new byte[]{Ascii.SUB, Ascii.RS, 44, 32, 36, 50, Ascii.SO, 34, 33, 34, Ascii.SO, 47, 42, 34, 50, Ascii.DC4, 47, 32, 35, 35, 40, 45, 38, -48, -47, Ascii.SUB, Ascii.CAN, Ascii.SUB, Ascii.US, Ascii.FS, Ascii.ESC, Ascii.SYN, Ascii.SUB, 38, 37, 43, Ascii.FS, 37, 43, Ascii.SYN, 32, 37, Ascii.ESC, Ascii.FS, 47, -27, Ascii.FS, 47, 32};
    }

    static {
        A05();
    }

    public IC(File file, @Nullable byte[] bArr, boolean z) {
        this.A07 = z;
        if (bArr != null) {
            IK.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(0, 3, 101));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            IK.A04(!z);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new IM(new File(file, A02(25, 24, 67)));
    }

    public static int A00(SparseArray<String> sparseArray) {
        int iKeyAt;
        int id = sparseArray.size();
        if (id == 0) {
            iKeyAt = 0;
        } else {
            int i = id - 1;
            String[] strArr = A09;
            if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[6] = "GpSMRVwbmVnvoZI5Ggc91zVjP9Ti";
            strArr2[0] = "f9953PfVQawIaiCUJ4cnumBLGdw9";
            iKeyAt = sparseArray.keyAt(i) + 1;
        }
        if (iKeyAt < 0) {
            iKeyAt = 0;
            while (iKeyAt < id && iKeyAt == sparseArray.keyAt(iKeyAt)) {
                iKeyAt++;
            }
        }
        return iKeyAt;
    }

    private IB A01(String str) {
        IB ib = new IB(A00(this.A02), str);
        A06(ib);
        this.A01 = true;
        return ib;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = C0567Iz.A02;
        String strA02 = A02(3, 20, 107);
        if (i == 18) {
            try {
                return Cipher.getInstance(strA02, A02(23, 2, 26));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(strA02);
    }

    private void A04() throws I2 {
        try {
            try {
                OutputStream outputStreamA04 = this.A03.A04();
                if (this.A00 == null) {
                    this.A00 = new C0558Iq(outputStreamA04);
                } else {
                    this.A00.A00(outputStreamA04);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(this.A00);
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i = 0;
                for (IB ib : this.A04.values()) {
                    ib.A0A(dataOutputStream);
                    int hashCode = ib.A03(2);
                    i += hashCode;
                }
                dataOutputStream.writeInt(i);
                this.A03.A06(dataOutputStream);
                C0567Iz.A0X(null);
            } catch (IOException e2) {
                throw new I2(e2);
            }
        } catch (Throwable th) {
            C0567Iz.A0X(null);
            throw th;
        }
    }

    private void A06(IB ib) {
        this.A04.put(ib.A03, ib);
        this.A02.put(ib.A02, ib.A03);
    }

    private boolean A07() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A03());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                C0567Iz.A0X(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A05 == null) {
                    C0567Iz.A0X(dataInputStream);
                    return false;
                }
                byte[] initializationVector = new byte[16];
                dataInputStream.readFully(initializationVector);
                try {
                    this.A05.init(2, this.A06, new IvParameterSpec(initializationVector));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A07) {
                this.A01 = true;
            }
            int i2 = dataInputStream.readInt();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                IB cachedContent = IB.A00(i, dataInputStream);
                A06(cachedContent);
                i3 += cachedContent.A03(i);
            }
            int i5 = dataInputStream.readInt();
            boolean isEOF = dataInputStream.read() == -1;
            if (i5 != i3 || !isEOF) {
                C0567Iz.A0X(dataInputStream);
                return false;
            }
            C0567Iz.A0X(dataInputStream);
            return true;
        } catch (IOException unused) {
            if (0 != 0) {
                C0567Iz.A0X(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C0567Iz.A0X(null);
            }
            throw th;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final IB A09(String str) {
        return this.A04.get(str);
    }

    public final IB A0A(String str) {
        IB ib = this.A04.get(str);
        return ib == null ? A01(str) : ib;
    }

    public final IE A0B(String str) {
        IB ibA09 = A09(str);
        return ibA09 != null ? ibA09.A05() : C0861Un.A04;
    }

    public final String A0C(int i) {
        return this.A02.get(i);
    }

    public final Collection<IB> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        IK.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        String[] strArr = new String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws I2 {
        if (!this.A01) {
            return;
        }
        A04();
        this.A01 = false;
    }

    public final void A0H(String str) {
        IB ib = this.A04.get(str);
        if (ib != null && ib.A0C() && !ib.A0D()) {
            this.A04.remove(str);
            this.A02.remove(ib.A02);
            this.A01 = true;
        }
    }

    public final void A0I(String str, IG ig) {
        if (A0A(str).A0F(ig)) {
            this.A01 = true;
        }
    }
}
