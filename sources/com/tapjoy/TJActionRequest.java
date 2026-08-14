package com.tapjoy;

/* JADX INFO: loaded from: classes2.dex */
public interface TJActionRequest {
    void cancelled();

    void completed();

    String getRequestId();

    String getToken();
}
