package com.tapjoy;

/* JADX INFO: loaded from: classes2.dex */
public interface TJOfferwallDiscoverListener {
    void contentError(TJError tJError);

    void contentReady();

    void requestFailure(TJError tJError);

    void requestSuccess();
}
