package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0450Ek extends AbstractC0943Xu<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C03118d A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public C0450Ek(C03118d c03118d, String str, String str2, int i, double d, double d2, String str3, Map map) {
        this.A03 = c03118d;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03138g
    @Nullable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        String strA01 = A01(0, 8, 12);
        this.A03.A01.A06().A8F(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        C03118d.A08.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabaseA0E = null;
        try {
            try {
                sQLiteDatabaseA0E = this.A03.A0E();
                sQLiteDatabaseA0E.beginTransaction();
                String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0E.setTransactionSuccessful();
                if (sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e) {
                        this.A03.A01.A06().A8y(strA01, C03298z.A0z, new AnonymousClass90(e));
                    }
                }
                Lock lock = C03118d.A08;
                String[] strArr3 = A09;
                String str = strArr3[0];
                String eventId = strArr3[3];
                if (str.length() == eventId.length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A09;
                strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                lock.unlock();
                return strA0E;
            } catch (Exception e2) {
                A01(EnumC03128f.A06);
                this.A03.A01.A06().A8y(strA01, C03298z.A0y, new AnonymousClass90(e2));
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e3) {
                        this.A03.A01.A06().A8y(strA01, C03298z.A0z, new AnonymousClass90(e3));
                    }
                }
                C03118d.A08.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                try {
                    if (sQLiteDatabaseA0E.inTransaction()) {
                        sQLiteDatabaseA0E.endTransaction();
                    }
                } catch (Exception e4) {
                    this.A03.A01.A06().A8y(strA01, C03298z.A0z, new AnonymousClass90(e4));
                }
            }
            C03118d.A08.unlock();
            throw th;
        }
    }
}
