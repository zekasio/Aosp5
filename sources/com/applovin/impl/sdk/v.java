package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class v {
    private final p b;
    private final y c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1504a = "FileManager";
    private final Object d = new Object();
    private final Set<String> e = new HashSet();

    v(p pVar) {
        this.b = pVar;
        this.c = pVar.L();
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.c.b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (y.a()) {
            this.c.b("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileE = e(context);
        File file = new File(fileE, str);
        if (z) {
            try {
                fileE.mkdirs();
            } catch (Throwable th) {
                if (y.a()) {
                    this.c.b("FileManager", "Unable to make cache directory at " + fileE, th);
                }
                return null;
            }
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public String a(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        String string = null;
        if (file == null) {
            return null;
        }
        boolean zA = y.a();
        ?? fileInputStream = zA;
        if (zA) {
            y yVar = this.c;
            yVar.b("FileManager", "Reading resource from filesystem: " + file.getName());
            fileInputStream = yVar;
        }
        try {
            try {
                c(file);
                fileInputStream = new FileInputStream(file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[8192];
                } catch (FileNotFoundException e) {
                    e = e;
                    fileInputStream = fileInputStream;
                    if (y.a()) {
                        this.c.c("FileManager", "File not found. " + e);
                        fileInputStream = fileInputStream;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream;
                    if (y.a()) {
                        this.c.b("FileManager", "Failed to read file: " + file.getName() + e);
                        fileInputStream = fileInputStream;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream;
                    if (y.a()) {
                        this.c.b("FileManager", "Unknown failure to read file.", th);
                        fileInputStream = fileInputStream;
                    }
                }
            } finally {
                Utils.close(fileInputStream, this.b);
                d(file);
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileInputStream = 0;
        } catch (IOException e4) {
            e = e4;
            fileInputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = 0;
        }
        while (true) {
            int i = fileInputStream.read(bArr, 0, 8192);
            if (i < 0) {
                break;
            }
            try {
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Exception unused) {
                Utils.close(byteArrayOutputStream, this.b);
            }
            return string;
        }
        string = byteArrayOutputStream.toString("UTF-8");
        return string;
    }

    public boolean a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        if (y.a()) {
            this.c.b("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            c(file);
            fileOutputStream = new FileOutputStream(file);
            try {
                bArr = new byte[8192];
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                try {
                    if (y.a()) {
                        this.c.b("FileManager", "Unknown failure to write file.", th);
                    }
                    Utils.close(fileOutputStream2, this.b);
                } catch (Throwable th2) {
                    Utils.close(fileOutputStream2, this.b);
                    d(file);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i >= 0) {
                try {
                    fileOutputStream.write(bArr, 0, i);
                } catch (Exception e) {
                    if (y.a()) {
                        this.c.b("FileManager", "Failed to write next buffer to file", e);
                    }
                    Utils.close(fileOutputStream, this.b);
                    d(file);
                    return false;
                }
            } else {
                Utils.close(fileOutputStream, this.b);
                d(file);
                return true;
            }
            d(file);
            return false;
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    private boolean a(File file, String str, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) throws Throwable {
        InputStream inputStreamA;
        if (file != null && file.exists() && !file.isDirectory()) {
            if (y.a()) {
                this.c.b("FileManager", "File exists for " + str);
            }
            if (eVar == null) {
                return true;
            }
            eVar.b(file.length());
            return true;
        }
        try {
            inputStreamA = a(str, list, z, eVar);
            try {
                boolean zB = b(inputStreamA, file);
                Utils.close(inputStreamA, this.b);
                return zB;
            } catch (Throwable th) {
                th = th;
                Utils.close(inputStreamA, this.b);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamA = null;
        }
    }

    public InputStream a(String str, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        if (z && !Utils.isDomainWhitelisted(str, list)) {
            if (y.a()) {
                this.c.b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dh)).booleanValue() && !str.contains("https://")) {
            if (y.a()) {
                this.c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (y.a()) {
            this.c.b("FileManager", "Loading " + str + "...");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(((Integer) this.b.a(com.applovin.impl.sdk.c.b.df)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.b.a(com.applovin.impl.sdk.c.b.dg)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            eVar.a(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (y.a()) {
                    this.c.b("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e) {
            if (y.a()) {
                this.c.b("FileManager", "Error loading " + str, e);
            }
            eVar.a(e);
            return null;
        }
    }

    public boolean b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (y.a()) {
            this.c.b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file)) {
            if (y.a()) {
                this.c.e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!y.a()) {
            return true;
        }
        this.c.b("FileManager", "Caching completed for " + file);
        return true;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z, z2, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.c.b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        String fileName = Utils.getFileName(Uri.parse(str));
        if (z2) {
            fileName = StringUtils.encodeUriString(fileName);
        }
        int iIntValue = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.bF)).intValue();
        int length = StringUtils.emptyIfNull(fileName).length() + StringUtils.emptyIfNull(str2).length();
        if (length > iIntValue && StringUtils.isValidString(fileName)) {
            fileName = fileName.substring(length - iIntValue);
        }
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = str2 + fileName;
        }
        String str3 = fileName;
        File fileA = a(str3, context);
        if (!a(fileA, str, list, z, eVar)) {
            return null;
        }
        if (y.a()) {
            this.c.b("FileManager", "Caching succeeded for file " + str3);
        }
        return z3 ? Uri.fromFile(fileA).toString() : str3;
    }

    public void a(Context context) {
        if (b() && this.b.c()) {
            if (y.a()) {
                this.c.b("FileManager", "Compacting cache...");
            }
            a(c(context), context);
        }
    }

    private long c(Context context) {
        boolean zB;
        long jA = a();
        boolean z = jA != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> listB = this.b.b(com.applovin.impl.sdk.c.b.bE);
        long length = 0;
        for (File file : d(context)) {
            if (!z || listB.contains(file.getName()) || e(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jA) {
                zB = false;
            } else {
                if (y.a()) {
                    this.c.b("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zB = b(file);
            }
            if (zB) {
                this.b.P().a(com.applovin.impl.sdk.d.f.g);
            } else {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j, Context context) {
        if (b()) {
            long jIntValue = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.bz)).intValue();
            if (jIntValue == -1) {
                if (y.a()) {
                    this.c.b("FileManager", "Cache has no maximum size set; skipping drop...");
                }
            } else {
                if (a(j) > jIntValue) {
                    if (y.a()) {
                        this.c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    Iterator<File> it = d(context).iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                    this.b.P().a(com.applovin.impl.sdk.d.f.h);
                    return;
                }
                if (y.a()) {
                    this.c.b("FileManager", "Cache is present but under size limit; not dropping...");
                }
            }
        }
    }

    private boolean b(File file) {
        if (y.a()) {
            this.c.b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            try {
                c(file);
                return file.delete();
            } catch (Exception e) {
                if (y.a()) {
                    this.c.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                }
                d(file);
                return false;
            }
        } finally {
            d(file);
        }
    }

    private long a() {
        long jLongValue = ((Long) this.b.a(com.applovin.impl.sdk.c.b.by)).longValue();
        if (jLongValue < 0 || !b()) {
            return -1L;
        }
        return jLongValue;
    }

    private boolean b() {
        return ((Boolean) this.b.a(com.applovin.impl.sdk.c.b.bx)).booleanValue();
    }

    private long a(long j) {
        return j / 1048576;
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean zAdd = this.e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.d.wait();
                    zAdd = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (y.a()) {
                        this.c.b("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            this.e.remove(absolutePath);
            this.d.notifyAll();
        }
    }

    private boolean e(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            zContains = this.e.contains(absolutePath);
        }
        return zContains;
    }

    private List<File> d(Context context) {
        File[] fileArrListFiles;
        File fileE = e(context);
        if (fileE.isDirectory() && (fileArrListFiles = fileE.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.emptyList();
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean b(String str, Context context) {
        File fileA = a(str, false, context);
        return (fileA == null || !fileA.exists() || fileA.isDirectory()) ? false : true;
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            if (y.a()) {
                this.c.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (!file.createNewFile() && y.a()) {
                this.c.e("FileManager", "Failed to create .nomedia file");
            }
        } catch (IOException e) {
            if (y.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }
}
