package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.tapjoy.TapjoyAuctionFlags;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static String a(String str, String str2, long j) {
        return a(str, str2, j, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String a(String str, String str2, long j, byte[] bArr) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("No salt specified");
        }
        int length = bArr.length;
        char c = TokenParser.SP;
        if (length < 32) {
            throw new IllegalArgumentException("Salt is too short");
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrA = a(strSubstring2, bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ bArrA[0]);
            char c2 = '\b';
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ bArrA[1]);
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ bArrA[7]);
            int i = 0;
            while (i < bytes.length) {
                long j2 = j + ((long) i);
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                byteArrayOutputStream.write((byte) (((long) ((i >= bytes.length ? (byte) 0 : bytes[i]) ^ bArrA[i % bArrA.length])) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 1 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> c2) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 2 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 16) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 3 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 4 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 32) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 5 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 6 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) (((long) (bArrA[r5 % bArrA.length] ^ (i + 7 >= bytes.length ? (byte) 0 : bytes[r5]))) ^ ((j5 >> 56) & 255)));
                i += 8;
                c = TokenParser.SP;
                c2 = '\b';
            }
            String strB = b(byteArrayOutputStream.toByteArray());
            return "1:" + a(bArr) + ":" + strSubstring + ":" + strB;
        } catch (IOException unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        return a(str, str2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    private static String a(String str, String str2, byte[] bArr) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 80) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("No salt specified");
        }
        int length = bArr.length;
        char c = TokenParser.SP;
        if (length < 32) {
            throw new IllegalArgumentException("Salt is too short");
        }
        if (TextUtils.isEmpty(str) || str.trim().startsWith("{")) {
            return str;
        }
        String[] strArrSplit = str.split(":");
        char c2 = 0;
        try {
            if (!TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(strArrSplit[0]) || strArrSplit.length != 4) {
                return null;
            }
            char c3 = 1;
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[2];
            byte[] bArrA = a(strArrSplit[3]);
            if (str2.endsWith(str4) && a(bArr).equals(str3)) {
                byte[] bArrA2 = a(str2.substring(0, 32), bArr);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA);
                char c4 = '\b';
                try {
                    long j = (((long) ((byteArrayInputStream.read() ^ bArrA2[5]) & 255)) << 40) | ((long) ((byteArrayInputStream.read() ^ bArrA2[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrA2[1]) & 255)) << 8) | (((long) ((byteArrayInputStream.read() ^ bArrA2[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA2[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA2[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrA2[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA2[7]) & 255)) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i = byteArrayInputStream.read(bArr2);
                    int i2 = 0;
                    while (i >= 0) {
                        long j2 = ((long) i2) + j;
                        long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                        long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                        long j5 = j4 ^ (j4 >> c);
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c2] ^ bArrA2[i2 % bArrA2.length])) ^ (j5 & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[c3] ^ bArrA2[(i2 + 1) % bArrA2.length])) ^ ((j5 >> c4) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i2 + 2) % bArrA2.length] ^ bArr2[2])) ^ ((j5 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i2 + 3) % bArrA2.length] ^ bArr2[3])) ^ ((j5 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i2 + 4) % bArrA2.length] ^ bArr2[4])) ^ ((j5 >> c) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr2[5] ^ bArrA2[(i2 + 5) % bArrA2.length])) ^ ((j5 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i2 + 6) % bArrA2.length] ^ bArr2[6])) ^ ((j5 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArrA2[(i2 + 7) % bArrA2.length] ^ bArr2[7])) ^ ((j5 >> 56) & 255)));
                        i = byteArrayInputStream.read(bArr2);
                        i2 += 8;
                        j = j;
                        c4 = '\b';
                        c2 = 0;
                        c = TokenParser.SP;
                        c3 = 1;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException unused) {
                    return null;
                }
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    private static byte[] a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    private static byte[] a(String str) {
        return Base64.decode(b(str), 0);
    }

    private static String b(byte[] bArr) throws UnsupportedEncodingException {
        return c(Base64.encode(bArr, 2));
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
