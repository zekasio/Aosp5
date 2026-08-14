package org.cocos2dx.cpp;

import android.app.Activity;
import android.os.Bundle;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;

/* JADX INFO: loaded from: classes3.dex */
public class TapjoyOfferwall extends Activity implements TJGetCurrencyBalanceListener, TJPlacementListener {
    public static final String TAG = "TapjoyOfferwall";
    private TJPlacement offerwallPlacement;

    @Override // com.tapjoy.TJPlacementListener
    public void onClick(TJPlacement tJPlacement) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentDismiss(TJPlacement tJPlacement) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentReady(TJPlacement tJPlacement) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentShow(TJPlacement tJPlacement) {
    }

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponse(String str, int i) {
    }

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponseFailure(String str) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestSuccess(TJPlacement tJPlacement) {
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
