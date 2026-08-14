package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.j;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f1284a;
    private AppLovinAdLoadListener b;
    private final com.applovin.impl.sdk.v c;
    private final Collection<Character> d;
    private final com.applovin.impl.sdk.d.e e;
    private boolean i;

    c(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, pVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f1284a = eVar;
        this.b = appLovinAdLoadListener;
        this.c = pVar.W();
        this.d = j();
        this.e = new com.applovin.impl.sdk.d.e();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1284a.M()) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Subscribing to timeout events...");
            }
            this.f.ar().a(this);
        }
    }

    @Override // com.applovin.impl.mediation.j.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.h().equalsIgnoreCase(this.f1284a.N())) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.e(this.g, "Updating flag for timeout...");
            }
            this.i = true;
        }
        this.f.ar().b(this);
    }

    protected void a() {
        this.f.ar().b(this);
    }

    protected boolean b() {
        return this.i;
    }

    void c() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Caching mute images...");
        }
        Uri uriA = a(this.f1284a.aE(), AnalyticsEvent.Ad.mute);
        if (uriA != null) {
            this.f1284a.e(uriA);
        }
        Uri uriA2 = a(this.f1284a.aF(), AnalyticsEvent.Ad.unmute);
        if (uriA2 != null) {
            this.f1284a.f(uriA2);
        }
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Ad updated with muteImageFilename = " + this.f1284a.aE() + ", unmuteImageFilename = " + this.f1284a.aF());
        }
    }

    Uri a(String str) {
        return a(str, this.f1284a.I(), true);
    }

    Uri a(String str, List<String> list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Caching video " + str + "...");
        }
        String strA = this.c.a(f(), str, this.f1284a.L(), list, z, this.f1284a.shouldUrlEncodeResourcePath(), this.e);
        if (StringUtils.isValidString(strA)) {
            File fileA = this.c.a(strA, f());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    com.applovin.impl.sdk.y yVar2 = this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        this.h.b(this.g, "Finish caching video for ad #" + this.f1284a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
                    }
                    return uriFromFile;
                }
                com.applovin.impl.sdk.y yVar3 = this.h;
                if (!com.applovin.impl.sdk.y.a()) {
                    return null;
                }
                this.h.e(this.g, "Unable to create URI from cached video file = " + fileA);
                return null;
            }
            com.applovin.impl.sdk.y yVar4 = this.h;
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.h.e(this.g, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        com.applovin.impl.sdk.y yVar5 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Failed to cache video");
        }
        h();
        return null;
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Failed to cache " + str + " image");
            }
            return null;
        }
        com.applovin.impl.sdk.y yVar3 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Caching " + str + " image...");
        }
        return b(string);
    }

    protected Uri b(String str) {
        return b(str, this.f1284a.I(), true);
    }

    Uri b(String str, List<String> list, boolean z) {
        try {
            String strA = this.c.a(f(), str, this.f1284a.L(), list, z, this.f1284a.shouldUrlEncodeResourcePath(), this.e);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.c.a(strA, f());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    com.applovin.impl.sdk.y yVar = this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        this.h.e(this.g, "Unable to extract Uri from image file");
                    }
                } else {
                    com.applovin.impl.sdk.y yVar2 = this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        this.h.e(this.g, "Unable to retrieve File from cached image filename = " + strA);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y yVar3 = this.h;
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.h.b(this.g, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    String c(String str, List<String> list, boolean z) {
        InputStream inputStreamA;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = Utils.getFileName(uri);
            if (z) {
                fileName = StringUtils.encodeUriString(fileName);
            }
            int iIntValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bF)).intValue();
            int length = StringUtils.emptyIfNull(fileName).length() + StringUtils.emptyIfNull(this.f1284a.L()).length();
            if (length > iIntValue && StringUtils.isValidString(fileName)) {
                fileName = fileName.substring(length - iIntValue);
            }
            if (StringUtils.isValidString(this.f1284a.L())) {
                fileName = this.f1284a.L() + fileName;
            }
            try {
                File fileA = this.c.a(fileName, f());
                if (fileA != null && fileA.exists()) {
                    return this.c.a(fileA);
                }
                try {
                    inputStreamA = this.c.a(str, list, true, this.e);
                    if (inputStreamA != null) {
                        try {
                            this.c.b(inputStreamA, fileA);
                        } catch (Throwable th) {
                            th = th;
                            Utils.close(inputStreamA, this.f);
                            throw th;
                        }
                    }
                    Utils.close(inputStreamA, this.f);
                    return this.c.a(fileA);
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamA = null;
                }
            } catch (Throwable th3) {
                com.applovin.impl.sdk.y yVar2 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "Resource at " + str + " failed to load.", th3);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x003e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String a(java.lang.String r13, java.util.List<java.lang.String> r14, com.applovin.impl.sdk.ad.e r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.e):java.lang.String");
    }

    void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.e, appLovinAdBase, this.f);
    }

    private Uri a(String str, String str2) {
        String strReplace = str2.replace("/", "_");
        String strL = this.f1284a.L();
        if (StringUtils.isValidString(strL)) {
            strReplace = strL + strReplace;
        }
        File fileA = this.c.a(strReplace, com.applovin.impl.sdk.p.y());
        if (fileA == null) {
            return null;
        }
        if (fileA.exists()) {
            this.e.b(fileA.length());
            return Uri.parse(Advertisement.FILE_SCHEME + fileA.getAbsolutePath());
        }
        if (!this.c.a(fileA, str + str2, Arrays.asList(str), this.e)) {
            return null;
        }
        return Uri.parse(Advertisement.FILE_SCHEME + fileA.getAbsolutePath());
    }

    String c(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.applovin.impl.sdk.network.c cVarA = com.applovin.impl.sdk.network.c.a(this.f).a(str).b("GET").a("").a(0).a();
        final AtomicReference atomicReference = new AtomicReference(null);
        this.f.O().a(cVarA, new b.a(), new b.c<String>() { // from class: com.applovin.impl.sdk.e.c.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(String str2, int i) {
                atomicReference.set(str2);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str2, String str3) {
                com.applovin.impl.sdk.y yVar = c.this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    c.this.h.e(c.this.g, "Failed to load resource from '" + str + "'");
                }
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.e.a(str2.length());
        }
        return str2;
    }

    void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.b;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.b = null;
        }
    }

    void i() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Rendered new ad:" + this.f1284a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.b != null) {
                    c.this.b.adReceived(c.this.f1284a);
                    c.this.b = null;
                }
            }
        });
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char c : ((String) this.f.a(com.applovin.impl.sdk.c.b.bA)).toCharArray()) {
            hashSet.add(Character.valueOf(c));
        }
        hashSet.add('\"');
        return hashSet;
    }
}
