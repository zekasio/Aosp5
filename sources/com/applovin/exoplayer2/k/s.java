package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.system.OsConstants;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.applovin.impl.sdk.l$$ExternalSyntheticApiModelOutline0;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class s extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f591a;
    private Uri b;
    private long c;
    private boolean d;

    public static class b extends j {
        public b(Throwable th, int i) {
            super(th, i);
        }

        public b(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public s() {
        super(false);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        Uri uri = lVar.f581a;
        this.b = uri;
        b(lVar);
        RandomAccessFile randomAccessFileA = a(uri);
        this.f591a = randomAccessFileA;
        try {
            randomAccessFileA.seek(lVar.g);
            long length = lVar.h == -1 ? this.f591a.length() - lVar.g : lVar.h;
            this.c = length;
            if (length < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.d = true;
            c(lVar);
            return this.c;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) ai.a(this.f591a)).read(bArr, i, (int) Math.min(this.c, i2));
            if (i3 > 0) {
                this.c -= (long) i3;
                a(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new b(e, 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.b;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws b {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f591a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        } finally {
            this.f591a = null;
            if (this.d) {
                this.d = false;
                d();
            }
        }
    }

    private static RandomAccessFile a(Uri uri) throws b {
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) com.applovin.exoplayer2.l.a.b(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            if (ai.f611a < 21 || !a.b(e.getCause())) {
                i = 2005;
            }
            throw new b(e, i);
        } catch (SecurityException e2) {
            throw new b(e2, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e3) {
            throw new b(e3, 2000);
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return l$$ExternalSyntheticApiModelOutline0.m278m((Object) th) && l$$ExternalSyntheticApiModelOutline0.m269m((Object) th).errno == OsConstants.EACCES;
        }
    }
}
