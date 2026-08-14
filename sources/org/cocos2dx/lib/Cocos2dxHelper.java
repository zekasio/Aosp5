package org.cocos2dx.lib;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.android.vending.expansion.zipfile.APKExpansionSupport;
import com.android.vending.expansion.zipfile.ZipResourceFile;
import com.enhance.gameservice.IGameTuningService;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Cocos2dxHelper {
    private static final int BOOST_TIME = 7;
    private static final String PREFS_NAME = "Cocos2dxPrefsFile";
    private static final int RUNNABLES_PER_FRAME = 5;
    private static final String TAG = "Cocos2dxHelper";
    private static boolean sAccelerometerEnabled;
    private static Activity sActivity;
    private static boolean sActivityVisible;
    private static AssetManager sAssetManager;
    private static Cocos2dxMusic sCocos2dMusic;
    private static Cocos2dxSound sCocos2dSound;
    private static Cocos2dxAccelerometer sCocos2dxAccelerometer;
    private static Cocos2dxHelperListener sCocos2dxHelperListener;
    private static boolean sCompassEnabled;
    private static String sFileDirectory;
    private static String sPackageName;
    private static Set<PreferenceManager.OnActivityResultListener> onActivityResultListeners = new LinkedHashSet();
    private static Vibrator sVibrateService = null;
    private static IGameTuningService mGameServiceBinder = null;
    private static String sAssetsPath = "";
    private static ZipResourceFile sOBBFile = null;
    private static boolean sInited = false;
    private static ServiceConnection connection = new ServiceConnection() { // from class: org.cocos2dx.lib.Cocos2dxHelper.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGameTuningService unused = Cocos2dxHelper.mGameServiceBinder = IGameTuningService.Stub.asInterface(iBinder);
            Cocos2dxHelper.fastLoading(7);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Cocos2dxHelper.sActivity.getApplicationContext().unbindService(Cocos2dxHelper.connection);
        }
    };

    public interface Cocos2dxHelperListener {
        void runOnGLThread(Runnable runnable);

        void showDialog(String str, String str2);
    }

    public static boolean ClearNotificationAll() {
        return true;
    }

    private static native void nativeSetApkPath(String str);

    private static native void nativeSetAudioDeviceInfo(boolean z, int i, int i2);

    private static native void nativeSetContext(Context context, AssetManager assetManager);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetEditTextDialogResult(byte[] bArr);

    public static void runOnGLThread(Runnable runnable) {
        ((Cocos2dxActivity) sActivity).runOnGLThread(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void init(Activity activity) {
        int i;
        int i2;
        sActivity = activity;
        sCocos2dxHelperListener = (Cocos2dxHelperListener) activity;
        if (sInited) {
            return;
        }
        boolean zHasSystemFeature = activity.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        Log.d(TAG, "isSupportLowLatency:" + zHasSystemFeature);
        AudioManager audioManager = (AudioManager) activity.getSystemService("audio");
        int i3 = 1;
        String str = (String) Cocos2dxReflectionHelper.invokeInstanceMethod(audioManager, "getProperty", new Class[]{String.class}, new Object[]{Cocos2dxReflectionHelper.getConstantValue(AudioManager.class, "PROPERTY_OUTPUT_SAMPLE_RATE")});
        String str2 = (String) Cocos2dxReflectionHelper.invokeInstanceMethod(audioManager, "getProperty", new Class[]{String.class}, new Object[]{Cocos2dxReflectionHelper.getConstantValue(AudioManager.class, "PROPERTY_OUTPUT_FRAMES_PER_BUFFER")});
        try {
            i = Integer.parseInt(str);
            try {
                i2 = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                e = e;
                Log.e(TAG, "parseInt failed", e);
                i2 = 192;
            }
        } catch (NumberFormatException e2) {
            e = e2;
            i = 44100;
        }
        Log.d(TAG, "sampleRate: " + i + ", framesPerBuffer: " + i2);
        nativeSetAudioDeviceInfo(zHasSystemFeature, i, i2);
        sPackageName = activity.getApplicationInfo().packageName;
        sFileDirectory = activity.getFilesDir().getAbsolutePath();
        nativeSetApkPath(getAssetsPath());
        sCocos2dxAccelerometer = new Cocos2dxAccelerometer(activity);
        sCocos2dMusic = new Cocos2dxMusic(activity);
        sCocos2dSound = new Cocos2dxSound(activity);
        AssetManager assets = activity.getAssets();
        sAssetManager = assets;
        nativeSetContext(activity, assets);
        Cocos2dxBitmap.setContext(activity);
        sVibrateService = (Vibrator) activity.getSystemService("vibrator");
        sInited = true;
        Intent intent = new Intent(IGameTuningService.class.getName());
        intent.setPackage("com.enhance.gameservice");
        activity.getApplicationContext().bindService(intent, connection, 1);
        try {
            i3 = Cocos2dxActivity.getContext().getPackageManager().getPackageInfo(getCocos2dxPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
        }
        try {
            sOBBFile = APKExpansionSupport.getAPKExpansionZipFile(Cocos2dxActivity.getContext(), i3, 0);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static String getAssetsPath() {
        String str = "";
        if (sAssetsPath.equals("")) {
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + sPackageName;
            String[] list = new File(str2).list(new FilenameFilter() { // from class: org.cocos2dx.lib.Cocos2dxHelper.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str3) {
                    return str3.startsWith("main.") && str3.endsWith(".obb");
                }
            });
            if (list != null && list.length > 0) {
                str = str2 + "/" + list[0];
            }
            if (new File(str).exists()) {
                sAssetsPath = str;
            } else {
                sAssetsPath = sActivity.getApplicationInfo().sourceDir;
            }
        }
        return sAssetsPath;
    }

    public static ZipResourceFile getObbFile() {
        return sOBBFile;
    }

    public static Activity getActivity() {
        return sActivity;
    }

    public static void addOnActivityResultListener(PreferenceManager.OnActivityResultListener onActivityResultListener) {
        onActivityResultListeners.add(onActivityResultListener);
    }

    public static Set<PreferenceManager.OnActivityResultListener> getOnActivityResultListeners() {
        return onActivityResultListeners;
    }

    public static boolean isActivityVisible() {
        return sActivityVisible;
    }

    public static String getCocos2dxPackageName() {
        return sPackageName;
    }

    public static String getCocos2dxWritablePath() {
        return sFileDirectory;
    }

    public static boolean Onadstop(int i) {
        ((Cocos2dxActivity) sActivity).adstop(i);
        return true;
    }

    public static boolean OnInterstitial(int i) {
        ((Cocos2dxActivity) sActivity).absInterstitial(i);
        return true;
    }

    public static void Click_CrossAD(int i) {
        ((Cocos2dxActivity) sActivity).CrossAd_LogEvent(i);
    }

    public static void Click_ExitAD(int i) {
        ((Cocos2dxActivity) sActivity).ExitAd_LogEvent(i);
    }

    public static void Click_AppsFlyerEvent(int i, String str, String str2) {
        ((Cocos2dxActivity) sActivity).AppsFlyerEvent(i, str, str2);
    }

    public static void Click_ChristmaxEvent(boolean z) {
        ((Cocos2dxActivity) sActivity).MerryChristmasEvent(z);
    }

    public static void exeGoogleLogin() {
        ((Cocos2dxActivity) sActivity).exeGoogleLogin();
    }

    public static void exeGoogleLogout() {
        ((Cocos2dxActivity) sActivity).exeGoogleLogout();
    }

    public static boolean exeIsSigned() {
        return ((Cocos2dxActivity) sActivity).exeIsSigned();
    }

    public static void exeShowLeaderboards(String str) {
        ((Cocos2dxActivity) sActivity).exeShowLeaderboards(str);
    }

    public static void exesubmitScore(String str, long j) {
        ((Cocos2dxActivity) sActivity).exeSubmitScore(str, j);
    }

    public static void exeShowAchievements() {
        ((Cocos2dxActivity) sActivity).exeShowAchievements();
    }

    public static void exeIncrementalAchievementUnlocked(String str) {
        ((Cocos2dxActivity) sActivity).exeIncrementalAchievementUnlocked(str);
    }

    public static void exeIncrementalAchievementStep(String str, int i) {
        ((Cocos2dxActivity) sActivity).exeIncrementalAchievementStep(str, i);
    }

    public static void exeAchievementUnlocked(String str, boolean z) {
        ((Cocos2dxActivity) sActivity).exeAchievementUnlocked(str, z);
    }

    public static void purchase(int i) {
        ((Cocos2dxActivity) sActivity).purchase(i);
    }

    public static void getPurchaseList() {
        ((Cocos2dxActivity) sActivity).getPurchaseList();
    }

    public static void setRestore() {
        ((Cocos2dxActivity) sActivity).setRestore();
    }

    public static boolean getNetWorkConnecting() {
        return ((Cocos2dxActivity) sActivity).getNetWorkConnecting();
    }

    public static void SkipGameClearBonus() {
        ((Cocos2dxActivity) sActivity).SkipGameClearBonus();
    }

    public static void RequestLoadRewardAd_DailyBonus() {
        ((Cocos2dxActivity) sActivity).RequestLoadRewardAd_DailyBonus();
    }

    public static String getSysInfo(int i) {
        if (i == 1) {
            return Settings.Secure.getString(sActivity.getApplicationContext().getContentResolver(), "android_id");
        }
        if (i == 3) {
            return Build.MODEL;
        }
        if (i == 4) {
            return Build.VERSION.RELEASE;
        }
        if (i != 5) {
            return "";
        }
        return sActivity.getApplicationContext().getResources().getConfiguration().locale.getCountry();
    }

    public static boolean getNetStatus() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) sActivity.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 0) {
                if (!activeNetworkInfo.isConnectedOrConnecting()) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static String getCurrentLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static AssetManager getAssetManager() {
        return sAssetManager;
    }

    public static void enableAccelerometer() {
        sAccelerometerEnabled = true;
        sCocos2dxAccelerometer.enableAccel();
    }

    public static void enableCompass() {
        sCompassEnabled = true;
        sCocos2dxAccelerometer.enableCompass();
    }

    public static void setAccelerometerInterval(float f) {
        sCocos2dxAccelerometer.setInterval(f);
    }

    public static void disableAccelerometer() {
        sAccelerometerEnabled = false;
        sCocos2dxAccelerometer.disable();
    }

    public static void setKeepScreenOn(boolean z) {
        ((Cocos2dxActivity) sActivity).setKeepScreenOn(z);
    }

    public static void vibrate(float f) {
        sVibrateService.vibrate((long) (f * 1000.0f));
    }

    public static String getVersion() {
        try {
            return Cocos2dxActivity.getContext().getPackageManager().getPackageInfo(Cocos2dxActivity.getContext().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean openURL(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            sActivity.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long[] getObbAssetFileDescriptor(String str) {
        AssetFileDescriptor assetFileDescriptor;
        long[] jArr = new long[3];
        ZipResourceFile zipResourceFile = sOBBFile;
        if (zipResourceFile != null && (assetFileDescriptor = zipResourceFile.getAssetFileDescriptor(str)) != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
                jArr[0] = ((Integer) parcelFileDescriptor.getClass().getMethod("getFd", null).invoke(parcelFileDescriptor, null)).intValue();
                jArr[1] = assetFileDescriptor.getStartOffset();
                jArr[2] = assetFileDescriptor.getLength();
            } catch (IllegalAccessException e) {
                Log.e(TAG, e.toString());
            } catch (NoSuchMethodException unused) {
                Log.e(TAG, "Accessing file descriptor directly from the OBB is only supported from Android 3.1 (API level 12) and above.");
            } catch (InvocationTargetException e2) {
                Log.e(TAG, e2.toString());
            }
        }
        return jArr;
    }

    public static void preloadBackgroundMusic(String str) {
        sCocos2dMusic.preloadBackgroundMusic(str);
    }

    public static void playBackgroundMusic(String str, boolean z) {
        sCocos2dMusic.playBackgroundMusic(str, z);
    }

    public static void resumeBackgroundMusic() {
        sCocos2dMusic.resumeBackgroundMusic();
    }

    public static void pauseBackgroundMusic() {
        sCocos2dMusic.pauseBackgroundMusic();
    }

    public static void stopBackgroundMusic() {
        sCocos2dMusic.stopBackgroundMusic();
    }

    public static void rewindBackgroundMusic() {
        sCocos2dMusic.rewindBackgroundMusic();
    }

    public static boolean willPlayBackgroundMusic() {
        return sCocos2dMusic.willPlayBackgroundMusic();
    }

    public static boolean isBackgroundMusicPlaying() {
        return sCocos2dMusic.isBackgroundMusicPlaying();
    }

    public static float getBackgroundMusicVolume() {
        return sCocos2dMusic.getBackgroundVolume();
    }

    public static void setBackgroundMusicVolume(float f) {
        sCocos2dMusic.setBackgroundVolume(f);
    }

    public static void preloadEffect(String str) {
        sCocos2dSound.preloadEffect(str);
    }

    public static int playEffect(String str, boolean z, float f, float f2, float f3) {
        return sCocos2dSound.playEffect(str, z, f, f2, f3);
    }

    public static void resumeEffect(int i) {
        sCocos2dSound.resumeEffect(i);
    }

    public static void pauseEffect(int i) {
        sCocos2dSound.pauseEffect(i);
    }

    public static void stopEffect(int i) {
        sCocos2dSound.stopEffect(i);
    }

    public static float getEffectsVolume() {
        return sCocos2dSound.getEffectsVolume();
    }

    public static void setEffectsVolume(float f) {
        sCocos2dSound.setEffectsVolume(f);
    }

    public static void unloadEffect(String str) {
        sCocos2dSound.unloadEffect(str);
    }

    public static void pauseAllEffects() {
        sCocos2dSound.pauseAllEffects();
    }

    public static void resumeAllEffects() {
        sCocos2dSound.resumeAllEffects();
    }

    public static void stopAllEffects() {
        sCocos2dSound.stopAllEffects();
    }

    static void setAudioFocus(boolean z) {
        sCocos2dMusic.setAudioFocus(z);
        sCocos2dSound.setAudioFocus(z);
    }

    public static void end() {
        sCocos2dMusic.end();
        sCocos2dSound.end();
    }

    public static void onResume() {
        sActivityVisible = true;
        if (sAccelerometerEnabled) {
            sCocos2dxAccelerometer.enableAccel();
        }
        if (sCompassEnabled) {
            sCocos2dxAccelerometer.enableCompass();
        }
    }

    public static void onPause() {
        sActivityVisible = false;
        if (sAccelerometerEnabled) {
            sCocos2dxAccelerometer.disable();
        }
    }

    public static void onEnterBackground() {
        sCocos2dSound.onEnterBackground();
        sCocos2dMusic.onEnterBackground();
    }

    public static void onEnterForeground() {
        sCocos2dSound.onEnterForeground();
        sCocos2dMusic.onEnterForeground();
    }

    public static void terminateProcess() {
        Process.killProcess(Process.myPid());
    }

    private static void showDialog(String str, String str2) {
        sCocos2dxHelperListener.showDialog(str, str2);
    }

    public static void setEditTextDialogResult(String str) {
        try {
            final byte[] bytes = str.getBytes("UTF8");
            sCocos2dxHelperListener.runOnGLThread(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    Cocos2dxHelper.nativeSetEditTextDialogResult(bytes);
                }
            });
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public static int getDPI() {
        Display defaultDisplay;
        if (sActivity == null) {
            return -1;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = sActivity.getWindowManager();
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return -1;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return (int) (displayMetrics.density * 160.0f);
    }

    public static boolean getBoolForKey(String str, boolean z) {
        SharedPreferences sharedPreferences = sActivity.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getBoolean(str, z);
        } catch (Exception e) {
            e.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean(obj.toString());
            }
            return obj instanceof Integer ? ((Integer) obj).intValue() != 0 : obj instanceof Float ? ((Float) obj).floatValue() != 0.0f : z;
        }
    }

    public static int getIntegerForKey(String str, int i) {
        SharedPreferences sharedPreferences = sActivity.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getInt(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Integer.parseInt(obj.toString());
            }
            if (obj instanceof Float) {
                return ((Float) obj).intValue();
            }
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return 1;
            }
            return i;
        }
    }

    public static float getFloatForKey(String str, float f) {
        SharedPreferences sharedPreferences = sActivity.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getFloat(str, f);
        } catch (Exception e) {
            e.printStackTrace();
            Object obj = sharedPreferences.getAll().get(str);
            if (obj instanceof String) {
                return Float.parseFloat(obj.toString());
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).floatValue();
            }
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return 1.0f;
            }
            return f;
        }
    }

    public static double getDoubleForKey(String str, double d) {
        return getFloatForKey(str, (float) d);
    }

    public static String getStringForKey(String str, String str2) {
        SharedPreferences sharedPreferences = sActivity.getSharedPreferences(PREFS_NAME, 0);
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return sharedPreferences.getAll().get(str).toString();
        }
    }

    public static void setBoolForKey(String str, boolean z) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void setIntegerForKey(String str, int i) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static void setFloatForKey(String str, float f) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.putFloat(str, f);
        editorEdit.apply();
    }

    public static void setDoubleForKey(String str, double d) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.putFloat(str, (float) d);
        editorEdit.apply();
    }

    public static void setStringForKey(String str, String str2) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void deleteValueForKey(String str) {
        SharedPreferences.Editor editorEdit = sActivity.getSharedPreferences(PREFS_NAME, 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static byte[] conversionEncoding(byte[] bArr, String str, String str2) {
        try {
            return new String(bArr, str).getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int setResolutionPercent(int i) {
        try {
            IGameTuningService iGameTuningService = mGameServiceBinder;
            if (iGameTuningService != null) {
                return iGameTuningService.setPreferredResolution(i);
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int setFPS(int i) {
        try {
            IGameTuningService iGameTuningService = mGameServiceBinder;
            if (iGameTuningService != null) {
                return iGameTuningService.setFramePerSecond(i);
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int fastLoading(int i) {
        try {
            IGameTuningService iGameTuningService = mGameServiceBinder;
            if (iGameTuningService != null) {
                return iGameTuningService.boostUp(i);
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getTemperature() {
        try {
            IGameTuningService iGameTuningService = mGameServiceBinder;
            if (iGameTuningService != null) {
                return iGameTuningService.getAbstractTemperature();
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int setLowPowerMode(boolean z) {
        try {
            IGameTuningService iGameTuningService = mGameServiceBinder;
            if (iGameTuningService != null) {
                return iGameTuningService.setGamePowerSaving(z);
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static float[] getAccelValue() {
        return sCocos2dxAccelerometer.accelerometerValues;
    }

    public static float[] getCompassValue() {
        return sCocos2dxAccelerometer.compassFieldValues;
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }
}
