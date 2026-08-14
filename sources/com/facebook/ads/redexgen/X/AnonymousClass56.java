package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.56, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C0947Xy A02;
    public final InterfaceC0575Jh A03;

    public static String A0O(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, Ascii.CR, 54, 51, 38, 51, Ascii.CR, 48, 39, 60, 54, 62, 55, Ascii.DC2, Ascii.GS, 8, Ascii.NAK, 10, Ascii.EM, 61, Ascii.CAN, 56, Ascii.GS, 8, Ascii.GS, 62, 9, Ascii.DC2, Ascii.CAN, Ascii.DLE, Ascii.EM, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, 127, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC0575Jh interfaceC0575Jh, C0947Xy c0947Xy) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = interfaceC0575Jh;
        this.A02 = c0947Xy;
    }

    public /* synthetic */ AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC0575Jh interfaceC0575Jh, C0947Xy c0947Xy, AnonymousClass55 anonymousClass55) {
        this(anonymousClass59, intent, interfaceC0575Jh, c0947Xy);
    }

    private C1200dJ A00() {
        return (C1200dJ) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A02() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new C0825Td(anonymousClass59, this.A02, this.A03, new C1117bs(anonymousClass59));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A03() {
        return new A2(this.A02, this.A03, new C1117bs(this.A01), A00(), new TL(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A04() {
        return new A2(this.A02, this.A03, new C1117bs(this.A01), (C1196dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new TK(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A05() {
        AnonymousClass18 anonymousClass18 = (AnonymousClass18) this.A00.getSerializableExtra(A0O(14, 18, 51));
        AnonymousClass55 anonymousClass55 = null;
        if (anonymousClass18 == null) {
            return null;
        }
        String strA0Z = anonymousClass18.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        PA paA02 = PB.A02(strA0Z);
        if (paA02 == null) {
            return null;
        }
        return new C0798Sb(this.A02, new C1117bs(this.A01), paA02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A06() {
        AnonymousClass55 anonymousClass55 = null;
        if (JR.A21(this.A02)) {
            C0947Xy c0947Xy = this.A02;
            return new C8L(c0947Xy, this.A03, new C7U(c0947Xy), new C1117bs(this.A01), A00());
        }
        C0947Xy c0947Xy2 = this.A02;
        return new C8K(c0947Xy2, this.A03, new C7U(c0947Xy2), new C1117bs(this.A01), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A07() {
        return new C9D(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1117bs(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A08() {
        return new TO(this.A02, this.A03, new C1117bs(this.A01), A00(), null, new TL());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A09() {
        return new C8N(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1117bs(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A0A() {
        return new C8N(this.A02, new TK(), this.A03, (C1196dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C7U(this.A02), new F7(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A0B() {
        C1196dF c1196dF = (C1196dF) this.A00.getSerializableExtra(A0O(32, 25, 116));
        return new TO(this.A02, this.A03, new F7(this.A01), c1196dF, c1196dF.A0a(), new TK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0658Mr A0C(RelativeLayout relativeLayout) {
        TM tm = new TM(this.A02, new C1116br(this), this.A03, new C1117bs(this.A01));
        tm.A05(relativeLayout);
        tm.A04(this.A00.getIntExtra(A0O(57, 27, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), 200));
        MS.A0M(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return tm;
    }
}
