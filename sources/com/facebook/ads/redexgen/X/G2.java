package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.DriveFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G2 extends AbstractC1231dp {
    public static byte[] A02;
    public static String[] A03 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 27;
            String[] strArr = A03;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A03[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, Ascii.FF, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, 127, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, Ascii.VT, -4, -10, -5, -8, Ascii.VT, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126};
    }

    static {
        A06();
        A04 = G2.class.getSimpleName();
    }

    public G2(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, Uri uri, Map<String, String> map, @Nullable C01240m c01240m, boolean z) {
        super(c0947Xy, interfaceC0575Jh, str, c01240m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Nullable
    private Intent A00(C01230k c01230k) {
        if (TextUtils.isEmpty(c01230k.A05())) {
            return null;
        }
        String strA03 = c01230k.A03();
        if (!M0.A04(((AbstractC01180f) this).A00, c01230k.A05()) && !A09(((AbstractC01180f) this).A00, strA03)) {
            return null;
        }
        if (!TextUtils.isEmpty(strA03) && (strA03.startsWith(A03(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 4, 23)) || strA03.startsWith(A03(254, 10, 41)))) {
            return new Intent(A03(62, 26, 24), C0617La.A00(strA03));
        }
        PackageManager packageManager = ((AbstractC01180f) this).A00.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        if (TextUtils.isEmpty(c01230k.A04()) && TextUtils.isEmpty(strA03)) {
            return packageManager.getLaunchIntentForPackage(c01230k.A05());
        }
        Intent intentA01 = A01(c01230k);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intentA01, 65536);
        if (intentA01.getComponent() == null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[5].length() == strArr[4].length()) {
                    String[] strArr2 = A03;
                    strArr2[7] = "mdy3DwQER";
                    strArr2[1] = "z4eGZXaiq";
                    if (!zHasNext) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (next.activityInfo.packageName.equals(c01230k.A05())) {
                        intentA01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        if (listQueryIntentActivities.isEmpty() || intentA01.getComponent() == null) {
            if (!A09(((AbstractC01180f) this).A00, strA03)) {
                return null;
            }
            String strA05 = c01230k.A05();
            String[] strArr3 = A03;
            if (strArr3[5].length() != strArr3[4].length()) {
                throw new RuntimeException();
            }
            A03[2] = "8xekkGfEbM0UNtDVsVek4v0mq2iI8UOu";
            intentA01.setPackage(strA05);
        }
        return intentA01;
    }

    private Intent A01(C01230k c01230k) {
        Intent intent = new Intent(A03(88, 26, 38));
        intent.addFlags(DriveFile.MODE_READ_ONLY);
        if (!TextUtils.isEmpty(c01230k.A05()) && !TextUtils.isEmpty(c01230k.A04())) {
            intent.setComponent(new ComponentName(c01230k.A05(), c01230k.A04()));
        }
        if (!TextUtils.isEmpty(c01230k.A03())) {
            intent.setData(C0617La.A00(c01230k.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return C0617La.A00(queryParameter);
        }
        return C0617La.A00(String.format(Locale.US, A03(126, 22, 117), this.A00.getQueryParameter(A03(211, 8, 63))));
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0045 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.facebook.ads.redexgen.X.C01230k> A04() {
        /*
            r8 = this;
            android.net.Uri r3 = r8.A00
            r2 = 114(0x72, float:1.6E-43)
            r1 = 12
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.String r4 = r3.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L25
            r2 = 53
            r1 = 2
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L27
        L25:
            r0 = 0
            return r0
        L27:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L57
            r3.<init>(r4)     // Catch: org.json.JSONException -> L57
            r2 = 55
            r1 = 7
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A03(r2, r1, r0)     // Catch: org.json.JSONException -> L57
            org.json.JSONArray r2 = r3.optJSONArray(r0)     // Catch: org.json.JSONException -> L57
            if (r2 == 0) goto L7f
            r1 = 0
        L41:
            int r0 = r2.length()     // Catch: org.json.JSONException -> L57
            if (r1 >= r0) goto L7f
            org.json.JSONObject r0 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L57
            com.facebook.ads.redexgen.X.0k r0 = com.facebook.ads.redexgen.X.C01230k.A00(r0)     // Catch: org.json.JSONException -> L57
            if (r0 == 0) goto L54
            r7.add(r0)     // Catch: org.json.JSONException -> L57
        L54:
            int r1 = r1 + 1
            goto L41
        L57:
            r6 = move-exception
            com.facebook.ads.redexgen.X.Xy r0 = r8.A00
            com.facebook.ads.redexgen.X.8y r5 = r0.A06()
            int r4 = com.facebook.ads.redexgen.X.C03298z.A23
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r6)
            r2 = 204(0xcc, float:2.86E-43)
            r1 = 7
            r0 = 47
            java.lang.String r0 = A03(r2, r1, r0)
            r5.A8y(r0, r4, r3)
            java.lang.String r3 = com.facebook.ads.redexgen.X.G2.A04
            r2 = 0
            r1 = 26
            r0 = 10
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r3, r0, r6)
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G2.A04():java.util.List");
    }

    private final List<Intent> A05() {
        List<C01230k> listA04 = A04();
        ArrayList arrayList = new ArrayList();
        if (listA04 != null) {
            Iterator<C01230k> it = listA04.iterator();
            while (it.hasNext()) {
                Intent intent = A00(it.next());
                if (intent != null) {
                    arrayList.add(intent);
                }
            }
        }
        return arrayList;
    }

    private boolean A07() {
        boolean result;
        List<Intent> listA05 = A05();
        if (listA05 == null) {
            return false;
        }
        Iterator<Intent> it = listA05.iterator();
        while (it.hasNext()) {
            try {
                result = LN.A0B(((AbstractC01180f) this).A00, it.next());
            } catch (Exception unused) {
            }
            if (result) {
                return true;
            }
        }
        return false;
    }

    private boolean A08() throws LL {
        LZ lz = new LZ();
        try {
            LZ.A0A(lz, ((AbstractC01180f) this).A00, A02(), ((AbstractC01180f) this).A02);
            return true;
        } catch (Exception unused) {
            String str = A03(26, 27, 35) + this.A00.toString();
            String queryParameter = this.A00.getQueryParameter(A03(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                LZ.A0A(lz, ((AbstractC01180f) this).A00, C0617La.A00(queryParameter), ((AbstractC01180f) this).A02);
                return false;
            }
            return false;
        }
    }

    public static boolean A09(C0947Xy c0947Xy, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean zA1Q = JR.A1Q(c0947Xy);
            if (A03[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (zA1Q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01180f
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final EnumC01170e A0A() {
        EnumC01170e enumC01170e = null;
        String strA03 = A03(148, 15, 92);
        boolean zA0F = A0F(this.A00);
        if (!zA0F) {
            zA0F = A07();
        }
        if (!zA0F) {
            try {
                strA03 = A08() ? A03(188, 16, 80) : A03(163, 25, 10);
            } catch (Exception unused) {
                enumC01170e = EnumC01170e.A02;
            }
        }
        this.A01.put(strA03, String.valueOf(true));
        return enumC01170e;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1231dp
    public final void A0D() {
        EnumC01170e enumC01170eA0A = null;
        if (((AbstractC1231dp) this).A02) {
            enumC01170eA0A = A0A();
        } else {
            this.A01.put(A03(188, 16, 80), String.valueOf(true));
        }
        Map<String, String> map = this.A01;
        if (A03[3].length() == 13) {
            throw new RuntimeException();
        }
        A03[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        A0E(map, enumC01170eA0A);
    }
}
