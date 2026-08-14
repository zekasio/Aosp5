package com.applovin.exoplayer2.k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class x extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f600a;
    private final String b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    public static class a extends j {
        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public x(Context context) {
        super(false);
        this.f600a = context.getResources();
        this.b = context.getPackageName();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        int identifier;
        String str;
        Uri uri = lVar.f581a;
        this.c = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String strSubstring = (String) com.applovin.exoplayer2.l.a.b(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(strSubstring);
            identifier = this.f600a.getIdentifier(sb.toString(), "raw", this.b);
            if (identifier == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        } else {
            throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
        }
        b(lVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f600a.openRawResourceFd(identifier);
            this.d = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.e = fileInputStream;
            if (length != -1) {
                try {
                    if (lVar.g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e) {
                    throw e;
                } catch (IOException e2) {
                    throw new a(null, e2, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(lVar.g + startOffset) - startOffset;
            if (jSkip != lVar.g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f = j;
                if (j < 0) {
                    throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            if (lVar.h != -1) {
                long j2 = this.f;
                this.f = j2 == -1 ? lVar.h : Math.min(j2, lVar.h);
            }
            this.g = true;
            c(lVar);
            return lVar.h != -1 ? lVar.h : this.f;
        } catch (Resources.NotFoundException e3) {
            throw new a(null, e3, 2005);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(null, e, 2000);
            }
        }
        int i3 = ((InputStream) ai.a(this.e)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - ((long) i3);
        }
        a(i3);
        return i3;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws a {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.d = null;
                        if (this.g) {
                            this.g = false;
                            d();
                        }
                    }
                } catch (IOException e) {
                    throw new a(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(null, e3, 2000);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    d();
                }
            }
        }
    }
}
