package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1152cW implements C2J {
    public final SharedPreferences A00;

    public C1152cW(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final C2I A57() {
        return new C1153cX(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final long A6u(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    @Nullable
    public final String A7c(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
