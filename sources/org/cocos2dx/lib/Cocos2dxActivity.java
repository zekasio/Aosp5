package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.cocos2dx.lib.Cocos2dxHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Cocos2dxActivity extends Activity implements Cocos2dxHelper.Cocos2dxHelperListener {
    private static final String TAG = "Cocos2dxActivity";
    private static Cocos2dxActivity sContext;
    private Cocos2dxGLSurfaceView mGLSurfaceView = null;
    private int[] mGLContextAttrs = null;
    private Cocos2dxHandler mHandler = null;
    private Cocos2dxVideoHelper mVideoHelper = null;
    private Cocos2dxWebViewHelper mWebViewHelper = null;
    private Cocos2dxEditBoxHelper mEditBoxHelper = null;
    private boolean hasFocus = false;
    private boolean showVirtualButton = false;
    protected ResizeLayout mFrameLayout = null;

    private static native int[] getGLContextAttrs();

    public abstract void AppsFlyerEvent(int i, String str, String str2);

    public abstract void CrossAd_LogEvent(int i);

    public abstract void ExitAd_LogEvent(int i);

    public abstract void MerryChristmasEvent(boolean z);

    public abstract void RequestLoadRewardAd_DailyBonus();

    public abstract void SkipGameClearBonus();

    public abstract void absInterstitial(int i);

    public abstract void adstop(int i);

    public abstract void exeAchievementUnlocked(String str, boolean z);

    public abstract void exeGoogleLogin();

    public abstract void exeGoogleLogout();

    public abstract void exeIncrementalAchievementStep(String str, int i);

    public abstract void exeIncrementalAchievementUnlocked(String str);

    public abstract boolean exeIsSigned();

    public abstract void exeShowAchievements();

    public abstract void exeShowLeaderboards(String str);

    public abstract void exeSubmitScore(String str, long j);

    public abstract boolean getNetWorkConnecting();

    public abstract void getPurchaseList();

    public abstract void purchase(int i);

    public abstract void setRestore();

    public Cocos2dxGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public static Context getContext() {
        return sContext;
    }

    public void setKeepScreenOn(final boolean z) {
        runOnUiThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxActivity.1
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxActivity.this.mGLSurfaceView.setKeepScreenOn(z);
            }
        });
    }

    public void setEnableVirtualButton(boolean z) {
        this.showVirtualButton = z;
    }

    protected void onLoadNativeLibraries() {
        try {
            System.loadLibrary(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("android.app.lib_name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            finish();
            Log.w(TAG, "[Workaround] Ignore the activity started from icon!");
            return;
        }
        hideVirtualButton();
        onLoadNativeLibraries();
        sContext = this;
        this.mHandler = new Cocos2dxHandler(this);
        Cocos2dxHelper.init(this);
        this.mGLContextAttrs = getGLContextAttrs();
        init();
        if (this.mVideoHelper == null) {
            this.mVideoHelper = new Cocos2dxVideoHelper(this, this.mFrameLayout);
        }
        if (this.mWebViewHelper == null) {
            this.mWebViewHelper = new Cocos2dxWebViewHelper(this.mFrameLayout);
        }
        if (this.mEditBoxHelper == null) {
            this.mEditBoxHelper = new Cocos2dxEditBoxHelper(this.mFrameLayout);
        }
        getWindow().setSoftInputMode(32);
        setVolumeControlStream(3);
        Cocos2dxEngineDataManager.init(this, this.mGLSurfaceView);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onResume() {
        Log.d(TAG, "onResume()");
        super.onResume();
        Cocos2dxAudioFocusManager.registerAudioFocusListener(this);
        hideVirtualButton();
        resumeIfHasFocus();
        Cocos2dxEngineDataManager.resume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Log.d(TAG, "onWindowFocusChanged() hasFocus=" + z);
        super.onWindowFocusChanged(z);
        this.hasFocus = z;
        resumeIfHasFocus();
    }

    private void resumeIfHasFocus() {
        if (this.hasFocus) {
            hideVirtualButton();
            Cocos2dxHelper.onResume();
            this.mGLSurfaceView.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        Log.d(TAG, "onPause()");
        super.onPause();
        Cocos2dxAudioFocusManager.unregisterAudioFocusListener(this);
        Cocos2dxHelper.onPause();
        this.mGLSurfaceView.onPause();
        Cocos2dxEngineDataManager.pause();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        Cocos2dxAudioFocusManager.unregisterAudioFocusListener(this);
        super.onDestroy();
        Cocos2dxEngineDataManager.destroy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void showDialog(String str, String str2) {
        Message message = new Message();
        message.what = 1;
        message.obj = new Cocos2dxHandler.DialogMessage(str, str2);
        this.mHandler.sendMessage(message);
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void runOnGLThread(Runnable runnable) {
        this.mGLSurfaceView.queueEvent(runnable);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        Iterator<PreferenceManager.OnActivityResultListener> it = Cocos2dxHelper.getOnActivityResultListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void init() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ResizeLayout resizeLayout = new ResizeLayout(this);
        this.mFrameLayout = resizeLayout;
        resizeLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        Cocos2dxEditBox cocos2dxEditBox = new Cocos2dxEditBox(this);
        cocos2dxEditBox.setLayoutParams(layoutParams2);
        this.mFrameLayout.addView(cocos2dxEditBox);
        Cocos2dxGLSurfaceView cocos2dxGLSurfaceViewOnCreateView = onCreateView();
        this.mGLSurfaceView = cocos2dxGLSurfaceViewOnCreateView;
        this.mFrameLayout.addView(cocos2dxGLSurfaceViewOnCreateView);
        if (isAndroidEmulator()) {
            this.mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        this.mGLSurfaceView.setCocos2dxRenderer(new Cocos2dxRenderer());
        this.mGLSurfaceView.setCocos2dxEditText(cocos2dxEditBox);
        setContentView(this.mFrameLayout);
    }

    public Cocos2dxGLSurfaceView onCreateView() {
        Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new Cocos2dxGLSurfaceView(this);
        if (this.mGLContextAttrs[3] > 0) {
            cocos2dxGLSurfaceView.getHolder().setFormat(-3);
        }
        cocos2dxGLSurfaceView.setEGLConfigChooser(new Cocos2dxEGLConfigChooser(this.mGLContextAttrs));
        return cocos2dxGLSurfaceView;
    }

    protected void hideVirtualButton() {
        if (this.showVirtualButton) {
            return;
        }
        try {
            int iIntValue = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION")).intValue();
            int iIntValue2 = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN")).intValue();
            int iIntValue3 = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_HIDE_NAVIGATION")).intValue();
            Cocos2dxReflectionHelper.invokeInstanceMethod(getWindow().getDecorView(), "setSystemUiVisibility", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_STABLE")).intValue() | iIntValue | iIntValue2 | iIntValue3 | ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_FULLSCREEN")).intValue() | ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY")).intValue())});
        } catch (NullPointerException e) {
            Log.e(TAG, "hideVirtualButton", e);
        }
    }

    private static boolean isAndroidEmulator() {
        String str = Build.MODEL;
        String str2 = TAG;
        Log.d(str2, "model=" + str);
        String str3 = Build.PRODUCT;
        Log.d(str2, "product=" + str3);
        boolean z = false;
        if (str3 != null && (str3.equals(TapjoyConstants.TJC_SDK_PLACEMENT) || str3.contains("_sdk") || str3.contains("sdk_"))) {
            z = true;
        }
        Log.d(str2, "isEmulator=" + z);
        return z;
    }

    private class Cocos2dxEGLConfigChooser implements GLSurfaceView.EGLConfigChooser {
        private final int EGL_OPENGL_ES2_BIT = 4;
        private final int EGL_OPENGL_ES3_BIT = 64;
        private int[] mConfigAttributes;

        public Cocos2dxEGLConfigChooser(int[] iArr) {
            this.mConfigAttributes = iArr;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = this.mConfigAttributes;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = iArr[4];
            int i6 = iArr[5];
            int[][] iArr2 = {new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12352, 4, 12344}, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5 >= 24 ? 16 : i5, 12326, i6, 12352, 4, 12344}, new int[]{12352, 4, 12344}};
            for (int i7 = 0; i7 < 3; i7++) {
                EGLConfig eGLConfigDoChooseConfig = doChooseConfig(egl10, eGLDisplay, iArr2[i7]);
                if (eGLConfigDoChooseConfig != null) {
                    return eGLConfigDoChooseConfig;
                }
            }
            Log.e("device_policy", "Can not select an EGLConfig for rendering.");
            return null;
        }

        private EGLConfig doChooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2) || iArr2[0] <= 0) {
                return null;
            }
            return eGLConfigArr[0];
        }
    }
}
