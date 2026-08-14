package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TM implements InterfaceC0658Mr {
    public static byte[] A0C;
    public int A00;
    public C0742Px A01;
    public AnonymousClass89 A02;
    public final C0947Xy A03;
    public final InterfaceC0575Jh A04;
    public final InterfaceC0657Mq A05;
    public final ND A06;
    public final QK A07;
    public final AbstractC0626Lj A0B = new C0363Ai(this);
    public final AbstractC0640Lz A0A = new AN(this);
    public final N6 A08 = new AL(this);
    public final N4 A09 = new AK(this);

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0C = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, Ascii.CAN, Ascii.VT, 6, 7, 17, -11, 7, 7, Ascii.CR, -10, Ascii.VT, Ascii.SI, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public TM(C0947Xy c0947Xy, ND nd, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq) {
        this.A03 = c0947Xy;
        this.A04 = interfaceC0575Jh;
        this.A06 = nd;
        this.A07 = new QK(c0947Xy);
        this.A07.A0c(new C03047u(c0947Xy));
        this.A07.getEventBus().A03(this.A0B, this.A0A, this.A08, this.A09);
        this.A05 = interfaceC0657Mq;
        this.A07.setIsFullScreen(true);
        this.A07.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC0657Mq.A3I(this.A07, layoutParams);
        C0660Mt c0660Mt = new C0660Mt(c0947Xy);
        c0660Mt.setOnClickListener(new NB(this));
        interfaceC0657Mq.A3I(c0660Mt, c0660Mt.getDefaultLayoutParams());
    }

    public final void A04(int i) {
        this.A07.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A07.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            PY py = new PY(this.A03, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * Lr.A00);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            py.setOnClickListener(new NC(this));
            this.A05.A3I(py, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), 0);
        C0947Xy c0947Xy = this.A03;
        InterfaceC0575Jh interfaceC0575Jh = this.A04;
        QK qk = this.A07;
        String strA02 = A02(8, 11, 102);
        this.A02 = new AnonymousClass89(c0947Xy, interfaceC0575Jh, qk, intent.getStringExtra(strA02), intent.getBundleExtra(A02(58, 11, 1)));
        if (JR.A1J(this.A03)) {
            this.A01 = new C0742Px(this.A03, this.A04, this.A07, intent.getStringExtra(strA02), null);
        } else {
            this.A01 = null;
        }
        this.A07.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A07.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A07.A0Y(i2);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A07.A0b(Q6.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void ABj(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new MQ());
        this.A07.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AC8(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new ML());
        if (!this.A07.A0j()) {
            this.A07.A0b(Q6.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void onDestroy() {
        this.A05.A3t(A02(37, 21, 27), new L1(this.A00, this.A07.getCurrentPositionInMillis()));
        this.A02.A0d(this.A07.getCurrentPositionInMillis());
        C0742Px c0742Px = this.A01;
        if (c0742Px != null) {
            c0742Px.A09();
        }
        this.A07.A0Z(1);
        this.A07.A0V();
    }
}
