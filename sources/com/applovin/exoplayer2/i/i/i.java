package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f548a;
    private final long[] b;
    private final long[] c;

    public i(List<e> list) {
        this.f548a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            e eVar = list.get(i);
            int i2 = i * 2;
            this.b[i2] = eVar.b;
            this.b[i2 + 1] = eVar.c;
        }
        long[] jArr = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j) {
        int iB = ai.b(this.c, j, false, false);
        if (iB < this.c.length) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.c.length;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i >= 0);
        com.applovin.exoplayer2.l.a.a(i < this.c.length);
        return this.c[i];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f548a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                e eVar = this.f548a.get(i);
                if (eVar.f540a.f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(eVar.f540a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.applovin.exoplayer2.i.i.i$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.a((e) obj, (e) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((e) arrayList2.get(i3)).f540a.a().a((-1) - i3, 1).e());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(e eVar, e eVar2) {
        return Long.compare(eVar.b, eVar2.b);
    }
}
