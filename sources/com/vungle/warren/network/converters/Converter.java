package com.vungle.warren.network.converters;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Converter<In, Out> {
    Out convert(In in) throws IOException;
}
