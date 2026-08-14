package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.b.s;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.loopj.android.http.AsyncHttpClient;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f324a = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean b;

    g() {
    }

    public static boolean a(y yVar) {
        int iA = yVar.a();
        byte[] bArr = f324a;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.b = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected long b(y yVar) {
        return b(a(yVar.d()));
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected boolean a(y yVar, long j, h.a aVar) {
        if (!this.b) {
            byte[] bArrCopyOf = Arrays.copyOf(yVar.d(), yVar.b());
            aVar.f326a = new v.a().f("audio/opus").k(s.a(bArrCopyOf)).l(48000).a(s.b(bArrCopyOf)).a();
            this.b = true;
            return true;
        }
        com.applovin.exoplayer2.l.a.b(aVar.f326a);
        boolean z = yVar.q() == 1332770163;
        yVar.d(0);
        return z;
    }

    private long a(byte[] bArr) {
        int i;
        byte b = bArr[0];
        int i2 = b & UByte.MAX_VALUE;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << (i4 & 1) : i5 == 3 ? 60000 : AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << i5));
    }
}
