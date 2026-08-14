package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0861Un implements IE {
    public static byte[] A02;
    public static String[] A03 = {"", "E0qfI7DZu8nkzGv3MH4nJgqlD44FCDGV", "PylumRpOhcOqV8SE", "Pn3Or3lb8D1PR4hBSIJHER", "QrYBpEt5fxgmrBLneQSlInRulpYQYEG6", "kBYBv8gRMrLmplmIT6dDUsqqwhnWF3zw", "1HLCV5Ojolr5GVwArEzJLOO78iGdJHxw", "UyANx1"};
    public static final C0861Un A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A03[3] = "rKK8X5tVBBDKhSudhE31wx";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
            if (A03[2].length() != 16) {
                String[] strArr2 = A03;
                strArr2[7] = "FSEtti";
                strArr2[0] = "";
                i4 += 0;
            } else {
                String[] strArr3 = A03;
                strArr3[5] = "3tkzovd4FYEmOrd3uFeQsH7k2lQqNCGR";
                strArr3[4] = "QPp8yxf18vRmRgJoVMCalcriT9AA2Yst";
                i4++;
            }
        }
    }

    public static void A03() {
        byte[] bArr = {-121, -84, -76, -97, -86, -89, -94, 94, -76, -97, -86, -77, -93, 94, -79, -89, -72, -93, 120, 94, Ascii.VT, Ascii.US, Ascii.FS, -41, 42, 32, 49, Ascii.FS, -41, 38, Ascii.GS, -41, -36, 42, -41, -33, -36, Ascii.ESC, -32, -41, 32, 42, -41, Ascii.RS, 41, Ascii.FS, Ascii.CAN, 43, Ascii.FS, 41, -41, 43, Ascii.US, Ascii.CAN, 37, -41, 36, Ascii.CAN, 47, 32, 36, 44, 36, -41, Ascii.CAN, 35, 35, 38, 46, Ascii.FS, Ascii.ESC, -15, -41, -36, Ascii.ESC, -31, -32, -46, -71, -60};
        if (A03[3].length() != 22) {
            throw new RuntimeException();
        }
        A03[1] = "Wq4xFI36yK0vrvDqIYZkxKx0C2M1IMKh";
        A02 = bArr;
    }

    static {
        A03();
        A04 = new C0861Un(Collections.emptyMap());
    }

    public C0861Un(Map<String, byte[]> map) {
        Map<String, byte[]> metadata = Collections.unmodifiableMap(map);
        this.A01 = metadata;
    }

    public static C0861Un A00(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (A03[6].charAt(12) != 'G') {
                throw new RuntimeException();
            }
            A03[3] = "zQpUPHnv7TxzcbRfe6tZ6j";
            if (i3 < 0 || i3 > 10485760) {
                throw new IOException(A01(0, 20, 0) + i3);
            }
            byte[] bArr = new byte[i3];
            dataInputStream.readFully(bArr);
            map.put(utf, bArr);
        }
        return new C0861Un(map);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> map, IG ig) {
        HashMap map2 = new HashMap(map);
        A04(map2, ig.A04());
        A05(map2, ig.A05());
        return map2;
    }

    public static void A04(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    public static void A05(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (String str : map2.keySet()) {
            Object value = map2.get(str);
            byte[] bArrA07 = A07(value);
            if (bArrA07.length <= 10485760) {
                map.put(str, bArrA07);
            } else {
                Object value2 = Integer.valueOf(bArrA07.length);
                throw new IllegalArgumentException(String.format(A01(20, 55, 121), str, value2, 10485760));
            }
        }
    }

    private boolean A06(Map<String, byte[]> map) {
        Map<String, byte[]> otherMetadata = this.A01;
        if (otherMetadata.size() != map.size()) {
            return false;
        }
        Map<String, byte[]> otherMetadata2 = this.A01;
        for (Map.Entry<String, byte[]> entry : otherMetadata2.entrySet()) {
            byte[] value = entry.getValue();
            byte[] otherValue = map.get(entry.getKey());
            if (!Arrays.equals(value, otherValue)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 78)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final C0861Un A08(IG ig) {
        Map<String, byte[]> mapA02 = A02(this.A01, ig);
        if (A06(mapA02)) {
            return this;
        }
        return new C0861Un(mapA02);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IE
    public final long A5X(String str, long j) {
        if (this.A01.containsKey(str)) {
            return ByteBuffer.wrap(this.A01.get(str)).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.IE
    public final String A5Z(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 78)));
        }
        return str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A06(((C0861Un) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int iHashCode = 0;
            Iterator<Map.Entry<String, byte[]>> it = this.A01.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[7].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                A03[3] = "oFmiTb5ocNjXgy8itQp3Jt";
                if (zHasNext) {
                    Map.Entry<String, byte[]> next = it.next();
                    iHashCode += next.getKey().hashCode() ^ Arrays.hashCode(next.getValue());
                } else {
                    this.A00 = iHashCode;
                    break;
                }
            }
        }
        return this.A00;
    }
}
