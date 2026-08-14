package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes3.dex */
public interface LoadAdCallback {
    void onAdLoad(String str);

    void onError(String str, VungleException vungleException);
}
