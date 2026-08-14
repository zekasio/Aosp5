package com.vungle.warren.utility;

import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtility {
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.warren.utility.FileUtility.1
        @Override // com.vungle.warren.utility.FileUtility.ObjectInputStreamProvider
        public SafeObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException {
            return new SafeObjectInputStream(inputStream, FileUtility.allowedClasses);
        }
    };
    private static final String TAG = "FileUtility";
    protected static final List<Class<?>> allowedClasses = Arrays.asList(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    public static void printDirectoryTree(File file) {
    }

    private static void printDirectoryTree(File file, int i, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("/\n");
        if (file.listFiles() == null) {
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i + 1, sb);
            } else {
                printFile(file2, i + 1, sb);
            }
        }
    }

    private static void printFile(File file, int i, StringBuilder sb) {
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    private static String getIndentString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("|  ");
        }
        return sb.toString();
    }

    public static void delete(File file) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                delete(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new FileNotFoundException("Failed to delete file: " + file);
    }

    public static void deleteAndLogIfFailed(File file) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                Log.e(TAG, "Cannot delete " + file.getName());
            }
        } catch (IOException e) {
            Log.e(TAG, "Cannot delete " + file.getName(), e);
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static HashMap<String, String> readMap(String str) throws Throwable {
        Object serializable = readSerializable(new File(str));
        if (serializable instanceof HashMap) {
            return (HashMap) serializable;
        }
        return new HashMap<>();
    }

    public static void writeMap(String str, HashMap<String, String> map) throws Throwable {
        File file = new File(str);
        if (map.isEmpty()) {
            return;
        }
        writeSerializable(file, map);
    }

    static ArrayList<String> readAllLines(String str) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            Object serializable = readSerializable(file);
            if (serializable instanceof ArrayList) {
                return (ArrayList) serializable;
            }
        }
        return new ArrayList<>();
    }

    public static void writeAllLines(String str, ArrayList<String> arrayList) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        writeSerializable(file, arrayList);
    }

    public static void writeSerializable(File file, Serializable serializable) throws Throwable {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.reset();
                closeQuietly(objectOutputStream);
            } catch (IOException e2) {
                e = e2;
                objectOutputStream2 = objectOutputStream;
                Log.e(TAG, "IOIOException", e);
                closeQuietly(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                closeQuietly(objectOutputStream2);
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        closeQuietly(fileOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x005d */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.vungle.warren.utility.FileUtility$ObjectInputStreamProvider] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static <T> T readSerializable(File file) throws Throwable {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r0;
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t = (T) objectInputStreamProvideObjectInputStream.readObject();
                        closeQuietly(objectInputStreamProvideObjectInputStream);
                        closeQuietly(Exists);
                        return t;
                    } catch (IOException e) {
                        e = e;
                        Log.e(TAG, "IOIOException", e);
                        r0 = Exists;
                        closeQuietly(objectInputStreamProvideObjectInputStream);
                        closeQuietly(r0);
                        try {
                            delete(file);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        Log.e(TAG, "ClassNotFoundException", e);
                        r0 = Exists;
                        closeQuietly(objectInputStreamProvideObjectInputStream);
                        closeQuietly(r0);
                        delete(file);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        Log.e(TAG, "cannot read serializable", e);
                        r0 = Exists;
                        closeQuietly(objectInputStreamProvideObjectInputStream);
                        closeQuietly(r0);
                        delete(file);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(closeable2);
                    closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e9) {
                e = e9;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                Exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    public static long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
            return size;
        }
        return file.length();
    }

    static void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    static ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public static boolean isVideoFile(String str) {
        if (str != null) {
            return str.endsWith(".mp4");
        }
        return false;
    }
}
