package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.FrameMetricsAggregator;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.59, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass59 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0P;
    public static String[] A0Q = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public C0583Jp A07;
    public EnumC0608Kq A08;

    @Nullable
    public InterfaceC0658Mr A09;
    public NN A0A;
    public OE A0B;

    @Nullable
    public C0727Pi A0C;
    public String A0D;
    public String A0E;

    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AudienceNetworkActivity A0L;
    public final AudienceNetworkActivityApi A0M;
    public final C0947Xy A0N;
    public final List<AnonymousClass57> A0O = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0P = new byte[]{-37, 7, 40, 37, 56, 42, 55, 80, 67, 68, 78, 71, 2, 86, 81, 2, 75, 80, 72, 71, 84, 2, 88, 75, 71, 89, 54, 91, 82, 71, 2, 72, 84, 81, 79, 2, 75, 80, 86, 71, 80, 86, 2, 81, 84, 2, 85, 67, 88, 71, 70, 43, 80, 85, 86, 67, 80, 69, 71, 53, 86, 67, 86, 71, -24, -11, -26, -24, -22, -5, -16, -3, -16, -5, 0, -10, -1, -4, -8, 1, 7, -25, 2, -2, -8, 1, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -46, -43, -29, -42, -31, -32, -29, -27, -38, -33, -40, -97, -73, -70, -65, -70, -60, -71, -48, -78, -75, -48, -61, -74, -63, -64, -61, -59, -70, -65, -72, -48, -73, -67, -64, -56, 1, Ascii.CR, Ascii.VT, -52, 4, -1, 1, 3, 0, Ascii.CR, Ascii.CR, 9, -52, -1, 2, 17, -52, 7, Ascii.FF, Ascii.DC2, 3, Ascii.DLE, 17, Ascii.DC2, 7, Ascii.DC2, 7, -1, 10, -52, -1, 1, Ascii.DC2, 7, Ascii.DC4, 7, Ascii.DC2, Ascii.ETB, -3, 2, 3, 17, Ascii.DC2, Ascii.DLE, Ascii.CR, Ascii.ETB, 3, 2, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -31, -26, -16, -22, -26, -16, -16, -30, -31, Ascii.SI, Ascii.ESC, Ascii.EM, -38, Ascii.DC2, Ascii.CR, Ascii.SI, 17, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.ETB, -38, Ascii.CR, Ascii.DLE, Ascii.US, -38, Ascii.NAK, Ascii.SUB, 32, 17, Ascii.RS, Ascii.US, 32, Ascii.NAK, 32, Ascii.NAK, Ascii.CR, Ascii.CAN, -38, Ascii.DLE, Ascii.NAK, Ascii.US, Ascii.FS, Ascii.CAN, Ascii.CR, 37, 17, Ascii.DLE, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -21, -8, -8, -11, -8, Ascii.DLE, Ascii.FS, Ascii.SUB, -37, 19, Ascii.SO, Ascii.DLE, Ascii.DC2, Ascii.SI, Ascii.FS, Ascii.FS, Ascii.CAN, -37, Ascii.SO, 17, 32, -37, Ascii.SYN, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SYN, Ascii.SO, Ascii.EM, -37, 19, Ascii.SYN, Ascii.ESC, Ascii.SYN, 32, Ascii.NAK, Ascii.FF, Ascii.SO, Ascii.DLE, 33, Ascii.SYN, 35, Ascii.SYN, 33, 38, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 60, 64, 67, 69, 56, 70, 70, 60, 66, 65, 1, 63, 66, 58, 58, 56, 55, 77, 94, 77, 86, 92, 49, 38, 51, 41, 56, 40, 38, 53, 42, 69, 61, 60, 65, 57, 76, 65, 71, 70, Ascii.FS, 57, 76, 57, Ascii.DC2, Ascii.SO, 3, 5, 7, Ascii.SI, 7, Ascii.DLE, Ascii.SYN, -21, 6, -7, -8, -5, -3, -5, -22, -14, -3, 87, 89, 76, 75, 76, 77, 80, 85, 76, 75, 54, 89, 80, 76, 85, 91, 72, 91, 80, 86, 85, 50, 76, 96, 78, 65, 77, 81, 65, 79, 80, 48, 69, 73, 65, -7, -15, -17, -10, -57, -20, -6, -21, -8, -39, -21, -23, -11, -12, -22, -7, 45, 40, Ascii.CAN, 40, 43, 34, Ascii.RS, 39, 45, Ascii.SUB, 45, 34, 40, 39, -11, -18, -23, -15, -11, -27, -55, -28, 58, 45, 41, 59, Ascii.CAN, 61, 52, 41};
    }

    static {
        A07();
    }

    public AnonymousClass59(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0L = audienceNetworkActivity;
        this.A0M = audienceNetworkActivityApi;
        this.A0N = C5G.A01(audienceNetworkActivity);
        this.A0N.A0G(this);
    }

    @Nullable
    private InterfaceC0658Mr A01(Intent intent) {
        AnonymousClass56 anonymousClass56 = new AnonymousClass56(this, intent, this.A0N.A08(), this.A0N, null);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
            case A06:
                return anonymousClass56.A0C(this.A06);
            case A0C:
                InterfaceC0658Mr interfaceC0658MrA0A = anonymousClass56.A0A();
                if (A0Q[7].charAt(27) == 'B') {
                    throw new RuntimeException();
                }
                A0Q[1] = "x";
                return interfaceC0658MrA0A;
            case A0B:
                return anonymousClass56.A0B();
            case A02:
                InterfaceC0658Mr interfaceC0658MrA02 = anonymousClass56.A02();
                if (A0Q[2].length() == 25) {
                    throw new RuntimeException();
                }
                A0Q[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                return interfaceC0658MrA02;
            case A0A:
                return anonymousClass56.A09();
            case A08:
                InterfaceC0658Mr interfaceC0658MrA07 = anonymousClass56.A07();
                if (A0Q[1].length() != 0) {
                    A0Q[1] = "wwrXZHO6We2";
                    return interfaceC0658MrA07;
                }
                A0Q[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return interfaceC0658MrA07;
            case A07:
                return anonymousClass56.A06();
            case A09:
                return anonymousClass56.A08();
            case A04:
                return anonymousClass56.A05();
            case A03:
                return anonymousClass56.A03();
            case A05:
                return anonymousClass56.A04();
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0F;
        if (str != null) {
            this.A0C = C0726Ph.A01(this.A0N, str);
            if (this.A0C != null) {
                this.A06.addView(this.A0C, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0J) {
            if (A0G()) {
                A0D(Q9.A03.A02());
            } else {
                A0D(A04(139, 48, 47));
            }
            this.A0J = true;
        }
    }

    private void A08(Intent intent) {
        if (JR.A0w(this.A0L)) {
            EnumC0608Kq enumC0608Kq = this.A08;
            EnumC0608Kq enumC0608Kq2 = EnumC0608Kq.A02;
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[1] = "ROWUzhbvPevH2";
            if (enumC0608Kq != enumC0608Kq2 && Build.VERSION.SDK_INT >= 18) {
                this.A0B = new OE();
                this.A0B.A0C(intent.getStringExtra(A04(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 11, 51)));
                this.A0B.A0B(this.A0L.getPackageName());
                long longExtra = intent.getLongExtra(A04(462, 11, 109), 0L);
                if (longExtra != 0) {
                    this.A0B.A09(longExtra);
                }
                TextView textView = new TextView(this.A0L);
                textView.setText(A04(1, 5, 84));
                textView.setTextColor(-1);
                MS.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                AnonymousClass58 anonymousClass58 = new AnonymousClass58(this);
                textView.setOnLongClickListener(anonymousClass58);
                this.A06.setOnLongClickListener(anonymousClass58);
                this.A06.getOverlay().add(this.A0B);
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String strA04 = A04(FrameMetricsAggregator.EVERY_DURATION, 8, 85);
        String strA042 = A04(HttpStatus.SC_SERVICE_UNAVAILABLE, 8, 17);
        String strA043 = A04(438, 24, 120);
        if (bundle != null) {
            Bundle adnwSavedStateBundle = LN.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = adnwSavedStateBundle.getInt(strA043, -1);
            this.A0D = adnwSavedStateBundle.getString(strA042);
            this.A08 = (EnumC0608Kq) adnwSavedStateBundle.getSerializable(strA04);
            return;
        }
        this.A01 = intent.getIntExtra(strA043, -1);
        this.A0D = intent.getStringExtra(strA042);
        this.A08 = (EnumC0608Kq) intent.getSerializableExtra(strA04);
        this.A02 = intent.getIntExtra(A04(473, 16, 23), 0) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0D(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 345(0x159, float:4.83E-43)
            r1 = 47
            r0 = 100
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.Q9 r0 = com.facebook.ads.redexgen.X.Q9.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0I = r4
        L1f:
            r2 = 265(0x109, float:3.71E-43)
            r1 = 35
            r0 = 23
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.Q9 r0 = com.facebook.ads.redexgen.X.Q9.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0H = r4
        L5c:
            r2 = 86
            r1 = 53
            r0 = 2
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L71
            r0 = 9
            r5.finish(r0)
            return
        L71:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 45
            r0 = 62
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L87
            r0 = 10
            r5.finish(r0)
            return
        L87:
            r0 = 0
            r5.A0F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.A0D(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(String str, C1U c1u) {
        if (this.A09 == null) {
            return;
        }
        if (this.A0A == null) {
            C0947Xy c0947Xy = this.A0N;
            this.A0A = NO.A02(c0947Xy, c0947Xy.A08(), str, c1u, this.A09, new C1117bs(this));
            this.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        MS.A0J(this.A0A);
        MS.A0T(this.A06);
        this.A06.addView(this.A0A);
        this.A0A.A0K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(String str, @Nullable C03309a c03309a) {
        Intent intent = new Intent(str + A04(0, 1, 50) + this.A0D);
        if (c03309a != null) {
            intent.putExtra(A04(392, 5, 121), c03309a);
        }
        C2T.A00(this.A0L).A07(intent);
    }

    private boolean A0G() {
        return this.A08 == EnumC0608Kq.A0C || this.A08 == EnumC0608Kq.A0B || this.A08 == EnumC0608Kq.A05;
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0L;
    }

    public final C0947Xy A0I() {
        return this.A0N;
    }

    @VisibleForTesting
    public final void A0J() {
        if (A0G()) {
            A0D(Q9.A09.A02());
        } else {
            A0D(A04(265, 35, 23));
        }
    }

    public final void A0K(AnonymousClass57 anonymousClass57) {
        this.A0O.add(anonymousClass57);
    }

    public final void A0L(AnonymousClass57 anonymousClass57) {
        this.A0O.remove(anonymousClass57);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        LU luA00 = LV.A00();
        if (luA00 != null) {
            boolean zOverrideDumpsys = luA00.overrideDumpsys(str, fileDescriptor, printWriter, strArr);
            if (A0Q[2].length() == 25) {
                throw new RuntimeException();
            }
            A0Q[6] = "QxWYw7ht1er43uY";
            if (zOverrideDumpsys) {
                return;
            }
        }
        this.A0M.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0N.A0D().A2Q(String.valueOf(A0H().hashCode()), i);
        if (this.A0L.isFinishing()) {
            return;
        }
        if (JR.A1G(this.A0N) && !this.A0I && !this.A0H) {
            this.A0N.A0D().A9i();
            A0J();
        }
        if (A0G() && !this.A0G) {
            A0D(Q9.A05.A02());
        } else {
            A0D(A04(187, 39, 14));
        }
        A06();
        this.A0M.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC0658Mr interfaceC0658Mr = this.A09;
        if (interfaceC0658Mr != null && interfaceC0658Mr.onActivityResult(i, i2, intent)) {
            return;
        }
        TE.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.A03 += jCurrentTimeMillis - this.A04;
        this.A04 = jCurrentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<AnonymousClass57> it = this.A0O.iterator();
            while (it.hasNext()) {
                if (it.next().A8M()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0M.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap map = new HashMap();
            int i = configuration.orientation;
            String strA04 = A04(489, 14, 74);
            if (i == 1) {
                map.put(strA04, A04(430, 8, 26));
            } else {
                map.put(strA04, A04(397, 9, 86));
            }
            this.A07.A02(EnumC0582Jo.A0K, map);
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        MU.A02();
        if (JR.A1W(this.A0L)) {
            Window window = this.A0L.getWindow();
            String[] strArr = A0Q;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0Q[6] = "7njofUp2AYjKONZ";
            window.setFlags(16777216, 16777216);
        }
        this.A05 = LN.A01(this.A0L.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C0947Xy c0947XyA03 = LN.A03(this.A05);
        if (c0947XyA03 != null) {
            this.A0N.A0E(c0947XyA03.A0D());
            this.A0N.A0B(c0947XyA03.A0A());
        }
        this.A0N.A0D().A2R(String.valueOf(A0H().hashCode()));
        this.A0L.requestWindowFeature(1);
        this.A0L.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0L);
        MS.A0M(this.A06, 0);
        this.A0L.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        A09(this.A05, bundle);
        this.A09 = A01(this.A05);
        InterfaceC0658Mr interfaceC0658Mr = this.A09;
        if (interfaceC0658Mr == null) {
            this.A0N.A06().A8y(A04(64, 11, 24), C03298z.A0A, new AnonymousClass90(A04(6, 58, 115)));
            A0J();
            finish(7);
            return;
        }
        interfaceC0658Mr.A8n(this.A05, bundle, this);
        A0D(A04(226, 39, 61));
        this.A04 = System.currentTimeMillis();
        this.A0F = this.A05.getStringExtra(A04(HttpStatus.SC_NOT_ACCEPTABLE, 13, 105));
        A05();
        A08(this.A05);
        this.A00 = this.A0L.getResources().getConfiguration().orientation;
        String strA04 = A04(75, 11, 36);
        if (bundle != null) {
            this.A0E = bundle.getString(strA04);
        } else {
            this.A0E = this.A05.getStringExtra(strA04);
        }
        this.A07 = new C0583Jp(this.A0E, this.A0N.A08());
        if (JR.A1e(this.A0L) && this.A0L.getWindow() != null) {
            this.A0L.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Xy r0 = r4.A0N
            com.facebook.ads.redexgen.X.0R r1 = r0.A0D()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0H()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A2S(r0)
            r4.A06()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            com.facebook.ads.redexgen.X.Mr r0 = r4.A09
            if (r0 == 0) goto L4a
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A09 = r0
        L4a:
            com.facebook.ads.redexgen.X.OE r3 = r4.A0B
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            if (r3 == 0) goto L6f
        L62:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0L
            boolean r0 = com.facebook.ads.redexgen.X.JR.A0w(r0)
            if (r0 == 0) goto L6f
            com.facebook.ads.redexgen.X.OE r0 = r4.A0B
            r0.A07()
        L6f:
            com.facebook.ads.redexgen.X.NN r3 = r4.A0A
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L8f
        L8c:
            r3.A0J()
        L8f:
            return
        L90:
            if (r3 == 0) goto L8f
            goto L8c
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0Q
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L6f
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0N.A0D().A2T(String.valueOf(A0H().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC0658Mr interfaceC0658Mr = this.A09;
        if (interfaceC0658Mr != null) {
            interfaceC0658Mr.ABj(false);
            if (!this.A0L.isFinishing()) {
                this.A07.A02(EnumC0582Jo.A0E, null);
                this.A0K = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0N.A0D().A2U(String.valueOf(A0H().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC0658Mr interfaceC0658Mr = this.A09;
        if (interfaceC0658Mr != null) {
            interfaceC0658Mr.AC8(false);
            if (this.A0K) {
                this.A07.A02(EnumC0582Jo.A0F, null);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC0658Mr interfaceC0658Mr = this.A09;
        if (interfaceC0658Mr != null) {
            interfaceC0658Mr.AEI(bundle2);
        }
        bundle2.putInt(A04(438, 24, 120), this.A01);
        bundle2.putString(A04(HttpStatus.SC_SERVICE_UNAVAILABLE, 8, 17), this.A0D);
        bundle2.putString(A04(75, 11, 36), this.A0E);
        bundle2.putSerializable(A04(FrameMetricsAggregator.EVERY_DURATION, 8, 85), this.A08);
        LN.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0N.A0D().A2V(String.valueOf(A0H().hashCode()));
        int i = this.A01;
        if (i != -1) {
            C0652Ml.A02(this.A0L, i, this.A0N);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0N.A0D().A2W(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass68.A02(null, motionEvent);
        return this.A0M.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}
