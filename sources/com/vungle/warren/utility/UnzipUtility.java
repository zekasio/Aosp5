package com.vungle.warren.utility;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "com.vungle.warren.utility.UnzipUtility";

    public interface Filter {
        boolean matches(String str);
    }

    public static List<File> unzip(String str, String str2) throws IOException {
        return unzip(str, str2, null);
    }

    public static List<File> unzip(String str, String str2, Filter filter) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            throw new IOException("Path is empty");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("File does not exist");
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String str3 = str2 + File.separator + zipEntryNextElement.getName();
                    if (filter == null || filter.matches(str3)) {
                        validateFilename(str3, str2);
                        if (zipEntryNextElement.isDirectory()) {
                            File file3 = new File(str3);
                            if (!file3.exists()) {
                                file3.mkdir();
                            }
                        } else {
                            extractFile(zipFile2.getInputStream(zipEntryNextElement), str3);
                            arrayList.add(new File(str3));
                        }
                    }
                }
                try {
                    zipFile2.close();
                } catch (IOException unused) {
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void extractFile(InputStream inputStream, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        FileUtility.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream2.write(bArr, 0, i);
                        } else {
                            FileUtility.closeQuietly(inputStream);
                            FileUtility.closeQuietly(bufferedOutputStream2);
                            FileUtility.closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    FileUtility.closeQuietly(inputStream);
                    FileUtility.closeQuietly(bufferedOutputStream);
                    FileUtility.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath;
        }
        Log.e(TAG, "File is outside extraction target directory.");
        throw new ZipSecurityException("File is outside extraction target directory.");
    }

    static class ZipSecurityException extends IOException {
        ZipSecurityException(String str) {
            super(str);
        }
    }
}
