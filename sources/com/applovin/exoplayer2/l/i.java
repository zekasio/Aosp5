package com.applovin.exoplayer2.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f617a = new Object();
    private final Map<E, Integer> b = new HashMap();
    private Set<E> c = Collections.emptySet();
    private List<E> d = Collections.emptyList();

    public void a(E e) {
        synchronized (this.f617a) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.add(e);
            this.d = Collections.unmodifiableList(arrayList);
            Integer num = this.b.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.c);
                hashSet.add(e);
                this.c = Collections.unmodifiableSet(hashSet);
            }
            this.b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void b(E e) {
        synchronized (this.f617a) {
            Integer num = this.b.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(e);
            this.d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.b.remove(e);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(e);
                this.c = Collections.unmodifiableSet(hashSet);
            } else {
                this.b.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public Set<E> a() {
        Set<E> set;
        synchronized (this.f617a) {
            set = this.c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f617a) {
            it = this.d.iterator();
        }
        return it;
    }

    public int c(E e) {
        int iIntValue;
        synchronized (this.f617a) {
            iIntValue = this.b.containsKey(e) ? this.b.get(e).intValue() : 0;
        }
        return iIntValue;
    }
}
