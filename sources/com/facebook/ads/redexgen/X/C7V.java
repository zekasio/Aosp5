package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7V {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C7V A05;
    public final C0946Xx A00;
    public final Map<String, C7S> A01 = Collections.synchronizedMap(new HashMap());

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, Ascii.SUB, 49, 44, 53, 57, 40, 120, 43, 49, 34, 61, 120, 61, 32, 59, 61, 61, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, 61, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, 61, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, Ascii.RS, Ascii.SYN, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.DLE, Ascii.SI, 6, 95, 19, Ascii.DLE, Ascii.FS, Ascii.RS, 19, 95, Ascii.SYN, Ascii.DC2, Ascii.RS, Ascii.CAN, Ascii.SUB, 95, Ascii.SYN, 17, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, 95, 87, 10, Ascii.CR, 19, 66, 53, Ascii.SO, 1, 2, Ascii.FF, 5, 64, Ascii.DC4, Ascii.SI, 64, Ascii.ETB, Ascii.DC2, 9, Ascii.DC4, 5, 64, 2, 9, Ascii.DC4, Ascii.CR, 1, Ascii.DLE, 64, Ascii.DC4, Ascii.SI, 64, 6, 9, Ascii.FF, 5, 64, 72, Ascii.NAK, Ascii.DC2, Ascii.FF, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, Ascii.CAN, Ascii.CR, Ascii.CR, Ascii.CR, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, Ascii.CR, Ascii.ESC, Ascii.US, 19, Ascii.NAK, Ascii.ETB, 0, 3, Ascii.CR, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C7V.class.getSimpleName();
    }

    public C7V(C0946Xx c0946Xx) {
        this.A00 = c0946Xx;
    }

    private int A00(String str, @Nullable Bitmap bitmap) throws FileNotFoundException {
        String strA08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size();
                    int size2 = JR.A0D(this.A00);
                    if (size >= size2) {
                        A0B(new Throwable(A08(35, 42, 1) + size));
                        A0A(byteArrayOutputStream);
                        A0A(null);
                        return 0;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    A0A(byteArrayOutputStream);
                    A0A(fileOutputStream);
                    return size;
                } catch (FileNotFoundException e) {
                    Log.e(A04, A08(6, 29, 95) + file.getPath() + strA08, e);
                    A0B(e);
                    A0A(null);
                    A0A(null);
                    return 0;
                }
            } catch (IOException e2) {
                A0B(e2);
                Log.e(A04, A08(148, 36, 57) + str + strA08, e2);
                A0A(null);
                A0A(null);
                return 0;
            } catch (OutOfMemoryError e3) {
                A0B(e3);
                Log.e(A04, A08(184, 39, 92), e3);
                A0A(null);
                A0A(null);
                if (A03[2].length() == 5) {
                    throw new RuntimeException();
                }
                A03[5] = "QxsbBUkJdqjFKv7NMRisOUwCFhjpKYpW";
                return 0;
            }
        } catch (Throwable fnfe) {
            A0A(null);
            A0A(null);
            throw fnfe;
        }
    }

    @Nullable
    private final Bitmap A01(C8U c8u, C7S c7s, int i, int i2, String str) {
        if (C7X.A06(c8u) && A08(266, 4, 53).equals(str)) {
            Map<String, C7S> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c7s.A07, c7s);
        }
        String str2 = c7s.A07;
        C7W c7w = new C7W(c7s.A05, c7s.A06, A08(261, 5, 43), str, str2);
        File file = new File(A07(this.A00), str2.hashCode() + A08(2, 4, 85));
        if (!file.exists()) {
            C7X.A04(c8u, c7w, false);
            if (str2.startsWith(A08(232, 7, 0)) && !str2.startsWith(A08(239, 22, 123))) {
                return A04(str2, i2, i);
            }
            return A02(c8u, c7s, str);
        }
        C7X.A04(c8u, c7w, true);
        try {
            if (A0C(i2, i)) {
                return C7Y.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C8U c8u, C7S c7s, String path) throws Throwable {
        String strSubstring;
        Bitmap bitmapA01;
        String failureReason = c7s.A07;
        int i = c7s.A03;
        int i2 = c7s.A04;
        long storedSize = System.currentTimeMillis();
        IOException e = null;
        String url = A08(223, 9, 70);
        boolean zStartsWith = failureReason.startsWith(url);
        String strA08 = A08(239, 22, 123);
        if (zStartsWith || failureReason.startsWith(strA08)) {
            if (failureReason.startsWith(url)) {
                strSubstring = failureReason.substring(url.length());
            } else {
                strSubstring = failureReason.substring(strA08.length());
            }
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = this.A00.getAssets().open(strSubstring);
                    if (A0C(i, i2)) {
                        try {
                            bitmapA01 = C7Y.A01(inputStreamOpen, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            throw th;
                        }
                    } else {
                        bitmapA01 = BitmapFactory.decodeStream(inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        A0A(inputStreamOpen);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (OutOfMemoryError e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean zA0C = A0C(i, i2);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[2] = "klQgZYPMp8CYh3QQVMKsyyqrprqRLh";
            if (zA0C) {
                try {
                    bitmapA01 = A05(failureReason, i, i2);
                } catch (IOException e6) {
                    e = e6;
                    A0B(e);
                    bitmapA01 = A03(failureReason);
                }
                if (A03[3].charAt(9) == 'R') {
                    throw new RuntimeException();
                }
                A03[5] = "Wv696HPT8k3";
            } else {
                bitmapA01 = A03(failureReason);
            }
        }
        String string = e != null ? e.toString() : null;
        if (bitmapA01 != null) {
            long jA00 = A00(failureReason, bitmapA01);
            long jCurrentTimeMillis = System.currentTimeMillis() - storedSize;
            if (jA00 <= 0) {
                C7X.A03(c8u, c7s, path, C7X.A01, string, null, null);
                if (JR.A0q(c8u)) {
                    return null;
                }
                return bitmapA01;
            }
            C7X.A03(c8u, c7s, path, C7X.A02, string, Long.valueOf(jA00), Long.valueOf(jCurrentTimeMillis));
            return bitmapA01;
        }
        int i3 = C7X.A03;
        if (A03[5].length() == 20) {
            throw new RuntimeException();
        }
        A03[7] = "fy8dw3JHkots1ng5AFby2Wzsn8QVwQ2O";
        C7X.A03(c8u, c7s, path, i3, string, null, null);
        return null;
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] bArrA5o;
        R1 r1ADA = RK.A00(this.A00).ADA(str, new RG());
        if (r1ADA != null && (bArrA5o = r1ADA.A5o()) != null) {
            return BitmapFactory.decodeByteArray(bArrA5o, 0, bArrA5o.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i, int i2) {
        Bitmap bitmapA02;
        int iA00;
        try {
            boolean zA0C = A0C(i, i2);
            String strA08 = A08(232, 7, 0);
            if (!zA0C) {
                bitmapA02 = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA08.length())), null, null);
            } else {
                bitmapA02 = C7Y.A02(str.substring(strA08.length()), i, i2, this.A00);
            }
            iA00 = A00(str, bitmapA02);
        } catch (IOException e) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e);
        }
        if (JR.A0q(this.A00) && iA00 <= 0) {
            return null;
        }
        return bitmapA02;
    }

    @Nullable
    private Bitmap A05(String str, int i, int i2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap bitmapA01 = C7Y.A01(inputStream, i, i2);
        A0A(inputStream);
        return bitmapA01;
    }

    public static C7V A06(C0946Xx c0946Xx) {
        if (A05 == null) {
            synchronized (C7V.class) {
                if (A05 == null) {
                    A05 = new C7V(c0946Xx);
                }
            }
        }
        return A05;
    }

    public static File A07(C8U c8u) {
        return c8u.getCacheDir();
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String strA08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A06().A8y(strA08, C03298z.A1e, new AnonymousClass90(th));
        } else {
            this.A00.A06().A8y(strA08, C03298z.A1e, new AnonymousClass90(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && JR.A0y(this.A00);
    }

    @Nullable
    public final Bitmap A0D(C7S c7s) {
        return A01(this.A00, c7s, c7s.A04, c7s.A03, c7s.A01);
    }

    @Nullable
    public final Bitmap A0E(C8U c8u, String str, int i, int i2, String str2) {
        C7S c7s = this.A01.get(str);
        return (!C7X.A06(c8u) || c7s == null) ? A01(c8u, new C7S(str, i, i2, A08(270, 7, 97), A08(270, 7, 97)), i2, i, str2) : A01(c8u, c7s, i2, i, str2);
    }

    @Nullable
    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
