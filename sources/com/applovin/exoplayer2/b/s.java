package com.applovin.exoplayer2.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static int a(byte[] bArr) {
        return bArr[9] & UByte.MAX_VALUE;
    }

    public static List<byte[]> b(byte[] bArr) {
        long jB = b(c(bArr));
        long jB2 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(jB));
        arrayList.add(a(jB2));
        return arrayList;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & UByte.MAX_VALUE) | ((bArr[11] & UByte.MAX_VALUE) << 8);
    }

    private static byte[] a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long b(long j) {
        return (j * 1000000000) / 48000;
    }
}
