package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E5 implements XS {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final C0946Xx A01;
    public final C03118d A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, Ascii.FS, 19, 90, 9, 93, Ascii.EM, Ascii.CAN, 17, Ascii.CAN, 9, Ascii.CAN, 93, Ascii.FS, 9, 9, Ascii.CAN, Ascii.DLE, Ascii.CR, 9, Ascii.SO, 93, Ascii.CAN, 5, Ascii.RS, Ascii.CAN, Ascii.CAN, Ascii.EM, Ascii.CAN, Ascii.EM, 93, Ascii.CAN, Ascii.VT, Ascii.CAN, 19, 9, Ascii.SO, 83, Ascii.DLE, Ascii.NAK, 7, Ascii.CAN, Ascii.NAK, 46, 59, 59, 42, 34, 63, 59, 127, 122, 111, 122, Ascii.DLE, Ascii.GS, 50, 36, 50, 50, 40, 46, 47, Ascii.RS, 40, 37, 32, 54, 32, 32, 58, 60, 61, Ascii.FF, 39, 58, 62, 54, 76, 81, 85, 93, Ascii.DC4, Ascii.SI, Ascii.VT, 5, Ascii.SO, 63, 9, 4, 127, 114, 123, 110};
    }

    static {
        A04();
    }

    public E5(C0946Xx c0946Xx) {
        this.A01 = c0946Xx;
        this.A02 = new C03118d(c0946Xx);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(C0945Xw.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(C0945Xw.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(C0945Xw.A0A.A00));
            jSONObject.put(A00(78, 4, 109), MJ.A02(cursor.getDouble(C0945Xw.A08.A00)));
            jSONObject.put(A00(66, 12, 6), MJ.A02(cursor.getDouble(C0945Xw.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(C0945Xw.A06.A00));
            String string = cursor.getString(C0945Xw.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(C0945Xw.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A02().A6s());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, 109), MJ.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), MJ.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A02().A6s());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C0944Xv.A02.A00);
            String string2 = cursor.getString(C0944Xv.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    @SuppressLint({"CatchGeneralException"})
    public final int A3z(int i) {
        int iA08 = 0;
        if (i > -1) {
            try {
                iA08 = this.A02.A08(i);
            } catch (Exception e) {
                if (this.A01.A03().A8P()) {
                    Log.e(XS.A00, A00(0, 38, 40), e);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return iA08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03369g
    public final void A40() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    public final boolean A4j(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    @Nullable
    public final JSONArray A5f() {
        Cursor cursorA0A = null;
        try {
            cursorA0A = this.A02.A0A();
            JSONArray jSONArrayA01 = null;
            if (cursorA0A.getCount() > 0) {
                jSONArrayA01 = A01(cursorA0A);
            }
            cursorA0A.close();
            return jSONArrayA01;
        } catch (JSONException unused) {
            if (cursorA0A != null) {
                cursorA0A.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorA0A != null) {
                cursorA0A.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    @Nullable
    public final JSONObject A5g() {
        Cursor cursorA0B = null;
        try {
            cursorA0B = this.A02.A0B();
            JSONObject jSONObjectA03 = null;
            if (cursorA0B.getCount() > 0) {
                jSONObjectA03 = A03(cursorA0B);
            }
            cursorA0B.close();
            return jSONObjectA03;
        } catch (JSONException unused) {
            String[] strArr = A04;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "fQ4GsEetTW4Q8M7eeZgpps0V";
            strArr2[1] = "7a4bIAh8lhheYJZGYQIYoy5madi9z";
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    public final int A6a() {
        Cursor cursorA09 = null;
        try {
            cursorA09 = this.A02.A09();
            int i = cursorA09.moveToFirst() ? cursorA09.getInt(0) : 0;
            cursorA09.close();
            return i;
        } catch (Throwable th) {
            if (cursorA09 != null) {
                cursorA09.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    @Nullable
    public final String A6d(String str) {
        String string = null;
        Cursor cursorA0D = this.A02.A0D(str);
        if (cursorA0D != null) {
            if (cursorA0D.moveToNext() && cursorA0D.getCount() > 0) {
                C8b c8b = C0945Xw.A0A;
                String[] strArr = A04;
                if (strArr[7].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                string = cursorA0D.getString(cursorA0D.getColumnIndex(c8b.A01));
            }
            cursorA0D.close();
        }
        return string;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    public final Pair<JSONObject, JSONArray> A7f(int i) {
        Cursor cursorA0C = null;
        try {
            try {
                cursorA0C = this.A02.A0C(i);
                JSONArray jSONArrayA02 = null;
                JSONObject jSONObjectA03 = null;
                if (cursorA0C.getCount() > 0) {
                    jSONObjectA03 = A03(cursorA0C);
                    jSONArrayA02 = A02(cursorA0C);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(jSONObjectA03, jSONArrayA02);
                cursorA0C.close();
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursorA0C != null) {
                    cursorA0C.close();
                }
                return pair2;
            }
        } catch (Throwable th) {
            if (cursorA0C != null) {
                cursorA0C.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03359f
    public final boolean A8G(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9d != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03369g
    public final void AFi(C0572Je c0572Je, AbstractC03339d<String> abstractC03339d) {
        this.A02.A0G(c0572Je.A08(), c0572Je.A05().A00, c0572Je.A06().toString(), c0572Je.A04(), c0572Je.A03(), c0572Je.A07(), c0572Je.A09(), abstractC03339d);
    }
}
