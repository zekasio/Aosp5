package com.vungle.warren.ui.contract;

import android.view.MotionEvent;
import com.vungle.warren.ui.contract.AdContract;

/* JADX INFO: loaded from: classes3.dex */
public interface WebAdContract {

    public interface WebAdPresenter extends AdContract.AdvertisementPresenter<WebAdView> {
        void onViewTouched(MotionEvent motionEvent);

        void setAdVisibility(boolean z);
    }

    public interface WebAdView extends AdContract.AdView<WebAdPresenter> {
        void setVisibility(boolean z);

        void updateWindow();
    }
}
