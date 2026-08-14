package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.a.v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class t<K, V> extends v<K, V> implements z<K, V> {
    public static <K, V> t<K, V> a() {
        return o.f158a;
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    public static final class a<K, V> extends v.a<K, V> {
        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(K k, Iterable<? extends V> iterable) {
            super.b(k, iterable);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(K k, V... vArr) {
            super.b(k, vArr);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<K, V> b() {
            return (t) super.b();
        }
    }

    static <K, V> t<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        s sVarA;
        if (collection.isEmpty()) {
            return a();
        }
        u.a aVar = new u.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                sVarA = s.a((Collection) value);
            } else {
                sVarA = s.a((Comparator) comparator, (Iterable) value);
            }
            if (!sVarA.isEmpty()) {
                aVar.a(key, sVarA);
                size += sVarA.size();
            }
        }
        return new t<>(aVar.a(), size);
    }

    t(u<K, s<V>> uVar, int i) {
        super(uVar, i);
    }

    @Override // com.applovin.exoplayer2.common.a.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<V> b(@NullableDecl K k) {
        s<V> sVar = (s) this.b.get(k);
        return sVar == null ? s.g() : sVar;
    }
}
