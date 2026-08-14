package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S3 extends AbstractC02244l {

    @Nullable
    @DoNotStrip
    public AbstractC0766Qv A00;
    public C0767Qw A01;

    @Nullable
    public C0767Qw A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C0947Xy A05;
    public final AB A06;

    public S3(AB ab, SparseBooleanArray sparseBooleanArray, C0767Qw c0767Qw, int i, C0947Xy c0947Xy) {
        super(ab);
        this.A05 = c0947Xy;
        this.A06 = ab;
        this.A04 = sparseBooleanArray;
        this.A01 = c0767Qw;
        this.A03 = i;
    }

    private void A08(InterfaceC0575Jh interfaceC0575Jh, MK mk, String str, C0719Pa c0719Pa) {
        if (this.A04.get(c0719Pa.A02())) {
            return;
        }
        C0767Qw c0767Qw = this.A02;
        if (c0767Qw != null) {
            c0767Qw.A0V();
            this.A02 = null;
        }
        this.A00 = new S5(this, str, c0719Pa, interfaceC0575Jh, c0719Pa.A04(), mk);
        this.A02 = new C0767Qw(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new S4(this, c0719Pa));
    }

    public final void A0l(C0719Pa c0719Pa, InterfaceC0575Jh interfaceC0575Jh, C7U c7u, MK mk, String str, int i, int i2, int i3) {
        int iA02 = c0719Pa.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(iA02));
        this.A06.setupNativeCtaExtension(c0719Pa);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = iA02 == 0 ? i3 : i2;
        if (iA02 < this.A03 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String strA07 = c0719Pa.A03().A0D().A07();
        String strA08 = c0719Pa.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(strA07);
            this.A06.setVideoUrl(c7u.A0S(strA08));
        } else {
            this.A06.setImageUrl(strA07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.A0j(c0719Pa.A04());
        A08(interfaceC0575Jh, mk, str, c0719Pa);
    }

    public final void A0m(C0767Qw c0767Qw) {
        this.A01 = c0767Qw;
    }
}
