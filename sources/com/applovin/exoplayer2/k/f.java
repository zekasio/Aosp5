package com.applovin.exoplayer2.k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f577a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public static class b extends j {
        public b(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public f(Context context) {
        super(false);
        this.f577a = context.getContentResolver();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws b {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = lVar.f581a;
            this.b = uri;
            b(lVar);
            if ("content".equals(lVar.f581a.getScheme())) {
                Bundle bundle = new Bundle();
                if (ai.f611a >= 31) {
                    a.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.f577a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f577a.openAssetFileDescriptor(uri, "r");
            }
            this.c = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.d = fileInputStream;
            if (length != -1 && lVar.g > length) {
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(lVar.g + startOffset) - startOffset;
            if (jSkip != lVar.g) {
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.e = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.e = jPosition;
                    if (jPosition < 0) {
                        throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j = length - jSkip;
                this.e = j;
                if (j < 0) {
                    throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            if (lVar.h != -1) {
                long j2 = this.e;
                this.e = j2 == -1 ? lVar.h : Math.min(j2, lVar.h);
            }
            this.f = true;
            c(lVar);
            return lVar.h != -1 ? lVar.h : this.e;
        } catch (b e) {
            throw e;
        } catch (IOException e2) {
            throw new b(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        }
        int i3 = ((FileInputStream) ai.a(this.d)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - ((long) i3);
        }
        a(i3);
        return i3;
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
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            d();
                        }
                    }
                } catch (IOException e) {
                    throw new b(e, 2000);
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new b(e3, 2000);
                }
            } finally {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
            }
        }
    }

    private static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }
}
