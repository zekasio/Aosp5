package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f1098a;
    private List<com.applovin.impl.mediation.debugger.b.c.b> b;
    private d c;
    private List<com.applovin.impl.mediation.debugger.ui.d.c> d;
    private ListView e;

    public b() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.c.b> list, final p pVar) {
        this.f1098a = pVar;
        this.b = list;
        this.d = a(list);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int e() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected com.applovin.impl.mediation.debugger.ui.d.c n() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
                return new e("TEST MODE NETWORKS");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
                return b.this.d;
            }
        };
        this.c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = (com.applovin.impl.mediation.debugger.b.c.b) list.get(aVar.b());
                String strH = bVar.h();
                String strC = pVar.av().c();
                if (StringUtils.isValidString(strH) && StringUtils.isValidString(strC) && strH.equals(strC)) {
                    pVar.av().a(false);
                    pVar.av().a((String) null);
                    b.this.getSdk().ab().b((String) null);
                } else {
                    pVar.av().a(true);
                    pVar.av().a(strH);
                    b.this.getSdk().ab().b(bVar.i());
                }
                b.this.c.notifyDataSetChanged();
            }
        });
        this.c.notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b.3
                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    return StringUtils.createSpannedString(bVar.i(), c() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int a() {
                    if (b.this.f1098a.av().c() == null || !b.this.f1098a.av().c().equals(bVar.h())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int b() {
                    if (b.this.f1098a.av().c() == null || !b.this.f1098a.av().c().equals(bVar.h())) {
                        return super.b();
                    }
                    return -16776961;
                }
            });
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        return this.f1098a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }
}
