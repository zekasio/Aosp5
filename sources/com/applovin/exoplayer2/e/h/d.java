package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f322a = new e();
    private final y b = new y(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    d() {
    }

    public void a() {
        this.f322a.a();
        this.b.a(0);
        this.c = -1;
        this.e = false;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i;
        com.applovin.exoplayer2.l.a.b(iVar != null);
        if (this.e) {
            this.e = false;
            this.b.a(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.f322a.a(iVar) || !this.f322a.a(iVar, true)) {
                    return false;
                }
                int iA = this.f322a.h;
                if ((this.f322a.b & 1) == 1 && this.b.b() == 0) {
                    iA += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!k.a(iVar, iA)) {
                    return false;
                }
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                y yVar = this.b;
                yVar.b(yVar.b() + iA2);
                if (!k.b(iVar, this.b.d(), this.b.b(), iA2)) {
                    return false;
                }
                y yVar2 = this.b;
                yVar2.c(yVar2.b() + iA2);
                this.e = this.f322a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.f322a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }

    public e b() {
        return this.f322a;
    }

    public y c() {
        return this.b;
    }

    public void d() {
        if (this.b.d().length == 65025) {
            return;
        }
        y yVar = this.b;
        yVar.a(Arrays.copyOf(yVar.d(), Math.max(65025, this.b.b())), this.b.b());
    }

    private int a(int i) {
        int i2 = 0;
        this.d = 0;
        while (this.d + i < this.f322a.g) {
            int[] iArr = this.f322a.j;
            int i3 = this.d;
            this.d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
