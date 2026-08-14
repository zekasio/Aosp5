package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YB extends C7A<HashMap<String, Integer>> {
    public static byte[] A00;
    public static String[] A01 = {"Nq1Kb9TOHvzWwANjwVGizSKF", "JWM4IVLufHQSkDOJGyecwcJ9XG51cvJk", "QEyZFLJTZNzdsjJkYvljVioyRUG2XSKd", "n7SG", "D5E01LJ4kvbqK2OQmpgiuXTPXhrvg0RI", "iCSdHB", "iogVWxzO6MdlKqT6F77t9UC3cqMLTkpE", "gUxLojtchnnArKauALgqkHsSrkkPr"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-44};
        if (A01[1].length() != 32) {
            throw new RuntimeException();
        }
        A01[5] = "SxUYlD3A0WMAhXB5PTE";
        A00 = bArr;
    }

    static {
        A01();
    }

    public YB(long j, @Nullable AnonymousClass78 anonymousClass78, HashMap<String, Integer> signalValues) {
        super(j, anonymousClass78, signalValues, AnonymousClass79.A07);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        int length = 0;
        for (String key : A07().keySet()) {
            length += key.getBytes().length;
        }
        return (A07().size() * 4) + length;
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        HashMap<String, Integer> mapA07 = A07();
        Set<String> setKeySet = mapA07.keySet();
        JSONObject jSONObject2 = new JSONObject();
        for (String str : setKeySet) {
            jSONObject2.put(str, mapA07.get(str));
        }
        jSONObject.put(A00(0, 1, 13), jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<java.lang.String, java.lang.Integer>> */
    @Override // com.facebook.ads.redexgen.X.C7A
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(C7A<HashMap<String, Integer>> c7a) {
        if (A07() != null) {
            HashMap<String, Integer> mapA07 = c7a.A07();
            if (A01[6].charAt(14) == 'I') {
                throw new RuntimeException();
            }
            A01[1] = "ZRsxwV5SobJQ5cDwe7XAzXaVJFGFHkOZ";
            if (mapA07 != null) {
                if (A07().size() != c7a.A07().size()) {
                    return false;
                }
                HashMap<String, Integer> mapA072 = c7a.A07();
                HashMap<String, Integer> mapA073 = A07();
                Iterator<String> it = mapA072.keySet().iterator();
                Iterator<String> prevSignalValueKeys = mapA073.keySet().iterator();
                while (it.hasNext() && prevSignalValueKeys.hasNext()) {
                    String newSignalValueKey = it.next();
                    String next = prevSignalValueKeys.next();
                    if (!newSignalValueKey.equals(next) || !mapA072.containsKey(newSignalValueKey) || !mapA073.containsKey(next) || !mapA072.get(newSignalValueKey).equals(mapA073.get(next))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return A07() == null && c7a.A07() == null;
    }
}
