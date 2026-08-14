package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02716h {
    public static final String A08 = C02716h.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C6C A02;
    public final C6T A03;
    public final C1070b7 A04;
    public final C1069b6 A05;
    public final C1068b5 A06;
    public final C7E A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6k] */
    public C02716h(final Context context, final C6C c6c) {
        final C02756l c02756l = new C02756l(new C02776n(context, c6c));
        ?? r2 = new Object(context, c02756l, c6c) { // from class: com.facebook.ads.redexgen.X.6k
            public static byte[] A07;
            public static String[] A08 = {"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            public int A00;
            public final C6C A01;
            public final C1070b7 A02;
            public final C1069b6 A03;
            public final C1068b5 A04;
            public final C02756l A05;
            public final C7E A06;

            public static String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{-31, 4};
            }

            static {
                A04();
            }

            {
                this.A03 = new C1069b6(context, c6c);
                this.A04 = new C1068b5(context, c6c);
                this.A02 = new C1070b7(context, c6c);
                this.A06 = new C7E(context, c6c);
                this.A05 = c02756l;
                this.A01 = c6c;
                A05();
            }

            @Nullable
            public static C02846u A00(int i, String str, int i2, int i3) {
                if (i != 10300) {
                    if (i == 10920) {
                        return A01(str, i2, i3, EnumC02836t.A03);
                    }
                    if (i != 10940 && i != 10941) {
                        switch (i) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i2, i3, EnumC02836t.A04);
            }

            @Nullable
            public static C02846u A01(String str, int i, int i2, EnumC02836t enumC02836t) {
                int i3 = C02736j.A00[enumC02836t.ordinal()];
                if (i3 == 1) {
                    return new C02846u(Integer.valueOf(Integer.parseInt(str)), i, i2);
                }
                if (i3 != 2) {
                    return null;
                }
                return new C02846u(str, i, i2);
            }

            @Nullable
            private List<C02846u> A03(int i) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> mapA0i = this.A01.A0i();
                if (mapA0i == null || mapA0i.isEmpty() || !mapA0i.containsKey(Integer.valueOf(i))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(mapA0i.get(Integer.valueOf(i)));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i2 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i, next, i2, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A05() {
                String strA02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer numValueOf = jSONObject.has(strA02) ? Integer.valueOf(jSONObject.getInt(strA02)) : null;
                    if (numValueOf == null) {
                        return;
                    }
                    this.A00 = numValueOf.intValue();
                    this.A06.A06(this.A00);
                    A06(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    C6O.A03(th);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
            @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A06(org.json.JSONArray r11) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02746k.A06(org.json.JSONArray):void");
            }

            private final boolean A07(EnumSet<EnumC02896z> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC02896z.A05) && enumSet.contains(EnumC02896z.A06) && !enumSet.contains(EnumC02896z.A0A)) ? false : true;
            }

            public final int A08() {
                return this.A00;
            }

            public final C1070b7 A09() {
                return this.A02;
            }

            public final C1069b6 A0A() {
                return this.A03;
            }

            public final C1068b5 A0B() {
                return this.A04;
            }

            public final C7E A0C() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0A();
        this.A06 = r2.A0B();
        this.A04 = r2.A09();
        this.A00 = r2.A08();
        this.A02 = c6c;
        this.A03 = new C6T();
        this.A03.A01(this.A04);
        this.A07 = r2.A0C();
        this.A07.A05();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C6H<C7A>> mapA03 = C02876x.A01().A03();
        if (mapA03 == null || mapA03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : mapA03.keySet()) {
                List<C7A> listA03 = mapA03.get(num).A03();
                JSONArray jSONArray = new JSONArray();
                Iterator<C7A> it = listA03.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().A09(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC02866w enumC02866w, AnonymousClass70 anonymousClass70) {
        C6M c6mA0Y = this.A02.A0Y();
        if (c6mA0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            c6mA0Y.A9K(C7J.A05(), str, this.A00, enumC02866w.A03(), sessionEndTime, A00(), anonymousClass70);
        }
        C7J.A0B(this.A02, C6J.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC02866w enumC02866w) {
        this.A04.A03(enumC02866w, this.A01);
    }

    public final void A04(EnumC02886y enumC02886y, EnumC02866w enumC02866w, @Nullable String str) {
        A05(enumC02886y, enumC02866w, str, AnonymousClass70.A04);
    }

    public final void A05(EnumC02886y enumC02886y, EnumC02866w enumC02866w, @Nullable String str, AnonymousClass70 anonymousClass70) {
        this.A05.A04(enumC02866w);
        if (enumC02886y == EnumC02886y.A02) {
            this.A06.A03(enumC02866w);
            if (str != null) {
                A01(str, enumC02866w, anonymousClass70);
            }
        }
    }

    public final boolean A06() {
        List<C02826s> listA02 = this.A05.A02();
        return (listA02 == null || listA02.isEmpty()) ? false : true;
    }
}
