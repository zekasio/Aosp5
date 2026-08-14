package com.vungle.warren.network.converters;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyResponseConverter implements Converter<ResponseBody, Void> {
    @Override // com.vungle.warren.network.converters.Converter
    public Void convert(ResponseBody responseBody) {
        responseBody.close();
        return null;
    }
}
