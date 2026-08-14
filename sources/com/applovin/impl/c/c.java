package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f904a;

    private c(List<b> list) {
        this.f904a = list;
    }

    public static c a(t tVar, c cVar, e eVar, p pVar) {
        try {
            List<b> listA = cVar != null ? cVar.a() : new ArrayList<>();
            Iterator<t> it = tVar.a("Verification").iterator();
            while (it.hasNext()) {
                b bVarA = b.a(it.next(), eVar, pVar);
                if (bVarA != null) {
                    listA.add(bVarA);
                }
            }
            return new c(listA);
        } catch (Throwable th) {
            pVar.L();
            if (!y.a()) {
                return null;
            }
            pVar.L().b("VastAdVerifications", "Error occurred while initializing", th);
            return null;
        }
    }

    public List<b> a() {
        return this.f904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f904a.equals(((c) obj).f904a);
        }
        return false;
    }

    public int hashCode() {
        return this.f904a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f904a + "'}";
    }
}
