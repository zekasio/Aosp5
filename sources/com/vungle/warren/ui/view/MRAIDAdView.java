package com.vungle.warren.ui.view;

import android.content.Context;
import android.view.MotionEvent;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.WebAdContract;

/* JADX INFO: loaded from: classes3.dex */
public class MRAIDAdView extends BaseAdView<WebAdContract.WebAdPresenter> implements WebAdContract.WebAdView {
    private OnViewTouchListener onViewTouchListener;
    private WebAdContract.WebAdPresenter presenter;

    public MRAIDAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        super(context, fullAdWidget, orientationDelegate, closeDelegate);
        this.onViewTouchListener = new OnViewTouchListener() { // from class: com.vungle.warren.ui.view.MRAIDAdView.1
            @Override // com.vungle.warren.ui.view.OnViewTouchListener
            public boolean onTouch(MotionEvent motionEvent) {
                if (MRAIDAdView.this.presenter == null) {
                    return false;
                }
                MRAIDAdView.this.presenter.onViewTouched(motionEvent);
                return false;
            }
        };
        attachListeners();
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void updateWindow() {
        this.view.updateWindow();
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void setVisibility(boolean z) {
        this.view.setVisibility(z ? 0 : 8);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(WebAdContract.WebAdPresenter webAdPresenter) {
        this.presenter = webAdPresenter;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        this.view.showWebsite(str);
    }

    private void attachListeners() {
        this.view.setOnViewTouchListener(this.onViewTouchListener);
    }
}
