package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<E> extends q<E> implements Set<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NullableDecl
    @LazyInit
    private transient s<E> f172a;

    private static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ax<E> iterator();

    boolean h() {
        return false;
    }

    public static <E> w<E> g() {
        return am.f121a;
    }

    public static <E> w<E> a(E e) {
        return new ar(e);
    }

    public static <E> w<E> a(E e, E e2) {
        return a(2, e, e2);
    }

    public static <E> w<E> a(E e, E e2, E e3) {
        return a(3, e, e2, e3);
    }

    private static <E> w<E> a(int i, Object... objArr) {
        if (i == 0) {
            return g();
        }
        if (i == 1) {
            return a(objArr[0]);
        }
        int iA = a(i);
        Object[] objArr2 = new Object[iA];
        int i2 = iA - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objA = ah.a(objArr[i5], i5);
            int iHashCode = objA.hashCode();
            int iA2 = p.a(iHashCode);
            while (true) {
                int i6 = iA2 & i2;
                Object obj = objArr2[i6];
                if (obj == null) {
                    objArr[i4] = objA;
                    objArr2[i6] = objA;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj.equals(objA)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new ar(objArr[0], i3);
        }
        if (a(i4) < iA / 2) {
            return a(i4, objArr);
        }
        if (a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new am(objArr, i3, objArr2, i2, i4);
    }

    static int a(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (true) {
                double d = iHighestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= iMax) {
                    return iHighestOneBit;
                }
                iHighestOneBit <<= 1;
            }
        } else {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    public static <E> w<E> a(Collection<? extends E> collection) {
        if ((collection instanceof w) && !(collection instanceof SortedSet)) {
            w<E> wVar = (w) collection;
            if (!wVar.f()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static <E> w<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return g();
        }
        if (length == 1) {
            return a(eArr[0]);
        }
        return a(eArr.length, (Object[]) eArr.clone());
    }

    w() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w) && h() && ((w) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        return aq.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return aq.a(this);
    }

    @Override // com.applovin.exoplayer2.common.a.q
    public s<E> e() {
        s<E> sVar = this.f172a;
        if (sVar != null) {
            return sVar;
        }
        s<E> sVarI = i();
        this.f172a = sVarI;
        return sVarI;
    }

    s<E> i() {
        return s.b(toArray());
    }
}
