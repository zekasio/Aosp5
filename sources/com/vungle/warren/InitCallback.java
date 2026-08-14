package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes3.dex */
public interface InitCallback {
    void onAutoCacheAdAvailable(String str);

    void onError(VungleException vungleException);

    void onSuccess();
}
