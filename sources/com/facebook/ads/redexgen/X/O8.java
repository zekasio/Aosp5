package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O8 {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = O8.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0R> A03;
    public final WeakReference<O9> A04;
    public final WeakReference<C0767Qw> A05;
    public final WeakReference<T5> A06;

    public O8(T5 t5, O9 o9, C0767Qw c0767Qw, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C0947Xy c0947Xy) {
        this.A06 = new WeakReference<>(t5);
        this.A04 = new WeakReference<>(o9);
        this.A05 = new WeakReference<>(c0767Qw);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c0947Xy.A0D());
    }

    private C0R A00() {
        C0R c0r = this.A03.get();
        if (c0r == null) {
            return new C1232dq();
        }
        return c0r;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C0638Lx.A01(AnonymousClass98.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AFT(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AFU();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().AFV();
            if (this.A06.get().isShown()) {
                A00().AFW();
                new Handler(Looper.getMainLooper()).post(new T7(this.A05));
            }
            O9 o9 = this.A04.get();
            if (o9 != null) {
                new Handler(Looper.getMainLooper()).post(new O7(this, o9));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        T5 t5 = this.A06.get();
        if (t5 == null || t5.A06()) {
            A00().AFX(true);
            return;
        }
        O9 o9 = this.A04.get();
        if (o9 == null) {
            A00().AFX(true);
        } else {
            A00().AFX(false);
            o9.ABh();
        }
    }
}
