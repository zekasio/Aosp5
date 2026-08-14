package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SB extends C4Y {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};

    @Nullable
    public InterfaceC0710Or A02;
    public C0767Qw A04;

    @Nullable
    public List<C0719Pa> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1135cB A0C;
    public final AbstractC02194g A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC0714Ov A0F = new SE(this);
    public InterfaceC0712Ot A03 = new SD(this);
    public final InterfaceC0713Ou A0E = new SC(this);

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, Ascii.GS, 4, 7, Ascii.DLE, 17, Ascii.DC2, Ascii.GS, Ascii.DC4, 7, 2, 3, Ascii.CR, Ascii.GS, Ascii.SO, -1, Ascii.DLE, -1, Ascii.VT, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public SB(C2M c2m, int i, @Nullable List<C0719Pa> list, @Nullable C0767Qw c0767Qw, @Nullable Bundle bundle) {
        this.A0C = c2m.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c0767Qw;
        this.A0D = new C1134cA(c2m.getContext());
        this.A0B = c2m.getContext();
        c2m.A1j(this);
        A0D(bundle);
    }

    @Nullable
    private AbstractC0808Sl A03(int i, int i2) {
        return A04(i, i2, true);
    }

    @Nullable
    private AbstractC0808Sl A04(int i, int i2, boolean isCompletelyVisible) {
        AbstractC0808Sl abstractC0808Sl = null;
        while (i <= i2) {
            AbstractC0808Sl abstractC0808Sl2 = (AbstractC0808Sl) this.A0C.A1q(i);
            if (abstractC0808Sl2 == null || abstractC0808Sl2.A0h()) {
                return null;
            }
            boolean zA0b = A0b(abstractC0808Sl2);
            if (A0I[2].length() != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC0808Sl == null && abstractC0808Sl2.A0i() && zA0b && !this.A0G.contains(Integer.valueOf(i)) && (!isCompletelyVisible || A0I(abstractC0808Sl2, this.A0A))) {
                abstractC0808Sl = abstractC0808Sl2;
            }
            if (abstractC0808Sl2.A0i() && !zA0b) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC0808Sl;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int iA28 = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        AbstractC0808Sl firstAutoplayableVideo = A03(iA28, lastVisibleItem);
        if (firstAutoplayableVideo != null) {
            firstAutoplayableVideo.A0f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA27 = this.A0C.A27();
        if (iA27 != -1 && iA27 < this.A05.size() - 1) {
            A0V(iA27 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC0808Sl abstractC0808SlA04 = A04(i + 1, this.A0C.A29(), false);
        if (abstractC0808SlA04 != null) {
            abstractC0808SlA04.A0f();
            A0V(((Integer) abstractC0808SlA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return JR.A21(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC0698Of abstractC0698Of, int i) {
        int width;
        int width2;
        if (i != 2) {
            width = (int) (((abstractC0698Of.getWidth() + Lr.A01.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i2 = Lr.A01.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            width = i2 - 1;
        }
        if (i != 2) {
            width2 = (int) (((Lr.A01.widthPixels - abstractC0698Of.getWidth()) * 0.7f) / 2.0f);
        } else {
            width2 = 1;
        }
        return ((int) (abstractC0698Of.getX() + ((float) abstractC0698Of.getWidth()))) <= width && abstractC0698Of.getX() >= ((float) width2);
    }

    private boolean A0J(AbstractC0808Sl abstractC0808Sl) {
        if (!this.A08 || !abstractC0808Sl.A0i()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public void A0L(F9 f9, int i) {
        super.A0L(f9, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public void A0M(F9 f9, int i, int i2) {
        super.A0M(f9, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int iA28 = this.A0C.A28();
        int iA29 = this.A0C.A29();
        A0B(iA28, iA29);
        A0A(iA28, iA29);
        A0W(iA28, iA29, i);
    }

    public final InterfaceC0712Ot A0N() {
        return this.A03;
    }

    public final InterfaceC0713Ou A0O() {
        return this.A0E;
    }

    public final InterfaceC0714Ov A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA29 = this.A0C.A29();
        for (int iA28 = this.A0C.A28(); iA28 <= iA29 && iA28 >= 0; iA28++) {
            AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) this.A0C.A1q(iA28);
            if (abstractC0808Sl != null && abstractC0808Sl.A0h()) {
                this.A01 = iA28;
                abstractC0808Sl.A0e();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) this.A0C.A1q(this.A01);
        if (abstractC0808Sl != null && this.A01 >= 0) {
            abstractC0808Sl.A0f();
        }
    }

    public final void A0S(int i) {
        AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) this.A0C.A1q(i);
        if (abstractC0808Sl == null || A0b(abstractC0808Sl)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(abstractC0808Sl, false);
    }

    public final void A0T(int i) {
        List<C0719Pa> list;
        AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) this.A0C.A1q(i);
        if (abstractC0808Sl == null) {
            return;
        }
        if (A0b(abstractC0808Sl)) {
            A0a(abstractC0808Sl, true);
        }
        if (A0J(abstractC0808Sl) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) abstractC0808Sl.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        A0A(i, i);
    }

    public final void A0V(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int recomputeFrom, int i, int i2) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int iA27 = this.A0C.A27();
        if (iA27 == -1) {
            iA27 = i2 < 0 ? recomputeFrom : i;
        }
        this.A02.AFK(iA27);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Z(InterfaceC0710Or interfaceC0710Or) {
        this.A02 = interfaceC0710Or;
    }

    public void A0a(AbstractC0808Sl abstractC0808Sl, boolean z) {
        if (A0H()) {
            A0Y(abstractC0808Sl, z);
        }
        if (z) {
            return;
        }
        boolean zA0h = abstractC0808Sl.A0h();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (zA0h) {
            abstractC0808Sl.A0e();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
