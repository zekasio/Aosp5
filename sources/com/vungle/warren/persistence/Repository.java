package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.tapjoy.TapjoyAuctionFlags;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.AdAssetDBAdapter;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.AnalyticUrl;
import com.vungle.warren.model.AnalyticUrlDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.CookieDBAdapter;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.PlacementDBAdapter;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.SessionDataDBAdapter;
import com.vungle.warren.model.VisionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.VungleThreadPoolExecutor;
import com.vungle.warren.vision.VisionAggregationData;
import com.vungle.warren.vision.VisionAggregationInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class Repository {
    private static final String TAG = "Repository";
    protected static final int VERSION = 11;
    private Map<Class, DBAdapter> adapters;
    private final Context appCtx;
    protected DatabaseHelper dbHelper;
    private final Designer designer;
    private final VungleThreadPoolExecutor ioExecutor;
    private final ExecutorService uiExecutor;

    public interface LoadCallback<T> {
        void onLoaded(T t);
    }

    public interface SaveCallback {
        void onError(Exception exc);

        void onSaved();
    }

    public Repository(Context context, Designer designer, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this(context, designer, vungleThreadPoolExecutor, executorService, 11);
    }

    public Repository(Context context, Designer designer, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService, int i) {
        this.adapters = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.appCtx = applicationContext;
        this.ioExecutor = vungleThreadPoolExecutor;
        this.uiExecutor = executorService;
        this.dbHelper = new DatabaseHelper(context, i, new VungleDatabaseCreator(applicationContext));
        this.designer = designer;
        this.adapters.put(Placement.class, new PlacementDBAdapter());
        this.adapters.put(Cookie.class, new CookieDBAdapter());
        this.adapters.put(Report.class, new ReportDBAdapter());
        this.adapters.put(Advertisement.class, new AdvertisementDBAdapter());
        this.adapters.put(AdAsset.class, new AdAssetDBAdapter());
        this.adapters.put(VisionData.class, new VisionDataDBAdapter());
        this.adapters.put(AnalyticUrl.class, new AnalyticUrlDBAdapter());
        this.adapters.put(CacheBust.class, new CacheBustDBAdapter());
        this.adapters.put(SessionData.class, new SessionDataDBAdapter());
    }

    public void init() throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.dbHelper.init();
                ContentValues contentValues = new ContentValues();
                contentValues.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_STATE, (Integer) 3);
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                query.selection = "state=?";
                query.args = new String[]{String.valueOf(2)};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> loadAllModels(Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        if (dBAdapter == null) {
            return Collections.EMPTY_LIST;
        }
        return extractModels(cls, this.dbHelper.query(new Query(dBAdapter.tableName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> extractModels(Class<T> cls, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                DBAdapter dBAdapter = this.adapters.get(cls);
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(dBAdapter.fromContentValues(contentValues));
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Exception e) {
                VungleLogger.critical(true, "Repository", "extractModels", e.toString());
                ArrayList arrayList2 = new ArrayList();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T loadModel(String str, Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        Query query = new Query(dBAdapter.tableName());
        query.selection = "item_id = ? ";
        query.args = new String[]{str};
        Cursor cursorQuery = this.dbHelper.query(query);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                    return (T) dBAdapter.fromContentValues(contentValues);
                }
            } catch (Exception e) {
                VungleLogger.critical(true, "Repository", "loadModel", e.toString());
                return null;
            } finally {
                cursorQuery.close();
            }
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void saveModel(T t) throws DatabaseHelper.DBException {
        DBAdapter dBAdapter = this.adapters.get(t.getClass());
        this.dbHelper.insertWithConflict(dBAdapter.tableName(), dBAdapter.toContentValues(t), 5);
    }

    public <T> FutureResult<T> load(final String str, final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<T>() { // from class: com.vungle.warren.persistence.Repository.2
            @Override // java.util.concurrent.Callable
            public T call() {
                return (T) Repository.this.loadModel(str, cls);
            }
        }));
    }

    public <T> void load(final String str, final Class<T> cls, final LoadCallback<T> loadCallback) {
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3
            @Override // java.lang.Runnable
            public void run() {
                final Object objLoadModel = Repository.this.loadModel(str, cls);
                Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        loadCallback.onLoaded(objLoadModel);
                    }
                });
            }
        });
    }

    public <T> void save(final T t) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.4
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.saveModel(t);
                return null;
            }
        });
    }

    public <T> void save(final T t, final SaveCallback saveCallback, boolean z) {
        Future<?> futureSubmit = this.ioExecutor.submit(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Repository.this.saveModel(t);
                    if (saveCallback != null) {
                        Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                saveCallback.onSaved();
                            }
                        });
                    }
                } catch (DatabaseHelper.DBException e) {
                    Repository.this.onSaveCallbackError(saveCallback, e);
                }
            }
        }, new Runnable() { // from class: com.vungle.warren.persistence.Repository.6
            @Override // java.lang.Runnable
            public void run() {
                Repository.this.onSaveCallbackError(saveCallback, new VungleException(39));
            }
        });
        if (z) {
            try {
                futureSubmit.get();
            } catch (InterruptedException e) {
                Log.e(TAG, "InterruptedException ", e);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Log.e(TAG, "Error on execution during saving", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSaveCallbackError(final SaveCallback saveCallback, final Exception exc) {
        if (saveCallback != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.7
                @Override // java.lang.Runnable
                public void run() {
                    saveCallback.onError(exc);
                }
            });
        }
    }

    public <T> void save(T t, SaveCallback saveCallback) {
        save(t, saveCallback, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Advertisement> findValidAdvertisementsForPlacementFromDB(String str, String str2) {
        String[] strArr;
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        StringBuilder sb = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
        if (str2 != null) {
            sb.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
        }
        query.selection = sb.toString();
        query.args = strArr;
        query.orderBy = "state DESC";
        AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) this.adapters.get(Advertisement.class);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.dbHelper.query(query);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (advertisementDBAdapter != null) {
            try {
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                arrayList.add(advertisementDBAdapter.fromContentValues(contentValues));
            } catch (Exception e) {
                VungleLogger.critical(true, "Repository", "findValidAdvertisementsForPlacementFromDB", e.toString());
                return new ArrayList();
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Advertisement findValidAdvertisementForPlacementFromDB(String str, String str2) {
        String[] strArr;
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        StringBuilder sb = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
        if (str2 != null) {
            sb.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
        }
        query.selection = sb.toString();
        query.args = strArr;
        query.limit = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
        Cursor cursorQuery = this.dbHelper.query(query);
        Advertisement advertisementFromContentValues = null;
        if (cursorQuery == null) {
            return null;
        }
        try {
            AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) this.adapters.get(Advertisement.class);
            if (advertisementDBAdapter != null && cursorQuery.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                advertisementFromContentValues = advertisementDBAdapter.fromContentValues(contentValues);
            }
            return advertisementFromContentValues;
        } catch (Exception e) {
            VungleLogger.critical(true, "Repository", "findValidAdvertisementForPlacementFromDB", e.toString());
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public FutureResult<Advertisement> findValidAdvertisementForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                return Repository.this.findValidAdvertisementForPlacementFromDB(str, str2);
            }
        }));
    }

    public FutureResult<Advertisement> findPotentiallyExpiredAd(final String str, final String str2) {
        Log.i(TAG, " Searching for valid advertisement for placement with " + str + " event ID " + str2);
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                String[] strArr;
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                StringBuilder sb = new StringBuilder("placement_id = ? AND (state = ? OR state = ?)");
                if (str2 != null) {
                    sb.append(" AND item_id = ?");
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0), str2};
                } else {
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0)};
                }
                query.selection = sb.toString();
                query.args = strArr;
                Cursor cursorQuery = Repository.this.dbHelper.query(query);
                Advertisement advertisementFromContentValues = null;
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) Repository.this.adapters.get(Advertisement.class);
                    if (advertisementDBAdapter != null && cursorQuery.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                        advertisementFromContentValues = advertisementDBAdapter.fromContentValues(contentValues);
                    }
                    return advertisementFromContentValues;
                } catch (Exception e) {
                    VungleLogger.critical(true, "Repository", "findPotentiallyExpiredAd", e.toString());
                    return null;
                } finally {
                    cursorQuery.close();
                }
            }
        }));
    }

    public FutureResult<List<Advertisement>> findValidAdvertisementsForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Advertisement>>() { // from class: com.vungle.warren.persistence.Repository.10
            @Override // java.util.concurrent.Callable
            public List<Advertisement> call() {
                return Repository.this.findValidAdvertisementsForPlacementFromDB(str, str2);
            }
        }));
    }

    public <T> FutureResult<List<T>> loadAll(final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<T>>() { // from class: com.vungle.warren.persistence.Repository.11
            @Override // java.util.concurrent.Callable
            public List<T> call() {
                return Repository.this.loadAllModels(cls);
            }
        }));
    }

    public FutureResult<List<Report>> loadAllReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.12
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                List<Report> listLoadAllModels = Repository.this.loadAllModels(Report.class);
                for (Report report : listLoadAllModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return listLoadAllModels;
            }
        }));
    }

    public FutureResult<List<Report>> loadReadyOrFailedReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.13
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "status = ?  OR status = ? ";
                query.args = new String[]{String.valueOf(1), String.valueOf(3)};
                List<Report> listExtractModels = Repository.this.extractModels(Report.class, Repository.this.dbHelper.query(query));
                for (Report report : listExtractModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return listExtractModels;
            }
        }));
    }

    public void updateAndSaveReportState(final String str, final String str2, final int i, final int i2) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.14
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(i2));
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "placementId = ?  AND status = ?  AND appId = ? ";
                query.args = new String[]{str, String.valueOf(i), str2};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    public FutureResult<List<AdAsset>> loadAllAdAssets(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<AdAsset>>() { // from class: com.vungle.warren.persistence.Repository.15
            @Override // java.util.concurrent.Callable
            public List<AdAsset> call() {
                return Repository.this.loadAllAdAssetModels(str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AdAsset> loadAllAdAssetModels(String str) {
        Query query = new Query(AdAssetDBAdapter.AdAssetColumns.TABLE_NAME);
        query.selection = "ad_identifier = ? ";
        query.args = new String[]{str};
        return extractModels(AdAsset.class, this.dbHelper.query(query));
    }

    public List<AdAsset> loadAllAdAssetByStatus(String str, int i) {
        Query query = new Query(AdAssetDBAdapter.AdAssetColumns.TABLE_NAME);
        query.selection = "ad_identifier = ?  AND file_status = ? ";
        query.args = new String[]{str, String.valueOf(i)};
        return extractModels(AdAsset.class, this.dbHelper.query(query));
    }

    public <T> void delete(final T t) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.16
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteModel(t);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(Class<T> cls, String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(cls).tableName());
        query.selection = "item_id=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    private void deleteAssetForAdId(String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(AdAsset.class).tableName());
        query.selection = "ad_identifier=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(T t) throws DatabaseHelper.DBException {
        deleteModel(t.getClass(), this.adapters.get(t.getClass()).toContentValues(t).getAsString("item_id"));
    }

    public void deleteAdvertisement(final String str) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.17
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteAdInternal(str);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAdInternal(String str) throws DatabaseHelper.DBException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteAssetForAdId(str);
        deleteModel(Advertisement.class, str);
        try {
            this.designer.deleteAssets(str);
        } catch (IOException e) {
            Log.e(TAG, "IOException ", e);
        }
    }

    public FutureResult<Collection<Placement>> loadValidPlacements() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<Placement>>() { // from class: com.vungle.warren.persistence.Repository.18
            @Override // java.util.concurrent.Callable
            public Collection<Placement> call() {
                List listExtractModels;
                synchronized (Repository.this) {
                    Query query = new Query("placement");
                    query.selection = "is_valid = ?";
                    query.args = new String[]{TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE};
                    listExtractModels = Repository.this.extractModels(Placement.class, Repository.this.dbHelper.query(query));
                }
                return listExtractModels;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> loadValidPlacementIds() {
        Query query = new Query("placement");
        query.selection = "is_valid = ?";
        query.args = new String[]{TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE};
        query.columns = new String[]{"item_id"};
        Cursor cursorQuery = this.dbHelper.query(query);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            while (cursorQuery != null) {
                try {
                    try {
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("item_id")));
                    } catch (Exception e) {
                        VungleLogger.critical(true, "Repository", "loadValidPlacementIds", e.toString());
                    }
                } finally {
                    cursorQuery.close();
                }
            }
        }
        return arrayList;
    }

    public FutureResult<File> getAdvertisementAssetDirectory(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<File>() { // from class: com.vungle.warren.persistence.Repository.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public File call() throws Exception {
                return Repository.this.designer.getAssetDirectory(str);
            }
        }));
    }

    public FutureResult<Collection<String>> getValidPlacementIds() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<String>>() { // from class: com.vungle.warren.persistence.Repository.20
            @Override // java.util.concurrent.Callable
            public Collection<String> call() throws Exception {
                List listLoadValidPlacementIds;
                synchronized (Repository.this) {
                    listLoadValidPlacementIds = Repository.this.loadValidPlacementIds();
                }
                return listLoadValidPlacementIds;
            }
        }));
    }

    public FutureResult<List<String>> getAvailableBidTokens(final String str, final int i, final int i2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.21
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                ArrayList arrayList;
                synchronized (Repository.this) {
                    Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                    String str2 = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ?";
                    if (!TextUtils.isEmpty(str)) {
                        str2 = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ? AND placement_id = ?";
                    }
                    query.selection = str2;
                    query.columns = new String[]{AdvertisementDBAdapter.AdvertisementColumns.COLUMN_BID_TOKEN};
                    int length = 0;
                    String[] strArr = {String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000)};
                    if (!TextUtils.isEmpty(str)) {
                        strArr = new String[]{String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000), str};
                    }
                    query.args = strArr;
                    Cursor cursorQuery = Repository.this.dbHelper.query(query);
                    arrayList = new ArrayList();
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext() && length < i) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_BID_TOKEN));
                                if (string.getBytes().length + length <= i) {
                                    length += string.getBytes().length + i2;
                                    arrayList.add(string);
                                }
                            } catch (Exception e) {
                                VungleLogger.critical(true, "Repository", "getAvailableBidTokens", e.toString());
                                return new ArrayList();
                            } finally {
                                cursorQuery.close();
                            }
                        }
                    }
                }
                return arrayList;
            }
        }));
    }

    public void setValidPlacements(final List<Placement> list) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.22
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                synchronized (Repository.class) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(PlacementDBAdapter.PlacementColumns.COLUMN_IS_VALID, (Boolean) false);
                    Repository.this.dbHelper.update(new Query("placement"), contentValues);
                    for (Placement placement : list) {
                        Placement placement2 = (Placement) Repository.this.loadModel(placement.getId(), Placement.class);
                        if (placement2 != null && (placement2.isIncentivized() != placement.isIncentivized() || placement2.isHeaderBidding() != placement.isHeaderBidding())) {
                            Log.w(Repository.TAG, "Placements data for " + placement.getId() + " is different from disc, deleting old");
                            Iterator it = Repository.this.getAdsForPlacement(placement.getId()).iterator();
                            while (it.hasNext()) {
                                Repository.this.deleteAdInternal((String) it.next());
                            }
                            Repository.this.deleteModel(Placement.class, placement2.getId());
                        }
                        if (placement2 != null) {
                            placement.setWakeupTime(placement2.getWakeupTime());
                            placement.setAdSize(placement2.getAdSize());
                        }
                        placement.setValid(placement.getPlacementAdType() != 2);
                        if (placement.getMaxHbCache() == Integer.MIN_VALUE) {
                            placement.setValid(false);
                        }
                        Repository.this.saveModel(placement);
                    }
                }
                return null;
            }
        });
    }

    public FutureResult<List<String>> findAdsForPlacement(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.23
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                return Repository.this.getAdsForPlacement(str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> getAdsForPlacement(String str) {
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        query.columns = new String[]{"item_id"};
        query.selection = "placement_id=?";
        query.args = new String[]{str};
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.dbHelper.query(query);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("item_id")));
            } catch (Exception e) {
                VungleLogger.critical(true, "Repository", "getAdsForPlacement", e.toString());
                return new ArrayList();
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public List<Advertisement> getAdsByCreative(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCreativeId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public List<Advertisement> getAdsByCreative(String str) {
        return getAdsByCreative(Collections.singletonList(str));
    }

    public List<Advertisement> getAdsByCampaign(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCampaignId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public List<Advertisement> getAdsByCampaign(String str) {
        return getAdsByCampaign(Collections.singletonList(str));
    }

    public String getPlacementIdByAd(Advertisement advertisement) {
        return advertisement.getPlacementId();
    }

    public List<CacheBust> getUnProcessedBusts() {
        List<CacheBust> listLoadAllModels = loadAllModels(CacheBust.class);
        ArrayList arrayList = new ArrayList();
        for (CacheBust cacheBust : listLoadAllModels) {
            if (cacheBust.getTimestampProcessed() == 0) {
                arrayList.add(cacheBust);
            }
        }
        return arrayList;
    }

    public void clearAllData() {
        this.dbHelper.dropDb();
        this.designer.clearCache();
    }

    public void close() {
        this.dbHelper.close();
    }

    public void saveAndApplyState(final Advertisement advertisement, final String str, final int i) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.24
            /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r3 = this;
                    java.lang.String r0 = com.vungle.warren.persistence.Repository.access$1400()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Setting "
                    r1.<init>(r2)
                    int r2 = r2
                    r1.append(r2)
                    java.lang.String r2 = " for adv "
                    r1.append(r2)
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    r1.append(r2)
                    java.lang.String r2 = " and pl "
                    r1.append(r2)
                    java.lang.String r2 = r4
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.i(r0, r1)
                    com.vungle.warren.model.Advertisement r0 = r3
                    int r1 = r2
                    r0.setState(r1)
                    int r0 = r2
                    r1 = 0
                    if (r0 == 0) goto L64
                    r2 = 1
                    if (r0 == r2) goto L64
                    r2 = 2
                    if (r0 == r2) goto L57
                    r2 = 3
                    if (r0 == r2) goto L4b
                    r2 = 4
                    if (r0 == r2) goto L4b
                    r2 = 5
                    if (r0 == r2) goto L64
                    goto L72
                L4b:
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    com.vungle.warren.persistence.Repository.access$1100(r0, r2)
                    goto L72
                L57:
                    com.vungle.warren.model.Advertisement r0 = r3
                    r0.setPlacementId(r1)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                    goto L72
                L64:
                    com.vungle.warren.model.Advertisement r0 = r3
                    java.lang.String r2 = r4
                    r0.setPlacementId(r2)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                L72:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.Repository.AnonymousClass24.call():java.lang.Void");
            }
        });
    }

    public void trimVisionData(final int i) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.25
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "_id <= ( SELECT MAX( _id ) FROM vision_data ) - ?";
                query.args = new String[]{Integer.toString(i)};
                Repository.this.dbHelper.delete(query);
                return null;
            }
        });
    }

    public FutureResult<VisionAggregationInfo> getVisionAggregationInfo(final long j) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<VisionAggregationInfo>() { // from class: com.vungle.warren.persistence.Repository.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public VisionAggregationInfo call() {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "timestamp >= ?";
                query.orderBy = "_id DESC";
                query.args = new String[]{Long.toString(j)};
                Cursor cursorQuery = Repository.this.dbHelper.query(query);
                VisionDataDBAdapter visionDataDBAdapter = (VisionDataDBAdapter) Repository.this.adapters.get(VisionData.class);
                if (cursorQuery != null) {
                    if (visionDataDBAdapter != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ContentValues contentValues = new ContentValues();
                                DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                                return new VisionAggregationInfo(cursorQuery.getCount(), visionDataDBAdapter.fromContentValues(contentValues).creative);
                            }
                        } catch (Exception e) {
                            VungleLogger.critical(true, "Repository", "getVisionAggregationInfo", e.toString());
                            return null;
                        } finally {
                            cursorQuery.close();
                        }
                    }
                }
                return null;
            }
        }));
    }

    public FutureResult<List<VisionAggregationData>> getVisionAggregationData(final long j, final int i, final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<VisionAggregationData>>() { // from class: com.vungle.warren.persistence.Repository.27
            @Override // java.util.concurrent.Callable
            public List<VisionAggregationData> call() {
                ArrayList arrayList = new ArrayList();
                if (!VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER.equals(str) && !"campaign".equals(str) && !VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(str)) {
                    return arrayList;
                }
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.columns = new String[]{"COUNT ( * ) as viewCount", "MAX ( timestamp ) as lastTimeStamp", str};
                query.selection = "timestamp >= ?";
                query.groupBy = str;
                query.orderBy = "_id DESC";
                query.limit = Integer.toString(i);
                query.args = new String[]{Long.toString(j)};
                Cursor cursorQuery = Repository.this.dbHelper.query(query);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                            arrayList.add(new VisionAggregationData(contentValues.getAsString(str), contentValues.getAsInteger("viewCount").intValue(), contentValues.getAsLong("lastTimeStamp").longValue()));
                        } catch (Exception e) {
                            VungleLogger.critical(true, "Repository", "getVisionAggregationInfo", e.toString());
                            return new ArrayList();
                        } finally {
                            cursorQuery.close();
                        }
                    }
                }
                return arrayList;
            }
        }));
    }

    private static class VungleDatabaseCreator implements DatabaseHelper.DatabaseFactory {
        private final Context context;

        public VungleDatabaseCreator(Context context) {
            this.context = context;
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN status INTEGER DEFAULT 1");
            }
            if (i < 3) {
                sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN tt_download NUMERIC DEFAULT -1");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN refresh_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN supported_template_types NUMERIC DEFAULT 0");
            }
            if (i < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN header_bidding SHORT ");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN header_bidding SHORT ");
            }
            if (i < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN autocache_priority NUMERIC DEFAULT 2147483647");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN ad_request_start_time NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN init_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
            }
            if (i < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_enable_om_sdk NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_om_sdk_extra_vast TEXT ");
            }
            if (i < 7) {
                sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            }
            if (i < 8) {
                sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_request_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN max_hb_cache NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN recommended_ad_size TEXT ");
            }
            if (i < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN play_remote_url SHORT DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_assets_fully_downloaded SHORT DEFAULT 0");
            }
            if (i < 10) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_click_coordinates_enabled SHORT DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_deep_link TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_notifications TEXT ");
            }
            if (i < 11) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_header_bidding SHORT DEFAULT 0");
            }
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void create(SQLiteDatabase sQLiteDatabase) {
            dropOldFilesData();
            sQLiteDatabase.execSQL(AdvertisementDBAdapter.CREATE_ADVERTISEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(PlacementDBAdapter.CREATE_PLACEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(CookieDBAdapter.CREATE_COOKIE_TABLE_QUERY);
            sQLiteDatabase.execSQL(ReportDBAdapter.CREATE_REPORT_TABLE_QUERY);
            sQLiteDatabase.execSQL(AdAssetDBAdapter.CREATE_ASSET_TABLE_QUERY);
            sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
            sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
            sQLiteDatabase.execSQL(SessionDataDBAdapter.CREATE_SESSION_DATA_TABLE_QUERY);
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void deleteData(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS advertisement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS placement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS report");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS adAsset");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vision_data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_url");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_bust");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session_data");
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", null);
            while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(1);
                if (!string.equals("android_metadata") && !string.startsWith("sqlite_")) {
                    arrayList.add(string);
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
            }
            create(sQLiteDatabase);
        }

        private void deleteDatabase(String str) {
            this.context.deleteDatabase(str);
        }

        private void dropOldFilesData() {
            deleteDatabase("vungle");
            File externalFilesDir = this.context.getExternalFilesDir(null);
            if (Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null && externalFilesDir.exists()) {
                try {
                    FileUtility.delete(new File(externalFilesDir, ".vungle"));
                } catch (IOException e) {
                    Log.e(Repository.TAG, "IOException ", e);
                }
            }
            File filesDir = this.context.getFilesDir();
            if (filesDir.exists()) {
                try {
                    FileUtility.delete(new File(filesDir, "vungle"));
                } catch (IOException e2) {
                    Log.e(Repository.TAG, "IOException ", e2);
                }
            }
            try {
                FileUtility.delete(new File(this.context.getCacheDir() + File.separator + "downloads_vungle"));
            } catch (IOException e3) {
                Log.e(Repository.TAG, "IOException ", e3);
            }
        }
    }

    private void runAndWait(Callable<Void> callable) throws DatabaseHelper.DBException {
        try {
            this.ioExecutor.submit(callable).get();
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof DatabaseHelper.DBException) {
                throw ((DatabaseHelper.DBException) e2.getCause());
            }
            Log.e(TAG, "Exception during runAndWait", e2);
        }
    }

    public <T> void deleteAll(Class<T> cls) {
        if (cls == Advertisement.class) {
            Iterator<T> it = loadAll(Advertisement.class).get().iterator();
            while (it.hasNext()) {
                try {
                    deleteAdvertisement(((Advertisement) it.next()).getId());
                } catch (DatabaseHelper.DBException e) {
                    Log.e(TAG, "DB Exception deleting advertisement", e);
                }
            }
            return;
        }
        Iterator<T> it2 = loadAll(cls).get().iterator();
        while (it2.hasNext()) {
            try {
                deleteModel(it2.next());
            } catch (DatabaseHelper.DBException e2) {
                Log.e(TAG, "DB Exception deleting db entry", e2);
            }
        }
    }

    public void setMockDBHelper(DatabaseHelper databaseHelper) {
        this.dbHelper = databaseHelper;
    }
}
