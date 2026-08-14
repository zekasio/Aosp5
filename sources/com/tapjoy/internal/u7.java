package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class u7 {
    public static final u7 f = new u7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1924a;
    public File d;
    public SharedPreferences b = null;
    public SharedPreferences c = null;
    public ExecutorService e = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public class a implements Comparator<Map.Entry<String, ?>> {
        public a(u7 u7Var) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, ?> entry, Map.Entry<String, ?> entry2) {
            return ((Long) entry.getValue()).compareTo((Long) entry2.getValue());
        }
    }

    public void a(Context context) {
        this.f1924a = context.getApplicationContext();
        this.b = context.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
        this.c = context.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
        this.e.submit(new s7(this));
    }

    public boolean a(long j) {
        return j >= 3600;
    }

    public synchronized String b(URL url) {
        String str;
        String string;
        String string2 = url.toString();
        try {
            String strConvertToHex = TapjoyUtil.convertToHex(MessageDigest.getInstance("SHA-1").digest(string2.getBytes()));
            String string3 = this.c.getString(strConvertToHex, null);
            if (string3 == null) {
                this.c.edit().putString(strConvertToHex, string2).commit();
                return strConvertToHex;
            }
            if (string3.equals(string2)) {
                return strConvertToHex;
            }
            int i = 0;
            do {
                i++;
                str = strConvertToHex + "_" + i;
                string = this.c.getString(str, null);
                if (string == null) {
                    break;
                }
            } while (!string.equals(string2));
            this.c.edit().putString(str, string2).commit();
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public File a(URL url) {
        if (this.f1924a == null) {
            return null;
        }
        synchronized (this) {
            String strB = b(url);
            File fileA = a(strB);
            if (!fileA.exists()) {
                return null;
            }
            long jA = p.a();
            long j = this.b.getLong(strB, 0L);
            if (j >= jA) {
                return fileA;
            }
            Long.valueOf(jA);
            Long.valueOf(j);
            if (j != 0) {
                this.b.edit().remove(strB).commit();
                this.c.edit().remove(strB).commit();
            }
            fileA.delete();
            return null;
        }
    }

    public File b() {
        File file = this.d;
        if (file == null) {
            file = new File(this.f1924a.getCacheDir(), "tapjoy_mm_cache");
            this.d = file;
        }
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File a(String str) {
        return new File(b(), str);
    }

    public final synchronized void a() {
        boolean z;
        long jA = p.a();
        File[] fileArrListFiles = b().listFiles();
        HashMap map = new HashMap();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                map.put(file.getName(), file);
            }
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        SharedPreferences.Editor editorEdit2 = this.c.edit();
        HashMap map2 = new HashMap(this.b.getAll());
        HashMap map3 = new HashMap(this.c.getAll());
        Iterator it = map2.entrySet().iterator();
        boolean z2 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!map3.containsKey(str)) {
                it.remove();
                editorEdit.remove(str);
                z2 = true;
            }
        }
        Iterator it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (!map2.containsKey(str2)) {
                it2.remove();
                editorEdit2.remove(str2);
                z2 = true;
            }
        }
        Iterator it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str3 = (String) entry.getKey();
            if (((Long) entry.getValue()).longValue() < jA) {
                it3.remove();
                editorEdit.remove(str3);
                editorEdit2.remove(str3);
                z2 = true;
            } else {
                map.remove(str3);
            }
        }
        Iterator it4 = map.entrySet().iterator();
        while (it4.hasNext()) {
            ((File) ((Map.Entry) it4.next()).getValue()).delete();
        }
        if (map2.size() > 30) {
            int size = map2.size() - 30;
            LinkedList linkedList = new LinkedList(map2.entrySet());
            Collections.sort(linkedList, new a(this));
            Iterator it5 = linkedList.iterator();
            for (int i = 0; i < size && it5.hasNext(); i++) {
                Map.Entry entry2 = (Map.Entry) it5.next();
                String str4 = (String) entry2.getKey();
                editorEdit.remove(str4);
                editorEdit2.remove(str4);
                a(str4).delete();
            }
        } else {
            z = z2;
        }
        if (z) {
            editorEdit.commit();
            editorEdit2.commit();
        }
    }
}
