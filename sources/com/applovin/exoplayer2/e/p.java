package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f380a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final com.applovin.exoplayer2.g.a l;

    private static int a(int i) {
        switch (i) {
            case GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f381a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.f381a = jArr;
            this.b = jArr2;
        }
    }

    public p(byte[] bArr, int i) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArr);
        xVar.a(i * 8);
        this.f380a = xVar.c(16);
        this.b = xVar.c(16);
        this.c = xVar.c(24);
        this.d = xVar.c(24);
        int iC = xVar.c(20);
        this.e = iC;
        this.f = a(iC);
        this.g = xVar.c(3) + 1;
        int iC2 = xVar.c(5) + 1;
        this.h = iC2;
        this.i = b(iC2);
        this.j = xVar.d(36);
        this.k = null;
        this.l = null;
    }

    private p(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, com.applovin.exoplayer2.g.a aVar2) {
        this.f380a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = a(i5);
        this.g = i6;
        this.h = i7;
        this.i = b(i7);
        this.j = j;
        this.k = aVar;
        this.l = aVar2;
    }

    public long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public long a(long j) {
        return ai.a((j * ((long) this.e)) / 1000000, 0L, this.j - 1);
    }

    public long b() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (((long) i) + ((long) this.c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f380a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * ((long) this.g)) * ((long) this.h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public com.applovin.exoplayer2.v a(byte[] bArr, com.applovin.exoplayer2.g.a aVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new v.a().f("audio/flac").f(i).k(this.g).l(this.e).a(Collections.singletonList(bArr)).a(a(aVar)).a();
    }

    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.a aVar) {
        com.applovin.exoplayer2.g.a aVar2 = this.l;
        return aVar2 == null ? aVar : aVar2.a(aVar);
    }

    public p a(a aVar) {
        return new p(this.f380a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public p a(List<String> list) {
        return new p(this.f380a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(list, (List<com.applovin.exoplayer2.g.c.a>) Collections.emptyList())));
    }

    public p b(List<com.applovin.exoplayer2.g.c.a> list) {
        return new p(this.f380a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a((List<String>) Collections.emptyList(), list)));
    }

    private static com.applovin.exoplayer2.g.a a(List<String> list, List<com.applovin.exoplayer2.g.c.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrB = ai.b(str, "=");
            if (strArrB.length != 2) {
                com.applovin.exoplayer2.l.q.c("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new com.applovin.exoplayer2.g.c.b(strArrB[0], strArrB[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }
}
