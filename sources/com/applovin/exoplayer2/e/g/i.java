package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.c;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Splitter f310a = Splitter.on(':');
    private static final Splitter b = Splitter.on('*');
    private final List<a> c = new ArrayList();
    private int d = 0;
    private int e;

    public void a() {
        this.c.clear();
        this.d = 0;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, u uVar, List<a.InterfaceC0030a> list) throws IOException {
        int i = this.d;
        long j = 0;
        if (i == 0) {
            long jD = iVar.d();
            if (jD != -1 && jD >= 8) {
                j = jD - 8;
            }
            uVar.f386a = j;
            this.d = 1;
        } else if (i == 1) {
            a(iVar, uVar);
        } else if (i == 2) {
            b(iVar, uVar);
        } else if (i == 3) {
            a(iVar, list);
            uVar.f386a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        y yVar = new y(8);
        iVar.b(yVar.d(), 0, 8);
        this.e = yVar.r() + 8;
        if (yVar.q() != 1397048916) {
            uVar.f386a = 0L;
        } else {
            uVar.f386a = iVar.c() - ((long) (this.e - 12));
            this.d = 2;
        }
    }

    private void b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long jD = iVar.d();
        int i = this.e - 20;
        y yVar = new y(i);
        iVar.b(yVar.d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            yVar.e(2);
            short sL = yVar.l();
            if (sL == 2192 || sL == 2816 || sL == 2817 || sL == 2819 || sL == 2820) {
                this.c.add(new a(sL, (jD - ((long) this.e)) - ((long) yVar.r()), yVar.r()));
            } else {
                yVar.e(8);
            }
        }
        if (this.c.isEmpty()) {
            uVar.f386a = 0L;
        } else {
            this.d = 3;
            uVar.f386a = this.c.get(0).b;
        }
    }

    private void a(com.applovin.exoplayer2.e.i iVar, List<a.InterfaceC0030a> list) throws IOException {
        long jC = iVar.c();
        int iD = (int) ((iVar.d() - iVar.c()) - ((long) this.e));
        y yVar = new y(iD);
        iVar.b(yVar.d(), 0, iD);
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = this.c.get(i);
            yVar.d((int) (aVar.b - jC));
            yVar.e(4);
            int iR = yVar.r();
            int iA = a(yVar.f(iR));
            int i2 = aVar.c - (iR + 8);
            if (iA == 2192) {
                list.add(a(yVar, i2));
            } else if (iA != 2816 && iA != 2817 && iA != 2819 && iA != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static com.applovin.exoplayer2.g.f.c a(y yVar, int i) throws ai {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = b.splitToList(yVar.f(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            List<String> listSplitToList2 = f310a.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() != 3) {
                throw ai.b(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ai.b(null, e);
            }
        }
        return new com.applovin.exoplayer2.g.f.c(arrayList);
    }

    private static int a(String str) throws ai {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ai.b("Invalid SEF name", null);
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f311a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.f311a = i;
            this.b = j;
            this.c = i2;
        }
    }
}
