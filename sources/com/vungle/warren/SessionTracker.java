package com.vungle.warren;

import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionConstants;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ListUtility;
import com.vungle.warren.utility.UtilityResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class SessionTracker {
    private static final int MAX_EVENTS_PER_REPORT = 40;
    private static final String TAG = "SessionTracker";
    private static SessionTracker _instance;
    private static long initTimestamp;
    private long appSessionTimeout;
    private int initCounter;
    private Repository repository;
    private SessionCallback sessionCallback;
    private ExecutorService sessionDataExecutor;
    private UtilityResource utilityResource;
    private VungleApiClient vungleApiClient;
    private boolean enabled = false;
    private final List<SessionData> pendingEvents = Collections.synchronizedList(new ArrayList());
    private final List<String> placementLoadTracker = new ArrayList();
    private final Map<String, SessionData> customVideoCacheMap = new HashMap();
    private int sendLimit = 40;
    private AtomicInteger eventCount = new AtomicInteger();
    public ActivityManager.LifeCycleCallback appLifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.SessionTracker.3
        private long lastStoppedTimestamp;

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStart() {
            if (this.lastStoppedTimestamp <= 0) {
                return;
            }
            long systemTimeMillis = SessionTracker.this.utilityResource.getSystemTimeMillis() - this.lastStoppedTimestamp;
            if (SessionTracker.this.getAppSessionTimeout() > -1 && systemTimeMillis > 0 && systemTimeMillis >= SessionTracker.this.getAppSessionTimeout() * 1000 && SessionTracker.this.sessionCallback != null) {
                SessionTracker.this.sessionCallback.onSessionTimeout();
            }
            SessionTracker.this.trackEvent(new SessionData.Builder().setEvent(SessionEvent.APP_FOREGROUND).build());
        }

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStop() {
            SessionTracker.this.trackEvent(new SessionData.Builder().setEvent(SessionEvent.APP_BACKGROUND).build());
            this.lastStoppedTimestamp = SessionTracker.this.utilityResource.getSystemTimeMillis();
        }
    };

    public interface SessionCallback {
        void onSessionTimeout();
    }

    private SessionTracker() {
    }

    protected void init(SessionCallback sessionCallback, UtilityResource utilityResource, final Repository repository, ExecutorService executorService, VungleApiClient vungleApiClient, final boolean z, int i) {
        this.sessionCallback = sessionCallback;
        this.utilityResource = utilityResource;
        this.sessionDataExecutor = executorService;
        this.repository = repository;
        this.enabled = z;
        this.vungleApiClient = vungleApiClient;
        if (i <= 0) {
            i = 40;
        }
        this.sendLimit = i;
        if (!z) {
            clearTracking();
        } else {
            executorService.submit(new Runnable() { // from class: com.vungle.warren.SessionTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!SessionTracker.this.pendingEvents.isEmpty() && z) {
                        Iterator it = SessionTracker.this.pendingEvents.iterator();
                        while (it.hasNext()) {
                            SessionTracker.this.trackEvent((SessionData) it.next());
                        }
                    }
                    SessionTracker.this.pendingEvents.clear();
                    for (List list : ListUtility.partition((List) repository.loadAll(SessionData.class).get(), SessionTracker.this.sendLimit)) {
                        if (list.size() >= SessionTracker.this.sendLimit) {
                            try {
                                SessionTracker.this.sendData(list);
                            } catch (DatabaseHelper.DBException e) {
                                Log.e(SessionTracker.TAG, "Unable to retrieve data to send " + e.getLocalizedMessage());
                            }
                        } else {
                            SessionTracker.this.eventCount.set(list.size());
                        }
                    }
                }
            });
        }
    }

    protected int getSendLimit() {
        return this.sendLimit;
    }

    public void setInitTimestamp(long j) {
        initTimestamp = j;
    }

    public static SessionTracker getInstance() {
        if (_instance == null) {
            _instance = new SessionTracker();
        }
        return _instance;
    }

    public long getInitTimestamp() {
        return initTimestamp;
    }

    public void trackAdConfig(BannerAdConfig bannerAdConfig) {
        if (bannerAdConfig == null || !bannerAdConfig.muteChangedByApi) {
            return;
        }
        trackEvent(new SessionData.Builder().setEvent(SessionEvent.MUTE).addData(SessionAttribute.MUTED, (bannerAdConfig.getSettings() & 1) == 1).build());
    }

    public void trackAdConfig(AdConfig adConfig) {
        if (adConfig != null && adConfig.muteChangedByApi) {
            trackEvent(new SessionData.Builder().setEvent(SessionEvent.MUTE).addData(SessionAttribute.MUTED, (adConfig.getSettings() & 1) == 1).build());
        }
        if (adConfig == null || !adConfig.orientationChangedByApi) {
            return;
        }
        trackEvent(new SessionData.Builder().setEvent(SessionEvent.ORIENTATION).addData(SessionAttribute.ORIENTATION, getOrientation(adConfig.getAdOrientation())).build());
    }

    public synchronized void trackEvent(SessionData sessionData) {
        if (sessionData == null) {
            return;
        }
        if (!this.enabled) {
            this.pendingEvents.add(sessionData);
        } else {
            if (!handleCustomRules(sessionData)) {
                storeEvent(sessionData);
            }
        }
    }

    private synchronized void storeEvent(final SessionData sessionData) {
        ExecutorService executorService = this.sessionDataExecutor;
        if (executorService == null) {
            return;
        }
        executorService.submit(new Runnable() { // from class: com.vungle.warren.SessionTracker.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SessionTracker.this.repository != null && sessionData != null) {
                        SessionTracker.this.repository.save(sessionData);
                        SessionTracker.this.eventCount.incrementAndGet();
                        Log.d(SessionTracker.TAG, "Session Count: " + SessionTracker.this.eventCount + " " + sessionData.sessionEvent);
                        if (SessionTracker.this.eventCount.get() >= SessionTracker.this.sendLimit) {
                            SessionTracker sessionTracker = SessionTracker.this;
                            sessionTracker.sendData((List) sessionTracker.repository.loadAll(SessionData.class).get());
                            Log.d(SessionTracker.TAG, "SendData " + SessionTracker.this.eventCount);
                        }
                    }
                } catch (DatabaseHelper.DBException unused) {
                    VungleLogger.error(SessionTracker.TAG, "Could not save event to DB");
                }
            }
        });
    }

    protected void clearTracking() {
        this.pendingEvents.clear();
    }

    protected synchronized boolean handleCustomRules(SessionData sessionData) {
        if (SessionEvent.INIT == sessionData.sessionEvent) {
            this.initCounter++;
            return false;
        }
        if (SessionEvent.INIT_END == sessionData.sessionEvent) {
            int i = this.initCounter;
            if (i <= 0) {
                return true;
            }
            this.initCounter = i - 1;
            return false;
        }
        if (SessionEvent.LOAD_AD == sessionData.sessionEvent) {
            this.placementLoadTracker.add(sessionData.getStringAttribute(SessionAttribute.PLACEMENT_ID));
            return false;
        }
        if (SessionEvent.LOAD_AD_END == sessionData.sessionEvent) {
            if (!this.placementLoadTracker.contains(sessionData.getStringAttribute(SessionAttribute.PLACEMENT_ID))) {
                return true;
            }
            this.placementLoadTracker.remove(sessionData.getStringAttribute(SessionAttribute.PLACEMENT_ID));
            return false;
        }
        if (SessionEvent.ADS_CACHED != sessionData.sessionEvent) {
            return false;
        }
        if (sessionData.getStringAttribute(SessionAttribute.VIDEO_CACHED) == null) {
            this.customVideoCacheMap.put(sessionData.getStringAttribute(SessionAttribute.URL), sessionData);
            return true;
        }
        SessionData sessionData2 = this.customVideoCacheMap.get(sessionData.getStringAttribute(SessionAttribute.URL));
        if (sessionData2 != null) {
            this.customVideoCacheMap.remove(sessionData.getStringAttribute(SessionAttribute.URL));
            sessionData.removeEvent(SessionAttribute.URL);
            sessionData.addAttribute(SessionAttribute.EVENT_ID, sessionData2.getStringAttribute(SessionAttribute.EVENT_ID));
            return false;
        }
        return !sessionData.getStringAttribute(SessionAttribute.VIDEO_CACHED).equals(SessionConstants.NONE);
    }

    public long getAppSessionTimeout() {
        return this.appSessionTimeout;
    }

    public void setAppSessionTimeout(long j) {
        this.appSessionTimeout = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void sendData(List<SessionData> list) throws DatabaseHelper.DBException {
        if (this.enabled && !list.isEmpty()) {
            JsonArray jsonArray = new JsonArray();
            Iterator<SessionData> it = list.iterator();
            while (it.hasNext()) {
                JsonElement string = JsonParser.parseString(it.next().getAsJsonString());
                if (string != null && string.isJsonObject()) {
                    jsonArray.add(string.getAsJsonObject());
                }
            }
            try {
                Response<JsonObject> responseExecute = this.vungleApiClient.sendSessionDataAnalytics(jsonArray).execute();
                for (SessionData sessionData : list) {
                    if (responseExecute.isSuccessful() || sessionData.getSendAttempts() >= this.sendLimit) {
                        this.repository.delete(sessionData);
                    } else {
                        sessionData.incrementSendAttempt();
                        this.repository.save(sessionData);
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "Sending session analytics failed " + e.getLocalizedMessage());
            }
            this.eventCount.set(0);
        }
    }

    public void observe() {
        ActivityManager.getInstance().addListener(this.appLifeCycleCallback);
    }

    public String getOrientation(int i) {
        if (i == 0) {
            return TJAdUnitConstants.String.PORTRAIT;
        }
        if (i == 1) {
            return TJAdUnitConstants.String.LANDSCAPE;
        }
        if (i == 2) {
            return "auto_rotate";
        }
        if (i == 3) {
            return "match_video";
        }
        return "none";
    }
}
