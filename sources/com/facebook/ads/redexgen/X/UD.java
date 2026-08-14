package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UD implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8S {
    public static byte[] A02;
    public final C0947Xy A00;
    public final /* synthetic */ UB A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, Ascii.DLE, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, 61, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, Ascii.DLE, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, Ascii.DLE, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public UD(UB ub, C0947Xy c0947Xy) {
        this.A01 = ub;
        this.A00 = c0947Xy;
    }

    public /* synthetic */ UD(UB ub, C0947Xy c0947Xy, UM um) {
        this(ub, c0947Xy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        Map<String, String> mapA05 = new OG().A03(this.A01.A0R).A02(this.A01.A0f).A05();
        if (this.A01.A0I != null) {
            mapA05.put(A00(HttpStatus.SC_CREATED, 3, 11), String.valueOf(this.A01.A0I.A04()));
        }
        if (this.A01.A0W) {
            mapA05.put(A00(198, 3, 116), String.valueOf(this.A01.A0W));
        }
        return mapA05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C0947Xy A5b() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            boolean zA08 = this.A01.A0f.A08();
            String strA00 = A00(66, 17, 105);
            if (!zA08) {
                Log.e(strA00, A00(83, 115, 77));
            }
            int iA0E = JR.A0E(this.A01.A0c);
            if (iA0E < 0 || this.A01.A0f.A03() >= iA0E) {
                if (!this.A01.A0f.A09(this.A01.A0c)) {
                    if (JR.A14(this.A01.A0c)) {
                        if (this.A01.A0a != null) {
                            this.A01.A0a.A0Q(A01());
                        }
                        Lq.A00(new K1(this), new K2(this), ActivityUtils.A00());
                        return;
                    }
                    A05(A01());
                    return;
                }
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            if (!this.A01.A0f.A07()) {
                Log.e(strA00, A00(0, 41, 81));
            } else {
                Log.e(strA00, A00(41, 25, 58));
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A01.A04 == null || this.A01.A0L == null) {
            return false;
        }
        this.A01.A0L.setBounds(0, 0, this.A01.A04.getWidth(), this.A01.A04.getHeight());
        this.A01.A0L.A0D(!this.A01.A0L.A0E());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A01.A0f.A06(this.A01.A0c, motionEvent, this.A01.A04, view);
        return this.A01.A02 != null && this.A01.A02.onTouch(view, motionEvent);
    }
}
