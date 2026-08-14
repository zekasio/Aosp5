package com.vungle.warren.ui.contract;

import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.presenter.NativeAdPresenter;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdContract {

    public interface NativePresenter extends AdContract.AdvertisementPresenter<NativeView> {
        void onDownload();

        void onPrivacy();

        void onProgressUpdate(int i, float f);

        void setAdVisibility(boolean z);
    }

    public interface NativeView extends AdContract.AdView<NativeAdPresenter> {
        boolean isDialogVisible();
    }
}
