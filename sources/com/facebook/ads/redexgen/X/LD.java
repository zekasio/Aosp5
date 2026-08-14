package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LD {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<LD> A02 = new ThreadLocal<>();
    public final C0613Kw A00 = new C0613Kw();

    public static C0613Kw A00() {
        return A02().A00;
    }

    public static C0613Kw A01(LC lc) {
        C0613Kw c0613Kw = new C0613Kw(A00());
        c0613Kw.add(lc);
        return c0613Kw;
    }

    public static LD A02() {
        LD ld = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (ld == null) {
            LD ld2 = new LD();
            A02.set(ld2);
            return ld2;
        }
        return ld;
    }

    public static void A03(L8 l8) {
        C0613Kw createRunnableAsyncStackTrace = l8.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A04(L8 l8) {
        C0613Kw createRunnableAsyncStackTrace = l8.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}
