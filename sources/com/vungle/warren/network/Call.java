package com.vungle.warren.network;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Call<T> {
    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;
}
