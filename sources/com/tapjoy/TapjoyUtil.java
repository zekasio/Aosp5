package com.tapjoy;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.w1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f1734a = new AtomicInteger(1);

    public static String SHA1(String str) {
        return a("SHA-1", str);
    }

    public static String SHA256(String str) {
        return a("SHA-256", str);
    }

    public static String a(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(str2.getBytes("iso-8859-1"), 0, str2.length());
        return convertToHex(messageDigest.digest());
    }

    public static Document buildDocument(String str) {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            return documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes("UTF-8")));
        } catch (Exception e) {
            StringBuilder sbA = w1.a("buildDocument exception: ");
            sbA.append(e.toString());
            TapjoyLog.e("TapjoyUtil", sbA.toString());
            return null;
        }
    }

    public static String convertToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] >>> 4) & 15;
            int i3 = 0;
            while (true) {
                if (i2 < 0 || i2 > 9) {
                    stringBuffer.append((char) (i2 + 87));
                } else {
                    stringBuffer.append((char) (i2 + 48));
                }
                i2 = bArr[i] & Ascii.SI;
                int i4 = i3 + 1;
                if (i3 >= 1) {
                    break;
                }
                i3 = i4;
            }
        }
        return stringBuffer.toString();
    }

    public static String convertURLParams(Map<String, String> map, boolean z) {
        String string = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (string.length() > 0) {
                string = string + "&";
            }
            if (z) {
                StringBuilder sbA = w1.a(string);
                sbA.append(Uri.encode(entry.getKey()));
                sbA.append("=");
                sbA.append(Uri.encode(entry.getValue()));
                string = sbA.toString();
            } else {
                StringBuilder sbA2 = w1.a(string);
                sbA2.append(entry.getKey());
                sbA2.append("=");
                sbA2.append(entry.getValue());
                string = sbA2.toString();
            }
        }
        return string;
    }

    public static Bitmap createBitmapFromView(View view) {
        Bitmap bitmapCreateBitmap = null;
        if (view == null || view.getLayoutParams().width <= 0 || view.getLayoutParams().height <= 0) {
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getLayoutParams().width, view.getLayoutParams().height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            view.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            StringBuilder sbA = w1.a("error creating bitmap: ");
            sbA.append(e.toString());
            TapjoyLog.d("TapjoyUtil", sbA.toString());
            return bitmapCreateBitmap;
        }
    }

    public static void deleteFileOrDirectory(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                deleteFileOrDirectory(file2);
            }
        }
        TapjoyLog.d("TapjoyUtil", "****************************************");
        TapjoyLog.d("TapjoyUtil", "deleteFileOrDirectory: " + file.getAbsolutePath());
        TapjoyLog.d("TapjoyUtil", "****************************************");
        file.delete();
    }

    public static String determineMimeType(String str) {
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }
        String strSubstring = str.lastIndexOf(46) != -1 ? str.substring(str.lastIndexOf(46) + 1) : "";
        return strSubstring.equals("css") ? "text/css" : strSubstring.equals("js") ? "text/javascript" : strSubstring.equals(TJAdUnitConstants.String.HTML) ? "text/html" : "application/octet-stream";
    }

    public static long fileOrDirectorySize(File file) {
        long length = 0;
        for (File file2 : file.listFiles()) {
            length = (file2.isFile() ? file2.length() : fileOrDirectorySize(file2)) + length;
        }
        return length;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f1734a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static Long getAvailableDiskSpace() {
        return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes() / 1000000);
    }

    public static String getFileContents(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z) {
            String line = bufferedReader.readLine();
            boolean z2 = line == null;
            if (line != null) {
                sb.append(line);
            }
            z = z2;
        }
        bufferedReader.close();
        fileInputStream.close();
        return sb.toString();
    }

    public static String getNodeTrimValue(NodeList nodeList) {
        Element element = (Element) nodeList.item(0);
        if (element != null) {
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            String string = "";
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem != null) {
                    StringBuilder sbA = w1.a(string);
                    sbA.append(nodeItem.getNodeValue());
                    string = sbA.toString();
                }
            }
            if (string != null && !string.equals("")) {
                return string.trim();
            }
        }
        return null;
    }

    public static String getRedirectDomain(String str) {
        return str != null ? str.substring(str.indexOf("//") + 2, str.lastIndexOf("/")) : "";
    }

    public static Float getScreenBrightness(Context context) {
        try {
            return Float.valueOf(new BigDecimal(Settings.System.getInt(context.getContentResolver(), "screen_brightness") / 255.0f).setScale(2, 4).floatValue());
        } catch (Settings.SettingNotFoundException e) {
            TapjoyLog.e("TapjoyUtil", e.getLocalizedMessage());
            return null;
        }
    }

    public static String getTheme(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getNightMode() == 2 ? TapjoyConstants.TJC_THEME_DARK : TapjoyConstants.TJC_THEME_LIGHT;
    }

    public static Long getTotalDiskSpace() {
        return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes() / 1000000);
    }

    public static Float getVolume(Context context) {
        if (context == null) {
            return null;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            return Float.valueOf(new BigDecimal(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)).setScale(2, 4).floatValue());
        } catch (Exception unused) {
            TapjoyLog.e("TapjoyUtil", "Unable to fetch volume");
            return null;
        }
    }

    public static Map<String, String> jsonToStringMap(JSONObject jSONObject) {
        return jSONObject != JSONObject.NULL ? toStringMap(jSONObject) : new HashMap();
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static void safePut(Map<String, String> map, String str, String str2, boolean z) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        if (z) {
            map.put(Uri.encode(str), Uri.encode(str2));
        } else {
            map.put(str, str2);
        }
    }

    public static View scaleDisplayAd(View view, int i) {
        int i2 = view.getLayoutParams().width;
        int i3 = view.getLayoutParams().height;
        TapjoyLog.d("TapjoyUtil", "wxh: " + i2 + "x" + i3);
        if (i2 > i) {
            double d = i;
            Double.valueOf(d).getClass();
            double d2 = i2;
            Double.valueOf(d2).getClass();
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            Double.valueOf(d3).getClass();
            int iIntValue = Double.valueOf(d3 * 100.0d).intValue();
            WebView webView = (WebView) view;
            webView.getSettings().setSupportZoom(true);
            webView.setPadding(0, 0, 0, 0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setInitialScale(iIntValue);
            view.setLayoutParams(new ViewGroup.LayoutParams(i, (i3 * i) / i2));
        }
        return view;
    }

    public static Map<String, String> toStringMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.get(next).toString());
        }
        return map;
    }

    public static void writeFileToDevice(BufferedInputStream bufferedInputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void safePut(Map<String, String> map, String str, Number number) {
        if (str == null || str.length() <= 0 || number == null) {
            return;
        }
        map.put(str, number.toString());
    }

    public static Map<String, String> convertURLParams(String str, boolean z) {
        HashMap map = new HashMap();
        String strDecode = "";
        String str2 = strDecode;
        boolean z2 = false;
        for (int i = 0; i < str.length() && i != -1; i++) {
            char cCharAt = str.charAt(i);
            if (z2) {
                if (z2) {
                    if (cCharAt == '&') {
                        if (z) {
                            strDecode = Uri.decode(strDecode);
                        }
                        map.put(str2, strDecode);
                        strDecode = "";
                        z2 = false;
                    } else {
                        strDecode = strDecode + cCharAt;
                    }
                }
            } else if (cCharAt == '=') {
                if (z) {
                    strDecode = Uri.decode(strDecode);
                }
                str2 = strDecode;
                z2 = true;
                strDecode = "";
            } else {
                strDecode = strDecode + cCharAt;
            }
        }
        if (z2 && strDecode.length() > 0) {
            if (z) {
                strDecode = Uri.decode(strDecode);
            }
            map.put(str2, strDecode);
        }
        return map;
    }
}
