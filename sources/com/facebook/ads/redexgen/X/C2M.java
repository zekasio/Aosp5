package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2M extends F9 {
    public C2M(C0947Xy c0947Xy) {
        super(c0947Xy);
        setCarouselLayoutManager(c0947Xy);
    }

    @Nullable
    public S9 getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof S9) {
            return (S9) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public C1135cB getLayoutManager() {
        return (C1135cB) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C0947Xy c0947Xy) {
        C1135cB c1135cB = new C1135cB(c0947Xy, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1135cB.A1V(true);
        }
        super.setLayoutManager(c1135cB);
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public void setLayoutManager(C4T c4t) {
    }
}
