package com.applovin.exoplayer2.k;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f578a;
    private byte[] b;
    private int c;
    private int d;

    public h() {
        super(false);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        b(lVar);
        this.f578a = lVar;
        Uri uri = lVar.f581a;
        String scheme = uri.getScheme();
        com.applovin.exoplayer2.l.a.a(TJAdUnitConstants.String.DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrA = ai.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length != 2) {
            throw com.applovin.exoplayer2.ai.a("Unexpected URI format: " + uri, null);
        }
        String str = strArrA[1];
        if (strArrA[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw com.applovin.exoplayer2.ai.a("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.b = ai.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
        }
        if (lVar.g > this.b.length) {
            this.b = null;
            throw new j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i = (int) lVar.g;
        this.c = i;
        this.d = this.b.length - i;
        if (lVar.h != -1) {
            this.d = (int) Math.min(this.d, lVar.h);
        }
        c(lVar);
        return lVar.h != -1 ? lVar.h : this.d;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(ai.a(this.b), this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        l lVar = this.f578a;
        if (lVar != null) {
            return lVar.f581a;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        if (this.b != null) {
            this.b = null;
            d();
        }
        this.f578a = null;
    }
}
