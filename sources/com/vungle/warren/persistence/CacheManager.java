package com.vungle.warren.persistence;

import android.content.Context;
import android.os.Environment;
import android.os.FileObserver;
import android.os.StatFs;
import android.util.Log;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.CollectionsConcurrencyUtil;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class CacheManager {
    private static final String PATH_ID = "cache_path";
    private static final String PATH_IDS = "cache_paths";
    private static final String TAG = "CacheManager";
    static final long UNKNOWN_SIZE = -1;
    private static final String VUNGLE_DIR = "vungle_cache";
    private boolean changed;
    private final Context context;
    private File current;
    private final FilePreferences prefs;
    private final Set<Listener> listeners = new HashSet();
    private final List<File> old = new ArrayList();
    private final List<FileObserver> observers = new ArrayList();

    public interface Listener {
        void onCacheChanged();
    }

    public CacheManager(Context context, FilePreferences filePreferences) {
        this.context = context;
        this.prefs = filePreferences;
        filePreferences.addSharedPrefsKey(PATH_ID, PATH_IDS).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void selectFileDest() {
        File file;
        boolean z;
        File parentFile;
        File file2 = null;
        if (this.current == null) {
            String string = this.prefs.getString(PATH_ID, null);
            this.current = string != null ? new File(string) : null;
        }
        File externalFilesDir = this.context.getExternalFilesDir(null);
        File filesDir = this.context.getFilesDir();
        boolean z2 = Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null;
        ArrayList arrayList = new ArrayList();
        if (z2 && (parentFile = externalFilesDir.getParentFile()) != null) {
            arrayList.add(new File(parentFile, "no_backup"));
        }
        arrayList.add(this.context.getNoBackupFilesDir());
        if (z2) {
            arrayList.add(externalFilesDir);
        }
        arrayList.add(filesDir);
        Iterator it = arrayList.iterator();
        boolean zMkdirs = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File file3 = new File((File) it.next(), VUNGLE_DIR);
            deleteIfFile(file3);
            if (file3.exists()) {
                z = file3.isDirectory() && file3.canWrite();
            } else {
                zMkdirs = file3.mkdirs();
                z = zMkdirs;
            }
            if (z) {
                file2 = file3;
                break;
            }
        }
        File cacheDir = this.context.getCacheDir();
        HashSet<String> stringSet = this.prefs.getStringSet(PATH_IDS, new HashSet<>());
        if (file2 != null) {
            CollectionsConcurrencyUtil.addToSet(stringSet, file2.getPath());
        }
        CollectionsConcurrencyUtil.addToSet(stringSet, cacheDir.getPath());
        this.prefs.put(PATH_IDS, stringSet).apply();
        this.old.clear();
        for (String str : stringSet) {
            if (file2 == null || !file2.getPath().equals(str)) {
                this.old.add(new File(str));
            }
        }
        if (zMkdirs || ((file2 != null && !file2.equals(this.current)) || ((file = this.current) != null && !file.equals(file2)))) {
            this.current = file2;
            if (file2 != null) {
                this.prefs.put(PATH_ID, file2.getPath()).apply();
            }
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onCacheChanged();
            }
            this.changed = true;
            for (File file4 : this.old) {
                if (!file4.equals(cacheDir)) {
                    try {
                        FileUtility.delete(file4);
                    } catch (IOException unused) {
                        VungleLogger.error(true, TAG, "CacheManager", "Can't remove old cache:" + file4.getPath());
                    }
                }
            }
            observeDirectory(externalFilesDir);
        } else {
            observeDirectory(externalFilesDir);
        }
    }

    private void check() {
        File file = this.current;
        if (file != null && file.exists() && this.current.isDirectory() && this.current.canWrite()) {
            return;
        }
        selectFileDest();
    }

    private synchronized void observeDirectory(File file) {
        if (file == null) {
            return;
        }
        this.observers.clear();
        this.observers.add(new FileObserver(file.getPath(), 1024) { // from class: com.vungle.warren.persistence.CacheManager.1
            @Override // android.os.FileObserver
            public void onEvent(int i, String str) {
                stopWatching();
                CacheManager.this.selectFileDest();
            }
        });
        while (file.getParent() != null) {
            final String name = file.getName();
            this.observers.add(new FileObserver(file.getParent(), 256) { // from class: com.vungle.warren.persistence.CacheManager.2
                @Override // android.os.FileObserver
                public void onEvent(int i, String str) {
                    stopWatching();
                    if (name.equals(str)) {
                        CacheManager.this.selectFileDest();
                    }
                }
            });
            file = file.getParentFile();
        }
        Iterator<FileObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            try {
                it.next().startWatching();
            } catch (Exception e) {
                VungleLogger.warn(true, TAG, "ExceptionContext", Log.getStackTraceString(e));
            }
        }
    }

    public synchronized File getCache() {
        check();
        return this.current;
    }

    public synchronized List<File> getOldCaches() {
        check();
        return this.old;
    }

    public synchronized void addListener(Listener listener) {
        check();
        this.listeners.add(listener);
        if (this.changed) {
            listener.onCacheChanged();
        }
    }

    public synchronized void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public long getBytesAvailable() {
        return getBytesAvailable(1);
    }

    private long getBytesAvailable(int i) {
        StatFs statFs;
        File cache = getCache();
        if (cache == null) {
            return -1L;
        }
        try {
            statFs = new StatFs(cache.getPath());
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Failed to get available bytes", e);
            if (i > 0) {
                return getBytesAvailable(i - 1);
            }
            statFs = null;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return -1L;
    }

    private static void deleteIfFile(File file) {
        if (file.exists() && file.isFile()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
    }
}
