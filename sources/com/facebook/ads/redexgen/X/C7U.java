package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7U {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C7W> A0G;
    public long A00;
    public C0583Jp A01;
    public final C7V A03;
    public final C8U A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{124, ByteCompanionObject.MIN_VALUE, -83, 122, -125, -85, 122, -80, 108, -105, 108, 103, 108, 106, 106, 108, 85, 84, -126, 78, 127, 85, 81, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, 127, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, ByteCompanionObject.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C7U.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C7U(C8U c8u) {
        this.A04 = c8u;
        this.A03 = C7V.A06(c8u.A00());
        this.A08 = JR.A1y(c8u);
        this.A09 = JR.A26(c8u, C0751Qg.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C0946Xx c0946Xx) {
        if (A0A == null) {
            A0A = AnonymousClass01.A00(c0946Xx, new Object() { // from class: com.facebook.ads.redexgen.X.07
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final AnonymousClass07 A00(int i) {
                    this.A00 = i;
                    return this;
                }

                public final AnonymousClass07 A01(int i) {
                    this.A01 = i;
                    return this;
                }

                public final AnonymousClass07 A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final AnonymousClass07 A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final AnonymousClass07 A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final AnonymousClass08 A05() {
                    return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(JR.A04(c0946Xx)).A02(c0946Xx.A03().A8P()).A01(-1).A03(JR.A0j(c0946Xx)).A04(JR.A25(c0946Xx)).A05(), A05(c0946Xx));
        }
        return A0A;
    }

    public static AnonymousClass06 A04(C8U c8u, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C7X.A06(c8u) && anonymousClass06 != null) {
            return new AnonymousClass06(anonymousClass06);
        }
        return new AnonymousClass06(str);
    }

    public static C0L A05(C0946Xx c0946Xx) {
        return new Y1(c0946Xx);
    }

    public static synchronized List<String> A09(C8U c8u) {
        if (A0B == null) {
            A0B = new ArrayList();
            A0J(A0B, c8u);
        }
        return A0B;
    }

    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (zHasNext) {
                arrayList2.add(MX.A02().submit(it.next()));
            } else {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Boolean bool = (Boolean) ((Future) it2.next()).get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0E, A08(85, 42, 61), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
        }
    }

    public static void A0H(C8U c8u, String str) {
        C7W c7w;
        if (C7X.A06(c8u) && !TextUtils.isEmpty(str) && (c7w = A0G.get(str)) != null) {
            c7w.A00 = A08(185, 4, 35);
            C0946Xx c0946XxA00 = c8u.A00();
            C0755Qk c0755QkA05 = C0755Qk.A05(c0946XxA00);
            String cacheKey = C0755Qk.A08(c0946XxA00, C0617La.A00(str));
            if (cacheKey == null) {
                cacheKey = str;
            }
            C7X.A04(c8u, c7w, c0755QkA05.A0H(cacheKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC0582Jo enumC0582Jo) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(173, 12, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), MJ.A04(this.A00));
        this.A01.A02(enumC0582Jo, map);
    }

    public static void A0J(List<String> list, C8U c8u) {
        A0K(list, C1244e2.A01(c8u));
        A0K(list, C7V.A07(c8u));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        if (path != A08(0, 0, 127)) {
            list.add(path.toLowerCase(Locale.getDefault()));
        }
    }

    @Nullable
    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0N(String str, int i, int i2) {
        if (this.A08) {
            AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
            anonymousClass06A04.A03 = A08(185, 4, 35);
            anonymousClass06A04.A01 = i2;
            anonymousClass06A04.A00 = i;
            return A03(this.A04.A00()).AE6(anonymousClass06A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(169, 4, 114));
    }

    @Nullable
    public final File A0O(String str) {
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
        anonymousClass06A04.A03 = A08(185, 4, 35);
        return A03(this.A04.A00()).AE7(anonymousClass06A04);
    }

    @Nullable
    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String cachedUrl) {
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, cachedUrl);
        anonymousClass06A04.A03 = A08(185, 4, 35);
        String strAE9 = A03(this.A04.A00()).AE9(anonymousClass06A04);
        return strAE9 != null ? strAE9 : cachedUrl;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        KV.A05(A08(127, 19, 68), A08(37, 16, 66), A08(0, 8, 64));
    }

    public final void A0U() {
        KV.A05(A08(146, 16, 11), A08(53, 14, 50), A08(16, 7, 19));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(@Nullable C7M c7m, C7N c7n) {
        KV.A05(A08(162, 7, 25), A08(67, 18, 23), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C7X.A02(this.A04, c7n, C7X.A07, A08(23, 14, 60), -1L);
        MX.A03().execute(new Y2(this, new ArrayList(this.A05), c7m, c7n, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C7Q c7q) {
        this.A05.add(new C7R(this, c7q));
    }

    public final void A0Y(C7Q c7q) {
        c7q.A05 = true;
        this.A06.add(new C7R(this, c7q));
    }

    public final void A0Z(C7Q c7q) {
        c7q.A05 = true;
        if (this.A09) {
            this.A06.add(new C7P(this, c7q));
        } else {
            this.A06.add(new C7R(this, c7q));
        }
    }

    public final void A0a(C7Q c7q) {
        if (this.A09) {
            this.A05.add(new C7P(this, c7q));
        } else {
            this.A05.add(new C7R(this, c7q));
        }
    }

    public final void A0b(final C7S c7s) {
        Callable<Boolean> callable = new Callable<Boolean>(c7s) { // from class: com.facebook.ads.redexgen.X.7T
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C7S A00;

            public static String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i4 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
                    i4++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c7s;
            }

            private final Boolean A00() throws Throwable {
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    if (C7X.A06(this.A01.A04)) {
                        C7U.A0F.put(this.A00.A07, anonymousClass06);
                    }
                    boolean z = this.A01.A08;
                    boolean zA01 = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (z) {
                            zA01 = C7U.A03(this.A01.A04.A00()).AE6(anonymousClass06, false).A01();
                        } else if (this.A01.A03.A0D(this.A00) != null) {
                            zA01 = true;
                        }
                        C7Z c7z = this.A00.A00;
                        if (c7z != null && c7z.A02()) {
                            int iA00 = c7z.A00();
                            int iA01 = c7z.A01();
                            if (iA00 <= 0 || iA01 <= 0) {
                                if (this.A01.A08) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    int i = this.A00.A03;
                                    int width = this.A00.A04;
                                    A03(i, width);
                                }
                            } else if (this.A01.A08) {
                                anonymousClass06.A00 = iA00;
                                anonymousClass06.A01 = iA01;
                                A04(this.A00.A07, anonymousClass06);
                            } else {
                                A03(iA00, iA01);
                            }
                        }
                        return Boolean.valueOf(zA01);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                Bitmap bitmapA0E = this.A01.A03.A0E(this.A01.A04, this.A00.A07, i, i2, this.A00.A01);
                if (bitmapA0E == null) {
                    return;
                }
                this.A01.A07.put(this.A00.A07, bitmapA0E);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                Bitmap bitmapA00 = C7U.A03(this.A01.A04.A00()).AE6(anonymousClass06, true).A00();
                if (bitmapA00 == null) {
                    return;
                }
                this.A01.A07.put(str, bitmapA00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }
        };
        if (!c7s.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C7S c7s) {
        c7s.A02 = true;
        A0b(c7s);
    }

    public final void A0d(C0583Jp c0583Jp) {
        this.A01 = c0583Jp;
    }
}
