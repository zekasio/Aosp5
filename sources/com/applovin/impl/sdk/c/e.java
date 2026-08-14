package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f1267a;
    private static SharedPreferences b;
    private final SharedPreferences c;

    public e(p pVar) {
        this.c = p.y().getSharedPreferences("com.applovin.sdk.preferences." + pVar.B(), 0);
        if (pVar.e()) {
            return;
        }
        f1267a = pVar;
    }

    public <T> void a(d<T> dVar, T t) {
        a(dVar, t, this.c);
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        a(str, t, (SharedPreferences) null, editor);
    }

    public <T> void a(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        a(dVar.a(), t, sharedPreferences);
    }

    public <T> void a(String str, T t, SharedPreferences sharedPreferences) {
        a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public static <T> void a(d<T> dVar, T t, Context context) {
        a(dVar.a(), t, a(context), (SharedPreferences.Editor) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z = editor != null;
        if (!z) {
            editor = sharedPreferences.edit();
        }
        if (t != 0) {
            if (t instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) t).booleanValue());
            } else if (t instanceof Float) {
                editor.putFloat(str, ((Float) t).floatValue());
            } else if (t instanceof Integer) {
                editor.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof Long) {
                editor.putLong(str, ((Long) t).longValue());
            } else if (t instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()));
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                y.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z) {
            return;
        }
        a(editor);
    }

    public <T> T b(d<T> dVar, T t) {
        return (T) b(dVar, t, this.c);
    }

    public <T> T b(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t, dVar.b(), sharedPreferences);
    }

    public static <T> T b(d<T> dVar, T t, Context context) {
        return (T) a(dVar.a(), t, dVar.b(), a(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        long jLongValue;
        int iIntValue;
        Object stringSet;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return t;
            }
            if (Boolean.class.equals(cls)) {
                if (t != 0) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (t != 0) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) t).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (t != 0) {
                    if (t.getClass().equals(Long.class)) {
                        iIntValue = ((Long) t).intValue();
                    } else {
                        iIntValue = ((Integer) t).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (t != 0) {
                    if (t.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) t).longValue();
                    } else {
                        jLongValue = ((Long) t).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (t != 0) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) t);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
            }
            return stringSet != null ? (T) cls.cast(stringSet) : t;
        } catch (Throwable th) {
            try {
                p pVar = f1267a;
                if (pVar != null) {
                    pVar.L();
                    if (y.a()) {
                        f1267a.L().b("SharedPreferencesManager", "Error getting value for key: " + str, th);
                    }
                }
                return t;
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
    }

    public <T> void a(d<T> dVar) {
        a(this.c.edit().remove(dVar.a()));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            p pVar = f1267a;
            if (pVar != null && ((Boolean) pVar.a(b.fw)).booleanValue()) {
                if (Utils.isMainThread()) {
                    if (f1267a.M() != null) {
                        f1267a.M().a(new z(f1267a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                            @Override // java.lang.Runnable
                            public void run() {
                                editor.commit();
                            }
                        }), o.a.BACKGROUND);
                    } else {
                        editor.apply();
                    }
                } else {
                    editor.commit();
                }
            } else {
                editor.apply();
            }
        } catch (Throwable th) {
            y.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static SharedPreferences a(Context context) {
        if (b == null) {
            b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return b;
    }
}
