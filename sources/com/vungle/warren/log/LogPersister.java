package com.vungle.warren.log;

import android.util.Log;
import com.vungle.warren.log.BaseFilePersistor;
import com.vungle.warren.log.LogManager;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class LogPersister extends BaseFilePersistor {
    private static final String SDK_CRASH_LOG_FILE_PATTERN = "crash_";
    private static final String SDK_LOGS_DIR = "sdk_logs";
    private static final String SDK_LOG_FILE_CRASH = "_crash";
    private static final String SDK_LOG_FILE_PATTERN = "log_";
    private static final String SDK_LOG_FILE_PENDING = "_pending";
    private static final String TAG = "LogPersister";
    private File currentFile;
    private LogManager.SdkLoggingEventListener listener;
    private int maximumEntries;

    LogPersister(File file) {
        super(file, SDK_LOGS_DIR, SDK_LOG_FILE_PATTERN, SDK_LOG_FILE_PENDING);
        this.maximumEntries = 100;
        if (this.fileDir != null) {
            this.currentFile = getOrCreateLastFile();
        }
    }

    void setSdkLoggingEventListener(LogManager.SdkLoggingEventListener sdkLoggingEventListener) {
        this.listener = sdkLoggingEventListener;
    }

    void setMaximumEntries(int i) {
        this.maximumEntries = i;
    }

    void saveLogData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        saveEntryToFile(this.currentFile, new LogEntry(str, str2, str3, str4, str5, str6, TimeZone.getDefault().getID(), getDateText(System.currentTimeMillis()), str7, str8, str9).toJsonString(), new BaseFilePersistor.FileSaveCallback() { // from class: com.vungle.warren.log.LogPersister.1
            @Override // com.vungle.warren.log.BaseFilePersistor.FileSaveCallback
            public void onSuccess(File file, int i) {
                if (i >= LogPersister.this.maximumEntries) {
                    LogPersister logPersister = LogPersister.this;
                    if (logPersister.renameFile(logPersister.currentFile, file.getName() + LogPersister.SDK_LOG_FILE_PENDING)) {
                        LogPersister logPersister2 = LogPersister.this;
                        logPersister2.currentFile = logPersister2.getOrCreateLastFile();
                        if (LogPersister.this.listener != null) {
                            LogPersister.this.listener.sendPendingLogs();
                        }
                    }
                }
            }

            @Override // com.vungle.warren.log.BaseFilePersistor.FileSaveCallback
            public void onFailure() {
                Log.e(LogPersister.TAG, "Failed to write sdk logs.");
            }
        });
    }

    File[] getPendingFiles() {
        return getFilesWithSuffix(SDK_LOG_FILE_PENDING);
    }

    File[] getCrashReportFiles(int i) {
        File[] filesWithSuffix = getFilesWithSuffix(SDK_LOG_FILE_CRASH);
        if (filesWithSuffix == null || filesWithSuffix.length == 0) {
            return null;
        }
        sortFilesByNewest(filesWithSuffix);
        return (File[]) Arrays.copyOfRange(filesWithSuffix, 0, Math.min(filesWithSuffix.length, i));
    }

    protected boolean saveEntryToFile(File file, String str, BaseFilePersistor.FileSaveCallback fileSaveCallback) {
        if (file == null || !file.exists()) {
            String str2 = TAG;
            Log.d(str2, "current log file maybe deleted, create new one.");
            File orCreateLastFile = getOrCreateLastFile();
            this.currentFile = orCreateLastFile;
            if (orCreateLastFile == null || !orCreateLastFile.exists()) {
                Log.w(str2, "Can't create log file, maybe no space left.");
                return false;
            }
            file = orCreateLastFile;
        }
        return appendLineToFile(file, str, fileSaveCallback);
    }

    File getOrCreateLastFile() {
        File orCreateLastFile = null;
        if (this.fileDir == null || !this.fileDir.exists()) {
            Log.w(TAG, "No log cache dir found.");
            return null;
        }
        File[] fileArrListFiles = this.fileDir.listFiles(new FilenameFilter() { // from class: com.vungle.warren.log.LogPersister.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.endsWith(LogPersister.this.fileNameSuffix);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return getNewFile(this.fileNamePrefix + System.currentTimeMillis() + UUID.randomUUID().toString());
        }
        sortFilesByNewest(fileArrListFiles);
        File file = fileArrListFiles[0];
        int lineCount = getLineCount(file);
        if (lineCount <= 0 || lineCount < this.maximumEntries) {
            return file;
        }
        try {
            if (renameFile(file, file.getName() + this.fileNameSuffix)) {
                orCreateLastFile = getOrCreateLastFile();
            }
        } catch (Exception unused) {
        }
        return orCreateLastFile == null ? file : orCreateLastFile;
    }

    public void saveCrashLogData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (this.fileDir == null) {
            Log.w(TAG, "No log cache dir found.");
            return;
        }
        LogEntry logEntry = new LogEntry(str, str2, str3, str4, str5, str6, TimeZone.getDefault().getID(), getDateText(System.currentTimeMillis()), str7, str8, str9);
        final File fileCreateFileOrDirectory = createFileOrDirectory(this.fileDir, SDK_CRASH_LOG_FILE_PATTERN + System.currentTimeMillis(), false);
        if (fileCreateFileOrDirectory != null) {
            appendLineToFile(fileCreateFileOrDirectory, logEntry.toJsonString(), new BaseFilePersistor.FileSaveCallback() { // from class: com.vungle.warren.log.LogPersister.3
                @Override // com.vungle.warren.log.BaseFilePersistor.FileSaveCallback
                public void onSuccess(File file, int i) {
                    LogPersister.this.renameFile(fileCreateFileOrDirectory, fileCreateFileOrDirectory.getName() + LogPersister.SDK_LOG_FILE_CRASH);
                }

                @Override // com.vungle.warren.log.BaseFilePersistor.FileSaveCallback
                public void onFailure() {
                    Log.e(LogPersister.TAG, "Failed to write crash log.");
                }
            });
        }
    }
}
