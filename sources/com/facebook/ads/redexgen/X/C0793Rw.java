package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0793Rw extends AbstractC02244l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};

    @DoNotStrip
    public AbstractC0766Qv A00;
    public C0767Qw A01;

    @Nullable
    public C0767Qw A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C0947Xy A08;
    public final A3 A09;

    public C0793Rw(A3 a3, SparseBooleanArray sparseBooleanArray, C0767Qw c0767Qw, int i, int i2, int i3, int i4, C0947Xy c0947Xy) {
        super(a3);
        this.A08 = c0947Xy;
        this.A09 = a3;
        this.A07 = sparseBooleanArray;
        this.A01 = c0767Qw;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
    }

    private void A08(InterfaceC0575Jh interfaceC0575Jh, MK mk, String str, C0719Pa c0719Pa) {
        if (this.A07.get(c0719Pa.A02())) {
            return;
        }
        C0767Qw c0767Qw = this.A02;
        if (c0767Qw != null) {
            c0767Qw.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C0795Ry(this, str, c0719Pa, interfaceC0575Jh, c0719Pa.A04(), mk);
        this.A02 = new C0767Qw(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C0794Rx(this, c0719Pa));
    }

    public final void A0l(C0719Pa c0719Pa, InterfaceC0575Jh interfaceC0575Jh, C7U c7u, MK mk, String videoUrl) {
        int iA02 = c0719Pa.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(iA02 == 0 ? this.A04 : this.A05, 0, iA02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String strA07 = c0719Pa.A03().A0D().A07();
        String strA08 = c0719Pa.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(strA07);
            this.A09.setVideoUrl(c7u.A0S(strA08));
        } else {
            this.A09.setImageUrl(strA07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(c0719Pa.A03().A0E().A06(), c0719Pa.A03().A0E().A01());
        this.A09.setCTAInfo(c0719Pa.A03().A0F(), c0719Pa.A04());
        this.A09.A0k(c0719Pa.A04());
        A08(interfaceC0575Jh, mk, videoUrl, c0719Pa);
    }
}
