package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f1448a;
    private static final Object b = new Object();
    private final Bundle c;
    private final int d;
    private final boolean e;

    public static e a(Context context) {
        e eVar;
        synchronized (b) {
            if (f1448a == null) {
                f1448a = new e(context);
            }
            eVar = f1448a;
        }
        return eVar;
    }

    private e(Context context) {
        boolean zBooleanValue;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                y.c("AndroidManifest", "Failed to get meta data.", e);
            }
            int i = 0;
            try {
                XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
                int iIntValue = 0;
                zBooleanValue = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                                for (int i2 = 0; i2 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i2++) {
                                    String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i2);
                                    String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i2);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = iIntValue;
                            try {
                                y.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                this.d = i;
                            } catch (Throwable th2) {
                                this.d = i;
                                this.e = zBooleanValue;
                                throw th2;
                            }
                        }
                    }
                    eventType = xmlResourceParserOpenXmlResourceParser.next();
                } while (eventType != 1);
                this.d = iIntValue;
            } catch (Throwable th3) {
                th = th3;
                zBooleanValue = false;
            }
            this.e = zBooleanValue;
        } finally {
            this.c = bundle;
        }
    }

    public boolean a(String str) {
        Bundle bundle = this.c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a(String str, boolean z) {
        Bundle bundle = this.c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public boolean a() {
        return this.d != 0;
    }
}
