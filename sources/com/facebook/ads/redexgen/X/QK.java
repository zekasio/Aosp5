package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QK extends RelativeLayout implements InterfaceC0765Qu, InterfaceC0744Pz, InterfaceC0763Qs {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final N5 A0G;
    public static final C0639Ly A0H;
    public static final LG A0I;
    public static final C0611Ku A0J;
    public static final C0609Kr A0K;
    public static final C0597Kd A0L;
    public static final C0595Kb A0M;
    public static final C0594Ka A0N;
    public int A00;
    public C0583Jp A01;
    public Q3 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C0947Xy A0A;
    public final C03319b<AbstractC03329c, C03309a> A0B;
    public final List<Q7> A0C;
    public final InterfaceC0762Qr A0D;

    public static String A0F(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new LG();
        A0G = new N5();
        A0J = new C0611Ku();
        A0K = new C0609Kr();
        A0H = new C0639Ly();
        A0L = new C0597Kd();
        A0N = new C0594Ka();
        A0M = new C0595Kb();
    }

    public QK(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C03319b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0743Py(this);
        this.A0A = c0947Xy;
        if (A0S(c0947Xy)) {
            this.A0D = new I7(c0947Xy);
        } else {
            this.A0D = new I5(c0947Xy);
        }
        A0G();
    }

    public QK(C0947Xy c0947Xy, AttributeSet attributeSet) {
        super(c0947Xy, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C03319b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0743Py(this);
        this.A0A = c0947Xy;
        if (A0S(c0947Xy)) {
            this.A0D = new I7(c0947Xy, attributeSet);
        } else {
            this.A0D = new I5(c0947Xy, attributeSet);
        }
        A0G();
    }

    public QK(C0947Xy c0947Xy, AttributeSet attributeSet, int i) {
        super(c0947Xy, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C03319b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0743Py(this);
        this.A0A = c0947Xy;
        if (A0S(c0947Xy)) {
            this.A0D = new I7(c0947Xy, attributeSet, i);
        } else {
            this.A0D = new I5(c0947Xy, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ LG A0C() {
        LG lg = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return lg;
    }

    private void A0G() {
        this.A06 = JR.A0m(this.A0A);
        this.A0A.A0D().A2q();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new Q3(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new C0782Rl(this), this.A00);
    }

    private final void A0J() {
        for (Q7 plugin : this.A0C) {
            if (plugin instanceof NQ) {
                A0Q((NQ) plugin);
            }
            plugin.A8o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        if (JR.A0p(this.A0A)) {
            Toast.makeText(this.A0A, A0F(21, 13, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES) + (i / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC0582Jo enumC0582Jo) {
        C0583Jp c0583Jp = this.A01;
        if (c0583Jp == null) {
            return;
        }
        c0583Jp.A02(enumC0582Jo, null);
    }

    private void A0P(Q7 q7) {
        if (q7 instanceof NQ) {
            A0R((NQ) q7);
        }
        q7.AFG(this);
    }

    private void A0Q(NQ nq) {
        if (nq.getParent() == null) {
            if (nq instanceof C02987m) {
                this.A02.A00(nq);
            } else {
                addView(nq);
            }
        }
    }

    private void A0R(NQ nq) {
        if (nq instanceof C02987m) {
            this.A02.A01(nq);
        } else {
            MS.A0J(nq);
        }
    }

    private boolean A0S(C0947Xy c0947Xy) {
        return JR.A28(c0947Xy, C0751Qg.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A7u();
    }

    public final void A0X() {
        Iterator<Q7> it = this.A0C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (zHasNext) {
                Q7 plugin = it.next();
                A0P(plugin);
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AF3(i);
    }

    public final void A0a(Q1 q1) {
        QM qm = new QM(this);
        if (this.A06) {
            MM.A00(qm);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(qm);
        }
        this.A0D.AEr(q1.A02());
    }

    public final void A0b(Q6 q6, int i) {
        if (this.A03 && this.A0D.getState() == EnumC0764Qt.A06) {
            this.A03 = false;
        }
        this.A0D.AEw(q6, i);
    }

    public final void A0c(Q7 q7) {
        this.A0C.add(q7);
    }

    public final void A0d(Q7 q7) {
        this.A0C.remove(q7);
        A0P(q7);
    }

    public final void A0e(boolean z, int i) {
        if (A0i()) {
            return;
        }
        this.A0D.AD5(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A85();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == EnumC0764Qt.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8b();
    }

    public final boolean A0k() {
        return getState() == EnumC0764Qt.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public final boolean A8T() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public final boolean A8W() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Qu
    public final void AAq(final long j, final long j2, final long j3, final float f) {
        if (!JR.A1J(this.A0A)) {
            return;
        }
        this.A0B.A02(new NF(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.86
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Qu
    public final void ABR() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Qu
    public final void ABS() {
        A0b(Q6.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Qu
    public final void ACG(int i, int i2) {
        QN qn = new QN(this, i, i2);
        if (this.A06) {
            MM.A00(qn);
        } else {
            this.A08.post(qn);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Qu
    public final void ACs(EnumC0764Qt enumC0764Qt) {
        C0770Qz c0770Qz = new C0770Qz(this, enumC0764Qt, getCurrentPositionInMillis(), getDuration());
        if (this.A06) {
            MM.A00(c0770Qz);
        } else {
            this.A08.post(c0770Qz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C03319b<AbstractC03329c, C03309a> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC0764Qt getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public Q6 getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0744Pz
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0762Qr interfaceC0762Qr = this.A0D;
        if (interfaceC0762Qr != null) {
            interfaceC0762Qr.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0583Jp c0583Jp) {
        this.A01 = c0583Jp;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0D().A2x(str);
        setVideoURI(str != null ? C0617La.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(EnumC0582Jo.A0f);
            this.A0A.A0D().A31();
        } else {
            A0L(EnumC0582Jo.A0e);
            this.A0A.A0D().A30();
        }
        this.A0D.setRequestedVolume(f);
        C03319b<AbstractC03329c, C03309a> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
