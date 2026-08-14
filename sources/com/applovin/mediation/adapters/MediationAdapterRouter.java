package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediationAdapterRouter {
    private static final Map<String, MediationAdapterRouter> sharedInstances = CollectionUtils.map();
    private static final Object sharedInstancesLock = new Object();
    private final Map<String, List<MediationAdapterRouterListenerWrapper>> listeners;
    private final Object listenersLock;
    private final Set<MaxAdapter> loadedAdapters;
    private final Object loadedAdaptersLock;
    protected MaxAdapter.OnCompletionListener mOnCompletionListener;
    private p mSdk;
    private final String mTag;
    private final Set<MaxAdapter> showingAdapters;
    private final Object showingAdaptersLock;

    private enum RouterAdLoadType {
        INTERSTITIAL,
        APPOPEN,
        REWARDED,
        ADVIEW
    }

    abstract void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener);

    static MediationAdapterRouter getSharedInstance(Class cls) {
        MediationAdapterRouter mediationAdapterRouter;
        synchronized (sharedInstancesLock) {
            String name = cls.getName();
            mediationAdapterRouter = sharedInstances.get(name);
            if (mediationAdapterRouter == null) {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    mediationAdapterRouter = (MediationAdapterRouter) declaredConstructor.newInstance(null);
                } catch (Throwable unused) {
                }
                sharedInstances.put(name, mediationAdapterRouter);
            }
        }
        return mediationAdapterRouter;
    }

    protected MediationAdapterRouter() {
        String simpleName = getClass().getSimpleName();
        this.mTag = simpleName;
        this.listeners = CollectionUtils.map();
        this.listenersLock = new Object();
        this.loadedAdapters = new HashSet();
        this.loadedAdaptersLock = new Object();
        this.showingAdapters = new HashSet();
        this.showingAdaptersLock = new Object();
        if (AppLovinMediationProvider.MAX.equalsIgnoreCase(p.f1402a.s())) {
            this.mSdk = p.f1402a;
        } else {
            y.i(simpleName, "Invalid mediation provider detected. Please set AppLovin SDK mediation provider to MAX via AppLovinSdk.getInstance(context).setMediationProvider( AppLovinMediationProvider.MAX )");
        }
    }

    public void addInterstitialAdapter(MaxAdapter maxAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener, String str) {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, RouterAdLoadType.INTERSTITIAL, null);
    }

    public void addAppOpenAdapter(MaxAdapter maxAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str) {
        addAdapter(maxAdapter, maxAppOpenAdapterListener, str, RouterAdLoadType.APPOPEN, null);
    }

    public void addRewardedAdapter(MaxAdapter maxAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, String str) {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, RouterAdLoadType.REWARDED, null);
    }

    public void addAdViewAdapter(MaxAdapter maxAdapter, MaxAdViewAdapterListener maxAdViewAdapterListener, String str, View view) {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, RouterAdLoadType.ADVIEW, view);
    }

    public void updateAdView(View view, String str) {
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                Iterator<MediationAdapterRouterListenerWrapper> it = listenerWrappers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediationAdapterRouterListenerWrapper next = it.next();
                    if (next.getAdView() == null) {
                        next.setAdView(view);
                        break;
                    }
                }
            }
        }
    }

    public void addShowingAdapter(MaxAdapter maxAdapter) {
        synchronized (this.showingAdaptersLock) {
            this.showingAdapters.add(maxAdapter);
        }
    }

    public void removeAdapter(MaxAdapter maxAdapter, String str) {
        MediationAdapterRouterListenerWrapper next;
        removeLoadedAdapter(maxAdapter);
        removeShowingAdapter(maxAdapter);
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> list = this.listeners.get(str);
            if (list != null && list.size() > 0) {
                Iterator<MediationAdapterRouterListenerWrapper> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (next.getAdapter() == maxAdapter) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    list.remove(next);
                }
            }
        }
    }

    protected void onAdLoaded(String str) {
        onAdLoaded(str, null);
    }

    protected void onAdLoaded(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            addLoadedAdapter(mediationAdapterRouterListenerWrapper.getAdapter());
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial loaded");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open loaded");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded loaded");
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView loaded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoaded(mediationAdapterRouterListenerWrapper.getAdView(), bundle);
            }
        }
    }

    protected void onAdLoadFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to load with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to load with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to load with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to load with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
            }
        }
    }

    protected void onAdDisplayed(String str) {
        onAdDisplayed(str, null);
    }

    protected void onAdDisplayed(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial shown");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open shown");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded shown");
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView shown");
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayed(bundle);
            }
        }
    }

    protected void onAdDisplayFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to display with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to display with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to display with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to display with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
            }
        }
    }

    protected void onAdClicked(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial clicked");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open clicked");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdClicked();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded clicked");
                ((MaxRewardedAdapterListener) listener).onRewardedAdClicked();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView clicked");
                ((MaxAdViewAdapterListener) listener).onAdViewAdClicked();
            }
        }
    }

    protected void onAdHidden(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial hidden");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open hidden");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdHidden();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded hidden");
                ((MaxRewardedAdapterListener) listener).onRewardedAdHidden();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView hidden");
                ((MaxAdViewAdapterListener) listener).onAdViewAdHidden();
            }
        }
    }

    protected void onRewardedAdVideoStarted(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded video started");
                ((MaxRewardedAdapterListener) listener).onRewardedAdVideoStarted();
            }
        }
    }

    protected void onRewardedAdVideoCompleted(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded video completed");
                ((MaxRewardedAdapterListener) listener).onRewardedAdVideoCompleted();
            }
        }
    }

    protected void onUserRewarded(String str, MaxReward maxReward) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded user with reward: " + maxReward);
                ((MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
            }
        }
    }

    protected void onAdViewAdExpanded(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView expanded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
            }
        }
    }

    protected void onAdViewAdCollapsed(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView collapsed");
                ((MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
            }
        }
    }

    protected MaxReward getReward(String str) {
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                if (adapter instanceof MediationAdapterBase) {
                    return ((MediationAdapterBase) adapter).getReward();
                }
            }
            return MaxRewardImpl.createDefault();
        }
    }

    protected boolean shouldAlwaysRewardUser(String str) {
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                if (adapter instanceof MediationAdapterBase) {
                    return ((MediationAdapterBase) adapter).shouldAlwaysRewardUser();
                }
            }
            return false;
        }
    }

    protected void log(String str) {
        p pVar = this.mSdk;
        if (pVar != null) {
            pVar.L();
            if (y.a()) {
                this.mSdk.L().c(this.mTag, str);
            }
        }
    }

    protected void log(String str, Throwable th) {
        p pVar = this.mSdk;
        if (pVar != null) {
            pVar.L();
            if (y.a()) {
                this.mSdk.L().b(this.mTag, str, th);
            }
        }
    }

    private void addAdapter(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, String str, RouterAdLoadType routerAdLoadType, View view) {
        synchronized (this.listenersLock) {
            MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new MediationAdapterRouterListenerWrapper(maxAdapter, maxAdapterListener, routerAdLoadType, view);
            List<MediationAdapterRouterListenerWrapper> arrayList = this.listeners.get(str) != null ? this.listeners.get(str) : new ArrayList<>(1);
            arrayList.add(mediationAdapterRouterListenerWrapper);
            this.listeners.put(str, arrayList);
        }
    }

    private void addLoadedAdapter(MaxAdapter maxAdapter) {
        synchronized (this.loadedAdaptersLock) {
            this.loadedAdapters.add(maxAdapter);
        }
    }

    private void removeLoadedAdapter(MaxAdapter maxAdapter) {
        synchronized (this.loadedAdaptersLock) {
            this.loadedAdapters.remove(maxAdapter);
        }
    }

    private boolean isAdLoaded(MaxAdapter maxAdapter) {
        boolean zContains;
        synchronized (this.loadedAdaptersLock) {
            zContains = this.loadedAdapters.contains(maxAdapter);
        }
        return zContains;
    }

    private void removeShowingAdapter(MaxAdapter maxAdapter) {
        synchronized (this.showingAdaptersLock) {
            this.showingAdapters.remove(maxAdapter);
        }
    }

    private boolean isAdShowing(MaxAdapter maxAdapter) {
        boolean zContains;
        synchronized (this.showingAdaptersLock) {
            zContains = this.showingAdapters.contains(maxAdapter);
        }
        return zContains;
    }

    private List<MediationAdapterRouterListenerWrapper> getListenerWrappers(String str) {
        if (this.listeners.containsKey(str)) {
            return new ArrayList(this.listeners.get(str));
        }
        return null;
    }

    private List<MediationAdapterRouterListenerWrapper> getLoadingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                return null;
            }
            for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                    arrayList.add(mediationAdapterRouterListenerWrapper);
                }
            }
            return arrayList;
        }
    }

    private List<MediationAdapterRouterListenerWrapper> getShowingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                return null;
            }
            for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                    arrayList.add(mediationAdapterRouterListenerWrapper);
                }
            }
            return arrayList;
        }
    }

    private final class MediationAdapterRouterListenerWrapper {
        private View mAdView;
        private final MaxAdapter mAdapter;
        private final MaxAdapterListener mListener;
        private final RouterAdLoadType mLoadType;

        MediationAdapterRouterListenerWrapper(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType, View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        MaxAdapterListener getListener() {
            return this.mListener;
        }

        RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }

        View getAdView() {
            return this.mAdView;
        }

        void setAdView(View view) {
            this.mAdView = view;
        }
    }
}
