package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.a.d;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f1087a;
    private List<d> b;
    private List<d> c;
    private com.applovin.impl.mediation.debugger.ui.d.d d;
    private List<c> e;
    private List<c> f;
    private ListView g;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a, reason: collision with other inner class name */
    enum EnumC0072a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(List<d> list, List<d> list2, final p pVar) {
        this.f1087a = pVar;
        this.b = list;
        this.c = list2;
        this.e = a(list);
        this.f = a(list2);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected c n() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int e() {
                return EnumC0072a.COUNT.ordinal();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i) {
                return i == EnumC0072a.BIDDERS.ordinal() ? a.this.e.size() : a.this.f.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected c b(int i) {
                if (i == EnumC0072a.BIDDERS.ordinal()) {
                    return new e("BIDDERS");
                }
                return new e("WATERFALL");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<c> c(int i) {
                return i == EnumC0072a.BIDDERS.ordinal() ? a.this.e : a.this.f;
            }
        };
        this.d = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                com.applovin.impl.mediation.debugger.b.a.d dVarA = a.this.a(aVar);
                if (StringUtils.isValidString(dVarA.a()) && StringUtils.isValidString(pVar.av().c()) && dVarA.a().equals(pVar.av().c())) {
                    pVar.av().a(false);
                    pVar.av().a((String) null);
                    pVar.ab().a((String) null);
                } else {
                    pVar.av().a(true);
                    pVar.av().a(dVarA.a());
                    pVar.ab().a(dVarA.b());
                }
                a.this.d.notifyDataSetChanged();
            }
        });
        this.d.notifyDataSetChanged();
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.a.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.a.d dVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(dVar.c(), this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    return StringUtils.createSpannedString(dVar.b(), c() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (a.this.f1087a.av().c() == null || !a.this.f1087a.av().c().equals(dVar.a())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (a.this.f1087a.av().c() == null || !a.this.f1087a.av().c().equals(dVar.a())) {
                        return super.b();
                    }
                    return -16776961;
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.mediation.debugger.b.a.d a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        if (aVar.a() == EnumC0072a.BIDDERS.ordinal()) {
            return this.b.get(aVar.b());
        }
        return this.c.get(aVar.b());
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        return this.f1087a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.e = a(this.b);
        this.f = a(this.c);
        this.d.m();
    }
}
