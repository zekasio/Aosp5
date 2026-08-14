package com.tapjoy;

import android.content.Context;
import android.webkit.WebView;
import android.widget.VideoView;
import com.tapjoy.internal.v5;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TJJSBridgeDelegate {
    public void attachVolumeListener(boolean z, int i) {
    }

    public void clearVideo(TJTaskHandler<Boolean> tJTaskHandler, boolean z) {
        tJTaskHandler.onComplete(false);
    }

    public boolean dismiss() {
        return false;
    }

    public boolean fireContentError(TJError tJError) {
        return false;
    }

    public boolean fireContentReady() {
        return false;
    }

    public void fireOnClick() {
    }

    public void fireOnVideoComplete() {
    }

    public void fireOnVideoError(String str) {
    }

    public void fireOnVideoStart() {
    }

    public String getBeaconId() {
        return null;
    }

    public abstract Context getContext();

    public <T> T getData(String str, Class<T> cls) {
        return null;
    }

    public Map<String, Object> getOrientation() {
        return null;
    }

    public VideoView getVideoView() {
        return null;
    }

    public Map<String, Object> getVolumeArgs() {
        return null;
    }

    public abstract WebView getWebView();

    public boolean isMuted() {
        return false;
    }

    public void loadVideoUrl(String str, TJTaskHandler<Boolean> tJTaskHandler) {
        tJTaskHandler.onComplete(false);
    }

    public void muteVideo(boolean z) {
    }

    public boolean pauseVideo() {
        return false;
    }

    public boolean playVideo() {
        return false;
    }

    public void setBackgroundColor(String str, TJTaskHandler<Boolean> tJTaskHandler) {
        tJTaskHandler.onComplete(false);
    }

    public void setBackgroundContent(String str, TJTaskHandler<Boolean> tJTaskHandler) {
        tJTaskHandler.onComplete(false);
    }

    public void setCloseButtonClickable(boolean z) {
    }

    public void setCloseButtonVisible(boolean z) {
    }

    public boolean setOrientation(int i) {
        return false;
    }

    public boolean setVideoMargins(float f, float f2, float f3, float f4) {
        return false;
    }

    public void setupSdkBeacons(v5 v5Var) {
    }

    public void shouldClose(boolean z) {
    }

    public boolean unsetOrientation() {
        return false;
    }
}
