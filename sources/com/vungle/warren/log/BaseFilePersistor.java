package com.vungle.warren.log;

import android.util.Log;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class BaseFilePersistor {
    private static final String TAG = "BaseFilePersistor";
    protected File fileDir;
    protected String fileNamePrefix;
    protected String fileNameSuffix;
    protected String rootFileDirectory;

    interface FileSaveCallback {
        void onFailure();

        void onSuccess(File file, int i);
    }

    public BaseFilePersistor(File file, String str, String str2, String str3) {
        this.fileNamePrefix = str2;
        this.fileNameSuffix = str3;
        this.rootFileDirectory = str;
        if (file != null) {
            this.fileDir = getOrCreateDirectory(file, str);
        }
    }

    protected File getOrCreateDirectory(File file, String str) {
        File fileCreateFileOrDirectory = createFileOrDirectory(file, str, true);
        if (fileCreateFileOrDirectory == null || !fileCreateFileOrDirectory.exists()) {
            return null;
        }
        return fileCreateFileOrDirectory;
    }

    protected static String getDateText(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(j));
    }

    protected boolean renameFile(File file, String str) {
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        File file2 = new File(this.fileDir, str);
        if (file2.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    protected File createFileOrDirectory(File file, String str, boolean z) {
        boolean zCreateNewFile;
        File file2 = new File(file, str);
        if (file2.exists()) {
            zCreateNewFile = true;
        } else if (!z) {
            try {
                zCreateNewFile = file2.createNewFile();
            } catch (IOException e) {
                Log.e(TAG, "Can't create new file " + file2.getName(), e);
                zCreateNewFile = false;
            }
        } else {
            zCreateNewFile = file2.mkdir();
        }
        if (zCreateNewFile) {
            return file2;
        }
        return null;
    }

    protected File[] getFilesWithSuffix(final String str) {
        if (isRootDirInvalid()) {
            return null;
        }
        return this.fileDir.listFiles(new FilenameFilter() { // from class: com.vungle.warren.log.BaseFilePersistor.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.endsWith(str);
            }
        });
    }

    protected boolean appendLineToFile(File file, String str, FileSaveCallback fileSaveCallback) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file, true);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int lineCount = getLineCount(file);
            if (lineCount > 0) {
                fileWriter.append((CharSequence) "\n");
            }
            fileWriter.append((CharSequence) str);
            fileWriter.flush();
            FileUtility.closeQuietly(fileWriter);
            if (fileSaveCallback != null) {
                fileSaveCallback.onSuccess(file, lineCount + 1);
            }
            return true;
        } catch (IOException unused2) {
            fileWriter2 = fileWriter;
            if (fileSaveCallback != null) {
                fileSaveCallback.onFailure();
            }
            FileUtility.closeQuietly(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            FileUtility.closeQuietly(fileWriter2);
            throw th;
        }
    }

    File getNewFile(String str) {
        return createFileOrDirectory(this.fileDir, str, false);
    }

    public void sortFilesByNewest(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() { // from class: com.vungle.warren.log.BaseFilePersistor.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
    }

    protected int getLineCount(File file) throws Throwable {
        if (file == null) {
            return 0;
        }
        LineNumberReader lineNumberReader = null;
        try {
            LineNumberReader lineNumberReader2 = new LineNumberReader(new FileReader(file.getAbsolutePath()));
            do {
                try {
                } catch (Exception unused) {
                    lineNumberReader = lineNumberReader2;
                    FileUtility.closeQuietly(lineNumberReader);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    lineNumberReader = lineNumberReader2;
                    FileUtility.closeQuietly(lineNumberReader);
                    throw th;
                }
            } while (lineNumberReader2.readLine() != null);
            int lineNumber = lineNumberReader2.getLineNumber();
            FileUtility.closeQuietly(lineNumberReader2);
            return lineNumber;
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean isRootDirInvalid() {
        File file = this.fileDir;
        return file == null || !file.exists();
    }

    public void deleteFile(File file) {
        try {
            FileUtility.delete(file);
        } catch (IOException unused) {
            Log.e(TAG, "File failed to delete");
        }
    }
}
