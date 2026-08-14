package com.vungle.warren.utility;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrencyTimeoutProvider implements TimeoutProvider {
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    @Override // com.vungle.warren.utility.TimeoutProvider
    public long getTimeout() {
        if (ThreadUtil.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
