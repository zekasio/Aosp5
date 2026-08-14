package com.applovin.impl.sdk.utils;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.drive.DriveFile;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Utils {
    public static final int BYTES_PER_KB = 1000;
    public static final String KEY_AD_VALUES = "ad_values";
    public static final String MACRO_CLCODE = "{CLCODE}";
    public static final String MACRO_CLICK_X = "{CLICK_X}";
    public static final String MACRO_CLICK_Y = "{CLICK_Y}";
    private static final String MACRO_EVENT_ID = "{EVENT_ID}";
    public static final String MACRO_IS_INSTALL = "{IS_INSTALL}";
    public static final String MACRO_IS_VIDEO_CLICK = "{IS_VIDEO_CLICK}";
    public static final String MACRO_SCREEN_HEIGHT = "{SCREEN_HEIGHT}";
    public static final String MACRO_SCREEN_WIDTH = "{SCREEN_WIDTH}";
    public static final String PLAY_STORE_PACKAGE_NAME = "com.android.vending";
    public static final String PLAY_STORE_SCHEME = "market";
    private static final String TAG = "Utils";
    public static Boolean isDspDemoApp;
    private static final String[] LONG_TIME_FORMATS = {" second ago", " minute ago", " hour ago", " day ago", " week ago", " month ago"};
    private static final String[] LONG_TIME_FORMATS_PLURAL = {" seconds ago", " minutes ago", " hours ago", " days ago", " weeks ago", " months ago"};
    private static final String[] SHORT_TIME_FORMATS = {"s", "m", "h", "d", "w", "mth"};
    private static final int[] TIME_MULTIPLIERS = {60, 60, 24, 7, 4, 12};
    private static final DecimalFormat decimalFormat = new DecimalFormat();

    public static void assertMainThread() {
    }

    public static boolean bitMaskContainsFlag(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int getExoPlayerVersionCode() {
        return 2015001;
    }

    public static int kilobytesToByes(int i) {
        return i * 1000;
    }

    public static float secondsToMillis(float f) {
        return f * 1000.0f;
    }

    public static boolean isVerboseLoggingConfigured() {
        Context contextY = com.applovin.impl.sdk.p.y();
        if (contextY != null) {
            return e.a(contextY).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean isVerboseLoggingEnabled(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.p.y();
        }
        if (context != null) {
            return e.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static String shortenKey(String str) {
        if (str != null && str.length() > 4) {
            return str.substring(str.length() - 4);
        }
        return "NOKEY";
    }

    public static String encodeUrlMap(Map<String, String> map, boolean z) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.Utils.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(String str, String str2) {
                    return str.compareToIgnoreCase(str2);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String value = entry.getValue();
            if (value instanceof String) {
                String str = value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb.append((Object) entry.getKey());
            sb.append('=');
            sb.append((Object) value);
        }
        return sb.toString();
    }

    public static Map<String, String> stringifyObjectMap(Map<String, Object> map) {
        Map<String, String> map2 = CollectionUtils.map();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    public static boolean isDomainWhitelisted(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static int getVideoCompletionPercent(JSONObject jSONObject) {
        int i = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i < 0 || i > 100) {
            return 95;
        }
        return i;
    }

    public static long getServerAdjustedUnixTimestampMillis(com.applovin.impl.sdk.p pVar) {
        long jLongValue = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fd)).longValue();
        long jLongValue2 = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fe)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : jCurrentTimeMillis + (jLongValue - jLongValue2);
    }

    public static void renameKeyInObjectMap(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static double millisToSeconds(long j) {
        double d = j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    private static long floatToLong(float f) {
        return Math.round(f);
    }

    public static long secondsToMillisLong(float f) {
        return floatToLong(secondsToMillis(f));
    }

    public static String getPrettyDate(long j, boolean z) {
        String[] strArr = z ? LONG_TIME_FORMATS : SHORT_TIME_FORMATS;
        String[] strArr2 = z ? LONG_TIME_FORMATS_PLURAL : SHORT_TIME_FORMATS;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        for (int i = 0; i < strArr.length; i++) {
            int i2 = TIME_MULTIPLIERS[i];
            if (jCurrentTimeMillis < i2) {
                return jCurrentTimeMillis <= 0 ? z ? "just now" : "now" : jCurrentTimeMillis == 1 ? String.format("%d%s", Long.valueOf(jCurrentTimeMillis), strArr[i]) : String.format("%d%s", Long.valueOf(jCurrentTimeMillis), strArr2[i]);
            }
            jCurrentTimeMillis /= (long) i2;
        }
        return z ? "just now" : "now";
    }

    public static double tryParseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            y.c(TAG, "Failed to parse double from String: " + str, th);
            return d;
        }
    }

    public static String getFileName(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        return TextUtils.join("_", arrayList);
    }

    public static void maybeLogCustomDataSizeLimit(String str, String str2) {
        if (str == null || str.length() <= kilobytesToByes(8)) {
            return;
        }
        y.h(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + kilobytesToByes(8) + " maximum)");
    }

    public static Activity retrieveParentActivity(View view, com.applovin.impl.sdk.p pVar) {
        if (view == null) {
            return null;
        }
        int i = 0;
        while (i < 1000) {
            i++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static void maybeHandleNoFillResponseForPublisher(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            sb.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb.append("\"\n..SDK KEY: \"");
            sb.append(pVar.B());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(com.applovin.impl.sdk.p.y().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String string = sb.toString();
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinSdk", string);
            }
        }
    }

    public static AppLovinAd maybeRetrieveNonDummyAd(AppLovinAd appLovinAd, com.applovin.impl.sdk.p pVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.f fVar = (com.applovin.impl.sdk.ad.f) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = pVar.E().dequeueAd(fVar.getAdZone());
        pVar.L();
        if (y.a()) {
            pVar.L().b(TAG, "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd != null) {
            fVar.a(appLovinAdDequeueAd);
            ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(fVar);
            return appLovinAdDequeueAd;
        }
        return fVar.a();
    }

    public static com.applovin.impl.sdk.ad.d getZone(JSONObject jSONObject, com.applovin.impl.sdk.p pVar) {
        return com.applovin.impl.sdk.ad.d.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null));
    }

    public static boolean openUri(Context context, Uri uri, com.applovin.impl.sdk.p pVar) {
        boolean z = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(DriveFile.MODE_READ_ONLY);
            }
            if (PLAY_STORE_SCHEME.equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            pVar.Y().pauseForClick();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b(TAG, "Unable to open \"" + uri + "\".", th);
            }
        }
        if (!z) {
            pVar.Y().resumeForClick();
        }
        return z;
    }

    public static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    public static String getString(Class cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, (Map<String, String>) null, str3, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, Map<String, String> map, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, Collections.emptyMap(), str3, map, false, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, str2, map, str3, null, false, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z, com.applovin.impl.sdk.p pVar) {
        if (map == null) {
            map = CollectionUtils.map(1);
        }
        Map<String, String> map3 = map;
        map3.put(MACRO_CLCODE, str2);
        return getPostbacks(str, jSONObject, map3, str3, map2, z, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, map, str2, (Map<String, String>) null, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, com.applovin.impl.sdk.p pVar) {
        return getPostbacks(str, jSONObject, map, str2, map2, false, pVar);
    }

    public static List<com.applovin.impl.sdk.d.a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z, com.applovin.impl.sdk.p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new com.applovin.impl.sdk.d.a(str2, null, map2, z));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject2.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(strOptString)) {
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new com.applovin.impl.sdk.d.a(strReplace, strOptString, map2, z));
                    }
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(TAG, "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isViewInTopActivity(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return isViewInChildView(view, window.getDecorView());
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return isViewInChildView(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    public static boolean isViewInChildView(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (isViewInChildView(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static View getRootView(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static String urlStringWithoutQueryParameters(String str) {
        Uri uri = Uri.parse(str);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void validateAdSdkKey(AppLovinAd appLovinAd, com.applovin.impl.sdk.p pVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String strB = pVar.B();
            String strB2 = ((AppLovinAdBase) appLovinAd).getSdk().B();
            if (strB.equals(strB2)) {
                return;
            }
            y.i("AppLovinAd", "Ad was loaded from sdk with key: " + strB2 + ", but is being rendered from sdk with key: " + strB);
            pVar.P().a(com.applovin.impl.sdk.d.f.n);
        }
    }

    public static Map<String, String> toUrlSafeMap(Map<String, String> map, com.applovin.impl.sdk.p pVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static boolean objectIsOfType(Object obj, List<String> list, com.applovin.impl.sdk.p pVar) {
        if (list == null) {
            return false;
        }
        Iterator<Class> it = generateClassesList(list, pVar).iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            pVar.L();
                            if (y.a()) {
                                pVar.L().b(TAG, "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        }
                        if (!objectIsOfType(entry.getValue(), list, pVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof List)) {
                    return true;
                }
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (!objectIsOfType(it2.next(), list, pVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b(TAG, "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    private static List<Class> generateClassesList(List<String> list, com.applovin.impl.sdk.p pVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static Object sanitizeSuperProperty(Object obj, com.applovin.impl.sdk.p pVar) {
        int iIntValue;
        String strValueOf;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Map map2 = CollectionUtils.map(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    strValueOf = (String) key;
                } else {
                    strValueOf = String.valueOf(key);
                }
                map2.put(strValueOf, sanitizeSuperProperty(entry.getValue(), pVar));
            }
            return map2;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(sanitizeSuperProperty(it.next(), pVar));
            }
            return arrayList;
        }
        if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        }
        String strValueOf2 = String.valueOf(obj);
        if (!(obj instanceof String)) {
            return (!(obj instanceof Uri) || (iIntValue = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.bu)).intValue()) <= 0 || strValueOf2.length() <= iIntValue) ? strValueOf2 : strValueOf2.substring(0, iIntValue);
        }
        int iIntValue2 = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.bt)).intValue();
        return (iIntValue2 <= 0 || strValueOf2.length() <= iIntValue2) ? strValueOf2 : strValueOf2.substring(0, iIntValue2);
    }

    public static String retrieveLauncherActivityFullyQualifiedName(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0).activityInfo.name;
    }

    public static int getRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean checkClassExistence(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkClassesExistence(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (checkClassExistence(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static long parseColor(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static void close(Closeable closeable, com.applovin.impl.sdk.p pVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static void disconnect(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.p pVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            y.c(TAG, "Exception thrown while getting memory state.", th);
        }
        return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
    }

    public static int toVersionCode(String str) {
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                y.i(TAG, "Version number components cannot be longer than two digits -> " + str);
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    public static boolean isVPNConnected() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            y.c(TAG, "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static boolean isPubInDebugMode(Context context, com.applovin.impl.sdk.p pVar) {
        String str = pVar.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.RUN_IN_RELEASE_MODE);
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static void showToast(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                Toast toastMakeText = Toast.makeText(context, str, 0);
                toastMakeText.setMargin(0.0f, 0.1f);
                toastMakeText.show();
            }
        });
    }

    public static void showToast(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static boolean isBML(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER || appLovinAdSize == AppLovinAdSize.CROSS_PROMO;
    }

    public static String getAndroidSdkCodename() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            y.c(TAG, "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static String getAndroidOSInfo() {
        try {
            return Build.VERSION.RELEASE + " (" + getAndroidSdkCodename() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            y.c(TAG, "Unable to get Android OS info", th);
            return "";
        }
    }

    public static String getAdServeId(Object obj) {
        if (obj instanceof com.applovin.impl.mediation.a.a) {
            return ((com.applovin.impl.mediation.a.a) obj).h();
        }
        if (com.applovin.impl.mediation.d.c.a(obj)) {
            return ((com.applovin.impl.sdk.ad.e) obj).N();
        }
        return null;
    }

    public static void setImageUrl(final String str, final ImageView imageView, final com.applovin.impl.sdk.p pVar) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b(TAG, "Fetching image: " + str + "...");
        }
        pVar.M().c().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InputStream inputStreamOpenStream = new URL(str).openStream();
                    final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream);
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            pVar.L();
                            if (y.a()) {
                                pVar.L().b(Utils.TAG, "Image fetched");
                            }
                            imageView.setImageDrawable(new BitmapDrawable(com.applovin.impl.sdk.p.y().getResources(), bitmapDecodeStream));
                        }
                    });
                    Utils.close(inputStreamOpenStream, pVar);
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(Utils.TAG, "Failed to fetch image: " + str, th);
                    }
                }
            }
        });
    }

    public static List<Uri> checkCachedResourcesExist(boolean z, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar, Context context) {
        if (eVar instanceof com.applovin.impl.c.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(eVar.B())) {
            if (!pVar.W().b(uri.getLastPathSegment(), context)) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z) {
            Uri uriH = eVar.h();
            if (!pVar.W().b(uriH.getLastPathSegment(), context)) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e(TAG, "Cached video missing: " + uriH);
                }
                arrayList.add(uriH);
            }
        }
        return arrayList;
    }

    public static void showAlert(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        showAlert("", sb.toString(), context);
    }

    public static void showAlert(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static boolean getBooleanForProbability(int i) {
        return i > 0 && i <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= i;
    }

    public static boolean isAppLovinTestEnvironment(Context context) {
        return e.a(context).a("applovin.sdk.is_test_environment");
    }

    public static Map<String, String> getMetaData(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field field = getField(appLovinSdkSettings.getClass(), "metaData");
            if (field != null) {
                field.setAccessible(true);
            }
            return (Map) field.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isProguardRulesOmitted() {
        try {
            Class.forName("com.applovin.sdk.AppLovinSdk");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static int getAlwaysFinishActivitiesSetting(Context context) {
        h.b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static boolean hasAndroidCoreJsonLibrary(com.applovin.impl.sdk.p pVar) {
        if (!h.c()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return false;
            }
            pVar.L().a(TAG, "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean isTestApp(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean isDspDemoApp(Context context) {
        if (isDspDemoApp == null) {
            isDspDemoApp = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return isDspDemoApp.booleanValue();
    }

    public static boolean isMemberOfPackageNameList(List<String> list) {
        Context contextY = com.applovin.impl.sdk.p.y();
        if (contextY == null) {
            y.i(TAG, "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(contextY.getPackageName());
    }

    public static boolean isDeepLinkPlusUrl(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static String formatDoubleValue(double d, int i) {
        DecimalFormat decimalFormat2 = decimalFormat;
        decimalFormat2.setMaximumFractionDigits(i);
        return decimalFormat2.format(d);
    }

    public static boolean isVideoMutedInitially(com.applovin.impl.sdk.p pVar) {
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cJ)).booleanValue()) {
            return pVar.C().isMuted();
        }
        return ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cH)).booleanValue();
    }

    public static int compare(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                int iCompareTo = VersionInfo.getInstance(digitsOnlyVersionString).compareTo(VersionInfo.getInstance(digitsOnlyVersionString2));
                return iCompareTo == 0 ? iCompareTo : iCompareTo > 0 ? 1 : -1;
            }
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i = 0;
            while (i < iMax) {
                String str3 = StringUtils.isValidString(strArrSplit[i]) ? strArrSplit[i] : "0";
                String str4 = StringUtils.isValidString(strArrSplit2[i]) ? strArrSplit2[i] : "0";
                int i2 = i < strArrSplit.length ? Integer.parseInt(str3) : 0;
                int i3 = i < strArrSplit2.length ? Integer.parseInt(str4) : 0;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            y.c(TAG, "Failed to process version string.", th);
            return 0;
        }
    }

    public static WebView tryToCreateWebView(Context context, String str) {
        return tryToCreateWebView(context, str, false);
    }

    public static WebView tryToCreateWebView(Context context, String str, boolean z) {
        try {
            WebView webView = new WebView(context);
            if (z) {
                webView.setWebViewClient(new ab());
            }
            return webView;
        } catch (Throwable th) {
            y.c(TAG, "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static boolean isUserAgentCollectionEnabled(com.applovin.impl.sdk.p pVar) {
        String str = pVar.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static void showWebViewActivity(Uri uri, Activity activity, com.applovin.impl.sdk.p pVar) {
        if (activity == null) {
            activity = pVar.x();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, pVar.B());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static String getRawResourceString(int i, Context context, com.applovin.impl.sdk.p pVar) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e) {
                if (pVar != null) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b(TAG, "Opening raw resource file threw exception", e);
                    }
                }
                return "";
            } finally {
                close(inputStreamOpenRawResource, pVar);
            }
        } catch (Throwable th) {
            if (pVar != null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b(TAG, "Failed to retrieve resource " + i, th);
                }
            }
            return "";
        }
    }

    public static void logJava8MethodReference() {
        y.f("AppLovinSdk", "Java version 8 supported.");
    }
}
