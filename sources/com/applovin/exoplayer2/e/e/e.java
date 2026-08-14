package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f286a = new y(8);
    private int b;

    public boolean a(i iVar) throws IOException {
        long jD = iVar.d();
        long j = 1024;
        if (jD != -1 && jD <= 1024) {
            j = jD;
        }
        int i = (int) j;
        iVar.d(this.f286a.d(), 0, 4);
        long jO = this.f286a.o();
        this.b = 4;
        while (jO != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            iVar.d(this.f286a.d(), 0, 1);
            jO = ((jO << 8) & (-256)) | ((long) (this.f286a.d()[0] & UByte.MAX_VALUE));
        }
        long jB = b(iVar);
        long j2 = this.b;
        if (jB == Long.MIN_VALUE) {
            return false;
        }
        if (jD != -1 && j2 + jB >= jD) {
            return false;
        }
        while (true) {
            int i3 = this.b;
            long j3 = j2 + jB;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (b(iVar) == Long.MIN_VALUE) {
                return false;
            }
            long jB2 = b(iVar);
            if (jB2 < 0 || jB2 > 2147483647L) {
                break;
            }
            if (jB2 != 0) {
                int i4 = (int) jB2;
                iVar.c(i4);
                this.b += i4;
            }
        }
        return false;
    }

    private long b(i iVar) throws IOException {
        int i = 0;
        iVar.d(this.f286a.d(), 0, 1);
        int i2 = this.f286a.d()[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        iVar.d(this.f286a.d(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f286a.d()[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }
}
