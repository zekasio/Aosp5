package com.vungle.warren.network;

/* JADX INFO: loaded from: classes3.dex */
public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th);

    void onResponse(Call<T> call, Response<T> response);
}
