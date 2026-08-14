package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJKeyValueStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f1683a;

    public TJKeyValueStorage(Context context) {
        f1683a = context.getSharedPreferences("tjJSSharedPreference", 0);
    }

    public int getSize() {
        return f1683a.getAll().size();
    }

    public Object getValue(String str) {
        Object obj = f1683a.getAll().get(str);
        if (obj == null) {
            return null;
        }
        if (obj.getClass() != String.class) {
            return obj.getClass() == Long.class ? Double.valueOf(Double.longBitsToDouble(((Long) obj).longValue())) : obj;
        }
        String str2 = (String) obj;
        return str2.contains("tjJSON@") ? new JSONObject(str2.replace("tjJSON@", "")) : str2.contains("tjJSONArray@") ? new JSONArray(str2.replace("tjJSONArray@", "")) : obj;
    }

    public void remove(String str) {
        f1683a.edit().remove(str).apply();
    }

    public void reset() {
        f1683a.getAll().clear();
    }

    public void setValue(String str, Object obj) {
        if (obj == JSONObject.NULL) {
            f1683a.edit().remove(str).apply();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            f1683a.edit().putString(str, ((String) obj).replace("\"", "\\\"")).apply();
            return;
        }
        if (cls == Integer.class) {
            f1683a.edit().putInt(str, ((Integer) obj).intValue()).apply();
            return;
        }
        if (cls == JSONObject.class) {
            f1683a.edit().putString(str, "tjJSON@" + obj).apply();
            return;
        }
        if (cls == JSONArray.class) {
            f1683a.edit().putString(str, "tjJSONArray@" + obj).apply();
            return;
        }
        if (cls == Double.class) {
            f1683a.edit().putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue())).apply();
        } else {
            if (cls != Boolean.class) {
                throw new IllegalArgumentException("Unknown value type.");
            }
            f1683a.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
        }
    }
}
