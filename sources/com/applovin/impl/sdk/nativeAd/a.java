package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.File;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f1362a;
    private final AppLovinNativeAdImpl b;
    private final InterfaceC0077a c;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0077a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, InterfaceC0077a interfaceC0077a) {
        super("TaskCacheNativeAd", pVar);
        this.f1362a = new com.applovin.impl.sdk.d.e();
        this.b = appLovinNativeAdImpl;
        this.c = interfaceC0077a;
    }

    @Override // java.lang.Runnable
    public void run() {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Begin caching ad #" + this.b.getAdIdNumber() + "...");
        }
        Uri uriA = a(this.b.getIconUri());
        if (uriA != null) {
            this.b.setIconUri(uriA);
        }
        Uri uriA2 = a(this.b.getMainImageUri());
        if (uriA2 != null) {
            this.b.setMainImageUri(uriA2);
        }
        Uri uriA3 = a(this.b.getPrivacyIconUri());
        if (uriA3 != null) {
            this.b.setPrivacyIconUri(uriA3);
        }
        y yVar2 = this.h;
        if (y.a()) {
            this.h.b(this.g, "Finished caching ad #" + this.b.getAdIdNumber());
        }
        this.c.a(this.b);
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Attempting to cache resource: " + uri);
        }
        String strA = this.f.W().a(f(), uri.toString(), this.b.getCachePrefix(), Collections.emptyList(), false, true, this.f1362a);
        if (StringUtils.isValidString(strA)) {
            File fileA = this.f.W().a(strA, f());
            if (fileA != null) {
                Uri uriFromFile = Uri.fromFile(fileA);
                if (uriFromFile != null) {
                    return uriFromFile;
                }
                y yVar2 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to extract Uri from image file");
                }
            } else {
                y yVar3 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to retrieve File from cached image filename = " + strA);
                }
            }
        }
        return null;
    }
}
