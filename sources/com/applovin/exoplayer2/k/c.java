package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f573a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public static final class a extends j {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public c(Context context) {
        super(false);
        this.f573a = context.getAssets();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        try {
            Uri uri = lVar.f581a;
            this.b = uri;
            String strSubstring = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            b(lVar);
            InputStream inputStreamOpen = this.f573a.open(strSubstring, 1);
            this.c = inputStreamOpen;
            if (inputStreamOpen.skip(lVar.g) < lVar.g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (lVar.h != -1) {
                this.d = lVar.h;
            } else {
                long jAvailable = this.c.available();
                this.d = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            c(lVar);
            return this.d;
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int i3 = ((InputStream) ai.a(this.c)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - ((long) i3);
        }
        a(i3);
        return i3;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws a {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
                d();
            }
        }
    }
}
