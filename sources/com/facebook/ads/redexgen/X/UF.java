package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UF extends AbstractC0766Qv {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1217da A01;
    public final /* synthetic */ UB A02;
    public final /* synthetic */ boolean A03;

    public UF(UB ub, View view, boolean z, C1217da c1217da) {
        this.A02 = ub;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1217da;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A00() {
        this.A02.A0e.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A01() {
        this.A02.A0e.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A02() {
        this.A02.A0e.A0B();
        if (JR.A1V(this.A02.A11())) {
            View view = this.A00;
            if (view instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view).getAdContentsView();
                if ((adContentsView instanceof Q3) && !((Q3) adContentsView).A02()) {
                    this.A02.A0R.A0T();
                    this.A02.A0e.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            Drawable loadedNativeBannerIconDrawable = this.A02.A01;
            if (loadedNativeBannerIconDrawable == null) {
                this.A02.A0R.A0T();
                this.A02.A0e.A07();
                return;
            }
            UB.A0e(loadedNativeBannerIconDrawable, imageView);
        }
        this.A02.A0e.A0C(this.A02.A0c, this.A01.A0G());
        if (this.A02.A0R != null) {
            this.A02.A0R.A0V();
        }
        if (this.A02.A0V != null && this.A02.A0V.get() != null) {
            ((AbstractC0766Qv) this.A02.A0V.get()).A02();
        }
        if (this.A02.A0f.A07()) {
            this.A02.A0e.A04();
            return;
        }
        this.A02.A0b();
        if (this.A02.A09 != null && this.A02.A04 != null && this.A02.A06 != null) {
            this.A02.A09.A08(this.A02.A04);
            this.A02.A09.A07(this.A02.A06);
            this.A02.A09.A0B(this.A02.A0I);
            this.A02.A09.A0E(this.A02.A0W);
            this.A02.A09.A0I(this.A02.A0Z);
            this.A02.A09.A0H(this.A02.A0Y);
            this.A02.A09.A0F(this.A02.A0p());
            this.A02.A09.A09(this.A02.A08);
            this.A02.A09.A0G(this.A02.A0X);
            this.A02.A09.A0A(NO.A00(this.A02.A07));
            this.A02.A09.A0C(this.A02.A0S);
            this.A02.A09.A0J(this.A03);
            this.A02.A09.A02();
        }
    }
}
