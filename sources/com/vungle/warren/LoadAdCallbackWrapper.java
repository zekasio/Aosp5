package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.ThreadUtil;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
class LoadAdCallbackWrapper implements LoadAdCallback {
    private final ExecutorService executorService;
    private final LoadAdCallback loadAdCallback;

    public LoadAdCallbackWrapper(ExecutorService executorService, LoadAdCallback loadAdCallback) {
        this.loadAdCallback = loadAdCallback;
        this.executorService = executorService;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(final String str) {
        if (this.loadAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.loadAdCallback.onAdLoad(str);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.LoadAdCallbackWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    LoadAdCallbackWrapper.this.loadAdCallback.onAdLoad(str);
                }
            });
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(final String str, final VungleException vungleException) {
        if (this.loadAdCallback == null) {
            return;
        }
        if (ThreadUtil.isMainThread()) {
            this.loadAdCallback.onError(str, vungleException);
        } else {
            this.executorService.execute(new Runnable() { // from class: com.vungle.warren.LoadAdCallbackWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    LoadAdCallbackWrapper.this.loadAdCallback.onError(str, vungleException);
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadAdCallbackWrapper loadAdCallbackWrapper = (LoadAdCallbackWrapper) obj;
        LoadAdCallback loadAdCallback = this.loadAdCallback;
        if (loadAdCallback == null ? loadAdCallbackWrapper.loadAdCallback != null : !loadAdCallback.equals(loadAdCallbackWrapper.loadAdCallback)) {
            return false;
        }
        ExecutorService executorService = this.executorService;
        ExecutorService executorService2 = loadAdCallbackWrapper.executorService;
        return executorService != null ? executorService.equals(executorService2) : executorService2 == null;
    }

    public int hashCode() {
        LoadAdCallback loadAdCallback = this.loadAdCallback;
        int iHashCode = (loadAdCallback != null ? loadAdCallback.hashCode() : 0) * 31;
        ExecutorService executorService = this.executorService;
        return iHashCode + (executorService != null ? executorService.hashCode() : 0);
    }
}
