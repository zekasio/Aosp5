package com.vungle.warren.tasks;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdLoader;
import com.vungle.warren.AdRequest;
import com.vungle.warren.CacheBustManager;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CacheBustJob implements Job {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final String TAG = "com.vungle.warren.tasks.CacheBustJob";
    private final AdLoader adLoader;
    private final VungleApiClient client;
    private final Repository repository;

    public CacheBustJob(VungleApiClient vungleApiClient, Repository repository, AdLoader adLoader) {
        this.client = vungleApiClient;
        this.repository = repository;
        this.adLoader = adLoader;
    }

    @Override // com.vungle.warren.tasks.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        Repository repository;
        String str = TAG;
        Log.i(str, "CacheBustJob started");
        if (this.client == null || (repository = this.repository) == null) {
            Log.e(str, "CacheBustJob finished - no client or repository");
            return 1;
        }
        try {
            Cookie cookie = (Cookie) repository.load(Cookie.CACHE_BUST_COOKIE, Cookie.class).get();
            if (cookie == null) {
                cookie = new Cookie(Cookie.CACHE_BUST_COOKIE);
            }
            Cookie cookie2 = cookie;
            Response<JsonObject> responseExecute = this.client.cacheBust(cookie2.getLong(Cookie.LAST_CACHE_BUST).longValue()).execute();
            List<CacheBust> arrayList = new ArrayList<>();
            List<CacheBust> unProcessedBusts = this.repository.getUnProcessedBusts();
            if (unProcessedBusts != null && !unProcessedBusts.isEmpty()) {
                arrayList.addAll(unProcessedBusts);
            }
            Gson gson = new Gson();
            if (responseExecute.isSuccessful()) {
                JsonObject jsonObjectBody = responseExecute.body();
                if (jsonObjectBody != null && jsonObjectBody.has(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME)) {
                    JsonObject asJsonObject = jsonObjectBody.getAsJsonObject(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME);
                    if (asJsonObject.has("last_updated") && asJsonObject.get("last_updated").getAsLong() > 0) {
                        cookie2.putValue(Cookie.LAST_CACHE_BUST, Long.valueOf(asJsonObject.get("last_updated").getAsLong()));
                        this.repository.save(cookie2);
                    }
                    parseAndSaveCacheBust(asJsonObject, "campaign_ids", 1, "cannot save campaignBust=", arrayList, gson);
                    parseAndSaveCacheBust(asJsonObject, "creative_ids", 2, "cannot save creativeBust=", arrayList, gson);
                }
                Log.e(str, "CacheBustJob finished - no jsonObject or cache_bust in it");
                return 1;
            }
            processBust(arrayList);
            updateTimerData(bundle, cookie2);
            sendAnalytics();
            Log.d(str, "CacheBustJob finished");
            return 2;
        } catch (DatabaseHelper.DBException e) {
            Log.e(TAG, "CacheBustJob failed - DBException", e);
            return 2;
        } catch (IOException e2) {
            Log.e(TAG, "CacheBustJob failed - IOException", e2);
            return 2;
        }
    }

    private void parseAndSaveCacheBust(JsonObject jsonObject, String str, int i, String str2, List<CacheBust> list, Gson gson) {
        if (jsonObject.has(str)) {
            Iterator<JsonElement> it = jsonObject.getAsJsonArray(str).iterator();
            while (it.hasNext()) {
                CacheBust cacheBust = (CacheBust) gson.fromJson(it.next(), CacheBust.class);
                cacheBust.setTimeWindowEnd(cacheBust.getTimeWindowEnd() * 1000);
                cacheBust.setIdType(i);
                list.add(cacheBust);
                try {
                    this.repository.save(cacheBust);
                } catch (DatabaseHelper.DBException unused) {
                    VungleLogger.error("CacheBustJob#onRunJob", str2 + cacheBust);
                }
            }
        }
    }

    private void processBust(Iterable<CacheBust> iterable) {
        for (CacheBust cacheBust : iterable) {
            List<Advertisement> adsByCampaign = cacheBust.getIdType() == 1 ? this.repository.getAdsByCampaign(cacheBust.getId()) : this.repository.getAdsByCreative(cacheBust.getId());
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (Advertisement advertisement : adsByCampaign) {
                if (advertisement.getServerRequestTimestamp() < cacheBust.getTimeWindowEnd() && shouldAdBeBusted(advertisement)) {
                    linkedList.add(advertisement.getId());
                    linkedList2.add(advertisement);
                }
            }
            if (linkedList.isEmpty()) {
                Log.d(TAG, "processBust: bust has no relevant ads, deleting " + cacheBust);
                try {
                    this.repository.delete(cacheBust);
                } catch (DatabaseHelper.DBException e) {
                    VungleLogger.error("CacheBustJob#processBust", "Cannot delete obsolete bust " + cacheBust + " because of " + e);
                }
            } else {
                cacheBust.setEventIds((String[]) linkedList.toArray(EMPTY_STRING_ARRAY));
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    bustAd((Advertisement) it.next(), cacheBust);
                }
            }
        }
    }

    private boolean shouldAdBeBusted(Advertisement advertisement) {
        return (advertisement.getState() == 2 || advertisement.getState() == 3) ? false : true;
    }

    private void sendAnalytics() {
        List<CacheBust> list = (List) this.repository.loadAll(CacheBust.class).get();
        if (list == null || list.size() == 0) {
            Log.d(TAG, "sendAnalytics: no cachebusts in repository");
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (CacheBust cacheBust : list) {
            if (cacheBust.getTimestampProcessed() != 0) {
                linkedList.add(cacheBust);
            }
        }
        if (linkedList.isEmpty()) {
            Log.d(TAG, "sendAnalytics: no cachebusts to send analytics");
            return;
        }
        try {
            Response<JsonObject> responseExecute = this.client.sendAnalytics(linkedList).execute();
            if (responseExecute.isSuccessful()) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        this.repository.delete((CacheBust) it.next());
                    } catch (DatabaseHelper.DBException unused) {
                        VungleLogger.error("CacheBustManager#sendAnalytics", "can't delete bust \" + cacheBust");
                    }
                }
                return;
            }
            Log.e(TAG, "sendAnalytics: not successful, aborting, response is " + responseExecute);
        } catch (IOException e) {
            Log.e(TAG, "sendAnalytics: can't execute API call", e);
        }
    }

    private void bustAd(Advertisement advertisement, CacheBust cacheBust) {
        try {
            Log.d(TAG, "bustAd: deleting " + advertisement.getId());
            this.adLoader.dropCache(advertisement.getId());
            this.repository.deleteAdvertisement(advertisement.getId());
            Repository repository = this.repository;
            Placement placement = (Placement) repository.load(repository.getPlacementIdByAd(advertisement), Placement.class).get();
            if (placement != null) {
                new AdConfig().setAdSize(placement.getAdSize());
                if (placement.isMultipleHBPEnabled()) {
                    this.adLoader.loadEndlessIfNeeded(placement, placement.getAdSize(), 0L, false);
                } else if (placement.isAutoCached()) {
                    this.adLoader.load(new AdLoader.Operation(new AdRequest(placement.getId(), false), placement.getAdSize(), 0L, AdLoader.RETRY_DELAY, 5, 1, 0, false, placement.getAutoCachePriority(), new LoadAdCallback[0]));
                }
            }
            cacheBust.setTimestampProcessed(System.currentTimeMillis());
            this.repository.save(cacheBust);
        } catch (DatabaseHelper.DBException e) {
            Log.e(TAG, "bustAd: cannot drop cache or delete advertisement for " + advertisement, e);
        }
    }

    protected void updateTimerData(Bundle bundle, Cookie cookie) throws DatabaseHelper.DBException {
        long j = bundle.getLong(CacheBustManager.CACHE_BUST_INTERVAL);
        if (j != 0) {
            cookie.putValue(CacheBustManager.NEXT_CACHE_BUST, Long.valueOf(SystemClock.elapsedRealtime() + j));
        }
        this.repository.save(cookie);
    }

    public static JobInfo makeJobInfo() {
        return new JobInfo(TAG).setPriority(0).setUpdateCurrent(true);
    }
}
