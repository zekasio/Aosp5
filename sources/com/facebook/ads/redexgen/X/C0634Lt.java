package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0634Lt implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8U A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.DLE, Ascii.SO, Ascii.ETB, Ascii.SO, Ascii.ESC, Ascii.DC2, Ascii.FF, Ascii.NAK, 19, 34, 1, Ascii.RS, Ascii.SUB, Ascii.ETB, 34, -4, Ascii.SI, Ascii.ESC, 19, Ascii.GS, Ascii.ESC, 42, 10, 47, 38, Ascii.ESC, -75, -77, -62, -92, -81, -70, -61, -77, 40, 39, -4, 33, Ascii.RS, Ascii.FS, 36, 44, 46, 38, 44, Ascii.VT, Ascii.RS, Ascii.SUB, Ascii.GS, 50};
    }

    public C0634Lt(int i, LinkedBlockingQueue linkedBlockingQueue, C8U c8u) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = c8u;
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 122)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object obj2 : (List) objArr[0]) {
                    String str = (String) obj2.getClass().getMethod(A00(7, 12, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), new Class[0]).invoke(obj2, new Object[0]);
                    Method getTypeMethod = obj2.getClass().getMethod(A00(19, 7, 119), new Class[0]);
                    int iIntValue = ((Integer) getTypeMethod.invoke(obj2, new Object[0])).intValue();
                    if (str == null) {
                        int type = this.A00;
                        if (iIntValue == type) {
                            Method getTypeMethod2 = obj2.getClass().getMethod(A00(26, 8, 15), new Class[0]);
                            this.A02.put((byte[]) getTypeMethod2.invoke(obj2, new Object[0]));
                            return null;
                        }
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable th) {
            this.A01.A06().A8y(A00(0, 7, 106), C03298z.A1G, new AnonymousClass90(th));
        }
        return null;
    }
}
