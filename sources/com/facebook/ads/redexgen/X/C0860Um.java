package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0860Um implements I4 {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final InterfaceC0862Uo A02;
    public final IC A03;
    public final File A04;
    public final HashMap<String, ArrayList<I3>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, Ascii.VT, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, Ascii.VT, 66, 69, 88, 95, 74, 69, 72, 78, Ascii.VT, 94, 88, 78, 88, Ascii.VT, 95, 67, 78, Ascii.VT, 77, 68, 71, 79, 78, 89, 17, Ascii.VT, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, Ascii.ESC, 32, Ascii.FS, Ascii.DLE, 17, Ascii.VT, Ascii.SUB, 17, Ascii.VT, 32, Ascii.SYN, 17, Ascii.ESC, Ascii.SUB, 7, 81, Ascii.SUB, 7, Ascii.SYN};
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public C0860Um(File file, InterfaceC0862Uo interfaceC0862Uo) {
        this(file, interfaceC0862Uo, null, false);
    }

    public C0860Um(File file, InterfaceC0862Uo interfaceC0862Uo, IC ic) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC0862Uo;
            this.A03 = ic;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new IH(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public C0860Um(File file, InterfaceC0862Uo interfaceC0862Uo, byte[] bArr, boolean z) {
        this(file, interfaceC0862Uo, new IC(file, bArr, z));
    }

    private C0859Ul A00(String str, long j) throws I2 {
        C0859Ul c0859UlA06;
        IB ibA09 = this.A03.A09(str);
        if (ibA09 == null) {
            return C0859Ul.A02(str, j);
        }
        while (true) {
            c0859UlA06 = ibA09.A06(j);
            if (!c0859UlA06.A05 || c0859UlA06.A03.exists()) {
                break;
            }
            A05();
        }
        return c0859UlA06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I4
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C0859Ul AEz(String str, long j) throws InterruptedException, I2 {
        C0859Ul c0859UlAF0;
        while (true) {
            c0859UlAF0 = AF0(str, j);
            if (c0859UlAF0 == null) {
                wait();
            }
        }
        return c0859UlAF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I4
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C0859Ul AF0(String str, long j) throws I2 {
        IK.A04(!this.A01);
        C0859Ul c0859UlA00 = A00(str, j);
        if (c0859UlA00.A05) {
            C0859Ul c0859UlA07 = this.A03.A09(str).A07(c0859UlA00);
            A0C(c0859UlA00, c0859UlA07);
            return c0859UlA07;
        }
        IB ibA0A = this.A03.A0A(str);
        if (!ibA0A.A0D()) {
            ibA0A.A0B(true);
            return c0859UlA00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] fileArrListFiles = this.A04.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C0859Ul span = file.length() > 0 ? C0859Ul.A00(file, this.A03) : null;
                if (span != null) {
                    A0A(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (I2 e) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e);
        }
    }

    private void A05() throws I2 {
        ArrayList arrayList = new ArrayList();
        for (IB cachedContent : this.A03.A0D()) {
            for (C0859Ul c0859Ul : cachedContent.A08()) {
                if (!c0859Ul.A03.exists()) {
                    arrayList.add(c0859Ul);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A08((I8) arrayList.get(i), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(I8 i8) {
        ArrayList<I3> arrayList = this.A05.get(i8.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACO(this, i8);
            }
        }
        this.A02.ACO(this, i8);
    }

    private void A08(I8 i8, boolean z) throws I2 {
        IB ibA09 = this.A03.A09(i8.A04);
        if (ibA09 == null || !ibA09.A0E(i8)) {
            return;
        }
        this.A00 -= i8.A01;
        if (z) {
            try {
                this.A03.A0H(ibA09.A03);
                this.A03.A0G();
            } finally {
                A07(i8);
            }
        }
    }

    private void A0A(C0859Ul c0859Ul) {
        this.A03.A0A(c0859Ul.A04).A09(c0859Ul);
        this.A00 += c0859Ul.A01;
        A0B(c0859Ul);
    }

    private void A0B(C0859Ul c0859Ul) {
        ArrayList<I3> arrayList = this.A05.get(c0859Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACN(this, c0859Ul);
            }
        }
        this.A02.ACN(this, c0859Ul);
    }

    private void A0C(C0859Ul c0859Ul, I8 i8) {
        ArrayList<I3> arrayList = this.A05.get(c0859Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACP(this, c0859Ul, i8);
            }
        }
        this.A02.ACP(this, c0859Ul, i8);
    }

    public static synchronized boolean A0D(File file) {
        if (A06) {
            return true;
        }
        return A08.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void A3P(String str, IG ig) throws I2 {
        IK.A04(!this.A01);
        this.A03.A0I(str, ig);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void A44(File file) throws I2 {
        IK.A04(!this.A01);
        C0859Ul c0859UlA00 = C0859Ul.A00(file, this.A03);
        IK.A04(c0859UlA00 != null);
        IB ibA09 = this.A03.A09(c0859UlA00.A04);
        IK.A01(ibA09);
        IK.A04(ibA09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = IF.A00(ibA09.A05());
            if (jA00 != -1) {
                long j = c0859UlA00.A02;
                long length = c0859UlA00.A01;
                IK.A04(j + length <= jA00);
            }
            A0A(c0859UlA00);
            this.A03.A0G();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A5v() {
        IK.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A5w(String str, long j, long j2) {
        IB ibA09;
        IK.A04(!this.A01);
        ibA09 = this.A03.A09(str);
        return ibA09 != null ? ibA09.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    @NonNull
    public final synchronized NavigableSet<I8> A5x(String str) {
        TreeSet treeSet;
        IK.A04(!this.A01);
        IB ibA09 = this.A03.A09(str);
        if (ibA09 == null || ibA09.A0C()) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet((Collection) ibA09.A08());
        }
        return treeSet;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A68(String str) {
        return IF.A00(A69(str));
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized IE A69(String str) {
        IK.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void ADq(I8 i8) {
        IK.A04(!this.A01);
        IB ibA09 = this.A03.A09(i8.A04);
        IK.A01(ibA09);
        IK.A04(ibA09.A0D());
        ibA09.A0B(false);
        this.A03.A0H(ibA09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void ADx(I8 i8) throws I2 {
        IK.A04(!this.A01);
        A08(i8, true);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void AEW(String str, long j) throws I2 {
        IG ig = new IG();
        IF.A05(ig, j);
        A3P(str, ig);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized File AEx(String str, long j, long j2) throws I2 {
        IB ibA09;
        IK.A04(!this.A01);
        ibA09 = this.A03.A09(str);
        IK.A01(ibA09);
        IK.A04(ibA09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACQ(this, str, j, j2);
        return C0859Ul.A04(this.A04, ibA09.A02, j, System.currentTimeMillis());
    }
}
