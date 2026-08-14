package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ai;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.a;
import com.applovin.exoplayer2.j.c;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.j.f;
import com.applovin.exoplayer2.j.i;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.exoplayer2.j.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f554a = new int[0];
    private static final ai<Integer> b = ai.a(new Comparator() { // from class: com.applovin.exoplayer2.j.c$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.b((Integer) obj, (Integer) obj2);
        }
    });
    private static final ai<Integer> c = ai.a(new Comparator() { // from class: com.applovin.exoplayer2.j.c$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.a((Integer) obj, (Integer) obj2);
        }
    });
    private final d.b d;
    private final AtomicReference<C0041c> e;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.applovin.exoplayer2.j.j
    public boolean a() {
        return true;
    }

    public static final class d extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f558a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private int h;
        private boolean i;
        private boolean j;
        private boolean k;
        private final SparseArray<Map<ad, e>> l;
        private final SparseBooleanArray m;

        @Deprecated
        public d() {
            this.l = new SparseArray<>();
            this.m = new SparseBooleanArray();
            c();
        }

        public d(Context context) {
            super(context);
            this.l = new SparseArray<>();
            this.m = new SparseBooleanArray();
            c();
        }

        private d(Bundle bundle) {
            super(bundle);
            C0041c c0041c = C0041c.f557a;
            a(bundle.getBoolean(C0041c.d(1000), c0041c.d));
            b(bundle.getBoolean(C0041c.d(1001), c0041c.e));
            c(bundle.getBoolean(C0041c.d(1002), c0041c.f));
            d(bundle.getBoolean(C0041c.d(1003), c0041c.g));
            e(bundle.getBoolean(C0041c.d(1004), c0041c.h));
            f(bundle.getBoolean(C0041c.d(1005), c0041c.i));
            g(bundle.getBoolean(C0041c.d(1006), c0041c.j));
            a(bundle.getInt(C0041c.d(1007), c0041c.c));
            h(bundle.getBoolean(C0041c.d(1008), c0041c.k));
            i(bundle.getBoolean(C0041c.d(1009), c0041c.l));
            j(bundle.getBoolean(C0041c.d(1010), c0041c.m));
            this.l = new SparseArray<>();
            a(bundle);
            this.m = a(bundle.getIntArray(C0041c.d(1014)));
        }

        public d a(boolean z) {
            this.f558a = z;
            return this;
        }

        public d b(boolean z) {
            this.b = z;
            return this;
        }

        public d c(boolean z) {
            this.c = z;
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(Context context, boolean z) {
            super.b(context, z);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(int i, int i2, boolean z) {
            super.b(i, i2, z);
            return this;
        }

        public d d(boolean z) {
            this.d = z;
            return this;
        }

        public d e(boolean z) {
            this.e = z;
            return this;
        }

        public d f(boolean z) {
            this.f = z;
            return this;
        }

        public d g(boolean z) {
            this.g = z;
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d b(Context context) {
            super.b(context);
            return this;
        }

        public d a(int i) {
            this.h = i;
            return this;
        }

        public d h(boolean z) {
            this.i = z;
            return this;
        }

        public d i(boolean z) {
            this.j = z;
            return this;
        }

        public d j(boolean z) {
            this.k = z;
            return this;
        }

        public final d a(int i, ad adVar, e eVar) {
            Map<ad, e> map = this.l.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.l.put(i, map);
            }
            if (map.containsKey(adVar) && com.applovin.exoplayer2.l.ai.a(map.get(adVar), eVar)) {
                return this;
            }
            map.put(adVar, eVar);
            return this;
        }

        @Override // com.applovin.exoplayer2.j.i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0041c b() {
            return new C0041c(this);
        }

        private void c() {
            this.f558a = true;
            this.b = false;
            this.c = true;
            this.d = true;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = 0;
            this.i = true;
            this.j = false;
            this.k = true;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C0041c.d(1011));
            List listA = com.applovin.exoplayer2.l.c.a(ad.c, bundle.getParcelableArrayList(C0041c.d(1012)), s.g());
            SparseArray sparseArrayA = com.applovin.exoplayer2.l.c.a(e.e, (SparseArray<Bundle>) bundle.getSparseParcelableArray(C0041c.d(1013)), new SparseArray());
            if (intArray == null || intArray.length != listA.size()) {
                return;
            }
            for (int i = 0; i < intArray.length; i++) {
                a(intArray[i], (ad) listA.get(i), (e) sparseArrayA.get(i));
            }
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i : iArr) {
                sparseBooleanArray.append(i, true);
            }
            return sparseBooleanArray;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.j.c$c, reason: collision with other inner class name */
    public static final class C0041c extends i implements com.applovin.exoplayer2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0041c f557a;

        @Deprecated
        public static final C0041c b;
        public static final g.a<C0041c> n;
        private final SparseArray<Map<ad, e>> O;
        private final SparseBooleanArray P;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;

        static {
            C0041c c0041cB = new d().b();
            f557a = c0041cB;
            b = c0041cB;
            n = new g.a() { // from class: com.applovin.exoplayer2.j.c$c$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.g.a
                public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
                    return c.C0041c.a(bundle);
                }
            };
        }

        public static C0041c a(Context context) {
            return new d(context).b();
        }

        private C0041c(d dVar) {
            super(dVar);
            this.d = dVar.f558a;
            this.e = dVar.b;
            this.f = dVar.c;
            this.g = dVar.d;
            this.h = dVar.e;
            this.i = dVar.f;
            this.j = dVar.g;
            this.c = dVar.h;
            this.k = dVar.i;
            this.l = dVar.j;
            this.m = dVar.k;
            this.O = dVar.l;
            this.P = dVar.m;
        }

        public final boolean a(int i) {
            return this.P.get(i);
        }

        public final boolean a(int i, ad adVar) {
            Map<ad, e> map = this.O.get(i);
            return map != null && map.containsKey(adVar);
        }

        public final e b(int i, ad adVar) {
            Map<ad, e> map = this.O.get(i);
            if (map != null) {
                return map.get(adVar);
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.j.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0041c c0041c = (C0041c) obj;
            return super.equals(c0041c) && this.d == c0041c.d && this.e == c0041c.e && this.f == c0041c.f && this.g == c0041c.g && this.h == c0041c.h && this.i == c0041c.i && this.j == c0041c.j && this.c == c0041c.c && this.k == c0041c.k && this.l == c0041c.l && this.m == c0041c.m && a(this.P, c0041c.P) && a(this.O, c0041c.O);
        }

        @Override // com.applovin.exoplayer2.j.i
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + this.c) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0041c a(Bundle bundle) {
            return new d(bundle).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String d(int i) {
            return Integer.toString(i, 36);
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseArray<Map<ad, e>> sparseArray, SparseArray<Map<ad, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !a(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<ad, e> map, Map<ad, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<ad, e> entry : map.entrySet()) {
                ad key = entry.getKey();
                if (!map2.containsKey(key) || !com.applovin.exoplayer2.l.ai.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class e implements com.applovin.exoplayer2.g {
        public static final g.a<e> e = new g.a() { // from class: com.applovin.exoplayer2.j.c$e$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
                return c.e.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f559a;
        public final int[] b;
        public final int c;
        public final int d;

        public e(int i, int[] iArr, int i2) {
            this.f559a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.b = iArrCopyOf;
            this.c = iArr.length;
            this.d = i2;
            Arrays.sort(iArrCopyOf);
        }

        public int hashCode() {
            return (((this.f559a * 31) + Arrays.hashCode(this.b)) * 31) + this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f559a == eVar.f559a && Arrays.equals(this.b, eVar.b) && this.d == eVar.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i2 = bundle.getInt(a(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            com.applovin.exoplayer2.l.a.a(z);
            com.applovin.exoplayer2.l.a.b(intArray);
            return new e(i, intArray, i2);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Deprecated
    public c() {
        this(C0041c.f557a, new a.b());
    }

    public c(Context context) {
        this(context, new a.b());
    }

    public c(Context context, d.b bVar) {
        this(C0041c.a(context), bVar);
    }

    public c(C0041c c0041c, d.b bVar) {
        this.d = bVar;
        this.e = new AtomicReference<>(c0041c);
    }

    @Override // com.applovin.exoplayer2.j.f
    protected final Pair<at[], com.applovin.exoplayer2.j.d[]> a(f.a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p {
        C0041c c0041c = this.e.get();
        int iA = aVar.a();
        d.a[] aVarArrA = a(aVar, iArr, iArr2, c0041c);
        int i = 0;
        while (true) {
            if (i >= iA) {
                break;
            }
            int iA2 = aVar.a(i);
            if (c0041c.a(i) || c0041c.M.contains(Integer.valueOf(iA2))) {
                aVarArrA[i] = null;
            } else {
                ad adVarB = aVar.b(i);
                if (c0041c.a(i, adVarB)) {
                    e eVarB = c0041c.b(i, adVarB);
                    aVarArrA[i] = eVarB != null ? new d.a(adVarB.a(eVarB.f559a), eVarB.b, eVarB.d) : null;
                }
            }
            i++;
        }
        com.applovin.exoplayer2.j.d[] dVarArrA = this.d.a(aVarArrA, d(), aVar2, baVar);
        at[] atVarArr = new at[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            atVarArr[i2] = (c0041c.a(i2) || c0041c.M.contains(Integer.valueOf(aVar.a(i2))) || (aVar.a(i2) != -2 && dVarArrA[i2] == null)) ? null : at.f44a;
        }
        if (c0041c.l) {
            a(aVar, iArr, atVarArr, dVarArrA);
        }
        return Pair.create(atVarArr, dVarArrA);
    }

    protected d.a[] a(f.a aVar, int[][][] iArr, int[] iArr2, C0041c c0041c) throws com.applovin.exoplayer2.p {
        int i;
        String str;
        int i2;
        a aVar2;
        String str2;
        int i3;
        int iA = aVar.a();
        d.a[] aVarArr = new d.a[iA];
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= iA) {
                break;
            }
            if (2 == aVar.a(i5)) {
                if (!z) {
                    d.a aVarA = a(aVar.b(i5), iArr[i5], iArr2[i5], c0041c, true);
                    aVarArr[i5] = aVarA;
                    z = aVarA != null;
                }
                i6 |= aVar.b(i5).b <= 0 ? 0 : 1;
            }
            i5++;
        }
        a aVar3 = null;
        String str3 = null;
        int i7 = -1;
        int i8 = 0;
        while (i8 < iA) {
            if (i == aVar.a(i8)) {
                i2 = i7;
                aVar2 = aVar3;
                str2 = str3;
                i3 = i8;
                Pair<d.a, a> pairB = b(aVar.b(i8), iArr[i8], iArr2[i8], c0041c, c0041c.m || i6 == 0);
                if (pairB != null && (aVar2 == null || ((a) pairB.second).compareTo(aVar2) > 0)) {
                    if (i2 != -1) {
                        aVarArr[i2] = null;
                    }
                    d.a aVar4 = (d.a) pairB.first;
                    aVarArr[i3] = aVar4;
                    str3 = aVar4.f562a.a(aVar4.b[0]).c;
                    aVar3 = (a) pairB.second;
                    i7 = i3;
                }
                i8 = i3 + 1;
                i = 1;
            } else {
                i2 = i7;
                aVar2 = aVar3;
                str2 = str3;
                i3 = i8;
            }
            i7 = i2;
            aVar3 = aVar2;
            str3 = str2;
            i8 = i3 + 1;
            i = 1;
        }
        String str4 = str3;
        f fVar = null;
        int i9 = -1;
        while (i4 < iA) {
            int iA2 = aVar.a(i4);
            if (iA2 == 1) {
                str = str4;
            } else if (iA2 == 2) {
                str = str4;
            } else if (iA2 == 3) {
                str = str4;
                Pair<d.a, f> pairA = a(aVar.b(i4), iArr[i4], c0041c, str);
                if (pairA != null && (fVar == null || ((f) pairA.second).compareTo(fVar) > 0)) {
                    if (i9 != -1) {
                        aVarArr[i9] = null;
                    }
                    aVarArr[i4] = (d.a) pairA.first;
                    fVar = (f) pairA.second;
                    i9 = i4;
                }
            } else {
                aVarArr[i4] = a(iA2, aVar.b(i4), iArr[i4], c0041c);
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    protected d.a a(ad adVar, int[][] iArr, int i, C0041c c0041c, boolean z) throws com.applovin.exoplayer2.p {
        d.a aVarA = (c0041c.L || c0041c.K || !z) ? null : a(adVar, iArr, i, c0041c);
        return aVarA == null ? a(adVar, iArr, c0041c) : aVarA;
    }

    private static d.a a(ad adVar, int[][] iArr, int i, C0041c c0041c) {
        ad adVar2 = adVar;
        C0041c c0041c2 = c0041c;
        int i2 = c0041c2.f ? 24 : 16;
        boolean z = c0041c2.e && (i & i2) != 0;
        int i3 = 0;
        while (i3 < adVar2.b) {
            ac acVarA = adVar2.a(i3);
            int i4 = i3;
            int[] iArrA = a(acVarA, iArr[i3], z, i2, c0041c2.q, c0041c2.r, c0041c2.s, c0041c2.t, c0041c2.u, c0041c2.v, c0041c2.w, c0041c2.x, c0041c2.y, c0041c2.z, c0041c2.A);
            if (iArrA.length > 0) {
                return new d.a(acVarA, iArrA);
            }
            i3 = i4 + 1;
            adVar2 = adVar;
            c0041c2 = c0041c;
        }
        return null;
    }

    private static int[] a(ac acVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        int i12;
        int i13;
        HashSet hashSet;
        if (acVar.f457a < 2) {
            return f554a;
        }
        List<Integer> listA = a(acVar, i10, i11, z2);
        if (listA.size() < 2) {
            return f554a;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < listA.size()) {
                String str3 = acVar.a(listA.get(i15).intValue()).l;
                if (hashSet2.add(str3)) {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                    int iA = a(acVar, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, listA);
                    if (iA > i12) {
                        i14 = iA;
                        str2 = str3;
                    }
                    i15 = i13 + 1;
                    hashSet2 = hashSet;
                } else {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                }
                i14 = i12;
                i15 = i13 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        b(acVar, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, listA);
        return listA.size() < 2 ? f554a : com.applovin.exoplayer2.common.b.c.a(listA);
    }

    private static int a(ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue = list.get(i11).intValue();
            if (a(acVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    private static void b(ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!a(acVar.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    private static boolean a(v vVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((vVar.e & 16384) != 0 || !a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !com.applovin.exoplayer2.l.ai.a((Object) vVar.l, (Object) str)) {
            return false;
        }
        if (vVar.q != -1 && (i7 > vVar.q || vVar.q > i3)) {
            return false;
        }
        if (vVar.r == -1 || (i8 <= vVar.r && vVar.r <= i4)) {
            return (vVar.s == -1.0f || (((float) i9) <= vVar.s && vVar.s <= ((float) i5))) && vVar.h != -1 && i10 <= vVar.h && vVar.h <= i6;
        }
        return false;
    }

    private static d.a a(ad adVar, int[][] iArr, C0041c c0041c) {
        int i = -1;
        ac acVar = null;
        g gVar = null;
        for (int i2 = 0; i2 < adVar.b; i2++) {
            ac acVarA = adVar.a(i2);
            List<Integer> listA = a(acVarA, c0041c.y, c0041c.z, c0041c.A);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < acVarA.f457a; i3++) {
                v vVarA = acVarA.a(i3);
                if ((vVarA.e & 16384) == 0 && a(iArr2[i3], c0041c.k)) {
                    g gVar2 = new g(vVarA, c0041c, iArr2[i3], listA.contains(Integer.valueOf(i3)));
                    if ((gVar2.f561a || c0041c.d) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        acVar = acVarA;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i);
    }

    protected Pair<d.a, a> b(ad adVar, int[][] iArr, int i, C0041c c0041c, boolean z) throws com.applovin.exoplayer2.p {
        d.a aVar = null;
        a aVar2 = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < adVar.b; i4++) {
            ac acVarA = adVar.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < acVarA.f457a; i5++) {
                if (a(iArr2[i5], c0041c.k)) {
                    a aVar3 = new a(acVarA.a(i5), c0041c, iArr2[i5]);
                    if ((aVar3.f555a || c0041c.g) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        ac acVarA2 = adVar.a(i2);
        if (!c0041c.L && !c0041c.K && z) {
            int[] iArrA = a(acVarA2, iArr[i2], i3, c0041c.F, c0041c.h, c0041c.i, c0041c.j);
            if (iArrA.length > 1) {
                aVar = new d.a(acVarA2, iArrA);
            }
        }
        if (aVar == null) {
            aVar = new d.a(acVarA2, i3);
        }
        return Pair.create(aVar, (a) com.applovin.exoplayer2.l.a.b(aVar2));
    }

    private static int[] a(ac acVar, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        v vVarA = acVar.a(i);
        int[] iArr2 = new int[acVar.f457a];
        int i3 = 0;
        for (int i4 = 0; i4 < acVar.f457a; i4++) {
            if (i4 == i || a(acVar.a(i4), iArr[i4], vVarA, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    private static boolean a(v vVar, int i, v vVar2, int i2, boolean z, boolean z2, boolean z3) {
        if (!a(i, false) || vVar.h == -1 || vVar.h > i2) {
            return false;
        }
        if (!z3 && (vVar.y == -1 || vVar.y != vVar2.y)) {
            return false;
        }
        if (z || (vVar.l != null && TextUtils.equals(vVar.l, vVar2.l))) {
            return z2 || (vVar.z != -1 && vVar.z == vVar2.z);
        }
        return false;
    }

    protected Pair<d.a, f> a(ad adVar, int[][] iArr, C0041c c0041c, String str) throws com.applovin.exoplayer2.p {
        int i = -1;
        ac acVar = null;
        f fVar = null;
        for (int i2 = 0; i2 < adVar.b; i2++) {
            ac acVarA = adVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < acVarA.f457a; i3++) {
                if (a(iArr2[i3], c0041c.k)) {
                    f fVar2 = new f(acVarA.a(i3), c0041c, iArr2[i3], str);
                    if (fVar2.f560a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        acVar = acVarA;
                        i = i3;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return Pair.create(new d.a(acVar, i), (f) com.applovin.exoplayer2.l.a.b(fVar));
    }

    protected d.a a(int i, ad adVar, int[][] iArr, C0041c c0041c) throws com.applovin.exoplayer2.p {
        ac acVar = null;
        b bVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < adVar.b; i3++) {
            ac acVarA = adVar.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < acVarA.f457a; i4++) {
                if (a(iArr2[i4], c0041c.k)) {
                    b bVar2 = new b(acVarA.a(i4), iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        acVar = acVarA;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i2);
    }

    private static void a(f.a aVar, int[][][] iArr, at[] atVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < aVar.a(); i3++) {
            int iA = aVar.a(i3);
            com.applovin.exoplayer2.j.d dVar = dVarArr[i3];
            if ((iA == 1 || iA == 2) && dVar != null && a(iArr[i3], aVar.b(i3), dVar)) {
                if (iA == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            at atVar = new at(true);
            atVarArr[i2] = atVar;
            atVarArr[i] = atVar;
        }
    }

    private static boolean a(int[][] iArr, ad adVar, com.applovin.exoplayer2.j.d dVar) {
        if (dVar == null) {
            return false;
        }
        int iA = adVar.a(dVar.d());
        for (int i = 0; i < dVar.e(); i++) {
            if (as.CC.d(iArr[iA][dVar.b(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    protected static boolean a(int i, boolean z) {
        int iC = as.CC.c(i);
        return iC == 4 || (z && iC == 3);
    }

    protected static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int a(v vVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.c)) {
            return 4;
        }
        String strA = a(str);
        String strA2 = a(vVar.c);
        if (strA2 == null || strA == null) {
            return (z && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return com.applovin.exoplayer2.l.ai.b(strA2, "-")[0].equals(com.applovin.exoplayer2.l.ai.b(strA, "-")[0]) ? 2 : 0;
    }

    private static List<Integer> a(ac acVar, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(acVar.f457a);
        for (int i3 = 0; i3 < acVar.f457a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < acVar.f457a; i5++) {
                v vVarA = acVar.a(i5);
                if (vVarA.q > 0 && vVarA.r > 0) {
                    Point pointA = a(z, i, i2, vVarA.q, vVarA.r);
                    int i6 = vVarA.q * vVarA.r;
                    if (vVarA.q >= ((int) (pointA.x * 0.98f)) && vVarA.r >= ((int) (pointA.y * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iB = acVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (iB == -1 || iB > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.exoplayer2.l.ai.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.exoplayer2.l.ai.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.a(boolean, int, int, int, int):android.graphics.Point");
    }

    protected static final class g implements Comparable<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f561a;
        private final C0041c b;
        private final boolean c;
        private final boolean d;
        private final int e;
        private final int f;
        private final int g;

        public g(v vVar, C0041c c0041c, int i, boolean z) {
            this.b = c0041c;
            boolean z2 = true;
            int i2 = 0;
            this.f561a = z && (vVar.q == -1 || vVar.q <= c0041c.q) && ((vVar.r == -1 || vVar.r <= c0041c.r) && ((vVar.s == -1.0f || vVar.s <= ((float) c0041c.s)) && (vVar.h == -1 || vVar.h <= c0041c.t)));
            if (!z || ((vVar.q != -1 && vVar.q < c0041c.u) || ((vVar.r != -1 && vVar.r < c0041c.v) || ((vVar.s != -1.0f && vVar.s < c0041c.w) || (vVar.h != -1 && vVar.h < c0041c.x))))) {
                z2 = false;
            }
            this.c = z2;
            this.d = c.a(i, false);
            this.e = vVar.h;
            this.f = vVar.b();
            while (true) {
                if (i2 >= c0041c.B.size()) {
                    i2 = Integer.MAX_VALUE;
                    break;
                } else if (vVar.l != null && vVar.l.equals(c0041c.B.get(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
            this.g = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            ai aiVarA = (this.f561a && this.d) ? c.b : c.b.a();
            return n.a().b(this.d, gVar.d).b(this.f561a, gVar.f561a).b(this.c, gVar.c).a(Integer.valueOf(this.g), Integer.valueOf(gVar.g), ai.b().a()).a(Integer.valueOf(this.e), Integer.valueOf(gVar.e), this.b.K ? c.b.a() : c.c).a(Integer.valueOf(this.f), Integer.valueOf(gVar.f), aiVarA).a(Integer.valueOf(this.e), Integer.valueOf(gVar.e), aiVarA).b();
        }
    }

    protected static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f555a;
        private final String b;
        private final C0041c c;
        private final boolean d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final boolean j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;

        public a(v vVar, C0041c c0041c, int i) {
            int i2;
            int iA;
            int iA2;
            this.c = c0041c;
            this.b = c.a(vVar.c);
            int i3 = 0;
            this.d = c.a(i, false);
            int i4 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i4 >= c0041c.C.size()) {
                    i4 = Integer.MAX_VALUE;
                    iA = 0;
                    break;
                } else {
                    iA = c.a(vVar, c0041c.C.get(i4), false);
                    if (iA > 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f = i4;
            this.e = iA;
            this.g = Integer.bitCount(vVar.e & c0041c.D);
            boolean z = true;
            this.j = (vVar.d & 1) != 0;
            this.k = vVar.y;
            this.l = vVar.z;
            this.m = vVar.h;
            if ((vVar.h != -1 && vVar.h > c0041c.F) || (vVar.y != -1 && vVar.y > c0041c.E)) {
                z = false;
            }
            this.f555a = z;
            String[] strArrD = com.applovin.exoplayer2.l.ai.d();
            int i5 = 0;
            while (true) {
                if (i5 >= strArrD.length) {
                    i5 = Integer.MAX_VALUE;
                    iA2 = 0;
                    break;
                } else {
                    iA2 = c.a(vVar, strArrD[i5], false);
                    if (iA2 > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.h = i5;
            this.i = iA2;
            while (true) {
                if (i3 < c0041c.G.size()) {
                    if (vVar.l != null && vVar.l.equals(c0041c.G.get(i3))) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            this.n = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            ai aiVarA = (this.f555a && this.d) ? c.b : c.b.a();
            n nVarA = n.a().b(this.d, aVar.d).a(Integer.valueOf(this.f), Integer.valueOf(aVar.f), ai.b().a()).a(this.e, aVar.e).a(this.g, aVar.g).b(this.f555a, aVar.f555a).a(Integer.valueOf(this.n), Integer.valueOf(aVar.n), ai.b().a()).a(Integer.valueOf(this.m), Integer.valueOf(aVar.m), this.c.K ? c.b.a() : c.c).b(this.j, aVar.j).a(Integer.valueOf(this.h), Integer.valueOf(aVar.h), ai.b().a()).a(this.i, aVar.i).a(Integer.valueOf(this.k), Integer.valueOf(aVar.k), aiVarA).a(Integer.valueOf(this.l), Integer.valueOf(aVar.l), aiVarA);
            Integer numValueOf = Integer.valueOf(this.m);
            Integer numValueOf2 = Integer.valueOf(aVar.m);
            if (!com.applovin.exoplayer2.l.ai.a((Object) this.b, (Object) aVar.b)) {
                aiVarA = c.c;
            }
            return nVarA.a(numValueOf, numValueOf2, aiVarA).b();
        }
    }

    protected static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f560a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final boolean i;

        public f(v vVar, C0041c c0041c, int i, String str) {
            s<String> sVarA;
            int iA;
            boolean z = false;
            this.b = c.a(i, false);
            int i2 = vVar.d & (c0041c.c ^ (-1));
            this.c = (i2 & 1) != 0;
            this.d = (i2 & 2) != 0;
            if (c0041c.H.isEmpty()) {
                sVarA = s.a("");
            } else {
                sVarA = c0041c.H;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= sVarA.size()) {
                    i3 = Integer.MAX_VALUE;
                    iA = 0;
                    break;
                } else {
                    iA = c.a(vVar, sVarA.get(i3), c0041c.J);
                    if (iA > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.e = i3;
            this.f = iA;
            int iBitCount = Integer.bitCount(vVar.e & c0041c.I);
            this.g = iBitCount;
            this.i = (vVar.e & 1088) != 0;
            int iA2 = c.a(vVar, str, c.a(str) == null);
            this.h = iA2;
            if (iA > 0 || ((c0041c.H.isEmpty() && iBitCount > 0) || this.c || (this.d && iA2 > 0))) {
                z = true;
            }
            this.f560a = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            n nVarA = n.a().b(this.b, fVar.b).a(Integer.valueOf(this.e), Integer.valueOf(fVar.e), ai.b().a()).a(this.f, fVar.f).a(this.g, fVar.g).b(this.c, fVar.c).a(Boolean.valueOf(this.d), Boolean.valueOf(fVar.d), this.f == 0 ? ai.b() : ai.b().a()).a(this.h, fVar.h);
            if (this.g == 0) {
                nVarA = nVarA.a(this.i, fVar.i);
            }
            return nVarA.b();
        }
    }

    protected static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f556a;
        private final boolean b;

        public b(v vVar, int i) {
            this.f556a = (vVar.d & 1) != 0;
            this.b = c.a(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return n.a().b(this.b, bVar.b).b(this.f556a, bVar.f556a).b();
        }
    }
}
