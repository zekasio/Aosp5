package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l<T> extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1394a;
    private boolean b;

    protected l(a aVar) {
        super(aVar);
        this.f1394a = aVar.o;
        this.b = aVar.p;
    }

    public boolean p() {
        return this.f1394a != null;
    }

    public String q() {
        return this.f1394a;
    }

    public boolean r() {
        return this.b;
    }

    public static a b(p pVar) {
        return new a(pVar);
    }

    public static class a<T> extends c.a<T> {
        private String o;
        private boolean p;

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Map map) {
            return c((Map<String, String>) map);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a b(Map map) {
            return d((Map<String, String>) map);
        }

        public a(p pVar) {
            super(pVar);
            this.h = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cX)).intValue();
            this.i = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cW)).intValue();
            this.j = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.de)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f1373a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public a c(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public a d(Map<String, String> map) {
            this.e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(T t) {
            this.g = t;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            this.j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(boolean z) {
            this.m = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a d(boolean z) {
            this.n = z;
            return this;
        }

        public a g(String str) {
            this.o = str;
            return this;
        }

        public a g(boolean z) {
            this.p = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l<T> a() {
            return new l<>(this);
        }
    }
}
