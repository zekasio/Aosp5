package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad<K0, V0> {
    /* synthetic */ ad(AnonymousClass1 anonymousClass1) {
        this();
    }

    private ad() {
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.ad$1, reason: invalid class name */
    class AnonymousClass1 extends c<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f110a;

        @Override // com.applovin.exoplayer2.common.a.ad.c
        <K, V> Map<K, Collection<V>> a() {
            return aj.a(this.f110a);
        }
    }

    public static c<Comparable> a() {
        return a(ai.b());
    }

    public static <K0> c<K0> a(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new c<K0>() { // from class: com.applovin.exoplayer2.common.a.ad.2
            @Override // com.applovin.exoplayer2.common.a.ad.c
            <K extends K0, V> Map<K, Collection<V>> a() {
                return new TreeMap(comparator);
            }
        };
    }

    private static final class a<V> implements Supplier<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f112a;

        a(int i) {
            this.f112a = j.a(i, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f112a);
        }
    }

    public static abstract class c<K0> {
        abstract <K extends K0, V> Map<K, Collection<V>> a();

        c() {
        }

        public b<K0, Object> b() {
            return a(2);
        }

        public b<K0, Object> a(final int i) {
            j.a(i, "expectedValuesPerKey");
            return new b<K0, Object>() { // from class: com.applovin.exoplayer2.common.a.ad.c.1
                @Override // com.applovin.exoplayer2.common.a.ad.b
                public <K extends K0, V> z<K, V> b() {
                    return ae.a(c.this.a(), new a(i));
                }
            };
        }
    }

    public static abstract class b<K0, V0> extends ad<K0, V0> {
        public abstract <K extends K0, V extends V0> z<K, V> b();

        b() {
            super(null);
        }
    }
}
