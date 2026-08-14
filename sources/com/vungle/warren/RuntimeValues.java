package com.vungle.warren;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class RuntimeValues {
    final AtomicReference<HeaderBiddingCallback> headerBiddingCallback = new AtomicReference<>();
    final AtomicReference<InitCallback> initCallback = new AtomicReference<>();
    final AtomicReference<VungleSettings> settings = new AtomicReference<>();
}
