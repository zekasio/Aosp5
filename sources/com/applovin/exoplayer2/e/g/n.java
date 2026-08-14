package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.ai;
import com.google.android.gms.drive.DriveFile;

/* JADX INFO: loaded from: classes.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f316a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public n(k kVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        com.applovin.exoplayer2.l.a.a(iArr.length == jArr2.length);
        com.applovin.exoplayer2.l.a.a(jArr.length == jArr2.length);
        com.applovin.exoplayer2.l.a.a(iArr2.length == jArr2.length);
        this.f316a = kVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | DriveFile.MODE_WRITE_ONLY;
        }
    }

    public int a(long j) {
        for (int iA = ai.a(this.f, j, true, false); iA >= 0; iA--) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iB = ai.b(this.f, j, true, false); iB < this.f.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
