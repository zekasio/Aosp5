package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@RequiresApi(21)
public class C01130a extends C01160d {
    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A08(View view, C3P c3p) {
        WindowInsets windowInsets = (WindowInsets) C3P.A01(c3p);
        WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
        }
        return C3P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final C3P A09(View view, C3P c3p) {
        WindowInsets windowInsets = (WindowInsets) C3P.A01(c3p);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return C3P.A00(windowInsets);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0F(View view, final InterfaceC01812s interfaceC01812s) {
        if (interfaceC01812s == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.36
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return (WindowInsets) C3P.A01(interfaceC01812s.AA0(view2, C3P.A00(windowInsets)));
                }
            });
        }
    }
}
