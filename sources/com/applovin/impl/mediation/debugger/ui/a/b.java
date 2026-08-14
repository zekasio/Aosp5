package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b extends com.applovin.impl.mediation.debugger.ui.d.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.a f1050a;
    private final com.applovin.impl.mediation.debugger.b.a.b b;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> d;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> e;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b, reason: collision with other inner class name */
    enum EnumC0068b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    b(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, Context context) {
        super(context);
        this.f1050a = aVar;
        this.b = bVar;
        this.d = b();
        this.e = c();
        this.f = d();
        notifyDataSetChanged();
    }

    public String a() {
        return this.f1050a.b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int e() {
        return EnumC0068b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        if (i == EnumC0068b.INFO.ordinal()) {
            return this.d.size();
        }
        if (i == EnumC0068b.BIDDERS.ordinal()) {
            return this.e.size();
        }
        return this.f.size();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
        if (i == EnumC0068b.INFO.ordinal()) {
            return new e("INFO");
        }
        if (i == EnumC0068b.BIDDERS.ordinal()) {
            return new e("BIDDERS");
        }
        return new e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
        if (i == EnumC0068b.INFO.ordinal()) {
            return this.d;
        }
        if (i == EnumC0068b.BIDDERS.ordinal()) {
            return this.e;
        }
        return this.f;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.b;
        if (bVar != null && !bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> listA = this.f1050a.e().a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : listA) {
            com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.b;
            if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                arrayList.add(new a(bVar2, bVar2.b() != null ? bVar2.b().a() : "", this.b == null));
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.b;
        if (bVar != null && bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> listB = this.f1050a.e().b();
        ArrayList arrayList = new ArrayList(listB.size());
        for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : listB) {
            com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.b;
            if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                arrayList.add(new a(bVar2, null, this.b == null));
                for (com.applovin.impl.mediation.debugger.b.a.e eVar : bVar2.d()) {
                    arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a(eVar.a()).b(eVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    private com.applovin.impl.mediation.debugger.ui.d.c f() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("ID").b(this.f1050a.a()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c g() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Format").b(this.f1050a.c()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c h() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.b.a().b()).a();
    }

    class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {
        private final com.applovin.impl.mediation.debugger.b.a.b o;

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int e() {
            return -12303292;
        }

        a(com.applovin.impl.mediation.debugger.b.a.b bVar, String str, boolean z) {
            super(bVar.a().c(), b.this.c);
            this.o = bVar;
            this.d = StringUtils.createSpannedString(bVar.a().b(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.c = z;
        }

        public com.applovin.impl.mediation.debugger.b.a.b d() {
            return this.o;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean c() {
            return this.c;
        }
    }
}
