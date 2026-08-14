package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.k.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f601a = new Comparator() { // from class: com.applovin.exoplayer2.k.y$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y.b((y.a) obj, (y.a) obj2);
        }
    };
    private static final Comparator<a> b = new Comparator() { // from class: com.applovin.exoplayer2.k.y$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return y.a((y.a) obj, (y.a) obj2);
        }
    };
    private final int c;
    private int g;
    private int h;
    private int i;
    private final a[] e = new a[5];
    private final ArrayList<a> d = new ArrayList<>();
    private int f = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return aVar.f602a - aVar2.f602a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return Float.compare(aVar.c, aVar2.c);
    }

    public y(int i) {
        this.c = i;
    }

    public void a() {
        this.d.clear();
        this.f = -1;
        this.g = 0;
        this.h = 0;
    }

    public void a(int i, float f) {
        a aVar;
        b();
        int i2 = this.i;
        if (i2 > 0) {
            a[] aVarArr = this.e;
            int i3 = i2 - 1;
            this.i = i3;
            aVar = aVarArr[i3];
        } else {
            aVar = new a();
        }
        int i4 = this.g;
        this.g = i4 + 1;
        aVar.f602a = i4;
        aVar.b = i;
        aVar.c = f;
        this.d.add(aVar);
        this.h += i;
        while (true) {
            int i5 = this.h;
            int i6 = this.c;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            a aVar2 = this.d.get(0);
            if (aVar2.b <= i7) {
                this.h -= aVar2.b;
                this.d.remove(0);
                int i8 = this.i;
                if (i8 < 5) {
                    a[] aVarArr2 = this.e;
                    this.i = i8 + 1;
                    aVarArr2[i8] = aVar2;
                }
            } else {
                aVar2.b -= i7;
                this.h -= i7;
            }
        }
    }

    public float a(float f) {
        c();
        float f2 = f * this.h;
        int i = 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            a aVar = this.d.get(i2);
            i += aVar.b;
            if (i >= f2) {
                return aVar.c;
            }
        }
        if (this.d.isEmpty()) {
            return Float.NaN;
        }
        return this.d.get(r5.size() - 1).c;
    }

    private void b() {
        if (this.f != 1) {
            Collections.sort(this.d, f601a);
            this.f = 1;
        }
    }

    private void c() {
        if (this.f != 0) {
            Collections.sort(this.d, b);
            this.f = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f602a;
        public int b;
        public float c;

        private a() {
        }
    }
}
