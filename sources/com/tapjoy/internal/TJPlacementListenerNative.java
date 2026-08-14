package com.tapjoy.internal;

import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJPlacementListenerNative implements TJPlacementListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1739a;

    public TJPlacementListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1739a = j;
    }

    public static Object create(long j) {
        return new TJPlacementListenerNative(j);
    }

    public static native void onClickNative(long j, TJPlacement tJPlacement, String str);

    public static native void onContentDismissNative(long j, TJPlacement tJPlacement, String str);

    public static native void onContentReadyNative(long j, TJPlacement tJPlacement, String str);

    public static native void onContentShowNative(long j, TJPlacement tJPlacement, String str);

    public static native void onPurchaseRequestNative(long j, TJPlacement tJPlacement, String str, TJActionRequest tJActionRequest, String str2, String str3, String str4);

    public static native void onRequestFailureNative(long j, TJPlacement tJPlacement, String str, int i, String str2);

    public static native void onRequestSuccessNative(long j, TJPlacement tJPlacement, String str);

    public static native void onRewardRequestNative(long j, TJPlacement tJPlacement, String str, TJActionRequest tJActionRequest, String str2, String str3, String str4, int i);

    @Override // com.tapjoy.TJPlacementListener
    public void onClick(TJPlacement tJPlacement) {
        onClickNative(this.f1739a, tJPlacement, tJPlacement.getName());
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentDismiss(TJPlacement tJPlacement) {
        onContentDismissNative(this.f1739a, tJPlacement, tJPlacement.getName());
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentReady(TJPlacement tJPlacement) {
        onContentReadyNative(this.f1739a, tJPlacement, tJPlacement.getName());
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onContentShow(TJPlacement tJPlacement) {
        onContentShowNative(this.f1739a, tJPlacement, tJPlacement.getName());
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        onPurchaseRequestNative(this.f1739a, tJPlacement, tJPlacement.getName(), tJActionRequest, tJActionRequest.getRequestId(), tJActionRequest.getToken(), str);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
        onRequestFailureNative(this.f1739a, tJPlacement, tJPlacement.getName(), tJError.code, tJError.message);
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRequestSuccess(TJPlacement tJPlacement) {
        onRequestSuccessNative(this.f1739a, tJPlacement, tJPlacement.getName());
    }

    @Override // com.tapjoy.TJPlacementListener
    public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        onRewardRequestNative(this.f1739a, tJPlacement, tJPlacement.getName(), tJActionRequest, tJActionRequest.getRequestId(), tJActionRequest.getToken(), str, i);
    }
}
