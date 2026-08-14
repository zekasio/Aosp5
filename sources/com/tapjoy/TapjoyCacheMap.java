package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyCacheMap extends ConcurrentHashMap<String, TapjoyCachedAssetData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1722a;
    public int b;

    public TapjoyCacheMap(Context context, int i) {
        this.f1722a = context;
        this.b = i;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public TapjoyCachedAssetData put(String str, TapjoyCachedAssetData tapjoyCachedAssetData) {
        TapjoyLog.d("TapjoyCacheMap", "TapjoyCacheMap::put() -- key: " + str + " assetURL: " + tapjoyCachedAssetData.getAssetURL());
        if (tapjoyCachedAssetData.getTimeOfDeathInSeconds() <= System.currentTimeMillis() / 1000) {
            return null;
        }
        if (size() == this.b) {
            long j = -1;
            String key = "";
            for (Map.Entry<String, TapjoyCachedAssetData> entry : entrySet()) {
                long timestampInSeconds = entry.getValue().getTimestampInSeconds();
                if (j == 0 || timestampInSeconds < j) {
                    key = entry.getKey();
                    j = timestampInSeconds;
                }
            }
            remove((Object) key);
        }
        SharedPreferences.Editor editorEdit = this.f1722a.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0).edit();
        editorEdit.putString(tapjoyCachedAssetData.getLocalFilePath(), tapjoyCachedAssetData.toRawJSONString());
        editorEdit.apply();
        return (TapjoyCachedAssetData) super.put(str, tapjoyCachedAssetData);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public TapjoyCachedAssetData remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        SharedPreferences.Editor editorEdit = this.f1722a.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0).edit();
        editorEdit.remove(get(obj).getLocalFilePath());
        editorEdit.apply();
        String localFilePath = get(obj).getLocalFilePath();
        if (localFilePath != null && localFilePath.length() > 0) {
            TapjoyUtil.deleteFileOrDirectory(new File(localFilePath));
        }
        TapjoyLog.d("TapjoyCacheMap", "TapjoyCacheMap::remove() -- key: " + obj);
        return (TapjoyCachedAssetData) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(String str, TapjoyCachedAssetData tapjoyCachedAssetData, TapjoyCachedAssetData tapjoyCachedAssetData2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public TapjoyCachedAssetData replace(String str, TapjoyCachedAssetData tapjoyCachedAssetData) {
        throw new UnsupportedOperationException();
    }
}
