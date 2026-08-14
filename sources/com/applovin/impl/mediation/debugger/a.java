package com.applovin.impl.mediation.debugger;

import com.applovin.impl.mediation.debugger.c.a;
import com.applovin.impl.mediation.debugger.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.InterfaceC0066a, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1015a;
    private final InterfaceC0063a b;
    private com.applovin.impl.mediation.debugger.b.b.a c;
    private String d;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.a$a, reason: collision with other inner class name */
    public interface InterfaceC0063a {
        void a(b bVar, String str);

        void a(com.applovin.impl.mediation.debugger.b.b.a aVar, String str);
    }

    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_REQUIRED_ENTRY
    }

    public a(p pVar, InterfaceC0063a interfaceC0063a) {
        this.f1015a = pVar;
        this.b = interfaceC0063a;
    }

    public void a() {
        com.applovin.impl.mediation.debugger.b.b.a aVar = this.c;
        if (aVar != null) {
            this.b.a(aVar, this.d);
        } else {
            this.f1015a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.debugger.c.b(this.f1015a, this));
        }
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(String str) {
        this.f1015a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.debugger.c.a(this.f1015a, str, this));
    }

    @Override // com.applovin.impl.mediation.debugger.c.b.a
    public void a(b bVar) {
        this.b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0066a
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(strArrSplit[i2], i);
            if (bVar.g()) {
                String strA = bVar.a();
                List arrayList2 = map.containsKey(strA) ? (List) map.get(strA) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                    map.put(strA, arrayList2);
                }
            } else {
                arrayList.add(bVar);
            }
            i2++;
            i = i3;
        }
        this.c = new com.applovin.impl.mediation.debugger.b.b.a(map, arrayList);
        this.d = str2;
        this.f1015a.L();
        if (y.a()) {
            this.f1015a.L().b("AppAdsTxtService", "app-ads.txt fetched: " + this.c);
        }
        this.b.a(this.c, str2);
    }

    @Override // com.applovin.impl.mediation.debugger.c.a.InterfaceC0066a
    public void a(b bVar, String str) {
        this.b.a(bVar, str);
    }
}
