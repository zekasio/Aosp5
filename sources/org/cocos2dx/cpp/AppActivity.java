package org.cocos2dx.cpp;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.ads.mediation.tapjoy.TapjoyMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJError;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyConnectFlag;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.cocos2dx.cpp.AppActivity;
import org.cocos2dx.lib.Cocos2dxActivity;

/* JADX INFO: loaded from: classes3.dex */
public class AppActivity extends Cocos2dxActivity {
    private static final String AF_DEV_KEY = "mh84zyxNfyNY6GiTTmX4uk";
    private static final int BILLING_TIMEOUT = 5000;
    static final int INTERSTITIALAD_1 = 0;
    static final int INTERSTITIALAD_2 = 1;
    static final int INTERSTITIALAD_3 = 2;
    public static final String PREF_FILE = "MyPref";
    private static final int RC_ACHIEVEMENT_UI = 9003;
    private static final int RC_LEADERBOARD_UI = 9004;
    private static final int RC_SIGN_IN = 9001;
    private static final int RC_UNUSED = 5001;
    static final int REWARDED_ATMENU_IDX = 2;
    static final int REWARDED_DAILYBONUS_IDX = 0;
    static final int REWARDED_DRONEMAIN_IDX = 4;
    static final int REWARDED_DRONEOTHER_IDX = 5;
    static final int REWARDED_FIRSTAIDKIT_IDX = 3;
    static final int REWARDED_GAMECLEAR_IDX = 1;
    static final int REWARDED_WEARPONFREE_IDX = 6;
    static final int SHARE_REQUEST = 10701;
    private static final String TAG = "MainActivity";
    private static AppActivity activity = null;
    public static boolean bAgreeGDPR = false;
    private static InterstitialAd mInterstitialAd_1 = null;
    private static InterstitialAd mInterstitialAd_2 = null;
    private static InterstitialAd mInterstitialAd_3 = null;
    public static String mProductID = null;
    public static int pjhBad = 0;
    private static ArrayList<String> purchaseItemIDs = null;
    static final String strAdCodeApp = "ca-app-pub-8466761218588857~5799158330";
    static final String strAdCodeFull_1 = "ca-app-pub-8466761218588857/8309733616";
    static final String strAdCodeFull_2 = "ca-app-pub-8466761218588857/4402278195";
    static final String strAdCodeFull_3 = "ca-app-pub-8466761218588857/6362265110";
    static final String strAdRewardAtMenu = "ca-app-pub-8466761218588857/2506780585";
    static final String strAdRewardDailyBonus = "ca-app-pub-8466761218588857/6974856249";
    static final String strAdRewardDroneMain = "ca-app-pub-8466761218588857/2506780585";
    static final String strAdRewardDroneZombie = "ca-app-pub-8466761218588857/2506780585";
    static final String strAdRewardFirstAidKit = "ca-app-pub-8466761218588857/2478822431";
    static final String strAdRewardGameClear = "ca-app-pub-8466761218588857/4913414088";
    static final String strAdRewardWeaponFree = "ca-app-pub-8466761218588857/3749927109";
    String EventName;
    String EventVal;
    long Score;
    String ac_name;
    private BillingClient billingClient;
    private ConsentForm consentForm;
    private ConsentInformation consentInformation;
    private TJPlacement exePlacement;
    String leaderboardname;
    private AchievementsClient mAchievementsClient;
    private GoogleSignInClient mGoogleSignInClient;
    private LeaderboardsClient mLeaderboardsClient;
    public int mtType;
    static final String[] interstitialIds = {"1af0750c-f7cf-4be8-9c69-8da812aa527d", "8e7f6736-4522-4bb1-b33a-5d6782c7998a", "7dee1c13-a5b3-46c5-81d2-dfc8706ec49a"};
    static boolean[] interstitialLoadedAds = {false, false, false};
    private static RewardedAd m_AdRewardDailyBonus = null;
    private static RewardedAd m_AdRewardGameClear = null;
    private static RewardedAd m_AdRewardAtMenu = null;
    private static RewardedAd m_AdRewardFirstAidKit = null;
    private static RewardedAd m_AdRewardDroneMain = null;
    private static RewardedAd m_AdRewardDroneOther = null;
    private static RewardedAd m_AdRewardWeaponFree = null;
    static final String[] RewardedIds = {"dcaae693-e1cb-4174-afcc-cf5bedac74d0", "6b59e476-b749-410b-9c99-761e9959ae8e", "7a2b217a-8ca2-4d6f-acef-d96996d3cd12", "1ba9b211-008f-434f-997d-fa6f3d9fae36", "39cb30f2-2d4c-4844-906c-33edb5c49fdf", "9381d327-9442-475a-a667-f07a5907dbf9", "c8dd5bf5-51d2-4c8f-84aa-a363cb9228fd"};
    static boolean[] RewardedLoadedAds = {false, false, false, false, false, false, false};
    public FirebaseAnalytics mFirebaseAnalytics = null;
    int tapjoyDiamond = 0;
    int m_TypeAd = 0;
    private final Map<String, ProductDetails> productDetailsMap = new HashMap();
    private String strNotiPlacement = "Notice";
    private String strShopPlacement = "Shop";
    private String strEventShopPlacement = "Event_Shop";
    GoogleSignInAccount mSignedInAccount = null;
    private TJPlacementListener callTapjoy = new TJPlacementListener() { // from class: org.cocos2dx.cpp.AppActivity.10
        @Override // com.tapjoy.TJPlacementListener
        public void onClick(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentDismiss(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentShow(TJPlacement tJPlacement) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onRequestSuccess(TJPlacement tJPlacement) {
            if (tJPlacement.isContentAvailable() && tJPlacement.isContentReady()) {
                tJPlacement.showContent();
            }
        }

        @Override // com.tapjoy.TJPlacementListener
        public void onContentReady(TJPlacement tJPlacement) {
            if (tJPlacement.isContentReady()) {
                tJPlacement.showContent();
            }
        }
    };
    private boolean isBillingConnected = false;
    private final PurchasesUpdatedListener purchasesUpdatedListener = new PurchasesUpdatedListener() { // from class: org.cocos2dx.cpp.AppActivity.17
        @Override // com.android.billingclient.api.PurchasesUpdatedListener
        public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
            if (billingResult.getResponseCode() == 0 && list != null) {
                for (Purchase purchase : list) {
                    if (purchase.getPurchaseState() == 1) {
                        if (AppActivity.this.isConsumable(purchase.getProducts().get(0))) {
                            AppActivity.this.handleConsumablePurchase(purchase);
                        } else {
                            AppActivity.this.acknowledgePurchase(purchase);
                        }
                    }
                }
                return;
            }
            if (billingResult.getResponseCode() == 1) {
                AppActivity.nativeOnCanceled(AppActivity.mProductID);
            } else if (billingResult.getResponseCode() == 7) {
                AppActivity.nativeOnFailure(AppActivity.mProductID, "이미 보유중인 아이템입니다.");
            } else {
                AppActivity.nativeOnFailure(AppActivity.mProductID, billingResult.getDebugMessage());
            }
        }
    };

    static /* synthetic */ void lambda$restorePurchases$7(BillingResult billingResult, List list) {
    }

    static /* synthetic */ void lambda$setRestore$4(BillingResult billingResult, List list) {
    }

    static /* synthetic */ void lambda$showOfferwall$1(String str, int i) {
    }

    public static native void nativeGetRewardDailyBonus(boolean z);

    public static native void nativeGetRewardDrone(boolean z);

    public static native void nativeGetRewardFirstAidKit(boolean z);

    public static native void nativeGetRewardGameResult(boolean z);

    public static native void nativeGetRewardTitleMenu(boolean z);

    public static native void nativeGetRewardWeaponFree(boolean z);

    public static native void nativeIsReadyRewardAdDailyBonus(boolean z);

    public static native void nativeIsReadyRewardAdTitleMenu(boolean z);

    public static native void nativeOnCanceled(String str);

    public static native void nativeOnFailure(String str, String str2);

    public static native void nativeOnReflash(String[] strArr);

    public static native void nativeOnRestored(String str, int i);

    public static native void nativeOnSuccess(String str, boolean z);

    public static native void nativeRewardAdState(boolean z, int i);

    private void onAccountChanged(GoogleSignInAccount googleSignInAccount) {
    }

    public static native void onAchievementUnlocked(String str, boolean z);

    public static native void onCloseAdCb(String str);

    public static native void onCloseiAdCb(String str);

    public static native void onCompleteAdCb(String str);

    public static native void onConnectionStatusChanged(int i);

    public static native void onFailedAdCb(String str);

    public static native void onFailediAdCb(String str);

    public static native void onLoadAdCb(String str);

    public static native void onLoadiAdCb(String str);

    public static native void onShowAdCb(String str);

    public static native void onShowiAdCb(String str);

    public static native void onSkippedAdCb(String str);

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void RequestLoadRewardAd_DailyBonus() {
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void adstop(int i) {
    }

    public int getDia(int i) {
        return i;
    }

    static {
        System.loadLibrary("MyGame");
        purchaseItemIDs = new ArrayList() { // from class: org.cocos2dx.cpp.AppActivity.15
            {
                add("aos5.g001");
                add("aos5.g002");
                add("aos5.g003");
                add("aos5.j001");
                add("aos5.j002");
                add("aos5.gj001");
                add("aos5.ho399");
                add("aos5.ht399");
                add("aos5.hg599");
                add("aos5.hg699");
                add("aos5.hgo799");
                add("aos5.hgt799");
                add("aos5.hgs999");
                add("aos5.sg001");
                add("aos5.sg002");
                add("aos5.sg003");
                add("aos5.sj001");
                add("aos5.sj002");
                add("aos5.sj003");
                add("aos5.sgj001");
                add("aos5.sgj002");
                add("aos5.sgj003");
            }
        };
        mProductID = "";
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            activity = this;
            setRequestedOrientation(6);
            this.mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
            billingStart();
            pjhBad = 2;
            MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    AppActivity.lambda$onCreate$0(initializationStatus);
                }
            });
            TapjoyMediationAdapter tapjoyMediationAdapter = new TapjoyMediationAdapter();
            tapjoyMediationAdapter.getVersionInfo();
            tapjoyMediationAdapter.getSDKVersionInfo();
            this.mGoogleSignInClient = GoogleSignIn.getClient((Activity) this, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).requestScopes(Drive.SCOPE_APPFOLDER, new Scope[0]).build());
            Tapjoy.setDebugEnabled(true);
        }
    }

    static /* synthetic */ void lambda$onCreate$0(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        Iterator<String> it = adapterStatusMap.keySet().iterator();
        while (it.hasNext()) {
            adapterStatusMap.get(it.next());
        }
        InterstitialAdLoad_1();
        InterstitialAdLoad_2();
        InterstitialAdLoad_3();
    }

    public void loadForm() {
        UserMessagingPlatform.loadConsentForm(this, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: org.cocos2dx.cpp.AppActivity.1
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                AppActivity.activity.consentForm = consentForm;
                if (AppActivity.this.consentInformation.getConsentStatus() == 2) {
                    consentForm.show(AppActivity.activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: org.cocos2dx.cpp.AppActivity.1.1
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public void onConsentFormDismissed(FormError formError) {
                            AppActivity.this.loadForm();
                        }
                    });
                }
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: org.cocos2dx.cpp.AppActivity.2
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public void onConsentFormLoadFailure(FormError formError) {
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void absInterstitial(int i) {
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 1 || i == 6 || i == 7 || i == 9) {
            return;
        }
        if (i == 10) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 11) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 12) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 13) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 14) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 15) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 16) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 17) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 18) {
            this.m_TypeAd = i;
            return;
        }
        if (i == 50) {
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity appActivity = AppActivity.this;
                    appActivity.requestPlacement(appActivity.strNotiPlacement);
                }
            });
            return;
        }
        if (i == 51) {
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity appActivity = AppActivity.this;
                    appActivity.requestPlacement(appActivity.strShopPlacement);
                }
            });
            return;
        }
        if (i == 52) {
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity appActivity = AppActivity.this;
                    appActivity.requestPlacement(appActivity.strEventShopPlacement);
                }
            });
        } else {
            if (i == 700 || i == 701 || i == 702 || i != 1000) {
                return;
            }
            ShwoToast("There is no playable video. Please try again later.");
        }
    }

    private void connectToTapjoy() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(TapjoyConnectFlag.ENABLE_LOGGING, "true");
        Tapjoy.connect(getApplicationContext(), "DLns7R9pQwyn8XxTN6FaRQECGL0Sx8WXtNYchBU18sjFa0NAHlaBaZbSrxnI", hashtable, new TJConnectListener() { // from class: org.cocos2dx.cpp.AppActivity.6
            @Override // com.tapjoy.TJConnectListener
            public void onConnectFailure() {
            }

            @Override // com.tapjoy.TJConnectListener
            public void onConnectSuccess() {
                AppActivity.this.showOfferwall();
            }
        });
    }

    private void getCurrencyBalanceTapjoy() {
        Tapjoy.getCurrencyBalance(new TJGetCurrencyBalanceListener() { // from class: org.cocos2dx.cpp.AppActivity.7
            @Override // com.tapjoy.TJGetCurrencyBalanceListener
            public void onGetCurrencyBalanceResponseFailure(String str) {
            }

            @Override // com.tapjoy.TJGetCurrencyBalanceListener
            public void onGetCurrencyBalanceResponse(String str, int i) {
                AppActivity.this.tapjoyDiamond = i;
                AppActivity.this.setDiamonds();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOfferwall() {
        Tapjoy.setActivity(activity);
        Tapjoy.getPlacement("Aos5_Offerwall_AOS", this.callTapjoy).requestContent();
        Tapjoy.setEarnedCurrencyListener(new TJEarnedCurrencyListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda7
            @Override // com.tapjoy.TJEarnedCurrencyListener
            public final void onEarnedCurrency(String str, int i) {
                AppActivity.lambda$showOfferwall$1(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiamonds() {
        Tapjoy.awardCurrency(this.tapjoyDiamond, new TJAwardCurrencyListener() { // from class: org.cocos2dx.cpp.AppActivity.8
            @Override // com.tapjoy.TJAwardCurrencyListener
            public void onAwardCurrencyResponse(String str, int i) {
            }

            @Override // com.tapjoy.TJAwardCurrencyListener
            public void onAwardCurrencyResponseFailure(String str) {
            }
        });
        Tapjoy.spendCurrency(this.tapjoyDiamond, new TJSpendCurrencyListener() { // from class: org.cocos2dx.cpp.AppActivity.9
            @Override // com.tapjoy.TJSpendCurrencyListener
            public void onSpendCurrencyResponse(String str, int i) {
            }

            @Override // com.tapjoy.TJSpendCurrencyListener
            public void onSpendCurrencyResponseFailure(String str) {
            }
        });
    }

    public void onConnectSuccess() {
        Tapjoy.setActivity(this);
        Tapjoy.setEarnedCurrencyListener(new TJEarnedCurrencyListener() { // from class: org.cocos2dx.cpp.AppActivity.11
            @Override // com.tapjoy.TJEarnedCurrencyListener
            public void onEarnedCurrency(String str, int i) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPlacement(String str) {
        nativeRewardAdState(true, 0);
    }

    void ShwoToast(String str) {
        try {
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            Toast.makeText(activity, str, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Tapjoy.onActivityStart(this);
        getCurrencyBalanceTapjoy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onStop() {
        Tapjoy.onActivityStop(this);
        super.onStop();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void SkipGameClearBonus() {
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.12
            @Override // java.lang.Runnable
            public void run() {
                Bundle bundle = new Bundle();
                bundle.putString("GameResult", AppMeasurementSdk.ConditionalUserProperty.NAME);
                AppActivity.this.mFirebaseAnalytics.logEvent("RV_GameResult_Skip", bundle);
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void CrossAd_LogEvent(int i) {
        this.mtType = i;
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.13
            @Override // java.lang.Runnable
            public void run() {
                String str = "CrossAd_" + AppActivity.this.mtType;
                Bundle bundle = new Bundle();
                bundle.putString(new String[]{"Strikers1999M", "Strikers1945Saga", "BricksBreakerFootball", "TengaiM", "GhostHunter", "GunbirdSaga", "WoodStar2020", "1942.io", "Strikers1999Saga", "Toybounce", "Strikers1945M"}[AppActivity.this.mtType], AppMeasurementSdk.ConditionalUserProperty.NAME);
                AppActivity.this.mFirebaseAnalytics.logEvent(str, bundle);
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void ExitAd_LogEvent(int i) {
        this.mtType = i;
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.14
            @Override // java.lang.Runnable
            public void run() {
                if (AppActivity.this.mtType > 3) {
                    AppActivity.this.mtType = 0;
                }
                String str = "ExitAd_" + AppActivity.this.mtType;
                Bundle bundle = new Bundle();
                bundle.putString(new String[]{"Strikers1945M", "Strikers1999M", "WoodStar2020", "GhostHunter"}[AppActivity.this.mtType], AppMeasurementSdk.ConditionalUserProperty.NAME);
                AppActivity.this.mFirebaseAnalytics.logEvent(str, bundle);
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void AppsFlyerEvent(int i, String str, String str2) {
        this.EventName = str;
        this.EventVal = str2;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void MerryChristmasEvent(boolean z) {
        this.EventName = "Test";
        this.EventVal = "Test";
    }

    private SharedPreferences getPreferenceObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0);
    }

    private SharedPreferences.Editor getPreferenceEditObject() {
        return getApplicationContext().getSharedPreferences(PREF_FILE, 0).edit();
    }

    private int getPurchaseCountValueFromPref(String str) {
        return getPreferenceObject().getInt(str, 0);
    }

    private void savePurchaseCountValueToPref(String str, int i) {
        getPreferenceEditObject().putInt(str, i).commit();
    }

    void billingStart() {
        this.billingClient = BillingClient.newBuilder(activity).setListener(this.purchasesUpdatedListener).enablePendingPurchases().build();
        BillingClientStateListener billingClientStateListener = new BillingClientStateListener() { // from class: org.cocos2dx.cpp.AppActivity.16
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    AppActivity.this.isBillingConnected = true;
                } else {
                    AppActivity.this.handleConnectionFailure();
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                AppActivity.this.isBillingConnected = false;
                AppActivity.this.retryBillingConnection(this);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1818lambda$billingStart$2$orgcocos2dxcppAppActivity();
            }
        }, 5000L);
        this.billingClient.startConnection(billingClientStateListener);
    }

    /* JADX INFO: renamed from: lambda$billingStart$2$org-cocos2dx-cpp-AppActivity, reason: not valid java name */
    /* synthetic */ void m1818lambda$billingStart$2$orgcocos2dxcppAppActivity() {
        if (this.isBillingConnected) {
            return;
        }
        handleConnectionFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionFailure() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryBillingConnection(final BillingClientStateListener billingClientStateListener) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1819lambda$retryBillingConnection$3$orgcocos2dxcppAppActivity(billingClientStateListener);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: lambda$retryBillingConnection$3$org-cocos2dx-cpp-AppActivity, reason: not valid java name */
    /* synthetic */ void m1819lambda$retryBillingConnection$3$orgcocos2dxcppAppActivity(BillingClientStateListener billingClientStateListener) {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.startConnection(billingClientStateListener);
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void getPurchaseList() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = purchaseItemIDs.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType("inapp").build());
        }
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: org.cocos2dx.cpp.AppActivity.18
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
                ArrayList arrayList2 = new ArrayList();
                for (ProductDetails productDetails : list) {
                    AppActivity.this.productDetailsMap.put(productDetails.getProductId(), productDetails);
                    arrayList2.add(productDetails.getProductId());
                    arrayList2.add(productDetails.getProductType());
                    arrayList2.add(productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                    arrayList2.add(productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
                    arrayList2.add(Long.toString(productDetails.getOneTimePurchaseOfferDetails().getPriceAmountMicros()));
                    arrayList2.add(Long.toString(productDetails.getOneTimePurchaseOfferDetails().getPriceAmountMicros()));
                    arrayList2.add(productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode());
                }
                String[] strArr = new String[arrayList2.size()];
                arrayList2.toArray(strArr);
                AppActivity.nativeOnReflash(strArr);
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void setRestore() {
        BillingClient billingClientBuild = BillingClient.newBuilder(this).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                AppActivity.lambda$setRestore$4(billingResult, list);
            }
        }).build();
        this.billingClient = billingClientBuild;
        billingClientBuild.startConnection(new AnonymousClass19(billingClientBuild));
    }

    /* JADX INFO: renamed from: org.cocos2dx.cpp.AppActivity$19, reason: invalid class name */
    class AnonymousClass19 implements BillingClientStateListener {
        final /* synthetic */ BillingClient val$finalBillingClient;

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
        }

        AnonymousClass19(BillingClient billingClient) {
            this.val$finalBillingClient = billingClient;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult.getResponseCode() == 0) {
                this.val$finalBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: org.cocos2dx.cpp.AppActivity$19$$ExternalSyntheticLambda0
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                        AppActivity.AnonymousClass19.lambda$onBillingSetupFinished$0(billingResult2, list);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onBillingSetupFinished$0(BillingResult billingResult, List list) {
            if (billingResult.getResponseCode() == 0) {
                if (!list.isEmpty()) {
                    Log.d("TAG", "IN APP SUCCESS RESTORE: " + list);
                    for (int i = 0; i < list.size(); i++) {
                        AppActivity.nativeOnRestored(((Purchase) list.get(i)).getProducts().get(0), list.size() - i);
                    }
                    return;
                }
                Log.d("TAG", "In APP Not Found To Restore");
                AppActivity.nativeOnRestored("null", -1);
            }
        }
    }

    private void launchPurchaseFlow(String str) {
        ProductDetails productDetails = this.productDetailsMap.get(str);
        if (productDetails != null) {
            this.billingClient.launchBillingFlow(this, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build())).build());
        } else {
            Log.e("Billing", "Product details not found for ID: " + str);
            nativeOnFailure(str, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConsumable(String str) {
        return str.equals("aos5.g001") || str.equals("aos5.g002") || str.equals("aos5.g003") || str.equals("aos5.j001") || str.equals("aos5.j002") || str.equals("aos5.gj001") || str.equals("aos5.sg001") || str.equals("aos5.sg002") || str.equals("aos5.sg003") || str.equals("aos5.sj001") || str.equals("aos5.sj002") || str.equals("aos5.sj003") || str.equals("aos5.sgj001") || str.equals("aos5.sgj002") || str.equals("aos5.sgj003");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConsumablePurchase(final Purchase purchase) {
        this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                AppActivity.lambda$handleConsumablePurchase$5(purchase, billingResult, str);
            }
        });
    }

    static /* synthetic */ void lambda$handleConsumablePurchase$5(Purchase purchase, BillingResult billingResult, String str) {
        if (billingResult.getResponseCode() == 0) {
            nativeOnSuccess(purchase.getProducts().get(0), true);
        } else {
            nativeOnFailure(purchase.getProducts().get(0), billingResult.getDebugMessage());
        }
    }

    private void queryPurchases() {
        this.billingClient.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: org.cocos2dx.cpp.AppActivity.20
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                if (billingResult.getResponseCode() == 0) {
                    for (Purchase purchase : list) {
                        if (AppActivity.this.isConsumable(purchase.getProducts().get(0))) {
                            AppActivity.this.consumeItem(purchase);
                        }
                    }
                    return;
                }
                Log.e("Billing", "Failed to query purchases: " + billingResult.getDebugMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeItem(Purchase purchase) {
        this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: org.cocos2dx.cpp.AppActivity.21
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(BillingResult billingResult, String str) {
                if (billingResult.getResponseCode() == 0) {
                    Log.d("Billing", "Consumable item consumed successfully.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acknowledgePurchase(final Purchase purchase) {
        if (!purchase.isAcknowledged()) {
            this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda5
                @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                    this.f$0.m1817lambda$acknowledgePurchase$6$orgcocos2dxcppAppActivity(purchase, billingResult);
                }
            });
        } else {
            grantNonConsumableItem(purchase.getProducts().get(0));
        }
    }

    /* JADX INFO: renamed from: lambda$acknowledgePurchase$6$org-cocos2dx-cpp-AppActivity, reason: not valid java name */
    /* synthetic */ void m1817lambda$acknowledgePurchase$6$orgcocos2dxcppAppActivity(Purchase purchase, BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            Log.d("Billing", "Non-consumable item acknowledged.");
            grantNonConsumableItem(purchase.getProducts().get(0));
        } else {
            Log.e("Billing", "Failed to acknowledge purchase: " + billingResult.getDebugMessage());
            nativeOnFailure(purchase.getProducts().get(0), billingResult.getDebugMessage());
        }
    }

    private void grantNonConsumableItem(String str) {
        Log.d("Billing", "Grant non-consumable item: " + str);
        nativeOnSuccess(str, true);
    }

    void restorePurchases() {
        BillingClient billingClientBuild = BillingClient.newBuilder(this).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: org.cocos2dx.cpp.AppActivity$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                AppActivity.lambda$restorePurchases$7(billingResult, list);
            }
        }).build();
        this.billingClient = billingClientBuild;
        billingClientBuild.startConnection(new AnonymousClass22(billingClientBuild));
    }

    /* JADX INFO: renamed from: org.cocos2dx.cpp.AppActivity$22, reason: invalid class name */
    class AnonymousClass22 implements BillingClientStateListener {
        final /* synthetic */ BillingClient val$finalBillingClient;

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
        }

        AnonymousClass22(BillingClient billingClient) {
            this.val$finalBillingClient = billingClient;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult.getResponseCode() == 0) {
                this.val$finalBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: org.cocos2dx.cpp.AppActivity$22$$ExternalSyntheticLambda0
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                        AppActivity.AnonymousClass22.lambda$onBillingSetupFinished$0(billingResult2, list);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onBillingSetupFinished$0(BillingResult billingResult, List list) {
            if (billingResult.getResponseCode() == 0) {
                if (!list.isEmpty()) {
                    Log.d("TAG", "IN APP SUCCESS RESTORE: " + list);
                    for (int i = 0; i < list.size(); i++) {
                        AppActivity.nativeOnRestored(((Purchase) list.get(i)).getProducts().get(0), -1);
                    }
                    return;
                }
                Log.d("TAG", "In APP Not Found To Restore");
            }
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void purchase(int i) {
        if (!this.isBillingConnected) {
            nativeOnFailure(mProductID, "결제 라이브러리 연결 실패");
        }
        String str = purchaseItemIDs.get(i);
        mProductID = str;
        launchPurchaseFlow(str);
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public boolean getNetWorkConnecting() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0;
        }
        return false;
    }

    public static boolean getNetWorkStatus() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (activeNetworkInfo.getType() == 1) {
                return true;
            }
            return activeNetworkInfo.getType() == 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private boolean verifyValidSignature(String str, String str2) {
        try {
            return Security.verifyPurchase("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAov1o+s5udIPrWzb43ZqO1NFLbcjD+4A1fWEW0lWH65G1okewY/dTW95i8JpV3gcxA9nZ0Jqd7wzKrR9jCmO4h4PppM03VGif6IiR9gUoJm74rwCsDw3gQMacART3VH3TqXz5WYdcZJ/tVm6NhjVZ+Z2MO98HbAjsKdRiamanCgZyw7DFj+fpI39999kYHUMa1U1w0wg3zKpFAg6wdjbUpWM4ibn8xXzPAwwvyJS2CnDyMqeZPEWbaRpITYPJczX/XwZLbcplfZo4BC6z0jz0Wd5GrVZxznyyKVLDx7yqucRzg0aVaHWfN0uE6EJ/qr1BHiY1Q/PUvjIi4bnS6B/8YwIDAQAB", str, str2);
        } catch (IOException unused) {
            return false;
        }
    }

    public void startSignInIntent() {
        startActivityForResult(GoogleSignIn.getClient((Activity) this, GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).getSignInIntent(), 9001);
    }

    public void signInSilently() {
        this.mGoogleSignInClient.silentSignIn().addOnCompleteListener(this, new OnCompleteListener<GoogleSignInAccount>() { // from class: org.cocos2dx.cpp.AppActivity.23
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<GoogleSignInAccount> task) {
                if (task.isSuccessful()) {
                    AppActivity.this.onConnected(task.getResult());
                } else {
                    AppActivity.this.onDisconnected();
                }
            }
        });
    }

    public void signOut() {
        GoogleSignIn.getClient((Activity) this, GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).signOut().addOnCompleteListener(this, new OnCompleteListener<Void>() { // from class: org.cocos2dx.cpp.AppActivity.24
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<Void> task) {
                AppActivity.onConnectionStatusChanged(1001);
                AppActivity.this.onDisconnected();
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            GoogleSignInResult signInResultFromIntent = Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
            if (signInResultFromIntent.isSuccess()) {
                onConnected(signInResultFromIntent.getSignInAccount());
                return;
            }
            String statusMessage = signInResultFromIntent.getStatus().getStatusMessage();
            if (statusMessage != null) {
                statusMessage.isEmpty();
            }
            onConnectionStatusChanged(1001);
            onDisconnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnected(GoogleSignInAccount googleSignInAccount) {
        this.mAchievementsClient = Games.getAchievementsClient((Activity) this, googleSignInAccount);
        this.mLeaderboardsClient = Games.getLeaderboardsClient((Activity) this, googleSignInAccount);
        onConnectionStatusChanged(1000);
        if (this.mSignedInAccount != googleSignInAccount) {
            this.mSignedInAccount = googleSignInAccount;
            onAccountChanged(googleSignInAccount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisconnected() {
        this.mAchievementsClient = null;
        this.mLeaderboardsClient = null;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getCurrencyBalanceTapjoy();
    }

    public boolean isSignedIn() {
        boolean z = GoogleSignIn.getLastSignedInAccount(this) != null;
        if (z) {
            Log.d("isSignedIn", "Signed ok");
        } else {
            Log.d("isSignedIn", "Signed fail");
        }
        return z;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeShowAchievements() {
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.25
            @Override // java.lang.Runnable
            public void run() {
                try {
                    GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(AppActivity.activity);
                    if (lastSignedInAccount != null) {
                        Games.getAchievementsClient((Activity) AppActivity.activity, lastSignedInAccount).getAchievementsIntent().addOnSuccessListener(new OnSuccessListener<Intent>() { // from class: org.cocos2dx.cpp.AppActivity.25.2
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public void onSuccess(Intent intent) {
                                AppActivity.this.startActivityForResult(intent, 9003);
                            }
                        }).addOnFailureListener(new OnFailureListener() { // from class: org.cocos2dx.cpp.AppActivity.25.1
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public void onFailure(Exception exc) {
                                Log.d("GoogleLogin_ShowAc", exc.getMessage());
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeIncrementalAchievementUnlocked(String str) {
        try {
            GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this);
            if (lastSignedInAccount != null) {
                Games.getAchievementsClient((Activity) this, lastSignedInAccount).unlock(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeIncrementalAchievementStep(String str, int i) {
        try {
            GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(this);
            if (lastSignedInAccount != null) {
                Games.getAchievementsClient((Activity) this, lastSignedInAccount).increment(str, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeAchievementUnlocked(String str, boolean z) {
        this.ac_name = str;
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.26
            @Override // java.lang.Runnable
            public void run() {
                try {
                    GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(AppActivity.activity);
                    if (lastSignedInAccount != null) {
                        Games.getAchievementsClient((Activity) AppActivity.activity, lastSignedInAccount).unlock(AppActivity.this.ac_name);
                        GamesClient gamesClient = Games.getGamesClient((Activity) AppActivity.activity, GoogleSignIn.getLastSignedInAccount(AppActivity.activity));
                        gamesClient.setViewForPopups(AppActivity.this.findViewById(R.id.content));
                        gamesClient.setGravityForPopups(49);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeShowLeaderboards(String str) {
        this.leaderboardname = str;
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.27
            @Override // java.lang.Runnable
            public void run() {
                try {
                    GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(AppActivity.activity);
                    if (lastSignedInAccount != null) {
                        Games.getLeaderboardsClient((Activity) AppActivity.activity, lastSignedInAccount).getLeaderboardIntent(AppActivity.this.leaderboardname).addOnSuccessListener(new OnSuccessListener<Intent>() { // from class: org.cocos2dx.cpp.AppActivity.27.2
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public void onSuccess(Intent intent) {
                                AppActivity.this.startActivityForResult(intent, 9004);
                            }
                        }).addOnFailureListener(new OnFailureListener() { // from class: org.cocos2dx.cpp.AppActivity.27.1
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public void onFailure(Exception exc) {
                                Log.d("GoogleLogin_ShowLe", exc.getMessage());
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeSubmitScore(String str, long j) {
        this.leaderboardname = str;
        this.Score = j;
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.28
            @Override // java.lang.Runnable
            public void run() {
                try {
                    GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(AppActivity.activity);
                    if (lastSignedInAccount != null) {
                        Games.getLeaderboardsClient((Activity) AppActivity.activity, lastSignedInAccount).submitScore(AppActivity.this.leaderboardname, AppActivity.this.Score);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeGoogleLogin() {
        startSignInIntent();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void exeGoogleLogout() {
        signOut();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public boolean exeIsSigned() {
        return isSignedIn();
    }

    public static int getRewardedIdx(String str) {
        for (int i = 0; i < 7; i++) {
            if (RewardedIds[i].compareTo(str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isAdLoaded(String str) {
        int rewardedIdx = getRewardedIdx(str);
        if (rewardedIdx < 0 || rewardedIdx > 6) {
            return false;
        }
        return RewardedLoadedAds[rewardedIdx];
    }

    public static void AdLoadRewarded(String str) {
        if (!getNetWorkStatus()) {
            onFailedAdCb(str);
        }
        switch (getRewardedIdx(str)) {
            case 0:
                AdLoadRewardedDailyBonus();
                break;
            case 1:
                AdLoadRewardedGameClear();
                break;
            case 2:
                AdLoadRewardedAtMenu();
                break;
            case 3:
                AdLoadRewardedFirstAidKit();
                break;
            case 4:
                AdLoadRewardedDroneMain();
                break;
            case 5:
                AdLoadRewardedDroneOther();
                break;
            case 6:
                AdLoadRewardedWeaponFree();
                break;
        }
    }

    public static void AdTest() {
        Vungle.loadAd("AOS5_AOS_REWARD_WEAPON_OB-1673351", new LoadAdCallback() { // from class: org.cocos2dx.cpp.AppActivity.29
            @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
            public void onError(String str, VungleException vungleException) {
            }

            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str) {
                if (Vungle.canPlayAd("AOS5_AOS_REWARD_WEAPON_OB-1673351")) {
                    Vungle.playAd("AOS5_AOS_REWARD_WEAPON_OB-1673351", null, new PlayAdCallback() { // from class: org.cocos2dx.cpp.AppActivity.29.1
                        @Override // com.vungle.warren.PlayAdCallback
                        public void creativeId(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdClick(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdEnd(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdEnd(String str2, boolean z, boolean z2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdLeftApplication(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdRewarded(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdStart(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onAdViewed(String str2) {
                        }

                        @Override // com.vungle.warren.PlayAdCallback
                        public void onError(String str2, VungleException vungleException) {
                        }
                    });
                }
            }
        });
    }

    public static void AdLoadRewardedDailyBonus() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.30
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, AppActivity.strAdRewardDailyBonus, adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.30.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        System.out.println("onAdFailed");
                        RewardedAd unused = AppActivity.m_AdRewardDailyBonus = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[0]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardDailyBonus = rewardedAd;
                        AppActivity.RewardedLoadedAds[0] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[0]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedGameClear() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.31
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, AppActivity.strAdRewardGameClear, adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.31.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardGameClear = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[1]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardGameClear = rewardedAd;
                        AppActivity.RewardedLoadedAds[1] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[1]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedAtMenu() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.32
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, "ca-app-pub-8466761218588857/2506780585", adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.32.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardAtMenu = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[2]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardAtMenu = rewardedAd;
                        AppActivity.RewardedLoadedAds[2] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[2]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedFirstAidKit() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.33
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, AppActivity.strAdRewardFirstAidKit, adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.33.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardFirstAidKit = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[3]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardFirstAidKit = rewardedAd;
                        AppActivity.RewardedLoadedAds[3] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[3]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedDroneMain() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.34
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, "ca-app-pub-8466761218588857/2506780585", adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.34.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardDroneMain = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[4]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardDroneMain = rewardedAd;
                        AppActivity.RewardedLoadedAds[4] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[4]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedDroneOther() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.35
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, "ca-app-pub-8466761218588857/2506780585", adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.35.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardDroneOther = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[5]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardDroneOther = rewardedAd;
                        AppActivity.RewardedLoadedAds[5] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[5]);
                    }
                });
            }
        });
    }

    public static void AdLoadRewardedWeaponFree() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.36
            @Override // java.lang.Runnable
            public void run() {
                RewardedAd.load(AppActivity.activity, AppActivity.strAdRewardWeaponFree, adRequestBuild, new RewardedAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.36.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        RewardedAd unused = AppActivity.m_AdRewardWeaponFree = null;
                        AppActivity.onFailedAdCb(AppActivity.RewardedIds[6]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        RewardedAd unused = AppActivity.m_AdRewardWeaponFree = rewardedAd;
                        AppActivity.RewardedLoadedAds[6] = true;
                        AppActivity.onLoadAdCb(AppActivity.RewardedIds[6]);
                    }
                });
            }
        });
    }

    public static void AdShowRewarded(String str) {
        switch (getRewardedIdx(str)) {
            case 0:
                AdShowRewardedDailyBonus();
                break;
            case 1:
                AdShowRewardedGameClear();
                break;
            case 2:
                AdShowRewardedAtMenu();
                break;
            case 3:
                AdShowRewardedFirstAidKit();
                break;
            case 4:
                AdShowRewardedDroneMain();
                break;
            case 5:
                AdShowRewardedDroneOther();
                break;
            case 6:
                AdShowRewardedWeaponFree();
                break;
        }
    }

    public static void AdShowRewardedDailyBonus() {
        RewardedAd rewardedAd = m_AdRewardDailyBonus;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.37
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[0]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "DailyBonus Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardDailyBonus = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[0]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[0] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[0]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.38
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardDailyBonus.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.38.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[0]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedGameClear() {
        RewardedAd rewardedAd = m_AdRewardGameClear;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.39
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[1]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "GameClear Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardGameClear = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[1]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[1] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[1]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.40
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardGameClear.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.40.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[1]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedAtMenu() {
        RewardedAd rewardedAd = m_AdRewardAtMenu;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.41
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[2]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "AtMenu Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardAtMenu = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[2]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[2] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[2]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.42
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardAtMenu.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.42.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[2]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedFirstAidKit() {
        RewardedAd rewardedAd = m_AdRewardFirstAidKit;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.43
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[3]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "FirstAidKit Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardFirstAidKit = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[3]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[3] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[3]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.44
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardFirstAidKit.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.44.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[3]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedDroneMain() {
        RewardedAd rewardedAd = m_AdRewardDroneMain;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.45
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[4]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "DroneMain Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardDroneMain = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[4]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[4] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[4]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.46
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardDroneMain.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.46.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[4]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedDroneOther() {
        RewardedAd rewardedAd = m_AdRewardDroneOther;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.47
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[5]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "DroneOther Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardDroneOther = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[5]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[5] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[5]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.48
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardDroneOther.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.48.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[5]);
                        }
                    });
                }
            });
        }
    }

    public static void AdShowRewardedWeaponFree() {
        RewardedAd rewardedAd = m_AdRewardWeaponFree;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.49
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseAdCb(AppActivity.RewardedIds[6]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "WeaponFree Ad failed to show fullscreen content.");
                    RewardedAd unused = AppActivity.m_AdRewardWeaponFree = null;
                    AppActivity.onFailedAdCb(AppActivity.RewardedIds[6]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.RewardedLoadedAds[6] = false;
                    AppActivity.onShowAdCb(AppActivity.RewardedIds[6]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.50
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.m_AdRewardWeaponFree.show(AppActivity.activity, new OnUserEarnedRewardListener() { // from class: org.cocos2dx.cpp.AppActivity.50.1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public void onUserEarnedReward(RewardItem rewardItem) {
                            rewardItem.getAmount();
                            rewardItem.getType();
                            AppActivity.onCompleteAdCb(AppActivity.RewardedIds[6]);
                        }
                    });
                }
            });
        }
    }

    public static int getInterstitialIdx(String str) {
        for (int i = 0; i < 3; i++) {
            if (interstitialIds[i].compareTo(str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isInterstitialAdLoaded(String str) {
        int interstitialIdx = getInterstitialIdx(str);
        if (interstitialIdx < 0 || interstitialIdx > 2) {
            return false;
        }
        return interstitialLoadedAds[interstitialIdx];
    }

    public static void InterstitialAdLoad(String str) {
        if (!getNetWorkStatus()) {
            onFailediAdCb(str);
            return;
        }
        int interstitialIdx = getInterstitialIdx(str);
        if (interstitialIdx == 0) {
            InterstitialAdLoad_1();
        } else if (interstitialIdx == 1) {
            InterstitialAdLoad_2();
        } else {
            if (interstitialIdx != 2) {
                return;
            }
            InterstitialAdLoad_3();
        }
    }

    public static void InterstitialAdLoad_1() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.51
            @Override // java.lang.Runnable
            public void run() {
                Log.i(AppActivity.TAG, "InterstitialAdLoad_1");
                InterstitialAd.load(AppActivity.activity, AppActivity.strAdCodeFull_1, adRequestBuild, new InterstitialAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.51.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(InterstitialAd interstitialAd) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_1 = interstitialAd;
                        Log.i(AppActivity.TAG, "onAdLoaded");
                        AppActivity.interstitialLoadedAds[0] = true;
                        AppActivity.onLoadiAdCb(AppActivity.interstitialIds[0]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_1 = null;
                        AppActivity.onFailediAdCb(AppActivity.interstitialIds[0]);
                    }
                });
            }
        });
    }

    public static void InterstitialAdLoad_2() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.52
            @Override // java.lang.Runnable
            public void run() {
                Log.i(AppActivity.TAG, "InterstitialAdLoad_2");
                InterstitialAd.load(AppActivity.activity, AppActivity.strAdCodeFull_2, adRequestBuild, new InterstitialAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.52.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(InterstitialAd interstitialAd) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_2 = interstitialAd;
                        Log.i(AppActivity.TAG, "onAdLoaded");
                        AppActivity.interstitialLoadedAds[1] = true;
                        AppActivity.onLoadiAdCb(AppActivity.interstitialIds[1]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_2 = null;
                        AppActivity.onFailediAdCb(AppActivity.interstitialIds[0]);
                    }
                });
            }
        });
    }

    public static void InterstitialAdLoad_3() {
        final AdRequest adRequestBuild = new AdRequest.Builder().build();
        activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.53
            @Override // java.lang.Runnable
            public void run() {
                Log.i(AppActivity.TAG, "InterstitialAdLoad_3");
                InterstitialAd.load(AppActivity.activity, AppActivity.strAdCodeFull_3, adRequestBuild, new InterstitialAdLoadCallback() { // from class: org.cocos2dx.cpp.AppActivity.53.1
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(InterstitialAd interstitialAd) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_3 = interstitialAd;
                        Log.i(AppActivity.TAG, "onAdLoaded");
                        AppActivity.interstitialLoadedAds[2] = true;
                        AppActivity.onLoadiAdCb(AppActivity.interstitialIds[2]);
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        InterstitialAd unused = AppActivity.mInterstitialAd_3 = null;
                        AppActivity.onFailediAdCb(AppActivity.interstitialIds[0]);
                    }
                });
            }
        });
    }

    public static void InterstitialAdShow(String str) {
        int interstitialIdx = getInterstitialIdx(str);
        if (interstitialIdx == 0) {
            InterstitialAdShow_1();
        } else if (interstitialIdx == 1) {
            InterstitialAdShow_2();
        } else {
            if (interstitialIdx != 2) {
                return;
            }
            InterstitialAdShow_3();
        }
    }

    public static void InterstitialAdShow_1() {
        InterstitialAd interstitialAd = mInterstitialAd_1;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.54
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseiAdCb(AppActivity.interstitialIds[0]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "InterstitialAdShow_1 Ad failed to show fullscreen content.");
                    InterstitialAd unused = AppActivity.mInterstitialAd_1 = null;
                    AppActivity.onFailediAdCb(AppActivity.interstitialIds[0]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.interstitialLoadedAds[0] = false;
                    AppActivity.onShowiAdCb(AppActivity.interstitialIds[0]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.55
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.mInterstitialAd_1.show(AppActivity.activity);
                }
            });
        }
    }

    public static void InterstitialAdShow_2() {
        InterstitialAd interstitialAd = mInterstitialAd_2;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.56
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseiAdCb(AppActivity.interstitialIds[1]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "InterstitialAdShow_2 Ad failed to show fullscreen content.");
                    InterstitialAd unused = AppActivity.mInterstitialAd_2 = null;
                    AppActivity.onFailediAdCb(AppActivity.interstitialIds[1]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.interstitialLoadedAds[1] = false;
                    AppActivity.onShowiAdCb(AppActivity.interstitialIds[1]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.57
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.mInterstitialAd_2.show(AppActivity.activity);
                }
            });
        }
    }

    public static void InterstitialAdShow_3() {
        InterstitialAd interstitialAd = mInterstitialAd_3;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.cocos2dx.cpp.AppActivity.58
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AppActivity.onCloseiAdCb(AppActivity.interstitialIds[2]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e(AppActivity.TAG, "InterstitialAdShow_3 Ad failed to show fullscreen content.");
                    InterstitialAd unused = AppActivity.mInterstitialAd_3 = null;
                    AppActivity.onFailediAdCb(AppActivity.interstitialIds[2]);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    AppActivity.interstitialLoadedAds[2] = false;
                    AppActivity.onShowiAdCb(AppActivity.interstitialIds[2]);
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: org.cocos2dx.cpp.AppActivity.59
                @Override // java.lang.Runnable
                public void run() {
                    AppActivity.mInterstitialAd_3.show(AppActivity.activity);
                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        super.onPointerCaptureChanged(z);
    }
}
